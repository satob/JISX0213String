﻿<#
Copyright 2022 SATO Yusuke

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 #>

# JIS X 0212全文字のテストケースを作る
$ErrorActionPreference="Stop"

# JIS X 0213文字一覧（非漢字含む）を取得
# Invoke-WebRequest -Uri "https://github.com/code4fukui/mojikiban/raw/main/data/jisx0213-2004-8bit-std.txt" -OutFile .\jisx0213-2004-8bit-std.txt

# リニアにアクセスすると遅いのでUnicodeの文字表現をHashSetに入れる
$JISX0213Map = New-Object System.Collections.Generic.HashSet[string]
# コメントは除去
Get-Content .\jisx0213-2004-8bit-std.txt |
    Where-Object { $_ -notlike "#*" } |
    ForEach-Object {
        $Line = $_;
        $Unicode = $Line.split("`t")[1];
        if ($Unicode -eq "") {
            # Unicode列にコードポイントが定義されていない文字は除去
            # 「Windows: U+XXXX」のようにWindowsでのコードポイントが記載されているものであっても
            # そのU+XXXXがjisx0213-2004-8bit-std.txtのUnicode列になかったら
            # JIS X 0213では定義されていないものとしてHashSetに入れないこととする
            return
        }
        if ($Line -match "Windows: U\+(?<Code>[0-9A-F]+)") {
            # Unicode列にコードポイントが定義されているが
            # 「Windows: U+XXXX」のようにWindowsでのコードポイントが記載されている場合は
            # 「Windows: U+XXXX」の方のコードポイントを使い、Unicode列のコードポイントは使わない
            # （JIS X 0208の文字含め、Windowsで入力されることを想定するため）
            $CodeUnits = @($Matches.Code)
        } else {
            # 合字の場合はU+XXXX+XXXX形式なので、System.Activator.CreateInstance()で使えるように
            # 要素2個の配列にバラす
            $CodeUnits = $_.split("`t")[1].substring(2).split("+");
        }

        if ($CodeUnits.length -eq 1) {
            if ($CodeUnits[0].length -eq 4) {
                # 1コードポイント、基本面の文字の場合
                [System.Activator]::CreateInstance([System.String], [char[]]@([int]("0x" + $CodeUnits[0])))
            } else {
                # 1コードポイント、基本面でない場合
                [char]::ConvertFromUtf32([int]("0x" + $CodeUnits[0]))
            }
        } else {
            # 2コードポイント、合字の場合
            [System.Activator]::CreateInstance([System.String], [char[]]@([int]("0x" + $CodeUnits[0]), [int]("0x" + $CodeUnits[1])))
        }
  } | ForEach-Object {
      $JISX0213Map.add($_) > $null
  }

# NEC選定IBM拡張文字の一覧
# https://www.maff-ebic.go.jp/KITEI/AttentionA.pdf をもとに作成
$strNECIBM = "纊褜鍈銈蓜俉炻昱棈鋹曻彅丨仡仼伀伃伹佖侒侊侚侔俍偀倢俿倞偆偰偂傔僴僘兊兤冝冾凬刕劜劦勀勛匀匇匤卲厓厲叝﨎咜咊咩哿喆坙坥垬埈埇﨏塚增墲夋奓奛奝奣妤妺孖寀甯寘寬尞岦岺峵崧嵓﨑嵂嵭嶸嶹巐弡弴彧德忞恝悅悊惞惕愠惲愑愷愰憘戓抦揵摠撝擎敎昀昕昻昉昮昞昤晥晗晙晴晳暙暠暲暿曺朎朗杦枻桒柀栁桄棏﨓楨﨔榘槢樰橫橆橳橾櫢櫤毖氿汜沆汯泚洄涇浯涖涬淏淸淲淼渹湜渧渼溿澈澵濵瀅瀇瀨炅炫焏焄煜煆煇凞燁燾犱犾猤猪獷玽珉珖珣珒琇珵琦琪琩琮瑢璉璟甁畯皂皜皞皛皦益睆劯砡硎硤硺礰礼神祥禔福禛竑竧靖竫箞精絈絜綷綠緖繒罇羡羽茁荢荿菇菶葈蒴蕓蕙蕫﨟薰蘒﨡蠇裵訒訷詹誧誾諟諸諶譓譿賰賴贒赶﨣軏﨤逸遧郞都鄕鄧釚釗釞釭釮釤釥鈆鈐鈊鈺鉀鈼鉎鉙鉑鈹鉧銧鉷鉸鋧鋗鋙鋐﨧鋕鋠鋓錥錡鋻﨨錞鋿錝錂鍰鍗鎤鏆鏞鏸鐱鑅鑈閒隆﨩隝隯霳霻靃靍靏靑靕顗顥飯飼餧館馞驎髙髜魵魲鮏鮱鮻鰀鵰鵫鶴鸙黑ⅰⅱⅲⅳⅴⅵⅶⅷⅸⅹ￢￤＇＂"
# NEC選定IBM特殊文字のうちJIS X 0213に含まれないもの
$NECIBMNonJISX0213Map = New-Object System.Collections.Generic.HashSet[string];
($strNECIBM.ToCharArray() | ForEach-Object { if (!$JISX0213Map.Contains($_)) { $_ } } | ForEach-Object { $NECIBMNonJISX0213Map.Add($_) > $null } )
# NEC選定IBM特殊文字のうちJIS X 0213に含まれるもの
$NECIBMJISX0213Map = New-Object System.Collections.Generic.HashSet[string];
$strNECIBM.ToCharArray() | ForEach-Object { $NECIBMJISX0213Map.Add($_) > $null }
$NECIBMJISX0213Map.ExceptWith($NECIBMNonJISX0213Map)

