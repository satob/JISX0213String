/*
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
*/
package com.example;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class JISX0213StringTest {

    @Test
    void testValidCharacters() {
        // 空文字
        assertTrue(JISX0213String.isValid(""));

        // ASCII
        assertTrue(JISX0213String.isValid("A"));
        // JIS X 0201 半角カナ
        assertTrue(JISX0213String.isValid("｢ｱｲｳ｣"));

        // JIS X 0208 非漢字
        assertTrue(JISX0213String.isValid("あ"));
        // JIS X 0208 非漢字 Windows-31JとShift_JISでマッピングが異なるもの
        assertTrue(JISX0213String.isValid("～―￠￡￢"));

        // JIS X 0208 JIS第1水準漢字
        assertTrue(JISX0213String.isValid("亜"));
        // JIS X 0208 JIS第2水準漢字
        assertTrue(JISX0213String.isValid("弌"));

        // JIS X 0213 JIS第3水準非漢字 1コードユニット(ǽ)
        assertTrue(JISX0213String.isValid("\u01fd"));
        assertTrue(JISX0213String.isValid("ǽ"));
        // JIS X 0213 JIS第3水準非漢字 合字 1文字目も2文字目もvalid（æ̀）
        assertTrue(JISX0213String.isValid("\u00e6\u0300"));
        assertTrue(JISX0213String.isValid("æ̀"));
        assertTrue(JISX0213String.isValid("\u00e6"));
        assertTrue(JISX0213String.isValid("\u0300"));

        // JIS X 0213 JIS第3水準非漢字 合字 2文字目だけだとinvalidのもの(か゚)
        assertTrue(JISX0213String.isValid("\u304b\u309a"));
        assertTrue(JISX0213String.isValid("か゚"));

        // JIS X 0213 JIS第3水準非漢字 合字 1文字目と2文字目が逆でもよいもの
        assertTrue(JISX0213String.isValid("˩˥ ˥˩"));
        assertTrue(JISX0213String.isValid("˩˥˥˩"));
        assertTrue(JISX0213String.isValid("˥˩˩˥"));
        assertTrue(JISX0213String.isValid("˥ ˩ ˥"));

        // JIS X 0213 JIS第3水準漢字 1コードユニット
        assertTrue(JISX0213String.isValid("俱"));
        // JIS X 0213 JIS第3水準漢字 サロゲートペア
        assertTrue(JISX0213String.isValid("𠀋"));
        // JIS X 0213 JIS第4水準漢字 1コードユニット
        assertTrue(JISX0213String.isValid("丂"));
        // JIS X 0213 JIS第4水準漢字 サロゲートペア
        assertTrue(JISX0213String.isValid("𩸽"));
    }

    @Test
    void testInvalidCharacters() {
        // JIS X 0208 非漢字 Windows-31JとShift_JISでマッピングが異なるもの
        assertFalse(JISX0213String.isValid("〜"));
        assertFalse(JISX0213String.isValid("\u2014"));
        assertFalse(JISX0213String.isValid("¢"));
        assertFalse(JISX0213String.isValid("£"));
        assertFalse(JISX0213String.isValid("\u00ac")); // ¬（半角の￢）

        // TODO: Σはinvalidでよいか？

        // JIS X 0213 JIS第3水準非漢字 合字の2コードユニット目だけ
        assertFalse(JISX0213String.isValid("\u309a"));
        // JIS X 0213 JIS第3水準非漢字 合字 1文字目と2文字目が逆
        assertFalse(JISX0213String.isValid("\u309a\u304b"));
        // JIS X 0213 JIS第3水準非漢字 合字 規格にない組み合わせ
        assertFalse(JISX0213String.isValid("あ\u309a"));
    }

    // NEC特殊文字
    // cf. https://www.wdic.org/w/WDIC/NEC%E7%89%B9%E6%AE%8A%E6%96%87%E5%AD%97
    @Test
    void testNECSpecial() {
        // JIS X 0213に含まれ、Windows-31Jでの符号位置がそのままJIS X 0213の符号位置になっているもの
        assertTrue(JISX0213String.isValid("①②③④⑤⑥⑦⑧⑨⑩⑪⑫⑬⑭⑮⑯⑰⑱⑲⑳ⅠⅡⅢⅣⅤⅥⅦⅧⅨⅩ㍉㌔㌢㍍㌘㌧㌃㌶㍑㍗㌍㌦㌣㌫㍊㌻㎜㎝㎞㎎㎏㏄㎡㍻〝〟№㏍℡㊤㊥㊦㊧㊨㈱㈲㈹㍾㍽㍼∮∟⊿"));
        // JIS X 0213に含まれるが、Windows-31Jでの符号位置がJIS X 0213の符号位置と異なるもの。ただしWindows-31J→Unicodeに変換したときのコードポイントはProject X0213のとおり
        assertTrue(JISX0213String.isValid("≒≡∫√⊥∠∵∩∪"));
        // 字形は半角のものがJIS X 0213には含まれるが、Windows-31Jでの符号位置がJIS X 0213の符号位置と異なり、またWindows-31J→UnicodeのコードポイントもJIS規格とは異なるもの。Project X0213では<reserved>とされている
        assertTrue(JISX0213String.isValid("∑"));
    }

    // NEC選定IBM拡張文字
    // cf. https://www.maff-ebic.go.jp/KITEI/AttentionA.pdf
    @Test
    void testNECSelectionOfIBMExtensions() {
        // JIS X 0213に含まれるもの
        assertTrue(JISX0213String.isValid("纊褜鍈銈蓜俉炻昱棈鋹曻彅丨仡伀伃佖侒侊侚侔偀倢倞偆偰偂傔兊冝刕劦勛匀匇匤厓厲咜咊咩哿喆垬埈埇﨏塚增夋奛奝妤孖寀甯寘寬尞岦岺崧嵓﨑嵂嵭嶸嶹弴彧德忞悊惕惲愷愰憘抦揵摠撝擎昀昕昉昞昤晥晗晙晳暙暠暲暿曺朗杦枻桒柀栁桄棏﨓楨﨔榘槢樰橫橆橳橾櫤毖氿汜沆泚洄涇涬淏淼湜渧渼溿澈澵濵瀅瀇瀨炅炫焏焄煜煆煇凞燁燾犱犾猪獷珉珖珣琇琦琪琮瑢璉璟甁畯皜皞皛皦睆劯砡硎硤礰神祥禔福禛竑竧竫箞絈絜綷綠緖繒罇茁荢荿菇葈蒴蕓蕙﨟薰蘒﨡裵訒訷詹誧誾諟諸諶譿賰賴贒﨤郞都鄕鄧釚釗釭釮釤釥鈐鈊鈺鉀鈼鉎鉙鉑鈹鉧銧鉸鋧鋗鋙鋐鋠鋓錥錡鋻錞鋿錝錂鍰鍗鏆鏞鑅隆隝隯霳霻靍靏靕顗顥馞驎髜魵魲鮏鮱鰀鵰鵫鸙黑"));
        // JIS X 0213に含まれるが、Windows-31Jでの符号位置がJIS X 0213の符号位置と異なるもの。ただしWindows-31J→Unicodeに変換したときのコードポイントはProject X0213のとおり
        assertTrue(JISX0213String.isValid("ⅰⅱⅲⅳⅴⅵⅶⅷⅸⅹ"));
        // 字形は半角のものがJIS X 0208には含まれるが、Windows-31Jでの符号位置がJIS X 0208の符号位置と異なり、またWindows-31J→UnicodeのコードポイントもJIS規格とは異なるもの。Project X0213では異なるコードポイントで「Windows: 」という但書のみあるもの
        assertTrue(JISX0213String.isValid("￢"));
        // 字形は半角のものがJIS X 0213には含まれるが、Windows-31Jでの符号位置がJIS X 0213の符号位置と異なり、またWindows-31J→UnicodeのコードポイントもJIS規格とは異なるもの。Project X0213では異なるコードポイントで「Windows: 」という但書のみあるもの
        assertTrue(JISX0213String.isValid("＇＂"));
        // 半角の字形はJIS X 0213には含まれるが、全角の字形はJIS X 0213に含まれないもの
        assertTrue(JISX0213String.isValid("￤"));

        // JIS X 0213に含まれないもの
        // 許容しない場合は処理の修正が必要
        assertTrue(JISX0213String.isValid("仼伹俍俿僴僘兤冾凬劜勀卲叝﨎坙坥墲奓奣妺峵巐弡恝悅惞愠愑戓敎昻昮晴朎櫢汯浯涖淸淲渹猤玽珒珵琩皂益硺礼靖精羡羽菶蕫蠇譓赶﨣軏逸遧釞鈆鉷﨧鋕﨨鎤鏸鐱鑈閒﨩靃靑飯飼餧館髙鮻鶴"));
    }

    // IBM拡張文字
    // cf. https://www.maff-ebic.go.jp/KITEI/AttentionA.pdf
    @Test
    void testIBMExtensions() {
        // NEC選定IBM拡張文字に入っている漢字は省略
        // JIS X 0208に別の符号位置で重複登録されているもの。ただしWindows-31J→Unicodeに変換したときのコードポイントはProject X0213のとおり
        assertTrue(JISX0213String.isValid("∵"));
        // JIS X 0213に別の符号位置で重複登録されているもの。ただしWindows-31J→Unicodeに変換したときのコードポイントはProject X0213のとおり
        assertTrue(JISX0213String.isValid("ⅠⅡⅢⅣⅤⅥⅦⅧⅨⅩ㈱№℡"));
    }

    // BMP外字領域のテスト
    @Test
    void testBMPPUA() {
        // U+E000～U+E757（Windows-31のユーザ外字領域）
        // cf. https://ja.wikipedia.org/wiki/%E5%A4%96%E5%AD%97#JIS_X_0221_(Unicode%EF%BC%89%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B%E5%A4%96%E5%AD%97
        assertTrue(JISX0213String.isValid("\ue000"));
        assertTrue(JISX0213String.isValid("\ue757"));

        // Unicode BMP面のユーザが維持領域で、Windows-31Jでは使えない領域
        // 許容する場合は処理の修正が必要
        assertFalse(JISX0213String.isValid("\ue758"));
        assertFalse(JISX0213String.isValid("\uf8ff"));
    }

    // JIS X 0212のテスト
    // cf. http://www2d.biglobe.ne.jp/~msyk/text/jisx0212utf8.html
    @Test
    void testJISX0212() {
        // JIS X 0213にもWindows-31Jにも含まれるもの
        assertTrue(JISX0213String.isValid("丨仡伀伃佖侊侒侔侚俉倞倢偀偂偆偰傔兊冝刕劦劯勛匀厓厲咜咩哿喆垬埇埈夋奛奝妤孖寀寘尞岦岺崧嵂嵭嶸嶹弴彅彧忞悊惕惲愰愷憘抦揵摠撝擎昀昉昕昞昤昱晗晙曻晳暙暠暲暿曺杦枻柀桒桄棈棏楨榘槢樰橆橳橾櫤毖氿汜沆泚洄涇涬淏淼渧渼湜溿澈澵濵瀅瀇炅炫焄焏煆煇煜燁燾犱犾獷珉珖珣琇琦琪琮瑢璉璟甯畯皛皜皦睆砡硎硤禔禛竑竫箞絈絜綷繒纊罇茁荿菇葈蒴蓜蕓蕙裵褜訒訷詹誧誾諟諶賰贒鄧釗釚釤釥釭釮鈊鈐鈹鈺鈼鉀鉎鉑鉙鉧鉸銈銧鋐鋓鋗鋙鋠鋧鋹鋻鋿錂錝錞錡錥鍈鍗鍰鏆鏞鑅隝隯霳靏靕顗顥驎髜魵鮏鮱鰀鵫鵰鸙"));
        // JIS X 0213には含まれるがWindows-31Jには含まれないもの
        assertTrue(JISX0213String.isValid("丂丒丫丮丯丰乀乇乑乚乩亍亝亹仃仐仚仱仵份仿伋伖你伷伾佈佉佔佘佟佪佬佷佸佺佽佾侂侅侗侲侾俅俋俏俒俠俲倀倁倎倐倓倘倜倧倮偁偎偓偗偣偦偪倻傒傓傖傜傪傺僄僇僌僎僐僔僦僩儃儆儈儋僲儗儛儞儵兕兗冃冋冘冣冭冼凞凢凮凳凴刁刂划刓刖剉剕剗剜剡剷劂劓劘劤劺劻勈勌勑勖勰勷匊匋匜匵匾卂卡卣卬厝厤厴厷叀叕叚叵吧吨呃呍呢呦呫呴呿咈咍咕咖咡咦咭咮咷咺咿哆哬哯唀唁唉唎唫唵唼啁啇啊啐啞啠啡啤喁喂喈喎喑喭喿嗉嗌嗎嗑嗒嗢嗩嘈嘎嘐嘰嘷嘻嘽嘿噀噉噞噠噦噭噯噱噲嚈嚌嚕嚙嚚嚝嚞嚨嚩嚬嚭嚳囅囉囊囍囟囨囶囷圊圕圣圩圯圳圴坅坆坌坍坨坯坰坳坴坵坷坻坼垚垜垝垞垨垸埌埏埞埤埦埭埰埵埶埸埽埿堄堉堞堠堧堲堹塉塌塡塤塧塼墉墊墍墏墐墔墝墩墱壍壎壒壔壚壢壩壳夅夆夌夔虁夤奆奟奭奵奶奼妋妒妟妮妼姃姈姍姒姝姞姣姤姧姮娌娍娓娣娧娭婕婥婧婭婷婺婾媋媜媞媟媠媢媧媱媳媵媺媿嫄嫚嫜嫠嫥嫮嫵嬀嬈嬗嬴嬙嬥嬭孁孌孒孨孯孼孽孿宁宄宓宖宬寖寱寽尣尩尫尰屢屣屧屨屩屰屺屼岈岊岏岟岠岢岣岪岵峉峋峒峴崆崍崫崤崦崱崹嵆嵊嵡嵪嵰嶁嶈嶒嶔嶙嶠嶧嶰嶴巋巘巠巤巩帀帒帔帕帘帟帮帾幉幖幘幞幫幬幭幮庥庪庬庾庿廆廋廒异弇弈弎弜弝弣弶弽彀彇彔彘彣彤彲彽彾徉徏徜徢徧徤徯徸忄忇忉忋忒忓忔忡忢忩忮忯忳忼怍怔怗怘怤怳怵恇恌恿悕悝悞您悰悱悾惈惋惔惙惛惝惵惸愐愒愓愙愜愞愫慁慆慠慼憍憒憓憗憥憨憭憹憼懕懝懟戕戢戣戩扃扆扌扑扒扖扚扤扭扯扳拄拕拖拼拽挃挊挍挐挘挵挹挼捁捃捄捎捥捬捼掄掔掙掽揔揕揜揠揥揬揲搉搐搔搞搢搥搩搯摑摚摛摝摭摳摽撇撑撟撾撿擄擊擋擌擐擕擗擤擥擷擻擿攄攏攔攖攞攢攩敔敧敫敺斁斅斊斝斲斿旂旉旔旲旹昄昈昡昢昪昫昰昳晅晌晑晎晛晡晪晫晬晷晸晻暀暍暐暒暭暱暵暻曈曛曨曬朅朓朙朳杇杈杌杔杝杴杶杻极枓枘枛枰枲柹柃柈柒柗柙柰柷栝栟栬栭栱栳栻桅桌桕桗桛桫桮桲桵桺桼梂梖梘梚梜梣梥梪梲梻棅棌棐棖棙棥棨棬棭棰棱棻棼椊椵椻楂楉楗楣楤楩楬楲楺楿榀榒榖榥榦榭榷榺榼槑槖槮槯槳槵槾樏樑樕樚樝樲樴樻樾樿橅橉橎橐橒橖橛橤檃檉檋檑檝檞檟檥檫檽櫆櫐櫔櫜櫝櫧櫬櫱櫲櫽欏欐欑欗欛欞欬欯欵歆歊歖歘歠歧歵殂殛殩殭殮殽殾毉毚毦毧毮毱毿氂氅氎氐氳氵氶氺汍汙汛汭汴汶沅沉沔沕沗沘沜泂泆泐泔泖泜泠泩泫泬泮洊洎洦洧汧洮洯洱洹洼洿浞浥浰涂涑涔涘涪涴涿淄淈淎淖淛淝淟淩淶渞渢渲渶湄湈湉湋湏湑湓湔湗湞湣溓溧溱滁滃滇滊滎滫滹滻漊漌漘漚漪漯漳漶漼潑潒潗潙潚潞潡潢潨潽潾澌澍澐澔澖澟澠澥澧澯澶澼濇濈濊濚濞濩濰濹濼瀀瀆瀣瀹瀼灃灊灋灔灝灞灎灤灥灬灮灵灶灾炁炆炕炗炤炱炷烊烑烓烔烘烜烤焃焆焇焌焞焠焫焯焰焱煊煐煒煞煠煨熀熅熇熒熛熠熢熯熳熺燄燋燓燙燜爀爇爫爴爸爹牂牓牕牖牣牮牯牸牿犍犎犛犭犮狁狌狳狺狻猇猒猘猙猧猨猬猱猽獐獒獦獫獬獮獯獱獼玁玅玕玘玜玞玟玠玢玥玦玫玵玷玹玼玿珅珋珏珙珡珧珩珹珺琁琊琚琛琤琨琫琬琯琰琱琹瑀瑃瑄瑆瑇瑋瑍瑒瑗瑝瑫瑭瑱璁璅璆璇璐璒璘璙璜璠璡璣璦璨璩璪璫璵璹璻璿瓈瓉瓘瓚瓞瓫瓯瓺瓿甗甠甤甪甽甾畀畈畎畐畒畱畹畺畽畾疁疒疢疿痀痆痎痏痟痠痤痧痬痮痱痹瘀瘂瘃瘇瘈瘏瘓瘕瘖瘙瘛瘜瘞瘥瘦瘭瘳瘵瘼癁癃癉癋癕癤癥癭癮癯癱皁皕皝皠皧皨皪盅盉盌盎盔盦盨盬盱盼眊眗眙眚眭眴眵眶睍睎睜睟睠睢睪睲睺睽瞀瞔瞚瞟瞢瞪矞矟矠矤矦矪矬矰矴矻砅砆砉砍砭硃硇硨硪确碊碔碝碞碟碤碭碰碻磈磌磎磕磤磠磡磦磲礀磷磺磻礐礜礥礱礴礻祅祆祊祘祛祜祧祲祹禕禖禘禡禩禱禴禸离秂秇秈秊秔秖秞秫秭稃稊稑稕稛稞稭稸稹穇穌穖穙穜穝穟穠穧穪穭穵穸窂窅窊窐窠窣窬窳窹窻窼竌竎竨竴竽笇笧笪笭笮笯笱笽筁筇筎筕筠筤筦筩筭筯筲筳箐箑箛箯箵箼篅篊篔篖篗篙篚篪簁簃簋簎簏簠簦簱簳簶籊籑籙籞籡籩籭籮籰籹粏粔粠粦粶粷粼粿糄糈糍糕糗糙糝糦糫糵紃紇紈紉紒紓紝紞紣紱紽紾絀絁絇絓絙絚絪絰絺絿綃綆綈綋綌綗綝綦綧綪綶緂緌緗緙緦緱緹縈縐縑縕縗縝縠縧縨縬繅繇繡繫繳繾纆纇纍纑纘纚缼缻缾罃罄罏罒罡罣罤罭罽罾羐羑羖羗羜羭羿翃翎翏翛翟翣翥翬翮翯翲翺耈耊耎耑耔耖耤耦耬耰耵耷耼聦聱聵肜肧肸胕胗胘胠胳脖脘脞脤脧脬脵腊腠腧腨腩腭膁膄膅膘膲膻臃臊臏臗臛臤臬臽臿舙舡舢舲舴艅艆艋艏艜艠艣艴艽艿芃芊芎芡芣芤芧芨芩芮芲芴芷芺芼芾芿苆苕苢苨苷苽苾茀茇茈荔茛茝茢茭茰茺茼荃荄荇荑荕荗荽莆莍莒莔莕莘莛莝莧莩莿菀菉菏菐菑菔菝菪菹萁萆萊萏萑萕萹葊葏葑葒葙葚葜葥葰葳葶葸葼蒁蒅蒞蒦蒯蒺蒾蓀蓂蓏蓓蓧蓪蓯蓰蓱蔲蓺蓽蔌蔞蔣蔤蔥蔫蔯蔴蕏蕑蕞蕡蕢蕤蕯蕺蕻蕽蕿薁薆薌薏薓薝薟薢薷薼藇藊藋藎薭藘藟藦藭藶藿蘀蘄蘅蘐蘑蘒蘘蘞蘡蘧蘩蘸蘼虀虓虖虗虢虬虯虵虷虺蚍蚑蚘蚜蚨蚱蚳蚸蛁蛃蛑蛕蛗蛣蛺蛼蛽蜅蜇蜋蜎蜐蜓蜙蜟蜡蜣蜱蜺蜾蝀蝃蝘蝤蝥蝱蝲螇螈螉螋螓螠螧螬螭螵螾蟁蟎蟖蟟蟣蟪蟫蟭蠁蠃蠆蠊蠋蠐蠓蠔蠟蠨蠮蠲蠼衊衘衟衤衩袘袠袪袽袾裀裊裎裑裒裓裛裰裱褁褘褙褚褧褰褲褹襀襂襅襉襢覉覐覔覟覰覷觔觖觘觥觫觱觳觶觽觿訑訔訕訢訵訾詅詇詍詎詘詝詡詵誐誮誷諗諴諼謅謜謟謊謭譃譆譔譙譞譶讁讋讔讕讜讞谹谽豅豇豉豏豔豗豨豩豭豳貒貓貙貛貤賖賕賙賡賸賾贉贛赬趄趕趦趯跆跈跎跑跗跙跬跽踆踔踖踠踡踢踣踧踶踹踽蹋蹔蹢蹬蹭蹯蹰蹻躞躮躳躵躻軀軑軔軹軺輀輈輗輞輭輶轀轔轘辤辦辵辶迁迆迊迍迓迕迠迤迨迮迱迵迻适逈逌逭逷遃遄遝邅邈邌邐邕邗邙邛邡邢邰邳邶邾郃郄郅郇郈郗郜郝郟郶郫郯郴郾郿鄀鄄鄆鄔鄖鄘鄜鄞鄢鄣鄯鄱鄴鄷鄹鄺鄽酇酈酗酙酛酡酤酴酹醃醅醎醞醨醬醮醱醳醶醼釃釬釱釻鈁鈇鈖鈳鈸鉂鉃鉇鉊鉏鉠鉡鉥鉨鉼鉽鉿銉銍銗銙銟銫銲銿鋀鋂鋆鋋鋌鋎鋥錍錑錕錟錧錩鍇鍉鍑鍚鍤鍥鍪鍱鍳鎈鎋鎏鎛鎞鎡鎣鎺鏁鏇鏜鏟鏢鏧鏻鏽鐄鐉鐏鐖鐗鐲鐳鐴鐻鑊鑣鑫鑭鑯鑱鑲镸镹閌閍閎閟閦閩閫閬閴閶閽闈闋闐闓闚闞阝阬阳阼陁陘陡隂隄隚隤隥隩隳隺雒嶲雘雚雝雞雩雯霣靁靎靗靚靛靪靮靳鞕鞖鞚鞞鞢鞮鞱鞲鞺鞾韁韉韌韑韔韘韙韞韛韡韱韴頊頍頎頔頖頞頣頫頰頲頳頥顇顒顓顖顙顚顦顬颫颭颰颷颸颺颻颿飂飈飡飣飥飧飪飳餈餖餗餚餛餜餱餲餳餺餻餼饀饁饆饍饎饘饜饟饠馦馹馽馿駃駉駔駙駞駰駹騂騃騑騖騠騤騭騮騶騸驄驊驌骯骶骹髁髃髆髎髐髒髕髖髠髥髩髹鬂鬃鬈鬌鬐鬒鬖鬜鬠鬫鬭鬳鬽魋魞魣魥魦魫魬魳魷魹鮄鮊鮞鮦鮧鮬鮲鮸鮾鯁鯇鯎鯘鯝鯥鯧鯪鯫鯯鯳鯷鯸鯺鯽鰖鰘鰙鰚鰢鰣鰧鰩鰪鰱鰶鰷鱁鱅鱉鱊鱏鱐鱓鱔鱘鱛鱝鱟鱣鱩鱪鱜鱫鱮鱰鱲鱵鱷鳦鳲鴋鴂鴑鴗鴘鴝鴞鴲鵂鵃鵇鵊鵟鵣鵢鵩鵶鵷鵼鵾鶄鶊鶍鶖鶡鶬鶵鶹鶼鶿鷃鷇鷉鷖鷗鷚鷟鷠鷧鷴鸊鸂鸇鸕鸜鸝鹻鹼麀麅麛麞麤麨麬麯麴麵黟黧黮黿鼂鼃鼐鼗鼙鼯鼷鼹鼺鼽齁齅齆齓齕齗齘齝齩齭齰齵龐龔龗龢"));
        // JIS X 0213に含まれないがWindows-31Jに含まれるもの
        // ※assertFalseにすべきか？はターゲットの文字セットの仕様による
        assertTrue(JISX0213String.isValid("伹俍俿僘兤冾劜勀卲叝坥墲奓奣妺巐弡恝惞愑戓昮朎汯浯涖渹猤玽珒珵琩硺羡菶蕫譓軏遧釞鈆鉷鋕鎤鏸鐱鑈靃餧鮻"));
        // JIS X 0213にもWindows-31Jにも含まれないもの
        assertFalse(JISX0213String.isValid("丄丅丌丟丣两丵乁乄乜乣乨乴乵乹乿亖亗亯仛仠仢仨仯仳仾伂伈伌伒伕众伙伮伱伳伵伻佀佂佋佌佒佣佮佱佹侁侄侉侌侎侐侓侙侞侟侷侹侻侼侽俀俁俆俈俌俜俢俰俼俽倄倇倊倌倗倛倝倰倲倳倵偅偊偌偑偒偙偟偠偢偧偭偱傁傃傄傆傊傎傏傐傛傞傟傠傡傢傯傰傹傽僀僃僓僜僝僟僢僤僨僯僱僶僺僾儇儌儍儎儐儙儜儝儣儧儨儬儭儯儱儳儴儸儹兂兏兓兘兟兦兾冄冎冡冸冺冿凂凈减凑凒凓凕凘凥凲凷刅刘刢刨刱刲刵刼剅剘剚剟剠剦剮剸剹劀劅劊劌劕劖劗劚劥劧劰劶劷劸劽勄勆勏勔勜勡勥勨勩勪勬勱勴勶匃匌匑匓匘匛匞匟匥匧匨匩匫匬匭匰匲匼匽卌卋卙卛卥卭卹卾厃厇厈厎厔厙厡厪厫厯厵厸厺厽叅叏叒叓叞叠另叧吂吓吚吡吪启吱吴吵呄呇呏呞呤呧呩呭呮咁咃咅咉咑咟咧咪咱咹咻哊响哎哠哪哶哼哾唅唈唌唍唕唪唲唶唻唽啉啍啑啘啚啛啦啿喏喒喓喔喗喣喤喲嗁嗃嗆嗋嗓嗗嗘嗛嗞嗶嗿嘅嘊嘍嘏嘑嘒嘙嘬嘳嘵嘹嘼噁噃噄噆噋噍噏噔噡噢噣噩噵嚄嚅嚋嚟嚦嚧嚫嚱嚷嚾囋囏囐囌囙囜囝囡囤囥囦囧囱囫园圁圂圇圌圑圚圛圝圠圢圤圥圪圬圮圽圾圿坒坢坧坫坭坮坱坹坺坾垁垃垌垔垗垙垟垡垕垧垩垽埕埝埧埩埾堃堈埡堌堍堛堟堦堭堿塍塏塐塕塟塨塸塿墀墁墇墈墌墖墠墡墢墦壄墼壂壈壐壖壝壡夒夓夝夡夣夨夯夰夳夵夶夿奃奒奙奞奡奫奯奲她奻妌妎妕妗妧妭妯妰妳妷姁姄姊姟姯姱姲姴姷娀娄娎娒娞娤娨娪娰婄婅婇婈婌婐婞婣婻媐媓媖媙媬媲媸媻嫆嫈嫏嫪嫶嫽嬁嬛嬝嬡嬸孋孞孮孾宆宊宎宐宑宔宨宩宭宯宱宲宷宺宼寁寍寏寗寙寚寠寯寴尌尗尟尦尬尮尲尵尶屙屚屜屭屴屵屻屽岇岒岝岲岴峝峗峮峱峲崁崒崣崴崽崿嵃嵈嵕嵑嵙嵟嵠嵢嵤嵹嵺嵾嵿嶃嶊嶓嶕嶛嶟嶫巃巇巎巙巸巹帇帍帠帨帲帵幋幐幑幛幜幨幪幰庀庋庎庢庤庨庱庳庽廌廎廑廔廕廜廞廥廫弆弙弢弤弨弫弬弮弰弻弿彄彍彐彛彠彯彴彵彸彺徍徖徝徫徬徰徱忈忐忑忨忪忬忭忲忶忺怇怊怓怚怟怭恀恈恉恑恔恖恗恡恧恱恾悂悆悈悎悑悓悘悢悤悥悷悻惂惄惉惊惎惏惢惥惼惽愂愇愊愌愔愖愗愢愪愱愵愶愹慅慉慞慬慲慸慻慿憀憁憃憄憋憜憝憟憠憪憸懀懁懂懎懏懜懞懡懢懧懩懥懬懭懯戁戃戄戇戜戠戧戫戹戽扂扄扐扔扜扺扽抍抎抏抐抨抳抶抷抺抾抿拎拚拪拲拴挄挋挓挖挩挪挭挶捂捆捊捋捒捓捔捘捛捦捭捱捴捵捸捽捿掂掇掊掐掕掚掞掤掦掭掮掯揁揅揈揎揑揓揪揳揸揹搊搒搘搠搤搪搰搵搽搿摋摏摒摓摔摜摟摡摣摴摻撅撏撐撘撙撛撡撣撦撨撬撳撽擉擑擩擪擭擰擵攁攈攉攊攓攙攛攟攦攮攱攺攼攽敃敇敉敐敒敟敠敽斒斕斘斠斣斦斮斳斴旈旎旐旖旘旟旰旴旵旾旿昍昑昒昖昝昣昦昩昬昹昷晀晆晊晘晜晠晾晵晿晹晼暋暌暚暛暜暟暤曀曂曃曌曎曏曔曟曫曮朇朜朠朢朾杅杕杬杮构枎枏枑枖枙枱枵枼枽柂柅柉柜柡柦柲柶栔栙栨栧栯栰栿桊桘桯桰桱桹桻梄梆梈梡梩梮棑棓棜棝棪棫棵棶棽椆椉椐椑椓椖椗椱椳椸楅楎楛楥楦楰楱楻榍榡榨榫榯榸槅槈槗槥槱樀樁樃樠樤樨樷橊橑橕橧橪橱檁檆檇檛檯檰檱檴檾檿櫉櫈櫌櫕櫖櫰櫼欂欃欆欇欉欤欨欫欶欻欿歍歒歝歫歮歰歽歾殅殗殟殠殢殣殨殬殰殸殹毃毄毌毡毣毷毹氄氉氍氒氙氟氦氧氨氬氮氻汊汋汏汒汔汫汸汹汻沇沟沰沲沴泍泏泑泒泧泲泴洇洏洑洓洚洨浗浟浡浧浼涒涗涷涹涽淊淠淢淥淯淰淴渀渄渻湅湒湝湢湨湳湻湽溍溙溠溭溮溳溻滀滈滍滏滭滮滽漄漈漍漖漛漦漩漰漻漭潏潓潝潬澃澇澋澒澓澚澦澨澮澰濅濨濽瀍瀗瀠瀯瀴瀷灄灈灉灕炔炖炘炛炰炴烕烖烺焅焋焭焸煁煅煋煗煚煹熌熚熰熲熿燀燌燖燚燸爈爉爓爗爚爝爟爤爯牁牃牅牎牏牐牚牜牞牠牨牫牱牷牻牼犄犉犓犨犴狇狉狕狖狘狟狥狴狾猂猄猅猋猍猓猞猢猲猵猺猻獃獍獖獘獝獞獟獠獧獩獹玀玃玆玎玐玓玗玪玭珆珌珓珝珦珴珷珻珽珿琀琄琑琭瑑瑦瑧瑨瑮瑲璀璏璑璚璮璯璱璲瓌瓐瓓瓛瓟瓤瓨瓪瓴瓻瓼甆甒甖甡甧甩甶甹甿畃畇畗畞畟畡畻畼疅疐疓疕疙疜疤疴疺痁痄痌痗痜痡痯瘄瘊瘌瘒瘝瘣瘩瘲瘸瘹瘺癊癀癄癅癙癟癴皅皌皍皟皢皣皤皥皭皽盁盋盙盠盰盶盹眀眆眎眒眔眕眜眢眨眮眯眹眽眾睂睅睊睏睒睖睗睞睤睧睬睰睳睴瞄瞌瞍瞕瞖瞧瞮瞯瞱瞵瞾矃矉矑矒矕矙矱矸砎砑砝砢砣砮砰砵砷硄硈硌硒硜硞硠硡硣硾碏碘碡碨碬碱碲碳碽碿磇磉磒磓磖磛磟磪磳磶磿礆礌礚礞礟礠礧礩礭礵礽礿祄祋祏祑祔祩祫祻祼祾禋禌禑禓禜禨禫禯秄秏秚秝秠秢秥秪秱秸秼稂稇稉稌稡稧稫稯稰稴稵稺穄穅穈穕穥穾窀窆窋窑窔窞窵竆竉竛竩竬竱竻竾笔笟笣笩笫笰笴笿筀筪筷箄箉箎箖箠箥箬箰箲箶箺箻箽篂篈篛篨篲篴篵篸篹篺篼篾簂簄簆簉簌簙簛簥簨簬簴簹簺籆籕籒籓籚籛籜籝籣籧籲籼籽粆粇粞粰粺粻糇糉糏糓糔糚糩紏紑紖紦紪紭紼絍絑絗絝絥絧絸絻綁綂綅綍綑綖綞綳綹緃緄緅緆緍緎縀緢緥緪緫緭緵緶緺縜縭縯縳縶縿繄繎繐繘繟繢繥繮繯繸纁纕纝纞缽缿罓罛罜罝罥罦罱罿羀羋羍羏羢羦羪羴羼翀翈翨翽翾翿耇耍耏耓耝耞耟耠耮耴耹耺耾聀聄聠聤聭肁肈肎肞肦肫肹胈胍胏胒胔胭胮胰胲胶胹胺胾脃脋脗脜脠脰脺脼腅腇腌腒腗腡腯腷膐膆膋膎膖膛膞膢膮膴臋臅臎臕臝臞臡臫臰臱臲臵臶臸臹舀舃舏舓舔舚舝舨舺艃艄艎艑艖艧艭艻芀芁芄芇芉芑芔芖芘芚芛芠芪芰苐苚苠苤苪苭苯苶茊茋茞茟茡茬茮茳茷茽荂荍荎荖荰荸莀莂莄莙莜莦莬莾荓菨菸菼萙莭萯葅葇葍葖葘葠葤葧葪葴葽蒒蒓蒕蒨蒩蒪蒱蒽蓇蓈蓌蓲蓷蓻蔂蔃蔇蔎蔐蔜蔢蔧蔪蔳蔶蔿蕆蕐蕒蕖蕜蕝蕟蕠蕹薅薉薋薘薠薥薧薴薶薸薽薾薿藂藚藠藨藳藼蘍蘎蘙蘛蘶蘺蘽虂虆虒虘虙虝虠虡虣虤虩虶蚖蚚蚡蚦蚧蚭蚴蚵蚷蚹蚿蛀蛅蛒蛚蛜蛠蛥蛧蚈蜄蜏蜔蜞蜨蜮蜯蜲蜹蜼蜽蝅蝍蝝蝡蝯蝻螃螄螅螆螌螐螕螗螘螙螞螣螮螱螿蟈蟉蟊蟕蟙蟚蟜蟢蟤蟱蟳蟸蟺蟿蠉蠙蠒蠘蠚蠛蠜蠞蠭蠰蠵蠺衁衃衅衈衉衋衎衑衕衖衚衜衠衱衹衻袀袚袛袜袟袨袺裋裌裍裞裧裯裷褆褍褎褏褕褖褠褦褨褱褵褺褾襆襏襒襗襚襛襜襡襣襫襮襰襳襵襺襻襼襽覍覕覛覜覠覥覴覵覶覼觕觗觩觭觹訄訅訇訏訞訠訤訦訫訬訯訽詀詃詉詓詖詗詜詥詧詶詷詺詻詾詿誀誃誆誋誏誒誖誗誙誟誩誯誳誶誻諃諆諈諉諊諑諓諔諕諝諬諰諵諿謆謋謑謞謰謷謼譂譄譅譈譒譍譣譭譸譹譼譾讄讅讍讏讟谸谾豋豑豓豘豛豝豙豣豤豦豵豶豻豾貆貇貋貐貜貹貺賅賆賉賋賏賝賨賬賯賲賵賷賿贁贃贗赥赩赮赿趂趈趍趐趑趞趟趠趫趬趲趵趷趹趻跀跅跇跊跔跕跤跥跧跰趼跱跲跴踁踄踅踋踑踦踱踳踷踸蹀蹁蹍蹎蹏蹛蹜蹝蹞蹡蹩蹱蹹蹺躂躃躉躐躒躕躚躛躝躢躧躩躭躺軁軃軄軇軜軨軮軰軱軷軭輂輇輏輐輖輘輠輡輣輥輧輨輬輮輴輵輷輺轁轃轇轏轑轒轓轕轝轞轥辝辠辡辥辸达迀迋运迒迣迶迾逄逘逛逨逩逯逪逬逳逴逿遌遛遢遦遬遰遴遹邋邎邘邠邥邲邴邽郌郕郘郙郥郒郰鄅鄈鄍鄐鄗鄚鄠鄥鄩鄮鄶鄼酃酏酓酚酧酭酺酻醁醆醊醑醓醔醕醘醡醦醭醰醲醻醽醿釂釅釓釔釙釩釪釯釰釷釹釽鈀鈄鈅鈉鈌鈒鈓鈘鈜鈝鈣鈤鈥鈦鈨鈮鈯鈰鈵鈶鈾鉆鉍鉘鉜鉝鉩鉮鉯鉰鉵鉶鉹鉻銊銎銒銠銤銥銨銯銶銸銺銻銼銽鋁鋃鋅鋇鋈鋍鋘鋜鋝鋟鋡鋣鋨鋬鋮鋰錀錈錔錜錤錪錳錴錶錷鍐鍒鍕鍘鍞鍧鍩鍭鍯鍴鍶鍺鍽鍿鎀鎁鎂鎊鎍鎒鎕鎘鎦鎨鎫鎴鎵鎶鎩鏄鏅鏉鏊鏋鏌鏍鏓鏙鏦鏹鏷鏺鐁鐂鐈鐍鐎鐕鐟鐮鐯鐿鐽鑃鑌鑕鑙鑜鑟鑡鑨鑮钄钃镾閄閈閝閞閡閺閿闆闉闑闒闙闝闟闠闤闦阞阢阤阥阦阱阷阸阹阺阽陒陔陖陗陮陴陻陼陾陿隁隃隉隑隖隟隦隮雊雟雱雺霂霃霅霉霚霛霝霡霢霨霱靊靘靣靧靶靷靸靻靽靿鞀鞉鞗鞙鞟鞬鞵鞶鞸鞹鞼鞿韄韅韇韊韍韎韐韗韝韠韤韯韷韸韺頇頙頜頠頦頮頯頵頾顄顊顑顢顣顪颮颴飅飌飦飶餂餇餑餕餟餢餦餫餴餵餹饇饈饔饙饛饞馛馝馟馰馱馲馵馺駓駚駜駧駪駫駬駴駵駽駾騄騋騌騐騞騢騣騧騳騵驇驁驋驑驔驖驝骪骬骮骲骴骵骻骾骿髈髗髛髤髧髬髲髳髵髺髽髿鬀鬁鬄鬅鬉鬋鬍鬎鬙鬛鬦鬴鬵鬷鬹鬺魈魌魕魖魗魛魡魨魪魭魮魸魿鮀鮅鮆鮇鮉鮋鮍鮐鮔鮚鮝鮩鮰鮷鮼鮿鯈鯐鯗鯟鯹鯿鰂鰋鰏鰑鰜鰞鰦鰨鰵鰽鱃鱄鱎鱖鱞鱨鱻鳷鳹鴜鴯鴰鴳鴴鴺鴼鵅鴽鵓鵔鵥鵪鵻鶃鶆鶎鶒鶓鶕鶗鶘鶪鶮鶱鷊鷔鷕鷞鷥鷩鷫鷮鷰鷳鷾鸎鸐鸑鸒鸖鹺麂麃麄麇麎麏麖麘麮麰麳黆黈黋黕黤黬黭黰黱黲黵黸鼉鼏鼑鼒鼔鼖鼚鼛鼟鼢鼦鼪鼫鼱鼲鼴鼼鼿齃齄齇齖齚齞齨齮齯齱齳齺齽龏龑龒龖龞龡龣龥"));
    }

    // 複数文字のテスト
    @Test
    void testMixedStringValidation() {
        assertTrue(JISX0213String.isValid("俱𠀋丂𩸽"));
        assertFalse(JISX0213String.isValid("繁体字简体字"));
    }

    @Test
    void testLength() {
        // 空文字
        assertEquals(JISX0213String.length(""), 0);

        // ASCII
        assertEquals(JISX0213String.length("A"), 1);
        // JIS X 0201 半角カナ
        assertEquals(JISX0213String.length("｢ｱｲｳ｣"), 5);

        // JIS X 0208 非漢字
        assertEquals(JISX0213String.length("あ"), 1);
        // JIS X 0208 非漢字 Windows-31JとShift_JISでマッピングが異なるもの
        assertEquals(JISX0213String.length("～―￠￡￢"), 5);

        // JIS X 0208 JIS第1水準漢字
        assertEquals(JISX0213String.length("亜"), 1);
        // JIS X 0208 JIS第2水準漢字
        assertEquals(JISX0213String.length("弌"), 1);

        // JIS X 0213 JIS第3水準非漢字 1コードユニット(ǽ)
        assertEquals(JISX0213String.length("\u01fd"), 1);
        assertEquals(JISX0213String.length("ǽ"), 1);
        // JIS X 0213 JIS第3水準非漢字 合字 1文字目も2文字目もvalid（æ̀）
        assertEquals(JISX0213String.length("\u00e6\u0300"), 1);
        assertEquals(JISX0213String.length("æ̀"), 1);
        assertEquals(JISX0213String.length("\u00e6"), 1);
        assertEquals(JISX0213String.length("\u0300"), 1);
        // JIS X 0213 JIS第3水準非漢字 合字 2文字目だけだとinvalidのもの(か゚)
        assertEquals(JISX0213String.length("\u304b\u309a"), 1);
        assertEquals(JISX0213String.length("か゚"), 1);

        // JIS X 0213 JIS第3水準非漢字 合字 1文字目と2文字目が逆でもよいもの
        // BreakIteratorを使うだけだと5文字とカウントされる
        assertEquals(JISX0213String.length("˩˥ ˥˩"), 3);
        // BreakIteratorを使うだけだと4文字とカウントされる
        assertEquals(JISX0213String.length("˩˥˥˩"), 2);
        // BreakIteratorを使うだけだと4文字とカウントされる
        assertEquals(JISX0213String.length("˥˩˩˥"), 2);
        assertEquals(JISX0213String.length("˥ ˩ ˥"), 5);

        // JIS X 0213 JIS第3水準漢字 1コードユニット
        assertEquals(JISX0213String.length("俱"), 1);
        // JIS X 0213 JIS第3水準漢字 サロゲートペア
        assertEquals(JISX0213String.length("𠀋"), 1);
        // JIS X 0213 JIS第4水準漢字 1コードユニット
        assertEquals(JISX0213String.length("丂"), 1);
        // JIS X 0213 JIS第4水準漢字 サロゲートペア
        assertEquals(JISX0213String.length("𩸽"), 1);
    }

    // O(n^2)とかになっていないかの確認
    @Test
    void testLengthPerformance() {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<Short.MAX_VALUE; i++) {
            sb.append("˩˥");
        }
        JISX0213String.length(sb.toString());
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime < 1000);
    }
}