# http://www2d.biglobe.ne.jp/~msyk/text/jisx0212utf8.html
$strJISX0212 = @"
丂丄丅丌丒丟丣两丨丫丮丯丰丵乀乁乄乇乑乚乜乣乨乩乴乵乹乿亍亖
亗亝亯亹仃仐仚仛仠仡仢仨仯仱仳仵份仾仿伀伂伃伈伋伌伒伕伖众伙
伮伱你伳伵伷伹伻伾佀佂佈佉佋佌佒佔佖佘佟佣佪佬佮佱佷佸佹佺佽
佾侁侂侄侅侉侊侌侎侐侒侓侔侗侙侚侞侟侲侷侹侻侼侽侾俀俁俅俆俈
俉俋俌俍俏俒俜俠俢俰俲俼俽俿倀倁倄倇倊倌倎倐倓倗倘倛倜倝倞倢
倧倮倰倲倳倵偀偁偂偅偆偊偌偎偑偒偓偗偙偟偠偢偣偦偧偪偭偰偱倻
傁傃傄傆傊傎傏傐傒傓傔傖傛傜傞傟傠傡傢傪傯傰傹傺傽僀僃僄僇僌
僎僐僓僔僘僜僝僟僢僤僦僨僩僯僱僶僺僾儃儆儇儈儋儌儍儎僲儐儗儙
儛儜儝儞儣儧儨儬儭儯儱儳儴儵儸儹兂兊兏兓兕兗兘兟兤兦兾冃冄冋
冎冘冝冡冣冭冸冺冼冾冿凂凈减凑凒凓凕凘凞凢凥凮凲凳凴凷刁刂刅
划刓刕刖刘刢刨刱刲刵刼剅剉剕剗剘剚剜剟剠剡剦剮剷剸剹劀劂劅劊
劌劓劕劖劗劘劚劜劤劥劦劧劯劰劶劷劸劺劻劽勀勄勆勈勌勏勑勔勖勛
勜勡勥勨勩勪勬勰勱勴勶勷匀匃匊匋匌匑匓匘匛匜匞匟匥匧匨匩匫匬
匭匰匲匵匼匽匾卂卌卋卙卛卡卣卥卬卭卲卹卾厃厇厈厎厓厔厙厝厡厤
厪厫厯厲厴厵厷厸厺厽叀叅叏叒叓叕叚叝叞叠另叧叵吂吓吚吡吧吨吪
启吱吴吵呃呄呇呍呏呞呢呤呦呧呩呫呭呮呴呿咁咃咅咈咉咍咑咕咖咜
咟咡咦咧咩咪咭咮咱咷咹咺咻咿哆哊响哎哠哪哬哯哶哼哾哿唀唁唅唈
唉唌唍唎唕唪唫唲唵唶唻唼唽啁啇啉啊啍啐啑啘啚啛啞啠啡啤啦啿喁
喂喆喈喎喏喑喒喓喔喗喣喤喭喲喿嗁嗃嗆嗉嗋嗌嗎嗑嗒嗓嗗嗘嗛嗞嗢
嗩嗶嗿嘅嘈嘊嘍嘎嘏嘐嘑嘒嘙嘬嘰嘳嘵嘷嘹嘻嘼嘽嘿噀噁噃噄噆噉噋
噍噏噔噞噠噡噢噣噦噩噭噯噱噲噵嚄嚅嚈嚋嚌嚕嚙嚚嚝嚞嚟嚦嚧嚨嚩
嚫嚬嚭嚱嚳嚷嚾囅囉囊囋囏囐囌囍囙囜囝囟囡囤囥囦囧囨囱囫园囶囷
圁圂圇圊圌圑圕圚圛圝圠圢圣圤圥圩圪圬圮圯圳圴圽圾圿坅坆坌坍坒
坢坥坧坨坫坭坮坯坰坱坳坴坵坷坹坺坻坼坾垁垃垌垔垗垙垚垜垝垞垟
垡垕垧垨垩垬垸垽埇埈埌埏埕埝埞埤埦埧埩埭埰埵埶埸埽埾埿堃堄堈
堉埡堌堍堛堞堟堠堦堧堭堲堹堿塉塌塍塏塐塕塟塡塤塧塨塸塼塿墀墁
墇墈墉墊墌墍墏墐墔墖墝墠墡墢墦墩墱墲壄墼壂壈壍壎壐壒壔壖壚壝
壡壢壩壳夅夆夋夌夒夓夔虁夝夡夣夤夨夯夰夳夵夶夿奃奆奒奓奙奛奝
奞奟奡奣奫奭奯奲奵奶她奻奼妋妌妎妒妕妗妟妤妧妭妮妯妰妳妷妺妼
姁姃姄姈姊姍姒姝姞姟姣姤姧姮姯姱姲姴姷娀娄娌娍娎娒娓娞娣娤娧
娨娪娭娰婄婅婇婈婌婐婕婞婣婥婧婭婷婺婻婾媋媐媓媖媙媜媞媟媠媢
媧媬媱媲媳媵媸媺媻媿嫄嫆嫈嫏嫚嫜嫠嫥嫪嫮嫵嫶嫽嬀嬁嬈嬗嬴嬙嬛
嬝嬡嬥嬭嬸孁孋孌孒孖孞孨孮孯孼孽孾孿宁宄宆宊宎宐宑宓宔宖宨宩
宬宭宯宱宲宷宺宼寀寁寍寏寖寗寘寙寚寠寯寱寴寽尌尗尞尟尣尦尩尫
尬尮尰尲尵尶屙屚屜屢屣屧屨屩屭屰屴屵屺屻屼屽岇岈岊岏岒岝岟岠
岢岣岦岪岲岴岵岺峉峋峒峝峗峮峱峲峴崁崆崍崒崫崣崤崦崧崱崴崹崽
崿嵂嵃嵆嵈嵕嵑嵙嵊嵟嵠嵡嵢嵤嵪嵭嵰嵹嵺嵾嵿嶁嶃嶈嶊嶒嶓嶔嶕嶙
嶛嶟嶠嶧嶫嶰嶴嶸嶹巃巇巋巐巎巘巙巠巤巩巸巹帀帇帍帒帔帕帘帟帠
帮帨帲帵帾幋幐幉幑幖幘幛幜幞幨幪幫幬幭幮幰庀庋庎庢庤庥庨庪庬
庱庳庽庾庿廆廌廋廎廑廒廔廕廜廞廥廫异弆弇弈弎弙弜弝弡弢弣弤弨
弫弬弮弰弴弶弻弽弿彀彄彅彇彍彐彔彘彛彠彣彤彧彯彲彴彵彸彺彽彾
徉徍徏徖徜徝徢徧徫徤徬徯徰徱徸忄忇忈忉忋忐忑忒忓忔忞忡忢忨忩
忪忬忭忮忯忲忳忶忺忼怇怊怍怓怔怗怘怚怟怤怭怳怵恀恇恈恉恌恑恔
恖恗恝恡恧恱恾恿悂悆悈悊悎悑悓悕悘悝悞悢悤悥您悰悱悷悻悾惂惄
惈惉惊惋惎惏惔惕惙惛惝惞惢惥惲惵惸惼惽愂愇愊愌愐愑愒愓愔愖愗
愙愜愞愢愪愫愰愱愵愶愷愹慁慅慆慉慞慠慬慲慸慻慼慿憀憁憃憄憋憍
憒憓憗憘憜憝憟憠憥憨憪憭憸憹憼懀懁懂懎懏懕懜懝懞懟懡懢懧懩懥
懬懭懯戁戃戄戇戓戕戜戠戢戣戧戩戫戹戽扂扃扄扆扌扐扑扒扔扖扚扜
扤扭扯扳扺扽抍抎抏抐抦抨抳抶抷抺抾抿拄拎拕拖拚拪拲拴拼拽挃挄
挊挋挍挐挓挖挘挩挪挭挵挶挹挼捁捂捃捄捆捊捋捎捒捓捔捘捛捥捦捬
捭捱捴捵捸捼捽捿掂掄掇掊掐掔掕掙掚掞掤掦掭掮掯掽揁揅揈揎揑揓
揔揕揜揠揥揪揬揲揳揵揸揹搉搊搐搒搔搘搞搠搢搤搥搩搪搯搰搵搽搿
摋摏摑摒摓摔摚摛摜摝摟摠摡摣摭摳摴摻摽撅撇撏撐撑撘撙撛撝撟撡
撣撦撨撬撳撽撾撿擄擉擊擋擌擎擐擑擕擗擤擥擩擪擭擰擵擷擻擿攁攄
攈攉攊攏攓攔攖攙攛攞攟攢攦攩攮攱攺攼攽敃敇敉敐敒敔敟敠敧敫敺
敽斁斅斊斒斕斘斝斠斣斦斮斲斳斴斿旂旈旉旎旐旔旖旘旟旰旲旴旵旹
旾旿昀昄昈昉昍昑昒昕昖昝昞昡昢昣昤昦昩昪昫昬昮昰昱昳昹昷晀晅
晆晊晌晑晎晗晘晙晛晜晠晡曻晪晫晬晾晳晵晿晷晸晹晻暀晼暋暌暍暐
暒暙暚暛暜暟暠暤暭暱暲暵暻暿曀曂曃曈曌曎曏曔曛曟曨曫曬曮曺朅
朇朎朓朙朜朠朢朳朾杅杇杈杌杔杕杝杦杬杮杴杶杻极构枎枏枑枓枖枘
枙枛枰枱枲枵枻枼枽柹柀柂柃柅柈柉柒柗柙柜柡柦柰柲柶柷桒栔栙栝
栟栨栧栬栭栯栰栱栳栻栿桄桅桊桌桕桗桘桛桫桮桯桰桱桲桵桹桺桻桼
梂梄梆梈梖梘梚梜梡梣梥梩梪梮梲梻棅棈棌棏棐棑棓棖棙棜棝棥棨棪
棫棬棭棰棱棵棶棻棼棽椆椉椊椐椑椓椖椗椱椳椵椸椻楂楅楉楎楗楛楣
楤楥楦楨楩楬楰楱楲楺楻楿榀榍榒榖榘榡榥榦榨榫榭榯榷榸榺榼槅槈
槑槖槗槢槥槮槯槱槳槵槾樀樁樃樏樑樕樚樝樠樤樨樰樲樴樷樻樾樿橅
橆橉橊橎橐橑橒橕橖橛橤橧橪橱橳橾檁檃檆檇檉檋檑檛檝檞檟檥檫檯
檰檱檴檽檾檿櫆櫉櫈櫌櫐櫔櫕櫖櫜櫝櫤櫧櫬櫰櫱櫲櫼櫽欂欃欆欇欉欏
欐欑欗欛欞欤欨欫欬欯欵欶欻欿歆歊歍歒歖歘歝歠歧歫歮歰歵歽歾殂
殅殗殛殟殠殢殣殨殩殬殭殮殰殸殹殽殾毃毄毉毌毖毚毡毣毦毧毮毱毷
毹毿氂氄氅氉氍氎氐氒氙氟氦氧氨氬氮氳氵氶氺氻氿汊汋汍汏汒汔汙
汛汜汫汭汯汴汶汸汹汻沅沆沇沉沔沕沗沘沜沟沰沲沴泂泆泍泏泐泑泒
泔泖泚泜泠泧泩泫泬泮泲泴洄洇洊洎洏洑洓洚洦洧洨汧洮洯洱洹洼洿
浗浞浟浡浥浧浯浰浼涂涇涑涒涔涖涗涘涪涬涴涷涹涽涿淄淈淊淎淏淖
淛淝淟淠淢淥淩淯淰淴淶淼渀渄渞渢渧渲渶渹渻渼湄湅湈湉湋湏湑湒
湓湔湗湜湝湞湢湣湨湳湻湽溍溓溙溠溧溭溮溱溳溻溿滀滁滃滇滈滊滍
滎滏滫滭滮滹滻滽漄漈漊漌漍漖漘漚漛漦漩漪漯漰漳漶漻漼漭潏潑潒
潓潗潙潚潝潞潡潢潨潬潽潾澃澇澈澋澌澍澐澒澓澔澖澚澟澠澥澦澧澨
澮澯澰澵澶澼濅濇濈濊濚濞濨濩濰濵濹濼濽瀀瀅瀆瀇瀍瀗瀠瀣瀯瀴瀷
瀹瀼灃灄灈灉灊灋灔灕灝灞灎灤灥灬灮灵灶灾炁炅炆炔炕炖炗炘炛炤
炫炰炱炴炷烊烑烓烔烕烖烘烜烤烺焃焄焅焆焇焋焌焏焞焠焫焭焯焰焱
焸煁煅煆煇煊煋煐煒煗煚煜煞煠煨煹熀熅熇熌熒熚熛熠熢熯熰熲熳熺
熿燀燁燄燋燌燓燖燙燚燜燸燾爀爇爈爉爓爗爚爝爟爤爫爯爴爸爹牁牂
牃牅牎牏牐牓牕牖牚牜牞牠牣牨牫牮牯牱牷牸牻牼牿犄犉犍犎犓犛犨
犭犮犱犴犾狁狇狉狌狕狖狘狟狥狳狴狺狻狾猂猄猅猇猋猍猒猓猘猙猞
猢猤猧猨猬猱猲猵猺猻猽獃獍獐獒獖獘獝獞獟獠獦獧獩獫獬獮獯獱獷
獹獼玀玁玃玅玆玎玐玓玕玗玘玜玞玟玠玢玥玦玪玫玭玵玷玹玼玽玿珅
珆珉珋珌珏珒珓珖珙珝珡珣珦珧珩珴珵珷珹珺珻珽珿琀琁琄琇琊琑琚
琛琤琦琨琩琪琫琬琭琮琯琰琱琹瑀瑃瑄瑆瑇瑋瑍瑑瑒瑗瑝瑢瑦瑧瑨瑫
瑭瑮瑱瑲璀璁璅璆璇璉璏璐璑璒璘璙璚璜璟璠璡璣璦璨璩璪璫璮璯璱
璲璵璹璻璿瓈瓉瓌瓐瓓瓘瓚瓛瓞瓟瓤瓨瓪瓫瓯瓴瓺瓻瓼瓿甆甒甖甗甠
甡甤甧甩甪甯甶甹甽甾甿畀畃畇畈畎畐畒畗畞畟畡畯畱畹畺畻畼畽畾
疁疅疐疒疓疕疙疜疢疤疴疺疿痀痁痄痆痌痎痏痗痜痟痠痡痤痧痬痮痯
痱痹瘀瘂瘃瘄瘇瘈瘊瘌瘏瘒瘓瘕瘖瘙瘛瘜瘝瘞瘣瘥瘦瘩瘭瘲瘳瘵瘸瘹
瘺瘼癊癀癁癃癄癅癉癋癕癙癟癤癥癭癮癯癱癴皁皅皌皍皕皛皜皝皟皠
皢皣皤皥皦皧皨皪皭皽盁盅盉盋盌盎盔盙盠盦盨盬盰盱盶盹盼眀眆眊
眎眒眔眕眗眙眚眜眢眨眭眮眯眴眵眶眹眽眾睂睅睆睊睍睎睏睒睖睗睜
睞睟睠睢睤睧睪睬睰睲睳睴睺睽瞀瞄瞌瞍瞔瞕瞖瞚瞟瞢瞧瞪瞮瞯瞱瞵
瞾矃矉矑矒矕矙矞矟矠矤矦矪矬矰矱矴矸矻砅砆砉砍砎砑砝砡砢砣砭
砮砰砵砷硃硄硇硈硌硎硒硜硞硠硡硣硤硨硪确硺硾碊碏碔碘碡碝碞碟
碤碨碬碭碰碱碲碳碻碽碿磇磈磉磌磎磒磓磕磖磤磛磟磠磡磦磪磲磳礀
磶磷磺磻磿礆礌礐礚礜礞礟礠礥礧礩礭礱礴礵礻礽礿祄祅祆祊祋祏祑
祔祘祛祜祧祩祫祲祹祻祼祾禋禌禑禓禔禕禖禘禛禜禡禨禩禫禯禱禴禸
离秂秄秇秈秊秏秔秖秚秝秞秠秢秥秪秫秭秱秸秼稂稃稇稉稊稌稑稕稛
稞稡稧稫稭稯稰稴稵稸稹稺穄穅穇穈穌穕穖穙穜穝穟穠穥穧穪穭穵穸
穾窀窂窅窆窊窋窐窑窔窞窠窣窬窳窵窹窻窼竆竉竌竎竑竛竨竩竫竬竱
竴竻竽竾笇笔笟笣笧笩笪笫笭笮笯笰笱笴笽笿筀筁筇筎筕筠筤筦筩筪
筭筯筲筳筷箄箉箎箐箑箖箛箞箠箥箬箯箰箲箵箶箺箻箼箽篂篅篈篊篔
篖篗篙篚篛篨篪篲篴篵篸篹篺篼篾簁簂簃簄簆簉簋簌簎簏簙簛簠簥簦
簨簬簱簳簴簶簹簺籆籊籕籑籒籓籙籚籛籜籝籞籡籣籧籩籭籮籰籲籹籼
籽粆粇粏粔粞粠粦粰粶粷粺粻粼粿糄糇糈糉糍糏糓糔糕糗糙糚糝糦糩
糫糵紃紇紈紉紏紑紒紓紖紝紞紣紦紪紭紱紼紽紾絀絁絇絈絍絑絓絗絙
絚絜絝絥絧絪絰絸絺絻絿綁綂綃綅綆綈綋綌綍綑綖綗綝綞綦綧綪綳綶
綷綹緂緃緄緅緆緌緍緎緗緙縀緢緥緦緪緫緭緱緵緶緹緺縈縐縑縕縗縜
縝縠縧縨縬縭縯縳縶縿繄繅繇繎繐繒繘繟繡繢繥繫繮繯繳繸繾纁纆纇
纊纍纑纕纘纚纝纞缼缻缽缾缿罃罄罇罏罒罓罛罜罝罡罣罤罥罦罭罱罽
罾罿羀羋羍羏羐羑羖羗羜羡羢羦羪羭羴羼羿翀翃翈翎翏翛翟翣翥翨翬
翮翯翲翺翽翾翿耇耈耊耍耎耏耑耓耔耖耝耞耟耠耤耦耬耮耰耴耵耷耹
耺耼耾聀聄聠聤聦聭聱聵肁肈肎肜肞肦肧肫肸肹胈胍胏胒胔胕胗胘胠
胭胮胰胲胳胶胹胺胾脃脋脖脗脘脜脞脠脤脧脬脰脵脺脼腅腇腊腌腒腗
腠腡腧腨腩腭腯腷膁膐膄膅膆膋膎膖膘膛膞膢膮膲膴膻臋臃臅臊臎臏
臕臗臛臝臞臡臤臫臬臰臱臲臵臶臸臹臽臿舀舃舏舓舔舙舚舝舡舢舨舲
舴舺艃艄艅艆艋艎艏艑艖艜艠艣艧艭艴艻艽艿芀芁芃芄芇芉芊芎芑芔
芖芘芚芛芠芡芣芤芧芨芩芪芮芰芲芴芷芺芼芾芿苆苐苕苚苠苢苤苨苪
苭苯苶苷苽苾茀茁茇茈茊茋荔茛茝茞茟茡茢茬茭茮茰茳茷茺茼茽荂荃
荄荇荍荎荑荕荖荗荰荸荽荿莀莂莄莆莍莒莔莕莘莙莛莜莝莦莧莩莬莾
莿菀菇菉菏菐菑菔菝荓菨菪菶菸菹菼萁萆萊萏萑萕萙莭萯萹葅葇葈葊
葍葏葑葒葖葘葙葚葜葠葤葥葧葪葰葳葴葶葸葼葽蒁蒅蒒蒓蒕蒞蒦蒨蒩
蒪蒯蒱蒴蒺蒽蒾蓀蓂蓇蓈蓌蓏蓓蓜蓧蓪蓯蓰蓱蓲蓷蔲蓺蓻蓽蔂蔃蔇蔌
蔎蔐蔜蔞蔢蔣蔤蔥蔧蔪蔫蔯蔳蔴蔶蔿蕆蕏蕐蕑蕒蕓蕖蕙蕜蕝蕞蕟蕠蕡
蕢蕤蕫蕯蕹蕺蕻蕽蕿薁薅薆薉薋薌薏薓薘薝薟薠薢薥薧薴薶薷薸薼薽
薾薿藂藇藊藋藎薭藘藚藟藠藦藨藭藳藶藼藿蘀蘄蘅蘍蘎蘐蘑蘒蘘蘙蘛
蘞蘡蘧蘩蘶蘸蘺蘼蘽虀虂虆虒虓虖虗虘虙虝虠虡虢虣虤虩虬虯虵虶虷
虺蚍蚑蚖蚘蚚蚜蚡蚦蚧蚨蚭蚱蚳蚴蚵蚷蚸蚹蚿蛀蛁蛃蛅蛑蛒蛕蛗蛚蛜
蛠蛣蛥蛧蚈蛺蛼蛽蜄蜅蜇蜋蜎蜏蜐蜓蜔蜙蜞蜟蜡蜣蜨蜮蜯蜱蜲蜹蜺蜼
蜽蜾蝀蝃蝅蝍蝘蝝蝡蝤蝥蝯蝱蝲蝻螃螄螅螆螇螈螉螋螌螐螓螕螗螘螙
螞螠螣螧螬螭螮螱螵螾螿蟁蟈蟉蟊蟎蟕蟖蟙蟚蟜蟟蟢蟣蟤蟪蟫蟭蟱蟳
蟸蟺蟿蠁蠃蠆蠉蠊蠋蠐蠙蠒蠓蠔蠘蠚蠛蠜蠞蠟蠨蠭蠮蠰蠲蠵蠺蠼衁衃
衅衈衉衊衋衎衑衕衖衘衚衜衟衠衤衩衱衹衻袀袘袚袛袜袟袠袨袪袺袽
袾裀裊裋裌裍裎裑裒裓裛裞裧裯裰裱裵裷褁褆褍褎褏褕褖褘褙褚褜褠
褦褧褨褰褱褲褵褹褺褾襀襂襅襆襉襏襒襗襚襛襜襡襢襣襫襮襰襳襵襺
襻襼襽覉覍覐覔覕覛覜覟覠覥覰覴覵覶覷覼觔觕觖觗觘觥觩觫觭觱觳
觶觹觽觿訄訅訇訏訑訒訔訕訞訠訢訤訦訫訬訯訵訷訽訾詀詃詅詇詉詍
詎詓詖詗詘詜詝詡詥詧詵詶詷詹詺詻詾詿誀誃誆誋誏誐誒誖誗誙誟誧
誩誮誯誳誶誷誻誾諃諆諈諉諊諑諓諔諕諗諝諟諬諰諴諵諶諼諿謅謆謋
謑謜謞謟謊謭謰謷謼譂譃譄譅譆譈譒譓譔譙譍譞譣譭譶譸譹譼譾讁讄
讅讋讍讏讔讕讜讞讟谸谹谽谾豅豇豉豋豏豑豓豔豗豘豛豝豙豣豤豦豨
豩豭豳豵豶豻豾貆貇貋貐貒貓貙貛貜貤貹貺賅賆賉賋賏賖賕賙賝賡賨
賬賯賰賲賵賷賸賾賿贁贃贉贒贗贛赥赩赬赮赿趂趄趈趍趐趑趕趞趟趠
趦趫趬趯趲趵趷趹趻跀跅跆跇跈跊跎跑跔跕跗跙跤跥跧跬跰趼跱跲跴
跽踁踄踅踆踋踑踔踖踠踡踢踣踦踧踱踳踶踷踸踹踽蹀蹁蹋蹍蹎蹏蹔蹛
蹜蹝蹞蹡蹢蹩蹬蹭蹯蹰蹱蹹蹺蹻躂躃躉躐躒躕躚躛躝躞躢躧躩躭躮躳
躵躺躻軀軁軃軄軇軏軑軔軜軨軮軰軱軷軹軺軭輀輂輇輈輏輐輖輗輘輞
輠輡輣輥輧輨輬輭輮輴輵輶輷輺轀轁轃轇轏轑轒轓轔轕轘轝轞轥辝辠
辡辤辥辦辵辶辸达迀迁迆迊迋迍运迒迓迕迠迣迤迨迮迱迵迶迻迾适逄
逈逌逘逛逨逩逯逪逬逭逳逴逷逿遃遄遌遛遝遢遦遧遬遰遴遹邅邈邋邌
邎邐邕邗邘邙邛邠邡邢邥邰邲邳邴邶邽郌邾郃郄郅郇郈郕郗郘郙郜郝
郟郥郒郶郫郯郰郴郾郿鄀鄄鄅鄆鄈鄍鄐鄔鄖鄗鄘鄚鄜鄞鄠鄥鄢鄣鄧鄩
鄮鄯鄱鄴鄶鄷鄹鄺鄼鄽酃酇酈酏酓酗酙酚酛酡酤酧酭酴酹酺酻醁醃醅
醆醊醎醑醓醔醕醘醞醡醦醨醬醭醮醰醱醲醳醶醻醼醽醿釂釃釅釓釔釗
釙釚釞釤釥釩釪釬釭釮釯釰釱釷釹釻釽鈀鈁鈄鈅鈆鈇鈉鈊鈌鈐鈒鈓鈖
鈘鈜鈝鈣鈤鈥鈦鈨鈮鈯鈰鈳鈵鈶鈸鈹鈺鈼鈾鉀鉂鉃鉆鉇鉊鉍鉎鉏鉑鉘
鉙鉜鉝鉠鉡鉥鉧鉨鉩鉮鉯鉰鉵鉶鉷鉸鉹鉻鉼鉽鉿銈銉銊銍銎銒銗銙銟
銠銤銥銧銨銫銯銲銶銸銺銻銼銽銿鋀鋁鋂鋃鋅鋆鋇鋈鋋鋌鋍鋎鋐鋓鋕
鋗鋘鋙鋜鋝鋟鋠鋡鋣鋥鋧鋨鋬鋮鋰鋹鋻鋿錀錂錈錍錑錔錕錜錝錞錟錡
錤錥錧錩錪錳錴錶錷鍇鍈鍉鍐鍑鍒鍕鍗鍘鍚鍞鍤鍥鍧鍩鍪鍭鍯鍰鍱鍳
鍴鍶鍺鍽鍿鎀鎁鎂鎈鎊鎋鎍鎏鎒鎕鎘鎛鎞鎡鎣鎤鎦鎨鎫鎴鎵鎶鎺鎩鏁
鏄鏅鏆鏇鏉鏊鏋鏌鏍鏓鏙鏜鏞鏟鏢鏦鏧鏹鏷鏸鏺鏻鏽鐁鐂鐄鐈鐉鐍鐎
鐏鐕鐖鐗鐟鐮鐯鐱鐲鐳鐴鐻鐿鐽鑃鑅鑈鑊鑌鑕鑙鑜鑟鑡鑣鑨鑫鑭鑮鑯
鑱鑲钄钃镸镹镾閄閈閌閍閎閝閞閟閡閦閩閫閬閴閶閺閽閿闆闈闉闋闐
闑闒闓闙闚闝闞闟闠闤闦阝阞阢阤阥阦阬阱阳阷阸阹阺阼阽陁陒陔陖
陗陘陡陮陴陻陼陾陿隁隂隃隄隉隑隖隚隝隟隤隥隦隩隮隯隳隺雊雒嶲
雘雚雝雞雟雩雯雱雺霂霃霅霉霚霛霝霡霢霣霨霱霳靁靃靊靎靏靕靗靘
靚靛靣靧靪靮靳靶靷靸靻靽靿鞀鞉鞕鞖鞗鞙鞚鞞鞟鞢鞬鞮鞱鞲鞵鞶鞸
鞹鞺鞼鞾鞿韁韄韅韇韉韊韌韍韎韐韑韔韗韘韙韝韞韠韛韡韤韯韱韴韷
韸韺頇頊頙頍頎頔頖頜頞頠頣頦頫頮頯頰頲頳頵頥頾顄顇顊顑顒顓顖
顗顙顚顢顣顥顦顪顬颫颭颮颰颴颷颸颺颻颿飂飅飈飌飡飣飥飦飧飪飳
飶餂餇餈餑餕餖餗餚餛餜餟餢餦餧餫餱餲餳餴餵餹餺餻餼饀饁饆饇饈
饍饎饔饘饙饛饜饞饟饠馛馝馟馦馰馱馲馵馹馺馽馿駃駉駓駔駙駚駜駞
駧駪駫駬駰駴駵駹駽駾騂騃騄騋騌騐騑騖騞騠騢騣騤騧騭騮騳騵騶騸
驇驁驄驊驋驌驎驑驔驖驝骪骬骮骯骲骴骵骶骹骻骾骿髁髃髆髈髎髐髒
髕髖髗髛髜髠髤髥髧髩髬髲髳髵髹髺髽髿鬀鬁鬂鬃鬄鬅鬈鬉鬋鬌鬍鬎
鬐鬒鬖鬙鬛鬜鬠鬦鬫鬭鬳鬴鬵鬷鬹鬺鬽魈魋魌魕魖魗魛魞魡魣魥魦魨
魪魫魬魭魮魳魵魷魸魹魿鮀鮄鮅鮆鮇鮉鮊鮋鮍鮏鮐鮔鮚鮝鮞鮦鮧鮩鮬
鮰鮱鮲鮷鮸鮻鮼鮾鮿鯁鯇鯈鯎鯐鯗鯘鯝鯟鯥鯧鯪鯫鯯鯳鯷鯸鯹鯺鯽鯿
鰀鰂鰋鰏鰑鰖鰘鰙鰚鰜鰞鰢鰣鰦鰧鰨鰩鰪鰱鰵鰶鰷鰽鱁鱃鱄鱅鱉鱊鱎
鱏鱐鱓鱔鱖鱘鱛鱝鱞鱟鱣鱩鱪鱜鱫鱨鱮鱰鱲鱵鱷鱻鳦鳲鳷鳹鴋鴂鴑鴗
鴘鴜鴝鴞鴯鴰鴲鴳鴴鴺鴼鵅鴽鵂鵃鵇鵊鵓鵔鵟鵣鵢鵥鵩鵪鵫鵰鵶鵷鵻
鵼鵾鶃鶄鶆鶊鶍鶎鶒鶓鶕鶖鶗鶘鶡鶪鶬鶮鶱鶵鶹鶼鶿鷃鷇鷉鷊鷔鷕鷖
鷗鷚鷞鷟鷠鷥鷧鷩鷫鷮鷰鷳鷴鷾鸊鸂鸇鸎鸐鸑鸒鸕鸖鸙鸜鸝鹺鹻鹼麀
麂麃麄麅麇麎麏麖麘麛麞麤麨麬麮麯麰麳麴麵黆黈黋黕黟黤黧黬黭黮
黰黱黲黵黸黿鼂鼃鼉鼏鼐鼑鼒鼔鼖鼗鼙鼚鼛鼟鼢鼦鼪鼫鼯鼱鼲鼴鼷鼹
鼺鼼鼽鼿齁齃齄齅齆齇齓齕齖齗齘齚齝齞齨齩齭齮齯齰齱齳齵齺齽龏
龐龑龒龔龖龗龞龡龢龣龥
"@.Replace("`n","").Replace("`r","")
$JISX0212JISX0213MS932Map = New-Object System.Collections.Generic.HashSet[string];
$JISX0212JISX0213NonMS932Map = New-Object System.Collections.Generic.HashSet[string];
$JISX0212NonJISX0213MS932Map = New-Object System.Collections.Generic.HashSet[string];
$JISX0212NonJISX0213NonMS932Map = New-Object System.Collections.Generic.HashSet[string];
$strJISX0212.ToCharArray() | ForEach-Object {
    if ($JISX0213Map.Contains($_)) {
        if ($strNECIBM.Contains($_)) {
            $JISX0212JISX0213MS932Map.Add($_) > $null
        } else {
            $JISX0212JISX0213NonMS932Map.Add($_) > $null
        }
    } else {
        if ($strNECIBM.Contains($_)) {
            $JISX0212NonJISX0213MS932Map.Add($_) > $null
        } else {
            $JISX0212NonJISX0213NonMS932Map.Add($_) > $null
        }
    }
}


Write-Output @'
package com.example;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JISX0212CharactersInJISX0213Test {
'@

    @'

    @Test
    void testJISx0212ContaindInJISX0213AndMS932() {
'@
$JISX0212JISX0213MS932Map | ForEach-Object {
    if ($_.ToCharArray().length -eq 1) {
        ('        assertTrue(JISX0213String.isValid("\u{0:X}"));' -F [int]($_.ToCharArray()[0])) + "`t// $_"
        ('        assertEquals(JISX0213String.length("\u{0:X}"), 1);' -F [int]($_.ToCharArray()[0]))
    } elseif ($_.ToCharArray().length -eq 2) {
        ('        assertTrue(JISX0213String.isValid("\u{0:X}\u{1:X}"));' -F [int]($_.ToCharArray()[0]), [int]($_.ToCharArray()[1])) + "`t// $_"
        ('        assertEquals(JISX0213String.length("\u{0:X}\u{1:X}"), 1);' -F [int]($_.ToCharArray()[0]), [int]($_.ToCharArray()[1]))
    }
}
    @'
    }
'@

    @'

    @Test
    void testJISx0212ContaindInJISX0213AndNotContainedInMS932() {
'@
$JISX0212JISX0213NonMS932Map | ForEach-Object {
    if ($_.ToCharArray().length -eq 1) {
        ('        assertTrue(JISX0213String.isValid("\u{0:X}"));' -F [int]($_.ToCharArray()[0])) + "`t// $_"
        ('        assertEquals(JISX0213String.length("\u{0:X}"), 1);' -F [int]($_.ToCharArray()[0]))
    } elseif ($_.ToCharArray().length -eq 2) {
        ('        assertTrue(JISX0213String.isValid("\u{0:X}\u{1:X}"));' -F [int]($_.ToCharArray()[0]), [int]($_.ToCharArray()[1])) + "`t// $_"
        ('        assertEquals(JISX0213String.length("\u{0:X}\u{1:X}"), 1);' -F [int]($_.ToCharArray()[0]), [int]($_.ToCharArray()[1]))
    }
}
    @'
    }
'@

    @'

    @Test
    void testJISx0212NotContaindInJISX0213AndContainedInMS932() {
'@
$JISX0212NonJISX0213MS932Map | ForEach-Object {
    if ($_.ToCharArray().length -eq 1) {
        ('        assertTrue(JISX0213String.isValid("\u{0:X}"));' -F [int]($_.ToCharArray()[0])) + "`t// $_"
        ('        assertEquals(JISX0213String.length("\u{0:X}"), 1);' -F [int]($_.ToCharArray()[0]))
    } elseif ($_.ToCharArray().length -eq 2) {
        ('        assertTrue(JISX0213String.isValid("\u{0:X}\u{1:X}"));' -F [int]($_.ToCharArray()[0]), [int]($_.ToCharArray()[1])) + "`t// $_"
        ('        assertEquals(JISX0213String.length("\u{0:X}\u{1:X}"), 1);' -F [int]($_.ToCharArray()[0]), [int]($_.ToCharArray()[1]))
    }
}
    @'
    }
'@

    @'

    @Test
    void testJISx0212NotContaindInJISX0213AndMS932() {
'@
$JISX0212NonJISX0213NonMS932Map | ForEach-Object {
    if ($_.ToCharArray().length -eq 1) {
        ('        assertFalse(JISX0213String.isValid("\u{0:X}"));' -F [int]($_.ToCharArray()[0])) + "`t// $_"
        ('        assertEquals(JISX0213String.length("\u{0:X}"), 1);' -F [int]($_.ToCharArray()[0]))
    } elseif ($_.ToCharArray().length -eq 2) {
        ('        assertFalse(JISX0213String.isValid("\u{0:X}\u{1:X}"));' -F [int]($_.ToCharArray()[0]), [int]($_.ToCharArray()[1])) + "`t// $_"
        ('        assertEquals(JISX0213String.length("\u{0:X}\u{1:X}"), 1);' -F [int]($_.ToCharArray()[0]), [int]($_.ToCharArray()[1]))
    }
}
    @'
    }
}
'@
