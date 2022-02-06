package com.example;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class JISX0212CharactersInJISX0213Test {

    @Test
    void testJISx0212ContaindInJISX0213AndMS932() {
        assertTrue(JISX0213String.isValid("\u4E28"));	// 丨
        assertEquals(JISX0213String.length("\u4E28"), 1);
        assertTrue(JISX0213String.isValid("\u4EE1"));	// 仡
        assertEquals(JISX0213String.length("\u4EE1"), 1);
        assertTrue(JISX0213String.isValid("\u4F00"));	// 伀
        assertEquals(JISX0213String.length("\u4F00"), 1);
        assertTrue(JISX0213String.isValid("\u4F03"));	// 伃
        assertEquals(JISX0213String.length("\u4F03"), 1);
        assertTrue(JISX0213String.isValid("\u4F56"));	// 佖
        assertEquals(JISX0213String.length("\u4F56"), 1);
        assertTrue(JISX0213String.isValid("\u4F8A"));	// 侊
        assertEquals(JISX0213String.length("\u4F8A"), 1);
        assertTrue(JISX0213String.isValid("\u4F92"));	// 侒
        assertEquals(JISX0213String.length("\u4F92"), 1);
        assertTrue(JISX0213String.isValid("\u4F94"));	// 侔
        assertEquals(JISX0213String.length("\u4F94"), 1);
        assertTrue(JISX0213String.isValid("\u4F9A"));	// 侚
        assertEquals(JISX0213String.length("\u4F9A"), 1);
        assertTrue(JISX0213String.isValid("\u4FC9"));	// 俉
        assertEquals(JISX0213String.length("\u4FC9"), 1);
        assertTrue(JISX0213String.isValid("\u501E"));	// 倞
        assertEquals(JISX0213String.length("\u501E"), 1);
        assertTrue(JISX0213String.isValid("\u5022"));	// 倢
        assertEquals(JISX0213String.length("\u5022"), 1);
        assertTrue(JISX0213String.isValid("\u5040"));	// 偀
        assertEquals(JISX0213String.length("\u5040"), 1);
        assertTrue(JISX0213String.isValid("\u5042"));	// 偂
        assertEquals(JISX0213String.length("\u5042"), 1);
        assertTrue(JISX0213String.isValid("\u5046"));	// 偆
        assertEquals(JISX0213String.length("\u5046"), 1);
        assertTrue(JISX0213String.isValid("\u5070"));	// 偰
        assertEquals(JISX0213String.length("\u5070"), 1);
        assertTrue(JISX0213String.isValid("\u5094"));	// 傔
        assertEquals(JISX0213String.length("\u5094"), 1);
        assertTrue(JISX0213String.isValid("\u514A"));	// 兊
        assertEquals(JISX0213String.length("\u514A"), 1);
        assertTrue(JISX0213String.isValid("\u519D"));	// 冝
        assertEquals(JISX0213String.length("\u519D"), 1);
        assertTrue(JISX0213String.isValid("\u5215"));	// 刕
        assertEquals(JISX0213String.length("\u5215"), 1);
        assertTrue(JISX0213String.isValid("\u52A6"));	// 劦
        assertEquals(JISX0213String.length("\u52A6"), 1);
        assertTrue(JISX0213String.isValid("\u52AF"));	// 劯
        assertEquals(JISX0213String.length("\u52AF"), 1);
        assertTrue(JISX0213String.isValid("\u52DB"));	// 勛
        assertEquals(JISX0213String.length("\u52DB"), 1);
        assertTrue(JISX0213String.isValid("\u5300"));	// 匀
        assertEquals(JISX0213String.length("\u5300"), 1);
        assertTrue(JISX0213String.isValid("\u5393"));	// 厓
        assertEquals(JISX0213String.length("\u5393"), 1);
        assertTrue(JISX0213String.isValid("\u53B2"));	// 厲
        assertEquals(JISX0213String.length("\u53B2"), 1);
        assertTrue(JISX0213String.isValid("\u549C"));	// 咜
        assertEquals(JISX0213String.length("\u549C"), 1);
        assertTrue(JISX0213String.isValid("\u54A9"));	// 咩
        assertEquals(JISX0213String.length("\u54A9"), 1);
        assertTrue(JISX0213String.isValid("\u54FF"));	// 哿
        assertEquals(JISX0213String.length("\u54FF"), 1);
        assertTrue(JISX0213String.isValid("\u5586"));	// 喆
        assertEquals(JISX0213String.length("\u5586"), 1);
        assertTrue(JISX0213String.isValid("\u57AC"));	// 垬
        assertEquals(JISX0213String.length("\u57AC"), 1);
        assertTrue(JISX0213String.isValid("\u57C7"));	// 埇
        assertEquals(JISX0213String.length("\u57C7"), 1);
        assertTrue(JISX0213String.isValid("\u57C8"));	// 埈
        assertEquals(JISX0213String.length("\u57C8"), 1);
        assertTrue(JISX0213String.isValid("\u590B"));	// 夋
        assertEquals(JISX0213String.length("\u590B"), 1);
        assertTrue(JISX0213String.isValid("\u595B"));	// 奛
        assertEquals(JISX0213String.length("\u595B"), 1);
        assertTrue(JISX0213String.isValid("\u595D"));	// 奝
        assertEquals(JISX0213String.length("\u595D"), 1);
        assertTrue(JISX0213String.isValid("\u59A4"));	// 妤
        assertEquals(JISX0213String.length("\u59A4"), 1);
        assertTrue(JISX0213String.isValid("\u5B56"));	// 孖
        assertEquals(JISX0213String.length("\u5B56"), 1);
        assertTrue(JISX0213String.isValid("\u5BC0"));	// 寀
        assertEquals(JISX0213String.length("\u5BC0"), 1);
        assertTrue(JISX0213String.isValid("\u5BD8"));	// 寘
        assertEquals(JISX0213String.length("\u5BD8"), 1);
        assertTrue(JISX0213String.isValid("\u5C1E"));	// 尞
        assertEquals(JISX0213String.length("\u5C1E"), 1);
        assertTrue(JISX0213String.isValid("\u5CA6"));	// 岦
        assertEquals(JISX0213String.length("\u5CA6"), 1);
        assertTrue(JISX0213String.isValid("\u5CBA"));	// 岺
        assertEquals(JISX0213String.length("\u5CBA"), 1);
        assertTrue(JISX0213String.isValid("\u5D27"));	// 崧
        assertEquals(JISX0213String.length("\u5D27"), 1);
        assertTrue(JISX0213String.isValid("\u5D42"));	// 嵂
        assertEquals(JISX0213String.length("\u5D42"), 1);
        assertTrue(JISX0213String.isValid("\u5D6D"));	// 嵭
        assertEquals(JISX0213String.length("\u5D6D"), 1);
        assertTrue(JISX0213String.isValid("\u5DB8"));	// 嶸
        assertEquals(JISX0213String.length("\u5DB8"), 1);
        assertTrue(JISX0213String.isValid("\u5DB9"));	// 嶹
        assertEquals(JISX0213String.length("\u5DB9"), 1);
        assertTrue(JISX0213String.isValid("\u5F34"));	// 弴
        assertEquals(JISX0213String.length("\u5F34"), 1);
        assertTrue(JISX0213String.isValid("\u5F45"));	// 彅
        assertEquals(JISX0213String.length("\u5F45"), 1);
        assertTrue(JISX0213String.isValid("\u5F67"));	// 彧
        assertEquals(JISX0213String.length("\u5F67"), 1);
        assertTrue(JISX0213String.isValid("\u5FDE"));	// 忞
        assertEquals(JISX0213String.length("\u5FDE"), 1);
        assertTrue(JISX0213String.isValid("\u608A"));	// 悊
        assertEquals(JISX0213String.length("\u608A"), 1);
        assertTrue(JISX0213String.isValid("\u60D5"));	// 惕
        assertEquals(JISX0213String.length("\u60D5"), 1);
        assertTrue(JISX0213String.isValid("\u60F2"));	// 惲
        assertEquals(JISX0213String.length("\u60F2"), 1);
        assertTrue(JISX0213String.isValid("\u6130"));	// 愰
        assertEquals(JISX0213String.length("\u6130"), 1);
        assertTrue(JISX0213String.isValid("\u6137"));	// 愷
        assertEquals(JISX0213String.length("\u6137"), 1);
        assertTrue(JISX0213String.isValid("\u6198"));	// 憘
        assertEquals(JISX0213String.length("\u6198"), 1);
        assertTrue(JISX0213String.isValid("\u62A6"));	// 抦
        assertEquals(JISX0213String.length("\u62A6"), 1);
        assertTrue(JISX0213String.isValid("\u63F5"));	// 揵
        assertEquals(JISX0213String.length("\u63F5"), 1);
        assertTrue(JISX0213String.isValid("\u6460"));	// 摠
        assertEquals(JISX0213String.length("\u6460"), 1);
        assertTrue(JISX0213String.isValid("\u649D"));	// 撝
        assertEquals(JISX0213String.length("\u649D"), 1);
        assertTrue(JISX0213String.isValid("\u64CE"));	// 擎
        assertEquals(JISX0213String.length("\u64CE"), 1);
        assertTrue(JISX0213String.isValid("\u6600"));	// 昀
        assertEquals(JISX0213String.length("\u6600"), 1);
        assertTrue(JISX0213String.isValid("\u6609"));	// 昉
        assertEquals(JISX0213String.length("\u6609"), 1);
        assertTrue(JISX0213String.isValid("\u6615"));	// 昕
        assertEquals(JISX0213String.length("\u6615"), 1);
        assertTrue(JISX0213String.isValid("\u661E"));	// 昞
        assertEquals(JISX0213String.length("\u661E"), 1);
        assertTrue(JISX0213String.isValid("\u6624"));	// 昤
        assertEquals(JISX0213String.length("\u6624"), 1);
        assertTrue(JISX0213String.isValid("\u6631"));	// 昱
        assertEquals(JISX0213String.length("\u6631"), 1);
        assertTrue(JISX0213String.isValid("\u6657"));	// 晗
        assertEquals(JISX0213String.length("\u6657"), 1);
        assertTrue(JISX0213String.isValid("\u6659"));	// 晙
        assertEquals(JISX0213String.length("\u6659"), 1);
        assertTrue(JISX0213String.isValid("\u66FB"));	// 曻
        assertEquals(JISX0213String.length("\u66FB"), 1);
        assertTrue(JISX0213String.isValid("\u6673"));	// 晳
        assertEquals(JISX0213String.length("\u6673"), 1);
        assertTrue(JISX0213String.isValid("\u6699"));	// 暙
        assertEquals(JISX0213String.length("\u6699"), 1);
        assertTrue(JISX0213String.isValid("\u66A0"));	// 暠
        assertEquals(JISX0213String.length("\u66A0"), 1);
        assertTrue(JISX0213String.isValid("\u66B2"));	// 暲
        assertEquals(JISX0213String.length("\u66B2"), 1);
        assertTrue(JISX0213String.isValid("\u66BF"));	// 暿
        assertEquals(JISX0213String.length("\u66BF"), 1);
        assertTrue(JISX0213String.isValid("\u66FA"));	// 曺
        assertEquals(JISX0213String.length("\u66FA"), 1);
        assertTrue(JISX0213String.isValid("\u6766"));	// 杦
        assertEquals(JISX0213String.length("\u6766"), 1);
        assertTrue(JISX0213String.isValid("\u67BB"));	// 枻
        assertEquals(JISX0213String.length("\u67BB"), 1);
        assertTrue(JISX0213String.isValid("\u67C0"));	// 柀
        assertEquals(JISX0213String.length("\u67C0"), 1);
        assertTrue(JISX0213String.isValid("\u6852"));	// 桒
        assertEquals(JISX0213String.length("\u6852"), 1);
        assertTrue(JISX0213String.isValid("\u6844"));	// 桄
        assertEquals(JISX0213String.length("\u6844"), 1);
        assertTrue(JISX0213String.isValid("\u68C8"));	// 棈
        assertEquals(JISX0213String.length("\u68C8"), 1);
        assertTrue(JISX0213String.isValid("\u68CF"));	// 棏
        assertEquals(JISX0213String.length("\u68CF"), 1);
        assertTrue(JISX0213String.isValid("\u6968"));	// 楨
        assertEquals(JISX0213String.length("\u6968"), 1);
        assertTrue(JISX0213String.isValid("\u6998"));	// 榘
        assertEquals(JISX0213String.length("\u6998"), 1);
        assertTrue(JISX0213String.isValid("\u69E2"));	// 槢
        assertEquals(JISX0213String.length("\u69E2"), 1);
        assertTrue(JISX0213String.isValid("\u6A30"));	// 樰
        assertEquals(JISX0213String.length("\u6A30"), 1);
        assertTrue(JISX0213String.isValid("\u6A46"));	// 橆
        assertEquals(JISX0213String.length("\u6A46"), 1);
        assertTrue(JISX0213String.isValid("\u6A73"));	// 橳
        assertEquals(JISX0213String.length("\u6A73"), 1);
        assertTrue(JISX0213String.isValid("\u6A7E"));	// 橾
        assertEquals(JISX0213String.length("\u6A7E"), 1);
        assertTrue(JISX0213String.isValid("\u6AE4"));	// 櫤
        assertEquals(JISX0213String.length("\u6AE4"), 1);
        assertTrue(JISX0213String.isValid("\u6BD6"));	// 毖
        assertEquals(JISX0213String.length("\u6BD6"), 1);
        assertTrue(JISX0213String.isValid("\u6C3F"));	// 氿
        assertEquals(JISX0213String.length("\u6C3F"), 1);
        assertTrue(JISX0213String.isValid("\u6C5C"));	// 汜
        assertEquals(JISX0213String.length("\u6C5C"), 1);
        assertTrue(JISX0213String.isValid("\u6C86"));	// 沆
        assertEquals(JISX0213String.length("\u6C86"), 1);
        assertTrue(JISX0213String.isValid("\u6CDA"));	// 泚
        assertEquals(JISX0213String.length("\u6CDA"), 1);
        assertTrue(JISX0213String.isValid("\u6D04"));	// 洄
        assertEquals(JISX0213String.length("\u6D04"), 1);
        assertTrue(JISX0213String.isValid("\u6D87"));	// 涇
        assertEquals(JISX0213String.length("\u6D87"), 1);
        assertTrue(JISX0213String.isValid("\u6DAC"));	// 涬
        assertEquals(JISX0213String.length("\u6DAC"), 1);
        assertTrue(JISX0213String.isValid("\u6DCF"));	// 淏
        assertEquals(JISX0213String.length("\u6DCF"), 1);
        assertTrue(JISX0213String.isValid("\u6DFC"));	// 淼
        assertEquals(JISX0213String.length("\u6DFC"), 1);
        assertTrue(JISX0213String.isValid("\u6E27"));	// 渧
        assertEquals(JISX0213String.length("\u6E27"), 1);
        assertTrue(JISX0213String.isValid("\u6E3C"));	// 渼
        assertEquals(JISX0213String.length("\u6E3C"), 1);
        assertTrue(JISX0213String.isValid("\u6E5C"));	// 湜
        assertEquals(JISX0213String.length("\u6E5C"), 1);
        assertTrue(JISX0213String.isValid("\u6EBF"));	// 溿
        assertEquals(JISX0213String.length("\u6EBF"), 1);
        assertTrue(JISX0213String.isValid("\u6F88"));	// 澈
        assertEquals(JISX0213String.length("\u6F88"), 1);
        assertTrue(JISX0213String.isValid("\u6FB5"));	// 澵
        assertEquals(JISX0213String.length("\u6FB5"), 1);
        assertTrue(JISX0213String.isValid("\u6FF5"));	// 濵
        assertEquals(JISX0213String.length("\u6FF5"), 1);
        assertTrue(JISX0213String.isValid("\u7005"));	// 瀅
        assertEquals(JISX0213String.length("\u7005"), 1);
        assertTrue(JISX0213String.isValid("\u7007"));	// 瀇
        assertEquals(JISX0213String.length("\u7007"), 1);
        assertTrue(JISX0213String.isValid("\u7085"));	// 炅
        assertEquals(JISX0213String.length("\u7085"), 1);
        assertTrue(JISX0213String.isValid("\u70AB"));	// 炫
        assertEquals(JISX0213String.length("\u70AB"), 1);
        assertTrue(JISX0213String.isValid("\u7104"));	// 焄
        assertEquals(JISX0213String.length("\u7104"), 1);
        assertTrue(JISX0213String.isValid("\u710F"));	// 焏
        assertEquals(JISX0213String.length("\u710F"), 1);
        assertTrue(JISX0213String.isValid("\u7146"));	// 煆
        assertEquals(JISX0213String.length("\u7146"), 1);
        assertTrue(JISX0213String.isValid("\u7147"));	// 煇
        assertEquals(JISX0213String.length("\u7147"), 1);
        assertTrue(JISX0213String.isValid("\u715C"));	// 煜
        assertEquals(JISX0213String.length("\u715C"), 1);
        assertTrue(JISX0213String.isValid("\u71C1"));	// 燁
        assertEquals(JISX0213String.length("\u71C1"), 1);
        assertTrue(JISX0213String.isValid("\u71FE"));	// 燾
        assertEquals(JISX0213String.length("\u71FE"), 1);
        assertTrue(JISX0213String.isValid("\u72B1"));	// 犱
        assertEquals(JISX0213String.length("\u72B1"), 1);
        assertTrue(JISX0213String.isValid("\u72BE"));	// 犾
        assertEquals(JISX0213String.length("\u72BE"), 1);
        assertTrue(JISX0213String.isValid("\u7377"));	// 獷
        assertEquals(JISX0213String.length("\u7377"), 1);
        assertTrue(JISX0213String.isValid("\u73C9"));	// 珉
        assertEquals(JISX0213String.length("\u73C9"), 1);
        assertTrue(JISX0213String.isValid("\u73D6"));	// 珖
        assertEquals(JISX0213String.length("\u73D6"), 1);
        assertTrue(JISX0213String.isValid("\u73E3"));	// 珣
        assertEquals(JISX0213String.length("\u73E3"), 1);
        assertTrue(JISX0213String.isValid("\u7407"));	// 琇
        assertEquals(JISX0213String.length("\u7407"), 1);
        assertTrue(JISX0213String.isValid("\u7426"));	// 琦
        assertEquals(JISX0213String.length("\u7426"), 1);
        assertTrue(JISX0213String.isValid("\u742A"));	// 琪
        assertEquals(JISX0213String.length("\u742A"), 1);
        assertTrue(JISX0213String.isValid("\u742E"));	// 琮
        assertEquals(JISX0213String.length("\u742E"), 1);
        assertTrue(JISX0213String.isValid("\u7462"));	// 瑢
        assertEquals(JISX0213String.length("\u7462"), 1);
        assertTrue(JISX0213String.isValid("\u7489"));	// 璉
        assertEquals(JISX0213String.length("\u7489"), 1);
        assertTrue(JISX0213String.isValid("\u749F"));	// 璟
        assertEquals(JISX0213String.length("\u749F"), 1);
        assertTrue(JISX0213String.isValid("\u752F"));	// 甯
        assertEquals(JISX0213String.length("\u752F"), 1);
        assertTrue(JISX0213String.isValid("\u756F"));	// 畯
        assertEquals(JISX0213String.length("\u756F"), 1);
        assertTrue(JISX0213String.isValid("\u769B"));	// 皛
        assertEquals(JISX0213String.length("\u769B"), 1);
        assertTrue(JISX0213String.isValid("\u769C"));	// 皜
        assertEquals(JISX0213String.length("\u769C"), 1);
        assertTrue(JISX0213String.isValid("\u76A6"));	// 皦
        assertEquals(JISX0213String.length("\u76A6"), 1);
        assertTrue(JISX0213String.isValid("\u7746"));	// 睆
        assertEquals(JISX0213String.length("\u7746"), 1);
        assertTrue(JISX0213String.isValid("\u7821"));	// 砡
        assertEquals(JISX0213String.length("\u7821"), 1);
        assertTrue(JISX0213String.isValid("\u784E"));	// 硎
        assertEquals(JISX0213String.length("\u784E"), 1);
        assertTrue(JISX0213String.isValid("\u7864"));	// 硤
        assertEquals(JISX0213String.length("\u7864"), 1);
        assertTrue(JISX0213String.isValid("\u7994"));	// 禔
        assertEquals(JISX0213String.length("\u7994"), 1);
        assertTrue(JISX0213String.isValid("\u799B"));	// 禛
        assertEquals(JISX0213String.length("\u799B"), 1);
        assertTrue(JISX0213String.isValid("\u7AD1"));	// 竑
        assertEquals(JISX0213String.length("\u7AD1"), 1);
        assertTrue(JISX0213String.isValid("\u7AEB"));	// 竫
        assertEquals(JISX0213String.length("\u7AEB"), 1);
        assertTrue(JISX0213String.isValid("\u7B9E"));	// 箞
        assertEquals(JISX0213String.length("\u7B9E"), 1);
        assertTrue(JISX0213String.isValid("\u7D48"));	// 絈
        assertEquals(JISX0213String.length("\u7D48"), 1);
        assertTrue(JISX0213String.isValid("\u7D5C"));	// 絜
        assertEquals(JISX0213String.length("\u7D5C"), 1);
        assertTrue(JISX0213String.isValid("\u7DB7"));	// 綷
        assertEquals(JISX0213String.length("\u7DB7"), 1);
        assertTrue(JISX0213String.isValid("\u7E52"));	// 繒
        assertEquals(JISX0213String.length("\u7E52"), 1);
        assertTrue(JISX0213String.isValid("\u7E8A"));	// 纊
        assertEquals(JISX0213String.length("\u7E8A"), 1);
        assertTrue(JISX0213String.isValid("\u7F47"));	// 罇
        assertEquals(JISX0213String.length("\u7F47"), 1);
        assertTrue(JISX0213String.isValid("\u8301"));	// 茁
        assertEquals(JISX0213String.length("\u8301"), 1);
        assertTrue(JISX0213String.isValid("\u837F"));	// 荿
        assertEquals(JISX0213String.length("\u837F"), 1);
        assertTrue(JISX0213String.isValid("\u83C7"));	// 菇
        assertEquals(JISX0213String.length("\u83C7"), 1);
        assertTrue(JISX0213String.isValid("\u8448"));	// 葈
        assertEquals(JISX0213String.length("\u8448"), 1);
        assertTrue(JISX0213String.isValid("\u84B4"));	// 蒴
        assertEquals(JISX0213String.length("\u84B4"), 1);
        assertTrue(JISX0213String.isValid("\u84DC"));	// 蓜
        assertEquals(JISX0213String.length("\u84DC"), 1);
        assertTrue(JISX0213String.isValid("\u8553"));	// 蕓
        assertEquals(JISX0213String.length("\u8553"), 1);
        assertTrue(JISX0213String.isValid("\u8559"));	// 蕙
        assertEquals(JISX0213String.length("\u8559"), 1);
        assertTrue(JISX0213String.isValid("\u88F5"));	// 裵
        assertEquals(JISX0213String.length("\u88F5"), 1);
        assertTrue(JISX0213String.isValid("\u891C"));	// 褜
        assertEquals(JISX0213String.length("\u891C"), 1);
        assertTrue(JISX0213String.isValid("\u8A12"));	// 訒
        assertEquals(JISX0213String.length("\u8A12"), 1);
        assertTrue(JISX0213String.isValid("\u8A37"));	// 訷
        assertEquals(JISX0213String.length("\u8A37"), 1);
        assertTrue(JISX0213String.isValid("\u8A79"));	// 詹
        assertEquals(JISX0213String.length("\u8A79"), 1);
        assertTrue(JISX0213String.isValid("\u8AA7"));	// 誧
        assertEquals(JISX0213String.length("\u8AA7"), 1);
        assertTrue(JISX0213String.isValid("\u8ABE"));	// 誾
        assertEquals(JISX0213String.length("\u8ABE"), 1);
        assertTrue(JISX0213String.isValid("\u8ADF"));	// 諟
        assertEquals(JISX0213String.length("\u8ADF"), 1);
        assertTrue(JISX0213String.isValid("\u8AF6"));	// 諶
        assertEquals(JISX0213String.length("\u8AF6"), 1);
        assertTrue(JISX0213String.isValid("\u8CF0"));	// 賰
        assertEquals(JISX0213String.length("\u8CF0"), 1);
        assertTrue(JISX0213String.isValid("\u8D12"));	// 贒
        assertEquals(JISX0213String.length("\u8D12"), 1);
        assertTrue(JISX0213String.isValid("\u9127"));	// 鄧
        assertEquals(JISX0213String.length("\u9127"), 1);
        assertTrue(JISX0213String.isValid("\u91D7"));	// 釗
        assertEquals(JISX0213String.length("\u91D7"), 1);
        assertTrue(JISX0213String.isValid("\u91DA"));	// 釚
        assertEquals(JISX0213String.length("\u91DA"), 1);
        assertTrue(JISX0213String.isValid("\u91E4"));	// 釤
        assertEquals(JISX0213String.length("\u91E4"), 1);
        assertTrue(JISX0213String.isValid("\u91E5"));	// 釥
        assertEquals(JISX0213String.length("\u91E5"), 1);
        assertTrue(JISX0213String.isValid("\u91ED"));	// 釭
        assertEquals(JISX0213String.length("\u91ED"), 1);
        assertTrue(JISX0213String.isValid("\u91EE"));	// 釮
        assertEquals(JISX0213String.length("\u91EE"), 1);
        assertTrue(JISX0213String.isValid("\u920A"));	// 鈊
        assertEquals(JISX0213String.length("\u920A"), 1);
        assertTrue(JISX0213String.isValid("\u9210"));	// 鈐
        assertEquals(JISX0213String.length("\u9210"), 1);
        assertTrue(JISX0213String.isValid("\u9239"));	// 鈹
        assertEquals(JISX0213String.length("\u9239"), 1);
        assertTrue(JISX0213String.isValid("\u923A"));	// 鈺
        assertEquals(JISX0213String.length("\u923A"), 1);
        assertTrue(JISX0213String.isValid("\u923C"));	// 鈼
        assertEquals(JISX0213String.length("\u923C"), 1);
        assertTrue(JISX0213String.isValid("\u9240"));	// 鉀
        assertEquals(JISX0213String.length("\u9240"), 1);
        assertTrue(JISX0213String.isValid("\u924E"));	// 鉎
        assertEquals(JISX0213String.length("\u924E"), 1);
        assertTrue(JISX0213String.isValid("\u9251"));	// 鉑
        assertEquals(JISX0213String.length("\u9251"), 1);
        assertTrue(JISX0213String.isValid("\u9259"));	// 鉙
        assertEquals(JISX0213String.length("\u9259"), 1);
        assertTrue(JISX0213String.isValid("\u9267"));	// 鉧
        assertEquals(JISX0213String.length("\u9267"), 1);
        assertTrue(JISX0213String.isValid("\u9278"));	// 鉸
        assertEquals(JISX0213String.length("\u9278"), 1);
        assertTrue(JISX0213String.isValid("\u9288"));	// 銈
        assertEquals(JISX0213String.length("\u9288"), 1);
        assertTrue(JISX0213String.isValid("\u92A7"));	// 銧
        assertEquals(JISX0213String.length("\u92A7"), 1);
        assertTrue(JISX0213String.isValid("\u92D0"));	// 鋐
        assertEquals(JISX0213String.length("\u92D0"), 1);
        assertTrue(JISX0213String.isValid("\u92D3"));	// 鋓
        assertEquals(JISX0213String.length("\u92D3"), 1);
        assertTrue(JISX0213String.isValid("\u92D7"));	// 鋗
        assertEquals(JISX0213String.length("\u92D7"), 1);
        assertTrue(JISX0213String.isValid("\u92D9"));	// 鋙
        assertEquals(JISX0213String.length("\u92D9"), 1);
        assertTrue(JISX0213String.isValid("\u92E0"));	// 鋠
        assertEquals(JISX0213String.length("\u92E0"), 1);
        assertTrue(JISX0213String.isValid("\u92E7"));	// 鋧
        assertEquals(JISX0213String.length("\u92E7"), 1);
        assertTrue(JISX0213String.isValid("\u92F9"));	// 鋹
        assertEquals(JISX0213String.length("\u92F9"), 1);
        assertTrue(JISX0213String.isValid("\u92FB"));	// 鋻
        assertEquals(JISX0213String.length("\u92FB"), 1);
        assertTrue(JISX0213String.isValid("\u92FF"));	// 鋿
        assertEquals(JISX0213String.length("\u92FF"), 1);
        assertTrue(JISX0213String.isValid("\u9302"));	// 錂
        assertEquals(JISX0213String.length("\u9302"), 1);
        assertTrue(JISX0213String.isValid("\u931D"));	// 錝
        assertEquals(JISX0213String.length("\u931D"), 1);
        assertTrue(JISX0213String.isValid("\u931E"));	// 錞
        assertEquals(JISX0213String.length("\u931E"), 1);
        assertTrue(JISX0213String.isValid("\u9321"));	// 錡
        assertEquals(JISX0213String.length("\u9321"), 1);
        assertTrue(JISX0213String.isValid("\u9325"));	// 錥
        assertEquals(JISX0213String.length("\u9325"), 1);
        assertTrue(JISX0213String.isValid("\u9348"));	// 鍈
        assertEquals(JISX0213String.length("\u9348"), 1);
        assertTrue(JISX0213String.isValid("\u9357"));	// 鍗
        assertEquals(JISX0213String.length("\u9357"), 1);
        assertTrue(JISX0213String.isValid("\u9370"));	// 鍰
        assertEquals(JISX0213String.length("\u9370"), 1);
        assertTrue(JISX0213String.isValid("\u93C6"));	// 鏆
        assertEquals(JISX0213String.length("\u93C6"), 1);
        assertTrue(JISX0213String.isValid("\u93DE"));	// 鏞
        assertEquals(JISX0213String.length("\u93DE"), 1);
        assertTrue(JISX0213String.isValid("\u9445"));	// 鑅
        assertEquals(JISX0213String.length("\u9445"), 1);
        assertTrue(JISX0213String.isValid("\u969D"));	// 隝
        assertEquals(JISX0213String.length("\u969D"), 1);
        assertTrue(JISX0213String.isValid("\u96AF"));	// 隯
        assertEquals(JISX0213String.length("\u96AF"), 1);
        assertTrue(JISX0213String.isValid("\u9733"));	// 霳
        assertEquals(JISX0213String.length("\u9733"), 1);
        assertTrue(JISX0213String.isValid("\u974F"));	// 靏
        assertEquals(JISX0213String.length("\u974F"), 1);
        assertTrue(JISX0213String.isValid("\u9755"));	// 靕
        assertEquals(JISX0213String.length("\u9755"), 1);
        assertTrue(JISX0213String.isValid("\u9857"));	// 顗
        assertEquals(JISX0213String.length("\u9857"), 1);
        assertTrue(JISX0213String.isValid("\u9865"));	// 顥
        assertEquals(JISX0213String.length("\u9865"), 1);
        assertTrue(JISX0213String.isValid("\u9A4E"));	// 驎
        assertEquals(JISX0213String.length("\u9A4E"), 1);
        assertTrue(JISX0213String.isValid("\u9ADC"));	// 髜
        assertEquals(JISX0213String.length("\u9ADC"), 1);
        assertTrue(JISX0213String.isValid("\u9B75"));	// 魵
        assertEquals(JISX0213String.length("\u9B75"), 1);
        assertTrue(JISX0213String.isValid("\u9B8F"));	// 鮏
        assertEquals(JISX0213String.length("\u9B8F"), 1);
        assertTrue(JISX0213String.isValid("\u9BB1"));	// 鮱
        assertEquals(JISX0213String.length("\u9BB1"), 1);
        assertTrue(JISX0213String.isValid("\u9C00"));	// 鰀
        assertEquals(JISX0213String.length("\u9C00"), 1);
        assertTrue(JISX0213String.isValid("\u9D6B"));	// 鵫
        assertEquals(JISX0213String.length("\u9D6B"), 1);
        assertTrue(JISX0213String.isValid("\u9D70"));	// 鵰
        assertEquals(JISX0213String.length("\u9D70"), 1);
        assertTrue(JISX0213String.isValid("\u9E19"));	// 鸙
        assertEquals(JISX0213String.length("\u9E19"), 1);
    }

    @Test
    void testJISx0212ContaindInJISX0213AndNotContainedInMS932() {
        assertTrue(JISX0213String.isValid("\u4E02"));	// 丂
        assertEquals(JISX0213String.length("\u4E02"), 1);
        assertTrue(JISX0213String.isValid("\u4E12"));	// 丒
        assertEquals(JISX0213String.length("\u4E12"), 1);
        assertTrue(JISX0213String.isValid("\u4E2B"));	// 丫
        assertEquals(JISX0213String.length("\u4E2B"), 1);
        assertTrue(JISX0213String.isValid("\u4E2E"));	// 丮
        assertEquals(JISX0213String.length("\u4E2E"), 1);
        assertTrue(JISX0213String.isValid("\u4E2F"));	// 丯
        assertEquals(JISX0213String.length("\u4E2F"), 1);
        assertTrue(JISX0213String.isValid("\u4E30"));	// 丰
        assertEquals(JISX0213String.length("\u4E30"), 1);
        assertTrue(JISX0213String.isValid("\u4E40"));	// 乀
        assertEquals(JISX0213String.length("\u4E40"), 1);
        assertTrue(JISX0213String.isValid("\u4E47"));	// 乇
        assertEquals(JISX0213String.length("\u4E47"), 1);
        assertTrue(JISX0213String.isValid("\u4E51"));	// 乑
        assertEquals(JISX0213String.length("\u4E51"), 1);
        assertTrue(JISX0213String.isValid("\u4E5A"));	// 乚
        assertEquals(JISX0213String.length("\u4E5A"), 1);
        assertTrue(JISX0213String.isValid("\u4E69"));	// 乩
        assertEquals(JISX0213String.length("\u4E69"), 1);
        assertTrue(JISX0213String.isValid("\u4E8D"));	// 亍
        assertEquals(JISX0213String.length("\u4E8D"), 1);
        assertTrue(JISX0213String.isValid("\u4E9D"));	// 亝
        assertEquals(JISX0213String.length("\u4E9D"), 1);
        assertTrue(JISX0213String.isValid("\u4EB9"));	// 亹
        assertEquals(JISX0213String.length("\u4EB9"), 1);
        assertTrue(JISX0213String.isValid("\u4EC3"));	// 仃
        assertEquals(JISX0213String.length("\u4EC3"), 1);
        assertTrue(JISX0213String.isValid("\u4ED0"));	// 仐
        assertEquals(JISX0213String.length("\u4ED0"), 1);
        assertTrue(JISX0213String.isValid("\u4EDA"));	// 仚
        assertEquals(JISX0213String.length("\u4EDA"), 1);
        assertTrue(JISX0213String.isValid("\u4EF1"));	// 仱
        assertEquals(JISX0213String.length("\u4EF1"), 1);
        assertTrue(JISX0213String.isValid("\u4EF5"));	// 仵
        assertEquals(JISX0213String.length("\u4EF5"), 1);
        assertTrue(JISX0213String.isValid("\u4EFD"));	// 份
        assertEquals(JISX0213String.length("\u4EFD"), 1);
        assertTrue(JISX0213String.isValid("\u4EFF"));	// 仿
        assertEquals(JISX0213String.length("\u4EFF"), 1);
        assertTrue(JISX0213String.isValid("\u4F0B"));	// 伋
        assertEquals(JISX0213String.length("\u4F0B"), 1);
        assertTrue(JISX0213String.isValid("\u4F16"));	// 伖
        assertEquals(JISX0213String.length("\u4F16"), 1);
        assertTrue(JISX0213String.isValid("\u4F60"));	// 你
        assertEquals(JISX0213String.length("\u4F60"), 1);
        assertTrue(JISX0213String.isValid("\u4F37"));	// 伷
        assertEquals(JISX0213String.length("\u4F37"), 1);
        assertTrue(JISX0213String.isValid("\u4F3E"));	// 伾
        assertEquals(JISX0213String.length("\u4F3E"), 1);
        assertTrue(JISX0213String.isValid("\u4F48"));	// 佈
        assertEquals(JISX0213String.length("\u4F48"), 1);
        assertTrue(JISX0213String.isValid("\u4F49"));	// 佉
        assertEquals(JISX0213String.length("\u4F49"), 1);
        assertTrue(JISX0213String.isValid("\u4F54"));	// 佔
        assertEquals(JISX0213String.length("\u4F54"), 1);
        assertTrue(JISX0213String.isValid("\u4F58"));	// 佘
        assertEquals(JISX0213String.length("\u4F58"), 1);
        assertTrue(JISX0213String.isValid("\u4F5F"));	// 佟
        assertEquals(JISX0213String.length("\u4F5F"), 1);
        assertTrue(JISX0213String.isValid("\u4F6A"));	// 佪
        assertEquals(JISX0213String.length("\u4F6A"), 1);
        assertTrue(JISX0213String.isValid("\u4F6C"));	// 佬
        assertEquals(JISX0213String.length("\u4F6C"), 1);
        assertTrue(JISX0213String.isValid("\u4F77"));	// 佷
        assertEquals(JISX0213String.length("\u4F77"), 1);
        assertTrue(JISX0213String.isValid("\u4F78"));	// 佸
        assertEquals(JISX0213String.length("\u4F78"), 1);
        assertTrue(JISX0213String.isValid("\u4F7A"));	// 佺
        assertEquals(JISX0213String.length("\u4F7A"), 1);
        assertTrue(JISX0213String.isValid("\u4F7D"));	// 佽
        assertEquals(JISX0213String.length("\u4F7D"), 1);
        assertTrue(JISX0213String.isValid("\u4F7E"));	// 佾
        assertEquals(JISX0213String.length("\u4F7E"), 1);
        assertTrue(JISX0213String.isValid("\u4F82"));	// 侂
        assertEquals(JISX0213String.length("\u4F82"), 1);
        assertTrue(JISX0213String.isValid("\u4F85"));	// 侅
        assertEquals(JISX0213String.length("\u4F85"), 1);
        assertTrue(JISX0213String.isValid("\u4F97"));	// 侗
        assertEquals(JISX0213String.length("\u4F97"), 1);
        assertTrue(JISX0213String.isValid("\u4FB2"));	// 侲
        assertEquals(JISX0213String.length("\u4FB2"), 1);
        assertTrue(JISX0213String.isValid("\u4FBE"));	// 侾
        assertEquals(JISX0213String.length("\u4FBE"), 1);
        assertTrue(JISX0213String.isValid("\u4FC5"));	// 俅
        assertEquals(JISX0213String.length("\u4FC5"), 1);
        assertTrue(JISX0213String.isValid("\u4FCB"));	// 俋
        assertEquals(JISX0213String.length("\u4FCB"), 1);
        assertTrue(JISX0213String.isValid("\u4FCF"));	// 俏
        assertEquals(JISX0213String.length("\u4FCF"), 1);
        assertTrue(JISX0213String.isValid("\u4FD2"));	// 俒
        assertEquals(JISX0213String.length("\u4FD2"), 1);
        assertTrue(JISX0213String.isValid("\u4FE0"));	// 俠
        assertEquals(JISX0213String.length("\u4FE0"), 1);
        assertTrue(JISX0213String.isValid("\u4FF2"));	// 俲
        assertEquals(JISX0213String.length("\u4FF2"), 1);
        assertTrue(JISX0213String.isValid("\u5000"));	// 倀
        assertEquals(JISX0213String.length("\u5000"), 1);
        assertTrue(JISX0213String.isValid("\u5001"));	// 倁
        assertEquals(JISX0213String.length("\u5001"), 1);
        assertTrue(JISX0213String.isValid("\u500E"));	// 倎
        assertEquals(JISX0213String.length("\u500E"), 1);
        assertTrue(JISX0213String.isValid("\u5010"));	// 倐
        assertEquals(JISX0213String.length("\u5010"), 1);
        assertTrue(JISX0213String.isValid("\u5013"));	// 倓
        assertEquals(JISX0213String.length("\u5013"), 1);
        assertTrue(JISX0213String.isValid("\u5018"));	// 倘
        assertEquals(JISX0213String.length("\u5018"), 1);
        assertTrue(JISX0213String.isValid("\u501C"));	// 倜
        assertEquals(JISX0213String.length("\u501C"), 1);
        assertTrue(JISX0213String.isValid("\u5027"));	// 倧
        assertEquals(JISX0213String.length("\u5027"), 1);
        assertTrue(JISX0213String.isValid("\u502E"));	// 倮
        assertEquals(JISX0213String.length("\u502E"), 1);
        assertTrue(JISX0213String.isValid("\u5041"));	// 偁
        assertEquals(JISX0213String.length("\u5041"), 1);
        assertTrue(JISX0213String.isValid("\u504E"));	// 偎
        assertEquals(JISX0213String.length("\u504E"), 1);
        assertTrue(JISX0213String.isValid("\u5053"));	// 偓
        assertEquals(JISX0213String.length("\u5053"), 1);
        assertTrue(JISX0213String.isValid("\u5057"));	// 偗
        assertEquals(JISX0213String.length("\u5057"), 1);
        assertTrue(JISX0213String.isValid("\u5063"));	// 偣
        assertEquals(JISX0213String.length("\u5063"), 1);
        assertTrue(JISX0213String.isValid("\u5066"));	// 偦
        assertEquals(JISX0213String.length("\u5066"), 1);
        assertTrue(JISX0213String.isValid("\u506A"));	// 偪
        assertEquals(JISX0213String.length("\u506A"), 1);
        assertTrue(JISX0213String.isValid("\u503B"));	// 倻
        assertEquals(JISX0213String.length("\u503B"), 1);
        assertTrue(JISX0213String.isValid("\u5092"));	// 傒
        assertEquals(JISX0213String.length("\u5092"), 1);
        assertTrue(JISX0213String.isValid("\u5093"));	// 傓
        assertEquals(JISX0213String.length("\u5093"), 1);
        assertTrue(JISX0213String.isValid("\u5096"));	// 傖
        assertEquals(JISX0213String.length("\u5096"), 1);
        assertTrue(JISX0213String.isValid("\u509C"));	// 傜
        assertEquals(JISX0213String.length("\u509C"), 1);
        assertTrue(JISX0213String.isValid("\u50AA"));	// 傪
        assertEquals(JISX0213String.length("\u50AA"), 1);
        assertTrue(JISX0213String.isValid("\u50BA"));	// 傺
        assertEquals(JISX0213String.length("\u50BA"), 1);
        assertTrue(JISX0213String.isValid("\u50C4"));	// 僄
        assertEquals(JISX0213String.length("\u50C4"), 1);
        assertTrue(JISX0213String.isValid("\u50C7"));	// 僇
        assertEquals(JISX0213String.length("\u50C7"), 1);
        assertTrue(JISX0213String.isValid("\u50CC"));	// 僌
        assertEquals(JISX0213String.length("\u50CC"), 1);
        assertTrue(JISX0213String.isValid("\u50CE"));	// 僎
        assertEquals(JISX0213String.length("\u50CE"), 1);
        assertTrue(JISX0213String.isValid("\u50D0"));	// 僐
        assertEquals(JISX0213String.length("\u50D0"), 1);
        assertTrue(JISX0213String.isValid("\u50D4"));	// 僔
        assertEquals(JISX0213String.length("\u50D4"), 1);
        assertTrue(JISX0213String.isValid("\u50E6"));	// 僦
        assertEquals(JISX0213String.length("\u50E6"), 1);
        assertTrue(JISX0213String.isValid("\u50E9"));	// 僩
        assertEquals(JISX0213String.length("\u50E9"), 1);
        assertTrue(JISX0213String.isValid("\u5103"));	// 儃
        assertEquals(JISX0213String.length("\u5103"), 1);
        assertTrue(JISX0213String.isValid("\u5106"));	// 儆
        assertEquals(JISX0213String.length("\u5106"), 1);
        assertTrue(JISX0213String.isValid("\u5108"));	// 儈
        assertEquals(JISX0213String.length("\u5108"), 1);
        assertTrue(JISX0213String.isValid("\u510B"));	// 儋
        assertEquals(JISX0213String.length("\u510B"), 1);
        assertTrue(JISX0213String.isValid("\u50F2"));	// 僲
        assertEquals(JISX0213String.length("\u50F2"), 1);
        assertTrue(JISX0213String.isValid("\u5117"));	// 儗
        assertEquals(JISX0213String.length("\u5117"), 1);
        assertTrue(JISX0213String.isValid("\u511B"));	// 儛
        assertEquals(JISX0213String.length("\u511B"), 1);
        assertTrue(JISX0213String.isValid("\u511E"));	// 儞
        assertEquals(JISX0213String.length("\u511E"), 1);
        assertTrue(JISX0213String.isValid("\u5135"));	// 儵
        assertEquals(JISX0213String.length("\u5135"), 1);
        assertTrue(JISX0213String.isValid("\u5155"));	// 兕
        assertEquals(JISX0213String.length("\u5155"), 1);
        assertTrue(JISX0213String.isValid("\u5157"));	// 兗
        assertEquals(JISX0213String.length("\u5157"), 1);
        assertTrue(JISX0213String.isValid("\u5183"));	// 冃
        assertEquals(JISX0213String.length("\u5183"), 1);
        assertTrue(JISX0213String.isValid("\u518B"));	// 冋
        assertEquals(JISX0213String.length("\u518B"), 1);
        assertTrue(JISX0213String.isValid("\u5198"));	// 冘
        assertEquals(JISX0213String.length("\u5198"), 1);
        assertTrue(JISX0213String.isValid("\u51A3"));	// 冣
        assertEquals(JISX0213String.length("\u51A3"), 1);
        assertTrue(JISX0213String.isValid("\u51AD"));	// 冭
        assertEquals(JISX0213String.length("\u51AD"), 1);
        assertTrue(JISX0213String.isValid("\u51BC"));	// 冼
        assertEquals(JISX0213String.length("\u51BC"), 1);
        assertTrue(JISX0213String.isValid("\u51DE"));	// 凞
        assertEquals(JISX0213String.length("\u51DE"), 1);
        assertTrue(JISX0213String.isValid("\u51E2"));	// 凢
        assertEquals(JISX0213String.length("\u51E2"), 1);
        assertTrue(JISX0213String.isValid("\u51EE"));	// 凮
        assertEquals(JISX0213String.length("\u51EE"), 1);
        assertTrue(JISX0213String.isValid("\u51F3"));	// 凳
        assertEquals(JISX0213String.length("\u51F3"), 1);
        assertTrue(JISX0213String.isValid("\u51F4"));	// 凴
        assertEquals(JISX0213String.length("\u51F4"), 1);
        assertTrue(JISX0213String.isValid("\u5201"));	// 刁
        assertEquals(JISX0213String.length("\u5201"), 1);
        assertTrue(JISX0213String.isValid("\u5202"));	// 刂
        assertEquals(JISX0213String.length("\u5202"), 1);
        assertTrue(JISX0213String.isValid("\u5212"));	// 划
        assertEquals(JISX0213String.length("\u5212"), 1);
        assertTrue(JISX0213String.isValid("\u5213"));	// 刓
        assertEquals(JISX0213String.length("\u5213"), 1);
        assertTrue(JISX0213String.isValid("\u5216"));	// 刖
        assertEquals(JISX0213String.length("\u5216"), 1);
        assertTrue(JISX0213String.isValid("\u5249"));	// 剉
        assertEquals(JISX0213String.length("\u5249"), 1);
        assertTrue(JISX0213String.isValid("\u5255"));	// 剕
        assertEquals(JISX0213String.length("\u5255"), 1);
        assertTrue(JISX0213String.isValid("\u5257"));	// 剗
        assertEquals(JISX0213String.length("\u5257"), 1);
        assertTrue(JISX0213String.isValid("\u525C"));	// 剜
        assertEquals(JISX0213String.length("\u525C"), 1);
        assertTrue(JISX0213String.isValid("\u5261"));	// 剡
        assertEquals(JISX0213String.length("\u5261"), 1);
        assertTrue(JISX0213String.isValid("\u5277"));	// 剷
        assertEquals(JISX0213String.length("\u5277"), 1);
        assertTrue(JISX0213String.isValid("\u5282"));	// 劂
        assertEquals(JISX0213String.length("\u5282"), 1);
        assertTrue(JISX0213String.isValid("\u5293"));	// 劓
        assertEquals(JISX0213String.length("\u5293"), 1);
        assertTrue(JISX0213String.isValid("\u5298"));	// 劘
        assertEquals(JISX0213String.length("\u5298"), 1);
        assertTrue(JISX0213String.isValid("\u52A4"));	// 劤
        assertEquals(JISX0213String.length("\u52A4"), 1);
        assertTrue(JISX0213String.isValid("\u52BA"));	// 劺
        assertEquals(JISX0213String.length("\u52BA"), 1);
        assertTrue(JISX0213String.isValid("\u52BB"));	// 劻
        assertEquals(JISX0213String.length("\u52BB"), 1);
        assertTrue(JISX0213String.isValid("\u52C8"));	// 勈
        assertEquals(JISX0213String.length("\u52C8"), 1);
        assertTrue(JISX0213String.isValid("\u52CC"));	// 勌
        assertEquals(JISX0213String.length("\u52CC"), 1);
        assertTrue(JISX0213String.isValid("\u52D1"));	// 勑
        assertEquals(JISX0213String.length("\u52D1"), 1);
        assertTrue(JISX0213String.isValid("\u52D6"));	// 勖
        assertEquals(JISX0213String.length("\u52D6"), 1);
        assertTrue(JISX0213String.isValid("\u52F0"));	// 勰
        assertEquals(JISX0213String.length("\u52F0"), 1);
        assertTrue(JISX0213String.isValid("\u52F7"));	// 勷
        assertEquals(JISX0213String.length("\u52F7"), 1);
        assertTrue(JISX0213String.isValid("\u530A"));	// 匊
        assertEquals(JISX0213String.length("\u530A"), 1);
        assertTrue(JISX0213String.isValid("\u530B"));	// 匋
        assertEquals(JISX0213String.length("\u530B"), 1);
        assertTrue(JISX0213String.isValid("\u531C"));	// 匜
        assertEquals(JISX0213String.length("\u531C"), 1);
        assertTrue(JISX0213String.isValid("\u5335"));	// 匵
        assertEquals(JISX0213String.length("\u5335"), 1);
        assertTrue(JISX0213String.isValid("\u533E"));	// 匾
        assertEquals(JISX0213String.length("\u533E"), 1);
        assertTrue(JISX0213String.isValid("\u5342"));	// 卂
        assertEquals(JISX0213String.length("\u5342"), 1);
        assertTrue(JISX0213String.isValid("\u5361"));	// 卡
        assertEquals(JISX0213String.length("\u5361"), 1);
        assertTrue(JISX0213String.isValid("\u5363"));	// 卣
        assertEquals(JISX0213String.length("\u5363"), 1);
        assertTrue(JISX0213String.isValid("\u536C"));	// 卬
        assertEquals(JISX0213String.length("\u536C"), 1);
        assertTrue(JISX0213String.isValid("\u539D"));	// 厝
        assertEquals(JISX0213String.length("\u539D"), 1);
        assertTrue(JISX0213String.isValid("\u53A4"));	// 厤
        assertEquals(JISX0213String.length("\u53A4"), 1);
        assertTrue(JISX0213String.isValid("\u53B4"));	// 厴
        assertEquals(JISX0213String.length("\u53B4"), 1);
        assertTrue(JISX0213String.isValid("\u53B7"));	// 厷
        assertEquals(JISX0213String.length("\u53B7"), 1);
        assertTrue(JISX0213String.isValid("\u53C0"));	// 叀
        assertEquals(JISX0213String.length("\u53C0"), 1);
        assertTrue(JISX0213String.isValid("\u53D5"));	// 叕
        assertEquals(JISX0213String.length("\u53D5"), 1);
        assertTrue(JISX0213String.isValid("\u53DA"));	// 叚
        assertEquals(JISX0213String.length("\u53DA"), 1);
        assertTrue(JISX0213String.isValid("\u53F5"));	// 叵
        assertEquals(JISX0213String.length("\u53F5"), 1);
        assertTrue(JISX0213String.isValid("\u5427"));	// 吧
        assertEquals(JISX0213String.length("\u5427"), 1);
        assertTrue(JISX0213String.isValid("\u5428"));	// 吨
        assertEquals(JISX0213String.length("\u5428"), 1);
        assertTrue(JISX0213String.isValid("\u5443"));	// 呃
        assertEquals(JISX0213String.length("\u5443"), 1);
        assertTrue(JISX0213String.isValid("\u544D"));	// 呍
        assertEquals(JISX0213String.length("\u544D"), 1);
        assertTrue(JISX0213String.isValid("\u5462"));	// 呢
        assertEquals(JISX0213String.length("\u5462"), 1);
        assertTrue(JISX0213String.isValid("\u5466"));	// 呦
        assertEquals(JISX0213String.length("\u5466"), 1);
        assertTrue(JISX0213String.isValid("\u546B"));	// 呫
        assertEquals(JISX0213String.length("\u546B"), 1);
        assertTrue(JISX0213String.isValid("\u5474"));	// 呴
        assertEquals(JISX0213String.length("\u5474"), 1);
        assertTrue(JISX0213String.isValid("\u547F"));	// 呿
        assertEquals(JISX0213String.length("\u547F"), 1);
        assertTrue(JISX0213String.isValid("\u5488"));	// 咈
        assertEquals(JISX0213String.length("\u5488"), 1);
        assertTrue(JISX0213String.isValid("\u548D"));	// 咍
        assertEquals(JISX0213String.length("\u548D"), 1);
        assertTrue(JISX0213String.isValid("\u5495"));	// 咕
        assertEquals(JISX0213String.length("\u5495"), 1);
        assertTrue(JISX0213String.isValid("\u5496"));	// 咖
        assertEquals(JISX0213String.length("\u5496"), 1);
        assertTrue(JISX0213String.isValid("\u54A1"));	// 咡
        assertEquals(JISX0213String.length("\u54A1"), 1);
        assertTrue(JISX0213String.isValid("\u54A6"));	// 咦
        assertEquals(JISX0213String.length("\u54A6"), 1);
        assertTrue(JISX0213String.isValid("\u54AD"));	// 咭
        assertEquals(JISX0213String.length("\u54AD"), 1);
        assertTrue(JISX0213String.isValid("\u54AE"));	// 咮
        assertEquals(JISX0213String.length("\u54AE"), 1);
        assertTrue(JISX0213String.isValid("\u54B7"));	// 咷
        assertEquals(JISX0213String.length("\u54B7"), 1);
        assertTrue(JISX0213String.isValid("\u54BA"));	// 咺
        assertEquals(JISX0213String.length("\u54BA"), 1);
        assertTrue(JISX0213String.isValid("\u54BF"));	// 咿
        assertEquals(JISX0213String.length("\u54BF"), 1);
        assertTrue(JISX0213String.isValid("\u54C6"));	// 哆
        assertEquals(JISX0213String.length("\u54C6"), 1);
        assertTrue(JISX0213String.isValid("\u54EC"));	// 哬
        assertEquals(JISX0213String.length("\u54EC"), 1);
        assertTrue(JISX0213String.isValid("\u54EF"));	// 哯
        assertEquals(JISX0213String.length("\u54EF"), 1);
        assertTrue(JISX0213String.isValid("\u5500"));	// 唀
        assertEquals(JISX0213String.length("\u5500"), 1);
        assertTrue(JISX0213String.isValid("\u5501"));	// 唁
        assertEquals(JISX0213String.length("\u5501"), 1);
        assertTrue(JISX0213String.isValid("\u5509"));	// 唉
        assertEquals(JISX0213String.length("\u5509"), 1);
        assertTrue(JISX0213String.isValid("\u550E"));	// 唎
        assertEquals(JISX0213String.length("\u550E"), 1);
        assertTrue(JISX0213String.isValid("\u552B"));	// 唫
        assertEquals(JISX0213String.length("\u552B"), 1);
        assertTrue(JISX0213String.isValid("\u5535"));	// 唵
        assertEquals(JISX0213String.length("\u5535"), 1);
        assertTrue(JISX0213String.isValid("\u553C"));	// 唼
        assertEquals(JISX0213String.length("\u553C"), 1);
        assertTrue(JISX0213String.isValid("\u5541"));	// 啁
        assertEquals(JISX0213String.length("\u5541"), 1);
        assertTrue(JISX0213String.isValid("\u5547"));	// 啇
        assertEquals(JISX0213String.length("\u5547"), 1);
        assertTrue(JISX0213String.isValid("\u554A"));	// 啊
        assertEquals(JISX0213String.length("\u554A"), 1);
        assertTrue(JISX0213String.isValid("\u5550"));	// 啐
        assertEquals(JISX0213String.length("\u5550"), 1);
        assertTrue(JISX0213String.isValid("\u555E"));	// 啞
        assertEquals(JISX0213String.length("\u555E"), 1);
        assertTrue(JISX0213String.isValid("\u5560"));	// 啠
        assertEquals(JISX0213String.length("\u5560"), 1);
        assertTrue(JISX0213String.isValid("\u5561"));	// 啡
        assertEquals(JISX0213String.length("\u5561"), 1);
        assertTrue(JISX0213String.isValid("\u5564"));	// 啤
        assertEquals(JISX0213String.length("\u5564"), 1);
        assertTrue(JISX0213String.isValid("\u5581"));	// 喁
        assertEquals(JISX0213String.length("\u5581"), 1);
        assertTrue(JISX0213String.isValid("\u5582"));	// 喂
        assertEquals(JISX0213String.length("\u5582"), 1);
        assertTrue(JISX0213String.isValid("\u5588"));	// 喈
        assertEquals(JISX0213String.length("\u5588"), 1);
        assertTrue(JISX0213String.isValid("\u558E"));	// 喎
        assertEquals(JISX0213String.length("\u558E"), 1);
        assertTrue(JISX0213String.isValid("\u5591"));	// 喑
        assertEquals(JISX0213String.length("\u5591"), 1);
        assertTrue(JISX0213String.isValid("\u55AD"));	// 喭
        assertEquals(JISX0213String.length("\u55AD"), 1);
        assertTrue(JISX0213String.isValid("\u55BF"));	// 喿
        assertEquals(JISX0213String.length("\u55BF"), 1);
        assertTrue(JISX0213String.isValid("\u55C9"));	// 嗉
        assertEquals(JISX0213String.length("\u55C9"), 1);
        assertTrue(JISX0213String.isValid("\u55CC"));	// 嗌
        assertEquals(JISX0213String.length("\u55CC"), 1);
        assertTrue(JISX0213String.isValid("\u55CE"));	// 嗎
        assertEquals(JISX0213String.length("\u55CE"), 1);
        assertTrue(JISX0213String.isValid("\u55D1"));	// 嗑
        assertEquals(JISX0213String.length("\u55D1"), 1);
        assertTrue(JISX0213String.isValid("\u55D2"));	// 嗒
        assertEquals(JISX0213String.length("\u55D2"), 1);
        assertTrue(JISX0213String.isValid("\u55E2"));	// 嗢
        assertEquals(JISX0213String.length("\u55E2"), 1);
        assertTrue(JISX0213String.isValid("\u55E9"));	// 嗩
        assertEquals(JISX0213String.length("\u55E9"), 1);
        assertTrue(JISX0213String.isValid("\u5608"));	// 嘈
        assertEquals(JISX0213String.length("\u5608"), 1);
        assertTrue(JISX0213String.isValid("\u560E"));	// 嘎
        assertEquals(JISX0213String.length("\u560E"), 1);
        assertTrue(JISX0213String.isValid("\u5610"));	// 嘐
        assertEquals(JISX0213String.length("\u5610"), 1);
        assertTrue(JISX0213String.isValid("\u5630"));	// 嘰
        assertEquals(JISX0213String.length("\u5630"), 1);
        assertTrue(JISX0213String.isValid("\u5637"));	// 嘷
        assertEquals(JISX0213String.length("\u5637"), 1);
        assertTrue(JISX0213String.isValid("\u563B"));	// 嘻
        assertEquals(JISX0213String.length("\u563B"), 1);
        assertTrue(JISX0213String.isValid("\u563D"));	// 嘽
        assertEquals(JISX0213String.length("\u563D"), 1);
        assertTrue(JISX0213String.isValid("\u563F"));	// 嘿
        assertEquals(JISX0213String.length("\u563F"), 1);
        assertTrue(JISX0213String.isValid("\u5640"));	// 噀
        assertEquals(JISX0213String.length("\u5640"), 1);
        assertTrue(JISX0213String.isValid("\u5649"));	// 噉
        assertEquals(JISX0213String.length("\u5649"), 1);
        assertTrue(JISX0213String.isValid("\u565E"));	// 噞
        assertEquals(JISX0213String.length("\u565E"), 1);
        assertTrue(JISX0213String.isValid("\u5660"));	// 噠
        assertEquals(JISX0213String.length("\u5660"), 1);
        assertTrue(JISX0213String.isValid("\u5666"));	// 噦
        assertEquals(JISX0213String.length("\u5666"), 1);
        assertTrue(JISX0213String.isValid("\u566D"));	// 噭
        assertEquals(JISX0213String.length("\u566D"), 1);
        assertTrue(JISX0213String.isValid("\u566F"));	// 噯
        assertEquals(JISX0213String.length("\u566F"), 1);
        assertTrue(JISX0213String.isValid("\u5671"));	// 噱
        assertEquals(JISX0213String.length("\u5671"), 1);
        assertTrue(JISX0213String.isValid("\u5672"));	// 噲
        assertEquals(JISX0213String.length("\u5672"), 1);
        assertTrue(JISX0213String.isValid("\u5688"));	// 嚈
        assertEquals(JISX0213String.length("\u5688"), 1);
        assertTrue(JISX0213String.isValid("\u568C"));	// 嚌
        assertEquals(JISX0213String.length("\u568C"), 1);
        assertTrue(JISX0213String.isValid("\u5695"));	// 嚕
        assertEquals(JISX0213String.length("\u5695"), 1);
        assertTrue(JISX0213String.isValid("\u5699"));	// 嚙
        assertEquals(JISX0213String.length("\u5699"), 1);
        assertTrue(JISX0213String.isValid("\u569A"));	// 嚚
        assertEquals(JISX0213String.length("\u569A"), 1);
        assertTrue(JISX0213String.isValid("\u569D"));	// 嚝
        assertEquals(JISX0213String.length("\u569D"), 1);
        assertTrue(JISX0213String.isValid("\u569E"));	// 嚞
        assertEquals(JISX0213String.length("\u569E"), 1);
        assertTrue(JISX0213String.isValid("\u56A8"));	// 嚨
        assertEquals(JISX0213String.length("\u56A8"), 1);
        assertTrue(JISX0213String.isValid("\u56A9"));	// 嚩
        assertEquals(JISX0213String.length("\u56A9"), 1);
        assertTrue(JISX0213String.isValid("\u56AC"));	// 嚬
        assertEquals(JISX0213String.length("\u56AC"), 1);
        assertTrue(JISX0213String.isValid("\u56AD"));	// 嚭
        assertEquals(JISX0213String.length("\u56AD"), 1);
        assertTrue(JISX0213String.isValid("\u56B3"));	// 嚳
        assertEquals(JISX0213String.length("\u56B3"), 1);
        assertTrue(JISX0213String.isValid("\u56C5"));	// 囅
        assertEquals(JISX0213String.length("\u56C5"), 1);
        assertTrue(JISX0213String.isValid("\u56C9"));	// 囉
        assertEquals(JISX0213String.length("\u56C9"), 1);
        assertTrue(JISX0213String.isValid("\u56CA"));	// 囊
        assertEquals(JISX0213String.length("\u56CA"), 1);
        assertTrue(JISX0213String.isValid("\u56CD"));	// 囍
        assertEquals(JISX0213String.length("\u56CD"), 1);
        assertTrue(JISX0213String.isValid("\u56DF"));	// 囟
        assertEquals(JISX0213String.length("\u56DF"), 1);
        assertTrue(JISX0213String.isValid("\u56E8"));	// 囨
        assertEquals(JISX0213String.length("\u56E8"), 1);
        assertTrue(JISX0213String.isValid("\u56F6"));	// 囶
        assertEquals(JISX0213String.length("\u56F6"), 1);
        assertTrue(JISX0213String.isValid("\u56F7"));	// 囷
        assertEquals(JISX0213String.length("\u56F7"), 1);
        assertTrue(JISX0213String.isValid("\u570A"));	// 圊
        assertEquals(JISX0213String.length("\u570A"), 1);
        assertTrue(JISX0213String.isValid("\u5715"));	// 圕
        assertEquals(JISX0213String.length("\u5715"), 1);
        assertTrue(JISX0213String.isValid("\u5723"));	// 圣
        assertEquals(JISX0213String.length("\u5723"), 1);
        assertTrue(JISX0213String.isValid("\u5729"));	// 圩
        assertEquals(JISX0213String.length("\u5729"), 1);
        assertTrue(JISX0213String.isValid("\u572F"));	// 圯
        assertEquals(JISX0213String.length("\u572F"), 1);
        assertTrue(JISX0213String.isValid("\u5733"));	// 圳
        assertEquals(JISX0213String.length("\u5733"), 1);
        assertTrue(JISX0213String.isValid("\u5734"));	// 圴
        assertEquals(JISX0213String.length("\u5734"), 1);
        assertTrue(JISX0213String.isValid("\u5745"));	// 坅
        assertEquals(JISX0213String.length("\u5745"), 1);
        assertTrue(JISX0213String.isValid("\u5746"));	// 坆
        assertEquals(JISX0213String.length("\u5746"), 1);
        assertTrue(JISX0213String.isValid("\u574C"));	// 坌
        assertEquals(JISX0213String.length("\u574C"), 1);
        assertTrue(JISX0213String.isValid("\u574D"));	// 坍
        assertEquals(JISX0213String.length("\u574D"), 1);
        assertTrue(JISX0213String.isValid("\u5768"));	// 坨
        assertEquals(JISX0213String.length("\u5768"), 1);
        assertTrue(JISX0213String.isValid("\u576F"));	// 坯
        assertEquals(JISX0213String.length("\u576F"), 1);
        assertTrue(JISX0213String.isValid("\u5770"));	// 坰
        assertEquals(JISX0213String.length("\u5770"), 1);
        assertTrue(JISX0213String.isValid("\u5773"));	// 坳
        assertEquals(JISX0213String.length("\u5773"), 1);
        assertTrue(JISX0213String.isValid("\u5774"));	// 坴
        assertEquals(JISX0213String.length("\u5774"), 1);
        assertTrue(JISX0213String.isValid("\u5775"));	// 坵
        assertEquals(JISX0213String.length("\u5775"), 1);
        assertTrue(JISX0213String.isValid("\u5777"));	// 坷
        assertEquals(JISX0213String.length("\u5777"), 1);
        assertTrue(JISX0213String.isValid("\u577B"));	// 坻
        assertEquals(JISX0213String.length("\u577B"), 1);
        assertTrue(JISX0213String.isValid("\u577C"));	// 坼
        assertEquals(JISX0213String.length("\u577C"), 1);
        assertTrue(JISX0213String.isValid("\u579A"));	// 垚
        assertEquals(JISX0213String.length("\u579A"), 1);
        assertTrue(JISX0213String.isValid("\u579C"));	// 垜
        assertEquals(JISX0213String.length("\u579C"), 1);
        assertTrue(JISX0213String.isValid("\u579D"));	// 垝
        assertEquals(JISX0213String.length("\u579D"), 1);
        assertTrue(JISX0213String.isValid("\u579E"));	// 垞
        assertEquals(JISX0213String.length("\u579E"), 1);
        assertTrue(JISX0213String.isValid("\u57A8"));	// 垨
        assertEquals(JISX0213String.length("\u57A8"), 1);
        assertTrue(JISX0213String.isValid("\u57B8"));	// 垸
        assertEquals(JISX0213String.length("\u57B8"), 1);
        assertTrue(JISX0213String.isValid("\u57CC"));	// 埌
        assertEquals(JISX0213String.length("\u57CC"), 1);
        assertTrue(JISX0213String.isValid("\u57CF"));	// 埏
        assertEquals(JISX0213String.length("\u57CF"), 1);
        assertTrue(JISX0213String.isValid("\u57DE"));	// 埞
        assertEquals(JISX0213String.length("\u57DE"), 1);
        assertTrue(JISX0213String.isValid("\u57E4"));	// 埤
        assertEquals(JISX0213String.length("\u57E4"), 1);
        assertTrue(JISX0213String.isValid("\u57E6"));	// 埦
        assertEquals(JISX0213String.length("\u57E6"), 1);
        assertTrue(JISX0213String.isValid("\u57ED"));	// 埭
        assertEquals(JISX0213String.length("\u57ED"), 1);
        assertTrue(JISX0213String.isValid("\u57F0"));	// 埰
        assertEquals(JISX0213String.length("\u57F0"), 1);
        assertTrue(JISX0213String.isValid("\u57F5"));	// 埵
        assertEquals(JISX0213String.length("\u57F5"), 1);
        assertTrue(JISX0213String.isValid("\u57F6"));	// 埶
        assertEquals(JISX0213String.length("\u57F6"), 1);
        assertTrue(JISX0213String.isValid("\u57F8"));	// 埸
        assertEquals(JISX0213String.length("\u57F8"), 1);
        assertTrue(JISX0213String.isValid("\u57FD"));	// 埽
        assertEquals(JISX0213String.length("\u57FD"), 1);
        assertTrue(JISX0213String.isValid("\u57FF"));	// 埿
        assertEquals(JISX0213String.length("\u57FF"), 1);
        assertTrue(JISX0213String.isValid("\u5804"));	// 堄
        assertEquals(JISX0213String.length("\u5804"), 1);
        assertTrue(JISX0213String.isValid("\u5809"));	// 堉
        assertEquals(JISX0213String.length("\u5809"), 1);
        assertTrue(JISX0213String.isValid("\u581E"));	// 堞
        assertEquals(JISX0213String.length("\u581E"), 1);
        assertTrue(JISX0213String.isValid("\u5820"));	// 堠
        assertEquals(JISX0213String.length("\u5820"), 1);
        assertTrue(JISX0213String.isValid("\u5827"));	// 堧
        assertEquals(JISX0213String.length("\u5827"), 1);
        assertTrue(JISX0213String.isValid("\u5832"));	// 堲
        assertEquals(JISX0213String.length("\u5832"), 1);
        assertTrue(JISX0213String.isValid("\u5839"));	// 堹
        assertEquals(JISX0213String.length("\u5839"), 1);
        assertTrue(JISX0213String.isValid("\u5849"));	// 塉
        assertEquals(JISX0213String.length("\u5849"), 1);
        assertTrue(JISX0213String.isValid("\u584C"));	// 塌
        assertEquals(JISX0213String.length("\u584C"), 1);
        assertTrue(JISX0213String.isValid("\u5861"));	// 塡
        assertEquals(JISX0213String.length("\u5861"), 1);
        assertTrue(JISX0213String.isValid("\u5864"));	// 塤
        assertEquals(JISX0213String.length("\u5864"), 1);
        assertTrue(JISX0213String.isValid("\u5867"));	// 塧
        assertEquals(JISX0213String.length("\u5867"), 1);
        assertTrue(JISX0213String.isValid("\u587C"));	// 塼
        assertEquals(JISX0213String.length("\u587C"), 1);
        assertTrue(JISX0213String.isValid("\u5889"));	// 墉
        assertEquals(JISX0213String.length("\u5889"), 1);
        assertTrue(JISX0213String.isValid("\u588A"));	// 墊
        assertEquals(JISX0213String.length("\u588A"), 1);
        assertTrue(JISX0213String.isValid("\u588D"));	// 墍
        assertEquals(JISX0213String.length("\u588D"), 1);
        assertTrue(JISX0213String.isValid("\u588F"));	// 墏
        assertEquals(JISX0213String.length("\u588F"), 1);
        assertTrue(JISX0213String.isValid("\u5890"));	// 墐
        assertEquals(JISX0213String.length("\u5890"), 1);
        assertTrue(JISX0213String.isValid("\u5894"));	// 墔
        assertEquals(JISX0213String.length("\u5894"), 1);
        assertTrue(JISX0213String.isValid("\u589D"));	// 墝
        assertEquals(JISX0213String.length("\u589D"), 1);
        assertTrue(JISX0213String.isValid("\u58A9"));	// 墩
        assertEquals(JISX0213String.length("\u58A9"), 1);
        assertTrue(JISX0213String.isValid("\u58B1"));	// 墱
        assertEquals(JISX0213String.length("\u58B1"), 1);
        assertTrue(JISX0213String.isValid("\u58CD"));	// 壍
        assertEquals(JISX0213String.length("\u58CD"), 1);
        assertTrue(JISX0213String.isValid("\u58CE"));	// 壎
        assertEquals(JISX0213String.length("\u58CE"), 1);
        assertTrue(JISX0213String.isValid("\u58D2"));	// 壒
        assertEquals(JISX0213String.length("\u58D2"), 1);
        assertTrue(JISX0213String.isValid("\u58D4"));	// 壔
        assertEquals(JISX0213String.length("\u58D4"), 1);
        assertTrue(JISX0213String.isValid("\u58DA"));	// 壚
        assertEquals(JISX0213String.length("\u58DA"), 1);
        assertTrue(JISX0213String.isValid("\u58E2"));	// 壢
        assertEquals(JISX0213String.length("\u58E2"), 1);
        assertTrue(JISX0213String.isValid("\u58E9"));	// 壩
        assertEquals(JISX0213String.length("\u58E9"), 1);
        assertTrue(JISX0213String.isValid("\u58F3"));	// 壳
        assertEquals(JISX0213String.length("\u58F3"), 1);
        assertTrue(JISX0213String.isValid("\u5905"));	// 夅
        assertEquals(JISX0213String.length("\u5905"), 1);
        assertTrue(JISX0213String.isValid("\u5906"));	// 夆
        assertEquals(JISX0213String.length("\u5906"), 1);
        assertTrue(JISX0213String.isValid("\u590C"));	// 夌
        assertEquals(JISX0213String.length("\u590C"), 1);
        assertTrue(JISX0213String.isValid("\u5914"));	// 夔
        assertEquals(JISX0213String.length("\u5914"), 1);
        assertTrue(JISX0213String.isValid("\u8641"));	// 虁
        assertEquals(JISX0213String.length("\u8641"), 1);
        assertTrue(JISX0213String.isValid("\u5924"));	// 夤
        assertEquals(JISX0213String.length("\u5924"), 1);
        assertTrue(JISX0213String.isValid("\u5946"));	// 奆
        assertEquals(JISX0213String.length("\u5946"), 1);
        assertTrue(JISX0213String.isValid("\u595F"));	// 奟
        assertEquals(JISX0213String.length("\u595F"), 1);
        assertTrue(JISX0213String.isValid("\u596D"));	// 奭
        assertEquals(JISX0213String.length("\u596D"), 1);
        assertTrue(JISX0213String.isValid("\u5975"));	// 奵
        assertEquals(JISX0213String.length("\u5975"), 1);
        assertTrue(JISX0213String.isValid("\u5976"));	// 奶
        assertEquals(JISX0213String.length("\u5976"), 1);
        assertTrue(JISX0213String.isValid("\u597C"));	// 奼
        assertEquals(JISX0213String.length("\u597C"), 1);
        assertTrue(JISX0213String.isValid("\u598B"));	// 妋
        assertEquals(JISX0213String.length("\u598B"), 1);
        assertTrue(JISX0213String.isValid("\u5992"));	// 妒
        assertEquals(JISX0213String.length("\u5992"), 1);
        assertTrue(JISX0213String.isValid("\u599F"));	// 妟
        assertEquals(JISX0213String.length("\u599F"), 1);
        assertTrue(JISX0213String.isValid("\u59AE"));	// 妮
        assertEquals(JISX0213String.length("\u59AE"), 1);
        assertTrue(JISX0213String.isValid("\u59BC"));	// 妼
        assertEquals(JISX0213String.length("\u59BC"), 1);
        assertTrue(JISX0213String.isValid("\u59C3"));	// 姃
        assertEquals(JISX0213String.length("\u59C3"), 1);
        assertTrue(JISX0213String.isValid("\u59C8"));	// 姈
        assertEquals(JISX0213String.length("\u59C8"), 1);
        assertTrue(JISX0213String.isValid("\u59CD"));	// 姍
        assertEquals(JISX0213String.length("\u59CD"), 1);
        assertTrue(JISX0213String.isValid("\u59D2"));	// 姒
        assertEquals(JISX0213String.length("\u59D2"), 1);
        assertTrue(JISX0213String.isValid("\u59DD"));	// 姝
        assertEquals(JISX0213String.length("\u59DD"), 1);
        assertTrue(JISX0213String.isValid("\u59DE"));	// 姞
        assertEquals(JISX0213String.length("\u59DE"), 1);
        assertTrue(JISX0213String.isValid("\u59E3"));	// 姣
        assertEquals(JISX0213String.length("\u59E3"), 1);
        assertTrue(JISX0213String.isValid("\u59E4"));	// 姤
        assertEquals(JISX0213String.length("\u59E4"), 1);
        assertTrue(JISX0213String.isValid("\u59E7"));	// 姧
        assertEquals(JISX0213String.length("\u59E7"), 1);
        assertTrue(JISX0213String.isValid("\u59EE"));	// 姮
        assertEquals(JISX0213String.length("\u59EE"), 1);
        assertTrue(JISX0213String.isValid("\u5A0C"));	// 娌
        assertEquals(JISX0213String.length("\u5A0C"), 1);
        assertTrue(JISX0213String.isValid("\u5A0D"));	// 娍
        assertEquals(JISX0213String.length("\u5A0D"), 1);
        assertTrue(JISX0213String.isValid("\u5A13"));	// 娓
        assertEquals(JISX0213String.length("\u5A13"), 1);
        assertTrue(JISX0213String.isValid("\u5A23"));	// 娣
        assertEquals(JISX0213String.length("\u5A23"), 1);
        assertTrue(JISX0213String.isValid("\u5A27"));	// 娧
        assertEquals(JISX0213String.length("\u5A27"), 1);
        assertTrue(JISX0213String.isValid("\u5A2D"));	// 娭
        assertEquals(JISX0213String.length("\u5A2D"), 1);
        assertTrue(JISX0213String.isValid("\u5A55"));	// 婕
        assertEquals(JISX0213String.length("\u5A55"), 1);
        assertTrue(JISX0213String.isValid("\u5A65"));	// 婥
        assertEquals(JISX0213String.length("\u5A65"), 1);
        assertTrue(JISX0213String.isValid("\u5A67"));	// 婧
        assertEquals(JISX0213String.length("\u5A67"), 1);
        assertTrue(JISX0213String.isValid("\u5A6D"));	// 婭
        assertEquals(JISX0213String.length("\u5A6D"), 1);
        assertTrue(JISX0213String.isValid("\u5A77"));	// 婷
        assertEquals(JISX0213String.length("\u5A77"), 1);
        assertTrue(JISX0213String.isValid("\u5A7A"));	// 婺
        assertEquals(JISX0213String.length("\u5A7A"), 1);
        assertTrue(JISX0213String.isValid("\u5A7E"));	// 婾
        assertEquals(JISX0213String.length("\u5A7E"), 1);
        assertTrue(JISX0213String.isValid("\u5A8B"));	// 媋
        assertEquals(JISX0213String.length("\u5A8B"), 1);
        assertTrue(JISX0213String.isValid("\u5A9C"));	// 媜
        assertEquals(JISX0213String.length("\u5A9C"), 1);
        assertTrue(JISX0213String.isValid("\u5A9E"));	// 媞
        assertEquals(JISX0213String.length("\u5A9E"), 1);
        assertTrue(JISX0213String.isValid("\u5A9F"));	// 媟
        assertEquals(JISX0213String.length("\u5A9F"), 1);
        assertTrue(JISX0213String.isValid("\u5AA0"));	// 媠
        assertEquals(JISX0213String.length("\u5AA0"), 1);
        assertTrue(JISX0213String.isValid("\u5AA2"));	// 媢
        assertEquals(JISX0213String.length("\u5AA2"), 1);
        assertTrue(JISX0213String.isValid("\u5AA7"));	// 媧
        assertEquals(JISX0213String.length("\u5AA7"), 1);
        assertTrue(JISX0213String.isValid("\u5AB1"));	// 媱
        assertEquals(JISX0213String.length("\u5AB1"), 1);
        assertTrue(JISX0213String.isValid("\u5AB3"));	// 媳
        assertEquals(JISX0213String.length("\u5AB3"), 1);
        assertTrue(JISX0213String.isValid("\u5AB5"));	// 媵
        assertEquals(JISX0213String.length("\u5AB5"), 1);
        assertTrue(JISX0213String.isValid("\u5ABA"));	// 媺
        assertEquals(JISX0213String.length("\u5ABA"), 1);
        assertTrue(JISX0213String.isValid("\u5ABF"));	// 媿
        assertEquals(JISX0213String.length("\u5ABF"), 1);
        assertTrue(JISX0213String.isValid("\u5AC4"));	// 嫄
        assertEquals(JISX0213String.length("\u5AC4"), 1);
        assertTrue(JISX0213String.isValid("\u5ADA"));	// 嫚
        assertEquals(JISX0213String.length("\u5ADA"), 1);
        assertTrue(JISX0213String.isValid("\u5ADC"));	// 嫜
        assertEquals(JISX0213String.length("\u5ADC"), 1);
        assertTrue(JISX0213String.isValid("\u5AE0"));	// 嫠
        assertEquals(JISX0213String.length("\u5AE0"), 1);
        assertTrue(JISX0213String.isValid("\u5AE5"));	// 嫥
        assertEquals(JISX0213String.length("\u5AE5"), 1);
        assertTrue(JISX0213String.isValid("\u5AEE"));	// 嫮
        assertEquals(JISX0213String.length("\u5AEE"), 1);
        assertTrue(JISX0213String.isValid("\u5AF5"));	// 嫵
        assertEquals(JISX0213String.length("\u5AF5"), 1);
        assertTrue(JISX0213String.isValid("\u5B00"));	// 嬀
        assertEquals(JISX0213String.length("\u5B00"), 1);
        assertTrue(JISX0213String.isValid("\u5B08"));	// 嬈
        assertEquals(JISX0213String.length("\u5B08"), 1);
        assertTrue(JISX0213String.isValid("\u5B17"));	// 嬗
        assertEquals(JISX0213String.length("\u5B17"), 1);
        assertTrue(JISX0213String.isValid("\u5B34"));	// 嬴
        assertEquals(JISX0213String.length("\u5B34"), 1);
        assertTrue(JISX0213String.isValid("\u5B19"));	// 嬙
        assertEquals(JISX0213String.length("\u5B19"), 1);
        assertTrue(JISX0213String.isValid("\u5B25"));	// 嬥
        assertEquals(JISX0213String.length("\u5B25"), 1);
        assertTrue(JISX0213String.isValid("\u5B2D"));	// 嬭
        assertEquals(JISX0213String.length("\u5B2D"), 1);
        assertTrue(JISX0213String.isValid("\u5B41"));	// 孁
        assertEquals(JISX0213String.length("\u5B41"), 1);
        assertTrue(JISX0213String.isValid("\u5B4C"));	// 孌
        assertEquals(JISX0213String.length("\u5B4C"), 1);
        assertTrue(JISX0213String.isValid("\u5B52"));	// 孒
        assertEquals(JISX0213String.length("\u5B52"), 1);
        assertTrue(JISX0213String.isValid("\u5B68"));	// 孨
        assertEquals(JISX0213String.length("\u5B68"), 1);
        assertTrue(JISX0213String.isValid("\u5B6F"));	// 孯
        assertEquals(JISX0213String.length("\u5B6F"), 1);
        assertTrue(JISX0213String.isValid("\u5B7C"));	// 孼
        assertEquals(JISX0213String.length("\u5B7C"), 1);
        assertTrue(JISX0213String.isValid("\u5B7D"));	// 孽
        assertEquals(JISX0213String.length("\u5B7D"), 1);
        assertTrue(JISX0213String.isValid("\u5B7F"));	// 孿
        assertEquals(JISX0213String.length("\u5B7F"), 1);
        assertTrue(JISX0213String.isValid("\u5B81"));	// 宁
        assertEquals(JISX0213String.length("\u5B81"), 1);
        assertTrue(JISX0213String.isValid("\u5B84"));	// 宄
        assertEquals(JISX0213String.length("\u5B84"), 1);
        assertTrue(JISX0213String.isValid("\u5B93"));	// 宓
        assertEquals(JISX0213String.length("\u5B93"), 1);
        assertTrue(JISX0213String.isValid("\u5B96"));	// 宖
        assertEquals(JISX0213String.length("\u5B96"), 1);
        assertTrue(JISX0213String.isValid("\u5BAC"));	// 宬
        assertEquals(JISX0213String.length("\u5BAC"), 1);
        assertTrue(JISX0213String.isValid("\u5BD6"));	// 寖
        assertEquals(JISX0213String.length("\u5BD6"), 1);
        assertTrue(JISX0213String.isValid("\u5BF1"));	// 寱
        assertEquals(JISX0213String.length("\u5BF1"), 1);
        assertTrue(JISX0213String.isValid("\u5BFD"));	// 寽
        assertEquals(JISX0213String.length("\u5BFD"), 1);
        assertTrue(JISX0213String.isValid("\u5C23"));	// 尣
        assertEquals(JISX0213String.length("\u5C23"), 1);
        assertTrue(JISX0213String.isValid("\u5C29"));	// 尩
        assertEquals(JISX0213String.length("\u5C29"), 1);
        assertTrue(JISX0213String.isValid("\u5C2B"));	// 尫
        assertEquals(JISX0213String.length("\u5C2B"), 1);
        assertTrue(JISX0213String.isValid("\u5C30"));	// 尰
        assertEquals(JISX0213String.length("\u5C30"), 1);
        assertTrue(JISX0213String.isValid("\u5C62"));	// 屢
        assertEquals(JISX0213String.length("\u5C62"), 1);
        assertTrue(JISX0213String.isValid("\u5C63"));	// 屣
        assertEquals(JISX0213String.length("\u5C63"), 1);
        assertTrue(JISX0213String.isValid("\u5C67"));	// 屧
        assertEquals(JISX0213String.length("\u5C67"), 1);
        assertTrue(JISX0213String.isValid("\u5C68"));	// 屨
        assertEquals(JISX0213String.length("\u5C68"), 1);
        assertTrue(JISX0213String.isValid("\u5C69"));	// 屩
        assertEquals(JISX0213String.length("\u5C69"), 1);
        assertTrue(JISX0213String.isValid("\u5C70"));	// 屰
        assertEquals(JISX0213String.length("\u5C70"), 1);
        assertTrue(JISX0213String.isValid("\u5C7A"));	// 屺
        assertEquals(JISX0213String.length("\u5C7A"), 1);
        assertTrue(JISX0213String.isValid("\u5C7C"));	// 屼
        assertEquals(JISX0213String.length("\u5C7C"), 1);
        assertTrue(JISX0213String.isValid("\u5C88"));	// 岈
        assertEquals(JISX0213String.length("\u5C88"), 1);
        assertTrue(JISX0213String.isValid("\u5C8A"));	// 岊
        assertEquals(JISX0213String.length("\u5C8A"), 1);
        assertTrue(JISX0213String.isValid("\u5C8F"));	// 岏
        assertEquals(JISX0213String.length("\u5C8F"), 1);
        assertTrue(JISX0213String.isValid("\u5C9F"));	// 岟
        assertEquals(JISX0213String.length("\u5C9F"), 1);
        assertTrue(JISX0213String.isValid("\u5CA0"));	// 岠
        assertEquals(JISX0213String.length("\u5CA0"), 1);
        assertTrue(JISX0213String.isValid("\u5CA2"));	// 岢
        assertEquals(JISX0213String.length("\u5CA2"), 1);
        assertTrue(JISX0213String.isValid("\u5CA3"));	// 岣
        assertEquals(JISX0213String.length("\u5CA3"), 1);
        assertTrue(JISX0213String.isValid("\u5CAA"));	// 岪
        assertEquals(JISX0213String.length("\u5CAA"), 1);
        assertTrue(JISX0213String.isValid("\u5CB5"));	// 岵
        assertEquals(JISX0213String.length("\u5CB5"), 1);
        assertTrue(JISX0213String.isValid("\u5CC9"));	// 峉
        assertEquals(JISX0213String.length("\u5CC9"), 1);
        assertTrue(JISX0213String.isValid("\u5CCB"));	// 峋
        assertEquals(JISX0213String.length("\u5CCB"), 1);
        assertTrue(JISX0213String.isValid("\u5CD2"));	// 峒
        assertEquals(JISX0213String.length("\u5CD2"), 1);
        assertTrue(JISX0213String.isValid("\u5CF4"));	// 峴
        assertEquals(JISX0213String.length("\u5CF4"), 1);
        assertTrue(JISX0213String.isValid("\u5D06"));	// 崆
        assertEquals(JISX0213String.length("\u5D06"), 1);
        assertTrue(JISX0213String.isValid("\u5D0D"));	// 崍
        assertEquals(JISX0213String.length("\u5D0D"), 1);
        assertTrue(JISX0213String.isValid("\u5D2B"));	// 崫
        assertEquals(JISX0213String.length("\u5D2B"), 1);
        assertTrue(JISX0213String.isValid("\u5D24"));	// 崤
        assertEquals(JISX0213String.length("\u5D24"), 1);
        assertTrue(JISX0213String.isValid("\u5D26"));	// 崦
        assertEquals(JISX0213String.length("\u5D26"), 1);
        assertTrue(JISX0213String.isValid("\u5D31"));	// 崱
        assertEquals(JISX0213String.length("\u5D31"), 1);
        assertTrue(JISX0213String.isValid("\u5D39"));	// 崹
        assertEquals(JISX0213String.length("\u5D39"), 1);
        assertTrue(JISX0213String.isValid("\u5D46"));	// 嵆
        assertEquals(JISX0213String.length("\u5D46"), 1);
        assertTrue(JISX0213String.isValid("\u5D4A"));	// 嵊
        assertEquals(JISX0213String.length("\u5D4A"), 1);
        assertTrue(JISX0213String.isValid("\u5D61"));	// 嵡
        assertEquals(JISX0213String.length("\u5D61"), 1);
        assertTrue(JISX0213String.isValid("\u5D6A"));	// 嵪
        assertEquals(JISX0213String.length("\u5D6A"), 1);
        assertTrue(JISX0213String.isValid("\u5D70"));	// 嵰
        assertEquals(JISX0213String.length("\u5D70"), 1);
        assertTrue(JISX0213String.isValid("\u5D81"));	// 嶁
        assertEquals(JISX0213String.length("\u5D81"), 1);
        assertTrue(JISX0213String.isValid("\u5D88"));	// 嶈
        assertEquals(JISX0213String.length("\u5D88"), 1);
        assertTrue(JISX0213String.isValid("\u5D92"));	// 嶒
        assertEquals(JISX0213String.length("\u5D92"), 1);
        assertTrue(JISX0213String.isValid("\u5D94"));	// 嶔
        assertEquals(JISX0213String.length("\u5D94"), 1);
        assertTrue(JISX0213String.isValid("\u5D99"));	// 嶙
        assertEquals(JISX0213String.length("\u5D99"), 1);
        assertTrue(JISX0213String.isValid("\u5DA0"));	// 嶠
        assertEquals(JISX0213String.length("\u5DA0"), 1);
        assertTrue(JISX0213String.isValid("\u5DA7"));	// 嶧
        assertEquals(JISX0213String.length("\u5DA7"), 1);
        assertTrue(JISX0213String.isValid("\u5DB0"));	// 嶰
        assertEquals(JISX0213String.length("\u5DB0"), 1);
        assertTrue(JISX0213String.isValid("\u5DB4"));	// 嶴
        assertEquals(JISX0213String.length("\u5DB4"), 1);
        assertTrue(JISX0213String.isValid("\u5DCB"));	// 巋
        assertEquals(JISX0213String.length("\u5DCB"), 1);
        assertTrue(JISX0213String.isValid("\u5DD8"));	// 巘
        assertEquals(JISX0213String.length("\u5DD8"), 1);
        assertTrue(JISX0213String.isValid("\u5DE0"));	// 巠
        assertEquals(JISX0213String.length("\u5DE0"), 1);
        assertTrue(JISX0213String.isValid("\u5DE4"));	// 巤
        assertEquals(JISX0213String.length("\u5DE4"), 1);
        assertTrue(JISX0213String.isValid("\u5DE9"));	// 巩
        assertEquals(JISX0213String.length("\u5DE9"), 1);
        assertTrue(JISX0213String.isValid("\u5E00"));	// 帀
        assertEquals(JISX0213String.length("\u5E00"), 1);
        assertTrue(JISX0213String.isValid("\u5E12"));	// 帒
        assertEquals(JISX0213String.length("\u5E12"), 1);
        assertTrue(JISX0213String.isValid("\u5E14"));	// 帔
        assertEquals(JISX0213String.length("\u5E14"), 1);
        assertTrue(JISX0213String.isValid("\u5E15"));	// 帕
        assertEquals(JISX0213String.length("\u5E15"), 1);
        assertTrue(JISX0213String.isValid("\u5E18"));	// 帘
        assertEquals(JISX0213String.length("\u5E18"), 1);
        assertTrue(JISX0213String.isValid("\u5E1F"));	// 帟
        assertEquals(JISX0213String.length("\u5E1F"), 1);
        assertTrue(JISX0213String.isValid("\u5E2E"));	// 帮
        assertEquals(JISX0213String.length("\u5E2E"), 1);
        assertTrue(JISX0213String.isValid("\u5E3E"));	// 帾
        assertEquals(JISX0213String.length("\u5E3E"), 1);
        assertTrue(JISX0213String.isValid("\u5E49"));	// 幉
        assertEquals(JISX0213String.length("\u5E49"), 1);
        assertTrue(JISX0213String.isValid("\u5E56"));	// 幖
        assertEquals(JISX0213String.length("\u5E56"), 1);
        assertTrue(JISX0213String.isValid("\u5E58"));	// 幘
        assertEquals(JISX0213String.length("\u5E58"), 1);
        assertTrue(JISX0213String.isValid("\u5E5E"));	// 幞
        assertEquals(JISX0213String.length("\u5E5E"), 1);
        assertTrue(JISX0213String.isValid("\u5E6B"));	// 幫
        assertEquals(JISX0213String.length("\u5E6B"), 1);
        assertTrue(JISX0213String.isValid("\u5E6C"));	// 幬
        assertEquals(JISX0213String.length("\u5E6C"), 1);
        assertTrue(JISX0213String.isValid("\u5E6D"));	// 幭
        assertEquals(JISX0213String.length("\u5E6D"), 1);
        assertTrue(JISX0213String.isValid("\u5E6E"));	// 幮
        assertEquals(JISX0213String.length("\u5E6E"), 1);
        assertTrue(JISX0213String.isValid("\u5EA5"));	// 庥
        assertEquals(JISX0213String.length("\u5EA5"), 1);
        assertTrue(JISX0213String.isValid("\u5EAA"));	// 庪
        assertEquals(JISX0213String.length("\u5EAA"), 1);
        assertTrue(JISX0213String.isValid("\u5EAC"));	// 庬
        assertEquals(JISX0213String.length("\u5EAC"), 1);
        assertTrue(JISX0213String.isValid("\u5EBE"));	// 庾
        assertEquals(JISX0213String.length("\u5EBE"), 1);
        assertTrue(JISX0213String.isValid("\u5EBF"));	// 庿
        assertEquals(JISX0213String.length("\u5EBF"), 1);
        assertTrue(JISX0213String.isValid("\u5EC6"));	// 廆
        assertEquals(JISX0213String.length("\u5EC6"), 1);
        assertTrue(JISX0213String.isValid("\u5ECB"));	// 廋
        assertEquals(JISX0213String.length("\u5ECB"), 1);
        assertTrue(JISX0213String.isValid("\u5ED2"));	// 廒
        assertEquals(JISX0213String.length("\u5ED2"), 1);
        assertTrue(JISX0213String.isValid("\u5F02"));	// 异
        assertEquals(JISX0213String.length("\u5F02"), 1);
        assertTrue(JISX0213String.isValid("\u5F07"));	// 弇
        assertEquals(JISX0213String.length("\u5F07"), 1);
        assertTrue(JISX0213String.isValid("\u5F08"));	// 弈
        assertEquals(JISX0213String.length("\u5F08"), 1);
        assertTrue(JISX0213String.isValid("\u5F0E"));	// 弎
        assertEquals(JISX0213String.length("\u5F0E"), 1);
        assertTrue(JISX0213String.isValid("\u5F1C"));	// 弜
        assertEquals(JISX0213String.length("\u5F1C"), 1);
        assertTrue(JISX0213String.isValid("\u5F1D"));	// 弝
        assertEquals(JISX0213String.length("\u5F1D"), 1);
        assertTrue(JISX0213String.isValid("\u5F23"));	// 弣
        assertEquals(JISX0213String.length("\u5F23"), 1);
        assertTrue(JISX0213String.isValid("\u5F36"));	// 弶
        assertEquals(JISX0213String.length("\u5F36"), 1);
        assertTrue(JISX0213String.isValid("\u5F3D"));	// 弽
        assertEquals(JISX0213String.length("\u5F3D"), 1);
        assertTrue(JISX0213String.isValid("\u5F40"));	// 彀
        assertEquals(JISX0213String.length("\u5F40"), 1);
        assertTrue(JISX0213String.isValid("\u5F47"));	// 彇
        assertEquals(JISX0213String.length("\u5F47"), 1);
        assertTrue(JISX0213String.isValid("\u5F54"));	// 彔
        assertEquals(JISX0213String.length("\u5F54"), 1);
        assertTrue(JISX0213String.isValid("\u5F58"));	// 彘
        assertEquals(JISX0213String.length("\u5F58"), 1);
        assertTrue(JISX0213String.isValid("\u5F63"));	// 彣
        assertEquals(JISX0213String.length("\u5F63"), 1);
        assertTrue(JISX0213String.isValid("\u5F64"));	// 彤
        assertEquals(JISX0213String.length("\u5F64"), 1);
        assertTrue(JISX0213String.isValid("\u5F72"));	// 彲
        assertEquals(JISX0213String.length("\u5F72"), 1);
        assertTrue(JISX0213String.isValid("\u5F7D"));	// 彽
        assertEquals(JISX0213String.length("\u5F7D"), 1);
        assertTrue(JISX0213String.isValid("\u5F7E"));	// 彾
        assertEquals(JISX0213String.length("\u5F7E"), 1);
        assertTrue(JISX0213String.isValid("\u5F89"));	// 徉
        assertEquals(JISX0213String.length("\u5F89"), 1);
        assertTrue(JISX0213String.isValid("\u5F8F"));	// 徏
        assertEquals(JISX0213String.length("\u5F8F"), 1);
        assertTrue(JISX0213String.isValid("\u5F9C"));	// 徜
        assertEquals(JISX0213String.length("\u5F9C"), 1);
        assertTrue(JISX0213String.isValid("\u5FA2"));	// 徢
        assertEquals(JISX0213String.length("\u5FA2"), 1);
        assertTrue(JISX0213String.isValid("\u5FA7"));	// 徧
        assertEquals(JISX0213String.length("\u5FA7"), 1);
        assertTrue(JISX0213String.isValid("\u5FA4"));	// 徤
        assertEquals(JISX0213String.length("\u5FA4"), 1);
        assertTrue(JISX0213String.isValid("\u5FAF"));	// 徯
        assertEquals(JISX0213String.length("\u5FAF"), 1);
        assertTrue(JISX0213String.isValid("\u5FB8"));	// 徸
        assertEquals(JISX0213String.length("\u5FB8"), 1);
        assertTrue(JISX0213String.isValid("\u5FC4"));	// 忄
        assertEquals(JISX0213String.length("\u5FC4"), 1);
        assertTrue(JISX0213String.isValid("\u5FC7"));	// 忇
        assertEquals(JISX0213String.length("\u5FC7"), 1);
        assertTrue(JISX0213String.isValid("\u5FC9"));	// 忉
        assertEquals(JISX0213String.length("\u5FC9"), 1);
        assertTrue(JISX0213String.isValid("\u5FCB"));	// 忋
        assertEquals(JISX0213String.length("\u5FCB"), 1);
        assertTrue(JISX0213String.isValid("\u5FD2"));	// 忒
        assertEquals(JISX0213String.length("\u5FD2"), 1);
        assertTrue(JISX0213String.isValid("\u5FD3"));	// 忓
        assertEquals(JISX0213String.length("\u5FD3"), 1);
        assertTrue(JISX0213String.isValid("\u5FD4"));	// 忔
        assertEquals(JISX0213String.length("\u5FD4"), 1);
        assertTrue(JISX0213String.isValid("\u5FE1"));	// 忡
        assertEquals(JISX0213String.length("\u5FE1"), 1);
        assertTrue(JISX0213String.isValid("\u5FE2"));	// 忢
        assertEquals(JISX0213String.length("\u5FE2"), 1);
        assertTrue(JISX0213String.isValid("\u5FE9"));	// 忩
        assertEquals(JISX0213String.length("\u5FE9"), 1);
        assertTrue(JISX0213String.isValid("\u5FEE"));	// 忮
        assertEquals(JISX0213String.length("\u5FEE"), 1);
        assertTrue(JISX0213String.isValid("\u5FEF"));	// 忯
        assertEquals(JISX0213String.length("\u5FEF"), 1);
        assertTrue(JISX0213String.isValid("\u5FF3"));	// 忳
        assertEquals(JISX0213String.length("\u5FF3"), 1);
        assertTrue(JISX0213String.isValid("\u5FFC"));	// 忼
        assertEquals(JISX0213String.length("\u5FFC"), 1);
        assertTrue(JISX0213String.isValid("\u600D"));	// 怍
        assertEquals(JISX0213String.length("\u600D"), 1);
        assertTrue(JISX0213String.isValid("\u6014"));	// 怔
        assertEquals(JISX0213String.length("\u6014"), 1);
        assertTrue(JISX0213String.isValid("\u6017"));	// 怗
        assertEquals(JISX0213String.length("\u6017"), 1);
        assertTrue(JISX0213String.isValid("\u6018"));	// 怘
        assertEquals(JISX0213String.length("\u6018"), 1);
        assertTrue(JISX0213String.isValid("\u6024"));	// 怤
        assertEquals(JISX0213String.length("\u6024"), 1);
        assertTrue(JISX0213String.isValid("\u6033"));	// 怳
        assertEquals(JISX0213String.length("\u6033"), 1);
        assertTrue(JISX0213String.isValid("\u6035"));	// 怵
        assertEquals(JISX0213String.length("\u6035"), 1);
        assertTrue(JISX0213String.isValid("\u6047"));	// 恇
        assertEquals(JISX0213String.length("\u6047"), 1);
        assertTrue(JISX0213String.isValid("\u604C"));	// 恌
        assertEquals(JISX0213String.length("\u604C"), 1);
        assertTrue(JISX0213String.isValid("\u607F"));	// 恿
        assertEquals(JISX0213String.length("\u607F"), 1);
        assertTrue(JISX0213String.isValid("\u6095"));	// 悕
        assertEquals(JISX0213String.length("\u6095"), 1);
        assertTrue(JISX0213String.isValid("\u609D"));	// 悝
        assertEquals(JISX0213String.length("\u609D"), 1);
        assertTrue(JISX0213String.isValid("\u609E"));	// 悞
        assertEquals(JISX0213String.length("\u609E"), 1);
        assertTrue(JISX0213String.isValid("\u60A8"));	// 您
        assertEquals(JISX0213String.length("\u60A8"), 1);
        assertTrue(JISX0213String.isValid("\u60B0"));	// 悰
        assertEquals(JISX0213String.length("\u60B0"), 1);
        assertTrue(JISX0213String.isValid("\u60B1"));	// 悱
        assertEquals(JISX0213String.length("\u60B1"), 1);
        assertTrue(JISX0213String.isValid("\u60BE"));	// 悾
        assertEquals(JISX0213String.length("\u60BE"), 1);
        assertTrue(JISX0213String.isValid("\u60C8"));	// 惈
        assertEquals(JISX0213String.length("\u60C8"), 1);
        assertTrue(JISX0213String.isValid("\u60CB"));	// 惋
        assertEquals(JISX0213String.length("\u60CB"), 1);
        assertTrue(JISX0213String.isValid("\u60D4"));	// 惔
        assertEquals(JISX0213String.length("\u60D4"), 1);
        assertTrue(JISX0213String.isValid("\u60D9"));	// 惙
        assertEquals(JISX0213String.length("\u60D9"), 1);
        assertTrue(JISX0213String.isValid("\u60DB"));	// 惛
        assertEquals(JISX0213String.length("\u60DB"), 1);
        assertTrue(JISX0213String.isValid("\u60DD"));	// 惝
        assertEquals(JISX0213String.length("\u60DD"), 1);
        assertTrue(JISX0213String.isValid("\u60F5"));	// 惵
        assertEquals(JISX0213String.length("\u60F5"), 1);
        assertTrue(JISX0213String.isValid("\u60F8"));	// 惸
        assertEquals(JISX0213String.length("\u60F8"), 1);
        assertTrue(JISX0213String.isValid("\u6110"));	// 愐
        assertEquals(JISX0213String.length("\u6110"), 1);
        assertTrue(JISX0213String.isValid("\u6112"));	// 愒
        assertEquals(JISX0213String.length("\u6112"), 1);
        assertTrue(JISX0213String.isValid("\u6113"));	// 愓
        assertEquals(JISX0213String.length("\u6113"), 1);
        assertTrue(JISX0213String.isValid("\u6119"));	// 愙
        assertEquals(JISX0213String.length("\u6119"), 1);
        assertTrue(JISX0213String.isValid("\u611C"));	// 愜
        assertEquals(JISX0213String.length("\u611C"), 1);
        assertTrue(JISX0213String.isValid("\u611E"));	// 愞
        assertEquals(JISX0213String.length("\u611E"), 1);
        assertTrue(JISX0213String.isValid("\u612B"));	// 愫
        assertEquals(JISX0213String.length("\u612B"), 1);
        assertTrue(JISX0213String.isValid("\u6141"));	// 慁
        assertEquals(JISX0213String.length("\u6141"), 1);
        assertTrue(JISX0213String.isValid("\u6146"));	// 慆
        assertEquals(JISX0213String.length("\u6146"), 1);
        assertTrue(JISX0213String.isValid("\u6160"));	// 慠
        assertEquals(JISX0213String.length("\u6160"), 1);
        assertTrue(JISX0213String.isValid("\u617C"));	// 慼
        assertEquals(JISX0213String.length("\u617C"), 1);
        assertTrue(JISX0213String.isValid("\u618D"));	// 憍
        assertEquals(JISX0213String.length("\u618D"), 1);
        assertTrue(JISX0213String.isValid("\u6192"));	// 憒
        assertEquals(JISX0213String.length("\u6192"), 1);
        assertTrue(JISX0213String.isValid("\u6193"));	// 憓
        assertEquals(JISX0213String.length("\u6193"), 1);
        assertTrue(JISX0213String.isValid("\u6197"));	// 憗
        assertEquals(JISX0213String.length("\u6197"), 1);
        assertTrue(JISX0213String.isValid("\u61A5"));	// 憥
        assertEquals(JISX0213String.length("\u61A5"), 1);
        assertTrue(JISX0213String.isValid("\u61A8"));	// 憨
        assertEquals(JISX0213String.length("\u61A8"), 1);
        assertTrue(JISX0213String.isValid("\u61AD"));	// 憭
        assertEquals(JISX0213String.length("\u61AD"), 1);
        assertTrue(JISX0213String.isValid("\u61B9"));	// 憹
        assertEquals(JISX0213String.length("\u61B9"), 1);
        assertTrue(JISX0213String.isValid("\u61BC"));	// 憼
        assertEquals(JISX0213String.length("\u61BC"), 1);
        assertTrue(JISX0213String.isValid("\u61D5"));	// 懕
        assertEquals(JISX0213String.length("\u61D5"), 1);
        assertTrue(JISX0213String.isValid("\u61DD"));	// 懝
        assertEquals(JISX0213String.length("\u61DD"), 1);
        assertTrue(JISX0213String.isValid("\u61DF"));	// 懟
        assertEquals(JISX0213String.length("\u61DF"), 1);
        assertTrue(JISX0213String.isValid("\u6215"));	// 戕
        assertEquals(JISX0213String.length("\u6215"), 1);
        assertTrue(JISX0213String.isValid("\u6222"));	// 戢
        assertEquals(JISX0213String.length("\u6222"), 1);
        assertTrue(JISX0213String.isValid("\u6223"));	// 戣
        assertEquals(JISX0213String.length("\u6223"), 1);
        assertTrue(JISX0213String.isValid("\u6229"));	// 戩
        assertEquals(JISX0213String.length("\u6229"), 1);
        assertTrue(JISX0213String.isValid("\u6243"));	// 扃
        assertEquals(JISX0213String.length("\u6243"), 1);
        assertTrue(JISX0213String.isValid("\u6246"));	// 扆
        assertEquals(JISX0213String.length("\u6246"), 1);
        assertTrue(JISX0213String.isValid("\u624C"));	// 扌
        assertEquals(JISX0213String.length("\u624C"), 1);
        assertTrue(JISX0213String.isValid("\u6251"));	// 扑
        assertEquals(JISX0213String.length("\u6251"), 1);
        assertTrue(JISX0213String.isValid("\u6252"));	// 扒
        assertEquals(JISX0213String.length("\u6252"), 1);
        assertTrue(JISX0213String.isValid("\u6256"));	// 扖
        assertEquals(JISX0213String.length("\u6256"), 1);
        assertTrue(JISX0213String.isValid("\u625A"));	// 扚
        assertEquals(JISX0213String.length("\u625A"), 1);
        assertTrue(JISX0213String.isValid("\u6264"));	// 扤
        assertEquals(JISX0213String.length("\u6264"), 1);
        assertTrue(JISX0213String.isValid("\u626D"));	// 扭
        assertEquals(JISX0213String.length("\u626D"), 1);
        assertTrue(JISX0213String.isValid("\u626F"));	// 扯
        assertEquals(JISX0213String.length("\u626F"), 1);
        assertTrue(JISX0213String.isValid("\u6273"));	// 扳
        assertEquals(JISX0213String.length("\u6273"), 1);
        assertTrue(JISX0213String.isValid("\u62C4"));	// 拄
        assertEquals(JISX0213String.length("\u62C4"), 1);
        assertTrue(JISX0213String.isValid("\u62D5"));	// 拕
        assertEquals(JISX0213String.length("\u62D5"), 1);
        assertTrue(JISX0213String.isValid("\u62D6"));	// 拖
        assertEquals(JISX0213String.length("\u62D6"), 1);
        assertTrue(JISX0213String.isValid("\u62FC"));	// 拼
        assertEquals(JISX0213String.length("\u62FC"), 1);
        assertTrue(JISX0213String.isValid("\u62FD"));	// 拽
        assertEquals(JISX0213String.length("\u62FD"), 1);
        assertTrue(JISX0213String.isValid("\u6303"));	// 挃
        assertEquals(JISX0213String.length("\u6303"), 1);
        assertTrue(JISX0213String.isValid("\u630A"));	// 挊
        assertEquals(JISX0213String.length("\u630A"), 1);
        assertTrue(JISX0213String.isValid("\u630D"));	// 挍
        assertEquals(JISX0213String.length("\u630D"), 1);
        assertTrue(JISX0213String.isValid("\u6310"));	// 挐
        assertEquals(JISX0213String.length("\u6310"), 1);
        assertTrue(JISX0213String.isValid("\u6318"));	// 挘
        assertEquals(JISX0213String.length("\u6318"), 1);
        assertTrue(JISX0213String.isValid("\u6335"));	// 挵
        assertEquals(JISX0213String.length("\u6335"), 1);
        assertTrue(JISX0213String.isValid("\u6339"));	// 挹
        assertEquals(JISX0213String.length("\u6339"), 1);
        assertTrue(JISX0213String.isValid("\u633C"));	// 挼
        assertEquals(JISX0213String.length("\u633C"), 1);
        assertTrue(JISX0213String.isValid("\u6341"));	// 捁
        assertEquals(JISX0213String.length("\u6341"), 1);
        assertTrue(JISX0213String.isValid("\u6343"));	// 捃
        assertEquals(JISX0213String.length("\u6343"), 1);
        assertTrue(JISX0213String.isValid("\u6344"));	// 捄
        assertEquals(JISX0213String.length("\u6344"), 1);
        assertTrue(JISX0213String.isValid("\u634E"));	// 捎
        assertEquals(JISX0213String.length("\u634E"), 1);
        assertTrue(JISX0213String.isValid("\u6365"));	// 捥
        assertEquals(JISX0213String.length("\u6365"), 1);
        assertTrue(JISX0213String.isValid("\u636C"));	// 捬
        assertEquals(JISX0213String.length("\u636C"), 1);
        assertTrue(JISX0213String.isValid("\u637C"));	// 捼
        assertEquals(JISX0213String.length("\u637C"), 1);
        assertTrue(JISX0213String.isValid("\u6384"));	// 掄
        assertEquals(JISX0213String.length("\u6384"), 1);
        assertTrue(JISX0213String.isValid("\u6394"));	// 掔
        assertEquals(JISX0213String.length("\u6394"), 1);
        assertTrue(JISX0213String.isValid("\u6399"));	// 掙
        assertEquals(JISX0213String.length("\u6399"), 1);
        assertTrue(JISX0213String.isValid("\u63BD"));	// 掽
        assertEquals(JISX0213String.length("\u63BD"), 1);
        assertTrue(JISX0213String.isValid("\u63D4"));	// 揔
        assertEquals(JISX0213String.length("\u63D4"), 1);
        assertTrue(JISX0213String.isValid("\u63D5"));	// 揕
        assertEquals(JISX0213String.length("\u63D5"), 1);
        assertTrue(JISX0213String.isValid("\u63DC"));	// 揜
        assertEquals(JISX0213String.length("\u63DC"), 1);
        assertTrue(JISX0213String.isValid("\u63E0"));	// 揠
        assertEquals(JISX0213String.length("\u63E0"), 1);
        assertTrue(JISX0213String.isValid("\u63E5"));	// 揥
        assertEquals(JISX0213String.length("\u63E5"), 1);
        assertTrue(JISX0213String.isValid("\u63EC"));	// 揬
        assertEquals(JISX0213String.length("\u63EC"), 1);
        assertTrue(JISX0213String.isValid("\u63F2"));	// 揲
        assertEquals(JISX0213String.length("\u63F2"), 1);
        assertTrue(JISX0213String.isValid("\u6409"));	// 搉
        assertEquals(JISX0213String.length("\u6409"), 1);
        assertTrue(JISX0213String.isValid("\u6410"));	// 搐
        assertEquals(JISX0213String.length("\u6410"), 1);
        assertTrue(JISX0213String.isValid("\u6414"));	// 搔
        assertEquals(JISX0213String.length("\u6414"), 1);
        assertTrue(JISX0213String.isValid("\u641E"));	// 搞
        assertEquals(JISX0213String.length("\u641E"), 1);
        assertTrue(JISX0213String.isValid("\u6422"));	// 搢
        assertEquals(JISX0213String.length("\u6422"), 1);
        assertTrue(JISX0213String.isValid("\u6425"));	// 搥
        assertEquals(JISX0213String.length("\u6425"), 1);
        assertTrue(JISX0213String.isValid("\u6429"));	// 搩
        assertEquals(JISX0213String.length("\u6429"), 1);
        assertTrue(JISX0213String.isValid("\u642F"));	// 搯
        assertEquals(JISX0213String.length("\u642F"), 1);
        assertTrue(JISX0213String.isValid("\u6451"));	// 摑
        assertEquals(JISX0213String.length("\u6451"), 1);
        assertTrue(JISX0213String.isValid("\u645A"));	// 摚
        assertEquals(JISX0213String.length("\u645A"), 1);
        assertTrue(JISX0213String.isValid("\u645B"));	// 摛
        assertEquals(JISX0213String.length("\u645B"), 1);
        assertTrue(JISX0213String.isValid("\u645D"));	// 摝
        assertEquals(JISX0213String.length("\u645D"), 1);
        assertTrue(JISX0213String.isValid("\u646D"));	// 摭
        assertEquals(JISX0213String.length("\u646D"), 1);
        assertTrue(JISX0213String.isValid("\u6473"));	// 摳
        assertEquals(JISX0213String.length("\u6473"), 1);
        assertTrue(JISX0213String.isValid("\u647D"));	// 摽
        assertEquals(JISX0213String.length("\u647D"), 1);
        assertTrue(JISX0213String.isValid("\u6487"));	// 撇
        assertEquals(JISX0213String.length("\u6487"), 1);
        assertTrue(JISX0213String.isValid("\u6491"));	// 撑
        assertEquals(JISX0213String.length("\u6491"), 1);
        assertTrue(JISX0213String.isValid("\u649F"));	// 撟
        assertEquals(JISX0213String.length("\u649F"), 1);
        assertTrue(JISX0213String.isValid("\u64BE"));	// 撾
        assertEquals(JISX0213String.length("\u64BE"), 1);
        assertTrue(JISX0213String.isValid("\u64BF"));	// 撿
        assertEquals(JISX0213String.length("\u64BF"), 1);
        assertTrue(JISX0213String.isValid("\u64C4"));	// 擄
        assertEquals(JISX0213String.length("\u64C4"), 1);
        assertTrue(JISX0213String.isValid("\u64CA"));	// 擊
        assertEquals(JISX0213String.length("\u64CA"), 1);
        assertTrue(JISX0213String.isValid("\u64CB"));	// 擋
        assertEquals(JISX0213String.length("\u64CB"), 1);
        assertTrue(JISX0213String.isValid("\u64CC"));	// 擌
        assertEquals(JISX0213String.length("\u64CC"), 1);
        assertTrue(JISX0213String.isValid("\u64D0"));	// 擐
        assertEquals(JISX0213String.length("\u64D0"), 1);
        assertTrue(JISX0213String.isValid("\u64D5"));	// 擕
        assertEquals(JISX0213String.length("\u64D5"), 1);
        assertTrue(JISX0213String.isValid("\u64D7"));	// 擗
        assertEquals(JISX0213String.length("\u64D7"), 1);
        assertTrue(JISX0213String.isValid("\u64E4"));	// 擤
        assertEquals(JISX0213String.length("\u64E4"), 1);
        assertTrue(JISX0213String.isValid("\u64E5"));	// 擥
        assertEquals(JISX0213String.length("\u64E5"), 1);
        assertTrue(JISX0213String.isValid("\u64F7"));	// 擷
        assertEquals(JISX0213String.length("\u64F7"), 1);
        assertTrue(JISX0213String.isValid("\u64FB"));	// 擻
        assertEquals(JISX0213String.length("\u64FB"), 1);
        assertTrue(JISX0213String.isValid("\u64FF"));	// 擿
        assertEquals(JISX0213String.length("\u64FF"), 1);
        assertTrue(JISX0213String.isValid("\u6504"));	// 攄
        assertEquals(JISX0213String.length("\u6504"), 1);
        assertTrue(JISX0213String.isValid("\u650F"));	// 攏
        assertEquals(JISX0213String.length("\u650F"), 1);
        assertTrue(JISX0213String.isValid("\u6514"));	// 攔
        assertEquals(JISX0213String.length("\u6514"), 1);
        assertTrue(JISX0213String.isValid("\u6516"));	// 攖
        assertEquals(JISX0213String.length("\u6516"), 1);
        assertTrue(JISX0213String.isValid("\u651E"));	// 攞
        assertEquals(JISX0213String.length("\u651E"), 1);
        assertTrue(JISX0213String.isValid("\u6522"));	// 攢
        assertEquals(JISX0213String.length("\u6522"), 1);
        assertTrue(JISX0213String.isValid("\u6529"));	// 攩
        assertEquals(JISX0213String.length("\u6529"), 1);
        assertTrue(JISX0213String.isValid("\u6554"));	// 敔
        assertEquals(JISX0213String.length("\u6554"), 1);
        assertTrue(JISX0213String.isValid("\u6567"));	// 敧
        assertEquals(JISX0213String.length("\u6567"), 1);
        assertTrue(JISX0213String.isValid("\u656B"));	// 敫
        assertEquals(JISX0213String.length("\u656B"), 1);
        assertTrue(JISX0213String.isValid("\u657A"));	// 敺
        assertEquals(JISX0213String.length("\u657A"), 1);
        assertTrue(JISX0213String.isValid("\u6581"));	// 斁
        assertEquals(JISX0213String.length("\u6581"), 1);
        assertTrue(JISX0213String.isValid("\u6585"));	// 斅
        assertEquals(JISX0213String.length("\u6585"), 1);
        assertTrue(JISX0213String.isValid("\u658A"));	// 斊
        assertEquals(JISX0213String.length("\u658A"), 1);
        assertTrue(JISX0213String.isValid("\u659D"));	// 斝
        assertEquals(JISX0213String.length("\u659D"), 1);
        assertTrue(JISX0213String.isValid("\u65B2"));	// 斲
        assertEquals(JISX0213String.length("\u65B2"), 1);
        assertTrue(JISX0213String.isValid("\u65BF"));	// 斿
        assertEquals(JISX0213String.length("\u65BF"), 1);
        assertTrue(JISX0213String.isValid("\u65C2"));	// 旂
        assertEquals(JISX0213String.length("\u65C2"), 1);
        assertTrue(JISX0213String.isValid("\u65C9"));	// 旉
        assertEquals(JISX0213String.length("\u65C9"), 1);
        assertTrue(JISX0213String.isValid("\u65D4"));	// 旔
        assertEquals(JISX0213String.length("\u65D4"), 1);
        assertTrue(JISX0213String.isValid("\u65F2"));	// 旲
        assertEquals(JISX0213String.length("\u65F2"), 1);
        assertTrue(JISX0213String.isValid("\u65F9"));	// 旹
        assertEquals(JISX0213String.length("\u65F9"), 1);
        assertTrue(JISX0213String.isValid("\u6604"));	// 昄
        assertEquals(JISX0213String.length("\u6604"), 1);
        assertTrue(JISX0213String.isValid("\u6608"));	// 昈
        assertEquals(JISX0213String.length("\u6608"), 1);
        assertTrue(JISX0213String.isValid("\u6621"));	// 昡
        assertEquals(JISX0213String.length("\u6621"), 1);
        assertTrue(JISX0213String.isValid("\u6622"));	// 昢
        assertEquals(JISX0213String.length("\u6622"), 1);
        assertTrue(JISX0213String.isValid("\u662A"));	// 昪
        assertEquals(JISX0213String.length("\u662A"), 1);
        assertTrue(JISX0213String.isValid("\u662B"));	// 昫
        assertEquals(JISX0213String.length("\u662B"), 1);
        assertTrue(JISX0213String.isValid("\u6630"));	// 昰
        assertEquals(JISX0213String.length("\u6630"), 1);
        assertTrue(JISX0213String.isValid("\u6633"));	// 昳
        assertEquals(JISX0213String.length("\u6633"), 1);
        assertTrue(JISX0213String.isValid("\u6645"));	// 晅
        assertEquals(JISX0213String.length("\u6645"), 1);
        assertTrue(JISX0213String.isValid("\u664C"));	// 晌
        assertEquals(JISX0213String.length("\u664C"), 1);
        assertTrue(JISX0213String.isValid("\u6651"));	// 晑
        assertEquals(JISX0213String.length("\u6651"), 1);
        assertTrue(JISX0213String.isValid("\u664E"));	// 晎
        assertEquals(JISX0213String.length("\u664E"), 1);
        assertTrue(JISX0213String.isValid("\u665B"));	// 晛
        assertEquals(JISX0213String.length("\u665B"), 1);
        assertTrue(JISX0213String.isValid("\u6661"));	// 晡
        assertEquals(JISX0213String.length("\u6661"), 1);
        assertTrue(JISX0213String.isValid("\u666A"));	// 晪
        assertEquals(JISX0213String.length("\u666A"), 1);
        assertTrue(JISX0213String.isValid("\u666B"));	// 晫
        assertEquals(JISX0213String.length("\u666B"), 1);
        assertTrue(JISX0213String.isValid("\u666C"));	// 晬
        assertEquals(JISX0213String.length("\u666C"), 1);
        assertTrue(JISX0213String.isValid("\u6677"));	// 晷
        assertEquals(JISX0213String.length("\u6677"), 1);
        assertTrue(JISX0213String.isValid("\u6678"));	// 晸
        assertEquals(JISX0213String.length("\u6678"), 1);
        assertTrue(JISX0213String.isValid("\u667B"));	// 晻
        assertEquals(JISX0213String.length("\u667B"), 1);
        assertTrue(JISX0213String.isValid("\u6680"));	// 暀
        assertEquals(JISX0213String.length("\u6680"), 1);
        assertTrue(JISX0213String.isValid("\u668D"));	// 暍
        assertEquals(JISX0213String.length("\u668D"), 1);
        assertTrue(JISX0213String.isValid("\u6690"));	// 暐
        assertEquals(JISX0213String.length("\u6690"), 1);
        assertTrue(JISX0213String.isValid("\u6692"));	// 暒
        assertEquals(JISX0213String.length("\u6692"), 1);
        assertTrue(JISX0213String.isValid("\u66AD"));	// 暭
        assertEquals(JISX0213String.length("\u66AD"), 1);
        assertTrue(JISX0213String.isValid("\u66B1"));	// 暱
        assertEquals(JISX0213String.length("\u66B1"), 1);
        assertTrue(JISX0213String.isValid("\u66B5"));	// 暵
        assertEquals(JISX0213String.length("\u66B5"), 1);
        assertTrue(JISX0213String.isValid("\u66BB"));	// 暻
        assertEquals(JISX0213String.length("\u66BB"), 1);
        assertTrue(JISX0213String.isValid("\u66C8"));	// 曈
        assertEquals(JISX0213String.length("\u66C8"), 1);
        assertTrue(JISX0213String.isValid("\u66DB"));	// 曛
        assertEquals(JISX0213String.length("\u66DB"), 1);
        assertTrue(JISX0213String.isValid("\u66E8"));	// 曨
        assertEquals(JISX0213String.length("\u66E8"), 1);
        assertTrue(JISX0213String.isValid("\u66EC"));	// 曬
        assertEquals(JISX0213String.length("\u66EC"), 1);
        assertTrue(JISX0213String.isValid("\u6705"));	// 朅
        assertEquals(JISX0213String.length("\u6705"), 1);
        assertTrue(JISX0213String.isValid("\u6713"));	// 朓
        assertEquals(JISX0213String.length("\u6713"), 1);
        assertTrue(JISX0213String.isValid("\u6719"));	// 朙
        assertEquals(JISX0213String.length("\u6719"), 1);
        assertTrue(JISX0213String.isValid("\u6733"));	// 朳
        assertEquals(JISX0213String.length("\u6733"), 1);
        assertTrue(JISX0213String.isValid("\u6747"));	// 杇
        assertEquals(JISX0213String.length("\u6747"), 1);
        assertTrue(JISX0213String.isValid("\u6748"));	// 杈
        assertEquals(JISX0213String.length("\u6748"), 1);
        assertTrue(JISX0213String.isValid("\u674C"));	// 杌
        assertEquals(JISX0213String.length("\u674C"), 1);
        assertTrue(JISX0213String.isValid("\u6754"));	// 杔
        assertEquals(JISX0213String.length("\u6754"), 1);
        assertTrue(JISX0213String.isValid("\u675D"));	// 杝
        assertEquals(JISX0213String.length("\u675D"), 1);
        assertTrue(JISX0213String.isValid("\u6774"));	// 杴
        assertEquals(JISX0213String.length("\u6774"), 1);
        assertTrue(JISX0213String.isValid("\u6776"));	// 杶
        assertEquals(JISX0213String.length("\u6776"), 1);
        assertTrue(JISX0213String.isValid("\u677B"));	// 杻
        assertEquals(JISX0213String.length("\u677B"), 1);
        assertTrue(JISX0213String.isValid("\u6781"));	// 极
        assertEquals(JISX0213String.length("\u6781"), 1);
        assertTrue(JISX0213String.isValid("\u6793"));	// 枓
        assertEquals(JISX0213String.length("\u6793"), 1);
        assertTrue(JISX0213String.isValid("\u6798"));	// 枘
        assertEquals(JISX0213String.length("\u6798"), 1);
        assertTrue(JISX0213String.isValid("\u679B"));	// 枛
        assertEquals(JISX0213String.length("\u679B"), 1);
        assertTrue(JISX0213String.isValid("\u67B0"));	// 枰
        assertEquals(JISX0213String.length("\u67B0"), 1);
        assertTrue(JISX0213String.isValid("\u67B2"));	// 枲
        assertEquals(JISX0213String.length("\u67B2"), 1);
        assertTrue(JISX0213String.isValid("\u67F9"));	// 柹
        assertEquals(JISX0213String.length("\u67F9"), 1);
        assertTrue(JISX0213String.isValid("\u67C3"));	// 柃
        assertEquals(JISX0213String.length("\u67C3"), 1);
        assertTrue(JISX0213String.isValid("\u67C8"));	// 柈
        assertEquals(JISX0213String.length("\u67C8"), 1);
        assertTrue(JISX0213String.isValid("\u67D2"));	// 柒
        assertEquals(JISX0213String.length("\u67D2"), 1);
        assertTrue(JISX0213String.isValid("\u67D7"));	// 柗
        assertEquals(JISX0213String.length("\u67D7"), 1);
        assertTrue(JISX0213String.isValid("\u67D9"));	// 柙
        assertEquals(JISX0213String.length("\u67D9"), 1);
        assertTrue(JISX0213String.isValid("\u67F0"));	// 柰
        assertEquals(JISX0213String.length("\u67F0"), 1);
        assertTrue(JISX0213String.isValid("\u67F7"));	// 柷
        assertEquals(JISX0213String.length("\u67F7"), 1);
        assertTrue(JISX0213String.isValid("\u681D"));	// 栝
        assertEquals(JISX0213String.length("\u681D"), 1);
        assertTrue(JISX0213String.isValid("\u681F"));	// 栟
        assertEquals(JISX0213String.length("\u681F"), 1);
        assertTrue(JISX0213String.isValid("\u682C"));	// 栬
        assertEquals(JISX0213String.length("\u682C"), 1);
        assertTrue(JISX0213String.isValid("\u682D"));	// 栭
        assertEquals(JISX0213String.length("\u682D"), 1);
        assertTrue(JISX0213String.isValid("\u6831"));	// 栱
        assertEquals(JISX0213String.length("\u6831"), 1);
        assertTrue(JISX0213String.isValid("\u6833"));	// 栳
        assertEquals(JISX0213String.length("\u6833"), 1);
        assertTrue(JISX0213String.isValid("\u683B"));	// 栻
        assertEquals(JISX0213String.length("\u683B"), 1);
        assertTrue(JISX0213String.isValid("\u6845"));	// 桅
        assertEquals(JISX0213String.length("\u6845"), 1);
        assertTrue(JISX0213String.isValid("\u684C"));	// 桌
        assertEquals(JISX0213String.length("\u684C"), 1);
        assertTrue(JISX0213String.isValid("\u6855"));	// 桕
        assertEquals(JISX0213String.length("\u6855"), 1);
        assertTrue(JISX0213String.isValid("\u6857"));	// 桗
        assertEquals(JISX0213String.length("\u6857"), 1);
        assertTrue(JISX0213String.isValid("\u685B"));	// 桛
        assertEquals(JISX0213String.length("\u685B"), 1);
        assertTrue(JISX0213String.isValid("\u686B"));	// 桫
        assertEquals(JISX0213String.length("\u686B"), 1);
        assertTrue(JISX0213String.isValid("\u686E"));	// 桮
        assertEquals(JISX0213String.length("\u686E"), 1);
        assertTrue(JISX0213String.isValid("\u6872"));	// 桲
        assertEquals(JISX0213String.length("\u6872"), 1);
        assertTrue(JISX0213String.isValid("\u6875"));	// 桵
        assertEquals(JISX0213String.length("\u6875"), 1);
        assertTrue(JISX0213String.isValid("\u687A"));	// 桺
        assertEquals(JISX0213String.length("\u687A"), 1);
        assertTrue(JISX0213String.isValid("\u687C"));	// 桼
        assertEquals(JISX0213String.length("\u687C"), 1);
        assertTrue(JISX0213String.isValid("\u6882"));	// 梂
        assertEquals(JISX0213String.length("\u6882"), 1);
        assertTrue(JISX0213String.isValid("\u6896"));	// 梖
        assertEquals(JISX0213String.length("\u6896"), 1);
        assertTrue(JISX0213String.isValid("\u6898"));	// 梘
        assertEquals(JISX0213String.length("\u6898"), 1);
        assertTrue(JISX0213String.isValid("\u689A"));	// 梚
        assertEquals(JISX0213String.length("\u689A"), 1);
        assertTrue(JISX0213String.isValid("\u689C"));	// 梜
        assertEquals(JISX0213String.length("\u689C"), 1);
        assertTrue(JISX0213String.isValid("\u68A3"));	// 梣
        assertEquals(JISX0213String.length("\u68A3"), 1);
        assertTrue(JISX0213String.isValid("\u68A5"));	// 梥
        assertEquals(JISX0213String.length("\u68A5"), 1);
        assertTrue(JISX0213String.isValid("\u68AA"));	// 梪
        assertEquals(JISX0213String.length("\u68AA"), 1);
        assertTrue(JISX0213String.isValid("\u68B2"));	// 梲
        assertEquals(JISX0213String.length("\u68B2"), 1);
        assertTrue(JISX0213String.isValid("\u68BB"));	// 梻
        assertEquals(JISX0213String.length("\u68BB"), 1);
        assertTrue(JISX0213String.isValid("\u68C5"));	// 棅
        assertEquals(JISX0213String.length("\u68C5"), 1);
        assertTrue(JISX0213String.isValid("\u68CC"));	// 棌
        assertEquals(JISX0213String.length("\u68CC"), 1);
        assertTrue(JISX0213String.isValid("\u68D0"));	// 棐
        assertEquals(JISX0213String.length("\u68D0"), 1);
        assertTrue(JISX0213String.isValid("\u68D6"));	// 棖
        assertEquals(JISX0213String.length("\u68D6"), 1);
        assertTrue(JISX0213String.isValid("\u68D9"));	// 棙
        assertEquals(JISX0213String.length("\u68D9"), 1);
        assertTrue(JISX0213String.isValid("\u68E5"));	// 棥
        assertEquals(JISX0213String.length("\u68E5"), 1);
        assertTrue(JISX0213String.isValid("\u68E8"));	// 棨
        assertEquals(JISX0213String.length("\u68E8"), 1);
        assertTrue(JISX0213String.isValid("\u68EC"));	// 棬
        assertEquals(JISX0213String.length("\u68EC"), 1);
        assertTrue(JISX0213String.isValid("\u68ED"));	// 棭
        assertEquals(JISX0213String.length("\u68ED"), 1);
        assertTrue(JISX0213String.isValid("\u68F0"));	// 棰
        assertEquals(JISX0213String.length("\u68F0"), 1);
        assertTrue(JISX0213String.isValid("\u68F1"));	// 棱
        assertEquals(JISX0213String.length("\u68F1"), 1);
        assertTrue(JISX0213String.isValid("\u68FB"));	// 棻
        assertEquals(JISX0213String.length("\u68FB"), 1);
        assertTrue(JISX0213String.isValid("\u68FC"));	// 棼
        assertEquals(JISX0213String.length("\u68FC"), 1);
        assertTrue(JISX0213String.isValid("\u690A"));	// 椊
        assertEquals(JISX0213String.length("\u690A"), 1);
        assertTrue(JISX0213String.isValid("\u6935"));	// 椵
        assertEquals(JISX0213String.length("\u6935"), 1);
        assertTrue(JISX0213String.isValid("\u693B"));	// 椻
        assertEquals(JISX0213String.length("\u693B"), 1);
        assertTrue(JISX0213String.isValid("\u6942"));	// 楂
        assertEquals(JISX0213String.length("\u6942"), 1);
        assertTrue(JISX0213String.isValid("\u6949"));	// 楉
        assertEquals(JISX0213String.length("\u6949"), 1);
        assertTrue(JISX0213String.isValid("\u6957"));	// 楗
        assertEquals(JISX0213String.length("\u6957"), 1);
        assertTrue(JISX0213String.isValid("\u6963"));	// 楣
        assertEquals(JISX0213String.length("\u6963"), 1);
        assertTrue(JISX0213String.isValid("\u6964"));	// 楤
        assertEquals(JISX0213String.length("\u6964"), 1);
        assertTrue(JISX0213String.isValid("\u6969"));	// 楩
        assertEquals(JISX0213String.length("\u6969"), 1);
        assertTrue(JISX0213String.isValid("\u696C"));	// 楬
        assertEquals(JISX0213String.length("\u696C"), 1);
        assertTrue(JISX0213String.isValid("\u6972"));	// 楲
        assertEquals(JISX0213String.length("\u6972"), 1);
        assertTrue(JISX0213String.isValid("\u697A"));	// 楺
        assertEquals(JISX0213String.length("\u697A"), 1);
        assertTrue(JISX0213String.isValid("\u697F"));	// 楿
        assertEquals(JISX0213String.length("\u697F"), 1);
        assertTrue(JISX0213String.isValid("\u6980"));	// 榀
        assertEquals(JISX0213String.length("\u6980"), 1);
        assertTrue(JISX0213String.isValid("\u6992"));	// 榒
        assertEquals(JISX0213String.length("\u6992"), 1);
        assertTrue(JISX0213String.isValid("\u6996"));	// 榖
        assertEquals(JISX0213String.length("\u6996"), 1);
        assertTrue(JISX0213String.isValid("\u69A5"));	// 榥
        assertEquals(JISX0213String.length("\u69A5"), 1);
        assertTrue(JISX0213String.isValid("\u69A6"));	// 榦
        assertEquals(JISX0213String.length("\u69A6"), 1);
        assertTrue(JISX0213String.isValid("\u69AD"));	// 榭
        assertEquals(JISX0213String.length("\u69AD"), 1);
        assertTrue(JISX0213String.isValid("\u69B7"));	// 榷
        assertEquals(JISX0213String.length("\u69B7"), 1);
        assertTrue(JISX0213String.isValid("\u69BA"));	// 榺
        assertEquals(JISX0213String.length("\u69BA"), 1);
        assertTrue(JISX0213String.isValid("\u69BC"));	// 榼
        assertEquals(JISX0213String.length("\u69BC"), 1);
        assertTrue(JISX0213String.isValid("\u69D1"));	// 槑
        assertEquals(JISX0213String.length("\u69D1"), 1);
        assertTrue(JISX0213String.isValid("\u69D6"));	// 槖
        assertEquals(JISX0213String.length("\u69D6"), 1);
        assertTrue(JISX0213String.isValid("\u69EE"));	// 槮
        assertEquals(JISX0213String.length("\u69EE"), 1);
        assertTrue(JISX0213String.isValid("\u69EF"));	// 槯
        assertEquals(JISX0213String.length("\u69EF"), 1);
        assertTrue(JISX0213String.isValid("\u69F3"));	// 槳
        assertEquals(JISX0213String.length("\u69F3"), 1);
        assertTrue(JISX0213String.isValid("\u69F5"));	// 槵
        assertEquals(JISX0213String.length("\u69F5"), 1);
        assertTrue(JISX0213String.isValid("\u69FE"));	// 槾
        assertEquals(JISX0213String.length("\u69FE"), 1);
        assertTrue(JISX0213String.isValid("\u6A0F"));	// 樏
        assertEquals(JISX0213String.length("\u6A0F"), 1);
        assertTrue(JISX0213String.isValid("\u6A11"));	// 樑
        assertEquals(JISX0213String.length("\u6A11"), 1);
        assertTrue(JISX0213String.isValid("\u6A15"));	// 樕
        assertEquals(JISX0213String.length("\u6A15"), 1);
        assertTrue(JISX0213String.isValid("\u6A1A"));	// 樚
        assertEquals(JISX0213String.length("\u6A1A"), 1);
        assertTrue(JISX0213String.isValid("\u6A1D"));	// 樝
        assertEquals(JISX0213String.length("\u6A1D"), 1);
        assertTrue(JISX0213String.isValid("\u6A32"));	// 樲
        assertEquals(JISX0213String.length("\u6A32"), 1);
        assertTrue(JISX0213String.isValid("\u6A34"));	// 樴
        assertEquals(JISX0213String.length("\u6A34"), 1);
        assertTrue(JISX0213String.isValid("\u6A3B"));	// 樻
        assertEquals(JISX0213String.length("\u6A3B"), 1);
        assertTrue(JISX0213String.isValid("\u6A3E"));	// 樾
        assertEquals(JISX0213String.length("\u6A3E"), 1);
        assertTrue(JISX0213String.isValid("\u6A3F"));	// 樿
        assertEquals(JISX0213String.length("\u6A3F"), 1);
        assertTrue(JISX0213String.isValid("\u6A45"));	// 橅
        assertEquals(JISX0213String.length("\u6A45"), 1);
        assertTrue(JISX0213String.isValid("\u6A49"));	// 橉
        assertEquals(JISX0213String.length("\u6A49"), 1);
        assertTrue(JISX0213String.isValid("\u6A4E"));	// 橎
        assertEquals(JISX0213String.length("\u6A4E"), 1);
        assertTrue(JISX0213String.isValid("\u6A50"));	// 橐
        assertEquals(JISX0213String.length("\u6A50"), 1);
        assertTrue(JISX0213String.isValid("\u6A52"));	// 橒
        assertEquals(JISX0213String.length("\u6A52"), 1);
        assertTrue(JISX0213String.isValid("\u6A56"));	// 橖
        assertEquals(JISX0213String.length("\u6A56"), 1);
        assertTrue(JISX0213String.isValid("\u6A5B"));	// 橛
        assertEquals(JISX0213String.length("\u6A5B"), 1);
        assertTrue(JISX0213String.isValid("\u6A64"));	// 橤
        assertEquals(JISX0213String.length("\u6A64"), 1);
        assertTrue(JISX0213String.isValid("\u6A83"));	// 檃
        assertEquals(JISX0213String.length("\u6A83"), 1);
        assertTrue(JISX0213String.isValid("\u6A89"));	// 檉
        assertEquals(JISX0213String.length("\u6A89"), 1);
        assertTrue(JISX0213String.isValid("\u6A8B"));	// 檋
        assertEquals(JISX0213String.length("\u6A8B"), 1);
        assertTrue(JISX0213String.isValid("\u6A91"));	// 檑
        assertEquals(JISX0213String.length("\u6A91"), 1);
        assertTrue(JISX0213String.isValid("\u6A9D"));	// 檝
        assertEquals(JISX0213String.length("\u6A9D"), 1);
        assertTrue(JISX0213String.isValid("\u6A9E"));	// 檞
        assertEquals(JISX0213String.length("\u6A9E"), 1);
        assertTrue(JISX0213String.isValid("\u6A9F"));	// 檟
        assertEquals(JISX0213String.length("\u6A9F"), 1);
        assertTrue(JISX0213String.isValid("\u6AA5"));	// 檥
        assertEquals(JISX0213String.length("\u6AA5"), 1);
        assertTrue(JISX0213String.isValid("\u6AAB"));	// 檫
        assertEquals(JISX0213String.length("\u6AAB"), 1);
        assertTrue(JISX0213String.isValid("\u6ABD"));	// 檽
        assertEquals(JISX0213String.length("\u6ABD"), 1);
        assertTrue(JISX0213String.isValid("\u6AC6"));	// 櫆
        assertEquals(JISX0213String.length("\u6AC6"), 1);
        assertTrue(JISX0213String.isValid("\u6AD0"));	// 櫐
        assertEquals(JISX0213String.length("\u6AD0"), 1);
        assertTrue(JISX0213String.isValid("\u6AD4"));	// 櫔
        assertEquals(JISX0213String.length("\u6AD4"), 1);
        assertTrue(JISX0213String.isValid("\u6ADC"));	// 櫜
        assertEquals(JISX0213String.length("\u6ADC"), 1);
        assertTrue(JISX0213String.isValid("\u6ADD"));	// 櫝
        assertEquals(JISX0213String.length("\u6ADD"), 1);
        assertTrue(JISX0213String.isValid("\u6AE7"));	// 櫧
        assertEquals(JISX0213String.length("\u6AE7"), 1);
        assertTrue(JISX0213String.isValid("\u6AEC"));	// 櫬
        assertEquals(JISX0213String.length("\u6AEC"), 1);
        assertTrue(JISX0213String.isValid("\u6AF1"));	// 櫱
        assertEquals(JISX0213String.length("\u6AF1"), 1);
        assertTrue(JISX0213String.isValid("\u6AF2"));	// 櫲
        assertEquals(JISX0213String.length("\u6AF2"), 1);
        assertTrue(JISX0213String.isValid("\u6AFD"));	// 櫽
        assertEquals(JISX0213String.length("\u6AFD"), 1);
        assertTrue(JISX0213String.isValid("\u6B0F"));	// 欏
        assertEquals(JISX0213String.length("\u6B0F"), 1);
        assertTrue(JISX0213String.isValid("\u6B10"));	// 欐
        assertEquals(JISX0213String.length("\u6B10"), 1);
        assertTrue(JISX0213String.isValid("\u6B11"));	// 欑
        assertEquals(JISX0213String.length("\u6B11"), 1);
        assertTrue(JISX0213String.isValid("\u6B17"));	// 欗
        assertEquals(JISX0213String.length("\u6B17"), 1);
        assertTrue(JISX0213String.isValid("\u6B1B"));	// 欛
        assertEquals(JISX0213String.length("\u6B1B"), 1);
        assertTrue(JISX0213String.isValid("\u6B1E"));	// 欞
        assertEquals(JISX0213String.length("\u6B1E"), 1);
        assertTrue(JISX0213String.isValid("\u6B2C"));	// 欬
        assertEquals(JISX0213String.length("\u6B2C"), 1);
        assertTrue(JISX0213String.isValid("\u6B2F"));	// 欯
        assertEquals(JISX0213String.length("\u6B2F"), 1);
        assertTrue(JISX0213String.isValid("\u6B35"));	// 欵
        assertEquals(JISX0213String.length("\u6B35"), 1);
        assertTrue(JISX0213String.isValid("\u6B46"));	// 歆
        assertEquals(JISX0213String.length("\u6B46"), 1);
        assertTrue(JISX0213String.isValid("\u6B4A"));	// 歊
        assertEquals(JISX0213String.length("\u6B4A"), 1);
        assertTrue(JISX0213String.isValid("\u6B56"));	// 歖
        assertEquals(JISX0213String.length("\u6B56"), 1);
        assertTrue(JISX0213String.isValid("\u6B58"));	// 歘
        assertEquals(JISX0213String.length("\u6B58"), 1);
        assertTrue(JISX0213String.isValid("\u6B60"));	// 歠
        assertEquals(JISX0213String.length("\u6B60"), 1);
        assertTrue(JISX0213String.isValid("\u6B67"));	// 歧
        assertEquals(JISX0213String.length("\u6B67"), 1);
        assertTrue(JISX0213String.isValid("\u6B75"));	// 歵
        assertEquals(JISX0213String.length("\u6B75"), 1);
        assertTrue(JISX0213String.isValid("\u6B82"));	// 殂
        assertEquals(JISX0213String.length("\u6B82"), 1);
        assertTrue(JISX0213String.isValid("\u6B9B"));	// 殛
        assertEquals(JISX0213String.length("\u6B9B"), 1);
        assertTrue(JISX0213String.isValid("\u6BA9"));	// 殩
        assertEquals(JISX0213String.length("\u6BA9"), 1);
        assertTrue(JISX0213String.isValid("\u6BAD"));	// 殭
        assertEquals(JISX0213String.length("\u6BAD"), 1);
        assertTrue(JISX0213String.isValid("\u6BAE"));	// 殮
        assertEquals(JISX0213String.length("\u6BAE"), 1);
        assertTrue(JISX0213String.isValid("\u6BBD"));	// 殽
        assertEquals(JISX0213String.length("\u6BBD"), 1);
        assertTrue(JISX0213String.isValid("\u6BBE"));	// 殾
        assertEquals(JISX0213String.length("\u6BBE"), 1);
        assertTrue(JISX0213String.isValid("\u6BC9"));	// 毉
        assertEquals(JISX0213String.length("\u6BC9"), 1);
        assertTrue(JISX0213String.isValid("\u6BDA"));	// 毚
        assertEquals(JISX0213String.length("\u6BDA"), 1);
        assertTrue(JISX0213String.isValid("\u6BE6"));	// 毦
        assertEquals(JISX0213String.length("\u6BE6"), 1);
        assertTrue(JISX0213String.isValid("\u6BE7"));	// 毧
        assertEquals(JISX0213String.length("\u6BE7"), 1);
        assertTrue(JISX0213String.isValid("\u6BEE"));	// 毮
        assertEquals(JISX0213String.length("\u6BEE"), 1);
        assertTrue(JISX0213String.isValid("\u6BF1"));	// 毱
        assertEquals(JISX0213String.length("\u6BF1"), 1);
        assertTrue(JISX0213String.isValid("\u6BFF"));	// 毿
        assertEquals(JISX0213String.length("\u6BFF"), 1);
        assertTrue(JISX0213String.isValid("\u6C02"));	// 氂
        assertEquals(JISX0213String.length("\u6C02"), 1);
        assertTrue(JISX0213String.isValid("\u6C05"));	// 氅
        assertEquals(JISX0213String.length("\u6C05"), 1);
        assertTrue(JISX0213String.isValid("\u6C0E"));	// 氎
        assertEquals(JISX0213String.length("\u6C0E"), 1);
        assertTrue(JISX0213String.isValid("\u6C10"));	// 氐
        assertEquals(JISX0213String.length("\u6C10"), 1);
        assertTrue(JISX0213String.isValid("\u6C33"));	// 氳
        assertEquals(JISX0213String.length("\u6C33"), 1);
        assertTrue(JISX0213String.isValid("\u6C35"));	// 氵
        assertEquals(JISX0213String.length("\u6C35"), 1);
        assertTrue(JISX0213String.isValid("\u6C36"));	// 氶
        assertEquals(JISX0213String.length("\u6C36"), 1);
        assertTrue(JISX0213String.isValid("\u6C3A"));	// 氺
        assertEquals(JISX0213String.length("\u6C3A"), 1);
        assertTrue(JISX0213String.isValid("\u6C4D"));	// 汍
        assertEquals(JISX0213String.length("\u6C4D"), 1);
        assertTrue(JISX0213String.isValid("\u6C59"));	// 汙
        assertEquals(JISX0213String.length("\u6C59"), 1);
        assertTrue(JISX0213String.isValid("\u6C5B"));	// 汛
        assertEquals(JISX0213String.length("\u6C5B"), 1);
        assertTrue(JISX0213String.isValid("\u6C6D"));	// 汭
        assertEquals(JISX0213String.length("\u6C6D"), 1);
        assertTrue(JISX0213String.isValid("\u6C74"));	// 汴
        assertEquals(JISX0213String.length("\u6C74"), 1);
        assertTrue(JISX0213String.isValid("\u6C76"));	// 汶
        assertEquals(JISX0213String.length("\u6C76"), 1);
        assertTrue(JISX0213String.isValid("\u6C85"));	// 沅
        assertEquals(JISX0213String.length("\u6C85"), 1);
        assertTrue(JISX0213String.isValid("\u6C89"));	// 沉
        assertEquals(JISX0213String.length("\u6C89"), 1);
        assertTrue(JISX0213String.isValid("\u6C94"));	// 沔
        assertEquals(JISX0213String.length("\u6C94"), 1);
        assertTrue(JISX0213String.isValid("\u6C95"));	// 沕
        assertEquals(JISX0213String.length("\u6C95"), 1);
        assertTrue(JISX0213String.isValid("\u6C97"));	// 沗
        assertEquals(JISX0213String.length("\u6C97"), 1);
        assertTrue(JISX0213String.isValid("\u6C98"));	// 沘
        assertEquals(JISX0213String.length("\u6C98"), 1);
        assertTrue(JISX0213String.isValid("\u6C9C"));	// 沜
        assertEquals(JISX0213String.length("\u6C9C"), 1);
        assertTrue(JISX0213String.isValid("\u6CC2"));	// 泂
        assertEquals(JISX0213String.length("\u6CC2"), 1);
        assertTrue(JISX0213String.isValid("\u6CC6"));	// 泆
        assertEquals(JISX0213String.length("\u6CC6"), 1);
        assertTrue(JISX0213String.isValid("\u6CD0"));	// 泐
        assertEquals(JISX0213String.length("\u6CD0"), 1);
        assertTrue(JISX0213String.isValid("\u6CD4"));	// 泔
        assertEquals(JISX0213String.length("\u6CD4"), 1);
        assertTrue(JISX0213String.isValid("\u6CD6"));	// 泖
        assertEquals(JISX0213String.length("\u6CD6"), 1);
        assertTrue(JISX0213String.isValid("\u6CDC"));	// 泜
        assertEquals(JISX0213String.length("\u6CDC"), 1);
        assertTrue(JISX0213String.isValid("\u6CE0"));	// 泠
        assertEquals(JISX0213String.length("\u6CE0"), 1);
        assertTrue(JISX0213String.isValid("\u6CE9"));	// 泩
        assertEquals(JISX0213String.length("\u6CE9"), 1);
        assertTrue(JISX0213String.isValid("\u6CEB"));	// 泫
        assertEquals(JISX0213String.length("\u6CEB"), 1);
        assertTrue(JISX0213String.isValid("\u6CEC"));	// 泬
        assertEquals(JISX0213String.length("\u6CEC"), 1);
        assertTrue(JISX0213String.isValid("\u6CEE"));	// 泮
        assertEquals(JISX0213String.length("\u6CEE"), 1);
        assertTrue(JISX0213String.isValid("\u6D0A"));	// 洊
        assertEquals(JISX0213String.length("\u6D0A"), 1);
        assertTrue(JISX0213String.isValid("\u6D0E"));	// 洎
        assertEquals(JISX0213String.length("\u6D0E"), 1);
        assertTrue(JISX0213String.isValid("\u6D26"));	// 洦
        assertEquals(JISX0213String.length("\u6D26"), 1);
        assertTrue(JISX0213String.isValid("\u6D27"));	// 洧
        assertEquals(JISX0213String.length("\u6D27"), 1);
        assertTrue(JISX0213String.isValid("\u6C67"));	// 汧
        assertEquals(JISX0213String.length("\u6C67"), 1);
        assertTrue(JISX0213String.isValid("\u6D2E"));	// 洮
        assertEquals(JISX0213String.length("\u6D2E"), 1);
        assertTrue(JISX0213String.isValid("\u6D2F"));	// 洯
        assertEquals(JISX0213String.length("\u6D2F"), 1);
        assertTrue(JISX0213String.isValid("\u6D31"));	// 洱
        assertEquals(JISX0213String.length("\u6D31"), 1);
        assertTrue(JISX0213String.isValid("\u6D39"));	// 洹
        assertEquals(JISX0213String.length("\u6D39"), 1);
        assertTrue(JISX0213String.isValid("\u6D3C"));	// 洼
        assertEquals(JISX0213String.length("\u6D3C"), 1);
        assertTrue(JISX0213String.isValid("\u6D3F"));	// 洿
        assertEquals(JISX0213String.length("\u6D3F"), 1);
        assertTrue(JISX0213String.isValid("\u6D5E"));	// 浞
        assertEquals(JISX0213String.length("\u6D5E"), 1);
        assertTrue(JISX0213String.isValid("\u6D65"));	// 浥
        assertEquals(JISX0213String.length("\u6D65"), 1);
        assertTrue(JISX0213String.isValid("\u6D70"));	// 浰
        assertEquals(JISX0213String.length("\u6D70"), 1);
        assertTrue(JISX0213String.isValid("\u6D82"));	// 涂
        assertEquals(JISX0213String.length("\u6D82"), 1);
        assertTrue(JISX0213String.isValid("\u6D91"));	// 涑
        assertEquals(JISX0213String.length("\u6D91"), 1);
        assertTrue(JISX0213String.isValid("\u6D94"));	// 涔
        assertEquals(JISX0213String.length("\u6D94"), 1);
        assertTrue(JISX0213String.isValid("\u6D98"));	// 涘
        assertEquals(JISX0213String.length("\u6D98"), 1);
        assertTrue(JISX0213String.isValid("\u6DAA"));	// 涪
        assertEquals(JISX0213String.length("\u6DAA"), 1);
        assertTrue(JISX0213String.isValid("\u6DB4"));	// 涴
        assertEquals(JISX0213String.length("\u6DB4"), 1);
        assertTrue(JISX0213String.isValid("\u6DBF"));	// 涿
        assertEquals(JISX0213String.length("\u6DBF"), 1);
        assertTrue(JISX0213String.isValid("\u6DC4"));	// 淄
        assertEquals(JISX0213String.length("\u6DC4"), 1);
        assertTrue(JISX0213String.isValid("\u6DC8"));	// 淈
        assertEquals(JISX0213String.length("\u6DC8"), 1);
        assertTrue(JISX0213String.isValid("\u6DCE"));	// 淎
        assertEquals(JISX0213String.length("\u6DCE"), 1);
        assertTrue(JISX0213String.isValid("\u6DD6"));	// 淖
        assertEquals(JISX0213String.length("\u6DD6"), 1);
        assertTrue(JISX0213String.isValid("\u6DDB"));	// 淛
        assertEquals(JISX0213String.length("\u6DDB"), 1);
        assertTrue(JISX0213String.isValid("\u6DDD"));	// 淝
        assertEquals(JISX0213String.length("\u6DDD"), 1);
        assertTrue(JISX0213String.isValid("\u6DDF"));	// 淟
        assertEquals(JISX0213String.length("\u6DDF"), 1);
        assertTrue(JISX0213String.isValid("\u6DE9"));	// 淩
        assertEquals(JISX0213String.length("\u6DE9"), 1);
        assertTrue(JISX0213String.isValid("\u6DF6"));	// 淶
        assertEquals(JISX0213String.length("\u6DF6"), 1);
        assertTrue(JISX0213String.isValid("\u6E1E"));	// 渞
        assertEquals(JISX0213String.length("\u6E1E"), 1);
        assertTrue(JISX0213String.isValid("\u6E22"));	// 渢
        assertEquals(JISX0213String.length("\u6E22"), 1);
        assertTrue(JISX0213String.isValid("\u6E32"));	// 渲
        assertEquals(JISX0213String.length("\u6E32"), 1);
        assertTrue(JISX0213String.isValid("\u6E36"));	// 渶
        assertEquals(JISX0213String.length("\u6E36"), 1);
        assertTrue(JISX0213String.isValid("\u6E44"));	// 湄
        assertEquals(JISX0213String.length("\u6E44"), 1);
        assertTrue(JISX0213String.isValid("\u6E48"));	// 湈
        assertEquals(JISX0213String.length("\u6E48"), 1);
        assertTrue(JISX0213String.isValid("\u6E49"));	// 湉
        assertEquals(JISX0213String.length("\u6E49"), 1);
        assertTrue(JISX0213String.isValid("\u6E4B"));	// 湋
        assertEquals(JISX0213String.length("\u6E4B"), 1);
        assertTrue(JISX0213String.isValid("\u6E4F"));	// 湏
        assertEquals(JISX0213String.length("\u6E4F"), 1);
        assertTrue(JISX0213String.isValid("\u6E51"));	// 湑
        assertEquals(JISX0213String.length("\u6E51"), 1);
        assertTrue(JISX0213String.isValid("\u6E53"));	// 湓
        assertEquals(JISX0213String.length("\u6E53"), 1);
        assertTrue(JISX0213String.isValid("\u6E54"));	// 湔
        assertEquals(JISX0213String.length("\u6E54"), 1);
        assertTrue(JISX0213String.isValid("\u6E57"));	// 湗
        assertEquals(JISX0213String.length("\u6E57"), 1);
        assertTrue(JISX0213String.isValid("\u6E5E"));	// 湞
        assertEquals(JISX0213String.length("\u6E5E"), 1);
        assertTrue(JISX0213String.isValid("\u6E63"));	// 湣
        assertEquals(JISX0213String.length("\u6E63"), 1);
        assertTrue(JISX0213String.isValid("\u6E93"));	// 溓
        assertEquals(JISX0213String.length("\u6E93"), 1);
        assertTrue(JISX0213String.isValid("\u6EA7"));	// 溧
        assertEquals(JISX0213String.length("\u6EA7"), 1);
        assertTrue(JISX0213String.isValid("\u6EB1"));	// 溱
        assertEquals(JISX0213String.length("\u6EB1"), 1);
        assertTrue(JISX0213String.isValid("\u6EC1"));	// 滁
        assertEquals(JISX0213String.length("\u6EC1"), 1);
        assertTrue(JISX0213String.isValid("\u6EC3"));	// 滃
        assertEquals(JISX0213String.length("\u6EC3"), 1);
        assertTrue(JISX0213String.isValid("\u6EC7"));	// 滇
        assertEquals(JISX0213String.length("\u6EC7"), 1);
        assertTrue(JISX0213String.isValid("\u6ECA"));	// 滊
        assertEquals(JISX0213String.length("\u6ECA"), 1);
        assertTrue(JISX0213String.isValid("\u6ECE"));	// 滎
        assertEquals(JISX0213String.length("\u6ECE"), 1);
        assertTrue(JISX0213String.isValid("\u6EEB"));	// 滫
        assertEquals(JISX0213String.length("\u6EEB"), 1);
        assertTrue(JISX0213String.isValid("\u6EF9"));	// 滹
        assertEquals(JISX0213String.length("\u6EF9"), 1);
        assertTrue(JISX0213String.isValid("\u6EFB"));	// 滻
        assertEquals(JISX0213String.length("\u6EFB"), 1);
        assertTrue(JISX0213String.isValid("\u6F0A"));	// 漊
        assertEquals(JISX0213String.length("\u6F0A"), 1);
        assertTrue(JISX0213String.isValid("\u6F0C"));	// 漌
        assertEquals(JISX0213String.length("\u6F0C"), 1);
        assertTrue(JISX0213String.isValid("\u6F18"));	// 漘
        assertEquals(JISX0213String.length("\u6F18"), 1);
        assertTrue(JISX0213String.isValid("\u6F1A"));	// 漚
        assertEquals(JISX0213String.length("\u6F1A"), 1);
        assertTrue(JISX0213String.isValid("\u6F2A"));	// 漪
        assertEquals(JISX0213String.length("\u6F2A"), 1);
        assertTrue(JISX0213String.isValid("\u6F2F"));	// 漯
        assertEquals(JISX0213String.length("\u6F2F"), 1);
        assertTrue(JISX0213String.isValid("\u6F33"));	// 漳
        assertEquals(JISX0213String.length("\u6F33"), 1);
        assertTrue(JISX0213String.isValid("\u6F36"));	// 漶
        assertEquals(JISX0213String.length("\u6F36"), 1);
        assertTrue(JISX0213String.isValid("\u6F3C"));	// 漼
        assertEquals(JISX0213String.length("\u6F3C"), 1);
        assertTrue(JISX0213String.isValid("\u6F51"));	// 潑
        assertEquals(JISX0213String.length("\u6F51"), 1);
        assertTrue(JISX0213String.isValid("\u6F52"));	// 潒
        assertEquals(JISX0213String.length("\u6F52"), 1);
        assertTrue(JISX0213String.isValid("\u6F57"));	// 潗
        assertEquals(JISX0213String.length("\u6F57"), 1);
        assertTrue(JISX0213String.isValid("\u6F59"));	// 潙
        assertEquals(JISX0213String.length("\u6F59"), 1);
        assertTrue(JISX0213String.isValid("\u6F5A"));	// 潚
        assertEquals(JISX0213String.length("\u6F5A"), 1);
        assertTrue(JISX0213String.isValid("\u6F5E"));	// 潞
        assertEquals(JISX0213String.length("\u6F5E"), 1);
        assertTrue(JISX0213String.isValid("\u6F61"));	// 潡
        assertEquals(JISX0213String.length("\u6F61"), 1);
        assertTrue(JISX0213String.isValid("\u6F62"));	// 潢
        assertEquals(JISX0213String.length("\u6F62"), 1);
        assertTrue(JISX0213String.isValid("\u6F68"));	// 潨
        assertEquals(JISX0213String.length("\u6F68"), 1);
        assertTrue(JISX0213String.isValid("\u6F7D"));	// 潽
        assertEquals(JISX0213String.length("\u6F7D"), 1);
        assertTrue(JISX0213String.isValid("\u6F7E"));	// 潾
        assertEquals(JISX0213String.length("\u6F7E"), 1);
        assertTrue(JISX0213String.isValid("\u6F8C"));	// 澌
        assertEquals(JISX0213String.length("\u6F8C"), 1);
        assertTrue(JISX0213String.isValid("\u6F8D"));	// 澍
        assertEquals(JISX0213String.length("\u6F8D"), 1);
        assertTrue(JISX0213String.isValid("\u6F90"));	// 澐
        assertEquals(JISX0213String.length("\u6F90"), 1);
        assertTrue(JISX0213String.isValid("\u6F94"));	// 澔
        assertEquals(JISX0213String.length("\u6F94"), 1);
        assertTrue(JISX0213String.isValid("\u6F96"));	// 澖
        assertEquals(JISX0213String.length("\u6F96"), 1);
        assertTrue(JISX0213String.isValid("\u6F9F"));	// 澟
        assertEquals(JISX0213String.length("\u6F9F"), 1);
        assertTrue(JISX0213String.isValid("\u6FA0"));	// 澠
        assertEquals(JISX0213String.length("\u6FA0"), 1);
        assertTrue(JISX0213String.isValid("\u6FA5"));	// 澥
        assertEquals(JISX0213String.length("\u6FA5"), 1);
        assertTrue(JISX0213String.isValid("\u6FA7"));	// 澧
        assertEquals(JISX0213String.length("\u6FA7"), 1);
        assertTrue(JISX0213String.isValid("\u6FAF"));	// 澯
        assertEquals(JISX0213String.length("\u6FAF"), 1);
        assertTrue(JISX0213String.isValid("\u6FB6"));	// 澶
        assertEquals(JISX0213String.length("\u6FB6"), 1);
        assertTrue(JISX0213String.isValid("\u6FBC"));	// 澼
        assertEquals(JISX0213String.length("\u6FBC"), 1);
        assertTrue(JISX0213String.isValid("\u6FC7"));	// 濇
        assertEquals(JISX0213String.length("\u6FC7"), 1);
        assertTrue(JISX0213String.isValid("\u6FC8"));	// 濈
        assertEquals(JISX0213String.length("\u6FC8"), 1);
        assertTrue(JISX0213String.isValid("\u6FCA"));	// 濊
        assertEquals(JISX0213String.length("\u6FCA"), 1);
        assertTrue(JISX0213String.isValid("\u6FDA"));	// 濚
        assertEquals(JISX0213String.length("\u6FDA"), 1);
        assertTrue(JISX0213String.isValid("\u6FDE"));	// 濞
        assertEquals(JISX0213String.length("\u6FDE"), 1);
        assertTrue(JISX0213String.isValid("\u6FE9"));	// 濩
        assertEquals(JISX0213String.length("\u6FE9"), 1);
        assertTrue(JISX0213String.isValid("\u6FF0"));	// 濰
        assertEquals(JISX0213String.length("\u6FF0"), 1);
        assertTrue(JISX0213String.isValid("\u6FF9"));	// 濹
        assertEquals(JISX0213String.length("\u6FF9"), 1);
        assertTrue(JISX0213String.isValid("\u6FFC"));	// 濼
        assertEquals(JISX0213String.length("\u6FFC"), 1);
        assertTrue(JISX0213String.isValid("\u7000"));	// 瀀
        assertEquals(JISX0213String.length("\u7000"), 1);
        assertTrue(JISX0213String.isValid("\u7006"));	// 瀆
        assertEquals(JISX0213String.length("\u7006"), 1);
        assertTrue(JISX0213String.isValid("\u7023"));	// 瀣
        assertEquals(JISX0213String.length("\u7023"), 1);
        assertTrue(JISX0213String.isValid("\u7039"));	// 瀹
        assertEquals(JISX0213String.length("\u7039"), 1);
        assertTrue(JISX0213String.isValid("\u703C"));	// 瀼
        assertEquals(JISX0213String.length("\u703C"), 1);
        assertTrue(JISX0213String.isValid("\u7043"));	// 灃
        assertEquals(JISX0213String.length("\u7043"), 1);
        assertTrue(JISX0213String.isValid("\u704A"));	// 灊
        assertEquals(JISX0213String.length("\u704A"), 1);
        assertTrue(JISX0213String.isValid("\u704B"));	// 灋
        assertEquals(JISX0213String.length("\u704B"), 1);
        assertTrue(JISX0213String.isValid("\u7054"));	// 灔
        assertEquals(JISX0213String.length("\u7054"), 1);
        assertTrue(JISX0213String.isValid("\u705D"));	// 灝
        assertEquals(JISX0213String.length("\u705D"), 1);
        assertTrue(JISX0213String.isValid("\u705E"));	// 灞
        assertEquals(JISX0213String.length("\u705E"), 1);
        assertTrue(JISX0213String.isValid("\u704E"));	// 灎
        assertEquals(JISX0213String.length("\u704E"), 1);
        assertTrue(JISX0213String.isValid("\u7064"));	// 灤
        assertEquals(JISX0213String.length("\u7064"), 1);
        assertTrue(JISX0213String.isValid("\u7065"));	// 灥
        assertEquals(JISX0213String.length("\u7065"), 1);
        assertTrue(JISX0213String.isValid("\u706C"));	// 灬
        assertEquals(JISX0213String.length("\u706C"), 1);
        assertTrue(JISX0213String.isValid("\u706E"));	// 灮
        assertEquals(JISX0213String.length("\u706E"), 1);
        assertTrue(JISX0213String.isValid("\u7075"));	// 灵
        assertEquals(JISX0213String.length("\u7075"), 1);
        assertTrue(JISX0213String.isValid("\u7076"));	// 灶
        assertEquals(JISX0213String.length("\u7076"), 1);
        assertTrue(JISX0213String.isValid("\u707E"));	// 灾
        assertEquals(JISX0213String.length("\u707E"), 1);
        assertTrue(JISX0213String.isValid("\u7081"));	// 炁
        assertEquals(JISX0213String.length("\u7081"), 1);
        assertTrue(JISX0213String.isValid("\u7086"));	// 炆
        assertEquals(JISX0213String.length("\u7086"), 1);
        assertTrue(JISX0213String.isValid("\u7095"));	// 炕
        assertEquals(JISX0213String.length("\u7095"), 1);
        assertTrue(JISX0213String.isValid("\u7097"));	// 炗
        assertEquals(JISX0213String.length("\u7097"), 1);
        assertTrue(JISX0213String.isValid("\u70A4"));	// 炤
        assertEquals(JISX0213String.length("\u70A4"), 1);
        assertTrue(JISX0213String.isValid("\u70B1"));	// 炱
        assertEquals(JISX0213String.length("\u70B1"), 1);
        assertTrue(JISX0213String.isValid("\u70B7"));	// 炷
        assertEquals(JISX0213String.length("\u70B7"), 1);
        assertTrue(JISX0213String.isValid("\u70CA"));	// 烊
        assertEquals(JISX0213String.length("\u70CA"), 1);
        assertTrue(JISX0213String.isValid("\u70D1"));	// 烑
        assertEquals(JISX0213String.length("\u70D1"), 1);
        assertTrue(JISX0213String.isValid("\u70D3"));	// 烓
        assertEquals(JISX0213String.length("\u70D3"), 1);
        assertTrue(JISX0213String.isValid("\u70D4"));	// 烔
        assertEquals(JISX0213String.length("\u70D4"), 1);
        assertTrue(JISX0213String.isValid("\u70D8"));	// 烘
        assertEquals(JISX0213String.length("\u70D8"), 1);
        assertTrue(JISX0213String.isValid("\u70DC"));	// 烜
        assertEquals(JISX0213String.length("\u70DC"), 1);
        assertTrue(JISX0213String.isValid("\u70E4"));	// 烤
        assertEquals(JISX0213String.length("\u70E4"), 1);
        assertTrue(JISX0213String.isValid("\u7103"));	// 焃
        assertEquals(JISX0213String.length("\u7103"), 1);
        assertTrue(JISX0213String.isValid("\u7106"));	// 焆
        assertEquals(JISX0213String.length("\u7106"), 1);
        assertTrue(JISX0213String.isValid("\u7107"));	// 焇
        assertEquals(JISX0213String.length("\u7107"), 1);
        assertTrue(JISX0213String.isValid("\u710C"));	// 焌
        assertEquals(JISX0213String.length("\u710C"), 1);
        assertTrue(JISX0213String.isValid("\u711E"));	// 焞
        assertEquals(JISX0213String.length("\u711E"), 1);
        assertTrue(JISX0213String.isValid("\u7120"));	// 焠
        assertEquals(JISX0213String.length("\u7120"), 1);
        assertTrue(JISX0213String.isValid("\u712B"));	// 焫
        assertEquals(JISX0213String.length("\u712B"), 1);
        assertTrue(JISX0213String.isValid("\u712F"));	// 焯
        assertEquals(JISX0213String.length("\u712F"), 1);
        assertTrue(JISX0213String.isValid("\u7130"));	// 焰
        assertEquals(JISX0213String.length("\u7130"), 1);
        assertTrue(JISX0213String.isValid("\u7131"));	// 焱
        assertEquals(JISX0213String.length("\u7131"), 1);
        assertTrue(JISX0213String.isValid("\u714A"));	// 煊
        assertEquals(JISX0213String.length("\u714A"), 1);
        assertTrue(JISX0213String.isValid("\u7150"));	// 煐
        assertEquals(JISX0213String.length("\u7150"), 1);
        assertTrue(JISX0213String.isValid("\u7152"));	// 煒
        assertEquals(JISX0213String.length("\u7152"), 1);
        assertTrue(JISX0213String.isValid("\u715E"));	// 煞
        assertEquals(JISX0213String.length("\u715E"), 1);
        assertTrue(JISX0213String.isValid("\u7160"));	// 煠
        assertEquals(JISX0213String.length("\u7160"), 1);
        assertTrue(JISX0213String.isValid("\u7168"));	// 煨
        assertEquals(JISX0213String.length("\u7168"), 1);
        assertTrue(JISX0213String.isValid("\u7180"));	// 熀
        assertEquals(JISX0213String.length("\u7180"), 1);
        assertTrue(JISX0213String.isValid("\u7185"));	// 熅
        assertEquals(JISX0213String.length("\u7185"), 1);
        assertTrue(JISX0213String.isValid("\u7187"));	// 熇
        assertEquals(JISX0213String.length("\u7187"), 1);
        assertTrue(JISX0213String.isValid("\u7192"));	// 熒
        assertEquals(JISX0213String.length("\u7192"), 1);
        assertTrue(JISX0213String.isValid("\u719B"));	// 熛
        assertEquals(JISX0213String.length("\u719B"), 1);
        assertTrue(JISX0213String.isValid("\u71A0"));	// 熠
        assertEquals(JISX0213String.length("\u71A0"), 1);
        assertTrue(JISX0213String.isValid("\u71A2"));	// 熢
        assertEquals(JISX0213String.length("\u71A2"), 1);
        assertTrue(JISX0213String.isValid("\u71AF"));	// 熯
        assertEquals(JISX0213String.length("\u71AF"), 1);
        assertTrue(JISX0213String.isValid("\u71B3"));	// 熳
        assertEquals(JISX0213String.length("\u71B3"), 1);
        assertTrue(JISX0213String.isValid("\u71BA"));	// 熺
        assertEquals(JISX0213String.length("\u71BA"), 1);
        assertTrue(JISX0213String.isValid("\u71C4"));	// 燄
        assertEquals(JISX0213String.length("\u71C4"), 1);
        assertTrue(JISX0213String.isValid("\u71CB"));	// 燋
        assertEquals(JISX0213String.length("\u71CB"), 1);
        assertTrue(JISX0213String.isValid("\u71D3"));	// 燓
        assertEquals(JISX0213String.length("\u71D3"), 1);
        assertTrue(JISX0213String.isValid("\u71D9"));	// 燙
        assertEquals(JISX0213String.length("\u71D9"), 1);
        assertTrue(JISX0213String.isValid("\u71DC"));	// 燜
        assertEquals(JISX0213String.length("\u71DC"), 1);
        assertTrue(JISX0213String.isValid("\u7200"));	// 爀
        assertEquals(JISX0213String.length("\u7200"), 1);
        assertTrue(JISX0213String.isValid("\u7207"));	// 爇
        assertEquals(JISX0213String.length("\u7207"), 1);
        assertTrue(JISX0213String.isValid("\u722B"));	// 爫
        assertEquals(JISX0213String.length("\u722B"), 1);
        assertTrue(JISX0213String.isValid("\u7234"));	// 爴
        assertEquals(JISX0213String.length("\u7234"), 1);
        assertTrue(JISX0213String.isValid("\u7238"));	// 爸
        assertEquals(JISX0213String.length("\u7238"), 1);
        assertTrue(JISX0213String.isValid("\u7239"));	// 爹
        assertEquals(JISX0213String.length("\u7239"), 1);
        assertTrue(JISX0213String.isValid("\u7242"));	// 牂
        assertEquals(JISX0213String.length("\u7242"), 1);
        assertTrue(JISX0213String.isValid("\u7253"));	// 牓
        assertEquals(JISX0213String.length("\u7253"), 1);
        assertTrue(JISX0213String.isValid("\u7255"));	// 牕
        assertEquals(JISX0213String.length("\u7255"), 1);
        assertTrue(JISX0213String.isValid("\u7256"));	// 牖
        assertEquals(JISX0213String.length("\u7256"), 1);
        assertTrue(JISX0213String.isValid("\u7263"));	// 牣
        assertEquals(JISX0213String.length("\u7263"), 1);
        assertTrue(JISX0213String.isValid("\u726E"));	// 牮
        assertEquals(JISX0213String.length("\u726E"), 1);
        assertTrue(JISX0213String.isValid("\u726F"));	// 牯
        assertEquals(JISX0213String.length("\u726F"), 1);
        assertTrue(JISX0213String.isValid("\u7278"));	// 牸
        assertEquals(JISX0213String.length("\u7278"), 1);
        assertTrue(JISX0213String.isValid("\u727F"));	// 牿
        assertEquals(JISX0213String.length("\u727F"), 1);
        assertTrue(JISX0213String.isValid("\u728D"));	// 犍
        assertEquals(JISX0213String.length("\u728D"), 1);
        assertTrue(JISX0213String.isValid("\u728E"));	// 犎
        assertEquals(JISX0213String.length("\u728E"), 1);
        assertTrue(JISX0213String.isValid("\u729B"));	// 犛
        assertEquals(JISX0213String.length("\u729B"), 1);
        assertTrue(JISX0213String.isValid("\u72AD"));	// 犭
        assertEquals(JISX0213String.length("\u72AD"), 1);
        assertTrue(JISX0213String.isValid("\u72AE"));	// 犮
        assertEquals(JISX0213String.length("\u72AE"), 1);
        assertTrue(JISX0213String.isValid("\u72C1"));	// 狁
        assertEquals(JISX0213String.length("\u72C1"), 1);
        assertTrue(JISX0213String.isValid("\u72CC"));	// 狌
        assertEquals(JISX0213String.length("\u72CC"), 1);
        assertTrue(JISX0213String.isValid("\u72F3"));	// 狳
        assertEquals(JISX0213String.length("\u72F3"), 1);
        assertTrue(JISX0213String.isValid("\u72FA"));	// 狺
        assertEquals(JISX0213String.length("\u72FA"), 1);
        assertTrue(JISX0213String.isValid("\u72FB"));	// 狻
        assertEquals(JISX0213String.length("\u72FB"), 1);
        assertTrue(JISX0213String.isValid("\u7307"));	// 猇
        assertEquals(JISX0213String.length("\u7307"), 1);
        assertTrue(JISX0213String.isValid("\u7312"));	// 猒
        assertEquals(JISX0213String.length("\u7312"), 1);
        assertTrue(JISX0213String.isValid("\u7318"));	// 猘
        assertEquals(JISX0213String.length("\u7318"), 1);
        assertTrue(JISX0213String.isValid("\u7319"));	// 猙
        assertEquals(JISX0213String.length("\u7319"), 1);
        assertTrue(JISX0213String.isValid("\u7327"));	// 猧
        assertEquals(JISX0213String.length("\u7327"), 1);
        assertTrue(JISX0213String.isValid("\u7328"));	// 猨
        assertEquals(JISX0213String.length("\u7328"), 1);
        assertTrue(JISX0213String.isValid("\u732C"));	// 猬
        assertEquals(JISX0213String.length("\u732C"), 1);
        assertTrue(JISX0213String.isValid("\u7331"));	// 猱
        assertEquals(JISX0213String.length("\u7331"), 1);
        assertTrue(JISX0213String.isValid("\u733D"));	// 猽
        assertEquals(JISX0213String.length("\u733D"), 1);
        assertTrue(JISX0213String.isValid("\u7350"));	// 獐
        assertEquals(JISX0213String.length("\u7350"), 1);
        assertTrue(JISX0213String.isValid("\u7352"));	// 獒
        assertEquals(JISX0213String.length("\u7352"), 1);
        assertTrue(JISX0213String.isValid("\u7366"));	// 獦
        assertEquals(JISX0213String.length("\u7366"), 1);
        assertTrue(JISX0213String.isValid("\u736B"));	// 獫
        assertEquals(JISX0213String.length("\u736B"), 1);
        assertTrue(JISX0213String.isValid("\u736C"));	// 獬
        assertEquals(JISX0213String.length("\u736C"), 1);
        assertTrue(JISX0213String.isValid("\u736E"));	// 獮
        assertEquals(JISX0213String.length("\u736E"), 1);
        assertTrue(JISX0213String.isValid("\u736F"));	// 獯
        assertEquals(JISX0213String.length("\u736F"), 1);
        assertTrue(JISX0213String.isValid("\u7371"));	// 獱
        assertEquals(JISX0213String.length("\u7371"), 1);
        assertTrue(JISX0213String.isValid("\u737C"));	// 獼
        assertEquals(JISX0213String.length("\u737C"), 1);
        assertTrue(JISX0213String.isValid("\u7381"));	// 玁
        assertEquals(JISX0213String.length("\u7381"), 1);
        assertTrue(JISX0213String.isValid("\u7385"));	// 玅
        assertEquals(JISX0213String.length("\u7385"), 1);
        assertTrue(JISX0213String.isValid("\u7395"));	// 玕
        assertEquals(JISX0213String.length("\u7395"), 1);
        assertTrue(JISX0213String.isValid("\u7398"));	// 玘
        assertEquals(JISX0213String.length("\u7398"), 1);
        assertTrue(JISX0213String.isValid("\u739C"));	// 玜
        assertEquals(JISX0213String.length("\u739C"), 1);
        assertTrue(JISX0213String.isValid("\u739E"));	// 玞
        assertEquals(JISX0213String.length("\u739E"), 1);
        assertTrue(JISX0213String.isValid("\u739F"));	// 玟
        assertEquals(JISX0213String.length("\u739F"), 1);
        assertTrue(JISX0213String.isValid("\u73A0"));	// 玠
        assertEquals(JISX0213String.length("\u73A0"), 1);
        assertTrue(JISX0213String.isValid("\u73A2"));	// 玢
        assertEquals(JISX0213String.length("\u73A2"), 1);
        assertTrue(JISX0213String.isValid("\u73A5"));	// 玥
        assertEquals(JISX0213String.length("\u73A5"), 1);
        assertTrue(JISX0213String.isValid("\u73A6"));	// 玦
        assertEquals(JISX0213String.length("\u73A6"), 1);
        assertTrue(JISX0213String.isValid("\u73AB"));	// 玫
        assertEquals(JISX0213String.length("\u73AB"), 1);
        assertTrue(JISX0213String.isValid("\u73B5"));	// 玵
        assertEquals(JISX0213String.length("\u73B5"), 1);
        assertTrue(JISX0213String.isValid("\u73B7"));	// 玷
        assertEquals(JISX0213String.length("\u73B7"), 1);
        assertTrue(JISX0213String.isValid("\u73B9"));	// 玹
        assertEquals(JISX0213String.length("\u73B9"), 1);
        assertTrue(JISX0213String.isValid("\u73BC"));	// 玼
        assertEquals(JISX0213String.length("\u73BC"), 1);
        assertTrue(JISX0213String.isValid("\u73BF"));	// 玿
        assertEquals(JISX0213String.length("\u73BF"), 1);
        assertTrue(JISX0213String.isValid("\u73C5"));	// 珅
        assertEquals(JISX0213String.length("\u73C5"), 1);
        assertTrue(JISX0213String.isValid("\u73CB"));	// 珋
        assertEquals(JISX0213String.length("\u73CB"), 1);
        assertTrue(JISX0213String.isValid("\u73CF"));	// 珏
        assertEquals(JISX0213String.length("\u73CF"), 1);
        assertTrue(JISX0213String.isValid("\u73D9"));	// 珙
        assertEquals(JISX0213String.length("\u73D9"), 1);
        assertTrue(JISX0213String.isValid("\u73E1"));	// 珡
        assertEquals(JISX0213String.length("\u73E1"), 1);
        assertTrue(JISX0213String.isValid("\u73E7"));	// 珧
        assertEquals(JISX0213String.length("\u73E7"), 1);
        assertTrue(JISX0213String.isValid("\u73E9"));	// 珩
        assertEquals(JISX0213String.length("\u73E9"), 1);
        assertTrue(JISX0213String.isValid("\u73F9"));	// 珹
        assertEquals(JISX0213String.length("\u73F9"), 1);
        assertTrue(JISX0213String.isValid("\u73FA"));	// 珺
        assertEquals(JISX0213String.length("\u73FA"), 1);
        assertTrue(JISX0213String.isValid("\u7401"));	// 琁
        assertEquals(JISX0213String.length("\u7401"), 1);
        assertTrue(JISX0213String.isValid("\u740A"));	// 琊
        assertEquals(JISX0213String.length("\u740A"), 1);
        assertTrue(JISX0213String.isValid("\u741A"));	// 琚
        assertEquals(JISX0213String.length("\u741A"), 1);
        assertTrue(JISX0213String.isValid("\u741B"));	// 琛
        assertEquals(JISX0213String.length("\u741B"), 1);
        assertTrue(JISX0213String.isValid("\u7424"));	// 琤
        assertEquals(JISX0213String.length("\u7424"), 1);
        assertTrue(JISX0213String.isValid("\u7428"));	// 琨
        assertEquals(JISX0213String.length("\u7428"), 1);
        assertTrue(JISX0213String.isValid("\u742B"));	// 琫
        assertEquals(JISX0213String.length("\u742B"), 1);
        assertTrue(JISX0213String.isValid("\u742C"));	// 琬
        assertEquals(JISX0213String.length("\u742C"), 1);
        assertTrue(JISX0213String.isValid("\u742F"));	// 琯
        assertEquals(JISX0213String.length("\u742F"), 1);
        assertTrue(JISX0213String.isValid("\u7430"));	// 琰
        assertEquals(JISX0213String.length("\u7430"), 1);
        assertTrue(JISX0213String.isValid("\u7431"));	// 琱
        assertEquals(JISX0213String.length("\u7431"), 1);
        assertTrue(JISX0213String.isValid("\u7439"));	// 琹
        assertEquals(JISX0213String.length("\u7439"), 1);
        assertTrue(JISX0213String.isValid("\u7440"));	// 瑀
        assertEquals(JISX0213String.length("\u7440"), 1);
        assertTrue(JISX0213String.isValid("\u7443"));	// 瑃
        assertEquals(JISX0213String.length("\u7443"), 1);
        assertTrue(JISX0213String.isValid("\u7444"));	// 瑄
        assertEquals(JISX0213String.length("\u7444"), 1);
        assertTrue(JISX0213String.isValid("\u7446"));	// 瑆
        assertEquals(JISX0213String.length("\u7446"), 1);
        assertTrue(JISX0213String.isValid("\u7447"));	// 瑇
        assertEquals(JISX0213String.length("\u7447"), 1);
        assertTrue(JISX0213String.isValid("\u744B"));	// 瑋
        assertEquals(JISX0213String.length("\u744B"), 1);
        assertTrue(JISX0213String.isValid("\u744D"));	// 瑍
        assertEquals(JISX0213String.length("\u744D"), 1);
        assertTrue(JISX0213String.isValid("\u7452"));	// 瑒
        assertEquals(JISX0213String.length("\u7452"), 1);
        assertTrue(JISX0213String.isValid("\u7457"));	// 瑗
        assertEquals(JISX0213String.length("\u7457"), 1);
        assertTrue(JISX0213String.isValid("\u745D"));	// 瑝
        assertEquals(JISX0213String.length("\u745D"), 1);
        assertTrue(JISX0213String.isValid("\u746B"));	// 瑫
        assertEquals(JISX0213String.length("\u746B"), 1);
        assertTrue(JISX0213String.isValid("\u746D"));	// 瑭
        assertEquals(JISX0213String.length("\u746D"), 1);
        assertTrue(JISX0213String.isValid("\u7471"));	// 瑱
        assertEquals(JISX0213String.length("\u7471"), 1);
        assertTrue(JISX0213String.isValid("\u7481"));	// 璁
        assertEquals(JISX0213String.length("\u7481"), 1);
        assertTrue(JISX0213String.isValid("\u7485"));	// 璅
        assertEquals(JISX0213String.length("\u7485"), 1);
        assertTrue(JISX0213String.isValid("\u7486"));	// 璆
        assertEquals(JISX0213String.length("\u7486"), 1);
        assertTrue(JISX0213String.isValid("\u7487"));	// 璇
        assertEquals(JISX0213String.length("\u7487"), 1);
        assertTrue(JISX0213String.isValid("\u7490"));	// 璐
        assertEquals(JISX0213String.length("\u7490"), 1);
        assertTrue(JISX0213String.isValid("\u7492"));	// 璒
        assertEquals(JISX0213String.length("\u7492"), 1);
        assertTrue(JISX0213String.isValid("\u7498"));	// 璘
        assertEquals(JISX0213String.length("\u7498"), 1);
        assertTrue(JISX0213String.isValid("\u7499"));	// 璙
        assertEquals(JISX0213String.length("\u7499"), 1);
        assertTrue(JISX0213String.isValid("\u749C"));	// 璜
        assertEquals(JISX0213String.length("\u749C"), 1);
        assertTrue(JISX0213String.isValid("\u74A0"));	// 璠
        assertEquals(JISX0213String.length("\u74A0"), 1);
        assertTrue(JISX0213String.isValid("\u74A1"));	// 璡
        assertEquals(JISX0213String.length("\u74A1"), 1);
        assertTrue(JISX0213String.isValid("\u74A3"));	// 璣
        assertEquals(JISX0213String.length("\u74A3"), 1);
        assertTrue(JISX0213String.isValid("\u74A6"));	// 璦
        assertEquals(JISX0213String.length("\u74A6"), 1);
        assertTrue(JISX0213String.isValid("\u74A8"));	// 璨
        assertEquals(JISX0213String.length("\u74A8"), 1);
        assertTrue(JISX0213String.isValid("\u74A9"));	// 璩
        assertEquals(JISX0213String.length("\u74A9"), 1);
        assertTrue(JISX0213String.isValid("\u74AA"));	// 璪
        assertEquals(JISX0213String.length("\u74AA"), 1);
        assertTrue(JISX0213String.isValid("\u74AB"));	// 璫
        assertEquals(JISX0213String.length("\u74AB"), 1);
        assertTrue(JISX0213String.isValid("\u74B5"));	// 璵
        assertEquals(JISX0213String.length("\u74B5"), 1);
        assertTrue(JISX0213String.isValid("\u74B9"));	// 璹
        assertEquals(JISX0213String.length("\u74B9"), 1);
        assertTrue(JISX0213String.isValid("\u74BB"));	// 璻
        assertEquals(JISX0213String.length("\u74BB"), 1);
        assertTrue(JISX0213String.isValid("\u74BF"));	// 璿
        assertEquals(JISX0213String.length("\u74BF"), 1);
        assertTrue(JISX0213String.isValid("\u74C8"));	// 瓈
        assertEquals(JISX0213String.length("\u74C8"), 1);
        assertTrue(JISX0213String.isValid("\u74C9"));	// 瓉
        assertEquals(JISX0213String.length("\u74C9"), 1);
        assertTrue(JISX0213String.isValid("\u74D8"));	// 瓘
        assertEquals(JISX0213String.length("\u74D8"), 1);
        assertTrue(JISX0213String.isValid("\u74DA"));	// 瓚
        assertEquals(JISX0213String.length("\u74DA"), 1);
        assertTrue(JISX0213String.isValid("\u74DE"));	// 瓞
        assertEquals(JISX0213String.length("\u74DE"), 1);
        assertTrue(JISX0213String.isValid("\u74EB"));	// 瓫
        assertEquals(JISX0213String.length("\u74EB"), 1);
        assertTrue(JISX0213String.isValid("\u74EF"));	// 瓯
        assertEquals(JISX0213String.length("\u74EF"), 1);
        assertTrue(JISX0213String.isValid("\u74FA"));	// 瓺
        assertEquals(JISX0213String.length("\u74FA"), 1);
        assertTrue(JISX0213String.isValid("\u74FF"));	// 瓿
        assertEquals(JISX0213String.length("\u74FF"), 1);
        assertTrue(JISX0213String.isValid("\u7517"));	// 甗
        assertEquals(JISX0213String.length("\u7517"), 1);
        assertTrue(JISX0213String.isValid("\u7520"));	// 甠
        assertEquals(JISX0213String.length("\u7520"), 1);
        assertTrue(JISX0213String.isValid("\u7524"));	// 甤
        assertEquals(JISX0213String.length("\u7524"), 1);
        assertTrue(JISX0213String.isValid("\u752A"));	// 甪
        assertEquals(JISX0213String.length("\u752A"), 1);
        assertTrue(JISX0213String.isValid("\u753D"));	// 甽
        assertEquals(JISX0213String.length("\u753D"), 1);
        assertTrue(JISX0213String.isValid("\u753E"));	// 甾
        assertEquals(JISX0213String.length("\u753E"), 1);
        assertTrue(JISX0213String.isValid("\u7540"));	// 畀
        assertEquals(JISX0213String.length("\u7540"), 1);
        assertTrue(JISX0213String.isValid("\u7548"));	// 畈
        assertEquals(JISX0213String.length("\u7548"), 1);
        assertTrue(JISX0213String.isValid("\u754E"));	// 畎
        assertEquals(JISX0213String.length("\u754E"), 1);
        assertTrue(JISX0213String.isValid("\u7550"));	// 畐
        assertEquals(JISX0213String.length("\u7550"), 1);
        assertTrue(JISX0213String.isValid("\u7552"));	// 畒
        assertEquals(JISX0213String.length("\u7552"), 1);
        assertTrue(JISX0213String.isValid("\u7571"));	// 畱
        assertEquals(JISX0213String.length("\u7571"), 1);
        assertTrue(JISX0213String.isValid("\u7579"));	// 畹
        assertEquals(JISX0213String.length("\u7579"), 1);
        assertTrue(JISX0213String.isValid("\u757A"));	// 畺
        assertEquals(JISX0213String.length("\u757A"), 1);
        assertTrue(JISX0213String.isValid("\u757D"));	// 畽
        assertEquals(JISX0213String.length("\u757D"), 1);
        assertTrue(JISX0213String.isValid("\u757E"));	// 畾
        assertEquals(JISX0213String.length("\u757E"), 1);
        assertTrue(JISX0213String.isValid("\u7581"));	// 疁
        assertEquals(JISX0213String.length("\u7581"), 1);
        assertTrue(JISX0213String.isValid("\u7592"));	// 疒
        assertEquals(JISX0213String.length("\u7592"), 1);
        assertTrue(JISX0213String.isValid("\u75A2"));	// 疢
        assertEquals(JISX0213String.length("\u75A2"), 1);
        assertTrue(JISX0213String.isValid("\u75BF"));	// 疿
        assertEquals(JISX0213String.length("\u75BF"), 1);
        assertTrue(JISX0213String.isValid("\u75C0"));	// 痀
        assertEquals(JISX0213String.length("\u75C0"), 1);
        assertTrue(JISX0213String.isValid("\u75C6"));	// 痆
        assertEquals(JISX0213String.length("\u75C6"), 1);
        assertTrue(JISX0213String.isValid("\u75CE"));	// 痎
        assertEquals(JISX0213String.length("\u75CE"), 1);
        assertTrue(JISX0213String.isValid("\u75CF"));	// 痏
        assertEquals(JISX0213String.length("\u75CF"), 1);
        assertTrue(JISX0213String.isValid("\u75DF"));	// 痟
        assertEquals(JISX0213String.length("\u75DF"), 1);
        assertTrue(JISX0213String.isValid("\u75E0"));	// 痠
        assertEquals(JISX0213String.length("\u75E0"), 1);
        assertTrue(JISX0213String.isValid("\u75E4"));	// 痤
        assertEquals(JISX0213String.length("\u75E4"), 1);
        assertTrue(JISX0213String.isValid("\u75E7"));	// 痧
        assertEquals(JISX0213String.length("\u75E7"), 1);
        assertTrue(JISX0213String.isValid("\u75EC"));	// 痬
        assertEquals(JISX0213String.length("\u75EC"), 1);
        assertTrue(JISX0213String.isValid("\u75EE"));	// 痮
        assertEquals(JISX0213String.length("\u75EE"), 1);
        assertTrue(JISX0213String.isValid("\u75F1"));	// 痱
        assertEquals(JISX0213String.length("\u75F1"), 1);
        assertTrue(JISX0213String.isValid("\u75F9"));	// 痹
        assertEquals(JISX0213String.length("\u75F9"), 1);
        assertTrue(JISX0213String.isValid("\u7600"));	// 瘀
        assertEquals(JISX0213String.length("\u7600"), 1);
        assertTrue(JISX0213String.isValid("\u7602"));	// 瘂
        assertEquals(JISX0213String.length("\u7602"), 1);
        assertTrue(JISX0213String.isValid("\u7603"));	// 瘃
        assertEquals(JISX0213String.length("\u7603"), 1);
        assertTrue(JISX0213String.isValid("\u7607"));	// 瘇
        assertEquals(JISX0213String.length("\u7607"), 1);
        assertTrue(JISX0213String.isValid("\u7608"));	// 瘈
        assertEquals(JISX0213String.length("\u7608"), 1);
        assertTrue(JISX0213String.isValid("\u760F"));	// 瘏
        assertEquals(JISX0213String.length("\u760F"), 1);
        assertTrue(JISX0213String.isValid("\u7613"));	// 瘓
        assertEquals(JISX0213String.length("\u7613"), 1);
        assertTrue(JISX0213String.isValid("\u7615"));	// 瘕
        assertEquals(JISX0213String.length("\u7615"), 1);
        assertTrue(JISX0213String.isValid("\u7616"));	// 瘖
        assertEquals(JISX0213String.length("\u7616"), 1);
        assertTrue(JISX0213String.isValid("\u7619"));	// 瘙
        assertEquals(JISX0213String.length("\u7619"), 1);
        assertTrue(JISX0213String.isValid("\u761B"));	// 瘛
        assertEquals(JISX0213String.length("\u761B"), 1);
        assertTrue(JISX0213String.isValid("\u761C"));	// 瘜
        assertEquals(JISX0213String.length("\u761C"), 1);
        assertTrue(JISX0213String.isValid("\u761E"));	// 瘞
        assertEquals(JISX0213String.length("\u761E"), 1);
        assertTrue(JISX0213String.isValid("\u7625"));	// 瘥
        assertEquals(JISX0213String.length("\u7625"), 1);
        assertTrue(JISX0213String.isValid("\u7626"));	// 瘦
        assertEquals(JISX0213String.length("\u7626"), 1);
        assertTrue(JISX0213String.isValid("\u762D"));	// 瘭
        assertEquals(JISX0213String.length("\u762D"), 1);
        assertTrue(JISX0213String.isValid("\u7633"));	// 瘳
        assertEquals(JISX0213String.length("\u7633"), 1);
        assertTrue(JISX0213String.isValid("\u7635"));	// 瘵
        assertEquals(JISX0213String.length("\u7635"), 1);
        assertTrue(JISX0213String.isValid("\u763C"));	// 瘼
        assertEquals(JISX0213String.length("\u763C"), 1);
        assertTrue(JISX0213String.isValid("\u7641"));	// 癁
        assertEquals(JISX0213String.length("\u7641"), 1);
        assertTrue(JISX0213String.isValid("\u7643"));	// 癃
        assertEquals(JISX0213String.length("\u7643"), 1);
        assertTrue(JISX0213String.isValid("\u7649"));	// 癉
        assertEquals(JISX0213String.length("\u7649"), 1);
        assertTrue(JISX0213String.isValid("\u764B"));	// 癋
        assertEquals(JISX0213String.length("\u764B"), 1);
        assertTrue(JISX0213String.isValid("\u7655"));	// 癕
        assertEquals(JISX0213String.length("\u7655"), 1);
        assertTrue(JISX0213String.isValid("\u7664"));	// 癤
        assertEquals(JISX0213String.length("\u7664"), 1);
        assertTrue(JISX0213String.isValid("\u7665"));	// 癥
        assertEquals(JISX0213String.length("\u7665"), 1);
        assertTrue(JISX0213String.isValid("\u766D"));	// 癭
        assertEquals(JISX0213String.length("\u766D"), 1);
        assertTrue(JISX0213String.isValid("\u766E"));	// 癮
        assertEquals(JISX0213String.length("\u766E"), 1);
        assertTrue(JISX0213String.isValid("\u766F"));	// 癯
        assertEquals(JISX0213String.length("\u766F"), 1);
        assertTrue(JISX0213String.isValid("\u7671"));	// 癱
        assertEquals(JISX0213String.length("\u7671"), 1);
        assertTrue(JISX0213String.isValid("\u7681"));	// 皁
        assertEquals(JISX0213String.length("\u7681"), 1);
        assertTrue(JISX0213String.isValid("\u7695"));	// 皕
        assertEquals(JISX0213String.length("\u7695"), 1);
        assertTrue(JISX0213String.isValid("\u769D"));	// 皝
        assertEquals(JISX0213String.length("\u769D"), 1);
        assertTrue(JISX0213String.isValid("\u76A0"));	// 皠
        assertEquals(JISX0213String.length("\u76A0"), 1);
        assertTrue(JISX0213String.isValid("\u76A7"));	// 皧
        assertEquals(JISX0213String.length("\u76A7"), 1);
        assertTrue(JISX0213String.isValid("\u76A8"));	// 皨
        assertEquals(JISX0213String.length("\u76A8"), 1);
        assertTrue(JISX0213String.isValid("\u76AA"));	// 皪
        assertEquals(JISX0213String.length("\u76AA"), 1);
        assertTrue(JISX0213String.isValid("\u76C5"));	// 盅
        assertEquals(JISX0213String.length("\u76C5"), 1);
        assertTrue(JISX0213String.isValid("\u76C9"));	// 盉
        assertEquals(JISX0213String.length("\u76C9"), 1);
        assertTrue(JISX0213String.isValid("\u76CC"));	// 盌
        assertEquals(JISX0213String.length("\u76CC"), 1);
        assertTrue(JISX0213String.isValid("\u76CE"));	// 盎
        assertEquals(JISX0213String.length("\u76CE"), 1);
        assertTrue(JISX0213String.isValid("\u76D4"));	// 盔
        assertEquals(JISX0213String.length("\u76D4"), 1);
        assertTrue(JISX0213String.isValid("\u76E6"));	// 盦
        assertEquals(JISX0213String.length("\u76E6"), 1);
        assertTrue(JISX0213String.isValid("\u76E8"));	// 盨
        assertEquals(JISX0213String.length("\u76E8"), 1);
        assertTrue(JISX0213String.isValid("\u76EC"));	// 盬
        assertEquals(JISX0213String.length("\u76EC"), 1);
        assertTrue(JISX0213String.isValid("\u76F1"));	// 盱
        assertEquals(JISX0213String.length("\u76F1"), 1);
        assertTrue(JISX0213String.isValid("\u76FC"));	// 盼
        assertEquals(JISX0213String.length("\u76FC"), 1);
        assertTrue(JISX0213String.isValid("\u770A"));	// 眊
        assertEquals(JISX0213String.length("\u770A"), 1);
        assertTrue(JISX0213String.isValid("\u7717"));	// 眗
        assertEquals(JISX0213String.length("\u7717"), 1);
        assertTrue(JISX0213String.isValid("\u7719"));	// 眙
        assertEquals(JISX0213String.length("\u7719"), 1);
        assertTrue(JISX0213String.isValid("\u771A"));	// 眚
        assertEquals(JISX0213String.length("\u771A"), 1);
        assertTrue(JISX0213String.isValid("\u772D"));	// 眭
        assertEquals(JISX0213String.length("\u772D"), 1);
        assertTrue(JISX0213String.isValid("\u7734"));	// 眴
        assertEquals(JISX0213String.length("\u7734"), 1);
        assertTrue(JISX0213String.isValid("\u7735"));	// 眵
        assertEquals(JISX0213String.length("\u7735"), 1);
        assertTrue(JISX0213String.isValid("\u7736"));	// 眶
        assertEquals(JISX0213String.length("\u7736"), 1);
        assertTrue(JISX0213String.isValid("\u774D"));	// 睍
        assertEquals(JISX0213String.length("\u774D"), 1);
        assertTrue(JISX0213String.isValid("\u774E"));	// 睎
        assertEquals(JISX0213String.length("\u774E"), 1);
        assertTrue(JISX0213String.isValid("\u775C"));	// 睜
        assertEquals(JISX0213String.length("\u775C"), 1);
        assertTrue(JISX0213String.isValid("\u775F"));	// 睟
        assertEquals(JISX0213String.length("\u775F"), 1);
        assertTrue(JISX0213String.isValid("\u7760"));	// 睠
        assertEquals(JISX0213String.length("\u7760"), 1);
        assertTrue(JISX0213String.isValid("\u7762"));	// 睢
        assertEquals(JISX0213String.length("\u7762"), 1);
        assertTrue(JISX0213String.isValid("\u776A"));	// 睪
        assertEquals(JISX0213String.length("\u776A"), 1);
        assertTrue(JISX0213String.isValid("\u7772"));	// 睲
        assertEquals(JISX0213String.length("\u7772"), 1);
        assertTrue(JISX0213String.isValid("\u777A"));	// 睺
        assertEquals(JISX0213String.length("\u777A"), 1);
        assertTrue(JISX0213String.isValid("\u777D"));	// 睽
        assertEquals(JISX0213String.length("\u777D"), 1);
        assertTrue(JISX0213String.isValid("\u7780"));	// 瞀
        assertEquals(JISX0213String.length("\u7780"), 1);
        assertTrue(JISX0213String.isValid("\u7794"));	// 瞔
        assertEquals(JISX0213String.length("\u7794"), 1);
        assertTrue(JISX0213String.isValid("\u779A"));	// 瞚
        assertEquals(JISX0213String.length("\u779A"), 1);
        assertTrue(JISX0213String.isValid("\u779F"));	// 瞟
        assertEquals(JISX0213String.length("\u779F"), 1);
        assertTrue(JISX0213String.isValid("\u77A2"));	// 瞢
        assertEquals(JISX0213String.length("\u77A2"), 1);
        assertTrue(JISX0213String.isValid("\u77AA"));	// 瞪
        assertEquals(JISX0213String.length("\u77AA"), 1);
        assertTrue(JISX0213String.isValid("\u77DE"));	// 矞
        assertEquals(JISX0213String.length("\u77DE"), 1);
        assertTrue(JISX0213String.isValid("\u77DF"));	// 矟
        assertEquals(JISX0213String.length("\u77DF"), 1);
        assertTrue(JISX0213String.isValid("\u77E0"));	// 矠
        assertEquals(JISX0213String.length("\u77E0"), 1);
        assertTrue(JISX0213String.isValid("\u77E4"));	// 矤
        assertEquals(JISX0213String.length("\u77E4"), 1);
        assertTrue(JISX0213String.isValid("\u77E6"));	// 矦
        assertEquals(JISX0213String.length("\u77E6"), 1);
        assertTrue(JISX0213String.isValid("\u77EA"));	// 矪
        assertEquals(JISX0213String.length("\u77EA"), 1);
        assertTrue(JISX0213String.isValid("\u77EC"));	// 矬
        assertEquals(JISX0213String.length("\u77EC"), 1);
        assertTrue(JISX0213String.isValid("\u77F0"));	// 矰
        assertEquals(JISX0213String.length("\u77F0"), 1);
        assertTrue(JISX0213String.isValid("\u77F4"));	// 矴
        assertEquals(JISX0213String.length("\u77F4"), 1);
        assertTrue(JISX0213String.isValid("\u77FB"));	// 矻
        assertEquals(JISX0213String.length("\u77FB"), 1);
        assertTrue(JISX0213String.isValid("\u7805"));	// 砅
        assertEquals(JISX0213String.length("\u7805"), 1);
        assertTrue(JISX0213String.isValid("\u7806"));	// 砆
        assertEquals(JISX0213String.length("\u7806"), 1);
        assertTrue(JISX0213String.isValid("\u7809"));	// 砉
        assertEquals(JISX0213String.length("\u7809"), 1);
        assertTrue(JISX0213String.isValid("\u780D"));	// 砍
        assertEquals(JISX0213String.length("\u780D"), 1);
        assertTrue(JISX0213String.isValid("\u782D"));	// 砭
        assertEquals(JISX0213String.length("\u782D"), 1);
        assertTrue(JISX0213String.isValid("\u7843"));	// 硃
        assertEquals(JISX0213String.length("\u7843"), 1);
        assertTrue(JISX0213String.isValid("\u7847"));	// 硇
        assertEquals(JISX0213String.length("\u7847"), 1);
        assertTrue(JISX0213String.isValid("\u7868"));	// 硨
        assertEquals(JISX0213String.length("\u7868"), 1);
        assertTrue(JISX0213String.isValid("\u786A"));	// 硪
        assertEquals(JISX0213String.length("\u786A"), 1);
        assertTrue(JISX0213String.isValid("\u786E"));	// 确
        assertEquals(JISX0213String.length("\u786E"), 1);
        assertTrue(JISX0213String.isValid("\u788A"));	// 碊
        assertEquals(JISX0213String.length("\u788A"), 1);
        assertTrue(JISX0213String.isValid("\u7894"));	// 碔
        assertEquals(JISX0213String.length("\u7894"), 1);
        assertTrue(JISX0213String.isValid("\u789D"));	// 碝
        assertEquals(JISX0213String.length("\u789D"), 1);
        assertTrue(JISX0213String.isValid("\u789E"));	// 碞
        assertEquals(JISX0213String.length("\u789E"), 1);
        assertTrue(JISX0213String.isValid("\u789F"));	// 碟
        assertEquals(JISX0213String.length("\u789F"), 1);
        assertTrue(JISX0213String.isValid("\u78A4"));	// 碤
        assertEquals(JISX0213String.length("\u78A4"), 1);
        assertTrue(JISX0213String.isValid("\u78AD"));	// 碭
        assertEquals(JISX0213String.length("\u78AD"), 1);
        assertTrue(JISX0213String.isValid("\u78B0"));	// 碰
        assertEquals(JISX0213String.length("\u78B0"), 1);
        assertTrue(JISX0213String.isValid("\u78BB"));	// 碻
        assertEquals(JISX0213String.length("\u78BB"), 1);
        assertTrue(JISX0213String.isValid("\u78C8"));	// 磈
        assertEquals(JISX0213String.length("\u78C8"), 1);
        assertTrue(JISX0213String.isValid("\u78CC"));	// 磌
        assertEquals(JISX0213String.length("\u78CC"), 1);
        assertTrue(JISX0213String.isValid("\u78CE"));	// 磎
        assertEquals(JISX0213String.length("\u78CE"), 1);
        assertTrue(JISX0213String.isValid("\u78D5"));	// 磕
        assertEquals(JISX0213String.length("\u78D5"), 1);
        assertTrue(JISX0213String.isValid("\u78E4"));	// 磤
        assertEquals(JISX0213String.length("\u78E4"), 1);
        assertTrue(JISX0213String.isValid("\u78E0"));	// 磠
        assertEquals(JISX0213String.length("\u78E0"), 1);
        assertTrue(JISX0213String.isValid("\u78E1"));	// 磡
        assertEquals(JISX0213String.length("\u78E1"), 1);
        assertTrue(JISX0213String.isValid("\u78E6"));	// 磦
        assertEquals(JISX0213String.length("\u78E6"), 1);
        assertTrue(JISX0213String.isValid("\u78F2"));	// 磲
        assertEquals(JISX0213String.length("\u78F2"), 1);
        assertTrue(JISX0213String.isValid("\u7900"));	// 礀
        assertEquals(JISX0213String.length("\u7900"), 1);
        assertTrue(JISX0213String.isValid("\u78F7"));	// 磷
        assertEquals(JISX0213String.length("\u78F7"), 1);
        assertTrue(JISX0213String.isValid("\u78FA"));	// 磺
        assertEquals(JISX0213String.length("\u78FA"), 1);
        assertTrue(JISX0213String.isValid("\u78FB"));	// 磻
        assertEquals(JISX0213String.length("\u78FB"), 1);
        assertTrue(JISX0213String.isValid("\u7910"));	// 礐
        assertEquals(JISX0213String.length("\u7910"), 1);
        assertTrue(JISX0213String.isValid("\u791C"));	// 礜
        assertEquals(JISX0213String.length("\u791C"), 1);
        assertTrue(JISX0213String.isValid("\u7925"));	// 礥
        assertEquals(JISX0213String.length("\u7925"), 1);
        assertTrue(JISX0213String.isValid("\u7931"));	// 礱
        assertEquals(JISX0213String.length("\u7931"), 1);
        assertTrue(JISX0213String.isValid("\u7934"));	// 礴
        assertEquals(JISX0213String.length("\u7934"), 1);
        assertTrue(JISX0213String.isValid("\u793B"));	// 礻
        assertEquals(JISX0213String.length("\u793B"), 1);
        assertTrue(JISX0213String.isValid("\u7945"));	// 祅
        assertEquals(JISX0213String.length("\u7945"), 1);
        assertTrue(JISX0213String.isValid("\u7946"));	// 祆
        assertEquals(JISX0213String.length("\u7946"), 1);
        assertTrue(JISX0213String.isValid("\u794A"));	// 祊
        assertEquals(JISX0213String.length("\u794A"), 1);
        assertTrue(JISX0213String.isValid("\u7958"));	// 祘
        assertEquals(JISX0213String.length("\u7958"), 1);
        assertTrue(JISX0213String.isValid("\u795B"));	// 祛
        assertEquals(JISX0213String.length("\u795B"), 1);
        assertTrue(JISX0213String.isValid("\u795C"));	// 祜
        assertEquals(JISX0213String.length("\u795C"), 1);
        assertTrue(JISX0213String.isValid("\u7967"));	// 祧
        assertEquals(JISX0213String.length("\u7967"), 1);
        assertTrue(JISX0213String.isValid("\u7972"));	// 祲
        assertEquals(JISX0213String.length("\u7972"), 1);
        assertTrue(JISX0213String.isValid("\u7979"));	// 祹
        assertEquals(JISX0213String.length("\u7979"), 1);
        assertTrue(JISX0213String.isValid("\u7995"));	// 禕
        assertEquals(JISX0213String.length("\u7995"), 1);
        assertTrue(JISX0213String.isValid("\u7996"));	// 禖
        assertEquals(JISX0213String.length("\u7996"), 1);
        assertTrue(JISX0213String.isValid("\u7998"));	// 禘
        assertEquals(JISX0213String.length("\u7998"), 1);
        assertTrue(JISX0213String.isValid("\u79A1"));	// 禡
        assertEquals(JISX0213String.length("\u79A1"), 1);
        assertTrue(JISX0213String.isValid("\u79A9"));	// 禩
        assertEquals(JISX0213String.length("\u79A9"), 1);
        assertTrue(JISX0213String.isValid("\u79B1"));	// 禱
        assertEquals(JISX0213String.length("\u79B1"), 1);
        assertTrue(JISX0213String.isValid("\u79B4"));	// 禴
        assertEquals(JISX0213String.length("\u79B4"), 1);
        assertTrue(JISX0213String.isValid("\u79B8"));	// 禸
        assertEquals(JISX0213String.length("\u79B8"), 1);
        assertTrue(JISX0213String.isValid("\u79BB"));	// 离
        assertEquals(JISX0213String.length("\u79BB"), 1);
        assertTrue(JISX0213String.isValid("\u79C2"));	// 秂
        assertEquals(JISX0213String.length("\u79C2"), 1);
        assertTrue(JISX0213String.isValid("\u79C7"));	// 秇
        assertEquals(JISX0213String.length("\u79C7"), 1);
        assertTrue(JISX0213String.isValid("\u79C8"));	// 秈
        assertEquals(JISX0213String.length("\u79C8"), 1);
        assertTrue(JISX0213String.isValid("\u79CA"));	// 秊
        assertEquals(JISX0213String.length("\u79CA"), 1);
        assertTrue(JISX0213String.isValid("\u79D4"));	// 秔
        assertEquals(JISX0213String.length("\u79D4"), 1);
        assertTrue(JISX0213String.isValid("\u79D6"));	// 秖
        assertEquals(JISX0213String.length("\u79D6"), 1);
        assertTrue(JISX0213String.isValid("\u79DE"));	// 秞
        assertEquals(JISX0213String.length("\u79DE"), 1);
        assertTrue(JISX0213String.isValid("\u79EB"));	// 秫
        assertEquals(JISX0213String.length("\u79EB"), 1);
        assertTrue(JISX0213String.isValid("\u79ED"));	// 秭
        assertEquals(JISX0213String.length("\u79ED"), 1);
        assertTrue(JISX0213String.isValid("\u7A03"));	// 稃
        assertEquals(JISX0213String.length("\u7A03"), 1);
        assertTrue(JISX0213String.isValid("\u7A0A"));	// 稊
        assertEquals(JISX0213String.length("\u7A0A"), 1);
        assertTrue(JISX0213String.isValid("\u7A11"));	// 稑
        assertEquals(JISX0213String.length("\u7A11"), 1);
        assertTrue(JISX0213String.isValid("\u7A15"));	// 稕
        assertEquals(JISX0213String.length("\u7A15"), 1);
        assertTrue(JISX0213String.isValid("\u7A1B"));	// 稛
        assertEquals(JISX0213String.length("\u7A1B"), 1);
        assertTrue(JISX0213String.isValid("\u7A1E"));	// 稞
        assertEquals(JISX0213String.length("\u7A1E"), 1);
        assertTrue(JISX0213String.isValid("\u7A2D"));	// 稭
        assertEquals(JISX0213String.length("\u7A2D"), 1);
        assertTrue(JISX0213String.isValid("\u7A38"));	// 稸
        assertEquals(JISX0213String.length("\u7A38"), 1);
        assertTrue(JISX0213String.isValid("\u7A39"));	// 稹
        assertEquals(JISX0213String.length("\u7A39"), 1);
        assertTrue(JISX0213String.isValid("\u7A47"));	// 穇
        assertEquals(JISX0213String.length("\u7A47"), 1);
        assertTrue(JISX0213String.isValid("\u7A4C"));	// 穌
        assertEquals(JISX0213String.length("\u7A4C"), 1);
        assertTrue(JISX0213String.isValid("\u7A56"));	// 穖
        assertEquals(JISX0213String.length("\u7A56"), 1);
        assertTrue(JISX0213String.isValid("\u7A59"));	// 穙
        assertEquals(JISX0213String.length("\u7A59"), 1);
        assertTrue(JISX0213String.isValid("\u7A5C"));	// 穜
        assertEquals(JISX0213String.length("\u7A5C"), 1);
        assertTrue(JISX0213String.isValid("\u7A5D"));	// 穝
        assertEquals(JISX0213String.length("\u7A5D"), 1);
        assertTrue(JISX0213String.isValid("\u7A5F"));	// 穟
        assertEquals(JISX0213String.length("\u7A5F"), 1);
        assertTrue(JISX0213String.isValid("\u7A60"));	// 穠
        assertEquals(JISX0213String.length("\u7A60"), 1);
        assertTrue(JISX0213String.isValid("\u7A67"));	// 穧
        assertEquals(JISX0213String.length("\u7A67"), 1);
        assertTrue(JISX0213String.isValid("\u7A6A"));	// 穪
        assertEquals(JISX0213String.length("\u7A6A"), 1);
        assertTrue(JISX0213String.isValid("\u7A6D"));	// 穭
        assertEquals(JISX0213String.length("\u7A6D"), 1);
        assertTrue(JISX0213String.isValid("\u7A75"));	// 穵
        assertEquals(JISX0213String.length("\u7A75"), 1);
        assertTrue(JISX0213String.isValid("\u7A78"));	// 穸
        assertEquals(JISX0213String.length("\u7A78"), 1);
        assertTrue(JISX0213String.isValid("\u7A82"));	// 窂
        assertEquals(JISX0213String.length("\u7A82"), 1);
        assertTrue(JISX0213String.isValid("\u7A85"));	// 窅
        assertEquals(JISX0213String.length("\u7A85"), 1);
        assertTrue(JISX0213String.isValid("\u7A8A"));	// 窊
        assertEquals(JISX0213String.length("\u7A8A"), 1);
        assertTrue(JISX0213String.isValid("\u7A90"));	// 窐
        assertEquals(JISX0213String.length("\u7A90"), 1);
        assertTrue(JISX0213String.isValid("\u7AA0"));	// 窠
        assertEquals(JISX0213String.length("\u7AA0"), 1);
        assertTrue(JISX0213String.isValid("\u7AA3"));	// 窣
        assertEquals(JISX0213String.length("\u7AA3"), 1);
        assertTrue(JISX0213String.isValid("\u7AAC"));	// 窬
        assertEquals(JISX0213String.length("\u7AAC"), 1);
        assertTrue(JISX0213String.isValid("\u7AB3"));	// 窳
        assertEquals(JISX0213String.length("\u7AB3"), 1);
        assertTrue(JISX0213String.isValid("\u7AB9"));	// 窹
        assertEquals(JISX0213String.length("\u7AB9"), 1);
        assertTrue(JISX0213String.isValid("\u7ABB"));	// 窻
        assertEquals(JISX0213String.length("\u7ABB"), 1);
        assertTrue(JISX0213String.isValid("\u7ABC"));	// 窼
        assertEquals(JISX0213String.length("\u7ABC"), 1);
        assertTrue(JISX0213String.isValid("\u7ACC"));	// 竌
        assertEquals(JISX0213String.length("\u7ACC"), 1);
        assertTrue(JISX0213String.isValid("\u7ACE"));	// 竎
        assertEquals(JISX0213String.length("\u7ACE"), 1);
        assertTrue(JISX0213String.isValid("\u7AE8"));	// 竨
        assertEquals(JISX0213String.length("\u7AE8"), 1);
        assertTrue(JISX0213String.isValid("\u7AF4"));	// 竴
        assertEquals(JISX0213String.length("\u7AF4"), 1);
        assertTrue(JISX0213String.isValid("\u7AFD"));	// 竽
        assertEquals(JISX0213String.length("\u7AFD"), 1);
        assertTrue(JISX0213String.isValid("\u7B07"));	// 笇
        assertEquals(JISX0213String.length("\u7B07"), 1);
        assertTrue(JISX0213String.isValid("\u7B27"));	// 笧
        assertEquals(JISX0213String.length("\u7B27"), 1);
        assertTrue(JISX0213String.isValid("\u7B2A"));	// 笪
        assertEquals(JISX0213String.length("\u7B2A"), 1);
        assertTrue(JISX0213String.isValid("\u7B2D"));	// 笭
        assertEquals(JISX0213String.length("\u7B2D"), 1);
        assertTrue(JISX0213String.isValid("\u7B2E"));	// 笮
        assertEquals(JISX0213String.length("\u7B2E"), 1);
        assertTrue(JISX0213String.isValid("\u7B2F"));	// 笯
        assertEquals(JISX0213String.length("\u7B2F"), 1);
        assertTrue(JISX0213String.isValid("\u7B31"));	// 笱
        assertEquals(JISX0213String.length("\u7B31"), 1);
        assertTrue(JISX0213String.isValid("\u7B3D"));	// 笽
        assertEquals(JISX0213String.length("\u7B3D"), 1);
        assertTrue(JISX0213String.isValid("\u7B41"));	// 筁
        assertEquals(JISX0213String.length("\u7B41"), 1);
        assertTrue(JISX0213String.isValid("\u7B47"));	// 筇
        assertEquals(JISX0213String.length("\u7B47"), 1);
        assertTrue(JISX0213String.isValid("\u7B4E"));	// 筎
        assertEquals(JISX0213String.length("\u7B4E"), 1);
        assertTrue(JISX0213String.isValid("\u7B55"));	// 筕
        assertEquals(JISX0213String.length("\u7B55"), 1);
        assertTrue(JISX0213String.isValid("\u7B60"));	// 筠
        assertEquals(JISX0213String.length("\u7B60"), 1);
        assertTrue(JISX0213String.isValid("\u7B64"));	// 筤
        assertEquals(JISX0213String.length("\u7B64"), 1);
        assertTrue(JISX0213String.isValid("\u7B66"));	// 筦
        assertEquals(JISX0213String.length("\u7B66"), 1);
        assertTrue(JISX0213String.isValid("\u7B69"));	// 筩
        assertEquals(JISX0213String.length("\u7B69"), 1);
        assertTrue(JISX0213String.isValid("\u7B6D"));	// 筭
        assertEquals(JISX0213String.length("\u7B6D"), 1);
        assertTrue(JISX0213String.isValid("\u7B6F"));	// 筯
        assertEquals(JISX0213String.length("\u7B6F"), 1);
        assertTrue(JISX0213String.isValid("\u7B72"));	// 筲
        assertEquals(JISX0213String.length("\u7B72"), 1);
        assertTrue(JISX0213String.isValid("\u7B73"));	// 筳
        assertEquals(JISX0213String.length("\u7B73"), 1);
        assertTrue(JISX0213String.isValid("\u7B90"));	// 箐
        assertEquals(JISX0213String.length("\u7B90"), 1);
        assertTrue(JISX0213String.isValid("\u7B91"));	// 箑
        assertEquals(JISX0213String.length("\u7B91"), 1);
        assertTrue(JISX0213String.isValid("\u7B9B"));	// 箛
        assertEquals(JISX0213String.length("\u7B9B"), 1);
        assertTrue(JISX0213String.isValid("\u7BAF"));	// 箯
        assertEquals(JISX0213String.length("\u7BAF"), 1);
        assertTrue(JISX0213String.isValid("\u7BB5"));	// 箵
        assertEquals(JISX0213String.length("\u7BB5"), 1);
        assertTrue(JISX0213String.isValid("\u7BBC"));	// 箼
        assertEquals(JISX0213String.length("\u7BBC"), 1);
        assertTrue(JISX0213String.isValid("\u7BC5"));	// 篅
        assertEquals(JISX0213String.length("\u7BC5"), 1);
        assertTrue(JISX0213String.isValid("\u7BCA"));	// 篊
        assertEquals(JISX0213String.length("\u7BCA"), 1);
        assertTrue(JISX0213String.isValid("\u7BD4"));	// 篔
        assertEquals(JISX0213String.length("\u7BD4"), 1);
        assertTrue(JISX0213String.isValid("\u7BD6"));	// 篖
        assertEquals(JISX0213String.length("\u7BD6"), 1);
        assertTrue(JISX0213String.isValid("\u7BD7"));	// 篗
        assertEquals(JISX0213String.length("\u7BD7"), 1);
        assertTrue(JISX0213String.isValid("\u7BD9"));	// 篙
        assertEquals(JISX0213String.length("\u7BD9"), 1);
        assertTrue(JISX0213String.isValid("\u7BDA"));	// 篚
        assertEquals(JISX0213String.length("\u7BDA"), 1);
        assertTrue(JISX0213String.isValid("\u7BEA"));	// 篪
        assertEquals(JISX0213String.length("\u7BEA"), 1);
        assertTrue(JISX0213String.isValid("\u7C01"));	// 簁
        assertEquals(JISX0213String.length("\u7C01"), 1);
        assertTrue(JISX0213String.isValid("\u7C03"));	// 簃
        assertEquals(JISX0213String.length("\u7C03"), 1);
        assertTrue(JISX0213String.isValid("\u7C0B"));	// 簋
        assertEquals(JISX0213String.length("\u7C0B"), 1);
        assertTrue(JISX0213String.isValid("\u7C0E"));	// 簎
        assertEquals(JISX0213String.length("\u7C0E"), 1);
        assertTrue(JISX0213String.isValid("\u7C0F"));	// 簏
        assertEquals(JISX0213String.length("\u7C0F"), 1);
        assertTrue(JISX0213String.isValid("\u7C20"));	// 簠
        assertEquals(JISX0213String.length("\u7C20"), 1);
        assertTrue(JISX0213String.isValid("\u7C26"));	// 簦
        assertEquals(JISX0213String.length("\u7C26"), 1);
        assertTrue(JISX0213String.isValid("\u7C31"));	// 簱
        assertEquals(JISX0213String.length("\u7C31"), 1);
        assertTrue(JISX0213String.isValid("\u7C33"));	// 簳
        assertEquals(JISX0213String.length("\u7C33"), 1);
        assertTrue(JISX0213String.isValid("\u7C36"));	// 簶
        assertEquals(JISX0213String.length("\u7C36"), 1);
        assertTrue(JISX0213String.isValid("\u7C4A"));	// 籊
        assertEquals(JISX0213String.length("\u7C4A"), 1);
        assertTrue(JISX0213String.isValid("\u7C51"));	// 籑
        assertEquals(JISX0213String.length("\u7C51"), 1);
        assertTrue(JISX0213String.isValid("\u7C59"));	// 籙
        assertEquals(JISX0213String.length("\u7C59"), 1);
        assertTrue(JISX0213String.isValid("\u7C5E"));	// 籞
        assertEquals(JISX0213String.length("\u7C5E"), 1);
        assertTrue(JISX0213String.isValid("\u7C61"));	// 籡
        assertEquals(JISX0213String.length("\u7C61"), 1);
        assertTrue(JISX0213String.isValid("\u7C69"));	// 籩
        assertEquals(JISX0213String.length("\u7C69"), 1);
        assertTrue(JISX0213String.isValid("\u7C6D"));	// 籭
        assertEquals(JISX0213String.length("\u7C6D"), 1);
        assertTrue(JISX0213String.isValid("\u7C6E"));	// 籮
        assertEquals(JISX0213String.length("\u7C6E"), 1);
        assertTrue(JISX0213String.isValid("\u7C70"));	// 籰
        assertEquals(JISX0213String.length("\u7C70"), 1);
        assertTrue(JISX0213String.isValid("\u7C79"));	// 籹
        assertEquals(JISX0213String.length("\u7C79"), 1);
        assertTrue(JISX0213String.isValid("\u7C8F"));	// 粏
        assertEquals(JISX0213String.length("\u7C8F"), 1);
        assertTrue(JISX0213String.isValid("\u7C94"));	// 粔
        assertEquals(JISX0213String.length("\u7C94"), 1);
        assertTrue(JISX0213String.isValid("\u7CA0"));	// 粠
        assertEquals(JISX0213String.length("\u7CA0"), 1);
        assertTrue(JISX0213String.isValid("\u7CA6"));	// 粦
        assertEquals(JISX0213String.length("\u7CA6"), 1);
        assertTrue(JISX0213String.isValid("\u7CB6"));	// 粶
        assertEquals(JISX0213String.length("\u7CB6"), 1);
        assertTrue(JISX0213String.isValid("\u7CB7"));	// 粷
        assertEquals(JISX0213String.length("\u7CB7"), 1);
        assertTrue(JISX0213String.isValid("\u7CBC"));	// 粼
        assertEquals(JISX0213String.length("\u7CBC"), 1);
        assertTrue(JISX0213String.isValid("\u7CBF"));	// 粿
        assertEquals(JISX0213String.length("\u7CBF"), 1);
        assertTrue(JISX0213String.isValid("\u7CC4"));	// 糄
        assertEquals(JISX0213String.length("\u7CC4"), 1);
        assertTrue(JISX0213String.isValid("\u7CC8"));	// 糈
        assertEquals(JISX0213String.length("\u7CC8"), 1);
        assertTrue(JISX0213String.isValid("\u7CCD"));	// 糍
        assertEquals(JISX0213String.length("\u7CCD"), 1);
        assertTrue(JISX0213String.isValid("\u7CD5"));	// 糕
        assertEquals(JISX0213String.length("\u7CD5"), 1);
        assertTrue(JISX0213String.isValid("\u7CD7"));	// 糗
        assertEquals(JISX0213String.length("\u7CD7"), 1);
        assertTrue(JISX0213String.isValid("\u7CD9"));	// 糙
        assertEquals(JISX0213String.length("\u7CD9"), 1);
        assertTrue(JISX0213String.isValid("\u7CDD"));	// 糝
        assertEquals(JISX0213String.length("\u7CDD"), 1);
        assertTrue(JISX0213String.isValid("\u7CE6"));	// 糦
        assertEquals(JISX0213String.length("\u7CE6"), 1);
        assertTrue(JISX0213String.isValid("\u7CEB"));	// 糫
        assertEquals(JISX0213String.length("\u7CEB"), 1);
        assertTrue(JISX0213String.isValid("\u7CF5"));	// 糵
        assertEquals(JISX0213String.length("\u7CF5"), 1);
        assertTrue(JISX0213String.isValid("\u7D03"));	// 紃
        assertEquals(JISX0213String.length("\u7D03"), 1);
        assertTrue(JISX0213String.isValid("\u7D07"));	// 紇
        assertEquals(JISX0213String.length("\u7D07"), 1);
        assertTrue(JISX0213String.isValid("\u7D08"));	// 紈
        assertEquals(JISX0213String.length("\u7D08"), 1);
        assertTrue(JISX0213String.isValid("\u7D09"));	// 紉
        assertEquals(JISX0213String.length("\u7D09"), 1);
        assertTrue(JISX0213String.isValid("\u7D12"));	// 紒
        assertEquals(JISX0213String.length("\u7D12"), 1);
        assertTrue(JISX0213String.isValid("\u7D13"));	// 紓
        assertEquals(JISX0213String.length("\u7D13"), 1);
        assertTrue(JISX0213String.isValid("\u7D1D"));	// 紝
        assertEquals(JISX0213String.length("\u7D1D"), 1);
        assertTrue(JISX0213String.isValid("\u7D1E"));	// 紞
        assertEquals(JISX0213String.length("\u7D1E"), 1);
        assertTrue(JISX0213String.isValid("\u7D23"));	// 紣
        assertEquals(JISX0213String.length("\u7D23"), 1);
        assertTrue(JISX0213String.isValid("\u7D31"));	// 紱
        assertEquals(JISX0213String.length("\u7D31"), 1);
        assertTrue(JISX0213String.isValid("\u7D3D"));	// 紽
        assertEquals(JISX0213String.length("\u7D3D"), 1);
        assertTrue(JISX0213String.isValid("\u7D3E"));	// 紾
        assertEquals(JISX0213String.length("\u7D3E"), 1);
        assertTrue(JISX0213String.isValid("\u7D40"));	// 絀
        assertEquals(JISX0213String.length("\u7D40"), 1);
        assertTrue(JISX0213String.isValid("\u7D41"));	// 絁
        assertEquals(JISX0213String.length("\u7D41"), 1);
        assertTrue(JISX0213String.isValid("\u7D47"));	// 絇
        assertEquals(JISX0213String.length("\u7D47"), 1);
        assertTrue(JISX0213String.isValid("\u7D53"));	// 絓
        assertEquals(JISX0213String.length("\u7D53"), 1);
        assertTrue(JISX0213String.isValid("\u7D59"));	// 絙
        assertEquals(JISX0213String.length("\u7D59"), 1);
        assertTrue(JISX0213String.isValid("\u7D5A"));	// 絚
        assertEquals(JISX0213String.length("\u7D5A"), 1);
        assertTrue(JISX0213String.isValid("\u7D6A"));	// 絪
        assertEquals(JISX0213String.length("\u7D6A"), 1);
        assertTrue(JISX0213String.isValid("\u7D70"));	// 絰
        assertEquals(JISX0213String.length("\u7D70"), 1);
        assertTrue(JISX0213String.isValid("\u7D7A"));	// 絺
        assertEquals(JISX0213String.length("\u7D7A"), 1);
        assertTrue(JISX0213String.isValid("\u7D7F"));	// 絿
        assertEquals(JISX0213String.length("\u7D7F"), 1);
        assertTrue(JISX0213String.isValid("\u7D83"));	// 綃
        assertEquals(JISX0213String.length("\u7D83"), 1);
        assertTrue(JISX0213String.isValid("\u7D86"));	// 綆
        assertEquals(JISX0213String.length("\u7D86"), 1);
        assertTrue(JISX0213String.isValid("\u7D88"));	// 綈
        assertEquals(JISX0213String.length("\u7D88"), 1);
        assertTrue(JISX0213String.isValid("\u7D8B"));	// 綋
        assertEquals(JISX0213String.length("\u7D8B"), 1);
        assertTrue(JISX0213String.isValid("\u7D8C"));	// 綌
        assertEquals(JISX0213String.length("\u7D8C"), 1);
        assertTrue(JISX0213String.isValid("\u7D97"));	// 綗
        assertEquals(JISX0213String.length("\u7D97"), 1);
        assertTrue(JISX0213String.isValid("\u7D9D"));	// 綝
        assertEquals(JISX0213String.length("\u7D9D"), 1);
        assertTrue(JISX0213String.isValid("\u7DA6"));	// 綦
        assertEquals(JISX0213String.length("\u7DA6"), 1);
        assertTrue(JISX0213String.isValid("\u7DA7"));	// 綧
        assertEquals(JISX0213String.length("\u7DA7"), 1);
        assertTrue(JISX0213String.isValid("\u7DAA"));	// 綪
        assertEquals(JISX0213String.length("\u7DAA"), 1);
        assertTrue(JISX0213String.isValid("\u7DB6"));	// 綶
        assertEquals(JISX0213String.length("\u7DB6"), 1);
        assertTrue(JISX0213String.isValid("\u7DC2"));	// 緂
        assertEquals(JISX0213String.length("\u7DC2"), 1);
        assertTrue(JISX0213String.isValid("\u7DCC"));	// 緌
        assertEquals(JISX0213String.length("\u7DCC"), 1);
        assertTrue(JISX0213String.isValid("\u7DD7"));	// 緗
        assertEquals(JISX0213String.length("\u7DD7"), 1);
        assertTrue(JISX0213String.isValid("\u7DD9"));	// 緙
        assertEquals(JISX0213String.length("\u7DD9"), 1);
        assertTrue(JISX0213String.isValid("\u7DE6"));	// 緦
        assertEquals(JISX0213String.length("\u7DE6"), 1);
        assertTrue(JISX0213String.isValid("\u7DF1"));	// 緱
        assertEquals(JISX0213String.length("\u7DF1"), 1);
        assertTrue(JISX0213String.isValid("\u7DF9"));	// 緹
        assertEquals(JISX0213String.length("\u7DF9"), 1);
        assertTrue(JISX0213String.isValid("\u7E08"));	// 縈
        assertEquals(JISX0213String.length("\u7E08"), 1);
        assertTrue(JISX0213String.isValid("\u7E10"));	// 縐
        assertEquals(JISX0213String.length("\u7E10"), 1);
        assertTrue(JISX0213String.isValid("\u7E11"));	// 縑
        assertEquals(JISX0213String.length("\u7E11"), 1);
        assertTrue(JISX0213String.isValid("\u7E15"));	// 縕
        assertEquals(JISX0213String.length("\u7E15"), 1);
        assertTrue(JISX0213String.isValid("\u7E17"));	// 縗
        assertEquals(JISX0213String.length("\u7E17"), 1);
        assertTrue(JISX0213String.isValid("\u7E1D"));	// 縝
        assertEquals(JISX0213String.length("\u7E1D"), 1);
        assertTrue(JISX0213String.isValid("\u7E20"));	// 縠
        assertEquals(JISX0213String.length("\u7E20"), 1);
        assertTrue(JISX0213String.isValid("\u7E27"));	// 縧
        assertEquals(JISX0213String.length("\u7E27"), 1);
        assertTrue(JISX0213String.isValid("\u7E28"));	// 縨
        assertEquals(JISX0213String.length("\u7E28"), 1);
        assertTrue(JISX0213String.isValid("\u7E2C"));	// 縬
        assertEquals(JISX0213String.length("\u7E2C"), 1);
        assertTrue(JISX0213String.isValid("\u7E45"));	// 繅
        assertEquals(JISX0213String.length("\u7E45"), 1);
        assertTrue(JISX0213String.isValid("\u7E47"));	// 繇
        assertEquals(JISX0213String.length("\u7E47"), 1);
        assertTrue(JISX0213String.isValid("\u7E61"));	// 繡
        assertEquals(JISX0213String.length("\u7E61"), 1);
        assertTrue(JISX0213String.isValid("\u7E6B"));	// 繫
        assertEquals(JISX0213String.length("\u7E6B"), 1);
        assertTrue(JISX0213String.isValid("\u7E73"));	// 繳
        assertEquals(JISX0213String.length("\u7E73"), 1);
        assertTrue(JISX0213String.isValid("\u7E7E"));	// 繾
        assertEquals(JISX0213String.length("\u7E7E"), 1);
        assertTrue(JISX0213String.isValid("\u7E86"));	// 纆
        assertEquals(JISX0213String.length("\u7E86"), 1);
        assertTrue(JISX0213String.isValid("\u7E87"));	// 纇
        assertEquals(JISX0213String.length("\u7E87"), 1);
        assertTrue(JISX0213String.isValid("\u7E8D"));	// 纍
        assertEquals(JISX0213String.length("\u7E8D"), 1);
        assertTrue(JISX0213String.isValid("\u7E91"));	// 纑
        assertEquals(JISX0213String.length("\u7E91"), 1);
        assertTrue(JISX0213String.isValid("\u7E98"));	// 纘
        assertEquals(JISX0213String.length("\u7E98"), 1);
        assertTrue(JISX0213String.isValid("\u7E9A"));	// 纚
        assertEquals(JISX0213String.length("\u7E9A"), 1);
        assertTrue(JISX0213String.isValid("\u7F3C"));	// 缼
        assertEquals(JISX0213String.length("\u7F3C"), 1);
        assertTrue(JISX0213String.isValid("\u7F3B"));	// 缻
        assertEquals(JISX0213String.length("\u7F3B"), 1);
        assertTrue(JISX0213String.isValid("\u7F3E"));	// 缾
        assertEquals(JISX0213String.length("\u7F3E"), 1);
        assertTrue(JISX0213String.isValid("\u7F43"));	// 罃
        assertEquals(JISX0213String.length("\u7F43"), 1);
        assertTrue(JISX0213String.isValid("\u7F44"));	// 罄
        assertEquals(JISX0213String.length("\u7F44"), 1);
        assertTrue(JISX0213String.isValid("\u7F4F"));	// 罏
        assertEquals(JISX0213String.length("\u7F4F"), 1);
        assertTrue(JISX0213String.isValid("\u7F52"));	// 罒
        assertEquals(JISX0213String.length("\u7F52"), 1);
        assertTrue(JISX0213String.isValid("\u7F61"));	// 罡
        assertEquals(JISX0213String.length("\u7F61"), 1);
        assertTrue(JISX0213String.isValid("\u7F63"));	// 罣
        assertEquals(JISX0213String.length("\u7F63"), 1);
        assertTrue(JISX0213String.isValid("\u7F64"));	// 罤
        assertEquals(JISX0213String.length("\u7F64"), 1);
        assertTrue(JISX0213String.isValid("\u7F6D"));	// 罭
        assertEquals(JISX0213String.length("\u7F6D"), 1);
        assertTrue(JISX0213String.isValid("\u7F7D"));	// 罽
        assertEquals(JISX0213String.length("\u7F7D"), 1);
        assertTrue(JISX0213String.isValid("\u7F7E"));	// 罾
        assertEquals(JISX0213String.length("\u7F7E"), 1);
        assertTrue(JISX0213String.isValid("\u7F90"));	// 羐
        assertEquals(JISX0213String.length("\u7F90"), 1);
        assertTrue(JISX0213String.isValid("\u7F91"));	// 羑
        assertEquals(JISX0213String.length("\u7F91"), 1);
        assertTrue(JISX0213String.isValid("\u7F96"));	// 羖
        assertEquals(JISX0213String.length("\u7F96"), 1);
        assertTrue(JISX0213String.isValid("\u7F97"));	// 羗
        assertEquals(JISX0213String.length("\u7F97"), 1);
        assertTrue(JISX0213String.isValid("\u7F9C"));	// 羜
        assertEquals(JISX0213String.length("\u7F9C"), 1);
        assertTrue(JISX0213String.isValid("\u7FAD"));	// 羭
        assertEquals(JISX0213String.length("\u7FAD"), 1);
        assertTrue(JISX0213String.isValid("\u7FBF"));	// 羿
        assertEquals(JISX0213String.length("\u7FBF"), 1);
        assertTrue(JISX0213String.isValid("\u7FC3"));	// 翃
        assertEquals(JISX0213String.length("\u7FC3"), 1);
        assertTrue(JISX0213String.isValid("\u7FCE"));	// 翎
        assertEquals(JISX0213String.length("\u7FCE"), 1);
        assertTrue(JISX0213String.isValid("\u7FCF"));	// 翏
        assertEquals(JISX0213String.length("\u7FCF"), 1);
        assertTrue(JISX0213String.isValid("\u7FDB"));	// 翛
        assertEquals(JISX0213String.length("\u7FDB"), 1);
        assertTrue(JISX0213String.isValid("\u7FDF"));	// 翟
        assertEquals(JISX0213String.length("\u7FDF"), 1);
        assertTrue(JISX0213String.isValid("\u7FE3"));	// 翣
        assertEquals(JISX0213String.length("\u7FE3"), 1);
        assertTrue(JISX0213String.isValid("\u7FE5"));	// 翥
        assertEquals(JISX0213String.length("\u7FE5"), 1);
        assertTrue(JISX0213String.isValid("\u7FEC"));	// 翬
        assertEquals(JISX0213String.length("\u7FEC"), 1);
        assertTrue(JISX0213String.isValid("\u7FEE"));	// 翮
        assertEquals(JISX0213String.length("\u7FEE"), 1);
        assertTrue(JISX0213String.isValid("\u7FEF"));	// 翯
        assertEquals(JISX0213String.length("\u7FEF"), 1);
        assertTrue(JISX0213String.isValid("\u7FF2"));	// 翲
        assertEquals(JISX0213String.length("\u7FF2"), 1);
        assertTrue(JISX0213String.isValid("\u7FFA"));	// 翺
        assertEquals(JISX0213String.length("\u7FFA"), 1);
        assertTrue(JISX0213String.isValid("\u8008"));	// 耈
        assertEquals(JISX0213String.length("\u8008"), 1);
        assertTrue(JISX0213String.isValid("\u800A"));	// 耊
        assertEquals(JISX0213String.length("\u800A"), 1);
        assertTrue(JISX0213String.isValid("\u800E"));	// 耎
        assertEquals(JISX0213String.length("\u800E"), 1);
        assertTrue(JISX0213String.isValid("\u8011"));	// 耑
        assertEquals(JISX0213String.length("\u8011"), 1);
        assertTrue(JISX0213String.isValid("\u8014"));	// 耔
        assertEquals(JISX0213String.length("\u8014"), 1);
        assertTrue(JISX0213String.isValid("\u8016"));	// 耖
        assertEquals(JISX0213String.length("\u8016"), 1);
        assertTrue(JISX0213String.isValid("\u8024"));	// 耤
        assertEquals(JISX0213String.length("\u8024"), 1);
        assertTrue(JISX0213String.isValid("\u8026"));	// 耦
        assertEquals(JISX0213String.length("\u8026"), 1);
        assertTrue(JISX0213String.isValid("\u802C"));	// 耬
        assertEquals(JISX0213String.length("\u802C"), 1);
        assertTrue(JISX0213String.isValid("\u8030"));	// 耰
        assertEquals(JISX0213String.length("\u8030"), 1);
        assertTrue(JISX0213String.isValid("\u8035"));	// 耵
        assertEquals(JISX0213String.length("\u8035"), 1);
        assertTrue(JISX0213String.isValid("\u8037"));	// 耷
        assertEquals(JISX0213String.length("\u8037"), 1);
        assertTrue(JISX0213String.isValid("\u803C"));	// 耼
        assertEquals(JISX0213String.length("\u803C"), 1);
        assertTrue(JISX0213String.isValid("\u8066"));	// 聦
        assertEquals(JISX0213String.length("\u8066"), 1);
        assertTrue(JISX0213String.isValid("\u8071"));	// 聱
        assertEquals(JISX0213String.length("\u8071"), 1);
        assertTrue(JISX0213String.isValid("\u8075"));	// 聵
        assertEquals(JISX0213String.length("\u8075"), 1);
        assertTrue(JISX0213String.isValid("\u809C"));	// 肜
        assertEquals(JISX0213String.length("\u809C"), 1);
        assertTrue(JISX0213String.isValid("\u80A7"));	// 肧
        assertEquals(JISX0213String.length("\u80A7"), 1);
        assertTrue(JISX0213String.isValid("\u80B8"));	// 肸
        assertEquals(JISX0213String.length("\u80B8"), 1);
        assertTrue(JISX0213String.isValid("\u80D5"));	// 胕
        assertEquals(JISX0213String.length("\u80D5"), 1);
        assertTrue(JISX0213String.isValid("\u80D7"));	// 胗
        assertEquals(JISX0213String.length("\u80D7"), 1);
        assertTrue(JISX0213String.isValid("\u80D8"));	// 胘
        assertEquals(JISX0213String.length("\u80D8"), 1);
        assertTrue(JISX0213String.isValid("\u80E0"));	// 胠
        assertEquals(JISX0213String.length("\u80E0"), 1);
        assertTrue(JISX0213String.isValid("\u80F3"));	// 胳
        assertEquals(JISX0213String.length("\u80F3"), 1);
        assertTrue(JISX0213String.isValid("\u8116"));	// 脖
        assertEquals(JISX0213String.length("\u8116"), 1);
        assertTrue(JISX0213String.isValid("\u8118"));	// 脘
        assertEquals(JISX0213String.length("\u8118"), 1);
        assertTrue(JISX0213String.isValid("\u811E"));	// 脞
        assertEquals(JISX0213String.length("\u811E"), 1);
        assertTrue(JISX0213String.isValid("\u8124"));	// 脤
        assertEquals(JISX0213String.length("\u8124"), 1);
        assertTrue(JISX0213String.isValid("\u8127"));	// 脧
        assertEquals(JISX0213String.length("\u8127"), 1);
        assertTrue(JISX0213String.isValid("\u812C"));	// 脬
        assertEquals(JISX0213String.length("\u812C"), 1);
        assertTrue(JISX0213String.isValid("\u8135"));	// 脵
        assertEquals(JISX0213String.length("\u8135"), 1);
        assertTrue(JISX0213String.isValid("\u814A"));	// 腊
        assertEquals(JISX0213String.length("\u814A"), 1);
        assertTrue(JISX0213String.isValid("\u8160"));	// 腠
        assertEquals(JISX0213String.length("\u8160"), 1);
        assertTrue(JISX0213String.isValid("\u8167"));	// 腧
        assertEquals(JISX0213String.length("\u8167"), 1);
        assertTrue(JISX0213String.isValid("\u8168"));	// 腨
        assertEquals(JISX0213String.length("\u8168"), 1);
        assertTrue(JISX0213String.isValid("\u8169"));	// 腩
        assertEquals(JISX0213String.length("\u8169"), 1);
        assertTrue(JISX0213String.isValid("\u816D"));	// 腭
        assertEquals(JISX0213String.length("\u816D"), 1);
        assertTrue(JISX0213String.isValid("\u8181"));	// 膁
        assertEquals(JISX0213String.length("\u8181"), 1);
        assertTrue(JISX0213String.isValid("\u8184"));	// 膄
        assertEquals(JISX0213String.length("\u8184"), 1);
        assertTrue(JISX0213String.isValid("\u8185"));	// 膅
        assertEquals(JISX0213String.length("\u8185"), 1);
        assertTrue(JISX0213String.isValid("\u8198"));	// 膘
        assertEquals(JISX0213String.length("\u8198"), 1);
        assertTrue(JISX0213String.isValid("\u81B2"));	// 膲
        assertEquals(JISX0213String.length("\u81B2"), 1);
        assertTrue(JISX0213String.isValid("\u81BB"));	// 膻
        assertEquals(JISX0213String.length("\u81BB"), 1);
        assertTrue(JISX0213String.isValid("\u81C3"));	// 臃
        assertEquals(JISX0213String.length("\u81C3"), 1);
        assertTrue(JISX0213String.isValid("\u81CA"));	// 臊
        assertEquals(JISX0213String.length("\u81CA"), 1);
        assertTrue(JISX0213String.isValid("\u81CF"));	// 臏
        assertEquals(JISX0213String.length("\u81CF"), 1);
        assertTrue(JISX0213String.isValid("\u81D7"));	// 臗
        assertEquals(JISX0213String.length("\u81D7"), 1);
        assertTrue(JISX0213String.isValid("\u81DB"));	// 臛
        assertEquals(JISX0213String.length("\u81DB"), 1);
        assertTrue(JISX0213String.isValid("\u81E4"));	// 臤
        assertEquals(JISX0213String.length("\u81E4"), 1);
        assertTrue(JISX0213String.isValid("\u81EC"));	// 臬
        assertEquals(JISX0213String.length("\u81EC"), 1);
        assertTrue(JISX0213String.isValid("\u81FD"));	// 臽
        assertEquals(JISX0213String.length("\u81FD"), 1);
        assertTrue(JISX0213String.isValid("\u81FF"));	// 臿
        assertEquals(JISX0213String.length("\u81FF"), 1);
        assertTrue(JISX0213String.isValid("\u8219"));	// 舙
        assertEquals(JISX0213String.length("\u8219"), 1);
        assertTrue(JISX0213String.isValid("\u8221"));	// 舡
        assertEquals(JISX0213String.length("\u8221"), 1);
        assertTrue(JISX0213String.isValid("\u8222"));	// 舢
        assertEquals(JISX0213String.length("\u8222"), 1);
        assertTrue(JISX0213String.isValid("\u8232"));	// 舲
        assertEquals(JISX0213String.length("\u8232"), 1);
        assertTrue(JISX0213String.isValid("\u8234"));	// 舴
        assertEquals(JISX0213String.length("\u8234"), 1);
        assertTrue(JISX0213String.isValid("\u8245"));	// 艅
        assertEquals(JISX0213String.length("\u8245"), 1);
        assertTrue(JISX0213String.isValid("\u8246"));	// 艆
        assertEquals(JISX0213String.length("\u8246"), 1);
        assertTrue(JISX0213String.isValid("\u824B"));	// 艋
        assertEquals(JISX0213String.length("\u824B"), 1);
        assertTrue(JISX0213String.isValid("\u824F"));	// 艏
        assertEquals(JISX0213String.length("\u824F"), 1);
        assertTrue(JISX0213String.isValid("\u825C"));	// 艜
        assertEquals(JISX0213String.length("\u825C"), 1);
        assertTrue(JISX0213String.isValid("\u8260"));	// 艠
        assertEquals(JISX0213String.length("\u8260"), 1);
        assertTrue(JISX0213String.isValid("\u8263"));	// 艣
        assertEquals(JISX0213String.length("\u8263"), 1);
        assertTrue(JISX0213String.isValid("\u8274"));	// 艴
        assertEquals(JISX0213String.length("\u8274"), 1);
        assertTrue(JISX0213String.isValid("\u827D"));	// 艽
        assertEquals(JISX0213String.length("\u827D"), 1);
        assertTrue(JISX0213String.isValid("\u827F"));	// 艿
        assertEquals(JISX0213String.length("\u827F"), 1);
        assertTrue(JISX0213String.isValid("\u8283"));	// 芃
        assertEquals(JISX0213String.length("\u8283"), 1);
        assertTrue(JISX0213String.isValid("\u828A"));	// 芊
        assertEquals(JISX0213String.length("\u828A"), 1);
        assertTrue(JISX0213String.isValid("\u828E"));	// 芎
        assertEquals(JISX0213String.length("\u828E"), 1);
        assertTrue(JISX0213String.isValid("\u82A1"));	// 芡
        assertEquals(JISX0213String.length("\u82A1"), 1);
        assertTrue(JISX0213String.isValid("\u82A3"));	// 芣
        assertEquals(JISX0213String.length("\u82A3"), 1);
        assertTrue(JISX0213String.isValid("\u82A4"));	// 芤
        assertEquals(JISX0213String.length("\u82A4"), 1);
        assertTrue(JISX0213String.isValid("\u82A7"));	// 芧
        assertEquals(JISX0213String.length("\u82A7"), 1);
        assertTrue(JISX0213String.isValid("\u82A8"));	// 芨
        assertEquals(JISX0213String.length("\u82A8"), 1);
        assertTrue(JISX0213String.isValid("\u82A9"));	// 芩
        assertEquals(JISX0213String.length("\u82A9"), 1);
        assertTrue(JISX0213String.isValid("\u82AE"));	// 芮
        assertEquals(JISX0213String.length("\u82AE"), 1);
        assertTrue(JISX0213String.isValid("\u82B2"));	// 芲
        assertEquals(JISX0213String.length("\u82B2"), 1);
        assertTrue(JISX0213String.isValid("\u82B4"));	// 芴
        assertEquals(JISX0213String.length("\u82B4"), 1);
        assertTrue(JISX0213String.isValid("\u82B7"));	// 芷
        assertEquals(JISX0213String.length("\u82B7"), 1);
        assertTrue(JISX0213String.isValid("\u82BA"));	// 芺
        assertEquals(JISX0213String.length("\u82BA"), 1);
        assertTrue(JISX0213String.isValid("\u82BC"));	// 芼
        assertEquals(JISX0213String.length("\u82BC"), 1);
        assertTrue(JISX0213String.isValid("\u82BE"));	// 芾
        assertEquals(JISX0213String.length("\u82BE"), 1);
        assertTrue(JISX0213String.isValid("\u82BF"));	// 芿
        assertEquals(JISX0213String.length("\u82BF"), 1);
        assertTrue(JISX0213String.isValid("\u82C6"));	// 苆
        assertEquals(JISX0213String.length("\u82C6"), 1);
        assertTrue(JISX0213String.isValid("\u82D5"));	// 苕
        assertEquals(JISX0213String.length("\u82D5"), 1);
        assertTrue(JISX0213String.isValid("\u82E2"));	// 苢
        assertEquals(JISX0213String.length("\u82E2"), 1);
        assertTrue(JISX0213String.isValid("\u82E8"));	// 苨
        assertEquals(JISX0213String.length("\u82E8"), 1);
        assertTrue(JISX0213String.isValid("\u82F7"));	// 苷
        assertEquals(JISX0213String.length("\u82F7"), 1);
        assertTrue(JISX0213String.isValid("\u82FD"));	// 苽
        assertEquals(JISX0213String.length("\u82FD"), 1);
        assertTrue(JISX0213String.isValid("\u82FE"));	// 苾
        assertEquals(JISX0213String.length("\u82FE"), 1);
        assertTrue(JISX0213String.isValid("\u8300"));	// 茀
        assertEquals(JISX0213String.length("\u8300"), 1);
        assertTrue(JISX0213String.isValid("\u8307"));	// 茇
        assertEquals(JISX0213String.length("\u8307"), 1);
        assertTrue(JISX0213String.isValid("\u8308"));	// 茈
        assertEquals(JISX0213String.length("\u8308"), 1);
        assertTrue(JISX0213String.isValid("\u8354"));	// 荔
        assertEquals(JISX0213String.length("\u8354"), 1);
        assertTrue(JISX0213String.isValid("\u831B"));	// 茛
        assertEquals(JISX0213String.length("\u831B"), 1);
        assertTrue(JISX0213String.isValid("\u831D"));	// 茝
        assertEquals(JISX0213String.length("\u831D"), 1);
        assertTrue(JISX0213String.isValid("\u8322"));	// 茢
        assertEquals(JISX0213String.length("\u8322"), 1);
        assertTrue(JISX0213String.isValid("\u832D"));	// 茭
        assertEquals(JISX0213String.length("\u832D"), 1);
        assertTrue(JISX0213String.isValid("\u8330"));	// 茰
        assertEquals(JISX0213String.length("\u8330"), 1);
        assertTrue(JISX0213String.isValid("\u833A"));	// 茺
        assertEquals(JISX0213String.length("\u833A"), 1);
        assertTrue(JISX0213String.isValid("\u833C"));	// 茼
        assertEquals(JISX0213String.length("\u833C"), 1);
        assertTrue(JISX0213String.isValid("\u8343"));	// 荃
        assertEquals(JISX0213String.length("\u8343"), 1);
        assertTrue(JISX0213String.isValid("\u8344"));	// 荄
        assertEquals(JISX0213String.length("\u8344"), 1);
        assertTrue(JISX0213String.isValid("\u8347"));	// 荇
        assertEquals(JISX0213String.length("\u8347"), 1);
        assertTrue(JISX0213String.isValid("\u8351"));	// 荑
        assertEquals(JISX0213String.length("\u8351"), 1);
        assertTrue(JISX0213String.isValid("\u8355"));	// 荕
        assertEquals(JISX0213String.length("\u8355"), 1);
        assertTrue(JISX0213String.isValid("\u8357"));	// 荗
        assertEquals(JISX0213String.length("\u8357"), 1);
        assertTrue(JISX0213String.isValid("\u837D"));	// 荽
        assertEquals(JISX0213String.length("\u837D"), 1);
        assertTrue(JISX0213String.isValid("\u8386"));	// 莆
        assertEquals(JISX0213String.length("\u8386"), 1);
        assertTrue(JISX0213String.isValid("\u838D"));	// 莍
        assertEquals(JISX0213String.length("\u838D"), 1);
        assertTrue(JISX0213String.isValid("\u8392"));	// 莒
        assertEquals(JISX0213String.length("\u8392"), 1);
        assertTrue(JISX0213String.isValid("\u8394"));	// 莔
        assertEquals(JISX0213String.length("\u8394"), 1);
        assertTrue(JISX0213String.isValid("\u8395"));	// 莕
        assertEquals(JISX0213String.length("\u8395"), 1);
        assertTrue(JISX0213String.isValid("\u8398"));	// 莘
        assertEquals(JISX0213String.length("\u8398"), 1);
        assertTrue(JISX0213String.isValid("\u839B"));	// 莛
        assertEquals(JISX0213String.length("\u839B"), 1);
        assertTrue(JISX0213String.isValid("\u839D"));	// 莝
        assertEquals(JISX0213String.length("\u839D"), 1);
        assertTrue(JISX0213String.isValid("\u83A7"));	// 莧
        assertEquals(JISX0213String.length("\u83A7"), 1);
        assertTrue(JISX0213String.isValid("\u83A9"));	// 莩
        assertEquals(JISX0213String.length("\u83A9"), 1);
        assertTrue(JISX0213String.isValid("\u83BF"));	// 莿
        assertEquals(JISX0213String.length("\u83BF"), 1);
        assertTrue(JISX0213String.isValid("\u83C0"));	// 菀
        assertEquals(JISX0213String.length("\u83C0"), 1);
        assertTrue(JISX0213String.isValid("\u83C9"));	// 菉
        assertEquals(JISX0213String.length("\u83C9"), 1);
        assertTrue(JISX0213String.isValid("\u83CF"));	// 菏
        assertEquals(JISX0213String.length("\u83CF"), 1);
        assertTrue(JISX0213String.isValid("\u83D0"));	// 菐
        assertEquals(JISX0213String.length("\u83D0"), 1);
        assertTrue(JISX0213String.isValid("\u83D1"));	// 菑
        assertEquals(JISX0213String.length("\u83D1"), 1);
        assertTrue(JISX0213String.isValid("\u83D4"));	// 菔
        assertEquals(JISX0213String.length("\u83D4"), 1);
        assertTrue(JISX0213String.isValid("\u83DD"));	// 菝
        assertEquals(JISX0213String.length("\u83DD"), 1);
        assertTrue(JISX0213String.isValid("\u83EA"));	// 菪
        assertEquals(JISX0213String.length("\u83EA"), 1);
        assertTrue(JISX0213String.isValid("\u83F9"));	// 菹
        assertEquals(JISX0213String.length("\u83F9"), 1);
        assertTrue(JISX0213String.isValid("\u8401"));	// 萁
        assertEquals(JISX0213String.length("\u8401"), 1);
        assertTrue(JISX0213String.isValid("\u8406"));	// 萆
        assertEquals(JISX0213String.length("\u8406"), 1);
        assertTrue(JISX0213String.isValid("\u840A"));	// 萊
        assertEquals(JISX0213String.length("\u840A"), 1);
        assertTrue(JISX0213String.isValid("\u840F"));	// 萏
        assertEquals(JISX0213String.length("\u840F"), 1);
        assertTrue(JISX0213String.isValid("\u8411"));	// 萑
        assertEquals(JISX0213String.length("\u8411"), 1);
        assertTrue(JISX0213String.isValid("\u8415"));	// 萕
        assertEquals(JISX0213String.length("\u8415"), 1);
        assertTrue(JISX0213String.isValid("\u8439"));	// 萹
        assertEquals(JISX0213String.length("\u8439"), 1);
        assertTrue(JISX0213String.isValid("\u844A"));	// 葊
        assertEquals(JISX0213String.length("\u844A"), 1);
        assertTrue(JISX0213String.isValid("\u844F"));	// 葏
        assertEquals(JISX0213String.length("\u844F"), 1);
        assertTrue(JISX0213String.isValid("\u8451"));	// 葑
        assertEquals(JISX0213String.length("\u8451"), 1);
        assertTrue(JISX0213String.isValid("\u8452"));	// 葒
        assertEquals(JISX0213String.length("\u8452"), 1);
        assertTrue(JISX0213String.isValid("\u8459"));	// 葙
        assertEquals(JISX0213String.length("\u8459"), 1);
        assertTrue(JISX0213String.isValid("\u845A"));	// 葚
        assertEquals(JISX0213String.length("\u845A"), 1);
        assertTrue(JISX0213String.isValid("\u845C"));	// 葜
        assertEquals(JISX0213String.length("\u845C"), 1);
        assertTrue(JISX0213String.isValid("\u8465"));	// 葥
        assertEquals(JISX0213String.length("\u8465"), 1);
        assertTrue(JISX0213String.isValid("\u8470"));	// 葰
        assertEquals(JISX0213String.length("\u8470"), 1);
        assertTrue(JISX0213String.isValid("\u8473"));	// 葳
        assertEquals(JISX0213String.length("\u8473"), 1);
        assertTrue(JISX0213String.isValid("\u8476"));	// 葶
        assertEquals(JISX0213String.length("\u8476"), 1);
        assertTrue(JISX0213String.isValid("\u8478"));	// 葸
        assertEquals(JISX0213String.length("\u8478"), 1);
        assertTrue(JISX0213String.isValid("\u847C"));	// 葼
        assertEquals(JISX0213String.length("\u847C"), 1);
        assertTrue(JISX0213String.isValid("\u8481"));	// 蒁
        assertEquals(JISX0213String.length("\u8481"), 1);
        assertTrue(JISX0213String.isValid("\u8485"));	// 蒅
        assertEquals(JISX0213String.length("\u8485"), 1);
        assertTrue(JISX0213String.isValid("\u849E"));	// 蒞
        assertEquals(JISX0213String.length("\u849E"), 1);
        assertTrue(JISX0213String.isValid("\u84A6"));	// 蒦
        assertEquals(JISX0213String.length("\u84A6"), 1);
        assertTrue(JISX0213String.isValid("\u84AF"));	// 蒯
        assertEquals(JISX0213String.length("\u84AF"), 1);
        assertTrue(JISX0213String.isValid("\u84BA"));	// 蒺
        assertEquals(JISX0213String.length("\u84BA"), 1);
        assertTrue(JISX0213String.isValid("\u84BE"));	// 蒾
        assertEquals(JISX0213String.length("\u84BE"), 1);
        assertTrue(JISX0213String.isValid("\u84C0"));	// 蓀
        assertEquals(JISX0213String.length("\u84C0"), 1);
        assertTrue(JISX0213String.isValid("\u84C2"));	// 蓂
        assertEquals(JISX0213String.length("\u84C2"), 1);
        assertTrue(JISX0213String.isValid("\u84CF"));	// 蓏
        assertEquals(JISX0213String.length("\u84CF"), 1);
        assertTrue(JISX0213String.isValid("\u84D3"));	// 蓓
        assertEquals(JISX0213String.length("\u84D3"), 1);
        assertTrue(JISX0213String.isValid("\u84E7"));	// 蓧
        assertEquals(JISX0213String.length("\u84E7"), 1);
        assertTrue(JISX0213String.isValid("\u84EA"));	// 蓪
        assertEquals(JISX0213String.length("\u84EA"), 1);
        assertTrue(JISX0213String.isValid("\u84EF"));	// 蓯
        assertEquals(JISX0213String.length("\u84EF"), 1);
        assertTrue(JISX0213String.isValid("\u84F0"));	// 蓰
        assertEquals(JISX0213String.length("\u84F0"), 1);
        assertTrue(JISX0213String.isValid("\u84F1"));	// 蓱
        assertEquals(JISX0213String.length("\u84F1"), 1);
        assertTrue(JISX0213String.isValid("\u8532"));	// 蔲
        assertEquals(JISX0213String.length("\u8532"), 1);
        assertTrue(JISX0213String.isValid("\u84FA"));	// 蓺
        assertEquals(JISX0213String.length("\u84FA"), 1);
        assertTrue(JISX0213String.isValid("\u84FD"));	// 蓽
        assertEquals(JISX0213String.length("\u84FD"), 1);
        assertTrue(JISX0213String.isValid("\u850C"));	// 蔌
        assertEquals(JISX0213String.length("\u850C"), 1);
        assertTrue(JISX0213String.isValid("\u851E"));	// 蔞
        assertEquals(JISX0213String.length("\u851E"), 1);
        assertTrue(JISX0213String.isValid("\u8523"));	// 蔣
        assertEquals(JISX0213String.length("\u8523"), 1);
        assertTrue(JISX0213String.isValid("\u8524"));	// 蔤
        assertEquals(JISX0213String.length("\u8524"), 1);
        assertTrue(JISX0213String.isValid("\u8525"));	// 蔥
        assertEquals(JISX0213String.length("\u8525"), 1);
        assertTrue(JISX0213String.isValid("\u852B"));	// 蔫
        assertEquals(JISX0213String.length("\u852B"), 1);
        assertTrue(JISX0213String.isValid("\u852F"));	// 蔯
        assertEquals(JISX0213String.length("\u852F"), 1);
        assertTrue(JISX0213String.isValid("\u8534"));	// 蔴
        assertEquals(JISX0213String.length("\u8534"), 1);
        assertTrue(JISX0213String.isValid("\u854F"));	// 蕏
        assertEquals(JISX0213String.length("\u854F"), 1);
        assertTrue(JISX0213String.isValid("\u8551"));	// 蕑
        assertEquals(JISX0213String.length("\u8551"), 1);
        assertTrue(JISX0213String.isValid("\u855E"));	// 蕞
        assertEquals(JISX0213String.length("\u855E"), 1);
        assertTrue(JISX0213String.isValid("\u8561"));	// 蕡
        assertEquals(JISX0213String.length("\u8561"), 1);
        assertTrue(JISX0213String.isValid("\u8562"));	// 蕢
        assertEquals(JISX0213String.length("\u8562"), 1);
        assertTrue(JISX0213String.isValid("\u8564"));	// 蕤
        assertEquals(JISX0213String.length("\u8564"), 1);
        assertTrue(JISX0213String.isValid("\u856F"));	// 蕯
        assertEquals(JISX0213String.length("\u856F"), 1);
        assertTrue(JISX0213String.isValid("\u857A"));	// 蕺
        assertEquals(JISX0213String.length("\u857A"), 1);
        assertTrue(JISX0213String.isValid("\u857B"));	// 蕻
        assertEquals(JISX0213String.length("\u857B"), 1);
        assertTrue(JISX0213String.isValid("\u857D"));	// 蕽
        assertEquals(JISX0213String.length("\u857D"), 1);
        assertTrue(JISX0213String.isValid("\u857F"));	// 蕿
        assertEquals(JISX0213String.length("\u857F"), 1);
        assertTrue(JISX0213String.isValid("\u8581"));	// 薁
        assertEquals(JISX0213String.length("\u8581"), 1);
        assertTrue(JISX0213String.isValid("\u8586"));	// 薆
        assertEquals(JISX0213String.length("\u8586"), 1);
        assertTrue(JISX0213String.isValid("\u858C"));	// 薌
        assertEquals(JISX0213String.length("\u858C"), 1);
        assertTrue(JISX0213String.isValid("\u858F"));	// 薏
        assertEquals(JISX0213String.length("\u858F"), 1);
        assertTrue(JISX0213String.isValid("\u8593"));	// 薓
        assertEquals(JISX0213String.length("\u8593"), 1);
        assertTrue(JISX0213String.isValid("\u859D"));	// 薝
        assertEquals(JISX0213String.length("\u859D"), 1);
        assertTrue(JISX0213String.isValid("\u859F"));	// 薟
        assertEquals(JISX0213String.length("\u859F"), 1);
        assertTrue(JISX0213String.isValid("\u85A2"));	// 薢
        assertEquals(JISX0213String.length("\u85A2"), 1);
        assertTrue(JISX0213String.isValid("\u85B7"));	// 薷
        assertEquals(JISX0213String.length("\u85B7"), 1);
        assertTrue(JISX0213String.isValid("\u85BC"));	// 薼
        assertEquals(JISX0213String.length("\u85BC"), 1);
        assertTrue(JISX0213String.isValid("\u85C7"));	// 藇
        assertEquals(JISX0213String.length("\u85C7"), 1);
        assertTrue(JISX0213String.isValid("\u85CA"));	// 藊
        assertEquals(JISX0213String.length("\u85CA"), 1);
        assertTrue(JISX0213String.isValid("\u85CB"));	// 藋
        assertEquals(JISX0213String.length("\u85CB"), 1);
        assertTrue(JISX0213String.isValid("\u85CE"));	// 藎
        assertEquals(JISX0213String.length("\u85CE"), 1);
        assertTrue(JISX0213String.isValid("\u85AD"));	// 薭
        assertEquals(JISX0213String.length("\u85AD"), 1);
        assertTrue(JISX0213String.isValid("\u85D8"));	// 藘
        assertEquals(JISX0213String.length("\u85D8"), 1);
        assertTrue(JISX0213String.isValid("\u85DF"));	// 藟
        assertEquals(JISX0213String.length("\u85DF"), 1);
        assertTrue(JISX0213String.isValid("\u85E6"));	// 藦
        assertEquals(JISX0213String.length("\u85E6"), 1);
        assertTrue(JISX0213String.isValid("\u85ED"));	// 藭
        assertEquals(JISX0213String.length("\u85ED"), 1);
        assertTrue(JISX0213String.isValid("\u85F6"));	// 藶
        assertEquals(JISX0213String.length("\u85F6"), 1);
        assertTrue(JISX0213String.isValid("\u85FF"));	// 藿
        assertEquals(JISX0213String.length("\u85FF"), 1);
        assertTrue(JISX0213String.isValid("\u8600"));	// 蘀
        assertEquals(JISX0213String.length("\u8600"), 1);
        assertTrue(JISX0213String.isValid("\u8604"));	// 蘄
        assertEquals(JISX0213String.length("\u8604"), 1);
        assertTrue(JISX0213String.isValid("\u8605"));	// 蘅
        assertEquals(JISX0213String.length("\u8605"), 1);
        assertTrue(JISX0213String.isValid("\u8610"));	// 蘐
        assertEquals(JISX0213String.length("\u8610"), 1);
        assertTrue(JISX0213String.isValid("\u8611"));	// 蘑
        assertEquals(JISX0213String.length("\u8611"), 1);
        assertTrue(JISX0213String.isValid("\u8612"));	// 蘒
        assertEquals(JISX0213String.length("\u8612"), 1);
        assertTrue(JISX0213String.isValid("\u8618"));	// 蘘
        assertEquals(JISX0213String.length("\u8618"), 1);
        assertTrue(JISX0213String.isValid("\u861E"));	// 蘞
        assertEquals(JISX0213String.length("\u861E"), 1);
        assertTrue(JISX0213String.isValid("\u8621"));	// 蘡
        assertEquals(JISX0213String.length("\u8621"), 1);
        assertTrue(JISX0213String.isValid("\u8627"));	// 蘧
        assertEquals(JISX0213String.length("\u8627"), 1);
        assertTrue(JISX0213String.isValid("\u8629"));	// 蘩
        assertEquals(JISX0213String.length("\u8629"), 1);
        assertTrue(JISX0213String.isValid("\u8638"));	// 蘸
        assertEquals(JISX0213String.length("\u8638"), 1);
        assertTrue(JISX0213String.isValid("\u863C"));	// 蘼
        assertEquals(JISX0213String.length("\u863C"), 1);
        assertTrue(JISX0213String.isValid("\u8640"));	// 虀
        assertEquals(JISX0213String.length("\u8640"), 1);
        assertTrue(JISX0213String.isValid("\u8653"));	// 虓
        assertEquals(JISX0213String.length("\u8653"), 1);
        assertTrue(JISX0213String.isValid("\u8656"));	// 虖
        assertEquals(JISX0213String.length("\u8656"), 1);
        assertTrue(JISX0213String.isValid("\u8657"));	// 虗
        assertEquals(JISX0213String.length("\u8657"), 1);
        assertTrue(JISX0213String.isValid("\u8662"));	// 虢
        assertEquals(JISX0213String.length("\u8662"), 1);
        assertTrue(JISX0213String.isValid("\u866C"));	// 虬
        assertEquals(JISX0213String.length("\u866C"), 1);
        assertTrue(JISX0213String.isValid("\u866F"));	// 虯
        assertEquals(JISX0213String.length("\u866F"), 1);
        assertTrue(JISX0213String.isValid("\u8675"));	// 虵
        assertEquals(JISX0213String.length("\u8675"), 1);
        assertTrue(JISX0213String.isValid("\u8677"));	// 虷
        assertEquals(JISX0213String.length("\u8677"), 1);
        assertTrue(JISX0213String.isValid("\u867A"));	// 虺
        assertEquals(JISX0213String.length("\u867A"), 1);
        assertTrue(JISX0213String.isValid("\u868D"));	// 蚍
        assertEquals(JISX0213String.length("\u868D"), 1);
        assertTrue(JISX0213String.isValid("\u8691"));	// 蚑
        assertEquals(JISX0213String.length("\u8691"), 1);
        assertTrue(JISX0213String.isValid("\u8698"));	// 蚘
        assertEquals(JISX0213String.length("\u8698"), 1);
        assertTrue(JISX0213String.isValid("\u869C"));	// 蚜
        assertEquals(JISX0213String.length("\u869C"), 1);
        assertTrue(JISX0213String.isValid("\u86A8"));	// 蚨
        assertEquals(JISX0213String.length("\u86A8"), 1);
        assertTrue(JISX0213String.isValid("\u86B1"));	// 蚱
        assertEquals(JISX0213String.length("\u86B1"), 1);
        assertTrue(JISX0213String.isValid("\u86B3"));	// 蚳
        assertEquals(JISX0213String.length("\u86B3"), 1);
        assertTrue(JISX0213String.isValid("\u86B8"));	// 蚸
        assertEquals(JISX0213String.length("\u86B8"), 1);
        assertTrue(JISX0213String.isValid("\u86C1"));	// 蛁
        assertEquals(JISX0213String.length("\u86C1"), 1);
        assertTrue(JISX0213String.isValid("\u86C3"));	// 蛃
        assertEquals(JISX0213String.length("\u86C3"), 1);
        assertTrue(JISX0213String.isValid("\u86D1"));	// 蛑
        assertEquals(JISX0213String.length("\u86D1"), 1);
        assertTrue(JISX0213String.isValid("\u86D5"));	// 蛕
        assertEquals(JISX0213String.length("\u86D5"), 1);
        assertTrue(JISX0213String.isValid("\u86D7"));	// 蛗
        assertEquals(JISX0213String.length("\u86D7"), 1);
        assertTrue(JISX0213String.isValid("\u86E3"));	// 蛣
        assertEquals(JISX0213String.length("\u86E3"), 1);
        assertTrue(JISX0213String.isValid("\u86FA"));	// 蛺
        assertEquals(JISX0213String.length("\u86FA"), 1);
        assertTrue(JISX0213String.isValid("\u86FC"));	// 蛼
        assertEquals(JISX0213String.length("\u86FC"), 1);
        assertTrue(JISX0213String.isValid("\u86FD"));	// 蛽
        assertEquals(JISX0213String.length("\u86FD"), 1);
        assertTrue(JISX0213String.isValid("\u8705"));	// 蜅
        assertEquals(JISX0213String.length("\u8705"), 1);
        assertTrue(JISX0213String.isValid("\u8707"));	// 蜇
        assertEquals(JISX0213String.length("\u8707"), 1);
        assertTrue(JISX0213String.isValid("\u870B"));	// 蜋
        assertEquals(JISX0213String.length("\u870B"), 1);
        assertTrue(JISX0213String.isValid("\u870E"));	// 蜎
        assertEquals(JISX0213String.length("\u870E"), 1);
        assertTrue(JISX0213String.isValid("\u8710"));	// 蜐
        assertEquals(JISX0213String.length("\u8710"), 1);
        assertTrue(JISX0213String.isValid("\u8713"));	// 蜓
        assertEquals(JISX0213String.length("\u8713"), 1);
        assertTrue(JISX0213String.isValid("\u8719"));	// 蜙
        assertEquals(JISX0213String.length("\u8719"), 1);
        assertTrue(JISX0213String.isValid("\u871F"));	// 蜟
        assertEquals(JISX0213String.length("\u871F"), 1);
        assertTrue(JISX0213String.isValid("\u8721"));	// 蜡
        assertEquals(JISX0213String.length("\u8721"), 1);
        assertTrue(JISX0213String.isValid("\u8723"));	// 蜣
        assertEquals(JISX0213String.length("\u8723"), 1);
        assertTrue(JISX0213String.isValid("\u8731"));	// 蜱
        assertEquals(JISX0213String.length("\u8731"), 1);
        assertTrue(JISX0213String.isValid("\u873A"));	// 蜺
        assertEquals(JISX0213String.length("\u873A"), 1);
        assertTrue(JISX0213String.isValid("\u873E"));	// 蜾
        assertEquals(JISX0213String.length("\u873E"), 1);
        assertTrue(JISX0213String.isValid("\u8740"));	// 蝀
        assertEquals(JISX0213String.length("\u8740"), 1);
        assertTrue(JISX0213String.isValid("\u8743"));	// 蝃
        assertEquals(JISX0213String.length("\u8743"), 1);
        assertTrue(JISX0213String.isValid("\u8758"));	// 蝘
        assertEquals(JISX0213String.length("\u8758"), 1);
        assertTrue(JISX0213String.isValid("\u8764"));	// 蝤
        assertEquals(JISX0213String.length("\u8764"), 1);
        assertTrue(JISX0213String.isValid("\u8765"));	// 蝥
        assertEquals(JISX0213String.length("\u8765"), 1);
        assertTrue(JISX0213String.isValid("\u8771"));	// 蝱
        assertEquals(JISX0213String.length("\u8771"), 1);
        assertTrue(JISX0213String.isValid("\u8772"));	// 蝲
        assertEquals(JISX0213String.length("\u8772"), 1);
        assertTrue(JISX0213String.isValid("\u8787"));	// 螇
        assertEquals(JISX0213String.length("\u8787"), 1);
        assertTrue(JISX0213String.isValid("\u8788"));	// 螈
        assertEquals(JISX0213String.length("\u8788"), 1);
        assertTrue(JISX0213String.isValid("\u8789"));	// 螉
        assertEquals(JISX0213String.length("\u8789"), 1);
        assertTrue(JISX0213String.isValid("\u878B"));	// 螋
        assertEquals(JISX0213String.length("\u878B"), 1);
        assertTrue(JISX0213String.isValid("\u8793"));	// 螓
        assertEquals(JISX0213String.length("\u8793"), 1);
        assertTrue(JISX0213String.isValid("\u87A0"));	// 螠
        assertEquals(JISX0213String.length("\u87A0"), 1);
        assertTrue(JISX0213String.isValid("\u87A7"));	// 螧
        assertEquals(JISX0213String.length("\u87A7"), 1);
        assertTrue(JISX0213String.isValid("\u87AC"));	// 螬
        assertEquals(JISX0213String.length("\u87AC"), 1);
        assertTrue(JISX0213String.isValid("\u87AD"));	// 螭
        assertEquals(JISX0213String.length("\u87AD"), 1);
        assertTrue(JISX0213String.isValid("\u87B5"));	// 螵
        assertEquals(JISX0213String.length("\u87B5"), 1);
        assertTrue(JISX0213String.isValid("\u87BE"));	// 螾
        assertEquals(JISX0213String.length("\u87BE"), 1);
        assertTrue(JISX0213String.isValid("\u87C1"));	// 蟁
        assertEquals(JISX0213String.length("\u87C1"), 1);
        assertTrue(JISX0213String.isValid("\u87CE"));	// 蟎
        assertEquals(JISX0213String.length("\u87CE"), 1);
        assertTrue(JISX0213String.isValid("\u87D6"));	// 蟖
        assertEquals(JISX0213String.length("\u87D6"), 1);
        assertTrue(JISX0213String.isValid("\u87DF"));	// 蟟
        assertEquals(JISX0213String.length("\u87DF"), 1);
        assertTrue(JISX0213String.isValid("\u87E3"));	// 蟣
        assertEquals(JISX0213String.length("\u87E3"), 1);
        assertTrue(JISX0213String.isValid("\u87EA"));	// 蟪
        assertEquals(JISX0213String.length("\u87EA"), 1);
        assertTrue(JISX0213String.isValid("\u87EB"));	// 蟫
        assertEquals(JISX0213String.length("\u87EB"), 1);
        assertTrue(JISX0213String.isValid("\u87ED"));	// 蟭
        assertEquals(JISX0213String.length("\u87ED"), 1);
        assertTrue(JISX0213String.isValid("\u8801"));	// 蠁
        assertEquals(JISX0213String.length("\u8801"), 1);
        assertTrue(JISX0213String.isValid("\u8803"));	// 蠃
        assertEquals(JISX0213String.length("\u8803"), 1);
        assertTrue(JISX0213String.isValid("\u8806"));	// 蠆
        assertEquals(JISX0213String.length("\u8806"), 1);
        assertTrue(JISX0213String.isValid("\u880A"));	// 蠊
        assertEquals(JISX0213String.length("\u880A"), 1);
        assertTrue(JISX0213String.isValid("\u880B"));	// 蠋
        assertEquals(JISX0213String.length("\u880B"), 1);
        assertTrue(JISX0213String.isValid("\u8810"));	// 蠐
        assertEquals(JISX0213String.length("\u8810"), 1);
        assertTrue(JISX0213String.isValid("\u8813"));	// 蠓
        assertEquals(JISX0213String.length("\u8813"), 1);
        assertTrue(JISX0213String.isValid("\u8814"));	// 蠔
        assertEquals(JISX0213String.length("\u8814"), 1);
        assertTrue(JISX0213String.isValid("\u881F"));	// 蠟
        assertEquals(JISX0213String.length("\u881F"), 1);
        assertTrue(JISX0213String.isValid("\u8828"));	// 蠨
        assertEquals(JISX0213String.length("\u8828"), 1);
        assertTrue(JISX0213String.isValid("\u882E"));	// 蠮
        assertEquals(JISX0213String.length("\u882E"), 1);
        assertTrue(JISX0213String.isValid("\u8832"));	// 蠲
        assertEquals(JISX0213String.length("\u8832"), 1);
        assertTrue(JISX0213String.isValid("\u883C"));	// 蠼
        assertEquals(JISX0213String.length("\u883C"), 1);
        assertTrue(JISX0213String.isValid("\u884A"));	// 衊
        assertEquals(JISX0213String.length("\u884A"), 1);
        assertTrue(JISX0213String.isValid("\u8858"));	// 衘
        assertEquals(JISX0213String.length("\u8858"), 1);
        assertTrue(JISX0213String.isValid("\u885F"));	// 衟
        assertEquals(JISX0213String.length("\u885F"), 1);
        assertTrue(JISX0213String.isValid("\u8864"));	// 衤
        assertEquals(JISX0213String.length("\u8864"), 1);
        assertTrue(JISX0213String.isValid("\u8869"));	// 衩
        assertEquals(JISX0213String.length("\u8869"), 1);
        assertTrue(JISX0213String.isValid("\u8898"));	// 袘
        assertEquals(JISX0213String.length("\u8898"), 1);
        assertTrue(JISX0213String.isValid("\u88A0"));	// 袠
        assertEquals(JISX0213String.length("\u88A0"), 1);
        assertTrue(JISX0213String.isValid("\u88AA"));	// 袪
        assertEquals(JISX0213String.length("\u88AA"), 1);
        assertTrue(JISX0213String.isValid("\u88BD"));	// 袽
        assertEquals(JISX0213String.length("\u88BD"), 1);
        assertTrue(JISX0213String.isValid("\u88BE"));	// 袾
        assertEquals(JISX0213String.length("\u88BE"), 1);
        assertTrue(JISX0213String.isValid("\u88C0"));	// 裀
        assertEquals(JISX0213String.length("\u88C0"), 1);
        assertTrue(JISX0213String.isValid("\u88CA"));	// 裊
        assertEquals(JISX0213String.length("\u88CA"), 1);
        assertTrue(JISX0213String.isValid("\u88CE"));	// 裎
        assertEquals(JISX0213String.length("\u88CE"), 1);
        assertTrue(JISX0213String.isValid("\u88D1"));	// 裑
        assertEquals(JISX0213String.length("\u88D1"), 1);
        assertTrue(JISX0213String.isValid("\u88D2"));	// 裒
        assertEquals(JISX0213String.length("\u88D2"), 1);
        assertTrue(JISX0213String.isValid("\u88D3"));	// 裓
        assertEquals(JISX0213String.length("\u88D3"), 1);
        assertTrue(JISX0213String.isValid("\u88DB"));	// 裛
        assertEquals(JISX0213String.length("\u88DB"), 1);
        assertTrue(JISX0213String.isValid("\u88F0"));	// 裰
        assertEquals(JISX0213String.length("\u88F0"), 1);
        assertTrue(JISX0213String.isValid("\u88F1"));	// 裱
        assertEquals(JISX0213String.length("\u88F1"), 1);
        assertTrue(JISX0213String.isValid("\u8901"));	// 褁
        assertEquals(JISX0213String.length("\u8901"), 1);
        assertTrue(JISX0213String.isValid("\u8918"));	// 褘
        assertEquals(JISX0213String.length("\u8918"), 1);
        assertTrue(JISX0213String.isValid("\u8919"));	// 褙
        assertEquals(JISX0213String.length("\u8919"), 1);
        assertTrue(JISX0213String.isValid("\u891A"));	// 褚
        assertEquals(JISX0213String.length("\u891A"), 1);
        assertTrue(JISX0213String.isValid("\u8927"));	// 褧
        assertEquals(JISX0213String.length("\u8927"), 1);
        assertTrue(JISX0213String.isValid("\u8930"));	// 褰
        assertEquals(JISX0213String.length("\u8930"), 1);
        assertTrue(JISX0213String.isValid("\u8932"));	// 褲
        assertEquals(JISX0213String.length("\u8932"), 1);
        assertTrue(JISX0213String.isValid("\u8939"));	// 褹
        assertEquals(JISX0213String.length("\u8939"), 1);
        assertTrue(JISX0213String.isValid("\u8940"));	// 襀
        assertEquals(JISX0213String.length("\u8940"), 1);
        assertTrue(JISX0213String.isValid("\u8942"));	// 襂
        assertEquals(JISX0213String.length("\u8942"), 1);
        assertTrue(JISX0213String.isValid("\u8945"));	// 襅
        assertEquals(JISX0213String.length("\u8945"), 1);
        assertTrue(JISX0213String.isValid("\u8949"));	// 襉
        assertEquals(JISX0213String.length("\u8949"), 1);
        assertTrue(JISX0213String.isValid("\u8962"));	// 襢
        assertEquals(JISX0213String.length("\u8962"), 1);
        assertTrue(JISX0213String.isValid("\u8989"));	// 覉
        assertEquals(JISX0213String.length("\u8989"), 1);
        assertTrue(JISX0213String.isValid("\u8990"));	// 覐
        assertEquals(JISX0213String.length("\u8990"), 1);
        assertTrue(JISX0213String.isValid("\u8994"));	// 覔
        assertEquals(JISX0213String.length("\u8994"), 1);
        assertTrue(JISX0213String.isValid("\u899F"));	// 覟
        assertEquals(JISX0213String.length("\u899F"), 1);
        assertTrue(JISX0213String.isValid("\u89B0"));	// 覰
        assertEquals(JISX0213String.length("\u89B0"), 1);
        assertTrue(JISX0213String.isValid("\u89B7"));	// 覷
        assertEquals(JISX0213String.length("\u89B7"), 1);
        assertTrue(JISX0213String.isValid("\u89D4"));	// 觔
        assertEquals(JISX0213String.length("\u89D4"), 1);
        assertTrue(JISX0213String.isValid("\u89D6"));	// 觖
        assertEquals(JISX0213String.length("\u89D6"), 1);
        assertTrue(JISX0213String.isValid("\u89D8"));	// 觘
        assertEquals(JISX0213String.length("\u89D8"), 1);
        assertTrue(JISX0213String.isValid("\u89E5"));	// 觥
        assertEquals(JISX0213String.length("\u89E5"), 1);
        assertTrue(JISX0213String.isValid("\u89EB"));	// 觫
        assertEquals(JISX0213String.length("\u89EB"), 1);
        assertTrue(JISX0213String.isValid("\u89F1"));	// 觱
        assertEquals(JISX0213String.length("\u89F1"), 1);
        assertTrue(JISX0213String.isValid("\u89F3"));	// 觳
        assertEquals(JISX0213String.length("\u89F3"), 1);
        assertTrue(JISX0213String.isValid("\u89F6"));	// 觶
        assertEquals(JISX0213String.length("\u89F6"), 1);
        assertTrue(JISX0213String.isValid("\u89FD"));	// 觽
        assertEquals(JISX0213String.length("\u89FD"), 1);
        assertTrue(JISX0213String.isValid("\u89FF"));	// 觿
        assertEquals(JISX0213String.length("\u89FF"), 1);
        assertTrue(JISX0213String.isValid("\u8A11"));	// 訑
        assertEquals(JISX0213String.length("\u8A11"), 1);
        assertTrue(JISX0213String.isValid("\u8A14"));	// 訔
        assertEquals(JISX0213String.length("\u8A14"), 1);
        assertTrue(JISX0213String.isValid("\u8A15"));	// 訕
        assertEquals(JISX0213String.length("\u8A15"), 1);
        assertTrue(JISX0213String.isValid("\u8A22"));	// 訢
        assertEquals(JISX0213String.length("\u8A22"), 1);
        assertTrue(JISX0213String.isValid("\u8A35"));	// 訵
        assertEquals(JISX0213String.length("\u8A35"), 1);
        assertTrue(JISX0213String.isValid("\u8A3E"));	// 訾
        assertEquals(JISX0213String.length("\u8A3E"), 1);
        assertTrue(JISX0213String.isValid("\u8A45"));	// 詅
        assertEquals(JISX0213String.length("\u8A45"), 1);
        assertTrue(JISX0213String.isValid("\u8A47"));	// 詇
        assertEquals(JISX0213String.length("\u8A47"), 1);
        assertTrue(JISX0213String.isValid("\u8A4D"));	// 詍
        assertEquals(JISX0213String.length("\u8A4D"), 1);
        assertTrue(JISX0213String.isValid("\u8A4E"));	// 詎
        assertEquals(JISX0213String.length("\u8A4E"), 1);
        assertTrue(JISX0213String.isValid("\u8A58"));	// 詘
        assertEquals(JISX0213String.length("\u8A58"), 1);
        assertTrue(JISX0213String.isValid("\u8A5D"));	// 詝
        assertEquals(JISX0213String.length("\u8A5D"), 1);
        assertTrue(JISX0213String.isValid("\u8A61"));	// 詡
        assertEquals(JISX0213String.length("\u8A61"), 1);
        assertTrue(JISX0213String.isValid("\u8A75"));	// 詵
        assertEquals(JISX0213String.length("\u8A75"), 1);
        assertTrue(JISX0213String.isValid("\u8A90"));	// 誐
        assertEquals(JISX0213String.length("\u8A90"), 1);
        assertTrue(JISX0213String.isValid("\u8AAE"));	// 誮
        assertEquals(JISX0213String.length("\u8AAE"), 1);
        assertTrue(JISX0213String.isValid("\u8AB7"));	// 誷
        assertEquals(JISX0213String.length("\u8AB7"), 1);
        assertTrue(JISX0213String.isValid("\u8AD7"));	// 諗
        assertEquals(JISX0213String.length("\u8AD7"), 1);
        assertTrue(JISX0213String.isValid("\u8AF4"));	// 諴
        assertEquals(JISX0213String.length("\u8AF4"), 1);
        assertTrue(JISX0213String.isValid("\u8AFC"));	// 諼
        assertEquals(JISX0213String.length("\u8AFC"), 1);
        assertTrue(JISX0213String.isValid("\u8B05"));	// 謅
        assertEquals(JISX0213String.length("\u8B05"), 1);
        assertTrue(JISX0213String.isValid("\u8B1C"));	// 謜
        assertEquals(JISX0213String.length("\u8B1C"), 1);
        assertTrue(JISX0213String.isValid("\u8B1F"));	// 謟
        assertEquals(JISX0213String.length("\u8B1F"), 1);
        assertTrue(JISX0213String.isValid("\u8B0A"));	// 謊
        assertEquals(JISX0213String.length("\u8B0A"), 1);
        assertTrue(JISX0213String.isValid("\u8B2D"));	// 謭
        assertEquals(JISX0213String.length("\u8B2D"), 1);
        assertTrue(JISX0213String.isValid("\u8B43"));	// 譃
        assertEquals(JISX0213String.length("\u8B43"), 1);
        assertTrue(JISX0213String.isValid("\u8B46"));	// 譆
        assertEquals(JISX0213String.length("\u8B46"), 1);
        assertTrue(JISX0213String.isValid("\u8B54"));	// 譔
        assertEquals(JISX0213String.length("\u8B54"), 1);
        assertTrue(JISX0213String.isValid("\u8B59"));	// 譙
        assertEquals(JISX0213String.length("\u8B59"), 1);
        assertTrue(JISX0213String.isValid("\u8B5E"));	// 譞
        assertEquals(JISX0213String.length("\u8B5E"), 1);
        assertTrue(JISX0213String.isValid("\u8B76"));	// 譶
        assertEquals(JISX0213String.length("\u8B76"), 1);
        assertTrue(JISX0213String.isValid("\u8B81"));	// 讁
        assertEquals(JISX0213String.length("\u8B81"), 1);
        assertTrue(JISX0213String.isValid("\u8B8B"));	// 讋
        assertEquals(JISX0213String.length("\u8B8B"), 1);
        assertTrue(JISX0213String.isValid("\u8B94"));	// 讔
        assertEquals(JISX0213String.length("\u8B94"), 1);
        assertTrue(JISX0213String.isValid("\u8B95"));	// 讕
        assertEquals(JISX0213String.length("\u8B95"), 1);
        assertTrue(JISX0213String.isValid("\u8B9C"));	// 讜
        assertEquals(JISX0213String.length("\u8B9C"), 1);
        assertTrue(JISX0213String.isValid("\u8B9E"));	// 讞
        assertEquals(JISX0213String.length("\u8B9E"), 1);
        assertTrue(JISX0213String.isValid("\u8C39"));	// 谹
        assertEquals(JISX0213String.length("\u8C39"), 1);
        assertTrue(JISX0213String.isValid("\u8C3D"));	// 谽
        assertEquals(JISX0213String.length("\u8C3D"), 1);
        assertTrue(JISX0213String.isValid("\u8C45"));	// 豅
        assertEquals(JISX0213String.length("\u8C45"), 1);
        assertTrue(JISX0213String.isValid("\u8C47"));	// 豇
        assertEquals(JISX0213String.length("\u8C47"), 1);
        assertTrue(JISX0213String.isValid("\u8C49"));	// 豉
        assertEquals(JISX0213String.length("\u8C49"), 1);
        assertTrue(JISX0213String.isValid("\u8C4F"));	// 豏
        assertEquals(JISX0213String.length("\u8C4F"), 1);
        assertTrue(JISX0213String.isValid("\u8C54"));	// 豔
        assertEquals(JISX0213String.length("\u8C54"), 1);
        assertTrue(JISX0213String.isValid("\u8C57"));	// 豗
        assertEquals(JISX0213String.length("\u8C57"), 1);
        assertTrue(JISX0213String.isValid("\u8C68"));	// 豨
        assertEquals(JISX0213String.length("\u8C68"), 1);
        assertTrue(JISX0213String.isValid("\u8C69"));	// 豩
        assertEquals(JISX0213String.length("\u8C69"), 1);
        assertTrue(JISX0213String.isValid("\u8C6D"));	// 豭
        assertEquals(JISX0213String.length("\u8C6D"), 1);
        assertTrue(JISX0213String.isValid("\u8C73"));	// 豳
        assertEquals(JISX0213String.length("\u8C73"), 1);
        assertTrue(JISX0213String.isValid("\u8C92"));	// 貒
        assertEquals(JISX0213String.length("\u8C92"), 1);
        assertTrue(JISX0213String.isValid("\u8C93"));	// 貓
        assertEquals(JISX0213String.length("\u8C93"), 1);
        assertTrue(JISX0213String.isValid("\u8C99"));	// 貙
        assertEquals(JISX0213String.length("\u8C99"), 1);
        assertTrue(JISX0213String.isValid("\u8C9B"));	// 貛
        assertEquals(JISX0213String.length("\u8C9B"), 1);
        assertTrue(JISX0213String.isValid("\u8CA4"));	// 貤
        assertEquals(JISX0213String.length("\u8CA4"), 1);
        assertTrue(JISX0213String.isValid("\u8CD6"));	// 賖
        assertEquals(JISX0213String.length("\u8CD6"), 1);
        assertTrue(JISX0213String.isValid("\u8CD5"));	// 賕
        assertEquals(JISX0213String.length("\u8CD5"), 1);
        assertTrue(JISX0213String.isValid("\u8CD9"));	// 賙
        assertEquals(JISX0213String.length("\u8CD9"), 1);
        assertTrue(JISX0213String.isValid("\u8CE1"));	// 賡
        assertEquals(JISX0213String.length("\u8CE1"), 1);
        assertTrue(JISX0213String.isValid("\u8CF8"));	// 賸
        assertEquals(JISX0213String.length("\u8CF8"), 1);
        assertTrue(JISX0213String.isValid("\u8CFE"));	// 賾
        assertEquals(JISX0213String.length("\u8CFE"), 1);
        assertTrue(JISX0213String.isValid("\u8D09"));	// 贉
        assertEquals(JISX0213String.length("\u8D09"), 1);
        assertTrue(JISX0213String.isValid("\u8D1B"));	// 贛
        assertEquals(JISX0213String.length("\u8D1B"), 1);
        assertTrue(JISX0213String.isValid("\u8D6C"));	// 赬
        assertEquals(JISX0213String.length("\u8D6C"), 1);
        assertTrue(JISX0213String.isValid("\u8D84"));	// 趄
        assertEquals(JISX0213String.length("\u8D84"), 1);
        assertTrue(JISX0213String.isValid("\u8D95"));	// 趕
        assertEquals(JISX0213String.length("\u8D95"), 1);
        assertTrue(JISX0213String.isValid("\u8DA6"));	// 趦
        assertEquals(JISX0213String.length("\u8DA6"), 1);
        assertTrue(JISX0213String.isValid("\u8DAF"));	// 趯
        assertEquals(JISX0213String.length("\u8DAF"), 1);
        assertTrue(JISX0213String.isValid("\u8DC6"));	// 跆
        assertEquals(JISX0213String.length("\u8DC6"), 1);
        assertTrue(JISX0213String.isValid("\u8DC8"));	// 跈
        assertEquals(JISX0213String.length("\u8DC8"), 1);
        assertTrue(JISX0213String.isValid("\u8DCE"));	// 跎
        assertEquals(JISX0213String.length("\u8DCE"), 1);
        assertTrue(JISX0213String.isValid("\u8DD1"));	// 跑
        assertEquals(JISX0213String.length("\u8DD1"), 1);
        assertTrue(JISX0213String.isValid("\u8DD7"));	// 跗
        assertEquals(JISX0213String.length("\u8DD7"), 1);
        assertTrue(JISX0213String.isValid("\u8DD9"));	// 跙
        assertEquals(JISX0213String.length("\u8DD9"), 1);
        assertTrue(JISX0213String.isValid("\u8DEC"));	// 跬
        assertEquals(JISX0213String.length("\u8DEC"), 1);
        assertTrue(JISX0213String.isValid("\u8DFD"));	// 跽
        assertEquals(JISX0213String.length("\u8DFD"), 1);
        assertTrue(JISX0213String.isValid("\u8E06"));	// 踆
        assertEquals(JISX0213String.length("\u8E06"), 1);
        assertTrue(JISX0213String.isValid("\u8E14"));	// 踔
        assertEquals(JISX0213String.length("\u8E14"), 1);
        assertTrue(JISX0213String.isValid("\u8E16"));	// 踖
        assertEquals(JISX0213String.length("\u8E16"), 1);
        assertTrue(JISX0213String.isValid("\u8E20"));	// 踠
        assertEquals(JISX0213String.length("\u8E20"), 1);
        assertTrue(JISX0213String.isValid("\u8E21"));	// 踡
        assertEquals(JISX0213String.length("\u8E21"), 1);
        assertTrue(JISX0213String.isValid("\u8E22"));	// 踢
        assertEquals(JISX0213String.length("\u8E22"), 1);
        assertTrue(JISX0213String.isValid("\u8E23"));	// 踣
        assertEquals(JISX0213String.length("\u8E23"), 1);
        assertTrue(JISX0213String.isValid("\u8E27"));	// 踧
        assertEquals(JISX0213String.length("\u8E27"), 1);
        assertTrue(JISX0213String.isValid("\u8E36"));	// 踶
        assertEquals(JISX0213String.length("\u8E36"), 1);
        assertTrue(JISX0213String.isValid("\u8E39"));	// 踹
        assertEquals(JISX0213String.length("\u8E39"), 1);
        assertTrue(JISX0213String.isValid("\u8E3D"));	// 踽
        assertEquals(JISX0213String.length("\u8E3D"), 1);
        assertTrue(JISX0213String.isValid("\u8E4B"));	// 蹋
        assertEquals(JISX0213String.length("\u8E4B"), 1);
        assertTrue(JISX0213String.isValid("\u8E54"));	// 蹔
        assertEquals(JISX0213String.length("\u8E54"), 1);
        assertTrue(JISX0213String.isValid("\u8E62"));	// 蹢
        assertEquals(JISX0213String.length("\u8E62"), 1);
        assertTrue(JISX0213String.isValid("\u8E6C"));	// 蹬
        assertEquals(JISX0213String.length("\u8E6C"), 1);
        assertTrue(JISX0213String.isValid("\u8E6D"));	// 蹭
        assertEquals(JISX0213String.length("\u8E6D"), 1);
        assertTrue(JISX0213String.isValid("\u8E6F"));	// 蹯
        assertEquals(JISX0213String.length("\u8E6F"), 1);
        assertTrue(JISX0213String.isValid("\u8E70"));	// 蹰
        assertEquals(JISX0213String.length("\u8E70"), 1);
        assertTrue(JISX0213String.isValid("\u8E7B"));	// 蹻
        assertEquals(JISX0213String.length("\u8E7B"), 1);
        assertTrue(JISX0213String.isValid("\u8E9E"));	// 躞
        assertEquals(JISX0213String.length("\u8E9E"), 1);
        assertTrue(JISX0213String.isValid("\u8EAE"));	// 躮
        assertEquals(JISX0213String.length("\u8EAE"), 1);
        assertTrue(JISX0213String.isValid("\u8EB3"));	// 躳
        assertEquals(JISX0213String.length("\u8EB3"), 1);
        assertTrue(JISX0213String.isValid("\u8EB5"));	// 躵
        assertEquals(JISX0213String.length("\u8EB5"), 1);
        assertTrue(JISX0213String.isValid("\u8EBB"));	// 躻
        assertEquals(JISX0213String.length("\u8EBB"), 1);
        assertTrue(JISX0213String.isValid("\u8EC0"));	// 軀
        assertEquals(JISX0213String.length("\u8EC0"), 1);
        assertTrue(JISX0213String.isValid("\u8ED1"));	// 軑
        assertEquals(JISX0213String.length("\u8ED1"), 1);
        assertTrue(JISX0213String.isValid("\u8ED4"));	// 軔
        assertEquals(JISX0213String.length("\u8ED4"), 1);
        assertTrue(JISX0213String.isValid("\u8EF9"));	// 軹
        assertEquals(JISX0213String.length("\u8EF9"), 1);
        assertTrue(JISX0213String.isValid("\u8EFA"));	// 軺
        assertEquals(JISX0213String.length("\u8EFA"), 1);
        assertTrue(JISX0213String.isValid("\u8F00"));	// 輀
        assertEquals(JISX0213String.length("\u8F00"), 1);
        assertTrue(JISX0213String.isValid("\u8F08"));	// 輈
        assertEquals(JISX0213String.length("\u8F08"), 1);
        assertTrue(JISX0213String.isValid("\u8F17"));	// 輗
        assertEquals(JISX0213String.length("\u8F17"), 1);
        assertTrue(JISX0213String.isValid("\u8F1E"));	// 輞
        assertEquals(JISX0213String.length("\u8F1E"), 1);
        assertTrue(JISX0213String.isValid("\u8F2D"));	// 輭
        assertEquals(JISX0213String.length("\u8F2D"), 1);
        assertTrue(JISX0213String.isValid("\u8F36"));	// 輶
        assertEquals(JISX0213String.length("\u8F36"), 1);
        assertTrue(JISX0213String.isValid("\u8F40"));	// 轀
        assertEquals(JISX0213String.length("\u8F40"), 1);
        assertTrue(JISX0213String.isValid("\u8F54"));	// 轔
        assertEquals(JISX0213String.length("\u8F54"), 1);
        assertTrue(JISX0213String.isValid("\u8F58"));	// 轘
        assertEquals(JISX0213String.length("\u8F58"), 1);
        assertTrue(JISX0213String.isValid("\u8FA4"));	// 辤
        assertEquals(JISX0213String.length("\u8FA4"), 1);
        assertTrue(JISX0213String.isValid("\u8FA6"));	// 辦
        assertEquals(JISX0213String.length("\u8FA6"), 1);
        assertTrue(JISX0213String.isValid("\u8FB5"));	// 辵
        assertEquals(JISX0213String.length("\u8FB5"), 1);
        assertTrue(JISX0213String.isValid("\u8FB6"));	// 辶
        assertEquals(JISX0213String.length("\u8FB6"), 1);
        assertTrue(JISX0213String.isValid("\u8FC1"));	// 迁
        assertEquals(JISX0213String.length("\u8FC1"), 1);
        assertTrue(JISX0213String.isValid("\u8FC6"));	// 迆
        assertEquals(JISX0213String.length("\u8FC6"), 1);
        assertTrue(JISX0213String.isValid("\u8FCA"));	// 迊
        assertEquals(JISX0213String.length("\u8FCA"), 1);
        assertTrue(JISX0213String.isValid("\u8FCD"));	// 迍
        assertEquals(JISX0213String.length("\u8FCD"), 1);
        assertTrue(JISX0213String.isValid("\u8FD3"));	// 迓
        assertEquals(JISX0213String.length("\u8FD3"), 1);
        assertTrue(JISX0213String.isValid("\u8FD5"));	// 迕
        assertEquals(JISX0213String.length("\u8FD5"), 1);
        assertTrue(JISX0213String.isValid("\u8FE0"));	// 迠
        assertEquals(JISX0213String.length("\u8FE0"), 1);
        assertTrue(JISX0213String.isValid("\u8FE4"));	// 迤
        assertEquals(JISX0213String.length("\u8FE4"), 1);
        assertTrue(JISX0213String.isValid("\u8FE8"));	// 迨
        assertEquals(JISX0213String.length("\u8FE8"), 1);
        assertTrue(JISX0213String.isValid("\u8FEE"));	// 迮
        assertEquals(JISX0213String.length("\u8FEE"), 1);
        assertTrue(JISX0213String.isValid("\u8FF1"));	// 迱
        assertEquals(JISX0213String.length("\u8FF1"), 1);
        assertTrue(JISX0213String.isValid("\u8FF5"));	// 迵
        assertEquals(JISX0213String.length("\u8FF5"), 1);
        assertTrue(JISX0213String.isValid("\u8FFB"));	// 迻
        assertEquals(JISX0213String.length("\u8FFB"), 1);
        assertTrue(JISX0213String.isValid("\u9002"));	// 适
        assertEquals(JISX0213String.length("\u9002"), 1);
        assertTrue(JISX0213String.isValid("\u9008"));	// 逈
        assertEquals(JISX0213String.length("\u9008"), 1);
        assertTrue(JISX0213String.isValid("\u900C"));	// 逌
        assertEquals(JISX0213String.length("\u900C"), 1);
        assertTrue(JISX0213String.isValid("\u902D"));	// 逭
        assertEquals(JISX0213String.length("\u902D"), 1);
        assertTrue(JISX0213String.isValid("\u9037"));	// 逷
        assertEquals(JISX0213String.length("\u9037"), 1);
        assertTrue(JISX0213String.isValid("\u9043"));	// 遃
        assertEquals(JISX0213String.length("\u9043"), 1);
        assertTrue(JISX0213String.isValid("\u9044"));	// 遄
        assertEquals(JISX0213String.length("\u9044"), 1);
        assertTrue(JISX0213String.isValid("\u905D"));	// 遝
        assertEquals(JISX0213String.length("\u905D"), 1);
        assertTrue(JISX0213String.isValid("\u9085"));	// 邅
        assertEquals(JISX0213String.length("\u9085"), 1);
        assertTrue(JISX0213String.isValid("\u9088"));	// 邈
        assertEquals(JISX0213String.length("\u9088"), 1);
        assertTrue(JISX0213String.isValid("\u908C"));	// 邌
        assertEquals(JISX0213String.length("\u908C"), 1);
        assertTrue(JISX0213String.isValid("\u9090"));	// 邐
        assertEquals(JISX0213String.length("\u9090"), 1);
        assertTrue(JISX0213String.isValid("\u9095"));	// 邕
        assertEquals(JISX0213String.length("\u9095"), 1);
        assertTrue(JISX0213String.isValid("\u9097"));	// 邗
        assertEquals(JISX0213String.length("\u9097"), 1);
        assertTrue(JISX0213String.isValid("\u9099"));	// 邙
        assertEquals(JISX0213String.length("\u9099"), 1);
        assertTrue(JISX0213String.isValid("\u909B"));	// 邛
        assertEquals(JISX0213String.length("\u909B"), 1);
        assertTrue(JISX0213String.isValid("\u90A1"));	// 邡
        assertEquals(JISX0213String.length("\u90A1"), 1);
        assertTrue(JISX0213String.isValid("\u90A2"));	// 邢
        assertEquals(JISX0213String.length("\u90A2"), 1);
        assertTrue(JISX0213String.isValid("\u90B0"));	// 邰
        assertEquals(JISX0213String.length("\u90B0"), 1);
        assertTrue(JISX0213String.isValid("\u90B3"));	// 邳
        assertEquals(JISX0213String.length("\u90B3"), 1);
        assertTrue(JISX0213String.isValid("\u90B6"));	// 邶
        assertEquals(JISX0213String.length("\u90B6"), 1);
        assertTrue(JISX0213String.isValid("\u90BE"));	// 邾
        assertEquals(JISX0213String.length("\u90BE"), 1);
        assertTrue(JISX0213String.isValid("\u90C3"));	// 郃
        assertEquals(JISX0213String.length("\u90C3"), 1);
        assertTrue(JISX0213String.isValid("\u90C4"));	// 郄
        assertEquals(JISX0213String.length("\u90C4"), 1);
        assertTrue(JISX0213String.isValid("\u90C5"));	// 郅
        assertEquals(JISX0213String.length("\u90C5"), 1);
        assertTrue(JISX0213String.isValid("\u90C7"));	// 郇
        assertEquals(JISX0213String.length("\u90C7"), 1);
        assertTrue(JISX0213String.isValid("\u90C8"));	// 郈
        assertEquals(JISX0213String.length("\u90C8"), 1);
        assertTrue(JISX0213String.isValid("\u90D7"));	// 郗
        assertEquals(JISX0213String.length("\u90D7"), 1);
        assertTrue(JISX0213String.isValid("\u90DC"));	// 郜
        assertEquals(JISX0213String.length("\u90DC"), 1);
        assertTrue(JISX0213String.isValid("\u90DD"));	// 郝
        assertEquals(JISX0213String.length("\u90DD"), 1);
        assertTrue(JISX0213String.isValid("\u90DF"));	// 郟
        assertEquals(JISX0213String.length("\u90DF"), 1);
        assertTrue(JISX0213String.isValid("\u90F6"));	// 郶
        assertEquals(JISX0213String.length("\u90F6"), 1);
        assertTrue(JISX0213String.isValid("\u90EB"));	// 郫
        assertEquals(JISX0213String.length("\u90EB"), 1);
        assertTrue(JISX0213String.isValid("\u90EF"));	// 郯
        assertEquals(JISX0213String.length("\u90EF"), 1);
        assertTrue(JISX0213String.isValid("\u90F4"));	// 郴
        assertEquals(JISX0213String.length("\u90F4"), 1);
        assertTrue(JISX0213String.isValid("\u90FE"));	// 郾
        assertEquals(JISX0213String.length("\u90FE"), 1);
        assertTrue(JISX0213String.isValid("\u90FF"));	// 郿
        assertEquals(JISX0213String.length("\u90FF"), 1);
        assertTrue(JISX0213String.isValid("\u9100"));	// 鄀
        assertEquals(JISX0213String.length("\u9100"), 1);
        assertTrue(JISX0213String.isValid("\u9104"));	// 鄄
        assertEquals(JISX0213String.length("\u9104"), 1);
        assertTrue(JISX0213String.isValid("\u9106"));	// 鄆
        assertEquals(JISX0213String.length("\u9106"), 1);
        assertTrue(JISX0213String.isValid("\u9114"));	// 鄔
        assertEquals(JISX0213String.length("\u9114"), 1);
        assertTrue(JISX0213String.isValid("\u9116"));	// 鄖
        assertEquals(JISX0213String.length("\u9116"), 1);
        assertTrue(JISX0213String.isValid("\u9118"));	// 鄘
        assertEquals(JISX0213String.length("\u9118"), 1);
        assertTrue(JISX0213String.isValid("\u911C"));	// 鄜
        assertEquals(JISX0213String.length("\u911C"), 1);
        assertTrue(JISX0213String.isValid("\u911E"));	// 鄞
        assertEquals(JISX0213String.length("\u911E"), 1);
        assertTrue(JISX0213String.isValid("\u9122"));	// 鄢
        assertEquals(JISX0213String.length("\u9122"), 1);
        assertTrue(JISX0213String.isValid("\u9123"));	// 鄣
        assertEquals(JISX0213String.length("\u9123"), 1);
        assertTrue(JISX0213String.isValid("\u912F"));	// 鄯
        assertEquals(JISX0213String.length("\u912F"), 1);
        assertTrue(JISX0213String.isValid("\u9131"));	// 鄱
        assertEquals(JISX0213String.length("\u9131"), 1);
        assertTrue(JISX0213String.isValid("\u9134"));	// 鄴
        assertEquals(JISX0213String.length("\u9134"), 1);
        assertTrue(JISX0213String.isValid("\u9137"));	// 鄷
        assertEquals(JISX0213String.length("\u9137"), 1);
        assertTrue(JISX0213String.isValid("\u9139"));	// 鄹
        assertEquals(JISX0213String.length("\u9139"), 1);
        assertTrue(JISX0213String.isValid("\u913A"));	// 鄺
        assertEquals(JISX0213String.length("\u913A"), 1);
        assertTrue(JISX0213String.isValid("\u913D"));	// 鄽
        assertEquals(JISX0213String.length("\u913D"), 1);
        assertTrue(JISX0213String.isValid("\u9147"));	// 酇
        assertEquals(JISX0213String.length("\u9147"), 1);
        assertTrue(JISX0213String.isValid("\u9148"));	// 酈
        assertEquals(JISX0213String.length("\u9148"), 1);
        assertTrue(JISX0213String.isValid("\u9157"));	// 酗
        assertEquals(JISX0213String.length("\u9157"), 1);
        assertTrue(JISX0213String.isValid("\u9159"));	// 酙
        assertEquals(JISX0213String.length("\u9159"), 1);
        assertTrue(JISX0213String.isValid("\u915B"));	// 酛
        assertEquals(JISX0213String.length("\u915B"), 1);
        assertTrue(JISX0213String.isValid("\u9161"));	// 酡
        assertEquals(JISX0213String.length("\u9161"), 1);
        assertTrue(JISX0213String.isValid("\u9164"));	// 酤
        assertEquals(JISX0213String.length("\u9164"), 1);
        assertTrue(JISX0213String.isValid("\u9174"));	// 酴
        assertEquals(JISX0213String.length("\u9174"), 1);
        assertTrue(JISX0213String.isValid("\u9179"));	// 酹
        assertEquals(JISX0213String.length("\u9179"), 1);
        assertTrue(JISX0213String.isValid("\u9183"));	// 醃
        assertEquals(JISX0213String.length("\u9183"), 1);
        assertTrue(JISX0213String.isValid("\u9185"));	// 醅
        assertEquals(JISX0213String.length("\u9185"), 1);
        assertTrue(JISX0213String.isValid("\u918E"));	// 醎
        assertEquals(JISX0213String.length("\u918E"), 1);
        assertTrue(JISX0213String.isValid("\u919E"));	// 醞
        assertEquals(JISX0213String.length("\u919E"), 1);
        assertTrue(JISX0213String.isValid("\u91A8"));	// 醨
        assertEquals(JISX0213String.length("\u91A8"), 1);
        assertTrue(JISX0213String.isValid("\u91AC"));	// 醬
        assertEquals(JISX0213String.length("\u91AC"), 1);
        assertTrue(JISX0213String.isValid("\u91AE"));	// 醮
        assertEquals(JISX0213String.length("\u91AE"), 1);
        assertTrue(JISX0213String.isValid("\u91B1"));	// 醱
        assertEquals(JISX0213String.length("\u91B1"), 1);
        assertTrue(JISX0213String.isValid("\u91B3"));	// 醳
        assertEquals(JISX0213String.length("\u91B3"), 1);
        assertTrue(JISX0213String.isValid("\u91B6"));	// 醶
        assertEquals(JISX0213String.length("\u91B6"), 1);
        assertTrue(JISX0213String.isValid("\u91BC"));	// 醼
        assertEquals(JISX0213String.length("\u91BC"), 1);
        assertTrue(JISX0213String.isValid("\u91C3"));	// 釃
        assertEquals(JISX0213String.length("\u91C3"), 1);
        assertTrue(JISX0213String.isValid("\u91EC"));	// 釬
        assertEquals(JISX0213String.length("\u91EC"), 1);
        assertTrue(JISX0213String.isValid("\u91F1"));	// 釱
        assertEquals(JISX0213String.length("\u91F1"), 1);
        assertTrue(JISX0213String.isValid("\u91FB"));	// 釻
        assertEquals(JISX0213String.length("\u91FB"), 1);
        assertTrue(JISX0213String.isValid("\u9201"));	// 鈁
        assertEquals(JISX0213String.length("\u9201"), 1);
        assertTrue(JISX0213String.isValid("\u9207"));	// 鈇
        assertEquals(JISX0213String.length("\u9207"), 1);
        assertTrue(JISX0213String.isValid("\u9216"));	// 鈖
        assertEquals(JISX0213String.length("\u9216"), 1);
        assertTrue(JISX0213String.isValid("\u9233"));	// 鈳
        assertEquals(JISX0213String.length("\u9233"), 1);
        assertTrue(JISX0213String.isValid("\u9238"));	// 鈸
        assertEquals(JISX0213String.length("\u9238"), 1);
        assertTrue(JISX0213String.isValid("\u9242"));	// 鉂
        assertEquals(JISX0213String.length("\u9242"), 1);
        assertTrue(JISX0213String.isValid("\u9243"));	// 鉃
        assertEquals(JISX0213String.length("\u9243"), 1);
        assertTrue(JISX0213String.isValid("\u9247"));	// 鉇
        assertEquals(JISX0213String.length("\u9247"), 1);
        assertTrue(JISX0213String.isValid("\u924A"));	// 鉊
        assertEquals(JISX0213String.length("\u924A"), 1);
        assertTrue(JISX0213String.isValid("\u924F"));	// 鉏
        assertEquals(JISX0213String.length("\u924F"), 1);
        assertTrue(JISX0213String.isValid("\u9260"));	// 鉠
        assertEquals(JISX0213String.length("\u9260"), 1);
        assertTrue(JISX0213String.isValid("\u9261"));	// 鉡
        assertEquals(JISX0213String.length("\u9261"), 1);
        assertTrue(JISX0213String.isValid("\u9265"));	// 鉥
        assertEquals(JISX0213String.length("\u9265"), 1);
        assertTrue(JISX0213String.isValid("\u9268"));	// 鉨
        assertEquals(JISX0213String.length("\u9268"), 1);
        assertTrue(JISX0213String.isValid("\u927C"));	// 鉼
        assertEquals(JISX0213String.length("\u927C"), 1);
        assertTrue(JISX0213String.isValid("\u927D"));	// 鉽
        assertEquals(JISX0213String.length("\u927D"), 1);
        assertTrue(JISX0213String.isValid("\u927F"));	// 鉿
        assertEquals(JISX0213String.length("\u927F"), 1);
        assertTrue(JISX0213String.isValid("\u9289"));	// 銉
        assertEquals(JISX0213String.length("\u9289"), 1);
        assertTrue(JISX0213String.isValid("\u928D"));	// 銍
        assertEquals(JISX0213String.length("\u928D"), 1);
        assertTrue(JISX0213String.isValid("\u9297"));	// 銗
        assertEquals(JISX0213String.length("\u9297"), 1);
        assertTrue(JISX0213String.isValid("\u9299"));	// 銙
        assertEquals(JISX0213String.length("\u9299"), 1);
        assertTrue(JISX0213String.isValid("\u929F"));	// 銟
        assertEquals(JISX0213String.length("\u929F"), 1);
        assertTrue(JISX0213String.isValid("\u92AB"));	// 銫
        assertEquals(JISX0213String.length("\u92AB"), 1);
        assertTrue(JISX0213String.isValid("\u92B2"));	// 銲
        assertEquals(JISX0213String.length("\u92B2"), 1);
        assertTrue(JISX0213String.isValid("\u92BF"));	// 銿
        assertEquals(JISX0213String.length("\u92BF"), 1);
        assertTrue(JISX0213String.isValid("\u92C0"));	// 鋀
        assertEquals(JISX0213String.length("\u92C0"), 1);
        assertTrue(JISX0213String.isValid("\u92C2"));	// 鋂
        assertEquals(JISX0213String.length("\u92C2"), 1);
        assertTrue(JISX0213String.isValid("\u92C6"));	// 鋆
        assertEquals(JISX0213String.length("\u92C6"), 1);
        assertTrue(JISX0213String.isValid("\u92CB"));	// 鋋
        assertEquals(JISX0213String.length("\u92CB"), 1);
        assertTrue(JISX0213String.isValid("\u92CC"));	// 鋌
        assertEquals(JISX0213String.length("\u92CC"), 1);
        assertTrue(JISX0213String.isValid("\u92CE"));	// 鋎
        assertEquals(JISX0213String.length("\u92CE"), 1);
        assertTrue(JISX0213String.isValid("\u92E5"));	// 鋥
        assertEquals(JISX0213String.length("\u92E5"), 1);
        assertTrue(JISX0213String.isValid("\u930D"));	// 錍
        assertEquals(JISX0213String.length("\u930D"), 1);
        assertTrue(JISX0213String.isValid("\u9311"));	// 錑
        assertEquals(JISX0213String.length("\u9311"), 1);
        assertTrue(JISX0213String.isValid("\u9315"));	// 錕
        assertEquals(JISX0213String.length("\u9315"), 1);
        assertTrue(JISX0213String.isValid("\u931F"));	// 錟
        assertEquals(JISX0213String.length("\u931F"), 1);
        assertTrue(JISX0213String.isValid("\u9327"));	// 錧
        assertEquals(JISX0213String.length("\u9327"), 1);
        assertTrue(JISX0213String.isValid("\u9329"));	// 錩
        assertEquals(JISX0213String.length("\u9329"), 1);
        assertTrue(JISX0213String.isValid("\u9347"));	// 鍇
        assertEquals(JISX0213String.length("\u9347"), 1);
        assertTrue(JISX0213String.isValid("\u9349"));	// 鍉
        assertEquals(JISX0213String.length("\u9349"), 1);
        assertTrue(JISX0213String.isValid("\u9351"));	// 鍑
        assertEquals(JISX0213String.length("\u9351"), 1);
        assertTrue(JISX0213String.isValid("\u935A"));	// 鍚
        assertEquals(JISX0213String.length("\u935A"), 1);
        assertTrue(JISX0213String.isValid("\u9364"));	// 鍤
        assertEquals(JISX0213String.length("\u9364"), 1);
        assertTrue(JISX0213String.isValid("\u9365"));	// 鍥
        assertEquals(JISX0213String.length("\u9365"), 1);
        assertTrue(JISX0213String.isValid("\u936A"));	// 鍪
        assertEquals(JISX0213String.length("\u936A"), 1);
        assertTrue(JISX0213String.isValid("\u9371"));	// 鍱
        assertEquals(JISX0213String.length("\u9371"), 1);
        assertTrue(JISX0213String.isValid("\u9373"));	// 鍳
        assertEquals(JISX0213String.length("\u9373"), 1);
        assertTrue(JISX0213String.isValid("\u9388"));	// 鎈
        assertEquals(JISX0213String.length("\u9388"), 1);
        assertTrue(JISX0213String.isValid("\u938B"));	// 鎋
        assertEquals(JISX0213String.length("\u938B"), 1);
        assertTrue(JISX0213String.isValid("\u938F"));	// 鎏
        assertEquals(JISX0213String.length("\u938F"), 1);
        assertTrue(JISX0213String.isValid("\u939B"));	// 鎛
        assertEquals(JISX0213String.length("\u939B"), 1);
        assertTrue(JISX0213String.isValid("\u939E"));	// 鎞
        assertEquals(JISX0213String.length("\u939E"), 1);
        assertTrue(JISX0213String.isValid("\u93A1"));	// 鎡
        assertEquals(JISX0213String.length("\u93A1"), 1);
        assertTrue(JISX0213String.isValid("\u93A3"));	// 鎣
        assertEquals(JISX0213String.length("\u93A3"), 1);
        assertTrue(JISX0213String.isValid("\u93BA"));	// 鎺
        assertEquals(JISX0213String.length("\u93BA"), 1);
        assertTrue(JISX0213String.isValid("\u93C1"));	// 鏁
        assertEquals(JISX0213String.length("\u93C1"), 1);
        assertTrue(JISX0213String.isValid("\u93C7"));	// 鏇
        assertEquals(JISX0213String.length("\u93C7"), 1);
        assertTrue(JISX0213String.isValid("\u93DC"));	// 鏜
        assertEquals(JISX0213String.length("\u93DC"), 1);
        assertTrue(JISX0213String.isValid("\u93DF"));	// 鏟
        assertEquals(JISX0213String.length("\u93DF"), 1);
        assertTrue(JISX0213String.isValid("\u93E2"));	// 鏢
        assertEquals(JISX0213String.length("\u93E2"), 1);
        assertTrue(JISX0213String.isValid("\u93E7"));	// 鏧
        assertEquals(JISX0213String.length("\u93E7"), 1);
        assertTrue(JISX0213String.isValid("\u93FB"));	// 鏻
        assertEquals(JISX0213String.length("\u93FB"), 1);
        assertTrue(JISX0213String.isValid("\u93FD"));	// 鏽
        assertEquals(JISX0213String.length("\u93FD"), 1);
        assertTrue(JISX0213String.isValid("\u9404"));	// 鐄
        assertEquals(JISX0213String.length("\u9404"), 1);
        assertTrue(JISX0213String.isValid("\u9409"));	// 鐉
        assertEquals(JISX0213String.length("\u9409"), 1);
        assertTrue(JISX0213String.isValid("\u940F"));	// 鐏
        assertEquals(JISX0213String.length("\u940F"), 1);
        assertTrue(JISX0213String.isValid("\u9416"));	// 鐖
        assertEquals(JISX0213String.length("\u9416"), 1);
        assertTrue(JISX0213String.isValid("\u9417"));	// 鐗
        assertEquals(JISX0213String.length("\u9417"), 1);
        assertTrue(JISX0213String.isValid("\u9432"));	// 鐲
        assertEquals(JISX0213String.length("\u9432"), 1);
        assertTrue(JISX0213String.isValid("\u9433"));	// 鐳
        assertEquals(JISX0213String.length("\u9433"), 1);
        assertTrue(JISX0213String.isValid("\u9434"));	// 鐴
        assertEquals(JISX0213String.length("\u9434"), 1);
        assertTrue(JISX0213String.isValid("\u943B"));	// 鐻
        assertEquals(JISX0213String.length("\u943B"), 1);
        assertTrue(JISX0213String.isValid("\u944A"));	// 鑊
        assertEquals(JISX0213String.length("\u944A"), 1);
        assertTrue(JISX0213String.isValid("\u9463"));	// 鑣
        assertEquals(JISX0213String.length("\u9463"), 1);
        assertTrue(JISX0213String.isValid("\u946B"));	// 鑫
        assertEquals(JISX0213String.length("\u946B"), 1);
        assertTrue(JISX0213String.isValid("\u946D"));	// 鑭
        assertEquals(JISX0213String.length("\u946D"), 1);
        assertTrue(JISX0213String.isValid("\u946F"));	// 鑯
        assertEquals(JISX0213String.length("\u946F"), 1);
        assertTrue(JISX0213String.isValid("\u9471"));	// 鑱
        assertEquals(JISX0213String.length("\u9471"), 1);
        assertTrue(JISX0213String.isValid("\u9472"));	// 鑲
        assertEquals(JISX0213String.length("\u9472"), 1);
        assertTrue(JISX0213String.isValid("\u9578"));	// 镸
        assertEquals(JISX0213String.length("\u9578"), 1);
        assertTrue(JISX0213String.isValid("\u9579"));	// 镹
        assertEquals(JISX0213String.length("\u9579"), 1);
        assertTrue(JISX0213String.isValid("\u958C"));	// 閌
        assertEquals(JISX0213String.length("\u958C"), 1);
        assertTrue(JISX0213String.isValid("\u958D"));	// 閍
        assertEquals(JISX0213String.length("\u958D"), 1);
        assertTrue(JISX0213String.isValid("\u958E"));	// 閎
        assertEquals(JISX0213String.length("\u958E"), 1);
        assertTrue(JISX0213String.isValid("\u959F"));	// 閟
        assertEquals(JISX0213String.length("\u959F"), 1);
        assertTrue(JISX0213String.isValid("\u95A6"));	// 閦
        assertEquals(JISX0213String.length("\u95A6"), 1);
        assertTrue(JISX0213String.isValid("\u95A9"));	// 閩
        assertEquals(JISX0213String.length("\u95A9"), 1);
        assertTrue(JISX0213String.isValid("\u95AB"));	// 閫
        assertEquals(JISX0213String.length("\u95AB"), 1);
        assertTrue(JISX0213String.isValid("\u95AC"));	// 閬
        assertEquals(JISX0213String.length("\u95AC"), 1);
        assertTrue(JISX0213String.isValid("\u95B4"));	// 閴
        assertEquals(JISX0213String.length("\u95B4"), 1);
        assertTrue(JISX0213String.isValid("\u95B6"));	// 閶
        assertEquals(JISX0213String.length("\u95B6"), 1);
        assertTrue(JISX0213String.isValid("\u95BD"));	// 閽
        assertEquals(JISX0213String.length("\u95BD"), 1);
        assertTrue(JISX0213String.isValid("\u95C8"));	// 闈
        assertEquals(JISX0213String.length("\u95C8"), 1);
        assertTrue(JISX0213String.isValid("\u95CB"));	// 闋
        assertEquals(JISX0213String.length("\u95CB"), 1);
        assertTrue(JISX0213String.isValid("\u95D0"));	// 闐
        assertEquals(JISX0213String.length("\u95D0"), 1);
        assertTrue(JISX0213String.isValid("\u95D3"));	// 闓
        assertEquals(JISX0213String.length("\u95D3"), 1);
        assertTrue(JISX0213String.isValid("\u95DA"));	// 闚
        assertEquals(JISX0213String.length("\u95DA"), 1);
        assertTrue(JISX0213String.isValid("\u95DE"));	// 闞
        assertEquals(JISX0213String.length("\u95DE"), 1);
        assertTrue(JISX0213String.isValid("\u961D"));	// 阝
        assertEquals(JISX0213String.length("\u961D"), 1);
        assertTrue(JISX0213String.isValid("\u962C"));	// 阬
        assertEquals(JISX0213String.length("\u962C"), 1);
        assertTrue(JISX0213String.isValid("\u9633"));	// 阳
        assertEquals(JISX0213String.length("\u9633"), 1);
        assertTrue(JISX0213String.isValid("\u963C"));	// 阼
        assertEquals(JISX0213String.length("\u963C"), 1);
        assertTrue(JISX0213String.isValid("\u9641"));	// 陁
        assertEquals(JISX0213String.length("\u9641"), 1);
        assertTrue(JISX0213String.isValid("\u9658"));	// 陘
        assertEquals(JISX0213String.length("\u9658"), 1);
        assertTrue(JISX0213String.isValid("\u9661"));	// 陡
        assertEquals(JISX0213String.length("\u9661"), 1);
        assertTrue(JISX0213String.isValid("\u9682"));	// 隂
        assertEquals(JISX0213String.length("\u9682"), 1);
        assertTrue(JISX0213String.isValid("\u9684"));	// 隄
        assertEquals(JISX0213String.length("\u9684"), 1);
        assertTrue(JISX0213String.isValid("\u969A"));	// 隚
        assertEquals(JISX0213String.length("\u969A"), 1);
        assertTrue(JISX0213String.isValid("\u96A4"));	// 隤
        assertEquals(JISX0213String.length("\u96A4"), 1);
        assertTrue(JISX0213String.isValid("\u96A5"));	// 隥
        assertEquals(JISX0213String.length("\u96A5"), 1);
        assertTrue(JISX0213String.isValid("\u96A9"));	// 隩
        assertEquals(JISX0213String.length("\u96A9"), 1);
        assertTrue(JISX0213String.isValid("\u96B3"));	// 隳
        assertEquals(JISX0213String.length("\u96B3"), 1);
        assertTrue(JISX0213String.isValid("\u96BA"));	// 隺
        assertEquals(JISX0213String.length("\u96BA"), 1);
        assertTrue(JISX0213String.isValid("\u96D2"));	// 雒
        assertEquals(JISX0213String.length("\u96D2"), 1);
        assertTrue(JISX0213String.isValid("\u5DB2"));	// 嶲
        assertEquals(JISX0213String.length("\u5DB2"), 1);
        assertTrue(JISX0213String.isValid("\u96D8"));	// 雘
        assertEquals(JISX0213String.length("\u96D8"), 1);
        assertTrue(JISX0213String.isValid("\u96DA"));	// 雚
        assertEquals(JISX0213String.length("\u96DA"), 1);
        assertTrue(JISX0213String.isValid("\u96DD"));	// 雝
        assertEquals(JISX0213String.length("\u96DD"), 1);
        assertTrue(JISX0213String.isValid("\u96DE"));	// 雞
        assertEquals(JISX0213String.length("\u96DE"), 1);
        assertTrue(JISX0213String.isValid("\u96E9"));	// 雩
        assertEquals(JISX0213String.length("\u96E9"), 1);
        assertTrue(JISX0213String.isValid("\u96EF"));	// 雯
        assertEquals(JISX0213String.length("\u96EF"), 1);
        assertTrue(JISX0213String.isValid("\u9723"));	// 霣
        assertEquals(JISX0213String.length("\u9723"), 1);
        assertTrue(JISX0213String.isValid("\u9741"));	// 靁
        assertEquals(JISX0213String.length("\u9741"), 1);
        assertTrue(JISX0213String.isValid("\u974E"));	// 靎
        assertEquals(JISX0213String.length("\u974E"), 1);
        assertTrue(JISX0213String.isValid("\u9757"));	// 靗
        assertEquals(JISX0213String.length("\u9757"), 1);
        assertTrue(JISX0213String.isValid("\u975A"));	// 靚
        assertEquals(JISX0213String.length("\u975A"), 1);
        assertTrue(JISX0213String.isValid("\u975B"));	// 靛
        assertEquals(JISX0213String.length("\u975B"), 1);
        assertTrue(JISX0213String.isValid("\u976A"));	// 靪
        assertEquals(JISX0213String.length("\u976A"), 1);
        assertTrue(JISX0213String.isValid("\u976E"));	// 靮
        assertEquals(JISX0213String.length("\u976E"), 1);
        assertTrue(JISX0213String.isValid("\u9773"));	// 靳
        assertEquals(JISX0213String.length("\u9773"), 1);
        assertTrue(JISX0213String.isValid("\u9795"));	// 鞕
        assertEquals(JISX0213String.length("\u9795"), 1);
        assertTrue(JISX0213String.isValid("\u9796"));	// 鞖
        assertEquals(JISX0213String.length("\u9796"), 1);
        assertTrue(JISX0213String.isValid("\u979A"));	// 鞚
        assertEquals(JISX0213String.length("\u979A"), 1);
        assertTrue(JISX0213String.isValid("\u979E"));	// 鞞
        assertEquals(JISX0213String.length("\u979E"), 1);
        assertTrue(JISX0213String.isValid("\u97A2"));	// 鞢
        assertEquals(JISX0213String.length("\u97A2"), 1);
        assertTrue(JISX0213String.isValid("\u97AE"));	// 鞮
        assertEquals(JISX0213String.length("\u97AE"), 1);
        assertTrue(JISX0213String.isValid("\u97B1"));	// 鞱
        assertEquals(JISX0213String.length("\u97B1"), 1);
        assertTrue(JISX0213String.isValid("\u97B2"));	// 鞲
        assertEquals(JISX0213String.length("\u97B2"), 1);
        assertTrue(JISX0213String.isValid("\u97BA"));	// 鞺
        assertEquals(JISX0213String.length("\u97BA"), 1);
        assertTrue(JISX0213String.isValid("\u97BE"));	// 鞾
        assertEquals(JISX0213String.length("\u97BE"), 1);
        assertTrue(JISX0213String.isValid("\u97C1"));	// 韁
        assertEquals(JISX0213String.length("\u97C1"), 1);
        assertTrue(JISX0213String.isValid("\u97C9"));	// 韉
        assertEquals(JISX0213String.length("\u97C9"), 1);
        assertTrue(JISX0213String.isValid("\u97CC"));	// 韌
        assertEquals(JISX0213String.length("\u97CC"), 1);
        assertTrue(JISX0213String.isValid("\u97D1"));	// 韑
        assertEquals(JISX0213String.length("\u97D1"), 1);
        assertTrue(JISX0213String.isValid("\u97D4"));	// 韔
        assertEquals(JISX0213String.length("\u97D4"), 1);
        assertTrue(JISX0213String.isValid("\u97D8"));	// 韘
        assertEquals(JISX0213String.length("\u97D8"), 1);
        assertTrue(JISX0213String.isValid("\u97D9"));	// 韙
        assertEquals(JISX0213String.length("\u97D9"), 1);
        assertTrue(JISX0213String.isValid("\u97DE"));	// 韞
        assertEquals(JISX0213String.length("\u97DE"), 1);
        assertTrue(JISX0213String.isValid("\u97DB"));	// 韛
        assertEquals(JISX0213String.length("\u97DB"), 1);
        assertTrue(JISX0213String.isValid("\u97E1"));	// 韡
        assertEquals(JISX0213String.length("\u97E1"), 1);
        assertTrue(JISX0213String.isValid("\u97F1"));	// 韱
        assertEquals(JISX0213String.length("\u97F1"), 1);
        assertTrue(JISX0213String.isValid("\u97F4"));	// 韴
        assertEquals(JISX0213String.length("\u97F4"), 1);
        assertTrue(JISX0213String.isValid("\u980A"));	// 頊
        assertEquals(JISX0213String.length("\u980A"), 1);
        assertTrue(JISX0213String.isValid("\u980D"));	// 頍
        assertEquals(JISX0213String.length("\u980D"), 1);
        assertTrue(JISX0213String.isValid("\u980E"));	// 頎
        assertEquals(JISX0213String.length("\u980E"), 1);
        assertTrue(JISX0213String.isValid("\u9814"));	// 頔
        assertEquals(JISX0213String.length("\u9814"), 1);
        assertTrue(JISX0213String.isValid("\u9816"));	// 頖
        assertEquals(JISX0213String.length("\u9816"), 1);
        assertTrue(JISX0213String.isValid("\u981E"));	// 頞
        assertEquals(JISX0213String.length("\u981E"), 1);
        assertTrue(JISX0213String.isValid("\u9823"));	// 頣
        assertEquals(JISX0213String.length("\u9823"), 1);
        assertTrue(JISX0213String.isValid("\u982B"));	// 頫
        assertEquals(JISX0213String.length("\u982B"), 1);
        assertTrue(JISX0213String.isValid("\u9830"));	// 頰
        assertEquals(JISX0213String.length("\u9830"), 1);
        assertTrue(JISX0213String.isValid("\u9832"));	// 頲
        assertEquals(JISX0213String.length("\u9832"), 1);
        assertTrue(JISX0213String.isValid("\u9833"));	// 頳
        assertEquals(JISX0213String.length("\u9833"), 1);
        assertTrue(JISX0213String.isValid("\u9825"));	// 頥
        assertEquals(JISX0213String.length("\u9825"), 1);
        assertTrue(JISX0213String.isValid("\u9847"));	// 顇
        assertEquals(JISX0213String.length("\u9847"), 1);
        assertTrue(JISX0213String.isValid("\u9852"));	// 顒
        assertEquals(JISX0213String.length("\u9852"), 1);
        assertTrue(JISX0213String.isValid("\u9853"));	// 顓
        assertEquals(JISX0213String.length("\u9853"), 1);
        assertTrue(JISX0213String.isValid("\u9856"));	// 顖
        assertEquals(JISX0213String.length("\u9856"), 1);
        assertTrue(JISX0213String.isValid("\u9859"));	// 顙
        assertEquals(JISX0213String.length("\u9859"), 1);
        assertTrue(JISX0213String.isValid("\u985A"));	// 顚
        assertEquals(JISX0213String.length("\u985A"), 1);
        assertTrue(JISX0213String.isValid("\u9866"));	// 顦
        assertEquals(JISX0213String.length("\u9866"), 1);
        assertTrue(JISX0213String.isValid("\u986C"));	// 顬
        assertEquals(JISX0213String.length("\u986C"), 1);
        assertTrue(JISX0213String.isValid("\u98AB"));	// 颫
        assertEquals(JISX0213String.length("\u98AB"), 1);
        assertTrue(JISX0213String.isValid("\u98AD"));	// 颭
        assertEquals(JISX0213String.length("\u98AD"), 1);
        assertTrue(JISX0213String.isValid("\u98B0"));	// 颰
        assertEquals(JISX0213String.length("\u98B0"), 1);
        assertTrue(JISX0213String.isValid("\u98B7"));	// 颷
        assertEquals(JISX0213String.length("\u98B7"), 1);
        assertTrue(JISX0213String.isValid("\u98B8"));	// 颸
        assertEquals(JISX0213String.length("\u98B8"), 1);
        assertTrue(JISX0213String.isValid("\u98BA"));	// 颺
        assertEquals(JISX0213String.length("\u98BA"), 1);
        assertTrue(JISX0213String.isValid("\u98BB"));	// 颻
        assertEquals(JISX0213String.length("\u98BB"), 1);
        assertTrue(JISX0213String.isValid("\u98BF"));	// 颿
        assertEquals(JISX0213String.length("\u98BF"), 1);
        assertTrue(JISX0213String.isValid("\u98C2"));	// 飂
        assertEquals(JISX0213String.length("\u98C2"), 1);
        assertTrue(JISX0213String.isValid("\u98C8"));	// 飈
        assertEquals(JISX0213String.length("\u98C8"), 1);
        assertTrue(JISX0213String.isValid("\u98E1"));	// 飡
        assertEquals(JISX0213String.length("\u98E1"), 1);
        assertTrue(JISX0213String.isValid("\u98E3"));	// 飣
        assertEquals(JISX0213String.length("\u98E3"), 1);
        assertTrue(JISX0213String.isValid("\u98E5"));	// 飥
        assertEquals(JISX0213String.length("\u98E5"), 1);
        assertTrue(JISX0213String.isValid("\u98E7"));	// 飧
        assertEquals(JISX0213String.length("\u98E7"), 1);
        assertTrue(JISX0213String.isValid("\u98EA"));	// 飪
        assertEquals(JISX0213String.length("\u98EA"), 1);
        assertTrue(JISX0213String.isValid("\u98F3"));	// 飳
        assertEquals(JISX0213String.length("\u98F3"), 1);
        assertTrue(JISX0213String.isValid("\u9908"));	// 餈
        assertEquals(JISX0213String.length("\u9908"), 1);
        assertTrue(JISX0213String.isValid("\u9916"));	// 餖
        assertEquals(JISX0213String.length("\u9916"), 1);
        assertTrue(JISX0213String.isValid("\u9917"));	// 餗
        assertEquals(JISX0213String.length("\u9917"), 1);
        assertTrue(JISX0213String.isValid("\u991A"));	// 餚
        assertEquals(JISX0213String.length("\u991A"), 1);
        assertTrue(JISX0213String.isValid("\u991B"));	// 餛
        assertEquals(JISX0213String.length("\u991B"), 1);
        assertTrue(JISX0213String.isValid("\u991C"));	// 餜
        assertEquals(JISX0213String.length("\u991C"), 1);
        assertTrue(JISX0213String.isValid("\u9931"));	// 餱
        assertEquals(JISX0213String.length("\u9931"), 1);
        assertTrue(JISX0213String.isValid("\u9932"));	// 餲
        assertEquals(JISX0213String.length("\u9932"), 1);
        assertTrue(JISX0213String.isValid("\u9933"));	// 餳
        assertEquals(JISX0213String.length("\u9933"), 1);
        assertTrue(JISX0213String.isValid("\u993A"));	// 餺
        assertEquals(JISX0213String.length("\u993A"), 1);
        assertTrue(JISX0213String.isValid("\u993B"));	// 餻
        assertEquals(JISX0213String.length("\u993B"), 1);
        assertTrue(JISX0213String.isValid("\u993C"));	// 餼
        assertEquals(JISX0213String.length("\u993C"), 1);
        assertTrue(JISX0213String.isValid("\u9940"));	// 饀
        assertEquals(JISX0213String.length("\u9940"), 1);
        assertTrue(JISX0213String.isValid("\u9941"));	// 饁
        assertEquals(JISX0213String.length("\u9941"), 1);
        assertTrue(JISX0213String.isValid("\u9946"));	// 饆
        assertEquals(JISX0213String.length("\u9946"), 1);
        assertTrue(JISX0213String.isValid("\u994D"));	// 饍
        assertEquals(JISX0213String.length("\u994D"), 1);
        assertTrue(JISX0213String.isValid("\u994E"));	// 饎
        assertEquals(JISX0213String.length("\u994E"), 1);
        assertTrue(JISX0213String.isValid("\u9958"));	// 饘
        assertEquals(JISX0213String.length("\u9958"), 1);
        assertTrue(JISX0213String.isValid("\u995C"));	// 饜
        assertEquals(JISX0213String.length("\u995C"), 1);
        assertTrue(JISX0213String.isValid("\u995F"));	// 饟
        assertEquals(JISX0213String.length("\u995F"), 1);
        assertTrue(JISX0213String.isValid("\u9960"));	// 饠
        assertEquals(JISX0213String.length("\u9960"), 1);
        assertTrue(JISX0213String.isValid("\u99A6"));	// 馦
        assertEquals(JISX0213String.length("\u99A6"), 1);
        assertTrue(JISX0213String.isValid("\u99B9"));	// 馹
        assertEquals(JISX0213String.length("\u99B9"), 1);
        assertTrue(JISX0213String.isValid("\u99BD"));	// 馽
        assertEquals(JISX0213String.length("\u99BD"), 1);
        assertTrue(JISX0213String.isValid("\u99BF"));	// 馿
        assertEquals(JISX0213String.length("\u99BF"), 1);
        assertTrue(JISX0213String.isValid("\u99C3"));	// 駃
        assertEquals(JISX0213String.length("\u99C3"), 1);
        assertTrue(JISX0213String.isValid("\u99C9"));	// 駉
        assertEquals(JISX0213String.length("\u99C9"), 1);
        assertTrue(JISX0213String.isValid("\u99D4"));	// 駔
        assertEquals(JISX0213String.length("\u99D4"), 1);
        assertTrue(JISX0213String.isValid("\u99D9"));	// 駙
        assertEquals(JISX0213String.length("\u99D9"), 1);
        assertTrue(JISX0213String.isValid("\u99DE"));	// 駞
        assertEquals(JISX0213String.length("\u99DE"), 1);
        assertTrue(JISX0213String.isValid("\u99F0"));	// 駰
        assertEquals(JISX0213String.length("\u99F0"), 1);
        assertTrue(JISX0213String.isValid("\u99F9"));	// 駹
        assertEquals(JISX0213String.length("\u99F9"), 1);
        assertTrue(JISX0213String.isValid("\u9A02"));	// 騂
        assertEquals(JISX0213String.length("\u9A02"), 1);
        assertTrue(JISX0213String.isValid("\u9A03"));	// 騃
        assertEquals(JISX0213String.length("\u9A03"), 1);
        assertTrue(JISX0213String.isValid("\u9A11"));	// 騑
        assertEquals(JISX0213String.length("\u9A11"), 1);
        assertTrue(JISX0213String.isValid("\u9A16"));	// 騖
        assertEquals(JISX0213String.length("\u9A16"), 1);
        assertTrue(JISX0213String.isValid("\u9A20"));	// 騠
        assertEquals(JISX0213String.length("\u9A20"), 1);
        assertTrue(JISX0213String.isValid("\u9A24"));	// 騤
        assertEquals(JISX0213String.length("\u9A24"), 1);
        assertTrue(JISX0213String.isValid("\u9A2D"));	// 騭
        assertEquals(JISX0213String.length("\u9A2D"), 1);
        assertTrue(JISX0213String.isValid("\u9A2E"));	// 騮
        assertEquals(JISX0213String.length("\u9A2E"), 1);
        assertTrue(JISX0213String.isValid("\u9A36"));	// 騶
        assertEquals(JISX0213String.length("\u9A36"), 1);
        assertTrue(JISX0213String.isValid("\u9A38"));	// 騸
        assertEquals(JISX0213String.length("\u9A38"), 1);
        assertTrue(JISX0213String.isValid("\u9A44"));	// 驄
        assertEquals(JISX0213String.length("\u9A44"), 1);
        assertTrue(JISX0213String.isValid("\u9A4A"));	// 驊
        assertEquals(JISX0213String.length("\u9A4A"), 1);
        assertTrue(JISX0213String.isValid("\u9A4C"));	// 驌
        assertEquals(JISX0213String.length("\u9A4C"), 1);
        assertTrue(JISX0213String.isValid("\u9AAF"));	// 骯
        assertEquals(JISX0213String.length("\u9AAF"), 1);
        assertTrue(JISX0213String.isValid("\u9AB6"));	// 骶
        assertEquals(JISX0213String.length("\u9AB6"), 1);
        assertTrue(JISX0213String.isValid("\u9AB9"));	// 骹
        assertEquals(JISX0213String.length("\u9AB9"), 1);
        assertTrue(JISX0213String.isValid("\u9AC1"));	// 髁
        assertEquals(JISX0213String.length("\u9AC1"), 1);
        assertTrue(JISX0213String.isValid("\u9AC3"));	// 髃
        assertEquals(JISX0213String.length("\u9AC3"), 1);
        assertTrue(JISX0213String.isValid("\u9AC6"));	// 髆
        assertEquals(JISX0213String.length("\u9AC6"), 1);
        assertTrue(JISX0213String.isValid("\u9ACE"));	// 髎
        assertEquals(JISX0213String.length("\u9ACE"), 1);
        assertTrue(JISX0213String.isValid("\u9AD0"));	// 髐
        assertEquals(JISX0213String.length("\u9AD0"), 1);
        assertTrue(JISX0213String.isValid("\u9AD2"));	// 髒
        assertEquals(JISX0213String.length("\u9AD2"), 1);
        assertTrue(JISX0213String.isValid("\u9AD5"));	// 髕
        assertEquals(JISX0213String.length("\u9AD5"), 1);
        assertTrue(JISX0213String.isValid("\u9AD6"));	// 髖
        assertEquals(JISX0213String.length("\u9AD6"), 1);
        assertTrue(JISX0213String.isValid("\u9AE0"));	// 髠
        assertEquals(JISX0213String.length("\u9AE0"), 1);
        assertTrue(JISX0213String.isValid("\u9AE5"));	// 髥
        assertEquals(JISX0213String.length("\u9AE5"), 1);
        assertTrue(JISX0213String.isValid("\u9AE9"));	// 髩
        assertEquals(JISX0213String.length("\u9AE9"), 1);
        assertTrue(JISX0213String.isValid("\u9AF9"));	// 髹
        assertEquals(JISX0213String.length("\u9AF9"), 1);
        assertTrue(JISX0213String.isValid("\u9B02"));	// 鬂
        assertEquals(JISX0213String.length("\u9B02"), 1);
        assertTrue(JISX0213String.isValid("\u9B03"));	// 鬃
        assertEquals(JISX0213String.length("\u9B03"), 1);
        assertTrue(JISX0213String.isValid("\u9B08"));	// 鬈
        assertEquals(JISX0213String.length("\u9B08"), 1);
        assertTrue(JISX0213String.isValid("\u9B0C"));	// 鬌
        assertEquals(JISX0213String.length("\u9B0C"), 1);
        assertTrue(JISX0213String.isValid("\u9B10"));	// 鬐
        assertEquals(JISX0213String.length("\u9B10"), 1);
        assertTrue(JISX0213String.isValid("\u9B12"));	// 鬒
        assertEquals(JISX0213String.length("\u9B12"), 1);
        assertTrue(JISX0213String.isValid("\u9B16"));	// 鬖
        assertEquals(JISX0213String.length("\u9B16"), 1);
        assertTrue(JISX0213String.isValid("\u9B1C"));	// 鬜
        assertEquals(JISX0213String.length("\u9B1C"), 1);
        assertTrue(JISX0213String.isValid("\u9B20"));	// 鬠
        assertEquals(JISX0213String.length("\u9B20"), 1);
        assertTrue(JISX0213String.isValid("\u9B2B"));	// 鬫
        assertEquals(JISX0213String.length("\u9B2B"), 1);
        assertTrue(JISX0213String.isValid("\u9B2D"));	// 鬭
        assertEquals(JISX0213String.length("\u9B2D"), 1);
        assertTrue(JISX0213String.isValid("\u9B33"));	// 鬳
        assertEquals(JISX0213String.length("\u9B33"), 1);
        assertTrue(JISX0213String.isValid("\u9B3D"));	// 鬽
        assertEquals(JISX0213String.length("\u9B3D"), 1);
        assertTrue(JISX0213String.isValid("\u9B4B"));	// 魋
        assertEquals(JISX0213String.length("\u9B4B"), 1);
        assertTrue(JISX0213String.isValid("\u9B5E"));	// 魞
        assertEquals(JISX0213String.length("\u9B5E"), 1);
        assertTrue(JISX0213String.isValid("\u9B63"));	// 魣
        assertEquals(JISX0213String.length("\u9B63"), 1);
        assertTrue(JISX0213String.isValid("\u9B65"));	// 魥
        assertEquals(JISX0213String.length("\u9B65"), 1);
        assertTrue(JISX0213String.isValid("\u9B66"));	// 魦
        assertEquals(JISX0213String.length("\u9B66"), 1);
        assertTrue(JISX0213String.isValid("\u9B6B"));	// 魫
        assertEquals(JISX0213String.length("\u9B6B"), 1);
        assertTrue(JISX0213String.isValid("\u9B6C"));	// 魬
        assertEquals(JISX0213String.length("\u9B6C"), 1);
        assertTrue(JISX0213String.isValid("\u9B73"));	// 魳
        assertEquals(JISX0213String.length("\u9B73"), 1);
        assertTrue(JISX0213String.isValid("\u9B77"));	// 魷
        assertEquals(JISX0213String.length("\u9B77"), 1);
        assertTrue(JISX0213String.isValid("\u9B79"));	// 魹
        assertEquals(JISX0213String.length("\u9B79"), 1);
        assertTrue(JISX0213String.isValid("\u9B84"));	// 鮄
        assertEquals(JISX0213String.length("\u9B84"), 1);
        assertTrue(JISX0213String.isValid("\u9B8A"));	// 鮊
        assertEquals(JISX0213String.length("\u9B8A"), 1);
        assertTrue(JISX0213String.isValid("\u9B9E"));	// 鮞
        assertEquals(JISX0213String.length("\u9B9E"), 1);
        assertTrue(JISX0213String.isValid("\u9BA6"));	// 鮦
        assertEquals(JISX0213String.length("\u9BA6"), 1);
        assertTrue(JISX0213String.isValid("\u9BA7"));	// 鮧
        assertEquals(JISX0213String.length("\u9BA7"), 1);
        assertTrue(JISX0213String.isValid("\u9BAC"));	// 鮬
        assertEquals(JISX0213String.length("\u9BAC"), 1);
        assertTrue(JISX0213String.isValid("\u9BB2"));	// 鮲
        assertEquals(JISX0213String.length("\u9BB2"), 1);
        assertTrue(JISX0213String.isValid("\u9BB8"));	// 鮸
        assertEquals(JISX0213String.length("\u9BB8"), 1);
        assertTrue(JISX0213String.isValid("\u9BBE"));	// 鮾
        assertEquals(JISX0213String.length("\u9BBE"), 1);
        assertTrue(JISX0213String.isValid("\u9BC1"));	// 鯁
        assertEquals(JISX0213String.length("\u9BC1"), 1);
        assertTrue(JISX0213String.isValid("\u9BC7"));	// 鯇
        assertEquals(JISX0213String.length("\u9BC7"), 1);
        assertTrue(JISX0213String.isValid("\u9BCE"));	// 鯎
        assertEquals(JISX0213String.length("\u9BCE"), 1);
        assertTrue(JISX0213String.isValid("\u9BD8"));	// 鯘
        assertEquals(JISX0213String.length("\u9BD8"), 1);
        assertTrue(JISX0213String.isValid("\u9BDD"));	// 鯝
        assertEquals(JISX0213String.length("\u9BDD"), 1);
        assertTrue(JISX0213String.isValid("\u9BE5"));	// 鯥
        assertEquals(JISX0213String.length("\u9BE5"), 1);
        assertTrue(JISX0213String.isValid("\u9BE7"));	// 鯧
        assertEquals(JISX0213String.length("\u9BE7"), 1);
        assertTrue(JISX0213String.isValid("\u9BEA"));	// 鯪
        assertEquals(JISX0213String.length("\u9BEA"), 1);
        assertTrue(JISX0213String.isValid("\u9BEB"));	// 鯫
        assertEquals(JISX0213String.length("\u9BEB"), 1);
        assertTrue(JISX0213String.isValid("\u9BEF"));	// 鯯
        assertEquals(JISX0213String.length("\u9BEF"), 1);
        assertTrue(JISX0213String.isValid("\u9BF3"));	// 鯳
        assertEquals(JISX0213String.length("\u9BF3"), 1);
        assertTrue(JISX0213String.isValid("\u9BF7"));	// 鯷
        assertEquals(JISX0213String.length("\u9BF7"), 1);
        assertTrue(JISX0213String.isValid("\u9BF8"));	// 鯸
        assertEquals(JISX0213String.length("\u9BF8"), 1);
        assertTrue(JISX0213String.isValid("\u9BFA"));	// 鯺
        assertEquals(JISX0213String.length("\u9BFA"), 1);
        assertTrue(JISX0213String.isValid("\u9BFD"));	// 鯽
        assertEquals(JISX0213String.length("\u9BFD"), 1);
        assertTrue(JISX0213String.isValid("\u9C16"));	// 鰖
        assertEquals(JISX0213String.length("\u9C16"), 1);
        assertTrue(JISX0213String.isValid("\u9C18"));	// 鰘
        assertEquals(JISX0213String.length("\u9C18"), 1);
        assertTrue(JISX0213String.isValid("\u9C19"));	// 鰙
        assertEquals(JISX0213String.length("\u9C19"), 1);
        assertTrue(JISX0213String.isValid("\u9C1A"));	// 鰚
        assertEquals(JISX0213String.length("\u9C1A"), 1);
        assertTrue(JISX0213String.isValid("\u9C22"));	// 鰢
        assertEquals(JISX0213String.length("\u9C22"), 1);
        assertTrue(JISX0213String.isValid("\u9C23"));	// 鰣
        assertEquals(JISX0213String.length("\u9C23"), 1);
        assertTrue(JISX0213String.isValid("\u9C27"));	// 鰧
        assertEquals(JISX0213String.length("\u9C27"), 1);
        assertTrue(JISX0213String.isValid("\u9C29"));	// 鰩
        assertEquals(JISX0213String.length("\u9C29"), 1);
        assertTrue(JISX0213String.isValid("\u9C2A"));	// 鰪
        assertEquals(JISX0213String.length("\u9C2A"), 1);
        assertTrue(JISX0213String.isValid("\u9C31"));	// 鰱
        assertEquals(JISX0213String.length("\u9C31"), 1);
        assertTrue(JISX0213String.isValid("\u9C36"));	// 鰶
        assertEquals(JISX0213String.length("\u9C36"), 1);
        assertTrue(JISX0213String.isValid("\u9C37"));	// 鰷
        assertEquals(JISX0213String.length("\u9C37"), 1);
        assertTrue(JISX0213String.isValid("\u9C41"));	// 鱁
        assertEquals(JISX0213String.length("\u9C41"), 1);
        assertTrue(JISX0213String.isValid("\u9C45"));	// 鱅
        assertEquals(JISX0213String.length("\u9C45"), 1);
        assertTrue(JISX0213String.isValid("\u9C49"));	// 鱉
        assertEquals(JISX0213String.length("\u9C49"), 1);
        assertTrue(JISX0213String.isValid("\u9C4A"));	// 鱊
        assertEquals(JISX0213String.length("\u9C4A"), 1);
        assertTrue(JISX0213String.isValid("\u9C4F"));	// 鱏
        assertEquals(JISX0213String.length("\u9C4F"), 1);
        assertTrue(JISX0213String.isValid("\u9C50"));	// 鱐
        assertEquals(JISX0213String.length("\u9C50"), 1);
        assertTrue(JISX0213String.isValid("\u9C53"));	// 鱓
        assertEquals(JISX0213String.length("\u9C53"), 1);
        assertTrue(JISX0213String.isValid("\u9C54"));	// 鱔
        assertEquals(JISX0213String.length("\u9C54"), 1);
        assertTrue(JISX0213String.isValid("\u9C58"));	// 鱘
        assertEquals(JISX0213String.length("\u9C58"), 1);
        assertTrue(JISX0213String.isValid("\u9C5B"));	// 鱛
        assertEquals(JISX0213String.length("\u9C5B"), 1);
        assertTrue(JISX0213String.isValid("\u9C5D"));	// 鱝
        assertEquals(JISX0213String.length("\u9C5D"), 1);
        assertTrue(JISX0213String.isValid("\u9C5F"));	// 鱟
        assertEquals(JISX0213String.length("\u9C5F"), 1);
        assertTrue(JISX0213String.isValid("\u9C63"));	// 鱣
        assertEquals(JISX0213String.length("\u9C63"), 1);
        assertTrue(JISX0213String.isValid("\u9C69"));	// 鱩
        assertEquals(JISX0213String.length("\u9C69"), 1);
        assertTrue(JISX0213String.isValid("\u9C6A"));	// 鱪
        assertEquals(JISX0213String.length("\u9C6A"), 1);
        assertTrue(JISX0213String.isValid("\u9C5C"));	// 鱜
        assertEquals(JISX0213String.length("\u9C5C"), 1);
        assertTrue(JISX0213String.isValid("\u9C6B"));	// 鱫
        assertEquals(JISX0213String.length("\u9C6B"), 1);
        assertTrue(JISX0213String.isValid("\u9C6E"));	// 鱮
        assertEquals(JISX0213String.length("\u9C6E"), 1);
        assertTrue(JISX0213String.isValid("\u9C70"));	// 鱰
        assertEquals(JISX0213String.length("\u9C70"), 1);
        assertTrue(JISX0213String.isValid("\u9C72"));	// 鱲
        assertEquals(JISX0213String.length("\u9C72"), 1);
        assertTrue(JISX0213String.isValid("\u9C75"));	// 鱵
        assertEquals(JISX0213String.length("\u9C75"), 1);
        assertTrue(JISX0213String.isValid("\u9C77"));	// 鱷
        assertEquals(JISX0213String.length("\u9C77"), 1);
        assertTrue(JISX0213String.isValid("\u9CE6"));	// 鳦
        assertEquals(JISX0213String.length("\u9CE6"), 1);
        assertTrue(JISX0213String.isValid("\u9CF2"));	// 鳲
        assertEquals(JISX0213String.length("\u9CF2"), 1);
        assertTrue(JISX0213String.isValid("\u9D0B"));	// 鴋
        assertEquals(JISX0213String.length("\u9D0B"), 1);
        assertTrue(JISX0213String.isValid("\u9D02"));	// 鴂
        assertEquals(JISX0213String.length("\u9D02"), 1);
        assertTrue(JISX0213String.isValid("\u9D11"));	// 鴑
        assertEquals(JISX0213String.length("\u9D11"), 1);
        assertTrue(JISX0213String.isValid("\u9D17"));	// 鴗
        assertEquals(JISX0213String.length("\u9D17"), 1);
        assertTrue(JISX0213String.isValid("\u9D18"));	// 鴘
        assertEquals(JISX0213String.length("\u9D18"), 1);
        assertTrue(JISX0213String.isValid("\u9D1D"));	// 鴝
        assertEquals(JISX0213String.length("\u9D1D"), 1);
        assertTrue(JISX0213String.isValid("\u9D1E"));	// 鴞
        assertEquals(JISX0213String.length("\u9D1E"), 1);
        assertTrue(JISX0213String.isValid("\u9D32"));	// 鴲
        assertEquals(JISX0213String.length("\u9D32"), 1);
        assertTrue(JISX0213String.isValid("\u9D42"));	// 鵂
        assertEquals(JISX0213String.length("\u9D42"), 1);
        assertTrue(JISX0213String.isValid("\u9D43"));	// 鵃
        assertEquals(JISX0213String.length("\u9D43"), 1);
        assertTrue(JISX0213String.isValid("\u9D47"));	// 鵇
        assertEquals(JISX0213String.length("\u9D47"), 1);
        assertTrue(JISX0213String.isValid("\u9D4A"));	// 鵊
        assertEquals(JISX0213String.length("\u9D4A"), 1);
        assertTrue(JISX0213String.isValid("\u9D5F"));	// 鵟
        assertEquals(JISX0213String.length("\u9D5F"), 1);
        assertTrue(JISX0213String.isValid("\u9D63"));	// 鵣
        assertEquals(JISX0213String.length("\u9D63"), 1);
        assertTrue(JISX0213String.isValid("\u9D62"));	// 鵢
        assertEquals(JISX0213String.length("\u9D62"), 1);
        assertTrue(JISX0213String.isValid("\u9D69"));	// 鵩
        assertEquals(JISX0213String.length("\u9D69"), 1);
        assertTrue(JISX0213String.isValid("\u9D76"));	// 鵶
        assertEquals(JISX0213String.length("\u9D76"), 1);
        assertTrue(JISX0213String.isValid("\u9D77"));	// 鵷
        assertEquals(JISX0213String.length("\u9D77"), 1);
        assertTrue(JISX0213String.isValid("\u9D7C"));	// 鵼
        assertEquals(JISX0213String.length("\u9D7C"), 1);
        assertTrue(JISX0213String.isValid("\u9D7E"));	// 鵾
        assertEquals(JISX0213String.length("\u9D7E"), 1);
        assertTrue(JISX0213String.isValid("\u9D84"));	// 鶄
        assertEquals(JISX0213String.length("\u9D84"), 1);
        assertTrue(JISX0213String.isValid("\u9D8A"));	// 鶊
        assertEquals(JISX0213String.length("\u9D8A"), 1);
        assertTrue(JISX0213String.isValid("\u9D8D"));	// 鶍
        assertEquals(JISX0213String.length("\u9D8D"), 1);
        assertTrue(JISX0213String.isValid("\u9D96"));	// 鶖
        assertEquals(JISX0213String.length("\u9D96"), 1);
        assertTrue(JISX0213String.isValid("\u9DA1"));	// 鶡
        assertEquals(JISX0213String.length("\u9DA1"), 1);
        assertTrue(JISX0213String.isValid("\u9DAC"));	// 鶬
        assertEquals(JISX0213String.length("\u9DAC"), 1);
        assertTrue(JISX0213String.isValid("\u9DB5"));	// 鶵
        assertEquals(JISX0213String.length("\u9DB5"), 1);
        assertTrue(JISX0213String.isValid("\u9DB9"));	// 鶹
        assertEquals(JISX0213String.length("\u9DB9"), 1);
        assertTrue(JISX0213String.isValid("\u9DBC"));	// 鶼
        assertEquals(JISX0213String.length("\u9DBC"), 1);
        assertTrue(JISX0213String.isValid("\u9DBF"));	// 鶿
        assertEquals(JISX0213String.length("\u9DBF"), 1);
        assertTrue(JISX0213String.isValid("\u9DC3"));	// 鷃
        assertEquals(JISX0213String.length("\u9DC3"), 1);
        assertTrue(JISX0213String.isValid("\u9DC7"));	// 鷇
        assertEquals(JISX0213String.length("\u9DC7"), 1);
        assertTrue(JISX0213String.isValid("\u9DC9"));	// 鷉
        assertEquals(JISX0213String.length("\u9DC9"), 1);
        assertTrue(JISX0213String.isValid("\u9DD6"));	// 鷖
        assertEquals(JISX0213String.length("\u9DD6"), 1);
        assertTrue(JISX0213String.isValid("\u9DD7"));	// 鷗
        assertEquals(JISX0213String.length("\u9DD7"), 1);
        assertTrue(JISX0213String.isValid("\u9DDA"));	// 鷚
        assertEquals(JISX0213String.length("\u9DDA"), 1);
        assertTrue(JISX0213String.isValid("\u9DDF"));	// 鷟
        assertEquals(JISX0213String.length("\u9DDF"), 1);
        assertTrue(JISX0213String.isValid("\u9DE0"));	// 鷠
        assertEquals(JISX0213String.length("\u9DE0"), 1);
        assertTrue(JISX0213String.isValid("\u9DE7"));	// 鷧
        assertEquals(JISX0213String.length("\u9DE7"), 1);
        assertTrue(JISX0213String.isValid("\u9DF4"));	// 鷴
        assertEquals(JISX0213String.length("\u9DF4"), 1);
        assertTrue(JISX0213String.isValid("\u9E0A"));	// 鸊
        assertEquals(JISX0213String.length("\u9E0A"), 1);
        assertTrue(JISX0213String.isValid("\u9E02"));	// 鸂
        assertEquals(JISX0213String.length("\u9E02"), 1);
        assertTrue(JISX0213String.isValid("\u9E07"));	// 鸇
        assertEquals(JISX0213String.length("\u9E07"), 1);
        assertTrue(JISX0213String.isValid("\u9E15"));	// 鸕
        assertEquals(JISX0213String.length("\u9E15"), 1);
        assertTrue(JISX0213String.isValid("\u9E1C"));	// 鸜
        assertEquals(JISX0213String.length("\u9E1C"), 1);
        assertTrue(JISX0213String.isValid("\u9E1D"));	// 鸝
        assertEquals(JISX0213String.length("\u9E1D"), 1);
        assertTrue(JISX0213String.isValid("\u9E7B"));	// 鹻
        assertEquals(JISX0213String.length("\u9E7B"), 1);
        assertTrue(JISX0213String.isValid("\u9E7C"));	// 鹼
        assertEquals(JISX0213String.length("\u9E7C"), 1);
        assertTrue(JISX0213String.isValid("\u9E80"));	// 麀
        assertEquals(JISX0213String.length("\u9E80"), 1);
        assertTrue(JISX0213String.isValid("\u9E85"));	// 麅
        assertEquals(JISX0213String.length("\u9E85"), 1);
        assertTrue(JISX0213String.isValid("\u9E9B"));	// 麛
        assertEquals(JISX0213String.length("\u9E9B"), 1);
        assertTrue(JISX0213String.isValid("\u9E9E"));	// 麞
        assertEquals(JISX0213String.length("\u9E9E"), 1);
        assertTrue(JISX0213String.isValid("\u9EA4"));	// 麤
        assertEquals(JISX0213String.length("\u9EA4"), 1);
        assertTrue(JISX0213String.isValid("\u9EA8"));	// 麨
        assertEquals(JISX0213String.length("\u9EA8"), 1);
        assertTrue(JISX0213String.isValid("\u9EAC"));	// 麬
        assertEquals(JISX0213String.length("\u9EAC"), 1);
        assertTrue(JISX0213String.isValid("\u9EAF"));	// 麯
        assertEquals(JISX0213String.length("\u9EAF"), 1);
        assertTrue(JISX0213String.isValid("\u9EB4"));	// 麴
        assertEquals(JISX0213String.length("\u9EB4"), 1);
        assertTrue(JISX0213String.isValid("\u9EB5"));	// 麵
        assertEquals(JISX0213String.length("\u9EB5"), 1);
        assertTrue(JISX0213String.isValid("\u9EDF"));	// 黟
        assertEquals(JISX0213String.length("\u9EDF"), 1);
        assertTrue(JISX0213String.isValid("\u9EE7"));	// 黧
        assertEquals(JISX0213String.length("\u9EE7"), 1);
        assertTrue(JISX0213String.isValid("\u9EEE"));	// 黮
        assertEquals(JISX0213String.length("\u9EEE"), 1);
        assertTrue(JISX0213String.isValid("\u9EFF"));	// 黿
        assertEquals(JISX0213String.length("\u9EFF"), 1);
        assertTrue(JISX0213String.isValid("\u9F02"));	// 鼂
        assertEquals(JISX0213String.length("\u9F02"), 1);
        assertTrue(JISX0213String.isValid("\u9F03"));	// 鼃
        assertEquals(JISX0213String.length("\u9F03"), 1);
        assertTrue(JISX0213String.isValid("\u9F10"));	// 鼐
        assertEquals(JISX0213String.length("\u9F10"), 1);
        assertTrue(JISX0213String.isValid("\u9F17"));	// 鼗
        assertEquals(JISX0213String.length("\u9F17"), 1);
        assertTrue(JISX0213String.isValid("\u9F19"));	// 鼙
        assertEquals(JISX0213String.length("\u9F19"), 1);
        assertTrue(JISX0213String.isValid("\u9F2F"));	// 鼯
        assertEquals(JISX0213String.length("\u9F2F"), 1);
        assertTrue(JISX0213String.isValid("\u9F37"));	// 鼷
        assertEquals(JISX0213String.length("\u9F37"), 1);
        assertTrue(JISX0213String.isValid("\u9F39"));	// 鼹
        assertEquals(JISX0213String.length("\u9F39"), 1);
        assertTrue(JISX0213String.isValid("\u9F3A"));	// 鼺
        assertEquals(JISX0213String.length("\u9F3A"), 1);
        assertTrue(JISX0213String.isValid("\u9F3D"));	// 鼽
        assertEquals(JISX0213String.length("\u9F3D"), 1);
        assertTrue(JISX0213String.isValid("\u9F41"));	// 齁
        assertEquals(JISX0213String.length("\u9F41"), 1);
        assertTrue(JISX0213String.isValid("\u9F45"));	// 齅
        assertEquals(JISX0213String.length("\u9F45"), 1);
        assertTrue(JISX0213String.isValid("\u9F46"));	// 齆
        assertEquals(JISX0213String.length("\u9F46"), 1);
        assertTrue(JISX0213String.isValid("\u9F53"));	// 齓
        assertEquals(JISX0213String.length("\u9F53"), 1);
        assertTrue(JISX0213String.isValid("\u9F55"));	// 齕
        assertEquals(JISX0213String.length("\u9F55"), 1);
        assertTrue(JISX0213String.isValid("\u9F57"));	// 齗
        assertEquals(JISX0213String.length("\u9F57"), 1);
        assertTrue(JISX0213String.isValid("\u9F58"));	// 齘
        assertEquals(JISX0213String.length("\u9F58"), 1);
        assertTrue(JISX0213String.isValid("\u9F5D"));	// 齝
        assertEquals(JISX0213String.length("\u9F5D"), 1);
        assertTrue(JISX0213String.isValid("\u9F69"));	// 齩
        assertEquals(JISX0213String.length("\u9F69"), 1);
        assertTrue(JISX0213String.isValid("\u9F6D"));	// 齭
        assertEquals(JISX0213String.length("\u9F6D"), 1);
        assertTrue(JISX0213String.isValid("\u9F70"));	// 齰
        assertEquals(JISX0213String.length("\u9F70"), 1);
        assertTrue(JISX0213String.isValid("\u9F75"));	// 齵
        assertEquals(JISX0213String.length("\u9F75"), 1);
        assertTrue(JISX0213String.isValid("\u9F90"));	// 龐
        assertEquals(JISX0213String.length("\u9F90"), 1);
        assertTrue(JISX0213String.isValid("\u9F94"));	// 龔
        assertEquals(JISX0213String.length("\u9F94"), 1);
        assertTrue(JISX0213String.isValid("\u9F97"));	// 龗
        assertEquals(JISX0213String.length("\u9F97"), 1);
        assertTrue(JISX0213String.isValid("\u9FA2"));	// 龢
        assertEquals(JISX0213String.length("\u9FA2"), 1);
    }

    @Test
    void testJISx0212NotContaindInJISX0213AndContainedInMS932() {
        assertTrue(JISX0213String.isValid("\u4F39"));	// 伹
        assertEquals(JISX0213String.length("\u4F39"), 1);
        assertTrue(JISX0213String.isValid("\u4FCD"));	// 俍
        assertEquals(JISX0213String.length("\u4FCD"), 1);
        assertTrue(JISX0213String.isValid("\u4FFF"));	// 俿
        assertEquals(JISX0213String.length("\u4FFF"), 1);
        assertTrue(JISX0213String.isValid("\u50D8"));	// 僘
        assertEquals(JISX0213String.length("\u50D8"), 1);
        assertTrue(JISX0213String.isValid("\u5164"));	// 兤
        assertEquals(JISX0213String.length("\u5164"), 1);
        assertTrue(JISX0213String.isValid("\u51BE"));	// 冾
        assertEquals(JISX0213String.length("\u51BE"), 1);
        assertTrue(JISX0213String.isValid("\u529C"));	// 劜
        assertEquals(JISX0213String.length("\u529C"), 1);
        assertTrue(JISX0213String.isValid("\u52C0"));	// 勀
        assertEquals(JISX0213String.length("\u52C0"), 1);
        assertTrue(JISX0213String.isValid("\u5372"));	// 卲
        assertEquals(JISX0213String.length("\u5372"), 1);
        assertTrue(JISX0213String.isValid("\u53DD"));	// 叝
        assertEquals(JISX0213String.length("\u53DD"), 1);
        assertTrue(JISX0213String.isValid("\u5765"));	// 坥
        assertEquals(JISX0213String.length("\u5765"), 1);
        assertTrue(JISX0213String.isValid("\u58B2"));	// 墲
        assertEquals(JISX0213String.length("\u58B2"), 1);
        assertTrue(JISX0213String.isValid("\u5953"));	// 奓
        assertEquals(JISX0213String.length("\u5953"), 1);
        assertTrue(JISX0213String.isValid("\u5963"));	// 奣
        assertEquals(JISX0213String.length("\u5963"), 1);
        assertTrue(JISX0213String.isValid("\u59BA"));	// 妺
        assertEquals(JISX0213String.length("\u59BA"), 1);
        assertTrue(JISX0213String.isValid("\u5DD0"));	// 巐
        assertEquals(JISX0213String.length("\u5DD0"), 1);
        assertTrue(JISX0213String.isValid("\u5F21"));	// 弡
        assertEquals(JISX0213String.length("\u5F21"), 1);
        assertTrue(JISX0213String.isValid("\u605D"));	// 恝
        assertEquals(JISX0213String.length("\u605D"), 1);
        assertTrue(JISX0213String.isValid("\u60DE"));	// 惞
        assertEquals(JISX0213String.length("\u60DE"), 1);
        assertTrue(JISX0213String.isValid("\u6111"));	// 愑
        assertEquals(JISX0213String.length("\u6111"), 1);
        assertTrue(JISX0213String.isValid("\u6213"));	// 戓
        assertEquals(JISX0213String.length("\u6213"), 1);
        assertTrue(JISX0213String.isValid("\u662E"));	// 昮
        assertEquals(JISX0213String.length("\u662E"), 1);
        assertTrue(JISX0213String.isValid("\u670E"));	// 朎
        assertEquals(JISX0213String.length("\u670E"), 1);
        assertTrue(JISX0213String.isValid("\u6C6F"));	// 汯
        assertEquals(JISX0213String.length("\u6C6F"), 1);
        assertTrue(JISX0213String.isValid("\u6D6F"));	// 浯
        assertEquals(JISX0213String.length("\u6D6F"), 1);
        assertTrue(JISX0213String.isValid("\u6D96"));	// 涖
        assertEquals(JISX0213String.length("\u6D96"), 1);
        assertTrue(JISX0213String.isValid("\u6E39"));	// 渹
        assertEquals(JISX0213String.length("\u6E39"), 1);
        assertTrue(JISX0213String.isValid("\u7324"));	// 猤
        assertEquals(JISX0213String.length("\u7324"), 1);
        assertTrue(JISX0213String.isValid("\u73BD"));	// 玽
        assertEquals(JISX0213String.length("\u73BD"), 1);
        assertTrue(JISX0213String.isValid("\u73D2"));	// 珒
        assertEquals(JISX0213String.length("\u73D2"), 1);
        assertTrue(JISX0213String.isValid("\u73F5"));	// 珵
        assertEquals(JISX0213String.length("\u73F5"), 1);
        assertTrue(JISX0213String.isValid("\u7429"));	// 琩
        assertEquals(JISX0213String.length("\u7429"), 1);
        assertTrue(JISX0213String.isValid("\u787A"));	// 硺
        assertEquals(JISX0213String.length("\u787A"), 1);
        assertTrue(JISX0213String.isValid("\u7FA1"));	// 羡
        assertEquals(JISX0213String.length("\u7FA1"), 1);
        assertTrue(JISX0213String.isValid("\u83F6"));	// 菶
        assertEquals(JISX0213String.length("\u83F6"), 1);
        assertTrue(JISX0213String.isValid("\u856B"));	// 蕫
        assertEquals(JISX0213String.length("\u856B"), 1);
        assertTrue(JISX0213String.isValid("\u8B53"));	// 譓
        assertEquals(JISX0213String.length("\u8B53"), 1);
        assertTrue(JISX0213String.isValid("\u8ECF"));	// 軏
        assertEquals(JISX0213String.length("\u8ECF"), 1);
        assertTrue(JISX0213String.isValid("\u9067"));	// 遧
        assertEquals(JISX0213String.length("\u9067"), 1);
        assertTrue(JISX0213String.isValid("\u91DE"));	// 釞
        assertEquals(JISX0213String.length("\u91DE"), 1);
        assertTrue(JISX0213String.isValid("\u9206"));	// 鈆
        assertEquals(JISX0213String.length("\u9206"), 1);
        assertTrue(JISX0213String.isValid("\u9277"));	// 鉷
        assertEquals(JISX0213String.length("\u9277"), 1);
        assertTrue(JISX0213String.isValid("\u92D5"));	// 鋕
        assertEquals(JISX0213String.length("\u92D5"), 1);
        assertTrue(JISX0213String.isValid("\u93A4"));	// 鎤
        assertEquals(JISX0213String.length("\u93A4"), 1);
        assertTrue(JISX0213String.isValid("\u93F8"));	// 鏸
        assertEquals(JISX0213String.length("\u93F8"), 1);
        assertTrue(JISX0213String.isValid("\u9431"));	// 鐱
        assertEquals(JISX0213String.length("\u9431"), 1);
        assertTrue(JISX0213String.isValid("\u9448"));	// 鑈
        assertEquals(JISX0213String.length("\u9448"), 1);
        assertTrue(JISX0213String.isValid("\u9743"));	// 靃
        assertEquals(JISX0213String.length("\u9743"), 1);
        assertTrue(JISX0213String.isValid("\u9927"));	// 餧
        assertEquals(JISX0213String.length("\u9927"), 1);
        assertTrue(JISX0213String.isValid("\u9BBB"));	// 鮻
        assertEquals(JISX0213String.length("\u9BBB"), 1);
    }

    @Test
    void testJISx0212NotContaindInJISX0213AndMS932() {
        assertFalse(JISX0213String.isValid("\u4E04"));	// 丄
        assertEquals(JISX0213String.length("\u4E04"), 1);
        assertFalse(JISX0213String.isValid("\u4E05"));	// 丅
        assertEquals(JISX0213String.length("\u4E05"), 1);
        assertFalse(JISX0213String.isValid("\u4E0C"));	// 丌
        assertEquals(JISX0213String.length("\u4E0C"), 1);
        assertFalse(JISX0213String.isValid("\u4E1F"));	// 丟
        assertEquals(JISX0213String.length("\u4E1F"), 1);
        assertFalse(JISX0213String.isValid("\u4E23"));	// 丣
        assertEquals(JISX0213String.length("\u4E23"), 1);
        assertFalse(JISX0213String.isValid("\u4E24"));	// 两
        assertEquals(JISX0213String.length("\u4E24"), 1);
        assertFalse(JISX0213String.isValid("\u4E35"));	// 丵
        assertEquals(JISX0213String.length("\u4E35"), 1);
        assertFalse(JISX0213String.isValid("\u4E41"));	// 乁
        assertEquals(JISX0213String.length("\u4E41"), 1);
        assertFalse(JISX0213String.isValid("\u4E44"));	// 乄
        assertEquals(JISX0213String.length("\u4E44"), 1);
        assertFalse(JISX0213String.isValid("\u4E5C"));	// 乜
        assertEquals(JISX0213String.length("\u4E5C"), 1);
        assertFalse(JISX0213String.isValid("\u4E63"));	// 乣
        assertEquals(JISX0213String.length("\u4E63"), 1);
        assertFalse(JISX0213String.isValid("\u4E68"));	// 乨
        assertEquals(JISX0213String.length("\u4E68"), 1);
        assertFalse(JISX0213String.isValid("\u4E74"));	// 乴
        assertEquals(JISX0213String.length("\u4E74"), 1);
        assertFalse(JISX0213String.isValid("\u4E75"));	// 乵
        assertEquals(JISX0213String.length("\u4E75"), 1);
        assertFalse(JISX0213String.isValid("\u4E79"));	// 乹
        assertEquals(JISX0213String.length("\u4E79"), 1);
        assertFalse(JISX0213String.isValid("\u4E7F"));	// 乿
        assertEquals(JISX0213String.length("\u4E7F"), 1);
        assertFalse(JISX0213String.isValid("\u4E96"));	// 亖
        assertEquals(JISX0213String.length("\u4E96"), 1);
        assertFalse(JISX0213String.isValid("\u4E97"));	// 亗
        assertEquals(JISX0213String.length("\u4E97"), 1);
        assertFalse(JISX0213String.isValid("\u4EAF"));	// 亯
        assertEquals(JISX0213String.length("\u4EAF"), 1);
        assertFalse(JISX0213String.isValid("\u4EDB"));	// 仛
        assertEquals(JISX0213String.length("\u4EDB"), 1);
        assertFalse(JISX0213String.isValid("\u4EE0"));	// 仠
        assertEquals(JISX0213String.length("\u4EE0"), 1);
        assertFalse(JISX0213String.isValid("\u4EE2"));	// 仢
        assertEquals(JISX0213String.length("\u4EE2"), 1);
        assertFalse(JISX0213String.isValid("\u4EE8"));	// 仨
        assertEquals(JISX0213String.length("\u4EE8"), 1);
        assertFalse(JISX0213String.isValid("\u4EEF"));	// 仯
        assertEquals(JISX0213String.length("\u4EEF"), 1);
        assertFalse(JISX0213String.isValid("\u4EF3"));	// 仳
        assertEquals(JISX0213String.length("\u4EF3"), 1);
        assertFalse(JISX0213String.isValid("\u4EFE"));	// 仾
        assertEquals(JISX0213String.length("\u4EFE"), 1);
        assertFalse(JISX0213String.isValid("\u4F02"));	// 伂
        assertEquals(JISX0213String.length("\u4F02"), 1);
        assertFalse(JISX0213String.isValid("\u4F08"));	// 伈
        assertEquals(JISX0213String.length("\u4F08"), 1);
        assertFalse(JISX0213String.isValid("\u4F0C"));	// 伌
        assertEquals(JISX0213String.length("\u4F0C"), 1);
        assertFalse(JISX0213String.isValid("\u4F12"));	// 伒
        assertEquals(JISX0213String.length("\u4F12"), 1);
        assertFalse(JISX0213String.isValid("\u4F15"));	// 伕
        assertEquals(JISX0213String.length("\u4F15"), 1);
        assertFalse(JISX0213String.isValid("\u4F17"));	// 众
        assertEquals(JISX0213String.length("\u4F17"), 1);
        assertFalse(JISX0213String.isValid("\u4F19"));	// 伙
        assertEquals(JISX0213String.length("\u4F19"), 1);
        assertFalse(JISX0213String.isValid("\u4F2E"));	// 伮
        assertEquals(JISX0213String.length("\u4F2E"), 1);
        assertFalse(JISX0213String.isValid("\u4F31"));	// 伱
        assertEquals(JISX0213String.length("\u4F31"), 1);
        assertFalse(JISX0213String.isValid("\u4F33"));	// 伳
        assertEquals(JISX0213String.length("\u4F33"), 1);
        assertFalse(JISX0213String.isValid("\u4F35"));	// 伵
        assertEquals(JISX0213String.length("\u4F35"), 1);
        assertFalse(JISX0213String.isValid("\u4F3B"));	// 伻
        assertEquals(JISX0213String.length("\u4F3B"), 1);
        assertFalse(JISX0213String.isValid("\u4F40"));	// 佀
        assertEquals(JISX0213String.length("\u4F40"), 1);
        assertFalse(JISX0213String.isValid("\u4F42"));	// 佂
        assertEquals(JISX0213String.length("\u4F42"), 1);
        assertFalse(JISX0213String.isValid("\u4F4B"));	// 佋
        assertEquals(JISX0213String.length("\u4F4B"), 1);
        assertFalse(JISX0213String.isValid("\u4F4C"));	// 佌
        assertEquals(JISX0213String.length("\u4F4C"), 1);
        assertFalse(JISX0213String.isValid("\u4F52"));	// 佒
        assertEquals(JISX0213String.length("\u4F52"), 1);
        assertFalse(JISX0213String.isValid("\u4F63"));	// 佣
        assertEquals(JISX0213String.length("\u4F63"), 1);
        assertFalse(JISX0213String.isValid("\u4F6E"));	// 佮
        assertEquals(JISX0213String.length("\u4F6E"), 1);
        assertFalse(JISX0213String.isValid("\u4F71"));	// 佱
        assertEquals(JISX0213String.length("\u4F71"), 1);
        assertFalse(JISX0213String.isValid("\u4F79"));	// 佹
        assertEquals(JISX0213String.length("\u4F79"), 1);
        assertFalse(JISX0213String.isValid("\u4F81"));	// 侁
        assertEquals(JISX0213String.length("\u4F81"), 1);
        assertFalse(JISX0213String.isValid("\u4F84"));	// 侄
        assertEquals(JISX0213String.length("\u4F84"), 1);
        assertFalse(JISX0213String.isValid("\u4F89"));	// 侉
        assertEquals(JISX0213String.length("\u4F89"), 1);
        assertFalse(JISX0213String.isValid("\u4F8C"));	// 侌
        assertEquals(JISX0213String.length("\u4F8C"), 1);
        assertFalse(JISX0213String.isValid("\u4F8E"));	// 侎
        assertEquals(JISX0213String.length("\u4F8E"), 1);
        assertFalse(JISX0213String.isValid("\u4F90"));	// 侐
        assertEquals(JISX0213String.length("\u4F90"), 1);
        assertFalse(JISX0213String.isValid("\u4F93"));	// 侓
        assertEquals(JISX0213String.length("\u4F93"), 1);
        assertFalse(JISX0213String.isValid("\u4F99"));	// 侙
        assertEquals(JISX0213String.length("\u4F99"), 1);
        assertFalse(JISX0213String.isValid("\u4F9E"));	// 侞
        assertEquals(JISX0213String.length("\u4F9E"), 1);
        assertFalse(JISX0213String.isValid("\u4F9F"));	// 侟
        assertEquals(JISX0213String.length("\u4F9F"), 1);
        assertFalse(JISX0213String.isValid("\u4FB7"));	// 侷
        assertEquals(JISX0213String.length("\u4FB7"), 1);
        assertFalse(JISX0213String.isValid("\u4FB9"));	// 侹
        assertEquals(JISX0213String.length("\u4FB9"), 1);
        assertFalse(JISX0213String.isValid("\u4FBB"));	// 侻
        assertEquals(JISX0213String.length("\u4FBB"), 1);
        assertFalse(JISX0213String.isValid("\u4FBC"));	// 侼
        assertEquals(JISX0213String.length("\u4FBC"), 1);
        assertFalse(JISX0213String.isValid("\u4FBD"));	// 侽
        assertEquals(JISX0213String.length("\u4FBD"), 1);
        assertFalse(JISX0213String.isValid("\u4FC0"));	// 俀
        assertEquals(JISX0213String.length("\u4FC0"), 1);
        assertFalse(JISX0213String.isValid("\u4FC1"));	// 俁
        assertEquals(JISX0213String.length("\u4FC1"), 1);
        assertFalse(JISX0213String.isValid("\u4FC6"));	// 俆
        assertEquals(JISX0213String.length("\u4FC6"), 1);
        assertFalse(JISX0213String.isValid("\u4FC8"));	// 俈
        assertEquals(JISX0213String.length("\u4FC8"), 1);
        assertFalse(JISX0213String.isValid("\u4FCC"));	// 俌
        assertEquals(JISX0213String.length("\u4FCC"), 1);
        assertFalse(JISX0213String.isValid("\u4FDC"));	// 俜
        assertEquals(JISX0213String.length("\u4FDC"), 1);
        assertFalse(JISX0213String.isValid("\u4FE2"));	// 俢
        assertEquals(JISX0213String.length("\u4FE2"), 1);
        assertFalse(JISX0213String.isValid("\u4FF0"));	// 俰
        assertEquals(JISX0213String.length("\u4FF0"), 1);
        assertFalse(JISX0213String.isValid("\u4FFC"));	// 俼
        assertEquals(JISX0213String.length("\u4FFC"), 1);
        assertFalse(JISX0213String.isValid("\u4FFD"));	// 俽
        assertEquals(JISX0213String.length("\u4FFD"), 1);
        assertFalse(JISX0213String.isValid("\u5004"));	// 倄
        assertEquals(JISX0213String.length("\u5004"), 1);
        assertFalse(JISX0213String.isValid("\u5007"));	// 倇
        assertEquals(JISX0213String.length("\u5007"), 1);
        assertFalse(JISX0213String.isValid("\u500A"));	// 倊
        assertEquals(JISX0213String.length("\u500A"), 1);
        assertFalse(JISX0213String.isValid("\u500C"));	// 倌
        assertEquals(JISX0213String.length("\u500C"), 1);
        assertFalse(JISX0213String.isValid("\u5017"));	// 倗
        assertEquals(JISX0213String.length("\u5017"), 1);
        assertFalse(JISX0213String.isValid("\u501B"));	// 倛
        assertEquals(JISX0213String.length("\u501B"), 1);
        assertFalse(JISX0213String.isValid("\u501D"));	// 倝
        assertEquals(JISX0213String.length("\u501D"), 1);
        assertFalse(JISX0213String.isValid("\u5030"));	// 倰
        assertEquals(JISX0213String.length("\u5030"), 1);
        assertFalse(JISX0213String.isValid("\u5032"));	// 倲
        assertEquals(JISX0213String.length("\u5032"), 1);
        assertFalse(JISX0213String.isValid("\u5033"));	// 倳
        assertEquals(JISX0213String.length("\u5033"), 1);
        assertFalse(JISX0213String.isValid("\u5035"));	// 倵
        assertEquals(JISX0213String.length("\u5035"), 1);
        assertFalse(JISX0213String.isValid("\u5045"));	// 偅
        assertEquals(JISX0213String.length("\u5045"), 1);
        assertFalse(JISX0213String.isValid("\u504A"));	// 偊
        assertEquals(JISX0213String.length("\u504A"), 1);
        assertFalse(JISX0213String.isValid("\u504C"));	// 偌
        assertEquals(JISX0213String.length("\u504C"), 1);
        assertFalse(JISX0213String.isValid("\u5051"));	// 偑
        assertEquals(JISX0213String.length("\u5051"), 1);
        assertFalse(JISX0213String.isValid("\u5052"));	// 偒
        assertEquals(JISX0213String.length("\u5052"), 1);
        assertFalse(JISX0213String.isValid("\u5059"));	// 偙
        assertEquals(JISX0213String.length("\u5059"), 1);
        assertFalse(JISX0213String.isValid("\u505F"));	// 偟
        assertEquals(JISX0213String.length("\u505F"), 1);
        assertFalse(JISX0213String.isValid("\u5060"));	// 偠
        assertEquals(JISX0213String.length("\u5060"), 1);
        assertFalse(JISX0213String.isValid("\u5062"));	// 偢
        assertEquals(JISX0213String.length("\u5062"), 1);
        assertFalse(JISX0213String.isValid("\u5067"));	// 偧
        assertEquals(JISX0213String.length("\u5067"), 1);
        assertFalse(JISX0213String.isValid("\u506D"));	// 偭
        assertEquals(JISX0213String.length("\u506D"), 1);
        assertFalse(JISX0213String.isValid("\u5071"));	// 偱
        assertEquals(JISX0213String.length("\u5071"), 1);
        assertFalse(JISX0213String.isValid("\u5081"));	// 傁
        assertEquals(JISX0213String.length("\u5081"), 1);
        assertFalse(JISX0213String.isValid("\u5083"));	// 傃
        assertEquals(JISX0213String.length("\u5083"), 1);
        assertFalse(JISX0213String.isValid("\u5084"));	// 傄
        assertEquals(JISX0213String.length("\u5084"), 1);
        assertFalse(JISX0213String.isValid("\u5086"));	// 傆
        assertEquals(JISX0213String.length("\u5086"), 1);
        assertFalse(JISX0213String.isValid("\u508A"));	// 傊
        assertEquals(JISX0213String.length("\u508A"), 1);
        assertFalse(JISX0213String.isValid("\u508E"));	// 傎
        assertEquals(JISX0213String.length("\u508E"), 1);
        assertFalse(JISX0213String.isValid("\u508F"));	// 傏
        assertEquals(JISX0213String.length("\u508F"), 1);
        assertFalse(JISX0213String.isValid("\u5090"));	// 傐
        assertEquals(JISX0213String.length("\u5090"), 1);
        assertFalse(JISX0213String.isValid("\u509B"));	// 傛
        assertEquals(JISX0213String.length("\u509B"), 1);
        assertFalse(JISX0213String.isValid("\u509E"));	// 傞
        assertEquals(JISX0213String.length("\u509E"), 1);
        assertFalse(JISX0213String.isValid("\u509F"));	// 傟
        assertEquals(JISX0213String.length("\u509F"), 1);
        assertFalse(JISX0213String.isValid("\u50A0"));	// 傠
        assertEquals(JISX0213String.length("\u50A0"), 1);
        assertFalse(JISX0213String.isValid("\u50A1"));	// 傡
        assertEquals(JISX0213String.length("\u50A1"), 1);
        assertFalse(JISX0213String.isValid("\u50A2"));	// 傢
        assertEquals(JISX0213String.length("\u50A2"), 1);
        assertFalse(JISX0213String.isValid("\u50AF"));	// 傯
        assertEquals(JISX0213String.length("\u50AF"), 1);
        assertFalse(JISX0213String.isValid("\u50B0"));	// 傰
        assertEquals(JISX0213String.length("\u50B0"), 1);
        assertFalse(JISX0213String.isValid("\u50B9"));	// 傹
        assertEquals(JISX0213String.length("\u50B9"), 1);
        assertFalse(JISX0213String.isValid("\u50BD"));	// 傽
        assertEquals(JISX0213String.length("\u50BD"), 1);
        assertFalse(JISX0213String.isValid("\u50C0"));	// 僀
        assertEquals(JISX0213String.length("\u50C0"), 1);
        assertFalse(JISX0213String.isValid("\u50C3"));	// 僃
        assertEquals(JISX0213String.length("\u50C3"), 1);
        assertFalse(JISX0213String.isValid("\u50D3"));	// 僓
        assertEquals(JISX0213String.length("\u50D3"), 1);
        assertFalse(JISX0213String.isValid("\u50DC"));	// 僜
        assertEquals(JISX0213String.length("\u50DC"), 1);
        assertFalse(JISX0213String.isValid("\u50DD"));	// 僝
        assertEquals(JISX0213String.length("\u50DD"), 1);
        assertFalse(JISX0213String.isValid("\u50DF"));	// 僟
        assertEquals(JISX0213String.length("\u50DF"), 1);
        assertFalse(JISX0213String.isValid("\u50E2"));	// 僢
        assertEquals(JISX0213String.length("\u50E2"), 1);
        assertFalse(JISX0213String.isValid("\u50E4"));	// 僤
        assertEquals(JISX0213String.length("\u50E4"), 1);
        assertFalse(JISX0213String.isValid("\u50E8"));	// 僨
        assertEquals(JISX0213String.length("\u50E8"), 1);
        assertFalse(JISX0213String.isValid("\u50EF"));	// 僯
        assertEquals(JISX0213String.length("\u50EF"), 1);
        assertFalse(JISX0213String.isValid("\u50F1"));	// 僱
        assertEquals(JISX0213String.length("\u50F1"), 1);
        assertFalse(JISX0213String.isValid("\u50F6"));	// 僶
        assertEquals(JISX0213String.length("\u50F6"), 1);
        assertFalse(JISX0213String.isValid("\u50FA"));	// 僺
        assertEquals(JISX0213String.length("\u50FA"), 1);
        assertFalse(JISX0213String.isValid("\u50FE"));	// 僾
        assertEquals(JISX0213String.length("\u50FE"), 1);
        assertFalse(JISX0213String.isValid("\u5107"));	// 儇
        assertEquals(JISX0213String.length("\u5107"), 1);
        assertFalse(JISX0213String.isValid("\u510C"));	// 儌
        assertEquals(JISX0213String.length("\u510C"), 1);
        assertFalse(JISX0213String.isValid("\u510D"));	// 儍
        assertEquals(JISX0213String.length("\u510D"), 1);
        assertFalse(JISX0213String.isValid("\u510E"));	// 儎
        assertEquals(JISX0213String.length("\u510E"), 1);
        assertFalse(JISX0213String.isValid("\u5110"));	// 儐
        assertEquals(JISX0213String.length("\u5110"), 1);
        assertFalse(JISX0213String.isValid("\u5119"));	// 儙
        assertEquals(JISX0213String.length("\u5119"), 1);
        assertFalse(JISX0213String.isValid("\u511C"));	// 儜
        assertEquals(JISX0213String.length("\u511C"), 1);
        assertFalse(JISX0213String.isValid("\u511D"));	// 儝
        assertEquals(JISX0213String.length("\u511D"), 1);
        assertFalse(JISX0213String.isValid("\u5123"));	// 儣
        assertEquals(JISX0213String.length("\u5123"), 1);
        assertFalse(JISX0213String.isValid("\u5127"));	// 儧
        assertEquals(JISX0213String.length("\u5127"), 1);
        assertFalse(JISX0213String.isValid("\u5128"));	// 儨
        assertEquals(JISX0213String.length("\u5128"), 1);
        assertFalse(JISX0213String.isValid("\u512C"));	// 儬
        assertEquals(JISX0213String.length("\u512C"), 1);
        assertFalse(JISX0213String.isValid("\u512D"));	// 儭
        assertEquals(JISX0213String.length("\u512D"), 1);
        assertFalse(JISX0213String.isValid("\u512F"));	// 儯
        assertEquals(JISX0213String.length("\u512F"), 1);
        assertFalse(JISX0213String.isValid("\u5131"));	// 儱
        assertEquals(JISX0213String.length("\u5131"), 1);
        assertFalse(JISX0213String.isValid("\u5133"));	// 儳
        assertEquals(JISX0213String.length("\u5133"), 1);
        assertFalse(JISX0213String.isValid("\u5134"));	// 儴
        assertEquals(JISX0213String.length("\u5134"), 1);
        assertFalse(JISX0213String.isValid("\u5138"));	// 儸
        assertEquals(JISX0213String.length("\u5138"), 1);
        assertFalse(JISX0213String.isValid("\u5139"));	// 儹
        assertEquals(JISX0213String.length("\u5139"), 1);
        assertFalse(JISX0213String.isValid("\u5142"));	// 兂
        assertEquals(JISX0213String.length("\u5142"), 1);
        assertFalse(JISX0213String.isValid("\u514F"));	// 兏
        assertEquals(JISX0213String.length("\u514F"), 1);
        assertFalse(JISX0213String.isValid("\u5153"));	// 兓
        assertEquals(JISX0213String.length("\u5153"), 1);
        assertFalse(JISX0213String.isValid("\u5158"));	// 兘
        assertEquals(JISX0213String.length("\u5158"), 1);
        assertFalse(JISX0213String.isValid("\u515F"));	// 兟
        assertEquals(JISX0213String.length("\u515F"), 1);
        assertFalse(JISX0213String.isValid("\u5166"));	// 兦
        assertEquals(JISX0213String.length("\u5166"), 1);
        assertFalse(JISX0213String.isValid("\u517E"));	// 兾
        assertEquals(JISX0213String.length("\u517E"), 1);
        assertFalse(JISX0213String.isValid("\u5184"));	// 冄
        assertEquals(JISX0213String.length("\u5184"), 1);
        assertFalse(JISX0213String.isValid("\u518E"));	// 冎
        assertEquals(JISX0213String.length("\u518E"), 1);
        assertFalse(JISX0213String.isValid("\u51A1"));	// 冡
        assertEquals(JISX0213String.length("\u51A1"), 1);
        assertFalse(JISX0213String.isValid("\u51B8"));	// 冸
        assertEquals(JISX0213String.length("\u51B8"), 1);
        assertFalse(JISX0213String.isValid("\u51BA"));	// 冺
        assertEquals(JISX0213String.length("\u51BA"), 1);
        assertFalse(JISX0213String.isValid("\u51BF"));	// 冿
        assertEquals(JISX0213String.length("\u51BF"), 1);
        assertFalse(JISX0213String.isValid("\u51C2"));	// 凂
        assertEquals(JISX0213String.length("\u51C2"), 1);
        assertFalse(JISX0213String.isValid("\u51C8"));	// 凈
        assertEquals(JISX0213String.length("\u51C8"), 1);
        assertFalse(JISX0213String.isValid("\u51CF"));	// 减
        assertEquals(JISX0213String.length("\u51CF"), 1);
        assertFalse(JISX0213String.isValid("\u51D1"));	// 凑
        assertEquals(JISX0213String.length("\u51D1"), 1);
        assertFalse(JISX0213String.isValid("\u51D2"));	// 凒
        assertEquals(JISX0213String.length("\u51D2"), 1);
        assertFalse(JISX0213String.isValid("\u51D3"));	// 凓
        assertEquals(JISX0213String.length("\u51D3"), 1);
        assertFalse(JISX0213String.isValid("\u51D5"));	// 凕
        assertEquals(JISX0213String.length("\u51D5"), 1);
        assertFalse(JISX0213String.isValid("\u51D8"));	// 凘
        assertEquals(JISX0213String.length("\u51D8"), 1);
        assertFalse(JISX0213String.isValid("\u51E5"));	// 凥
        assertEquals(JISX0213String.length("\u51E5"), 1);
        assertFalse(JISX0213String.isValid("\u51F2"));	// 凲
        assertEquals(JISX0213String.length("\u51F2"), 1);
        assertFalse(JISX0213String.isValid("\u51F7"));	// 凷
        assertEquals(JISX0213String.length("\u51F7"), 1);
        assertFalse(JISX0213String.isValid("\u5205"));	// 刅
        assertEquals(JISX0213String.length("\u5205"), 1);
        assertFalse(JISX0213String.isValid("\u5218"));	// 刘
        assertEquals(JISX0213String.length("\u5218"), 1);
        assertFalse(JISX0213String.isValid("\u5222"));	// 刢
        assertEquals(JISX0213String.length("\u5222"), 1);
        assertFalse(JISX0213String.isValid("\u5228"));	// 刨
        assertEquals(JISX0213String.length("\u5228"), 1);
        assertFalse(JISX0213String.isValid("\u5231"));	// 刱
        assertEquals(JISX0213String.length("\u5231"), 1);
        assertFalse(JISX0213String.isValid("\u5232"));	// 刲
        assertEquals(JISX0213String.length("\u5232"), 1);
        assertFalse(JISX0213String.isValid("\u5235"));	// 刵
        assertEquals(JISX0213String.length("\u5235"), 1);
        assertFalse(JISX0213String.isValid("\u523C"));	// 刼
        assertEquals(JISX0213String.length("\u523C"), 1);
        assertFalse(JISX0213String.isValid("\u5245"));	// 剅
        assertEquals(JISX0213String.length("\u5245"), 1);
        assertFalse(JISX0213String.isValid("\u5258"));	// 剘
        assertEquals(JISX0213String.length("\u5258"), 1);
        assertFalse(JISX0213String.isValid("\u525A"));	// 剚
        assertEquals(JISX0213String.length("\u525A"), 1);
        assertFalse(JISX0213String.isValid("\u525F"));	// 剟
        assertEquals(JISX0213String.length("\u525F"), 1);
        assertFalse(JISX0213String.isValid("\u5260"));	// 剠
        assertEquals(JISX0213String.length("\u5260"), 1);
        assertFalse(JISX0213String.isValid("\u5266"));	// 剦
        assertEquals(JISX0213String.length("\u5266"), 1);
        assertFalse(JISX0213String.isValid("\u526E"));	// 剮
        assertEquals(JISX0213String.length("\u526E"), 1);
        assertFalse(JISX0213String.isValid("\u5278"));	// 剸
        assertEquals(JISX0213String.length("\u5278"), 1);
        assertFalse(JISX0213String.isValid("\u5279"));	// 剹
        assertEquals(JISX0213String.length("\u5279"), 1);
        assertFalse(JISX0213String.isValid("\u5280"));	// 劀
        assertEquals(JISX0213String.length("\u5280"), 1);
        assertFalse(JISX0213String.isValid("\u5285"));	// 劅
        assertEquals(JISX0213String.length("\u5285"), 1);
        assertFalse(JISX0213String.isValid("\u528A"));	// 劊
        assertEquals(JISX0213String.length("\u528A"), 1);
        assertFalse(JISX0213String.isValid("\u528C"));	// 劌
        assertEquals(JISX0213String.length("\u528C"), 1);
        assertFalse(JISX0213String.isValid("\u5295"));	// 劕
        assertEquals(JISX0213String.length("\u5295"), 1);
        assertFalse(JISX0213String.isValid("\u5296"));	// 劖
        assertEquals(JISX0213String.length("\u5296"), 1);
        assertFalse(JISX0213String.isValid("\u5297"));	// 劗
        assertEquals(JISX0213String.length("\u5297"), 1);
        assertFalse(JISX0213String.isValid("\u529A"));	// 劚
        assertEquals(JISX0213String.length("\u529A"), 1);
        assertFalse(JISX0213String.isValid("\u52A5"));	// 劥
        assertEquals(JISX0213String.length("\u52A5"), 1);
        assertFalse(JISX0213String.isValid("\u52A7"));	// 劧
        assertEquals(JISX0213String.length("\u52A7"), 1);
        assertFalse(JISX0213String.isValid("\u52B0"));	// 劰
        assertEquals(JISX0213String.length("\u52B0"), 1);
        assertFalse(JISX0213String.isValid("\u52B6"));	// 劶
        assertEquals(JISX0213String.length("\u52B6"), 1);
        assertFalse(JISX0213String.isValid("\u52B7"));	// 劷
        assertEquals(JISX0213String.length("\u52B7"), 1);
        assertFalse(JISX0213String.isValid("\u52B8"));	// 劸
        assertEquals(JISX0213String.length("\u52B8"), 1);
        assertFalse(JISX0213String.isValid("\u52BD"));	// 劽
        assertEquals(JISX0213String.length("\u52BD"), 1);
        assertFalse(JISX0213String.isValid("\u52C4"));	// 勄
        assertEquals(JISX0213String.length("\u52C4"), 1);
        assertFalse(JISX0213String.isValid("\u52C6"));	// 勆
        assertEquals(JISX0213String.length("\u52C6"), 1);
        assertFalse(JISX0213String.isValid("\u52CF"));	// 勏
        assertEquals(JISX0213String.length("\u52CF"), 1);
        assertFalse(JISX0213String.isValid("\u52D4"));	// 勔
        assertEquals(JISX0213String.length("\u52D4"), 1);
        assertFalse(JISX0213String.isValid("\u52DC"));	// 勜
        assertEquals(JISX0213String.length("\u52DC"), 1);
        assertFalse(JISX0213String.isValid("\u52E1"));	// 勡
        assertEquals(JISX0213String.length("\u52E1"), 1);
        assertFalse(JISX0213String.isValid("\u52E5"));	// 勥
        assertEquals(JISX0213String.length("\u52E5"), 1);
        assertFalse(JISX0213String.isValid("\u52E8"));	// 勨
        assertEquals(JISX0213String.length("\u52E8"), 1);
        assertFalse(JISX0213String.isValid("\u52E9"));	// 勩
        assertEquals(JISX0213String.length("\u52E9"), 1);
        assertFalse(JISX0213String.isValid("\u52EA"));	// 勪
        assertEquals(JISX0213String.length("\u52EA"), 1);
        assertFalse(JISX0213String.isValid("\u52EC"));	// 勬
        assertEquals(JISX0213String.length("\u52EC"), 1);
        assertFalse(JISX0213String.isValid("\u52F1"));	// 勱
        assertEquals(JISX0213String.length("\u52F1"), 1);
        assertFalse(JISX0213String.isValid("\u52F4"));	// 勴
        assertEquals(JISX0213String.length("\u52F4"), 1);
        assertFalse(JISX0213String.isValid("\u52F6"));	// 勶
        assertEquals(JISX0213String.length("\u52F6"), 1);
        assertFalse(JISX0213String.isValid("\u5303"));	// 匃
        assertEquals(JISX0213String.length("\u5303"), 1);
        assertFalse(JISX0213String.isValid("\u530C"));	// 匌
        assertEquals(JISX0213String.length("\u530C"), 1);
        assertFalse(JISX0213String.isValid("\u5311"));	// 匑
        assertEquals(JISX0213String.length("\u5311"), 1);
        assertFalse(JISX0213String.isValid("\u5313"));	// 匓
        assertEquals(JISX0213String.length("\u5313"), 1);
        assertFalse(JISX0213String.isValid("\u5318"));	// 匘
        assertEquals(JISX0213String.length("\u5318"), 1);
        assertFalse(JISX0213String.isValid("\u531B"));	// 匛
        assertEquals(JISX0213String.length("\u531B"), 1);
        assertFalse(JISX0213String.isValid("\u531E"));	// 匞
        assertEquals(JISX0213String.length("\u531E"), 1);
        assertFalse(JISX0213String.isValid("\u531F"));	// 匟
        assertEquals(JISX0213String.length("\u531F"), 1);
        assertFalse(JISX0213String.isValid("\u5325"));	// 匥
        assertEquals(JISX0213String.length("\u5325"), 1);
        assertFalse(JISX0213String.isValid("\u5327"));	// 匧
        assertEquals(JISX0213String.length("\u5327"), 1);
        assertFalse(JISX0213String.isValid("\u5328"));	// 匨
        assertEquals(JISX0213String.length("\u5328"), 1);
        assertFalse(JISX0213String.isValid("\u5329"));	// 匩
        assertEquals(JISX0213String.length("\u5329"), 1);
        assertFalse(JISX0213String.isValid("\u532B"));	// 匫
        assertEquals(JISX0213String.length("\u532B"), 1);
        assertFalse(JISX0213String.isValid("\u532C"));	// 匬
        assertEquals(JISX0213String.length("\u532C"), 1);
        assertFalse(JISX0213String.isValid("\u532D"));	// 匭
        assertEquals(JISX0213String.length("\u532D"), 1);
        assertFalse(JISX0213String.isValid("\u5330"));	// 匰
        assertEquals(JISX0213String.length("\u5330"), 1);
        assertFalse(JISX0213String.isValid("\u5332"));	// 匲
        assertEquals(JISX0213String.length("\u5332"), 1);
        assertFalse(JISX0213String.isValid("\u533C"));	// 匼
        assertEquals(JISX0213String.length("\u533C"), 1);
        assertFalse(JISX0213String.isValid("\u533D"));	// 匽
        assertEquals(JISX0213String.length("\u533D"), 1);
        assertFalse(JISX0213String.isValid("\u534C"));	// 卌
        assertEquals(JISX0213String.length("\u534C"), 1);
        assertFalse(JISX0213String.isValid("\u534B"));	// 卋
        assertEquals(JISX0213String.length("\u534B"), 1);
        assertFalse(JISX0213String.isValid("\u5359"));	// 卙
        assertEquals(JISX0213String.length("\u5359"), 1);
        assertFalse(JISX0213String.isValid("\u535B"));	// 卛
        assertEquals(JISX0213String.length("\u535B"), 1);
        assertFalse(JISX0213String.isValid("\u5365"));	// 卥
        assertEquals(JISX0213String.length("\u5365"), 1);
        assertFalse(JISX0213String.isValid("\u536D"));	// 卭
        assertEquals(JISX0213String.length("\u536D"), 1);
        assertFalse(JISX0213String.isValid("\u5379"));	// 卹
        assertEquals(JISX0213String.length("\u5379"), 1);
        assertFalse(JISX0213String.isValid("\u537E"));	// 卾
        assertEquals(JISX0213String.length("\u537E"), 1);
        assertFalse(JISX0213String.isValid("\u5383"));	// 厃
        assertEquals(JISX0213String.length("\u5383"), 1);
        assertFalse(JISX0213String.isValid("\u5387"));	// 厇
        assertEquals(JISX0213String.length("\u5387"), 1);
        assertFalse(JISX0213String.isValid("\u5388"));	// 厈
        assertEquals(JISX0213String.length("\u5388"), 1);
        assertFalse(JISX0213String.isValid("\u538E"));	// 厎
        assertEquals(JISX0213String.length("\u538E"), 1);
        assertFalse(JISX0213String.isValid("\u5394"));	// 厔
        assertEquals(JISX0213String.length("\u5394"), 1);
        assertFalse(JISX0213String.isValid("\u5399"));	// 厙
        assertEquals(JISX0213String.length("\u5399"), 1);
        assertFalse(JISX0213String.isValid("\u53A1"));	// 厡
        assertEquals(JISX0213String.length("\u53A1"), 1);
        assertFalse(JISX0213String.isValid("\u53AA"));	// 厪
        assertEquals(JISX0213String.length("\u53AA"), 1);
        assertFalse(JISX0213String.isValid("\u53AB"));	// 厫
        assertEquals(JISX0213String.length("\u53AB"), 1);
        assertFalse(JISX0213String.isValid("\u53AF"));	// 厯
        assertEquals(JISX0213String.length("\u53AF"), 1);
        assertFalse(JISX0213String.isValid("\u53B5"));	// 厵
        assertEquals(JISX0213String.length("\u53B5"), 1);
        assertFalse(JISX0213String.isValid("\u53B8"));	// 厸
        assertEquals(JISX0213String.length("\u53B8"), 1);
        assertFalse(JISX0213String.isValid("\u53BA"));	// 厺
        assertEquals(JISX0213String.length("\u53BA"), 1);
        assertFalse(JISX0213String.isValid("\u53BD"));	// 厽
        assertEquals(JISX0213String.length("\u53BD"), 1);
        assertFalse(JISX0213String.isValid("\u53C5"));	// 叅
        assertEquals(JISX0213String.length("\u53C5"), 1);
        assertFalse(JISX0213String.isValid("\u53CF"));	// 叏
        assertEquals(JISX0213String.length("\u53CF"), 1);
        assertFalse(JISX0213String.isValid("\u53D2"));	// 叒
        assertEquals(JISX0213String.length("\u53D2"), 1);
        assertFalse(JISX0213String.isValid("\u53D3"));	// 叓
        assertEquals(JISX0213String.length("\u53D3"), 1);
        assertFalse(JISX0213String.isValid("\u53DE"));	// 叞
        assertEquals(JISX0213String.length("\u53DE"), 1);
        assertFalse(JISX0213String.isValid("\u53E0"));	// 叠
        assertEquals(JISX0213String.length("\u53E0"), 1);
        assertFalse(JISX0213String.isValid("\u53E6"));	// 另
        assertEquals(JISX0213String.length("\u53E6"), 1);
        assertFalse(JISX0213String.isValid("\u53E7"));	// 叧
        assertEquals(JISX0213String.length("\u53E7"), 1);
        assertFalse(JISX0213String.isValid("\u5402"));	// 吂
        assertEquals(JISX0213String.length("\u5402"), 1);
        assertFalse(JISX0213String.isValid("\u5413"));	// 吓
        assertEquals(JISX0213String.length("\u5413"), 1);
        assertFalse(JISX0213String.isValid("\u541A"));	// 吚
        assertEquals(JISX0213String.length("\u541A"), 1);
        assertFalse(JISX0213String.isValid("\u5421"));	// 吡
        assertEquals(JISX0213String.length("\u5421"), 1);
        assertFalse(JISX0213String.isValid("\u542A"));	// 吪
        assertEquals(JISX0213String.length("\u542A"), 1);
        assertFalse(JISX0213String.isValid("\u542F"));	// 启
        assertEquals(JISX0213String.length("\u542F"), 1);
        assertFalse(JISX0213String.isValid("\u5431"));	// 吱
        assertEquals(JISX0213String.length("\u5431"), 1);
        assertFalse(JISX0213String.isValid("\u5434"));	// 吴
        assertEquals(JISX0213String.length("\u5434"), 1);
        assertFalse(JISX0213String.isValid("\u5435"));	// 吵
        assertEquals(JISX0213String.length("\u5435"), 1);
        assertFalse(JISX0213String.isValid("\u5444"));	// 呄
        assertEquals(JISX0213String.length("\u5444"), 1);
        assertFalse(JISX0213String.isValid("\u5447"));	// 呇
        assertEquals(JISX0213String.length("\u5447"), 1);
        assertFalse(JISX0213String.isValid("\u544F"));	// 呏
        assertEquals(JISX0213String.length("\u544F"), 1);
        assertFalse(JISX0213String.isValid("\u545E"));	// 呞
        assertEquals(JISX0213String.length("\u545E"), 1);
        assertFalse(JISX0213String.isValid("\u5464"));	// 呤
        assertEquals(JISX0213String.length("\u5464"), 1);
        assertFalse(JISX0213String.isValid("\u5467"));	// 呧
        assertEquals(JISX0213String.length("\u5467"), 1);
        assertFalse(JISX0213String.isValid("\u5469"));	// 呩
        assertEquals(JISX0213String.length("\u5469"), 1);
        assertFalse(JISX0213String.isValid("\u546D"));	// 呭
        assertEquals(JISX0213String.length("\u546D"), 1);
        assertFalse(JISX0213String.isValid("\u546E"));	// 呮
        assertEquals(JISX0213String.length("\u546E"), 1);
        assertFalse(JISX0213String.isValid("\u5481"));	// 咁
        assertEquals(JISX0213String.length("\u5481"), 1);
        assertFalse(JISX0213String.isValid("\u5483"));	// 咃
        assertEquals(JISX0213String.length("\u5483"), 1);
        assertFalse(JISX0213String.isValid("\u5485"));	// 咅
        assertEquals(JISX0213String.length("\u5485"), 1);
        assertFalse(JISX0213String.isValid("\u5489"));	// 咉
        assertEquals(JISX0213String.length("\u5489"), 1);
        assertFalse(JISX0213String.isValid("\u5491"));	// 咑
        assertEquals(JISX0213String.length("\u5491"), 1);
        assertFalse(JISX0213String.isValid("\u549F"));	// 咟
        assertEquals(JISX0213String.length("\u549F"), 1);
        assertFalse(JISX0213String.isValid("\u54A7"));	// 咧
        assertEquals(JISX0213String.length("\u54A7"), 1);
        assertFalse(JISX0213String.isValid("\u54AA"));	// 咪
        assertEquals(JISX0213String.length("\u54AA"), 1);
        assertFalse(JISX0213String.isValid("\u54B1"));	// 咱
        assertEquals(JISX0213String.length("\u54B1"), 1);
        assertFalse(JISX0213String.isValid("\u54B9"));	// 咹
        assertEquals(JISX0213String.length("\u54B9"), 1);
        assertFalse(JISX0213String.isValid("\u54BB"));	// 咻
        assertEquals(JISX0213String.length("\u54BB"), 1);
        assertFalse(JISX0213String.isValid("\u54CA"));	// 哊
        assertEquals(JISX0213String.length("\u54CA"), 1);
        assertFalse(JISX0213String.isValid("\u54CD"));	// 响
        assertEquals(JISX0213String.length("\u54CD"), 1);
        assertFalse(JISX0213String.isValid("\u54CE"));	// 哎
        assertEquals(JISX0213String.length("\u54CE"), 1);
        assertFalse(JISX0213String.isValid("\u54E0"));	// 哠
        assertEquals(JISX0213String.length("\u54E0"), 1);
        assertFalse(JISX0213String.isValid("\u54EA"));	// 哪
        assertEquals(JISX0213String.length("\u54EA"), 1);
        assertFalse(JISX0213String.isValid("\u54F6"));	// 哶
        assertEquals(JISX0213String.length("\u54F6"), 1);
        assertFalse(JISX0213String.isValid("\u54FC"));	// 哼
        assertEquals(JISX0213String.length("\u54FC"), 1);
        assertFalse(JISX0213String.isValid("\u54FE"));	// 哾
        assertEquals(JISX0213String.length("\u54FE"), 1);
        assertFalse(JISX0213String.isValid("\u5505"));	// 唅
        assertEquals(JISX0213String.length("\u5505"), 1);
        assertFalse(JISX0213String.isValid("\u5508"));	// 唈
        assertEquals(JISX0213String.length("\u5508"), 1);
        assertFalse(JISX0213String.isValid("\u550C"));	// 唌
        assertEquals(JISX0213String.length("\u550C"), 1);
        assertFalse(JISX0213String.isValid("\u550D"));	// 唍
        assertEquals(JISX0213String.length("\u550D"), 1);
        assertFalse(JISX0213String.isValid("\u5515"));	// 唕
        assertEquals(JISX0213String.length("\u5515"), 1);
        assertFalse(JISX0213String.isValid("\u552A"));	// 唪
        assertEquals(JISX0213String.length("\u552A"), 1);
        assertFalse(JISX0213String.isValid("\u5532"));	// 唲
        assertEquals(JISX0213String.length("\u5532"), 1);
        assertFalse(JISX0213String.isValid("\u5536"));	// 唶
        assertEquals(JISX0213String.length("\u5536"), 1);
        assertFalse(JISX0213String.isValid("\u553B"));	// 唻
        assertEquals(JISX0213String.length("\u553B"), 1);
        assertFalse(JISX0213String.isValid("\u553D"));	// 唽
        assertEquals(JISX0213String.length("\u553D"), 1);
        assertFalse(JISX0213String.isValid("\u5549"));	// 啉
        assertEquals(JISX0213String.length("\u5549"), 1);
        assertFalse(JISX0213String.isValid("\u554D"));	// 啍
        assertEquals(JISX0213String.length("\u554D"), 1);
        assertFalse(JISX0213String.isValid("\u5551"));	// 啑
        assertEquals(JISX0213String.length("\u5551"), 1);
        assertFalse(JISX0213String.isValid("\u5558"));	// 啘
        assertEquals(JISX0213String.length("\u5558"), 1);
        assertFalse(JISX0213String.isValid("\u555A"));	// 啚
        assertEquals(JISX0213String.length("\u555A"), 1);
        assertFalse(JISX0213String.isValid("\u555B"));	// 啛
        assertEquals(JISX0213String.length("\u555B"), 1);
        assertFalse(JISX0213String.isValid("\u5566"));	// 啦
        assertEquals(JISX0213String.length("\u5566"), 1);
        assertFalse(JISX0213String.isValid("\u557F"));	// 啿
        assertEquals(JISX0213String.length("\u557F"), 1);
        assertFalse(JISX0213String.isValid("\u558F"));	// 喏
        assertEquals(JISX0213String.length("\u558F"), 1);
        assertFalse(JISX0213String.isValid("\u5592"));	// 喒
        assertEquals(JISX0213String.length("\u5592"), 1);
        assertFalse(JISX0213String.isValid("\u5593"));	// 喓
        assertEquals(JISX0213String.length("\u5593"), 1);
        assertFalse(JISX0213String.isValid("\u5594"));	// 喔
        assertEquals(JISX0213String.length("\u5594"), 1);
        assertFalse(JISX0213String.isValid("\u5597"));	// 喗
        assertEquals(JISX0213String.length("\u5597"), 1);
        assertFalse(JISX0213String.isValid("\u55A3"));	// 喣
        assertEquals(JISX0213String.length("\u55A3"), 1);
        assertFalse(JISX0213String.isValid("\u55A4"));	// 喤
        assertEquals(JISX0213String.length("\u55A4"), 1);
        assertFalse(JISX0213String.isValid("\u55B2"));	// 喲
        assertEquals(JISX0213String.length("\u55B2"), 1);
        assertFalse(JISX0213String.isValid("\u55C1"));	// 嗁
        assertEquals(JISX0213String.length("\u55C1"), 1);
        assertFalse(JISX0213String.isValid("\u55C3"));	// 嗃
        assertEquals(JISX0213String.length("\u55C3"), 1);
        assertFalse(JISX0213String.isValid("\u55C6"));	// 嗆
        assertEquals(JISX0213String.length("\u55C6"), 1);
        assertFalse(JISX0213String.isValid("\u55CB"));	// 嗋
        assertEquals(JISX0213String.length("\u55CB"), 1);
        assertFalse(JISX0213String.isValid("\u55D3"));	// 嗓
        assertEquals(JISX0213String.length("\u55D3"), 1);
        assertFalse(JISX0213String.isValid("\u55D7"));	// 嗗
        assertEquals(JISX0213String.length("\u55D7"), 1);
        assertFalse(JISX0213String.isValid("\u55D8"));	// 嗘
        assertEquals(JISX0213String.length("\u55D8"), 1);
        assertFalse(JISX0213String.isValid("\u55DB"));	// 嗛
        assertEquals(JISX0213String.length("\u55DB"), 1);
        assertFalse(JISX0213String.isValid("\u55DE"));	// 嗞
        assertEquals(JISX0213String.length("\u55DE"), 1);
        assertFalse(JISX0213String.isValid("\u55F6"));	// 嗶
        assertEquals(JISX0213String.length("\u55F6"), 1);
        assertFalse(JISX0213String.isValid("\u55FF"));	// 嗿
        assertEquals(JISX0213String.length("\u55FF"), 1);
        assertFalse(JISX0213String.isValid("\u5605"));	// 嘅
        assertEquals(JISX0213String.length("\u5605"), 1);
        assertFalse(JISX0213String.isValid("\u560A"));	// 嘊
        assertEquals(JISX0213String.length("\u560A"), 1);
        assertFalse(JISX0213String.isValid("\u560D"));	// 嘍
        assertEquals(JISX0213String.length("\u560D"), 1);
        assertFalse(JISX0213String.isValid("\u560F"));	// 嘏
        assertEquals(JISX0213String.length("\u560F"), 1);
        assertFalse(JISX0213String.isValid("\u5611"));	// 嘑
        assertEquals(JISX0213String.length("\u5611"), 1);
        assertFalse(JISX0213String.isValid("\u5612"));	// 嘒
        assertEquals(JISX0213String.length("\u5612"), 1);
        assertFalse(JISX0213String.isValid("\u5619"));	// 嘙
        assertEquals(JISX0213String.length("\u5619"), 1);
        assertFalse(JISX0213String.isValid("\u562C"));	// 嘬
        assertEquals(JISX0213String.length("\u562C"), 1);
        assertFalse(JISX0213String.isValid("\u5633"));	// 嘳
        assertEquals(JISX0213String.length("\u5633"), 1);
        assertFalse(JISX0213String.isValid("\u5635"));	// 嘵
        assertEquals(JISX0213String.length("\u5635"), 1);
        assertFalse(JISX0213String.isValid("\u5639"));	// 嘹
        assertEquals(JISX0213String.length("\u5639"), 1);
        assertFalse(JISX0213String.isValid("\u563C"));	// 嘼
        assertEquals(JISX0213String.length("\u563C"), 1);
        assertFalse(JISX0213String.isValid("\u5641"));	// 噁
        assertEquals(JISX0213String.length("\u5641"), 1);
        assertFalse(JISX0213String.isValid("\u5643"));	// 噃
        assertEquals(JISX0213String.length("\u5643"), 1);
        assertFalse(JISX0213String.isValid("\u5644"));	// 噄
        assertEquals(JISX0213String.length("\u5644"), 1);
        assertFalse(JISX0213String.isValid("\u5646"));	// 噆
        assertEquals(JISX0213String.length("\u5646"), 1);
        assertFalse(JISX0213String.isValid("\u564B"));	// 噋
        assertEquals(JISX0213String.length("\u564B"), 1);
        assertFalse(JISX0213String.isValid("\u564D"));	// 噍
        assertEquals(JISX0213String.length("\u564D"), 1);
        assertFalse(JISX0213String.isValid("\u564F"));	// 噏
        assertEquals(JISX0213String.length("\u564F"), 1);
        assertFalse(JISX0213String.isValid("\u5654"));	// 噔
        assertEquals(JISX0213String.length("\u5654"), 1);
        assertFalse(JISX0213String.isValid("\u5661"));	// 噡
        assertEquals(JISX0213String.length("\u5661"), 1);
        assertFalse(JISX0213String.isValid("\u5662"));	// 噢
        assertEquals(JISX0213String.length("\u5662"), 1);
        assertFalse(JISX0213String.isValid("\u5663"));	// 噣
        assertEquals(JISX0213String.length("\u5663"), 1);
        assertFalse(JISX0213String.isValid("\u5669"));	// 噩
        assertEquals(JISX0213String.length("\u5669"), 1);
        assertFalse(JISX0213String.isValid("\u5675"));	// 噵
        assertEquals(JISX0213String.length("\u5675"), 1);
        assertFalse(JISX0213String.isValid("\u5684"));	// 嚄
        assertEquals(JISX0213String.length("\u5684"), 1);
        assertFalse(JISX0213String.isValid("\u5685"));	// 嚅
        assertEquals(JISX0213String.length("\u5685"), 1);
        assertFalse(JISX0213String.isValid("\u568B"));	// 嚋
        assertEquals(JISX0213String.length("\u568B"), 1);
        assertFalse(JISX0213String.isValid("\u569F"));	// 嚟
        assertEquals(JISX0213String.length("\u569F"), 1);
        assertFalse(JISX0213String.isValid("\u56A6"));	// 嚦
        assertEquals(JISX0213String.length("\u56A6"), 1);
        assertFalse(JISX0213String.isValid("\u56A7"));	// 嚧
        assertEquals(JISX0213String.length("\u56A7"), 1);
        assertFalse(JISX0213String.isValid("\u56AB"));	// 嚫
        assertEquals(JISX0213String.length("\u56AB"), 1);
        assertFalse(JISX0213String.isValid("\u56B1"));	// 嚱
        assertEquals(JISX0213String.length("\u56B1"), 1);
        assertFalse(JISX0213String.isValid("\u56B7"));	// 嚷
        assertEquals(JISX0213String.length("\u56B7"), 1);
        assertFalse(JISX0213String.isValid("\u56BE"));	// 嚾
        assertEquals(JISX0213String.length("\u56BE"), 1);
        assertFalse(JISX0213String.isValid("\u56CB"));	// 囋
        assertEquals(JISX0213String.length("\u56CB"), 1);
        assertFalse(JISX0213String.isValid("\u56CF"));	// 囏
        assertEquals(JISX0213String.length("\u56CF"), 1);
        assertFalse(JISX0213String.isValid("\u56D0"));	// 囐
        assertEquals(JISX0213String.length("\u56D0"), 1);
        assertFalse(JISX0213String.isValid("\u56CC"));	// 囌
        assertEquals(JISX0213String.length("\u56CC"), 1);
        assertFalse(JISX0213String.isValid("\u56D9"));	// 囙
        assertEquals(JISX0213String.length("\u56D9"), 1);
        assertFalse(JISX0213String.isValid("\u56DC"));	// 囜
        assertEquals(JISX0213String.length("\u56DC"), 1);
        assertFalse(JISX0213String.isValid("\u56DD"));	// 囝
        assertEquals(JISX0213String.length("\u56DD"), 1);
        assertFalse(JISX0213String.isValid("\u56E1"));	// 囡
        assertEquals(JISX0213String.length("\u56E1"), 1);
        assertFalse(JISX0213String.isValid("\u56E4"));	// 囤
        assertEquals(JISX0213String.length("\u56E4"), 1);
        assertFalse(JISX0213String.isValid("\u56E5"));	// 囥
        assertEquals(JISX0213String.length("\u56E5"), 1);
        assertFalse(JISX0213String.isValid("\u56E6"));	// 囦
        assertEquals(JISX0213String.length("\u56E6"), 1);
        assertFalse(JISX0213String.isValid("\u56E7"));	// 囧
        assertEquals(JISX0213String.length("\u56E7"), 1);
        assertFalse(JISX0213String.isValid("\u56F1"));	// 囱
        assertEquals(JISX0213String.length("\u56F1"), 1);
        assertFalse(JISX0213String.isValid("\u56EB"));	// 囫
        assertEquals(JISX0213String.length("\u56EB"), 1);
        assertFalse(JISX0213String.isValid("\u56ED"));	// 园
        assertEquals(JISX0213String.length("\u56ED"), 1);
        assertFalse(JISX0213String.isValid("\u5701"));	// 圁
        assertEquals(JISX0213String.length("\u5701"), 1);
        assertFalse(JISX0213String.isValid("\u5702"));	// 圂
        assertEquals(JISX0213String.length("\u5702"), 1);
        assertFalse(JISX0213String.isValid("\u5707"));	// 圇
        assertEquals(JISX0213String.length("\u5707"), 1);
        assertFalse(JISX0213String.isValid("\u570C"));	// 圌
        assertEquals(JISX0213String.length("\u570C"), 1);
        assertFalse(JISX0213String.isValid("\u5711"));	// 圑
        assertEquals(JISX0213String.length("\u5711"), 1);
        assertFalse(JISX0213String.isValid("\u571A"));	// 圚
        assertEquals(JISX0213String.length("\u571A"), 1);
        assertFalse(JISX0213String.isValid("\u571B"));	// 圛
        assertEquals(JISX0213String.length("\u571B"), 1);
        assertFalse(JISX0213String.isValid("\u571D"));	// 圝
        assertEquals(JISX0213String.length("\u571D"), 1);
        assertFalse(JISX0213String.isValid("\u5720"));	// 圠
        assertEquals(JISX0213String.length("\u5720"), 1);
        assertFalse(JISX0213String.isValid("\u5722"));	// 圢
        assertEquals(JISX0213String.length("\u5722"), 1);
        assertFalse(JISX0213String.isValid("\u5724"));	// 圤
        assertEquals(JISX0213String.length("\u5724"), 1);
        assertFalse(JISX0213String.isValid("\u5725"));	// 圥
        assertEquals(JISX0213String.length("\u5725"), 1);
        assertFalse(JISX0213String.isValid("\u572A"));	// 圪
        assertEquals(JISX0213String.length("\u572A"), 1);
        assertFalse(JISX0213String.isValid("\u572C"));	// 圬
        assertEquals(JISX0213String.length("\u572C"), 1);
        assertFalse(JISX0213String.isValid("\u572E"));	// 圮
        assertEquals(JISX0213String.length("\u572E"), 1);
        assertFalse(JISX0213String.isValid("\u573D"));	// 圽
        assertEquals(JISX0213String.length("\u573D"), 1);
        assertFalse(JISX0213String.isValid("\u573E"));	// 圾
        assertEquals(JISX0213String.length("\u573E"), 1);
        assertFalse(JISX0213String.isValid("\u573F"));	// 圿
        assertEquals(JISX0213String.length("\u573F"), 1);
        assertFalse(JISX0213String.isValid("\u5752"));	// 坒
        assertEquals(JISX0213String.length("\u5752"), 1);
        assertFalse(JISX0213String.isValid("\u5762"));	// 坢
        assertEquals(JISX0213String.length("\u5762"), 1);
        assertFalse(JISX0213String.isValid("\u5767"));	// 坧
        assertEquals(JISX0213String.length("\u5767"), 1);
        assertFalse(JISX0213String.isValid("\u576B"));	// 坫
        assertEquals(JISX0213String.length("\u576B"), 1);
        assertFalse(JISX0213String.isValid("\u576D"));	// 坭
        assertEquals(JISX0213String.length("\u576D"), 1);
        assertFalse(JISX0213String.isValid("\u576E"));	// 坮
        assertEquals(JISX0213String.length("\u576E"), 1);
        assertFalse(JISX0213String.isValid("\u5771"));	// 坱
        assertEquals(JISX0213String.length("\u5771"), 1);
        assertFalse(JISX0213String.isValid("\u5779"));	// 坹
        assertEquals(JISX0213String.length("\u5779"), 1);
        assertFalse(JISX0213String.isValid("\u577A"));	// 坺
        assertEquals(JISX0213String.length("\u577A"), 1);
        assertFalse(JISX0213String.isValid("\u577E"));	// 坾
        assertEquals(JISX0213String.length("\u577E"), 1);
        assertFalse(JISX0213String.isValid("\u5781"));	// 垁
        assertEquals(JISX0213String.length("\u5781"), 1);
        assertFalse(JISX0213String.isValid("\u5783"));	// 垃
        assertEquals(JISX0213String.length("\u5783"), 1);
        assertFalse(JISX0213String.isValid("\u578C"));	// 垌
        assertEquals(JISX0213String.length("\u578C"), 1);
        assertFalse(JISX0213String.isValid("\u5794"));	// 垔
        assertEquals(JISX0213String.length("\u5794"), 1);
        assertFalse(JISX0213String.isValid("\u5797"));	// 垗
        assertEquals(JISX0213String.length("\u5797"), 1);
        assertFalse(JISX0213String.isValid("\u5799"));	// 垙
        assertEquals(JISX0213String.length("\u5799"), 1);
        assertFalse(JISX0213String.isValid("\u579F"));	// 垟
        assertEquals(JISX0213String.length("\u579F"), 1);
        assertFalse(JISX0213String.isValid("\u57A1"));	// 垡
        assertEquals(JISX0213String.length("\u57A1"), 1);
        assertFalse(JISX0213String.isValid("\u5795"));	// 垕
        assertEquals(JISX0213String.length("\u5795"), 1);
        assertFalse(JISX0213String.isValid("\u57A7"));	// 垧
        assertEquals(JISX0213String.length("\u57A7"), 1);
        assertFalse(JISX0213String.isValid("\u57A9"));	// 垩
        assertEquals(JISX0213String.length("\u57A9"), 1);
        assertFalse(JISX0213String.isValid("\u57BD"));	// 垽
        assertEquals(JISX0213String.length("\u57BD"), 1);
        assertFalse(JISX0213String.isValid("\u57D5"));	// 埕
        assertEquals(JISX0213String.length("\u57D5"), 1);
        assertFalse(JISX0213String.isValid("\u57DD"));	// 埝
        assertEquals(JISX0213String.length("\u57DD"), 1);
        assertFalse(JISX0213String.isValid("\u57E7"));	// 埧
        assertEquals(JISX0213String.length("\u57E7"), 1);
        assertFalse(JISX0213String.isValid("\u57E9"));	// 埩
        assertEquals(JISX0213String.length("\u57E9"), 1);
        assertFalse(JISX0213String.isValid("\u57FE"));	// 埾
        assertEquals(JISX0213String.length("\u57FE"), 1);
        assertFalse(JISX0213String.isValid("\u5803"));	// 堃
        assertEquals(JISX0213String.length("\u5803"), 1);
        assertFalse(JISX0213String.isValid("\u5808"));	// 堈
        assertEquals(JISX0213String.length("\u5808"), 1);
        assertFalse(JISX0213String.isValid("\u57E1"));	// 埡
        assertEquals(JISX0213String.length("\u57E1"), 1);
        assertFalse(JISX0213String.isValid("\u580C"));	// 堌
        assertEquals(JISX0213String.length("\u580C"), 1);
        assertFalse(JISX0213String.isValid("\u580D"));	// 堍
        assertEquals(JISX0213String.length("\u580D"), 1);
        assertFalse(JISX0213String.isValid("\u581B"));	// 堛
        assertEquals(JISX0213String.length("\u581B"), 1);
        assertFalse(JISX0213String.isValid("\u581F"));	// 堟
        assertEquals(JISX0213String.length("\u581F"), 1);
        assertFalse(JISX0213String.isValid("\u5826"));	// 堦
        assertEquals(JISX0213String.length("\u5826"), 1);
        assertFalse(JISX0213String.isValid("\u582D"));	// 堭
        assertEquals(JISX0213String.length("\u582D"), 1);
        assertFalse(JISX0213String.isValid("\u583F"));	// 堿
        assertEquals(JISX0213String.length("\u583F"), 1);
        assertFalse(JISX0213String.isValid("\u584D"));	// 塍
        assertEquals(JISX0213String.length("\u584D"), 1);
        assertFalse(JISX0213String.isValid("\u584F"));	// 塏
        assertEquals(JISX0213String.length("\u584F"), 1);
        assertFalse(JISX0213String.isValid("\u5850"));	// 塐
        assertEquals(JISX0213String.length("\u5850"), 1);
        assertFalse(JISX0213String.isValid("\u5855"));	// 塕
        assertEquals(JISX0213String.length("\u5855"), 1);
        assertFalse(JISX0213String.isValid("\u585F"));	// 塟
        assertEquals(JISX0213String.length("\u585F"), 1);
        assertFalse(JISX0213String.isValid("\u5868"));	// 塨
        assertEquals(JISX0213String.length("\u5868"), 1);
        assertFalse(JISX0213String.isValid("\u5878"));	// 塸
        assertEquals(JISX0213String.length("\u5878"), 1);
        assertFalse(JISX0213String.isValid("\u587F"));	// 塿
        assertEquals(JISX0213String.length("\u587F"), 1);
        assertFalse(JISX0213String.isValid("\u5880"));	// 墀
        assertEquals(JISX0213String.length("\u5880"), 1);
        assertFalse(JISX0213String.isValid("\u5881"));	// 墁
        assertEquals(JISX0213String.length("\u5881"), 1);
        assertFalse(JISX0213String.isValid("\u5887"));	// 墇
        assertEquals(JISX0213String.length("\u5887"), 1);
        assertFalse(JISX0213String.isValid("\u5888"));	// 墈
        assertEquals(JISX0213String.length("\u5888"), 1);
        assertFalse(JISX0213String.isValid("\u588C"));	// 墌
        assertEquals(JISX0213String.length("\u588C"), 1);
        assertFalse(JISX0213String.isValid("\u5896"));	// 墖
        assertEquals(JISX0213String.length("\u5896"), 1);
        assertFalse(JISX0213String.isValid("\u58A0"));	// 墠
        assertEquals(JISX0213String.length("\u58A0"), 1);
        assertFalse(JISX0213String.isValid("\u58A1"));	// 墡
        assertEquals(JISX0213String.length("\u58A1"), 1);
        assertFalse(JISX0213String.isValid("\u58A2"));	// 墢
        assertEquals(JISX0213String.length("\u58A2"), 1);
        assertFalse(JISX0213String.isValid("\u58A6"));	// 墦
        assertEquals(JISX0213String.length("\u58A6"), 1);
        assertFalse(JISX0213String.isValid("\u58C4"));	// 壄
        assertEquals(JISX0213String.length("\u58C4"), 1);
        assertFalse(JISX0213String.isValid("\u58BC"));	// 墼
        assertEquals(JISX0213String.length("\u58BC"), 1);
        assertFalse(JISX0213String.isValid("\u58C2"));	// 壂
        assertEquals(JISX0213String.length("\u58C2"), 1);
        assertFalse(JISX0213String.isValid("\u58C8"));	// 壈
        assertEquals(JISX0213String.length("\u58C8"), 1);
        assertFalse(JISX0213String.isValid("\u58D0"));	// 壐
        assertEquals(JISX0213String.length("\u58D0"), 1);
        assertFalse(JISX0213String.isValid("\u58D6"));	// 壖
        assertEquals(JISX0213String.length("\u58D6"), 1);
        assertFalse(JISX0213String.isValid("\u58DD"));	// 壝
        assertEquals(JISX0213String.length("\u58DD"), 1);
        assertFalse(JISX0213String.isValid("\u58E1"));	// 壡
        assertEquals(JISX0213String.length("\u58E1"), 1);
        assertFalse(JISX0213String.isValid("\u5912"));	// 夒
        assertEquals(JISX0213String.length("\u5912"), 1);
        assertFalse(JISX0213String.isValid("\u5913"));	// 夓
        assertEquals(JISX0213String.length("\u5913"), 1);
        assertFalse(JISX0213String.isValid("\u591D"));	// 夝
        assertEquals(JISX0213String.length("\u591D"), 1);
        assertFalse(JISX0213String.isValid("\u5921"));	// 夡
        assertEquals(JISX0213String.length("\u5921"), 1);
        assertFalse(JISX0213String.isValid("\u5923"));	// 夣
        assertEquals(JISX0213String.length("\u5923"), 1);
        assertFalse(JISX0213String.isValid("\u5928"));	// 夨
        assertEquals(JISX0213String.length("\u5928"), 1);
        assertFalse(JISX0213String.isValid("\u592F"));	// 夯
        assertEquals(JISX0213String.length("\u592F"), 1);
        assertFalse(JISX0213String.isValid("\u5930"));	// 夰
        assertEquals(JISX0213String.length("\u5930"), 1);
        assertFalse(JISX0213String.isValid("\u5933"));	// 夳
        assertEquals(JISX0213String.length("\u5933"), 1);
        assertFalse(JISX0213String.isValid("\u5935"));	// 夵
        assertEquals(JISX0213String.length("\u5935"), 1);
        assertFalse(JISX0213String.isValid("\u5936"));	// 夶
        assertEquals(JISX0213String.length("\u5936"), 1);
        assertFalse(JISX0213String.isValid("\u593F"));	// 夿
        assertEquals(JISX0213String.length("\u593F"), 1);
        assertFalse(JISX0213String.isValid("\u5943"));	// 奃
        assertEquals(JISX0213String.length("\u5943"), 1);
        assertFalse(JISX0213String.isValid("\u5952"));	// 奒
        assertEquals(JISX0213String.length("\u5952"), 1);
        assertFalse(JISX0213String.isValid("\u5959"));	// 奙
        assertEquals(JISX0213String.length("\u5959"), 1);
        assertFalse(JISX0213String.isValid("\u595E"));	// 奞
        assertEquals(JISX0213String.length("\u595E"), 1);
        assertFalse(JISX0213String.isValid("\u5961"));	// 奡
        assertEquals(JISX0213String.length("\u5961"), 1);
        assertFalse(JISX0213String.isValid("\u596B"));	// 奫
        assertEquals(JISX0213String.length("\u596B"), 1);
        assertFalse(JISX0213String.isValid("\u596F"));	// 奯
        assertEquals(JISX0213String.length("\u596F"), 1);
        assertFalse(JISX0213String.isValid("\u5972"));	// 奲
        assertEquals(JISX0213String.length("\u5972"), 1);
        assertFalse(JISX0213String.isValid("\u5979"));	// 她
        assertEquals(JISX0213String.length("\u5979"), 1);
        assertFalse(JISX0213String.isValid("\u597B"));	// 奻
        assertEquals(JISX0213String.length("\u597B"), 1);
        assertFalse(JISX0213String.isValid("\u598C"));	// 妌
        assertEquals(JISX0213String.length("\u598C"), 1);
        assertFalse(JISX0213String.isValid("\u598E"));	// 妎
        assertEquals(JISX0213String.length("\u598E"), 1);
        assertFalse(JISX0213String.isValid("\u5995"));	// 妕
        assertEquals(JISX0213String.length("\u5995"), 1);
        assertFalse(JISX0213String.isValid("\u5997"));	// 妗
        assertEquals(JISX0213String.length("\u5997"), 1);
        assertFalse(JISX0213String.isValid("\u59A7"));	// 妧
        assertEquals(JISX0213String.length("\u59A7"), 1);
        assertFalse(JISX0213String.isValid("\u59AD"));	// 妭
        assertEquals(JISX0213String.length("\u59AD"), 1);
        assertFalse(JISX0213String.isValid("\u59AF"));	// 妯
        assertEquals(JISX0213String.length("\u59AF"), 1);
        assertFalse(JISX0213String.isValid("\u59B0"));	// 妰
        assertEquals(JISX0213String.length("\u59B0"), 1);
        assertFalse(JISX0213String.isValid("\u59B3"));	// 妳
        assertEquals(JISX0213String.length("\u59B3"), 1);
        assertFalse(JISX0213String.isValid("\u59B7"));	// 妷
        assertEquals(JISX0213String.length("\u59B7"), 1);
        assertFalse(JISX0213String.isValid("\u59C1"));	// 姁
        assertEquals(JISX0213String.length("\u59C1"), 1);
        assertFalse(JISX0213String.isValid("\u59C4"));	// 姄
        assertEquals(JISX0213String.length("\u59C4"), 1);
        assertFalse(JISX0213String.isValid("\u59CA"));	// 姊
        assertEquals(JISX0213String.length("\u59CA"), 1);
        assertFalse(JISX0213String.isValid("\u59DF"));	// 姟
        assertEquals(JISX0213String.length("\u59DF"), 1);
        assertFalse(JISX0213String.isValid("\u59EF"));	// 姯
        assertEquals(JISX0213String.length("\u59EF"), 1);
        assertFalse(JISX0213String.isValid("\u59F1"));	// 姱
        assertEquals(JISX0213String.length("\u59F1"), 1);
        assertFalse(JISX0213String.isValid("\u59F2"));	// 姲
        assertEquals(JISX0213String.length("\u59F2"), 1);
        assertFalse(JISX0213String.isValid("\u59F4"));	// 姴
        assertEquals(JISX0213String.length("\u59F4"), 1);
        assertFalse(JISX0213String.isValid("\u59F7"));	// 姷
        assertEquals(JISX0213String.length("\u59F7"), 1);
        assertFalse(JISX0213String.isValid("\u5A00"));	// 娀
        assertEquals(JISX0213String.length("\u5A00"), 1);
        assertFalse(JISX0213String.isValid("\u5A04"));	// 娄
        assertEquals(JISX0213String.length("\u5A04"), 1);
        assertFalse(JISX0213String.isValid("\u5A0E"));	// 娎
        assertEquals(JISX0213String.length("\u5A0E"), 1);
        assertFalse(JISX0213String.isValid("\u5A12"));	// 娒
        assertEquals(JISX0213String.length("\u5A12"), 1);
        assertFalse(JISX0213String.isValid("\u5A1E"));	// 娞
        assertEquals(JISX0213String.length("\u5A1E"), 1);
        assertFalse(JISX0213String.isValid("\u5A24"));	// 娤
        assertEquals(JISX0213String.length("\u5A24"), 1);
        assertFalse(JISX0213String.isValid("\u5A28"));	// 娨
        assertEquals(JISX0213String.length("\u5A28"), 1);
        assertFalse(JISX0213String.isValid("\u5A2A"));	// 娪
        assertEquals(JISX0213String.length("\u5A2A"), 1);
        assertFalse(JISX0213String.isValid("\u5A30"));	// 娰
        assertEquals(JISX0213String.length("\u5A30"), 1);
        assertFalse(JISX0213String.isValid("\u5A44"));	// 婄
        assertEquals(JISX0213String.length("\u5A44"), 1);
        assertFalse(JISX0213String.isValid("\u5A45"));	// 婅
        assertEquals(JISX0213String.length("\u5A45"), 1);
        assertFalse(JISX0213String.isValid("\u5A47"));	// 婇
        assertEquals(JISX0213String.length("\u5A47"), 1);
        assertFalse(JISX0213String.isValid("\u5A48"));	// 婈
        assertEquals(JISX0213String.length("\u5A48"), 1);
        assertFalse(JISX0213String.isValid("\u5A4C"));	// 婌
        assertEquals(JISX0213String.length("\u5A4C"), 1);
        assertFalse(JISX0213String.isValid("\u5A50"));	// 婐
        assertEquals(JISX0213String.length("\u5A50"), 1);
        assertFalse(JISX0213String.isValid("\u5A5E"));	// 婞
        assertEquals(JISX0213String.length("\u5A5E"), 1);
        assertFalse(JISX0213String.isValid("\u5A63"));	// 婣
        assertEquals(JISX0213String.length("\u5A63"), 1);
        assertFalse(JISX0213String.isValid("\u5A7B"));	// 婻
        assertEquals(JISX0213String.length("\u5A7B"), 1);
        assertFalse(JISX0213String.isValid("\u5A90"));	// 媐
        assertEquals(JISX0213String.length("\u5A90"), 1);
        assertFalse(JISX0213String.isValid("\u5A93"));	// 媓
        assertEquals(JISX0213String.length("\u5A93"), 1);
        assertFalse(JISX0213String.isValid("\u5A96"));	// 媖
        assertEquals(JISX0213String.length("\u5A96"), 1);
        assertFalse(JISX0213String.isValid("\u5A99"));	// 媙
        assertEquals(JISX0213String.length("\u5A99"), 1);
        assertFalse(JISX0213String.isValid("\u5AAC"));	// 媬
        assertEquals(JISX0213String.length("\u5AAC"), 1);
        assertFalse(JISX0213String.isValid("\u5AB2"));	// 媲
        assertEquals(JISX0213String.length("\u5AB2"), 1);
        assertFalse(JISX0213String.isValid("\u5AB8"));	// 媸
        assertEquals(JISX0213String.length("\u5AB8"), 1);
        assertFalse(JISX0213String.isValid("\u5ABB"));	// 媻
        assertEquals(JISX0213String.length("\u5ABB"), 1);
        assertFalse(JISX0213String.isValid("\u5AC6"));	// 嫆
        assertEquals(JISX0213String.length("\u5AC6"), 1);
        assertFalse(JISX0213String.isValid("\u5AC8"));	// 嫈
        assertEquals(JISX0213String.length("\u5AC8"), 1);
        assertFalse(JISX0213String.isValid("\u5ACF"));	// 嫏
        assertEquals(JISX0213String.length("\u5ACF"), 1);
        assertFalse(JISX0213String.isValid("\u5AEA"));	// 嫪
        assertEquals(JISX0213String.length("\u5AEA"), 1);
        assertFalse(JISX0213String.isValid("\u5AF6"));	// 嫶
        assertEquals(JISX0213String.length("\u5AF6"), 1);
        assertFalse(JISX0213String.isValid("\u5AFD"));	// 嫽
        assertEquals(JISX0213String.length("\u5AFD"), 1);
        assertFalse(JISX0213String.isValid("\u5B01"));	// 嬁
        assertEquals(JISX0213String.length("\u5B01"), 1);
        assertFalse(JISX0213String.isValid("\u5B1B"));	// 嬛
        assertEquals(JISX0213String.length("\u5B1B"), 1);
        assertFalse(JISX0213String.isValid("\u5B1D"));	// 嬝
        assertEquals(JISX0213String.length("\u5B1D"), 1);
        assertFalse(JISX0213String.isValid("\u5B21"));	// 嬡
        assertEquals(JISX0213String.length("\u5B21"), 1);
        assertFalse(JISX0213String.isValid("\u5B38"));	// 嬸
        assertEquals(JISX0213String.length("\u5B38"), 1);
        assertFalse(JISX0213String.isValid("\u5B4B"));	// 孋
        assertEquals(JISX0213String.length("\u5B4B"), 1);
        assertFalse(JISX0213String.isValid("\u5B5E"));	// 孞
        assertEquals(JISX0213String.length("\u5B5E"), 1);
        assertFalse(JISX0213String.isValid("\u5B6E"));	// 孮
        assertEquals(JISX0213String.length("\u5B6E"), 1);
        assertFalse(JISX0213String.isValid("\u5B7E"));	// 孾
        assertEquals(JISX0213String.length("\u5B7E"), 1);
        assertFalse(JISX0213String.isValid("\u5B86"));	// 宆
        assertEquals(JISX0213String.length("\u5B86"), 1);
        assertFalse(JISX0213String.isValid("\u5B8A"));	// 宊
        assertEquals(JISX0213String.length("\u5B8A"), 1);
        assertFalse(JISX0213String.isValid("\u5B8E"));	// 宎
        assertEquals(JISX0213String.length("\u5B8E"), 1);
        assertFalse(JISX0213String.isValid("\u5B90"));	// 宐
        assertEquals(JISX0213String.length("\u5B90"), 1);
        assertFalse(JISX0213String.isValid("\u5B91"));	// 宑
        assertEquals(JISX0213String.length("\u5B91"), 1);
        assertFalse(JISX0213String.isValid("\u5B94"));	// 宔
        assertEquals(JISX0213String.length("\u5B94"), 1);
        assertFalse(JISX0213String.isValid("\u5BA8"));	// 宨
        assertEquals(JISX0213String.length("\u5BA8"), 1);
        assertFalse(JISX0213String.isValid("\u5BA9"));	// 宩
        assertEquals(JISX0213String.length("\u5BA9"), 1);
        assertFalse(JISX0213String.isValid("\u5BAD"));	// 宭
        assertEquals(JISX0213String.length("\u5BAD"), 1);
        assertFalse(JISX0213String.isValid("\u5BAF"));	// 宯
        assertEquals(JISX0213String.length("\u5BAF"), 1);
        assertFalse(JISX0213String.isValid("\u5BB1"));	// 宱
        assertEquals(JISX0213String.length("\u5BB1"), 1);
        assertFalse(JISX0213String.isValid("\u5BB2"));	// 宲
        assertEquals(JISX0213String.length("\u5BB2"), 1);
        assertFalse(JISX0213String.isValid("\u5BB7"));	// 宷
        assertEquals(JISX0213String.length("\u5BB7"), 1);
        assertFalse(JISX0213String.isValid("\u5BBA"));	// 宺
        assertEquals(JISX0213String.length("\u5BBA"), 1);
        assertFalse(JISX0213String.isValid("\u5BBC"));	// 宼
        assertEquals(JISX0213String.length("\u5BBC"), 1);
        assertFalse(JISX0213String.isValid("\u5BC1"));	// 寁
        assertEquals(JISX0213String.length("\u5BC1"), 1);
        assertFalse(JISX0213String.isValid("\u5BCD"));	// 寍
        assertEquals(JISX0213String.length("\u5BCD"), 1);
        assertFalse(JISX0213String.isValid("\u5BCF"));	// 寏
        assertEquals(JISX0213String.length("\u5BCF"), 1);
        assertFalse(JISX0213String.isValid("\u5BD7"));	// 寗
        assertEquals(JISX0213String.length("\u5BD7"), 1);
        assertFalse(JISX0213String.isValid("\u5BD9"));	// 寙
        assertEquals(JISX0213String.length("\u5BD9"), 1);
        assertFalse(JISX0213String.isValid("\u5BDA"));	// 寚
        assertEquals(JISX0213String.length("\u5BDA"), 1);
        assertFalse(JISX0213String.isValid("\u5BE0"));	// 寠
        assertEquals(JISX0213String.length("\u5BE0"), 1);
        assertFalse(JISX0213String.isValid("\u5BEF"));	// 寯
        assertEquals(JISX0213String.length("\u5BEF"), 1);
        assertFalse(JISX0213String.isValid("\u5BF4"));	// 寴
        assertEquals(JISX0213String.length("\u5BF4"), 1);
        assertFalse(JISX0213String.isValid("\u5C0C"));	// 尌
        assertEquals(JISX0213String.length("\u5C0C"), 1);
        assertFalse(JISX0213String.isValid("\u5C17"));	// 尗
        assertEquals(JISX0213String.length("\u5C17"), 1);
        assertFalse(JISX0213String.isValid("\u5C1F"));	// 尟
        assertEquals(JISX0213String.length("\u5C1F"), 1);
        assertFalse(JISX0213String.isValid("\u5C26"));	// 尦
        assertEquals(JISX0213String.length("\u5C26"), 1);
        assertFalse(JISX0213String.isValid("\u5C2C"));	// 尬
        assertEquals(JISX0213String.length("\u5C2C"), 1);
        assertFalse(JISX0213String.isValid("\u5C2E"));	// 尮
        assertEquals(JISX0213String.length("\u5C2E"), 1);
        assertFalse(JISX0213String.isValid("\u5C32"));	// 尲
        assertEquals(JISX0213String.length("\u5C32"), 1);
        assertFalse(JISX0213String.isValid("\u5C35"));	// 尵
        assertEquals(JISX0213String.length("\u5C35"), 1);
        assertFalse(JISX0213String.isValid("\u5C36"));	// 尶
        assertEquals(JISX0213String.length("\u5C36"), 1);
        assertFalse(JISX0213String.isValid("\u5C59"));	// 屙
        assertEquals(JISX0213String.length("\u5C59"), 1);
        assertFalse(JISX0213String.isValid("\u5C5A"));	// 屚
        assertEquals(JISX0213String.length("\u5C5A"), 1);
        assertFalse(JISX0213String.isValid("\u5C5C"));	// 屜
        assertEquals(JISX0213String.length("\u5C5C"), 1);
        assertFalse(JISX0213String.isValid("\u5C6D"));	// 屭
        assertEquals(JISX0213String.length("\u5C6D"), 1);
        assertFalse(JISX0213String.isValid("\u5C74"));	// 屴
        assertEquals(JISX0213String.length("\u5C74"), 1);
        assertFalse(JISX0213String.isValid("\u5C75"));	// 屵
        assertEquals(JISX0213String.length("\u5C75"), 1);
        assertFalse(JISX0213String.isValid("\u5C7B"));	// 屻
        assertEquals(JISX0213String.length("\u5C7B"), 1);
        assertFalse(JISX0213String.isValid("\u5C7D"));	// 屽
        assertEquals(JISX0213String.length("\u5C7D"), 1);
        assertFalse(JISX0213String.isValid("\u5C87"));	// 岇
        assertEquals(JISX0213String.length("\u5C87"), 1);
        assertFalse(JISX0213String.isValid("\u5C92"));	// 岒
        assertEquals(JISX0213String.length("\u5C92"), 1);
        assertFalse(JISX0213String.isValid("\u5C9D"));	// 岝
        assertEquals(JISX0213String.length("\u5C9D"), 1);
        assertFalse(JISX0213String.isValid("\u5CB2"));	// 岲
        assertEquals(JISX0213String.length("\u5CB2"), 1);
        assertFalse(JISX0213String.isValid("\u5CB4"));	// 岴
        assertEquals(JISX0213String.length("\u5CB4"), 1);
        assertFalse(JISX0213String.isValid("\u5CDD"));	// 峝
        assertEquals(JISX0213String.length("\u5CDD"), 1);
        assertFalse(JISX0213String.isValid("\u5CD7"));	// 峗
        assertEquals(JISX0213String.length("\u5CD7"), 1);
        assertFalse(JISX0213String.isValid("\u5CEE"));	// 峮
        assertEquals(JISX0213String.length("\u5CEE"), 1);
        assertFalse(JISX0213String.isValid("\u5CF1"));	// 峱
        assertEquals(JISX0213String.length("\u5CF1"), 1);
        assertFalse(JISX0213String.isValid("\u5CF2"));	// 峲
        assertEquals(JISX0213String.length("\u5CF2"), 1);
        assertFalse(JISX0213String.isValid("\u5D01"));	// 崁
        assertEquals(JISX0213String.length("\u5D01"), 1);
        assertFalse(JISX0213String.isValid("\u5D12"));	// 崒
        assertEquals(JISX0213String.length("\u5D12"), 1);
        assertFalse(JISX0213String.isValid("\u5D23"));	// 崣
        assertEquals(JISX0213String.length("\u5D23"), 1);
        assertFalse(JISX0213String.isValid("\u5D34"));	// 崴
        assertEquals(JISX0213String.length("\u5D34"), 1);
        assertFalse(JISX0213String.isValid("\u5D3D"));	// 崽
        assertEquals(JISX0213String.length("\u5D3D"), 1);
        assertFalse(JISX0213String.isValid("\u5D3F"));	// 崿
        assertEquals(JISX0213String.length("\u5D3F"), 1);
        assertFalse(JISX0213String.isValid("\u5D43"));	// 嵃
        assertEquals(JISX0213String.length("\u5D43"), 1);
        assertFalse(JISX0213String.isValid("\u5D48"));	// 嵈
        assertEquals(JISX0213String.length("\u5D48"), 1);
        assertFalse(JISX0213String.isValid("\u5D55"));	// 嵕
        assertEquals(JISX0213String.length("\u5D55"), 1);
        assertFalse(JISX0213String.isValid("\u5D51"));	// 嵑
        assertEquals(JISX0213String.length("\u5D51"), 1);
        assertFalse(JISX0213String.isValid("\u5D59"));	// 嵙
        assertEquals(JISX0213String.length("\u5D59"), 1);
        assertFalse(JISX0213String.isValid("\u5D5F"));	// 嵟
        assertEquals(JISX0213String.length("\u5D5F"), 1);
        assertFalse(JISX0213String.isValid("\u5D60"));	// 嵠
        assertEquals(JISX0213String.length("\u5D60"), 1);
        assertFalse(JISX0213String.isValid("\u5D62"));	// 嵢
        assertEquals(JISX0213String.length("\u5D62"), 1);
        assertFalse(JISX0213String.isValid("\u5D64"));	// 嵤
        assertEquals(JISX0213String.length("\u5D64"), 1);
        assertFalse(JISX0213String.isValid("\u5D79"));	// 嵹
        assertEquals(JISX0213String.length("\u5D79"), 1);
        assertFalse(JISX0213String.isValid("\u5D7A"));	// 嵺
        assertEquals(JISX0213String.length("\u5D7A"), 1);
        assertFalse(JISX0213String.isValid("\u5D7E"));	// 嵾
        assertEquals(JISX0213String.length("\u5D7E"), 1);
        assertFalse(JISX0213String.isValid("\u5D7F"));	// 嵿
        assertEquals(JISX0213String.length("\u5D7F"), 1);
        assertFalse(JISX0213String.isValid("\u5D83"));	// 嶃
        assertEquals(JISX0213String.length("\u5D83"), 1);
        assertFalse(JISX0213String.isValid("\u5D8A"));	// 嶊
        assertEquals(JISX0213String.length("\u5D8A"), 1);
        assertFalse(JISX0213String.isValid("\u5D93"));	// 嶓
        assertEquals(JISX0213String.length("\u5D93"), 1);
        assertFalse(JISX0213String.isValid("\u5D95"));	// 嶕
        assertEquals(JISX0213String.length("\u5D95"), 1);
        assertFalse(JISX0213String.isValid("\u5D9B"));	// 嶛
        assertEquals(JISX0213String.length("\u5D9B"), 1);
        assertFalse(JISX0213String.isValid("\u5D9F"));	// 嶟
        assertEquals(JISX0213String.length("\u5D9F"), 1);
        assertFalse(JISX0213String.isValid("\u5DAB"));	// 嶫
        assertEquals(JISX0213String.length("\u5DAB"), 1);
        assertFalse(JISX0213String.isValid("\u5DC3"));	// 巃
        assertEquals(JISX0213String.length("\u5DC3"), 1);
        assertFalse(JISX0213String.isValid("\u5DC7"));	// 巇
        assertEquals(JISX0213String.length("\u5DC7"), 1);
        assertFalse(JISX0213String.isValid("\u5DCE"));	// 巎
        assertEquals(JISX0213String.length("\u5DCE"), 1);
        assertFalse(JISX0213String.isValid("\u5DD9"));	// 巙
        assertEquals(JISX0213String.length("\u5DD9"), 1);
        assertFalse(JISX0213String.isValid("\u5DF8"));	// 巸
        assertEquals(JISX0213String.length("\u5DF8"), 1);
        assertFalse(JISX0213String.isValid("\u5DF9"));	// 巹
        assertEquals(JISX0213String.length("\u5DF9"), 1);
        assertFalse(JISX0213String.isValid("\u5E07"));	// 帇
        assertEquals(JISX0213String.length("\u5E07"), 1);
        assertFalse(JISX0213String.isValid("\u5E0D"));	// 帍
        assertEquals(JISX0213String.length("\u5E0D"), 1);
        assertFalse(JISX0213String.isValid("\u5E20"));	// 帠
        assertEquals(JISX0213String.length("\u5E20"), 1);
        assertFalse(JISX0213String.isValid("\u5E28"));	// 帨
        assertEquals(JISX0213String.length("\u5E28"), 1);
        assertFalse(JISX0213String.isValid("\u5E32"));	// 帲
        assertEquals(JISX0213String.length("\u5E32"), 1);
        assertFalse(JISX0213String.isValid("\u5E35"));	// 帵
        assertEquals(JISX0213String.length("\u5E35"), 1);
        assertFalse(JISX0213String.isValid("\u5E4B"));	// 幋
        assertEquals(JISX0213String.length("\u5E4B"), 1);
        assertFalse(JISX0213String.isValid("\u5E50"));	// 幐
        assertEquals(JISX0213String.length("\u5E50"), 1);
        assertFalse(JISX0213String.isValid("\u5E51"));	// 幑
        assertEquals(JISX0213String.length("\u5E51"), 1);
        assertFalse(JISX0213String.isValid("\u5E5B"));	// 幛
        assertEquals(JISX0213String.length("\u5E5B"), 1);
        assertFalse(JISX0213String.isValid("\u5E5C"));	// 幜
        assertEquals(JISX0213String.length("\u5E5C"), 1);
        assertFalse(JISX0213String.isValid("\u5E68"));	// 幨
        assertEquals(JISX0213String.length("\u5E68"), 1);
        assertFalse(JISX0213String.isValid("\u5E6A"));	// 幪
        assertEquals(JISX0213String.length("\u5E6A"), 1);
        assertFalse(JISX0213String.isValid("\u5E70"));	// 幰
        assertEquals(JISX0213String.length("\u5E70"), 1);
        assertFalse(JISX0213String.isValid("\u5E80"));	// 庀
        assertEquals(JISX0213String.length("\u5E80"), 1);
        assertFalse(JISX0213String.isValid("\u5E8B"));	// 庋
        assertEquals(JISX0213String.length("\u5E8B"), 1);
        assertFalse(JISX0213String.isValid("\u5E8E"));	// 庎
        assertEquals(JISX0213String.length("\u5E8E"), 1);
        assertFalse(JISX0213String.isValid("\u5EA2"));	// 庢
        assertEquals(JISX0213String.length("\u5EA2"), 1);
        assertFalse(JISX0213String.isValid("\u5EA4"));	// 庤
        assertEquals(JISX0213String.length("\u5EA4"), 1);
        assertFalse(JISX0213String.isValid("\u5EA8"));	// 庨
        assertEquals(JISX0213String.length("\u5EA8"), 1);
        assertFalse(JISX0213String.isValid("\u5EB1"));	// 庱
        assertEquals(JISX0213String.length("\u5EB1"), 1);
        assertFalse(JISX0213String.isValid("\u5EB3"));	// 庳
        assertEquals(JISX0213String.length("\u5EB3"), 1);
        assertFalse(JISX0213String.isValid("\u5EBD"));	// 庽
        assertEquals(JISX0213String.length("\u5EBD"), 1);
        assertFalse(JISX0213String.isValid("\u5ECC"));	// 廌
        assertEquals(JISX0213String.length("\u5ECC"), 1);
        assertFalse(JISX0213String.isValid("\u5ECE"));	// 廎
        assertEquals(JISX0213String.length("\u5ECE"), 1);
        assertFalse(JISX0213String.isValid("\u5ED1"));	// 廑
        assertEquals(JISX0213String.length("\u5ED1"), 1);
        assertFalse(JISX0213String.isValid("\u5ED4"));	// 廔
        assertEquals(JISX0213String.length("\u5ED4"), 1);
        assertFalse(JISX0213String.isValid("\u5ED5"));	// 廕
        assertEquals(JISX0213String.length("\u5ED5"), 1);
        assertFalse(JISX0213String.isValid("\u5EDC"));	// 廜
        assertEquals(JISX0213String.length("\u5EDC"), 1);
        assertFalse(JISX0213String.isValid("\u5EDE"));	// 廞
        assertEquals(JISX0213String.length("\u5EDE"), 1);
        assertFalse(JISX0213String.isValid("\u5EE5"));	// 廥
        assertEquals(JISX0213String.length("\u5EE5"), 1);
        assertFalse(JISX0213String.isValid("\u5EEB"));	// 廫
        assertEquals(JISX0213String.length("\u5EEB"), 1);
        assertFalse(JISX0213String.isValid("\u5F06"));	// 弆
        assertEquals(JISX0213String.length("\u5F06"), 1);
        assertFalse(JISX0213String.isValid("\u5F19"));	// 弙
        assertEquals(JISX0213String.length("\u5F19"), 1);
        assertFalse(JISX0213String.isValid("\u5F22"));	// 弢
        assertEquals(JISX0213String.length("\u5F22"), 1);
        assertFalse(JISX0213String.isValid("\u5F24"));	// 弤
        assertEquals(JISX0213String.length("\u5F24"), 1);
        assertFalse(JISX0213String.isValid("\u5F28"));	// 弨
        assertEquals(JISX0213String.length("\u5F28"), 1);
        assertFalse(JISX0213String.isValid("\u5F2B"));	// 弫
        assertEquals(JISX0213String.length("\u5F2B"), 1);
        assertFalse(JISX0213String.isValid("\u5F2C"));	// 弬
        assertEquals(JISX0213String.length("\u5F2C"), 1);
        assertFalse(JISX0213String.isValid("\u5F2E"));	// 弮
        assertEquals(JISX0213String.length("\u5F2E"), 1);
        assertFalse(JISX0213String.isValid("\u5F30"));	// 弰
        assertEquals(JISX0213String.length("\u5F30"), 1);
        assertFalse(JISX0213String.isValid("\u5F3B"));	// 弻
        assertEquals(JISX0213String.length("\u5F3B"), 1);
        assertFalse(JISX0213String.isValid("\u5F3F"));	// 弿
        assertEquals(JISX0213String.length("\u5F3F"), 1);
        assertFalse(JISX0213String.isValid("\u5F44"));	// 彄
        assertEquals(JISX0213String.length("\u5F44"), 1);
        assertFalse(JISX0213String.isValid("\u5F4D"));	// 彍
        assertEquals(JISX0213String.length("\u5F4D"), 1);
        assertFalse(JISX0213String.isValid("\u5F50"));	// 彐
        assertEquals(JISX0213String.length("\u5F50"), 1);
        assertFalse(JISX0213String.isValid("\u5F5B"));	// 彛
        assertEquals(JISX0213String.length("\u5F5B"), 1);
        assertFalse(JISX0213String.isValid("\u5F60"));	// 彠
        assertEquals(JISX0213String.length("\u5F60"), 1);
        assertFalse(JISX0213String.isValid("\u5F6F"));	// 彯
        assertEquals(JISX0213String.length("\u5F6F"), 1);
        assertFalse(JISX0213String.isValid("\u5F74"));	// 彴
        assertEquals(JISX0213String.length("\u5F74"), 1);
        assertFalse(JISX0213String.isValid("\u5F75"));	// 彵
        assertEquals(JISX0213String.length("\u5F75"), 1);
        assertFalse(JISX0213String.isValid("\u5F78"));	// 彸
        assertEquals(JISX0213String.length("\u5F78"), 1);
        assertFalse(JISX0213String.isValid("\u5F7A"));	// 彺
        assertEquals(JISX0213String.length("\u5F7A"), 1);
        assertFalse(JISX0213String.isValid("\u5F8D"));	// 徍
        assertEquals(JISX0213String.length("\u5F8D"), 1);
        assertFalse(JISX0213String.isValid("\u5F96"));	// 徖
        assertEquals(JISX0213String.length("\u5F96"), 1);
        assertFalse(JISX0213String.isValid("\u5F9D"));	// 徝
        assertEquals(JISX0213String.length("\u5F9D"), 1);
        assertFalse(JISX0213String.isValid("\u5FAB"));	// 徫
        assertEquals(JISX0213String.length("\u5FAB"), 1);
        assertFalse(JISX0213String.isValid("\u5FAC"));	// 徬
        assertEquals(JISX0213String.length("\u5FAC"), 1);
        assertFalse(JISX0213String.isValid("\u5FB0"));	// 徰
        assertEquals(JISX0213String.length("\u5FB0"), 1);
        assertFalse(JISX0213String.isValid("\u5FB1"));	// 徱
        assertEquals(JISX0213String.length("\u5FB1"), 1);
        assertFalse(JISX0213String.isValid("\u5FC8"));	// 忈
        assertEquals(JISX0213String.length("\u5FC8"), 1);
        assertFalse(JISX0213String.isValid("\u5FD0"));	// 忐
        assertEquals(JISX0213String.length("\u5FD0"), 1);
        assertFalse(JISX0213String.isValid("\u5FD1"));	// 忑
        assertEquals(JISX0213String.length("\u5FD1"), 1);
        assertFalse(JISX0213String.isValid("\u5FE8"));	// 忨
        assertEquals(JISX0213String.length("\u5FE8"), 1);
        assertFalse(JISX0213String.isValid("\u5FEA"));	// 忪
        assertEquals(JISX0213String.length("\u5FEA"), 1);
        assertFalse(JISX0213String.isValid("\u5FEC"));	// 忬
        assertEquals(JISX0213String.length("\u5FEC"), 1);
        assertFalse(JISX0213String.isValid("\u5FED"));	// 忭
        assertEquals(JISX0213String.length("\u5FED"), 1);
        assertFalse(JISX0213String.isValid("\u5FF2"));	// 忲
        assertEquals(JISX0213String.length("\u5FF2"), 1);
        assertFalse(JISX0213String.isValid("\u5FF6"));	// 忶
        assertEquals(JISX0213String.length("\u5FF6"), 1);
        assertFalse(JISX0213String.isValid("\u5FFA"));	// 忺
        assertEquals(JISX0213String.length("\u5FFA"), 1);
        assertFalse(JISX0213String.isValid("\u6007"));	// 怇
        assertEquals(JISX0213String.length("\u6007"), 1);
        assertFalse(JISX0213String.isValid("\u600A"));	// 怊
        assertEquals(JISX0213String.length("\u600A"), 1);
        assertFalse(JISX0213String.isValid("\u6013"));	// 怓
        assertEquals(JISX0213String.length("\u6013"), 1);
        assertFalse(JISX0213String.isValid("\u601A"));	// 怚
        assertEquals(JISX0213String.length("\u601A"), 1);
        assertFalse(JISX0213String.isValid("\u601F"));	// 怟
        assertEquals(JISX0213String.length("\u601F"), 1);
        assertFalse(JISX0213String.isValid("\u602D"));	// 怭
        assertEquals(JISX0213String.length("\u602D"), 1);
        assertFalse(JISX0213String.isValid("\u6040"));	// 恀
        assertEquals(JISX0213String.length("\u6040"), 1);
        assertFalse(JISX0213String.isValid("\u6048"));	// 恈
        assertEquals(JISX0213String.length("\u6048"), 1);
        assertFalse(JISX0213String.isValid("\u6049"));	// 恉
        assertEquals(JISX0213String.length("\u6049"), 1);
        assertFalse(JISX0213String.isValid("\u6051"));	// 恑
        assertEquals(JISX0213String.length("\u6051"), 1);
        assertFalse(JISX0213String.isValid("\u6054"));	// 恔
        assertEquals(JISX0213String.length("\u6054"), 1);
        assertFalse(JISX0213String.isValid("\u6056"));	// 恖
        assertEquals(JISX0213String.length("\u6056"), 1);
        assertFalse(JISX0213String.isValid("\u6057"));	// 恗
        assertEquals(JISX0213String.length("\u6057"), 1);
        assertFalse(JISX0213String.isValid("\u6061"));	// 恡
        assertEquals(JISX0213String.length("\u6061"), 1);
        assertFalse(JISX0213String.isValid("\u6067"));	// 恧
        assertEquals(JISX0213String.length("\u6067"), 1);
        assertFalse(JISX0213String.isValid("\u6071"));	// 恱
        assertEquals(JISX0213String.length("\u6071"), 1);
        assertFalse(JISX0213String.isValid("\u607E"));	// 恾
        assertEquals(JISX0213String.length("\u607E"), 1);
        assertFalse(JISX0213String.isValid("\u6082"));	// 悂
        assertEquals(JISX0213String.length("\u6082"), 1);
        assertFalse(JISX0213String.isValid("\u6086"));	// 悆
        assertEquals(JISX0213String.length("\u6086"), 1);
        assertFalse(JISX0213String.isValid("\u6088"));	// 悈
        assertEquals(JISX0213String.length("\u6088"), 1);
        assertFalse(JISX0213String.isValid("\u608E"));	// 悎
        assertEquals(JISX0213String.length("\u608E"), 1);
        assertFalse(JISX0213String.isValid("\u6091"));	// 悑
        assertEquals(JISX0213String.length("\u6091"), 1);
        assertFalse(JISX0213String.isValid("\u6093"));	// 悓
        assertEquals(JISX0213String.length("\u6093"), 1);
        assertFalse(JISX0213String.isValid("\u6098"));	// 悘
        assertEquals(JISX0213String.length("\u6098"), 1);
        assertFalse(JISX0213String.isValid("\u60A2"));	// 悢
        assertEquals(JISX0213String.length("\u60A2"), 1);
        assertFalse(JISX0213String.isValid("\u60A4"));	// 悤
        assertEquals(JISX0213String.length("\u60A4"), 1);
        assertFalse(JISX0213String.isValid("\u60A5"));	// 悥
        assertEquals(JISX0213String.length("\u60A5"), 1);
        assertFalse(JISX0213String.isValid("\u60B7"));	// 悷
        assertEquals(JISX0213String.length("\u60B7"), 1);
        assertFalse(JISX0213String.isValid("\u60BB"));	// 悻
        assertEquals(JISX0213String.length("\u60BB"), 1);
        assertFalse(JISX0213String.isValid("\u60C2"));	// 惂
        assertEquals(JISX0213String.length("\u60C2"), 1);
        assertFalse(JISX0213String.isValid("\u60C4"));	// 惄
        assertEquals(JISX0213String.length("\u60C4"), 1);
        assertFalse(JISX0213String.isValid("\u60C9"));	// 惉
        assertEquals(JISX0213String.length("\u60C9"), 1);
        assertFalse(JISX0213String.isValid("\u60CA"));	// 惊
        assertEquals(JISX0213String.length("\u60CA"), 1);
        assertFalse(JISX0213String.isValid("\u60CE"));	// 惎
        assertEquals(JISX0213String.length("\u60CE"), 1);
        assertFalse(JISX0213String.isValid("\u60CF"));	// 惏
        assertEquals(JISX0213String.length("\u60CF"), 1);
        assertFalse(JISX0213String.isValid("\u60E2"));	// 惢
        assertEquals(JISX0213String.length("\u60E2"), 1);
        assertFalse(JISX0213String.isValid("\u60E5"));	// 惥
        assertEquals(JISX0213String.length("\u60E5"), 1);
        assertFalse(JISX0213String.isValid("\u60FC"));	// 惼
        assertEquals(JISX0213String.length("\u60FC"), 1);
        assertFalse(JISX0213String.isValid("\u60FD"));	// 惽
        assertEquals(JISX0213String.length("\u60FD"), 1);
        assertFalse(JISX0213String.isValid("\u6102"));	// 愂
        assertEquals(JISX0213String.length("\u6102"), 1);
        assertFalse(JISX0213String.isValid("\u6107"));	// 愇
        assertEquals(JISX0213String.length("\u6107"), 1);
        assertFalse(JISX0213String.isValid("\u610A"));	// 愊
        assertEquals(JISX0213String.length("\u610A"), 1);
        assertFalse(JISX0213String.isValid("\u610C"));	// 愌
        assertEquals(JISX0213String.length("\u610C"), 1);
        assertFalse(JISX0213String.isValid("\u6114"));	// 愔
        assertEquals(JISX0213String.length("\u6114"), 1);
        assertFalse(JISX0213String.isValid("\u6116"));	// 愖
        assertEquals(JISX0213String.length("\u6116"), 1);
        assertFalse(JISX0213String.isValid("\u6117"));	// 愗
        assertEquals(JISX0213String.length("\u6117"), 1);
        assertFalse(JISX0213String.isValid("\u6122"));	// 愢
        assertEquals(JISX0213String.length("\u6122"), 1);
        assertFalse(JISX0213String.isValid("\u612A"));	// 愪
        assertEquals(JISX0213String.length("\u612A"), 1);
        assertFalse(JISX0213String.isValid("\u6131"));	// 愱
        assertEquals(JISX0213String.length("\u6131"), 1);
        assertFalse(JISX0213String.isValid("\u6135"));	// 愵
        assertEquals(JISX0213String.length("\u6135"), 1);
        assertFalse(JISX0213String.isValid("\u6136"));	// 愶
        assertEquals(JISX0213String.length("\u6136"), 1);
        assertFalse(JISX0213String.isValid("\u6139"));	// 愹
        assertEquals(JISX0213String.length("\u6139"), 1);
        assertFalse(JISX0213String.isValid("\u6145"));	// 慅
        assertEquals(JISX0213String.length("\u6145"), 1);
        assertFalse(JISX0213String.isValid("\u6149"));	// 慉
        assertEquals(JISX0213String.length("\u6149"), 1);
        assertFalse(JISX0213String.isValid("\u615E"));	// 慞
        assertEquals(JISX0213String.length("\u615E"), 1);
        assertFalse(JISX0213String.isValid("\u616C"));	// 慬
        assertEquals(JISX0213String.length("\u616C"), 1);
        assertFalse(JISX0213String.isValid("\u6172"));	// 慲
        assertEquals(JISX0213String.length("\u6172"), 1);
        assertFalse(JISX0213String.isValid("\u6178"));	// 慸
        assertEquals(JISX0213String.length("\u6178"), 1);
        assertFalse(JISX0213String.isValid("\u617B"));	// 慻
        assertEquals(JISX0213String.length("\u617B"), 1);
        assertFalse(JISX0213String.isValid("\u617F"));	// 慿
        assertEquals(JISX0213String.length("\u617F"), 1);
        assertFalse(JISX0213String.isValid("\u6180"));	// 憀
        assertEquals(JISX0213String.length("\u6180"), 1);
        assertFalse(JISX0213String.isValid("\u6181"));	// 憁
        assertEquals(JISX0213String.length("\u6181"), 1);
        assertFalse(JISX0213String.isValid("\u6183"));	// 憃
        assertEquals(JISX0213String.length("\u6183"), 1);
        assertFalse(JISX0213String.isValid("\u6184"));	// 憄
        assertEquals(JISX0213String.length("\u6184"), 1);
        assertFalse(JISX0213String.isValid("\u618B"));	// 憋
        assertEquals(JISX0213String.length("\u618B"), 1);
        assertFalse(JISX0213String.isValid("\u619C"));	// 憜
        assertEquals(JISX0213String.length("\u619C"), 1);
        assertFalse(JISX0213String.isValid("\u619D"));	// 憝
        assertEquals(JISX0213String.length("\u619D"), 1);
        assertFalse(JISX0213String.isValid("\u619F"));	// 憟
        assertEquals(JISX0213String.length("\u619F"), 1);
        assertFalse(JISX0213String.isValid("\u61A0"));	// 憠
        assertEquals(JISX0213String.length("\u61A0"), 1);
        assertFalse(JISX0213String.isValid("\u61AA"));	// 憪
        assertEquals(JISX0213String.length("\u61AA"), 1);
        assertFalse(JISX0213String.isValid("\u61B8"));	// 憸
        assertEquals(JISX0213String.length("\u61B8"), 1);
        assertFalse(JISX0213String.isValid("\u61C0"));	// 懀
        assertEquals(JISX0213String.length("\u61C0"), 1);
        assertFalse(JISX0213String.isValid("\u61C1"));	// 懁
        assertEquals(JISX0213String.length("\u61C1"), 1);
        assertFalse(JISX0213String.isValid("\u61C2"));	// 懂
        assertEquals(JISX0213String.length("\u61C2"), 1);
        assertFalse(JISX0213String.isValid("\u61CE"));	// 懎
        assertEquals(JISX0213String.length("\u61CE"), 1);
        assertFalse(JISX0213String.isValid("\u61CF"));	// 懏
        assertEquals(JISX0213String.length("\u61CF"), 1);
        assertFalse(JISX0213String.isValid("\u61DC"));	// 懜
        assertEquals(JISX0213String.length("\u61DC"), 1);
        assertFalse(JISX0213String.isValid("\u61DE"));	// 懞
        assertEquals(JISX0213String.length("\u61DE"), 1);
        assertFalse(JISX0213String.isValid("\u61E1"));	// 懡
        assertEquals(JISX0213String.length("\u61E1"), 1);
        assertFalse(JISX0213String.isValid("\u61E2"));	// 懢
        assertEquals(JISX0213String.length("\u61E2"), 1);
        assertFalse(JISX0213String.isValid("\u61E7"));	// 懧
        assertEquals(JISX0213String.length("\u61E7"), 1);
        assertFalse(JISX0213String.isValid("\u61E9"));	// 懩
        assertEquals(JISX0213String.length("\u61E9"), 1);
        assertFalse(JISX0213String.isValid("\u61E5"));	// 懥
        assertEquals(JISX0213String.length("\u61E5"), 1);
        assertFalse(JISX0213String.isValid("\u61EC"));	// 懬
        assertEquals(JISX0213String.length("\u61EC"), 1);
        assertFalse(JISX0213String.isValid("\u61ED"));	// 懭
        assertEquals(JISX0213String.length("\u61ED"), 1);
        assertFalse(JISX0213String.isValid("\u61EF"));	// 懯
        assertEquals(JISX0213String.length("\u61EF"), 1);
        assertFalse(JISX0213String.isValid("\u6201"));	// 戁
        assertEquals(JISX0213String.length("\u6201"), 1);
        assertFalse(JISX0213String.isValid("\u6203"));	// 戃
        assertEquals(JISX0213String.length("\u6203"), 1);
        assertFalse(JISX0213String.isValid("\u6204"));	// 戄
        assertEquals(JISX0213String.length("\u6204"), 1);
        assertFalse(JISX0213String.isValid("\u6207"));	// 戇
        assertEquals(JISX0213String.length("\u6207"), 1);
        assertFalse(JISX0213String.isValid("\u621C"));	// 戜
        assertEquals(JISX0213String.length("\u621C"), 1);
        assertFalse(JISX0213String.isValid("\u6220"));	// 戠
        assertEquals(JISX0213String.length("\u6220"), 1);
        assertFalse(JISX0213String.isValid("\u6227"));	// 戧
        assertEquals(JISX0213String.length("\u6227"), 1);
        assertFalse(JISX0213String.isValid("\u622B"));	// 戫
        assertEquals(JISX0213String.length("\u622B"), 1);
        assertFalse(JISX0213String.isValid("\u6239"));	// 戹
        assertEquals(JISX0213String.length("\u6239"), 1);
        assertFalse(JISX0213String.isValid("\u623D"));	// 戽
        assertEquals(JISX0213String.length("\u623D"), 1);
        assertFalse(JISX0213String.isValid("\u6242"));	// 扂
        assertEquals(JISX0213String.length("\u6242"), 1);
        assertFalse(JISX0213String.isValid("\u6244"));	// 扄
        assertEquals(JISX0213String.length("\u6244"), 1);
        assertFalse(JISX0213String.isValid("\u6250"));	// 扐
        assertEquals(JISX0213String.length("\u6250"), 1);
        assertFalse(JISX0213String.isValid("\u6254"));	// 扔
        assertEquals(JISX0213String.length("\u6254"), 1);
        assertFalse(JISX0213String.isValid("\u625C"));	// 扜
        assertEquals(JISX0213String.length("\u625C"), 1);
        assertFalse(JISX0213String.isValid("\u627A"));	// 扺
        assertEquals(JISX0213String.length("\u627A"), 1);
        assertFalse(JISX0213String.isValid("\u627D"));	// 扽
        assertEquals(JISX0213String.length("\u627D"), 1);
        assertFalse(JISX0213String.isValid("\u628D"));	// 抍
        assertEquals(JISX0213String.length("\u628D"), 1);
        assertFalse(JISX0213String.isValid("\u628E"));	// 抎
        assertEquals(JISX0213String.length("\u628E"), 1);
        assertFalse(JISX0213String.isValid("\u628F"));	// 抏
        assertEquals(JISX0213String.length("\u628F"), 1);
        assertFalse(JISX0213String.isValid("\u6290"));	// 抐
        assertEquals(JISX0213String.length("\u6290"), 1);
        assertFalse(JISX0213String.isValid("\u62A8"));	// 抨
        assertEquals(JISX0213String.length("\u62A8"), 1);
        assertFalse(JISX0213String.isValid("\u62B3"));	// 抳
        assertEquals(JISX0213String.length("\u62B3"), 1);
        assertFalse(JISX0213String.isValid("\u62B6"));	// 抶
        assertEquals(JISX0213String.length("\u62B6"), 1);
        assertFalse(JISX0213String.isValid("\u62B7"));	// 抷
        assertEquals(JISX0213String.length("\u62B7"), 1);
        assertFalse(JISX0213String.isValid("\u62BA"));	// 抺
        assertEquals(JISX0213String.length("\u62BA"), 1);
        assertFalse(JISX0213String.isValid("\u62BE"));	// 抾
        assertEquals(JISX0213String.length("\u62BE"), 1);
        assertFalse(JISX0213String.isValid("\u62BF"));	// 抿
        assertEquals(JISX0213String.length("\u62BF"), 1);
        assertFalse(JISX0213String.isValid("\u62CE"));	// 拎
        assertEquals(JISX0213String.length("\u62CE"), 1);
        assertFalse(JISX0213String.isValid("\u62DA"));	// 拚
        assertEquals(JISX0213String.length("\u62DA"), 1);
        assertFalse(JISX0213String.isValid("\u62EA"));	// 拪
        assertEquals(JISX0213String.length("\u62EA"), 1);
        assertFalse(JISX0213String.isValid("\u62F2"));	// 拲
        assertEquals(JISX0213String.length("\u62F2"), 1);
        assertFalse(JISX0213String.isValid("\u62F4"));	// 拴
        assertEquals(JISX0213String.length("\u62F4"), 1);
        assertFalse(JISX0213String.isValid("\u6304"));	// 挄
        assertEquals(JISX0213String.length("\u6304"), 1);
        assertFalse(JISX0213String.isValid("\u630B"));	// 挋
        assertEquals(JISX0213String.length("\u630B"), 1);
        assertFalse(JISX0213String.isValid("\u6313"));	// 挓
        assertEquals(JISX0213String.length("\u6313"), 1);
        assertFalse(JISX0213String.isValid("\u6316"));	// 挖
        assertEquals(JISX0213String.length("\u6316"), 1);
        assertFalse(JISX0213String.isValid("\u6329"));	// 挩
        assertEquals(JISX0213String.length("\u6329"), 1);
        assertFalse(JISX0213String.isValid("\u632A"));	// 挪
        assertEquals(JISX0213String.length("\u632A"), 1);
        assertFalse(JISX0213String.isValid("\u632D"));	// 挭
        assertEquals(JISX0213String.length("\u632D"), 1);
        assertFalse(JISX0213String.isValid("\u6336"));	// 挶
        assertEquals(JISX0213String.length("\u6336"), 1);
        assertFalse(JISX0213String.isValid("\u6342"));	// 捂
        assertEquals(JISX0213String.length("\u6342"), 1);
        assertFalse(JISX0213String.isValid("\u6346"));	// 捆
        assertEquals(JISX0213String.length("\u6346"), 1);
        assertFalse(JISX0213String.isValid("\u634A"));	// 捊
        assertEquals(JISX0213String.length("\u634A"), 1);
        assertFalse(JISX0213String.isValid("\u634B"));	// 捋
        assertEquals(JISX0213String.length("\u634B"), 1);
        assertFalse(JISX0213String.isValid("\u6352"));	// 捒
        assertEquals(JISX0213String.length("\u6352"), 1);
        assertFalse(JISX0213String.isValid("\u6353"));	// 捓
        assertEquals(JISX0213String.length("\u6353"), 1);
        assertFalse(JISX0213String.isValid("\u6354"));	// 捔
        assertEquals(JISX0213String.length("\u6354"), 1);
        assertFalse(JISX0213String.isValid("\u6358"));	// 捘
        assertEquals(JISX0213String.length("\u6358"), 1);
        assertFalse(JISX0213String.isValid("\u635B"));	// 捛
        assertEquals(JISX0213String.length("\u635B"), 1);
        assertFalse(JISX0213String.isValid("\u6366"));	// 捦
        assertEquals(JISX0213String.length("\u6366"), 1);
        assertFalse(JISX0213String.isValid("\u636D"));	// 捭
        assertEquals(JISX0213String.length("\u636D"), 1);
        assertFalse(JISX0213String.isValid("\u6371"));	// 捱
        assertEquals(JISX0213String.length("\u6371"), 1);
        assertFalse(JISX0213String.isValid("\u6374"));	// 捴
        assertEquals(JISX0213String.length("\u6374"), 1);
        assertFalse(JISX0213String.isValid("\u6375"));	// 捵
        assertEquals(JISX0213String.length("\u6375"), 1);
        assertFalse(JISX0213String.isValid("\u6378"));	// 捸
        assertEquals(JISX0213String.length("\u6378"), 1);
        assertFalse(JISX0213String.isValid("\u637D"));	// 捽
        assertEquals(JISX0213String.length("\u637D"), 1);
        assertFalse(JISX0213String.isValid("\u637F"));	// 捿
        assertEquals(JISX0213String.length("\u637F"), 1);
        assertFalse(JISX0213String.isValid("\u6382"));	// 掂
        assertEquals(JISX0213String.length("\u6382"), 1);
        assertFalse(JISX0213String.isValid("\u6387"));	// 掇
        assertEquals(JISX0213String.length("\u6387"), 1);
        assertFalse(JISX0213String.isValid("\u638A"));	// 掊
        assertEquals(JISX0213String.length("\u638A"), 1);
        assertFalse(JISX0213String.isValid("\u6390"));	// 掐
        assertEquals(JISX0213String.length("\u6390"), 1);
        assertFalse(JISX0213String.isValid("\u6395"));	// 掕
        assertEquals(JISX0213String.length("\u6395"), 1);
        assertFalse(JISX0213String.isValid("\u639A"));	// 掚
        assertEquals(JISX0213String.length("\u639A"), 1);
        assertFalse(JISX0213String.isValid("\u639E"));	// 掞
        assertEquals(JISX0213String.length("\u639E"), 1);
        assertFalse(JISX0213String.isValid("\u63A4"));	// 掤
        assertEquals(JISX0213String.length("\u63A4"), 1);
        assertFalse(JISX0213String.isValid("\u63A6"));	// 掦
        assertEquals(JISX0213String.length("\u63A6"), 1);
        assertFalse(JISX0213String.isValid("\u63AD"));	// 掭
        assertEquals(JISX0213String.length("\u63AD"), 1);
        assertFalse(JISX0213String.isValid("\u63AE"));	// 掮
        assertEquals(JISX0213String.length("\u63AE"), 1);
        assertFalse(JISX0213String.isValid("\u63AF"));	// 掯
        assertEquals(JISX0213String.length("\u63AF"), 1);
        assertFalse(JISX0213String.isValid("\u63C1"));	// 揁
        assertEquals(JISX0213String.length("\u63C1"), 1);
        assertFalse(JISX0213String.isValid("\u63C5"));	// 揅
        assertEquals(JISX0213String.length("\u63C5"), 1);
        assertFalse(JISX0213String.isValid("\u63C8"));	// 揈
        assertEquals(JISX0213String.length("\u63C8"), 1);
        assertFalse(JISX0213String.isValid("\u63CE"));	// 揎
        assertEquals(JISX0213String.length("\u63CE"), 1);
        assertFalse(JISX0213String.isValid("\u63D1"));	// 揑
        assertEquals(JISX0213String.length("\u63D1"), 1);
        assertFalse(JISX0213String.isValid("\u63D3"));	// 揓
        assertEquals(JISX0213String.length("\u63D3"), 1);
        assertFalse(JISX0213String.isValid("\u63EA"));	// 揪
        assertEquals(JISX0213String.length("\u63EA"), 1);
        assertFalse(JISX0213String.isValid("\u63F3"));	// 揳
        assertEquals(JISX0213String.length("\u63F3"), 1);
        assertFalse(JISX0213String.isValid("\u63F8"));	// 揸
        assertEquals(JISX0213String.length("\u63F8"), 1);
        assertFalse(JISX0213String.isValid("\u63F9"));	// 揹
        assertEquals(JISX0213String.length("\u63F9"), 1);
        assertFalse(JISX0213String.isValid("\u640A"));	// 搊
        assertEquals(JISX0213String.length("\u640A"), 1);
        assertFalse(JISX0213String.isValid("\u6412"));	// 搒
        assertEquals(JISX0213String.length("\u6412"), 1);
        assertFalse(JISX0213String.isValid("\u6418"));	// 搘
        assertEquals(JISX0213String.length("\u6418"), 1);
        assertFalse(JISX0213String.isValid("\u6420"));	// 搠
        assertEquals(JISX0213String.length("\u6420"), 1);
        assertFalse(JISX0213String.isValid("\u6424"));	// 搤
        assertEquals(JISX0213String.length("\u6424"), 1);
        assertFalse(JISX0213String.isValid("\u642A"));	// 搪
        assertEquals(JISX0213String.length("\u642A"), 1);
        assertFalse(JISX0213String.isValid("\u6430"));	// 搰
        assertEquals(JISX0213String.length("\u6430"), 1);
        assertFalse(JISX0213String.isValid("\u6435"));	// 搵
        assertEquals(JISX0213String.length("\u6435"), 1);
        assertFalse(JISX0213String.isValid("\u643D"));	// 搽
        assertEquals(JISX0213String.length("\u643D"), 1);
        assertFalse(JISX0213String.isValid("\u643F"));	// 搿
        assertEquals(JISX0213String.length("\u643F"), 1);
        assertFalse(JISX0213String.isValid("\u644B"));	// 摋
        assertEquals(JISX0213String.length("\u644B"), 1);
        assertFalse(JISX0213String.isValid("\u644F"));	// 摏
        assertEquals(JISX0213String.length("\u644F"), 1);
        assertFalse(JISX0213String.isValid("\u6452"));	// 摒
        assertEquals(JISX0213String.length("\u6452"), 1);
        assertFalse(JISX0213String.isValid("\u6453"));	// 摓
        assertEquals(JISX0213String.length("\u6453"), 1);
        assertFalse(JISX0213String.isValid("\u6454"));	// 摔
        assertEquals(JISX0213String.length("\u6454"), 1);
        assertFalse(JISX0213String.isValid("\u645C"));	// 摜
        assertEquals(JISX0213String.length("\u645C"), 1);
        assertFalse(JISX0213String.isValid("\u645F"));	// 摟
        assertEquals(JISX0213String.length("\u645F"), 1);
        assertFalse(JISX0213String.isValid("\u6461"));	// 摡
        assertEquals(JISX0213String.length("\u6461"), 1);
        assertFalse(JISX0213String.isValid("\u6463"));	// 摣
        assertEquals(JISX0213String.length("\u6463"), 1);
        assertFalse(JISX0213String.isValid("\u6474"));	// 摴
        assertEquals(JISX0213String.length("\u6474"), 1);
        assertFalse(JISX0213String.isValid("\u647B"));	// 摻
        assertEquals(JISX0213String.length("\u647B"), 1);
        assertFalse(JISX0213String.isValid("\u6485"));	// 撅
        assertEquals(JISX0213String.length("\u6485"), 1);
        assertFalse(JISX0213String.isValid("\u648F"));	// 撏
        assertEquals(JISX0213String.length("\u648F"), 1);
        assertFalse(JISX0213String.isValid("\u6490"));	// 撐
        assertEquals(JISX0213String.length("\u6490"), 1);
        assertFalse(JISX0213String.isValid("\u6498"));	// 撘
        assertEquals(JISX0213String.length("\u6498"), 1);
        assertFalse(JISX0213String.isValid("\u6499"));	// 撙
        assertEquals(JISX0213String.length("\u6499"), 1);
        assertFalse(JISX0213String.isValid("\u649B"));	// 撛
        assertEquals(JISX0213String.length("\u649B"), 1);
        assertFalse(JISX0213String.isValid("\u64A1"));	// 撡
        assertEquals(JISX0213String.length("\u64A1"), 1);
        assertFalse(JISX0213String.isValid("\u64A3"));	// 撣
        assertEquals(JISX0213String.length("\u64A3"), 1);
        assertFalse(JISX0213String.isValid("\u64A6"));	// 撦
        assertEquals(JISX0213String.length("\u64A6"), 1);
        assertFalse(JISX0213String.isValid("\u64A8"));	// 撨
        assertEquals(JISX0213String.length("\u64A8"), 1);
        assertFalse(JISX0213String.isValid("\u64AC"));	// 撬
        assertEquals(JISX0213String.length("\u64AC"), 1);
        assertFalse(JISX0213String.isValid("\u64B3"));	// 撳
        assertEquals(JISX0213String.length("\u64B3"), 1);
        assertFalse(JISX0213String.isValid("\u64BD"));	// 撽
        assertEquals(JISX0213String.length("\u64BD"), 1);
        assertFalse(JISX0213String.isValid("\u64C9"));	// 擉
        assertEquals(JISX0213String.length("\u64C9"), 1);
        assertFalse(JISX0213String.isValid("\u64D1"));	// 擑
        assertEquals(JISX0213String.length("\u64D1"), 1);
        assertFalse(JISX0213String.isValid("\u64E9"));	// 擩
        assertEquals(JISX0213String.length("\u64E9"), 1);
        assertFalse(JISX0213String.isValid("\u64EA"));	// 擪
        assertEquals(JISX0213String.length("\u64EA"), 1);
        assertFalse(JISX0213String.isValid("\u64ED"));	// 擭
        assertEquals(JISX0213String.length("\u64ED"), 1);
        assertFalse(JISX0213String.isValid("\u64F0"));	// 擰
        assertEquals(JISX0213String.length("\u64F0"), 1);
        assertFalse(JISX0213String.isValid("\u64F5"));	// 擵
        assertEquals(JISX0213String.length("\u64F5"), 1);
        assertFalse(JISX0213String.isValid("\u6501"));	// 攁
        assertEquals(JISX0213String.length("\u6501"), 1);
        assertFalse(JISX0213String.isValid("\u6508"));	// 攈
        assertEquals(JISX0213String.length("\u6508"), 1);
        assertFalse(JISX0213String.isValid("\u6509"));	// 攉
        assertEquals(JISX0213String.length("\u6509"), 1);
        assertFalse(JISX0213String.isValid("\u650A"));	// 攊
        assertEquals(JISX0213String.length("\u650A"), 1);
        assertFalse(JISX0213String.isValid("\u6513"));	// 攓
        assertEquals(JISX0213String.length("\u6513"), 1);
        assertFalse(JISX0213String.isValid("\u6519"));	// 攙
        assertEquals(JISX0213String.length("\u6519"), 1);
        assertFalse(JISX0213String.isValid("\u651B"));	// 攛
        assertEquals(JISX0213String.length("\u651B"), 1);
        assertFalse(JISX0213String.isValid("\u651F"));	// 攟
        assertEquals(JISX0213String.length("\u651F"), 1);
        assertFalse(JISX0213String.isValid("\u6526"));	// 攦
        assertEquals(JISX0213String.length("\u6526"), 1);
        assertFalse(JISX0213String.isValid("\u652E"));	// 攮
        assertEquals(JISX0213String.length("\u652E"), 1);
        assertFalse(JISX0213String.isValid("\u6531"));	// 攱
        assertEquals(JISX0213String.length("\u6531"), 1);
        assertFalse(JISX0213String.isValid("\u653A"));	// 攺
        assertEquals(JISX0213String.length("\u653A"), 1);
        assertFalse(JISX0213String.isValid("\u653C"));	// 攼
        assertEquals(JISX0213String.length("\u653C"), 1);
        assertFalse(JISX0213String.isValid("\u653D"));	// 攽
        assertEquals(JISX0213String.length("\u653D"), 1);
        assertFalse(JISX0213String.isValid("\u6543"));	// 敃
        assertEquals(JISX0213String.length("\u6543"), 1);
        assertFalse(JISX0213String.isValid("\u6547"));	// 敇
        assertEquals(JISX0213String.length("\u6547"), 1);
        assertFalse(JISX0213String.isValid("\u6549"));	// 敉
        assertEquals(JISX0213String.length("\u6549"), 1);
        assertFalse(JISX0213String.isValid("\u6550"));	// 敐
        assertEquals(JISX0213String.length("\u6550"), 1);
        assertFalse(JISX0213String.isValid("\u6552"));	// 敒
        assertEquals(JISX0213String.length("\u6552"), 1);
        assertFalse(JISX0213String.isValid("\u655F"));	// 敟
        assertEquals(JISX0213String.length("\u655F"), 1);
        assertFalse(JISX0213String.isValid("\u6560"));	// 敠
        assertEquals(JISX0213String.length("\u6560"), 1);
        assertFalse(JISX0213String.isValid("\u657D"));	// 敽
        assertEquals(JISX0213String.length("\u657D"), 1);
        assertFalse(JISX0213String.isValid("\u6592"));	// 斒
        assertEquals(JISX0213String.length("\u6592"), 1);
        assertFalse(JISX0213String.isValid("\u6595"));	// 斕
        assertEquals(JISX0213String.length("\u6595"), 1);
        assertFalse(JISX0213String.isValid("\u6598"));	// 斘
        assertEquals(JISX0213String.length("\u6598"), 1);
        assertFalse(JISX0213String.isValid("\u65A0"));	// 斠
        assertEquals(JISX0213String.length("\u65A0"), 1);
        assertFalse(JISX0213String.isValid("\u65A3"));	// 斣
        assertEquals(JISX0213String.length("\u65A3"), 1);
        assertFalse(JISX0213String.isValid("\u65A6"));	// 斦
        assertEquals(JISX0213String.length("\u65A6"), 1);
        assertFalse(JISX0213String.isValid("\u65AE"));	// 斮
        assertEquals(JISX0213String.length("\u65AE"), 1);
        assertFalse(JISX0213String.isValid("\u65B3"));	// 斳
        assertEquals(JISX0213String.length("\u65B3"), 1);
        assertFalse(JISX0213String.isValid("\u65B4"));	// 斴
        assertEquals(JISX0213String.length("\u65B4"), 1);
        assertFalse(JISX0213String.isValid("\u65C8"));	// 旈
        assertEquals(JISX0213String.length("\u65C8"), 1);
        assertFalse(JISX0213String.isValid("\u65CE"));	// 旎
        assertEquals(JISX0213String.length("\u65CE"), 1);
        assertFalse(JISX0213String.isValid("\u65D0"));	// 旐
        assertEquals(JISX0213String.length("\u65D0"), 1);
        assertFalse(JISX0213String.isValid("\u65D6"));	// 旖
        assertEquals(JISX0213String.length("\u65D6"), 1);
        assertFalse(JISX0213String.isValid("\u65D8"));	// 旘
        assertEquals(JISX0213String.length("\u65D8"), 1);
        assertFalse(JISX0213String.isValid("\u65DF"));	// 旟
        assertEquals(JISX0213String.length("\u65DF"), 1);
        assertFalse(JISX0213String.isValid("\u65F0"));	// 旰
        assertEquals(JISX0213String.length("\u65F0"), 1);
        assertFalse(JISX0213String.isValid("\u65F4"));	// 旴
        assertEquals(JISX0213String.length("\u65F4"), 1);
        assertFalse(JISX0213String.isValid("\u65F5"));	// 旵
        assertEquals(JISX0213String.length("\u65F5"), 1);
        assertFalse(JISX0213String.isValid("\u65FE"));	// 旾
        assertEquals(JISX0213String.length("\u65FE"), 1);
        assertFalse(JISX0213String.isValid("\u65FF"));	// 旿
        assertEquals(JISX0213String.length("\u65FF"), 1);
        assertFalse(JISX0213String.isValid("\u660D"));	// 昍
        assertEquals(JISX0213String.length("\u660D"), 1);
        assertFalse(JISX0213String.isValid("\u6611"));	// 昑
        assertEquals(JISX0213String.length("\u6611"), 1);
        assertFalse(JISX0213String.isValid("\u6612"));	// 昒
        assertEquals(JISX0213String.length("\u6612"), 1);
        assertFalse(JISX0213String.isValid("\u6616"));	// 昖
        assertEquals(JISX0213String.length("\u6616"), 1);
        assertFalse(JISX0213String.isValid("\u661D"));	// 昝
        assertEquals(JISX0213String.length("\u661D"), 1);
        assertFalse(JISX0213String.isValid("\u6623"));	// 昣
        assertEquals(JISX0213String.length("\u6623"), 1);
        assertFalse(JISX0213String.isValid("\u6626"));	// 昦
        assertEquals(JISX0213String.length("\u6626"), 1);
        assertFalse(JISX0213String.isValid("\u6629"));	// 昩
        assertEquals(JISX0213String.length("\u6629"), 1);
        assertFalse(JISX0213String.isValid("\u662C"));	// 昬
        assertEquals(JISX0213String.length("\u662C"), 1);
        assertFalse(JISX0213String.isValid("\u6639"));	// 昹
        assertEquals(JISX0213String.length("\u6639"), 1);
        assertFalse(JISX0213String.isValid("\u6637"));	// 昷
        assertEquals(JISX0213String.length("\u6637"), 1);
        assertFalse(JISX0213String.isValid("\u6640"));	// 晀
        assertEquals(JISX0213String.length("\u6640"), 1);
        assertFalse(JISX0213String.isValid("\u6646"));	// 晆
        assertEquals(JISX0213String.length("\u6646"), 1);
        assertFalse(JISX0213String.isValid("\u664A"));	// 晊
        assertEquals(JISX0213String.length("\u664A"), 1);
        assertFalse(JISX0213String.isValid("\u6658"));	// 晘
        assertEquals(JISX0213String.length("\u6658"), 1);
        assertFalse(JISX0213String.isValid("\u665C"));	// 晜
        assertEquals(JISX0213String.length("\u665C"), 1);
        assertFalse(JISX0213String.isValid("\u6660"));	// 晠
        assertEquals(JISX0213String.length("\u6660"), 1);
        assertFalse(JISX0213String.isValid("\u667E"));	// 晾
        assertEquals(JISX0213String.length("\u667E"), 1);
        assertFalse(JISX0213String.isValid("\u6675"));	// 晵
        assertEquals(JISX0213String.length("\u6675"), 1);
        assertFalse(JISX0213String.isValid("\u667F"));	// 晿
        assertEquals(JISX0213String.length("\u667F"), 1);
        assertFalse(JISX0213String.isValid("\u6679"));	// 晹
        assertEquals(JISX0213String.length("\u6679"), 1);
        assertFalse(JISX0213String.isValid("\u667C"));	// 晼
        assertEquals(JISX0213String.length("\u667C"), 1);
        assertFalse(JISX0213String.isValid("\u668B"));	// 暋
        assertEquals(JISX0213String.length("\u668B"), 1);
        assertFalse(JISX0213String.isValid("\u668C"));	// 暌
        assertEquals(JISX0213String.length("\u668C"), 1);
        assertFalse(JISX0213String.isValid("\u669A"));	// 暚
        assertEquals(JISX0213String.length("\u669A"), 1);
        assertFalse(JISX0213String.isValid("\u669B"));	// 暛
        assertEquals(JISX0213String.length("\u669B"), 1);
        assertFalse(JISX0213String.isValid("\u669C"));	// 暜
        assertEquals(JISX0213String.length("\u669C"), 1);
        assertFalse(JISX0213String.isValid("\u669F"));	// 暟
        assertEquals(JISX0213String.length("\u669F"), 1);
        assertFalse(JISX0213String.isValid("\u66A4"));	// 暤
        assertEquals(JISX0213String.length("\u66A4"), 1);
        assertFalse(JISX0213String.isValid("\u66C0"));	// 曀
        assertEquals(JISX0213String.length("\u66C0"), 1);
        assertFalse(JISX0213String.isValid("\u66C2"));	// 曂
        assertEquals(JISX0213String.length("\u66C2"), 1);
        assertFalse(JISX0213String.isValid("\u66C3"));	// 曃
        assertEquals(JISX0213String.length("\u66C3"), 1);
        assertFalse(JISX0213String.isValid("\u66CC"));	// 曌
        assertEquals(JISX0213String.length("\u66CC"), 1);
        assertFalse(JISX0213String.isValid("\u66CE"));	// 曎
        assertEquals(JISX0213String.length("\u66CE"), 1);
        assertFalse(JISX0213String.isValid("\u66CF"));	// 曏
        assertEquals(JISX0213String.length("\u66CF"), 1);
        assertFalse(JISX0213String.isValid("\u66D4"));	// 曔
        assertEquals(JISX0213String.length("\u66D4"), 1);
        assertFalse(JISX0213String.isValid("\u66DF"));	// 曟
        assertEquals(JISX0213String.length("\u66DF"), 1);
        assertFalse(JISX0213String.isValid("\u66EB"));	// 曫
        assertEquals(JISX0213String.length("\u66EB"), 1);
        assertFalse(JISX0213String.isValid("\u66EE"));	// 曮
        assertEquals(JISX0213String.length("\u66EE"), 1);
        assertFalse(JISX0213String.isValid("\u6707"));	// 朇
        assertEquals(JISX0213String.length("\u6707"), 1);
        assertFalse(JISX0213String.isValid("\u671C"));	// 朜
        assertEquals(JISX0213String.length("\u671C"), 1);
        assertFalse(JISX0213String.isValid("\u6720"));	// 朠
        assertEquals(JISX0213String.length("\u6720"), 1);
        assertFalse(JISX0213String.isValid("\u6722"));	// 朢
        assertEquals(JISX0213String.length("\u6722"), 1);
        assertFalse(JISX0213String.isValid("\u673E"));	// 朾
        assertEquals(JISX0213String.length("\u673E"), 1);
        assertFalse(JISX0213String.isValid("\u6745"));	// 杅
        assertEquals(JISX0213String.length("\u6745"), 1);
        assertFalse(JISX0213String.isValid("\u6755"));	// 杕
        assertEquals(JISX0213String.length("\u6755"), 1);
        assertFalse(JISX0213String.isValid("\u676C"));	// 杬
        assertEquals(JISX0213String.length("\u676C"), 1);
        assertFalse(JISX0213String.isValid("\u676E"));	// 杮
        assertEquals(JISX0213String.length("\u676E"), 1);
        assertFalse(JISX0213String.isValid("\u6784"));	// 构
        assertEquals(JISX0213String.length("\u6784"), 1);
        assertFalse(JISX0213String.isValid("\u678E"));	// 枎
        assertEquals(JISX0213String.length("\u678E"), 1);
        assertFalse(JISX0213String.isValid("\u678F"));	// 枏
        assertEquals(JISX0213String.length("\u678F"), 1);
        assertFalse(JISX0213String.isValid("\u6791"));	// 枑
        assertEquals(JISX0213String.length("\u6791"), 1);
        assertFalse(JISX0213String.isValid("\u6796"));	// 枖
        assertEquals(JISX0213String.length("\u6796"), 1);
        assertFalse(JISX0213String.isValid("\u6799"));	// 枙
        assertEquals(JISX0213String.length("\u6799"), 1);
        assertFalse(JISX0213String.isValid("\u67B1"));	// 枱
        assertEquals(JISX0213String.length("\u67B1"), 1);
        assertFalse(JISX0213String.isValid("\u67B5"));	// 枵
        assertEquals(JISX0213String.length("\u67B5"), 1);
        assertFalse(JISX0213String.isValid("\u67BC"));	// 枼
        assertEquals(JISX0213String.length("\u67BC"), 1);
        assertFalse(JISX0213String.isValid("\u67BD"));	// 枽
        assertEquals(JISX0213String.length("\u67BD"), 1);
        assertFalse(JISX0213String.isValid("\u67C2"));	// 柂
        assertEquals(JISX0213String.length("\u67C2"), 1);
        assertFalse(JISX0213String.isValid("\u67C5"));	// 柅
        assertEquals(JISX0213String.length("\u67C5"), 1);
        assertFalse(JISX0213String.isValid("\u67C9"));	// 柉
        assertEquals(JISX0213String.length("\u67C9"), 1);
        assertFalse(JISX0213String.isValid("\u67DC"));	// 柜
        assertEquals(JISX0213String.length("\u67DC"), 1);
        assertFalse(JISX0213String.isValid("\u67E1"));	// 柡
        assertEquals(JISX0213String.length("\u67E1"), 1);
        assertFalse(JISX0213String.isValid("\u67E6"));	// 柦
        assertEquals(JISX0213String.length("\u67E6"), 1);
        assertFalse(JISX0213String.isValid("\u67F2"));	// 柲
        assertEquals(JISX0213String.length("\u67F2"), 1);
        assertFalse(JISX0213String.isValid("\u67F6"));	// 柶
        assertEquals(JISX0213String.length("\u67F6"), 1);
        assertFalse(JISX0213String.isValid("\u6814"));	// 栔
        assertEquals(JISX0213String.length("\u6814"), 1);
        assertFalse(JISX0213String.isValid("\u6819"));	// 栙
        assertEquals(JISX0213String.length("\u6819"), 1);
        assertFalse(JISX0213String.isValid("\u6828"));	// 栨
        assertEquals(JISX0213String.length("\u6828"), 1);
        assertFalse(JISX0213String.isValid("\u6827"));	// 栧
        assertEquals(JISX0213String.length("\u6827"), 1);
        assertFalse(JISX0213String.isValid("\u682F"));	// 栯
        assertEquals(JISX0213String.length("\u682F"), 1);
        assertFalse(JISX0213String.isValid("\u6830"));	// 栰
        assertEquals(JISX0213String.length("\u6830"), 1);
        assertFalse(JISX0213String.isValid("\u683F"));	// 栿
        assertEquals(JISX0213String.length("\u683F"), 1);
        assertFalse(JISX0213String.isValid("\u684A"));	// 桊
        assertEquals(JISX0213String.length("\u684A"), 1);
        assertFalse(JISX0213String.isValid("\u6858"));	// 桘
        assertEquals(JISX0213String.length("\u6858"), 1);
        assertFalse(JISX0213String.isValid("\u686F"));	// 桯
        assertEquals(JISX0213String.length("\u686F"), 1);
        assertFalse(JISX0213String.isValid("\u6870"));	// 桰
        assertEquals(JISX0213String.length("\u6870"), 1);
        assertFalse(JISX0213String.isValid("\u6871"));	// 桱
        assertEquals(JISX0213String.length("\u6871"), 1);
        assertFalse(JISX0213String.isValid("\u6879"));	// 桹
        assertEquals(JISX0213String.length("\u6879"), 1);
        assertFalse(JISX0213String.isValid("\u687B"));	// 桻
        assertEquals(JISX0213String.length("\u687B"), 1);
        assertFalse(JISX0213String.isValid("\u6884"));	// 梄
        assertEquals(JISX0213String.length("\u6884"), 1);
        assertFalse(JISX0213String.isValid("\u6886"));	// 梆
        assertEquals(JISX0213String.length("\u6886"), 1);
        assertFalse(JISX0213String.isValid("\u6888"));	// 梈
        assertEquals(JISX0213String.length("\u6888"), 1);
        assertFalse(JISX0213String.isValid("\u68A1"));	// 梡
        assertEquals(JISX0213String.length("\u68A1"), 1);
        assertFalse(JISX0213String.isValid("\u68A9"));	// 梩
        assertEquals(JISX0213String.length("\u68A9"), 1);
        assertFalse(JISX0213String.isValid("\u68AE"));	// 梮
        assertEquals(JISX0213String.length("\u68AE"), 1);
        assertFalse(JISX0213String.isValid("\u68D1"));	// 棑
        assertEquals(JISX0213String.length("\u68D1"), 1);
        assertFalse(JISX0213String.isValid("\u68D3"));	// 棓
        assertEquals(JISX0213String.length("\u68D3"), 1);
        assertFalse(JISX0213String.isValid("\u68DC"));	// 棜
        assertEquals(JISX0213String.length("\u68DC"), 1);
        assertFalse(JISX0213String.isValid("\u68DD"));	// 棝
        assertEquals(JISX0213String.length("\u68DD"), 1);
        assertFalse(JISX0213String.isValid("\u68EA"));	// 棪
        assertEquals(JISX0213String.length("\u68EA"), 1);
        assertFalse(JISX0213String.isValid("\u68EB"));	// 棫
        assertEquals(JISX0213String.length("\u68EB"), 1);
        assertFalse(JISX0213String.isValid("\u68F5"));	// 棵
        assertEquals(JISX0213String.length("\u68F5"), 1);
        assertFalse(JISX0213String.isValid("\u68F6"));	// 棶
        assertEquals(JISX0213String.length("\u68F6"), 1);
        assertFalse(JISX0213String.isValid("\u68FD"));	// 棽
        assertEquals(JISX0213String.length("\u68FD"), 1);
        assertFalse(JISX0213String.isValid("\u6906"));	// 椆
        assertEquals(JISX0213String.length("\u6906"), 1);
        assertFalse(JISX0213String.isValid("\u6909"));	// 椉
        assertEquals(JISX0213String.length("\u6909"), 1);
        assertFalse(JISX0213String.isValid("\u6910"));	// 椐
        assertEquals(JISX0213String.length("\u6910"), 1);
        assertFalse(JISX0213String.isValid("\u6911"));	// 椑
        assertEquals(JISX0213String.length("\u6911"), 1);
        assertFalse(JISX0213String.isValid("\u6913"));	// 椓
        assertEquals(JISX0213String.length("\u6913"), 1);
        assertFalse(JISX0213String.isValid("\u6916"));	// 椖
        assertEquals(JISX0213String.length("\u6916"), 1);
        assertFalse(JISX0213String.isValid("\u6917"));	// 椗
        assertEquals(JISX0213String.length("\u6917"), 1);
        assertFalse(JISX0213String.isValid("\u6931"));	// 椱
        assertEquals(JISX0213String.length("\u6931"), 1);
        assertFalse(JISX0213String.isValid("\u6933"));	// 椳
        assertEquals(JISX0213String.length("\u6933"), 1);
        assertFalse(JISX0213String.isValid("\u6938"));	// 椸
        assertEquals(JISX0213String.length("\u6938"), 1);
        assertFalse(JISX0213String.isValid("\u6945"));	// 楅
        assertEquals(JISX0213String.length("\u6945"), 1);
        assertFalse(JISX0213String.isValid("\u694E"));	// 楎
        assertEquals(JISX0213String.length("\u694E"), 1);
        assertFalse(JISX0213String.isValid("\u695B"));	// 楛
        assertEquals(JISX0213String.length("\u695B"), 1);
        assertFalse(JISX0213String.isValid("\u6965"));	// 楥
        assertEquals(JISX0213String.length("\u6965"), 1);
        assertFalse(JISX0213String.isValid("\u6966"));	// 楦
        assertEquals(JISX0213String.length("\u6966"), 1);
        assertFalse(JISX0213String.isValid("\u6970"));	// 楰
        assertEquals(JISX0213String.length("\u6970"), 1);
        assertFalse(JISX0213String.isValid("\u6971"));	// 楱
        assertEquals(JISX0213String.length("\u6971"), 1);
        assertFalse(JISX0213String.isValid("\u697B"));	// 楻
        assertEquals(JISX0213String.length("\u697B"), 1);
        assertFalse(JISX0213String.isValid("\u698D"));	// 榍
        assertEquals(JISX0213String.length("\u698D"), 1);
        assertFalse(JISX0213String.isValid("\u69A1"));	// 榡
        assertEquals(JISX0213String.length("\u69A1"), 1);
        assertFalse(JISX0213String.isValid("\u69A8"));	// 榨
        assertEquals(JISX0213String.length("\u69A8"), 1);
        assertFalse(JISX0213String.isValid("\u69AB"));	// 榫
        assertEquals(JISX0213String.length("\u69AB"), 1);
        assertFalse(JISX0213String.isValid("\u69AF"));	// 榯
        assertEquals(JISX0213String.length("\u69AF"), 1);
        assertFalse(JISX0213String.isValid("\u69B8"));	// 榸
        assertEquals(JISX0213String.length("\u69B8"), 1);
        assertFalse(JISX0213String.isValid("\u69C5"));	// 槅
        assertEquals(JISX0213String.length("\u69C5"), 1);
        assertFalse(JISX0213String.isValid("\u69C8"));	// 槈
        assertEquals(JISX0213String.length("\u69C8"), 1);
        assertFalse(JISX0213String.isValid("\u69D7"));	// 槗
        assertEquals(JISX0213String.length("\u69D7"), 1);
        assertFalse(JISX0213String.isValid("\u69E5"));	// 槥
        assertEquals(JISX0213String.length("\u69E5"), 1);
        assertFalse(JISX0213String.isValid("\u69F1"));	// 槱
        assertEquals(JISX0213String.length("\u69F1"), 1);
        assertFalse(JISX0213String.isValid("\u6A00"));	// 樀
        assertEquals(JISX0213String.length("\u6A00"), 1);
        assertFalse(JISX0213String.isValid("\u6A01"));	// 樁
        assertEquals(JISX0213String.length("\u6A01"), 1);
        assertFalse(JISX0213String.isValid("\u6A03"));	// 樃
        assertEquals(JISX0213String.length("\u6A03"), 1);
        assertFalse(JISX0213String.isValid("\u6A20"));	// 樠
        assertEquals(JISX0213String.length("\u6A20"), 1);
        assertFalse(JISX0213String.isValid("\u6A24"));	// 樤
        assertEquals(JISX0213String.length("\u6A24"), 1);
        assertFalse(JISX0213String.isValid("\u6A28"));	// 樨
        assertEquals(JISX0213String.length("\u6A28"), 1);
        assertFalse(JISX0213String.isValid("\u6A37"));	// 樷
        assertEquals(JISX0213String.length("\u6A37"), 1);
        assertFalse(JISX0213String.isValid("\u6A4A"));	// 橊
        assertEquals(JISX0213String.length("\u6A4A"), 1);
        assertFalse(JISX0213String.isValid("\u6A51"));	// 橑
        assertEquals(JISX0213String.length("\u6A51"), 1);
        assertFalse(JISX0213String.isValid("\u6A55"));	// 橕
        assertEquals(JISX0213String.length("\u6A55"), 1);
        assertFalse(JISX0213String.isValid("\u6A67"));	// 橧
        assertEquals(JISX0213String.length("\u6A67"), 1);
        assertFalse(JISX0213String.isValid("\u6A6A"));	// 橪
        assertEquals(JISX0213String.length("\u6A6A"), 1);
        assertFalse(JISX0213String.isValid("\u6A71"));	// 橱
        assertEquals(JISX0213String.length("\u6A71"), 1);
        assertFalse(JISX0213String.isValid("\u6A81"));	// 檁
        assertEquals(JISX0213String.length("\u6A81"), 1);
        assertFalse(JISX0213String.isValid("\u6A86"));	// 檆
        assertEquals(JISX0213String.length("\u6A86"), 1);
        assertFalse(JISX0213String.isValid("\u6A87"));	// 檇
        assertEquals(JISX0213String.length("\u6A87"), 1);
        assertFalse(JISX0213String.isValid("\u6A9B"));	// 檛
        assertEquals(JISX0213String.length("\u6A9B"), 1);
        assertFalse(JISX0213String.isValid("\u6AAF"));	// 檯
        assertEquals(JISX0213String.length("\u6AAF"), 1);
        assertFalse(JISX0213String.isValid("\u6AB0"));	// 檰
        assertEquals(JISX0213String.length("\u6AB0"), 1);
        assertFalse(JISX0213String.isValid("\u6AB1"));	// 檱
        assertEquals(JISX0213String.length("\u6AB1"), 1);
        assertFalse(JISX0213String.isValid("\u6AB4"));	// 檴
        assertEquals(JISX0213String.length("\u6AB4"), 1);
        assertFalse(JISX0213String.isValid("\u6ABE"));	// 檾
        assertEquals(JISX0213String.length("\u6ABE"), 1);
        assertFalse(JISX0213String.isValid("\u6ABF"));	// 檿
        assertEquals(JISX0213String.length("\u6ABF"), 1);
        assertFalse(JISX0213String.isValid("\u6AC9"));	// 櫉
        assertEquals(JISX0213String.length("\u6AC9"), 1);
        assertFalse(JISX0213String.isValid("\u6AC8"));	// 櫈
        assertEquals(JISX0213String.length("\u6AC8"), 1);
        assertFalse(JISX0213String.isValid("\u6ACC"));	// 櫌
        assertEquals(JISX0213String.length("\u6ACC"), 1);
        assertFalse(JISX0213String.isValid("\u6AD5"));	// 櫕
        assertEquals(JISX0213String.length("\u6AD5"), 1);
        assertFalse(JISX0213String.isValid("\u6AD6"));	// 櫖
        assertEquals(JISX0213String.length("\u6AD6"), 1);
        assertFalse(JISX0213String.isValid("\u6AF0"));	// 櫰
        assertEquals(JISX0213String.length("\u6AF0"), 1);
        assertFalse(JISX0213String.isValid("\u6AFC"));	// 櫼
        assertEquals(JISX0213String.length("\u6AFC"), 1);
        assertFalse(JISX0213String.isValid("\u6B02"));	// 欂
        assertEquals(JISX0213String.length("\u6B02"), 1);
        assertFalse(JISX0213String.isValid("\u6B03"));	// 欃
        assertEquals(JISX0213String.length("\u6B03"), 1);
        assertFalse(JISX0213String.isValid("\u6B06"));	// 欆
        assertEquals(JISX0213String.length("\u6B06"), 1);
        assertFalse(JISX0213String.isValid("\u6B07"));	// 欇
        assertEquals(JISX0213String.length("\u6B07"), 1);
        assertFalse(JISX0213String.isValid("\u6B09"));	// 欉
        assertEquals(JISX0213String.length("\u6B09"), 1);
        assertFalse(JISX0213String.isValid("\u6B24"));	// 欤
        assertEquals(JISX0213String.length("\u6B24"), 1);
        assertFalse(JISX0213String.isValid("\u6B28"));	// 欨
        assertEquals(JISX0213String.length("\u6B28"), 1);
        assertFalse(JISX0213String.isValid("\u6B2B"));	// 欫
        assertEquals(JISX0213String.length("\u6B2B"), 1);
        assertFalse(JISX0213String.isValid("\u6B36"));	// 欶
        assertEquals(JISX0213String.length("\u6B36"), 1);
        assertFalse(JISX0213String.isValid("\u6B3B"));	// 欻
        assertEquals(JISX0213String.length("\u6B3B"), 1);
        assertFalse(JISX0213String.isValid("\u6B3F"));	// 欿
        assertEquals(JISX0213String.length("\u6B3F"), 1);
        assertFalse(JISX0213String.isValid("\u6B4D"));	// 歍
        assertEquals(JISX0213String.length("\u6B4D"), 1);
        assertFalse(JISX0213String.isValid("\u6B52"));	// 歒
        assertEquals(JISX0213String.length("\u6B52"), 1);
        assertFalse(JISX0213String.isValid("\u6B5D"));	// 歝
        assertEquals(JISX0213String.length("\u6B5D"), 1);
        assertFalse(JISX0213String.isValid("\u6B6B"));	// 歫
        assertEquals(JISX0213String.length("\u6B6B"), 1);
        assertFalse(JISX0213String.isValid("\u6B6E"));	// 歮
        assertEquals(JISX0213String.length("\u6B6E"), 1);
        assertFalse(JISX0213String.isValid("\u6B70"));	// 歰
        assertEquals(JISX0213String.length("\u6B70"), 1);
        assertFalse(JISX0213String.isValid("\u6B7D"));	// 歽
        assertEquals(JISX0213String.length("\u6B7D"), 1);
        assertFalse(JISX0213String.isValid("\u6B7E"));	// 歾
        assertEquals(JISX0213String.length("\u6B7E"), 1);
        assertFalse(JISX0213String.isValid("\u6B85"));	// 殅
        assertEquals(JISX0213String.length("\u6B85"), 1);
        assertFalse(JISX0213String.isValid("\u6B97"));	// 殗
        assertEquals(JISX0213String.length("\u6B97"), 1);
        assertFalse(JISX0213String.isValid("\u6B9F"));	// 殟
        assertEquals(JISX0213String.length("\u6B9F"), 1);
        assertFalse(JISX0213String.isValid("\u6BA0"));	// 殠
        assertEquals(JISX0213String.length("\u6BA0"), 1);
        assertFalse(JISX0213String.isValid("\u6BA2"));	// 殢
        assertEquals(JISX0213String.length("\u6BA2"), 1);
        assertFalse(JISX0213String.isValid("\u6BA3"));	// 殣
        assertEquals(JISX0213String.length("\u6BA3"), 1);
        assertFalse(JISX0213String.isValid("\u6BA8"));	// 殨
        assertEquals(JISX0213String.length("\u6BA8"), 1);
        assertFalse(JISX0213String.isValid("\u6BAC"));	// 殬
        assertEquals(JISX0213String.length("\u6BAC"), 1);
        assertFalse(JISX0213String.isValid("\u6BB0"));	// 殰
        assertEquals(JISX0213String.length("\u6BB0"), 1);
        assertFalse(JISX0213String.isValid("\u6BB8"));	// 殸
        assertEquals(JISX0213String.length("\u6BB8"), 1);
        assertFalse(JISX0213String.isValid("\u6BB9"));	// 殹
        assertEquals(JISX0213String.length("\u6BB9"), 1);
        assertFalse(JISX0213String.isValid("\u6BC3"));	// 毃
        assertEquals(JISX0213String.length("\u6BC3"), 1);
        assertFalse(JISX0213String.isValid("\u6BC4"));	// 毄
        assertEquals(JISX0213String.length("\u6BC4"), 1);
        assertFalse(JISX0213String.isValid("\u6BCC"));	// 毌
        assertEquals(JISX0213String.length("\u6BCC"), 1);
        assertFalse(JISX0213String.isValid("\u6BE1"));	// 毡
        assertEquals(JISX0213String.length("\u6BE1"), 1);
        assertFalse(JISX0213String.isValid("\u6BE3"));	// 毣
        assertEquals(JISX0213String.length("\u6BE3"), 1);
        assertFalse(JISX0213String.isValid("\u6BF7"));	// 毷
        assertEquals(JISX0213String.length("\u6BF7"), 1);
        assertFalse(JISX0213String.isValid("\u6BF9"));	// 毹
        assertEquals(JISX0213String.length("\u6BF9"), 1);
        assertFalse(JISX0213String.isValid("\u6C04"));	// 氄
        assertEquals(JISX0213String.length("\u6C04"), 1);
        assertFalse(JISX0213String.isValid("\u6C09"));	// 氉
        assertEquals(JISX0213String.length("\u6C09"), 1);
        assertFalse(JISX0213String.isValid("\u6C0D"));	// 氍
        assertEquals(JISX0213String.length("\u6C0D"), 1);
        assertFalse(JISX0213String.isValid("\u6C12"));	// 氒
        assertEquals(JISX0213String.length("\u6C12"), 1);
        assertFalse(JISX0213String.isValid("\u6C19"));	// 氙
        assertEquals(JISX0213String.length("\u6C19"), 1);
        assertFalse(JISX0213String.isValid("\u6C1F"));	// 氟
        assertEquals(JISX0213String.length("\u6C1F"), 1);
        assertFalse(JISX0213String.isValid("\u6C26"));	// 氦
        assertEquals(JISX0213String.length("\u6C26"), 1);
        assertFalse(JISX0213String.isValid("\u6C27"));	// 氧
        assertEquals(JISX0213String.length("\u6C27"), 1);
        assertFalse(JISX0213String.isValid("\u6C28"));	// 氨
        assertEquals(JISX0213String.length("\u6C28"), 1);
        assertFalse(JISX0213String.isValid("\u6C2C"));	// 氬
        assertEquals(JISX0213String.length("\u6C2C"), 1);
        assertFalse(JISX0213String.isValid("\u6C2E"));	// 氮
        assertEquals(JISX0213String.length("\u6C2E"), 1);
        assertFalse(JISX0213String.isValid("\u6C3B"));	// 氻
        assertEquals(JISX0213String.length("\u6C3B"), 1);
        assertFalse(JISX0213String.isValid("\u6C4A"));	// 汊
        assertEquals(JISX0213String.length("\u6C4A"), 1);
        assertFalse(JISX0213String.isValid("\u6C4B"));	// 汋
        assertEquals(JISX0213String.length("\u6C4B"), 1);
        assertFalse(JISX0213String.isValid("\u6C4F"));	// 汏
        assertEquals(JISX0213String.length("\u6C4F"), 1);
        assertFalse(JISX0213String.isValid("\u6C52"));	// 汒
        assertEquals(JISX0213String.length("\u6C52"), 1);
        assertFalse(JISX0213String.isValid("\u6C54"));	// 汔
        assertEquals(JISX0213String.length("\u6C54"), 1);
        assertFalse(JISX0213String.isValid("\u6C6B"));	// 汫
        assertEquals(JISX0213String.length("\u6C6B"), 1);
        assertFalse(JISX0213String.isValid("\u6C78"));	// 汸
        assertEquals(JISX0213String.length("\u6C78"), 1);
        assertFalse(JISX0213String.isValid("\u6C79"));	// 汹
        assertEquals(JISX0213String.length("\u6C79"), 1);
        assertFalse(JISX0213String.isValid("\u6C7B"));	// 汻
        assertEquals(JISX0213String.length("\u6C7B"), 1);
        assertFalse(JISX0213String.isValid("\u6C87"));	// 沇
        assertEquals(JISX0213String.length("\u6C87"), 1);
        assertFalse(JISX0213String.isValid("\u6C9F"));	// 沟
        assertEquals(JISX0213String.length("\u6C9F"), 1);
        assertFalse(JISX0213String.isValid("\u6CB0"));	// 沰
        assertEquals(JISX0213String.length("\u6CB0"), 1);
        assertFalse(JISX0213String.isValid("\u6CB2"));	// 沲
        assertEquals(JISX0213String.length("\u6CB2"), 1);
        assertFalse(JISX0213String.isValid("\u6CB4"));	// 沴
        assertEquals(JISX0213String.length("\u6CB4"), 1);
        assertFalse(JISX0213String.isValid("\u6CCD"));	// 泍
        assertEquals(JISX0213String.length("\u6CCD"), 1);
        assertFalse(JISX0213String.isValid("\u6CCF"));	// 泏
        assertEquals(JISX0213String.length("\u6CCF"), 1);
        assertFalse(JISX0213String.isValid("\u6CD1"));	// 泑
        assertEquals(JISX0213String.length("\u6CD1"), 1);
        assertFalse(JISX0213String.isValid("\u6CD2"));	// 泒
        assertEquals(JISX0213String.length("\u6CD2"), 1);
        assertFalse(JISX0213String.isValid("\u6CE7"));	// 泧
        assertEquals(JISX0213String.length("\u6CE7"), 1);
        assertFalse(JISX0213String.isValid("\u6CF2"));	// 泲
        assertEquals(JISX0213String.length("\u6CF2"), 1);
        assertFalse(JISX0213String.isValid("\u6CF4"));	// 泴
        assertEquals(JISX0213String.length("\u6CF4"), 1);
        assertFalse(JISX0213String.isValid("\u6D07"));	// 洇
        assertEquals(JISX0213String.length("\u6D07"), 1);
        assertFalse(JISX0213String.isValid("\u6D0F"));	// 洏
        assertEquals(JISX0213String.length("\u6D0F"), 1);
        assertFalse(JISX0213String.isValid("\u6D11"));	// 洑
        assertEquals(JISX0213String.length("\u6D11"), 1);
        assertFalse(JISX0213String.isValid("\u6D13"));	// 洓
        assertEquals(JISX0213String.length("\u6D13"), 1);
        assertFalse(JISX0213String.isValid("\u6D1A"));	// 洚
        assertEquals(JISX0213String.length("\u6D1A"), 1);
        assertFalse(JISX0213String.isValid("\u6D28"));	// 洨
        assertEquals(JISX0213String.length("\u6D28"), 1);
        assertFalse(JISX0213String.isValid("\u6D57"));	// 浗
        assertEquals(JISX0213String.length("\u6D57"), 1);
        assertFalse(JISX0213String.isValid("\u6D5F"));	// 浟
        assertEquals(JISX0213String.length("\u6D5F"), 1);
        assertFalse(JISX0213String.isValid("\u6D61"));	// 浡
        assertEquals(JISX0213String.length("\u6D61"), 1);
        assertFalse(JISX0213String.isValid("\u6D67"));	// 浧
        assertEquals(JISX0213String.length("\u6D67"), 1);
        assertFalse(JISX0213String.isValid("\u6D7C"));	// 浼
        assertEquals(JISX0213String.length("\u6D7C"), 1);
        assertFalse(JISX0213String.isValid("\u6D92"));	// 涒
        assertEquals(JISX0213String.length("\u6D92"), 1);
        assertFalse(JISX0213String.isValid("\u6D97"));	// 涗
        assertEquals(JISX0213String.length("\u6D97"), 1);
        assertFalse(JISX0213String.isValid("\u6DB7"));	// 涷
        assertEquals(JISX0213String.length("\u6DB7"), 1);
        assertFalse(JISX0213String.isValid("\u6DB9"));	// 涹
        assertEquals(JISX0213String.length("\u6DB9"), 1);
        assertFalse(JISX0213String.isValid("\u6DBD"));	// 涽
        assertEquals(JISX0213String.length("\u6DBD"), 1);
        assertFalse(JISX0213String.isValid("\u6DCA"));	// 淊
        assertEquals(JISX0213String.length("\u6DCA"), 1);
        assertFalse(JISX0213String.isValid("\u6DE0"));	// 淠
        assertEquals(JISX0213String.length("\u6DE0"), 1);
        assertFalse(JISX0213String.isValid("\u6DE2"));	// 淢
        assertEquals(JISX0213String.length("\u6DE2"), 1);
        assertFalse(JISX0213String.isValid("\u6DE5"));	// 淥
        assertEquals(JISX0213String.length("\u6DE5"), 1);
        assertFalse(JISX0213String.isValid("\u6DEF"));	// 淯
        assertEquals(JISX0213String.length("\u6DEF"), 1);
        assertFalse(JISX0213String.isValid("\u6DF0"));	// 淰
        assertEquals(JISX0213String.length("\u6DF0"), 1);
        assertFalse(JISX0213String.isValid("\u6DF4"));	// 淴
        assertEquals(JISX0213String.length("\u6DF4"), 1);
        assertFalse(JISX0213String.isValid("\u6E00"));	// 渀
        assertEquals(JISX0213String.length("\u6E00"), 1);
        assertFalse(JISX0213String.isValid("\u6E04"));	// 渄
        assertEquals(JISX0213String.length("\u6E04"), 1);
        assertFalse(JISX0213String.isValid("\u6E3B"));	// 渻
        assertEquals(JISX0213String.length("\u6E3B"), 1);
        assertFalse(JISX0213String.isValid("\u6E45"));	// 湅
        assertEquals(JISX0213String.length("\u6E45"), 1);
        assertFalse(JISX0213String.isValid("\u6E52"));	// 湒
        assertEquals(JISX0213String.length("\u6E52"), 1);
        assertFalse(JISX0213String.isValid("\u6E5D"));	// 湝
        assertEquals(JISX0213String.length("\u6E5D"), 1);
        assertFalse(JISX0213String.isValid("\u6E62"));	// 湢
        assertEquals(JISX0213String.length("\u6E62"), 1);
        assertFalse(JISX0213String.isValid("\u6E68"));	// 湨
        assertEquals(JISX0213String.length("\u6E68"), 1);
        assertFalse(JISX0213String.isValid("\u6E73"));	// 湳
        assertEquals(JISX0213String.length("\u6E73"), 1);
        assertFalse(JISX0213String.isValid("\u6E7B"));	// 湻
        assertEquals(JISX0213String.length("\u6E7B"), 1);
        assertFalse(JISX0213String.isValid("\u6E7D"));	// 湽
        assertEquals(JISX0213String.length("\u6E7D"), 1);
        assertFalse(JISX0213String.isValid("\u6E8D"));	// 溍
        assertEquals(JISX0213String.length("\u6E8D"), 1);
        assertFalse(JISX0213String.isValid("\u6E99"));	// 溙
        assertEquals(JISX0213String.length("\u6E99"), 1);
        assertFalse(JISX0213String.isValid("\u6EA0"));	// 溠
        assertEquals(JISX0213String.length("\u6EA0"), 1);
        assertFalse(JISX0213String.isValid("\u6EAD"));	// 溭
        assertEquals(JISX0213String.length("\u6EAD"), 1);
        assertFalse(JISX0213String.isValid("\u6EAE"));	// 溮
        assertEquals(JISX0213String.length("\u6EAE"), 1);
        assertFalse(JISX0213String.isValid("\u6EB3"));	// 溳
        assertEquals(JISX0213String.length("\u6EB3"), 1);
        assertFalse(JISX0213String.isValid("\u6EBB"));	// 溻
        assertEquals(JISX0213String.length("\u6EBB"), 1);
        assertFalse(JISX0213String.isValid("\u6EC0"));	// 滀
        assertEquals(JISX0213String.length("\u6EC0"), 1);
        assertFalse(JISX0213String.isValid("\u6EC8"));	// 滈
        assertEquals(JISX0213String.length("\u6EC8"), 1);
        assertFalse(JISX0213String.isValid("\u6ECD"));	// 滍
        assertEquals(JISX0213String.length("\u6ECD"), 1);
        assertFalse(JISX0213String.isValid("\u6ECF"));	// 滏
        assertEquals(JISX0213String.length("\u6ECF"), 1);
        assertFalse(JISX0213String.isValid("\u6EED"));	// 滭
        assertEquals(JISX0213String.length("\u6EED"), 1);
        assertFalse(JISX0213String.isValid("\u6EEE"));	// 滮
        assertEquals(JISX0213String.length("\u6EEE"), 1);
        assertFalse(JISX0213String.isValid("\u6EFD"));	// 滽
        assertEquals(JISX0213String.length("\u6EFD"), 1);
        assertFalse(JISX0213String.isValid("\u6F04"));	// 漄
        assertEquals(JISX0213String.length("\u6F04"), 1);
        assertFalse(JISX0213String.isValid("\u6F08"));	// 漈
        assertEquals(JISX0213String.length("\u6F08"), 1);
        assertFalse(JISX0213String.isValid("\u6F0D"));	// 漍
        assertEquals(JISX0213String.length("\u6F0D"), 1);
        assertFalse(JISX0213String.isValid("\u6F16"));	// 漖
        assertEquals(JISX0213String.length("\u6F16"), 1);
        assertFalse(JISX0213String.isValid("\u6F1B"));	// 漛
        assertEquals(JISX0213String.length("\u6F1B"), 1);
        assertFalse(JISX0213String.isValid("\u6F26"));	// 漦
        assertEquals(JISX0213String.length("\u6F26"), 1);
        assertFalse(JISX0213String.isValid("\u6F29"));	// 漩
        assertEquals(JISX0213String.length("\u6F29"), 1);
        assertFalse(JISX0213String.isValid("\u6F30"));	// 漰
        assertEquals(JISX0213String.length("\u6F30"), 1);
        assertFalse(JISX0213String.isValid("\u6F3B"));	// 漻
        assertEquals(JISX0213String.length("\u6F3B"), 1);
        assertFalse(JISX0213String.isValid("\u6F2D"));	// 漭
        assertEquals(JISX0213String.length("\u6F2D"), 1);
        assertFalse(JISX0213String.isValid("\u6F4F"));	// 潏
        assertEquals(JISX0213String.length("\u6F4F"), 1);
        assertFalse(JISX0213String.isValid("\u6F53"));	// 潓
        assertEquals(JISX0213String.length("\u6F53"), 1);
        assertFalse(JISX0213String.isValid("\u6F5D"));	// 潝
        assertEquals(JISX0213String.length("\u6F5D"), 1);
        assertFalse(JISX0213String.isValid("\u6F6C"));	// 潬
        assertEquals(JISX0213String.length("\u6F6C"), 1);
        assertFalse(JISX0213String.isValid("\u6F83"));	// 澃
        assertEquals(JISX0213String.length("\u6F83"), 1);
        assertFalse(JISX0213String.isValid("\u6F87"));	// 澇
        assertEquals(JISX0213String.length("\u6F87"), 1);
        assertFalse(JISX0213String.isValid("\u6F8B"));	// 澋
        assertEquals(JISX0213String.length("\u6F8B"), 1);
        assertFalse(JISX0213String.isValid("\u6F92"));	// 澒
        assertEquals(JISX0213String.length("\u6F92"), 1);
        assertFalse(JISX0213String.isValid("\u6F93"));	// 澓
        assertEquals(JISX0213String.length("\u6F93"), 1);
        assertFalse(JISX0213String.isValid("\u6F9A"));	// 澚
        assertEquals(JISX0213String.length("\u6F9A"), 1);
        assertFalse(JISX0213String.isValid("\u6FA6"));	// 澦
        assertEquals(JISX0213String.length("\u6FA6"), 1);
        assertFalse(JISX0213String.isValid("\u6FA8"));	// 澨
        assertEquals(JISX0213String.length("\u6FA8"), 1);
        assertFalse(JISX0213String.isValid("\u6FAE"));	// 澮
        assertEquals(JISX0213String.length("\u6FAE"), 1);
        assertFalse(JISX0213String.isValid("\u6FB0"));	// 澰
        assertEquals(JISX0213String.length("\u6FB0"), 1);
        assertFalse(JISX0213String.isValid("\u6FC5"));	// 濅
        assertEquals(JISX0213String.length("\u6FC5"), 1);
        assertFalse(JISX0213String.isValid("\u6FE8"));	// 濨
        assertEquals(JISX0213String.length("\u6FE8"), 1);
        assertFalse(JISX0213String.isValid("\u6FFD"));	// 濽
        assertEquals(JISX0213String.length("\u6FFD"), 1);
        assertFalse(JISX0213String.isValid("\u700D"));	// 瀍
        assertEquals(JISX0213String.length("\u700D"), 1);
        assertFalse(JISX0213String.isValid("\u7017"));	// 瀗
        assertEquals(JISX0213String.length("\u7017"), 1);
        assertFalse(JISX0213String.isValid("\u7020"));	// 瀠
        assertEquals(JISX0213String.length("\u7020"), 1);
        assertFalse(JISX0213String.isValid("\u702F"));	// 瀯
        assertEquals(JISX0213String.length("\u702F"), 1);
        assertFalse(JISX0213String.isValid("\u7034"));	// 瀴
        assertEquals(JISX0213String.length("\u7034"), 1);
        assertFalse(JISX0213String.isValid("\u7037"));	// 瀷
        assertEquals(JISX0213String.length("\u7037"), 1);
        assertFalse(JISX0213String.isValid("\u7044"));	// 灄
        assertEquals(JISX0213String.length("\u7044"), 1);
        assertFalse(JISX0213String.isValid("\u7048"));	// 灈
        assertEquals(JISX0213String.length("\u7048"), 1);
        assertFalse(JISX0213String.isValid("\u7049"));	// 灉
        assertEquals(JISX0213String.length("\u7049"), 1);
        assertFalse(JISX0213String.isValid("\u7055"));	// 灕
        assertEquals(JISX0213String.length("\u7055"), 1);
        assertFalse(JISX0213String.isValid("\u7094"));	// 炔
        assertEquals(JISX0213String.length("\u7094"), 1);
        assertFalse(JISX0213String.isValid("\u7096"));	// 炖
        assertEquals(JISX0213String.length("\u7096"), 1);
        assertFalse(JISX0213String.isValid("\u7098"));	// 炘
        assertEquals(JISX0213String.length("\u7098"), 1);
        assertFalse(JISX0213String.isValid("\u709B"));	// 炛
        assertEquals(JISX0213String.length("\u709B"), 1);
        assertFalse(JISX0213String.isValid("\u70B0"));	// 炰
        assertEquals(JISX0213String.length("\u70B0"), 1);
        assertFalse(JISX0213String.isValid("\u70B4"));	// 炴
        assertEquals(JISX0213String.length("\u70B4"), 1);
        assertFalse(JISX0213String.isValid("\u70D5"));	// 烕
        assertEquals(JISX0213String.length("\u70D5"), 1);
        assertFalse(JISX0213String.isValid("\u70D6"));	// 烖
        assertEquals(JISX0213String.length("\u70D6"), 1);
        assertFalse(JISX0213String.isValid("\u70FA"));	// 烺
        assertEquals(JISX0213String.length("\u70FA"), 1);
        assertFalse(JISX0213String.isValid("\u7105"));	// 焅
        assertEquals(JISX0213String.length("\u7105"), 1);
        assertFalse(JISX0213String.isValid("\u710B"));	// 焋
        assertEquals(JISX0213String.length("\u710B"), 1);
        assertFalse(JISX0213String.isValid("\u712D"));	// 焭
        assertEquals(JISX0213String.length("\u712D"), 1);
        assertFalse(JISX0213String.isValid("\u7138"));	// 焸
        assertEquals(JISX0213String.length("\u7138"), 1);
        assertFalse(JISX0213String.isValid("\u7141"));	// 煁
        assertEquals(JISX0213String.length("\u7141"), 1);
        assertFalse(JISX0213String.isValid("\u7145"));	// 煅
        assertEquals(JISX0213String.length("\u7145"), 1);
        assertFalse(JISX0213String.isValid("\u714B"));	// 煋
        assertEquals(JISX0213String.length("\u714B"), 1);
        assertFalse(JISX0213String.isValid("\u7157"));	// 煗
        assertEquals(JISX0213String.length("\u7157"), 1);
        assertFalse(JISX0213String.isValid("\u715A"));	// 煚
        assertEquals(JISX0213String.length("\u715A"), 1);
        assertFalse(JISX0213String.isValid("\u7179"));	// 煹
        assertEquals(JISX0213String.length("\u7179"), 1);
        assertFalse(JISX0213String.isValid("\u718C"));	// 熌
        assertEquals(JISX0213String.length("\u718C"), 1);
        assertFalse(JISX0213String.isValid("\u719A"));	// 熚
        assertEquals(JISX0213String.length("\u719A"), 1);
        assertFalse(JISX0213String.isValid("\u71B0"));	// 熰
        assertEquals(JISX0213String.length("\u71B0"), 1);
        assertFalse(JISX0213String.isValid("\u71B2"));	// 熲
        assertEquals(JISX0213String.length("\u71B2"), 1);
        assertFalse(JISX0213String.isValid("\u71BF"));	// 熿
        assertEquals(JISX0213String.length("\u71BF"), 1);
        assertFalse(JISX0213String.isValid("\u71C0"));	// 燀
        assertEquals(JISX0213String.length("\u71C0"), 1);
        assertFalse(JISX0213String.isValid("\u71CC"));	// 燌
        assertEquals(JISX0213String.length("\u71CC"), 1);
        assertFalse(JISX0213String.isValid("\u71D6"));	// 燖
        assertEquals(JISX0213String.length("\u71D6"), 1);
        assertFalse(JISX0213String.isValid("\u71DA"));	// 燚
        assertEquals(JISX0213String.length("\u71DA"), 1);
        assertFalse(JISX0213String.isValid("\u71F8"));	// 燸
        assertEquals(JISX0213String.length("\u71F8"), 1);
        assertFalse(JISX0213String.isValid("\u7208"));	// 爈
        assertEquals(JISX0213String.length("\u7208"), 1);
        assertFalse(JISX0213String.isValid("\u7209"));	// 爉
        assertEquals(JISX0213String.length("\u7209"), 1);
        assertFalse(JISX0213String.isValid("\u7213"));	// 爓
        assertEquals(JISX0213String.length("\u7213"), 1);
        assertFalse(JISX0213String.isValid("\u7217"));	// 爗
        assertEquals(JISX0213String.length("\u7217"), 1);
        assertFalse(JISX0213String.isValid("\u721A"));	// 爚
        assertEquals(JISX0213String.length("\u721A"), 1);
        assertFalse(JISX0213String.isValid("\u721D"));	// 爝
        assertEquals(JISX0213String.length("\u721D"), 1);
        assertFalse(JISX0213String.isValid("\u721F"));	// 爟
        assertEquals(JISX0213String.length("\u721F"), 1);
        assertFalse(JISX0213String.isValid("\u7224"));	// 爤
        assertEquals(JISX0213String.length("\u7224"), 1);
        assertFalse(JISX0213String.isValid("\u722F"));	// 爯
        assertEquals(JISX0213String.length("\u722F"), 1);
        assertFalse(JISX0213String.isValid("\u7241"));	// 牁
        assertEquals(JISX0213String.length("\u7241"), 1);
        assertFalse(JISX0213String.isValid("\u7243"));	// 牃
        assertEquals(JISX0213String.length("\u7243"), 1);
        assertFalse(JISX0213String.isValid("\u7245"));	// 牅
        assertEquals(JISX0213String.length("\u7245"), 1);
        assertFalse(JISX0213String.isValid("\u724E"));	// 牎
        assertEquals(JISX0213String.length("\u724E"), 1);
        assertFalse(JISX0213String.isValid("\u724F"));	// 牏
        assertEquals(JISX0213String.length("\u724F"), 1);
        assertFalse(JISX0213String.isValid("\u7250"));	// 牐
        assertEquals(JISX0213String.length("\u7250"), 1);
        assertFalse(JISX0213String.isValid("\u725A"));	// 牚
        assertEquals(JISX0213String.length("\u725A"), 1);
        assertFalse(JISX0213String.isValid("\u725C"));	// 牜
        assertEquals(JISX0213String.length("\u725C"), 1);
        assertFalse(JISX0213String.isValid("\u725E"));	// 牞
        assertEquals(JISX0213String.length("\u725E"), 1);
        assertFalse(JISX0213String.isValid("\u7260"));	// 牠
        assertEquals(JISX0213String.length("\u7260"), 1);
        assertFalse(JISX0213String.isValid("\u7268"));	// 牨
        assertEquals(JISX0213String.length("\u7268"), 1);
        assertFalse(JISX0213String.isValid("\u726B"));	// 牫
        assertEquals(JISX0213String.length("\u726B"), 1);
        assertFalse(JISX0213String.isValid("\u7271"));	// 牱
        assertEquals(JISX0213String.length("\u7271"), 1);
        assertFalse(JISX0213String.isValid("\u7277"));	// 牷
        assertEquals(JISX0213String.length("\u7277"), 1);
        assertFalse(JISX0213String.isValid("\u727B"));	// 牻
        assertEquals(JISX0213String.length("\u727B"), 1);
        assertFalse(JISX0213String.isValid("\u727C"));	// 牼
        assertEquals(JISX0213String.length("\u727C"), 1);
        assertFalse(JISX0213String.isValid("\u7284"));	// 犄
        assertEquals(JISX0213String.length("\u7284"), 1);
        assertFalse(JISX0213String.isValid("\u7289"));	// 犉
        assertEquals(JISX0213String.length("\u7289"), 1);
        assertFalse(JISX0213String.isValid("\u7293"));	// 犓
        assertEquals(JISX0213String.length("\u7293"), 1);
        assertFalse(JISX0213String.isValid("\u72A8"));	// 犨
        assertEquals(JISX0213String.length("\u72A8"), 1);
        assertFalse(JISX0213String.isValid("\u72B4"));	// 犴
        assertEquals(JISX0213String.length("\u72B4"), 1);
        assertFalse(JISX0213String.isValid("\u72C7"));	// 狇
        assertEquals(JISX0213String.length("\u72C7"), 1);
        assertFalse(JISX0213String.isValid("\u72C9"));	// 狉
        assertEquals(JISX0213String.length("\u72C9"), 1);
        assertFalse(JISX0213String.isValid("\u72D5"));	// 狕
        assertEquals(JISX0213String.length("\u72D5"), 1);
        assertFalse(JISX0213String.isValid("\u72D6"));	// 狖
        assertEquals(JISX0213String.length("\u72D6"), 1);
        assertFalse(JISX0213String.isValid("\u72D8"));	// 狘
        assertEquals(JISX0213String.length("\u72D8"), 1);
        assertFalse(JISX0213String.isValid("\u72DF"));	// 狟
        assertEquals(JISX0213String.length("\u72DF"), 1);
        assertFalse(JISX0213String.isValid("\u72E5"));	// 狥
        assertEquals(JISX0213String.length("\u72E5"), 1);
        assertFalse(JISX0213String.isValid("\u72F4"));	// 狴
        assertEquals(JISX0213String.length("\u72F4"), 1);
        assertFalse(JISX0213String.isValid("\u72FE"));	// 狾
        assertEquals(JISX0213String.length("\u72FE"), 1);
        assertFalse(JISX0213String.isValid("\u7302"));	// 猂
        assertEquals(JISX0213String.length("\u7302"), 1);
        assertFalse(JISX0213String.isValid("\u7304"));	// 猄
        assertEquals(JISX0213String.length("\u7304"), 1);
        assertFalse(JISX0213String.isValid("\u7305"));	// 猅
        assertEquals(JISX0213String.length("\u7305"), 1);
        assertFalse(JISX0213String.isValid("\u730B"));	// 猋
        assertEquals(JISX0213String.length("\u730B"), 1);
        assertFalse(JISX0213String.isValid("\u730D"));	// 猍
        assertEquals(JISX0213String.length("\u730D"), 1);
        assertFalse(JISX0213String.isValid("\u7313"));	// 猓
        assertEquals(JISX0213String.length("\u7313"), 1);
        assertFalse(JISX0213String.isValid("\u731E"));	// 猞
        assertEquals(JISX0213String.length("\u731E"), 1);
        assertFalse(JISX0213String.isValid("\u7322"));	// 猢
        assertEquals(JISX0213String.length("\u7322"), 1);
        assertFalse(JISX0213String.isValid("\u7332"));	// 猲
        assertEquals(JISX0213String.length("\u7332"), 1);
        assertFalse(JISX0213String.isValid("\u7335"));	// 猵
        assertEquals(JISX0213String.length("\u7335"), 1);
        assertFalse(JISX0213String.isValid("\u733A"));	// 猺
        assertEquals(JISX0213String.length("\u733A"), 1);
        assertFalse(JISX0213String.isValid("\u733B"));	// 猻
        assertEquals(JISX0213String.length("\u733B"), 1);
        assertFalse(JISX0213String.isValid("\u7343"));	// 獃
        assertEquals(JISX0213String.length("\u7343"), 1);
        assertFalse(JISX0213String.isValid("\u734D"));	// 獍
        assertEquals(JISX0213String.length("\u734D"), 1);
        assertFalse(JISX0213String.isValid("\u7356"));	// 獖
        assertEquals(JISX0213String.length("\u7356"), 1);
        assertFalse(JISX0213String.isValid("\u7358"));	// 獘
        assertEquals(JISX0213String.length("\u7358"), 1);
        assertFalse(JISX0213String.isValid("\u735D"));	// 獝
        assertEquals(JISX0213String.length("\u735D"), 1);
        assertFalse(JISX0213String.isValid("\u735E"));	// 獞
        assertEquals(JISX0213String.length("\u735E"), 1);
        assertFalse(JISX0213String.isValid("\u735F"));	// 獟
        assertEquals(JISX0213String.length("\u735F"), 1);
        assertFalse(JISX0213String.isValid("\u7360"));	// 獠
        assertEquals(JISX0213String.length("\u7360"), 1);
        assertFalse(JISX0213String.isValid("\u7367"));	// 獧
        assertEquals(JISX0213String.length("\u7367"), 1);
        assertFalse(JISX0213String.isValid("\u7369"));	// 獩
        assertEquals(JISX0213String.length("\u7369"), 1);
        assertFalse(JISX0213String.isValid("\u7379"));	// 獹
        assertEquals(JISX0213String.length("\u7379"), 1);
        assertFalse(JISX0213String.isValid("\u7380"));	// 玀
        assertEquals(JISX0213String.length("\u7380"), 1);
        assertFalse(JISX0213String.isValid("\u7383"));	// 玃
        assertEquals(JISX0213String.length("\u7383"), 1);
        assertFalse(JISX0213String.isValid("\u7386"));	// 玆
        assertEquals(JISX0213String.length("\u7386"), 1);
        assertFalse(JISX0213String.isValid("\u738E"));	// 玎
        assertEquals(JISX0213String.length("\u738E"), 1);
        assertFalse(JISX0213String.isValid("\u7390"));	// 玐
        assertEquals(JISX0213String.length("\u7390"), 1);
        assertFalse(JISX0213String.isValid("\u7393"));	// 玓
        assertEquals(JISX0213String.length("\u7393"), 1);
        assertFalse(JISX0213String.isValid("\u7397"));	// 玗
        assertEquals(JISX0213String.length("\u7397"), 1);
        assertFalse(JISX0213String.isValid("\u73AA"));	// 玪
        assertEquals(JISX0213String.length("\u73AA"), 1);
        assertFalse(JISX0213String.isValid("\u73AD"));	// 玭
        assertEquals(JISX0213String.length("\u73AD"), 1);
        assertFalse(JISX0213String.isValid("\u73C6"));	// 珆
        assertEquals(JISX0213String.length("\u73C6"), 1);
        assertFalse(JISX0213String.isValid("\u73CC"));	// 珌
        assertEquals(JISX0213String.length("\u73CC"), 1);
        assertFalse(JISX0213String.isValid("\u73D3"));	// 珓
        assertEquals(JISX0213String.length("\u73D3"), 1);
        assertFalse(JISX0213String.isValid("\u73DD"));	// 珝
        assertEquals(JISX0213String.length("\u73DD"), 1);
        assertFalse(JISX0213String.isValid("\u73E6"));	// 珦
        assertEquals(JISX0213String.length("\u73E6"), 1);
        assertFalse(JISX0213String.isValid("\u73F4"));	// 珴
        assertEquals(JISX0213String.length("\u73F4"), 1);
        assertFalse(JISX0213String.isValid("\u73F7"));	// 珷
        assertEquals(JISX0213String.length("\u73F7"), 1);
        assertFalse(JISX0213String.isValid("\u73FB"));	// 珻
        assertEquals(JISX0213String.length("\u73FB"), 1);
        assertFalse(JISX0213String.isValid("\u73FD"));	// 珽
        assertEquals(JISX0213String.length("\u73FD"), 1);
        assertFalse(JISX0213String.isValid("\u73FF"));	// 珿
        assertEquals(JISX0213String.length("\u73FF"), 1);
        assertFalse(JISX0213String.isValid("\u7400"));	// 琀
        assertEquals(JISX0213String.length("\u7400"), 1);
        assertFalse(JISX0213String.isValid("\u7404"));	// 琄
        assertEquals(JISX0213String.length("\u7404"), 1);
        assertFalse(JISX0213String.isValid("\u7411"));	// 琑
        assertEquals(JISX0213String.length("\u7411"), 1);
        assertFalse(JISX0213String.isValid("\u742D"));	// 琭
        assertEquals(JISX0213String.length("\u742D"), 1);
        assertFalse(JISX0213String.isValid("\u7451"));	// 瑑
        assertEquals(JISX0213String.length("\u7451"), 1);
        assertFalse(JISX0213String.isValid("\u7466"));	// 瑦
        assertEquals(JISX0213String.length("\u7466"), 1);
        assertFalse(JISX0213String.isValid("\u7467"));	// 瑧
        assertEquals(JISX0213String.length("\u7467"), 1);
        assertFalse(JISX0213String.isValid("\u7468"));	// 瑨
        assertEquals(JISX0213String.length("\u7468"), 1);
        assertFalse(JISX0213String.isValid("\u746E"));	// 瑮
        assertEquals(JISX0213String.length("\u746E"), 1);
        assertFalse(JISX0213String.isValid("\u7472"));	// 瑲
        assertEquals(JISX0213String.length("\u7472"), 1);
        assertFalse(JISX0213String.isValid("\u7480"));	// 璀
        assertEquals(JISX0213String.length("\u7480"), 1);
        assertFalse(JISX0213String.isValid("\u748F"));	// 璏
        assertEquals(JISX0213String.length("\u748F"), 1);
        assertFalse(JISX0213String.isValid("\u7491"));	// 璑
        assertEquals(JISX0213String.length("\u7491"), 1);
        assertFalse(JISX0213String.isValid("\u749A"));	// 璚
        assertEquals(JISX0213String.length("\u749A"), 1);
        assertFalse(JISX0213String.isValid("\u74AE"));	// 璮
        assertEquals(JISX0213String.length("\u74AE"), 1);
        assertFalse(JISX0213String.isValid("\u74AF"));	// 璯
        assertEquals(JISX0213String.length("\u74AF"), 1);
        assertFalse(JISX0213String.isValid("\u74B1"));	// 璱
        assertEquals(JISX0213String.length("\u74B1"), 1);
        assertFalse(JISX0213String.isValid("\u74B2"));	// 璲
        assertEquals(JISX0213String.length("\u74B2"), 1);
        assertFalse(JISX0213String.isValid("\u74CC"));	// 瓌
        assertEquals(JISX0213String.length("\u74CC"), 1);
        assertFalse(JISX0213String.isValid("\u74D0"));	// 瓐
        assertEquals(JISX0213String.length("\u74D0"), 1);
        assertFalse(JISX0213String.isValid("\u74D3"));	// 瓓
        assertEquals(JISX0213String.length("\u74D3"), 1);
        assertFalse(JISX0213String.isValid("\u74DB"));	// 瓛
        assertEquals(JISX0213String.length("\u74DB"), 1);
        assertFalse(JISX0213String.isValid("\u74DF"));	// 瓟
        assertEquals(JISX0213String.length("\u74DF"), 1);
        assertFalse(JISX0213String.isValid("\u74E4"));	// 瓤
        assertEquals(JISX0213String.length("\u74E4"), 1);
        assertFalse(JISX0213String.isValid("\u74E8"));	// 瓨
        assertEquals(JISX0213String.length("\u74E8"), 1);
        assertFalse(JISX0213String.isValid("\u74EA"));	// 瓪
        assertEquals(JISX0213String.length("\u74EA"), 1);
        assertFalse(JISX0213String.isValid("\u74F4"));	// 瓴
        assertEquals(JISX0213String.length("\u74F4"), 1);
        assertFalse(JISX0213String.isValid("\u74FB"));	// 瓻
        assertEquals(JISX0213String.length("\u74FB"), 1);
        assertFalse(JISX0213String.isValid("\u74FC"));	// 瓼
        assertEquals(JISX0213String.length("\u74FC"), 1);
        assertFalse(JISX0213String.isValid("\u7506"));	// 甆
        assertEquals(JISX0213String.length("\u7506"), 1);
        assertFalse(JISX0213String.isValid("\u7512"));	// 甒
        assertEquals(JISX0213String.length("\u7512"), 1);
        assertFalse(JISX0213String.isValid("\u7516"));	// 甖
        assertEquals(JISX0213String.length("\u7516"), 1);
        assertFalse(JISX0213String.isValid("\u7521"));	// 甡
        assertEquals(JISX0213String.length("\u7521"), 1);
        assertFalse(JISX0213String.isValid("\u7527"));	// 甧
        assertEquals(JISX0213String.length("\u7527"), 1);
        assertFalse(JISX0213String.isValid("\u7529"));	// 甩
        assertEquals(JISX0213String.length("\u7529"), 1);
        assertFalse(JISX0213String.isValid("\u7536"));	// 甶
        assertEquals(JISX0213String.length("\u7536"), 1);
        assertFalse(JISX0213String.isValid("\u7539"));	// 甹
        assertEquals(JISX0213String.length("\u7539"), 1);
        assertFalse(JISX0213String.isValid("\u753F"));	// 甿
        assertEquals(JISX0213String.length("\u753F"), 1);
        assertFalse(JISX0213String.isValid("\u7543"));	// 畃
        assertEquals(JISX0213String.length("\u7543"), 1);
        assertFalse(JISX0213String.isValid("\u7547"));	// 畇
        assertEquals(JISX0213String.length("\u7547"), 1);
        assertFalse(JISX0213String.isValid("\u7557"));	// 畗
        assertEquals(JISX0213String.length("\u7557"), 1);
        assertFalse(JISX0213String.isValid("\u755E"));	// 畞
        assertEquals(JISX0213String.length("\u755E"), 1);
        assertFalse(JISX0213String.isValid("\u755F"));	// 畟
        assertEquals(JISX0213String.length("\u755F"), 1);
        assertFalse(JISX0213String.isValid("\u7561"));	// 畡
        assertEquals(JISX0213String.length("\u7561"), 1);
        assertFalse(JISX0213String.isValid("\u757B"));	// 畻
        assertEquals(JISX0213String.length("\u757B"), 1);
        assertFalse(JISX0213String.isValid("\u757C"));	// 畼
        assertEquals(JISX0213String.length("\u757C"), 1);
        assertFalse(JISX0213String.isValid("\u7585"));	// 疅
        assertEquals(JISX0213String.length("\u7585"), 1);
        assertFalse(JISX0213String.isValid("\u7590"));	// 疐
        assertEquals(JISX0213String.length("\u7590"), 1);
        assertFalse(JISX0213String.isValid("\u7593"));	// 疓
        assertEquals(JISX0213String.length("\u7593"), 1);
        assertFalse(JISX0213String.isValid("\u7595"));	// 疕
        assertEquals(JISX0213String.length("\u7595"), 1);
        assertFalse(JISX0213String.isValid("\u7599"));	// 疙
        assertEquals(JISX0213String.length("\u7599"), 1);
        assertFalse(JISX0213String.isValid("\u759C"));	// 疜
        assertEquals(JISX0213String.length("\u759C"), 1);
        assertFalse(JISX0213String.isValid("\u75A4"));	// 疤
        assertEquals(JISX0213String.length("\u75A4"), 1);
        assertFalse(JISX0213String.isValid("\u75B4"));	// 疴
        assertEquals(JISX0213String.length("\u75B4"), 1);
        assertFalse(JISX0213String.isValid("\u75BA"));	// 疺
        assertEquals(JISX0213String.length("\u75BA"), 1);
        assertFalse(JISX0213String.isValid("\u75C1"));	// 痁
        assertEquals(JISX0213String.length("\u75C1"), 1);
        assertFalse(JISX0213String.isValid("\u75C4"));	// 痄
        assertEquals(JISX0213String.length("\u75C4"), 1);
        assertFalse(JISX0213String.isValid("\u75CC"));	// 痌
        assertEquals(JISX0213String.length("\u75CC"), 1);
        assertFalse(JISX0213String.isValid("\u75D7"));	// 痗
        assertEquals(JISX0213String.length("\u75D7"), 1);
        assertFalse(JISX0213String.isValid("\u75DC"));	// 痜
        assertEquals(JISX0213String.length("\u75DC"), 1);
        assertFalse(JISX0213String.isValid("\u75E1"));	// 痡
        assertEquals(JISX0213String.length("\u75E1"), 1);
        assertFalse(JISX0213String.isValid("\u75EF"));	// 痯
        assertEquals(JISX0213String.length("\u75EF"), 1);
        assertFalse(JISX0213String.isValid("\u7604"));	// 瘄
        assertEquals(JISX0213String.length("\u7604"), 1);
        assertFalse(JISX0213String.isValid("\u760A"));	// 瘊
        assertEquals(JISX0213String.length("\u760A"), 1);
        assertFalse(JISX0213String.isValid("\u760C"));	// 瘌
        assertEquals(JISX0213String.length("\u760C"), 1);
        assertFalse(JISX0213String.isValid("\u7612"));	// 瘒
        assertEquals(JISX0213String.length("\u7612"), 1);
        assertFalse(JISX0213String.isValid("\u761D"));	// 瘝
        assertEquals(JISX0213String.length("\u761D"), 1);
        assertFalse(JISX0213String.isValid("\u7623"));	// 瘣
        assertEquals(JISX0213String.length("\u7623"), 1);
        assertFalse(JISX0213String.isValid("\u7629"));	// 瘩
        assertEquals(JISX0213String.length("\u7629"), 1);
        assertFalse(JISX0213String.isValid("\u7632"));	// 瘲
        assertEquals(JISX0213String.length("\u7632"), 1);
        assertFalse(JISX0213String.isValid("\u7638"));	// 瘸
        assertEquals(JISX0213String.length("\u7638"), 1);
        assertFalse(JISX0213String.isValid("\u7639"));	// 瘹
        assertEquals(JISX0213String.length("\u7639"), 1);
        assertFalse(JISX0213String.isValid("\u763A"));	// 瘺
        assertEquals(JISX0213String.length("\u763A"), 1);
        assertFalse(JISX0213String.isValid("\u764A"));	// 癊
        assertEquals(JISX0213String.length("\u764A"), 1);
        assertFalse(JISX0213String.isValid("\u7640"));	// 癀
        assertEquals(JISX0213String.length("\u7640"), 1);
        assertFalse(JISX0213String.isValid("\u7644"));	// 癄
        assertEquals(JISX0213String.length("\u7644"), 1);
        assertFalse(JISX0213String.isValid("\u7645"));	// 癅
        assertEquals(JISX0213String.length("\u7645"), 1);
        assertFalse(JISX0213String.isValid("\u7659"));	// 癙
        assertEquals(JISX0213String.length("\u7659"), 1);
        assertFalse(JISX0213String.isValid("\u765F"));	// 癟
        assertEquals(JISX0213String.length("\u765F"), 1);
        assertFalse(JISX0213String.isValid("\u7674"));	// 癴
        assertEquals(JISX0213String.length("\u7674"), 1);
        assertFalse(JISX0213String.isValid("\u7685"));	// 皅
        assertEquals(JISX0213String.length("\u7685"), 1);
        assertFalse(JISX0213String.isValid("\u768C"));	// 皌
        assertEquals(JISX0213String.length("\u768C"), 1);
        assertFalse(JISX0213String.isValid("\u768D"));	// 皍
        assertEquals(JISX0213String.length("\u768D"), 1);
        assertFalse(JISX0213String.isValid("\u769F"));	// 皟
        assertEquals(JISX0213String.length("\u769F"), 1);
        assertFalse(JISX0213String.isValid("\u76A2"));	// 皢
        assertEquals(JISX0213String.length("\u76A2"), 1);
        assertFalse(JISX0213String.isValid("\u76A3"));	// 皣
        assertEquals(JISX0213String.length("\u76A3"), 1);
        assertFalse(JISX0213String.isValid("\u76A4"));	// 皤
        assertEquals(JISX0213String.length("\u76A4"), 1);
        assertFalse(JISX0213String.isValid("\u76A5"));	// 皥
        assertEquals(JISX0213String.length("\u76A5"), 1);
        assertFalse(JISX0213String.isValid("\u76AD"));	// 皭
        assertEquals(JISX0213String.length("\u76AD"), 1);
        assertFalse(JISX0213String.isValid("\u76BD"));	// 皽
        assertEquals(JISX0213String.length("\u76BD"), 1);
        assertFalse(JISX0213String.isValid("\u76C1"));	// 盁
        assertEquals(JISX0213String.length("\u76C1"), 1);
        assertFalse(JISX0213String.isValid("\u76CB"));	// 盋
        assertEquals(JISX0213String.length("\u76CB"), 1);
        assertFalse(JISX0213String.isValid("\u76D9"));	// 盙
        assertEquals(JISX0213String.length("\u76D9"), 1);
        assertFalse(JISX0213String.isValid("\u76E0"));	// 盠
        assertEquals(JISX0213String.length("\u76E0"), 1);
        assertFalse(JISX0213String.isValid("\u76F0"));	// 盰
        assertEquals(JISX0213String.length("\u76F0"), 1);
        assertFalse(JISX0213String.isValid("\u76F6"));	// 盶
        assertEquals(JISX0213String.length("\u76F6"), 1);
        assertFalse(JISX0213String.isValid("\u76F9"));	// 盹
        assertEquals(JISX0213String.length("\u76F9"), 1);
        assertFalse(JISX0213String.isValid("\u7700"));	// 眀
        assertEquals(JISX0213String.length("\u7700"), 1);
        assertFalse(JISX0213String.isValid("\u7706"));	// 眆
        assertEquals(JISX0213String.length("\u7706"), 1);
        assertFalse(JISX0213String.isValid("\u770E"));	// 眎
        assertEquals(JISX0213String.length("\u770E"), 1);
        assertFalse(JISX0213String.isValid("\u7712"));	// 眒
        assertEquals(JISX0213String.length("\u7712"), 1);
        assertFalse(JISX0213String.isValid("\u7714"));	// 眔
        assertEquals(JISX0213String.length("\u7714"), 1);
        assertFalse(JISX0213String.isValid("\u7715"));	// 眕
        assertEquals(JISX0213String.length("\u7715"), 1);
        assertFalse(JISX0213String.isValid("\u771C"));	// 眜
        assertEquals(JISX0213String.length("\u771C"), 1);
        assertFalse(JISX0213String.isValid("\u7722"));	// 眢
        assertEquals(JISX0213String.length("\u7722"), 1);
        assertFalse(JISX0213String.isValid("\u7728"));	// 眨
        assertEquals(JISX0213String.length("\u7728"), 1);
        assertFalse(JISX0213String.isValid("\u772E"));	// 眮
        assertEquals(JISX0213String.length("\u772E"), 1);
        assertFalse(JISX0213String.isValid("\u772F"));	// 眯
        assertEquals(JISX0213String.length("\u772F"), 1);
        assertFalse(JISX0213String.isValid("\u7739"));	// 眹
        assertEquals(JISX0213String.length("\u7739"), 1);
        assertFalse(JISX0213String.isValid("\u773D"));	// 眽
        assertEquals(JISX0213String.length("\u773D"), 1);
        assertFalse(JISX0213String.isValid("\u773E"));	// 眾
        assertEquals(JISX0213String.length("\u773E"), 1);
        assertFalse(JISX0213String.isValid("\u7742"));	// 睂
        assertEquals(JISX0213String.length("\u7742"), 1);
        assertFalse(JISX0213String.isValid("\u7745"));	// 睅
        assertEquals(JISX0213String.length("\u7745"), 1);
        assertFalse(JISX0213String.isValid("\u774A"));	// 睊
        assertEquals(JISX0213String.length("\u774A"), 1);
        assertFalse(JISX0213String.isValid("\u774F"));	// 睏
        assertEquals(JISX0213String.length("\u774F"), 1);
        assertFalse(JISX0213String.isValid("\u7752"));	// 睒
        assertEquals(JISX0213String.length("\u7752"), 1);
        assertFalse(JISX0213String.isValid("\u7756"));	// 睖
        assertEquals(JISX0213String.length("\u7756"), 1);
        assertFalse(JISX0213String.isValid("\u7757"));	// 睗
        assertEquals(JISX0213String.length("\u7757"), 1);
        assertFalse(JISX0213String.isValid("\u775E"));	// 睞
        assertEquals(JISX0213String.length("\u775E"), 1);
        assertFalse(JISX0213String.isValid("\u7764"));	// 睤
        assertEquals(JISX0213String.length("\u7764"), 1);
        assertFalse(JISX0213String.isValid("\u7767"));	// 睧
        assertEquals(JISX0213String.length("\u7767"), 1);
        assertFalse(JISX0213String.isValid("\u776C"));	// 睬
        assertEquals(JISX0213String.length("\u776C"), 1);
        assertFalse(JISX0213String.isValid("\u7770"));	// 睰
        assertEquals(JISX0213String.length("\u7770"), 1);
        assertFalse(JISX0213String.isValid("\u7773"));	// 睳
        assertEquals(JISX0213String.length("\u7773"), 1);
        assertFalse(JISX0213String.isValid("\u7774"));	// 睴
        assertEquals(JISX0213String.length("\u7774"), 1);
        assertFalse(JISX0213String.isValid("\u7784"));	// 瞄
        assertEquals(JISX0213String.length("\u7784"), 1);
        assertFalse(JISX0213String.isValid("\u778C"));	// 瞌
        assertEquals(JISX0213String.length("\u778C"), 1);
        assertFalse(JISX0213String.isValid("\u778D"));	// 瞍
        assertEquals(JISX0213String.length("\u778D"), 1);
        assertFalse(JISX0213String.isValid("\u7795"));	// 瞕
        assertEquals(JISX0213String.length("\u7795"), 1);
        assertFalse(JISX0213String.isValid("\u7796"));	// 瞖
        assertEquals(JISX0213String.length("\u7796"), 1);
        assertFalse(JISX0213String.isValid("\u77A7"));	// 瞧
        assertEquals(JISX0213String.length("\u77A7"), 1);
        assertFalse(JISX0213String.isValid("\u77AE"));	// 瞮
        assertEquals(JISX0213String.length("\u77AE"), 1);
        assertFalse(JISX0213String.isValid("\u77AF"));	// 瞯
        assertEquals(JISX0213String.length("\u77AF"), 1);
        assertFalse(JISX0213String.isValid("\u77B1"));	// 瞱
        assertEquals(JISX0213String.length("\u77B1"), 1);
        assertFalse(JISX0213String.isValid("\u77B5"));	// 瞵
        assertEquals(JISX0213String.length("\u77B5"), 1);
        assertFalse(JISX0213String.isValid("\u77BE"));	// 瞾
        assertEquals(JISX0213String.length("\u77BE"), 1);
        assertFalse(JISX0213String.isValid("\u77C3"));	// 矃
        assertEquals(JISX0213String.length("\u77C3"), 1);
        assertFalse(JISX0213String.isValid("\u77C9"));	// 矉
        assertEquals(JISX0213String.length("\u77C9"), 1);
        assertFalse(JISX0213String.isValid("\u77D1"));	// 矑
        assertEquals(JISX0213String.length("\u77D1"), 1);
        assertFalse(JISX0213String.isValid("\u77D2"));	// 矒
        assertEquals(JISX0213String.length("\u77D2"), 1);
        assertFalse(JISX0213String.isValid("\u77D5"));	// 矕
        assertEquals(JISX0213String.length("\u77D5"), 1);
        assertFalse(JISX0213String.isValid("\u77D9"));	// 矙
        assertEquals(JISX0213String.length("\u77D9"), 1);
        assertFalse(JISX0213String.isValid("\u77F1"));	// 矱
        assertEquals(JISX0213String.length("\u77F1"), 1);
        assertFalse(JISX0213String.isValid("\u77F8"));	// 矸
        assertEquals(JISX0213String.length("\u77F8"), 1);
        assertFalse(JISX0213String.isValid("\u780E"));	// 砎
        assertEquals(JISX0213String.length("\u780E"), 1);
        assertFalse(JISX0213String.isValid("\u7811"));	// 砑
        assertEquals(JISX0213String.length("\u7811"), 1);
        assertFalse(JISX0213String.isValid("\u781D"));	// 砝
        assertEquals(JISX0213String.length("\u781D"), 1);
        assertFalse(JISX0213String.isValid("\u7822"));	// 砢
        assertEquals(JISX0213String.length("\u7822"), 1);
        assertFalse(JISX0213String.isValid("\u7823"));	// 砣
        assertEquals(JISX0213String.length("\u7823"), 1);
        assertFalse(JISX0213String.isValid("\u782E"));	// 砮
        assertEquals(JISX0213String.length("\u782E"), 1);
        assertFalse(JISX0213String.isValid("\u7830"));	// 砰
        assertEquals(JISX0213String.length("\u7830"), 1);
        assertFalse(JISX0213String.isValid("\u7835"));	// 砵
        assertEquals(JISX0213String.length("\u7835"), 1);
        assertFalse(JISX0213String.isValid("\u7837"));	// 砷
        assertEquals(JISX0213String.length("\u7837"), 1);
        assertFalse(JISX0213String.isValid("\u7844"));	// 硄
        assertEquals(JISX0213String.length("\u7844"), 1);
        assertFalse(JISX0213String.isValid("\u7848"));	// 硈
        assertEquals(JISX0213String.length("\u7848"), 1);
        assertFalse(JISX0213String.isValid("\u784C"));	// 硌
        assertEquals(JISX0213String.length("\u784C"), 1);
        assertFalse(JISX0213String.isValid("\u7852"));	// 硒
        assertEquals(JISX0213String.length("\u7852"), 1);
        assertFalse(JISX0213String.isValid("\u785C"));	// 硜
        assertEquals(JISX0213String.length("\u785C"), 1);
        assertFalse(JISX0213String.isValid("\u785E"));	// 硞
        assertEquals(JISX0213String.length("\u785E"), 1);
        assertFalse(JISX0213String.isValid("\u7860"));	// 硠
        assertEquals(JISX0213String.length("\u7860"), 1);
        assertFalse(JISX0213String.isValid("\u7861"));	// 硡
        assertEquals(JISX0213String.length("\u7861"), 1);
        assertFalse(JISX0213String.isValid("\u7863"));	// 硣
        assertEquals(JISX0213String.length("\u7863"), 1);
        assertFalse(JISX0213String.isValid("\u787E"));	// 硾
        assertEquals(JISX0213String.length("\u787E"), 1);
        assertFalse(JISX0213String.isValid("\u788F"));	// 碏
        assertEquals(JISX0213String.length("\u788F"), 1);
        assertFalse(JISX0213String.isValid("\u7898"));	// 碘
        assertEquals(JISX0213String.length("\u7898"), 1);
        assertFalse(JISX0213String.isValid("\u78A1"));	// 碡
        assertEquals(JISX0213String.length("\u78A1"), 1);
        assertFalse(JISX0213String.isValid("\u78A8"));	// 碨
        assertEquals(JISX0213String.length("\u78A8"), 1);
        assertFalse(JISX0213String.isValid("\u78AC"));	// 碬
        assertEquals(JISX0213String.length("\u78AC"), 1);
        assertFalse(JISX0213String.isValid("\u78B1"));	// 碱
        assertEquals(JISX0213String.length("\u78B1"), 1);
        assertFalse(JISX0213String.isValid("\u78B2"));	// 碲
        assertEquals(JISX0213String.length("\u78B2"), 1);
        assertFalse(JISX0213String.isValid("\u78B3"));	// 碳
        assertEquals(JISX0213String.length("\u78B3"), 1);
        assertFalse(JISX0213String.isValid("\u78BD"));	// 碽
        assertEquals(JISX0213String.length("\u78BD"), 1);
        assertFalse(JISX0213String.isValid("\u78BF"));	// 碿
        assertEquals(JISX0213String.length("\u78BF"), 1);
        assertFalse(JISX0213String.isValid("\u78C7"));	// 磇
        assertEquals(JISX0213String.length("\u78C7"), 1);
        assertFalse(JISX0213String.isValid("\u78C9"));	// 磉
        assertEquals(JISX0213String.length("\u78C9"), 1);
        assertFalse(JISX0213String.isValid("\u78D2"));	// 磒
        assertEquals(JISX0213String.length("\u78D2"), 1);
        assertFalse(JISX0213String.isValid("\u78D3"));	// 磓
        assertEquals(JISX0213String.length("\u78D3"), 1);
        assertFalse(JISX0213String.isValid("\u78D6"));	// 磖
        assertEquals(JISX0213String.length("\u78D6"), 1);
        assertFalse(JISX0213String.isValid("\u78DB"));	// 磛
        assertEquals(JISX0213String.length("\u78DB"), 1);
        assertFalse(JISX0213String.isValid("\u78DF"));	// 磟
        assertEquals(JISX0213String.length("\u78DF"), 1);
        assertFalse(JISX0213String.isValid("\u78EA"));	// 磪
        assertEquals(JISX0213String.length("\u78EA"), 1);
        assertFalse(JISX0213String.isValid("\u78F3"));	// 磳
        assertEquals(JISX0213String.length("\u78F3"), 1);
        assertFalse(JISX0213String.isValid("\u78F6"));	// 磶
        assertEquals(JISX0213String.length("\u78F6"), 1);
        assertFalse(JISX0213String.isValid("\u78FF"));	// 磿
        assertEquals(JISX0213String.length("\u78FF"), 1);
        assertFalse(JISX0213String.isValid("\u7906"));	// 礆
        assertEquals(JISX0213String.length("\u7906"), 1);
        assertFalse(JISX0213String.isValid("\u790C"));	// 礌
        assertEquals(JISX0213String.length("\u790C"), 1);
        assertFalse(JISX0213String.isValid("\u791A"));	// 礚
        assertEquals(JISX0213String.length("\u791A"), 1);
        assertFalse(JISX0213String.isValid("\u791E"));	// 礞
        assertEquals(JISX0213String.length("\u791E"), 1);
        assertFalse(JISX0213String.isValid("\u791F"));	// 礟
        assertEquals(JISX0213String.length("\u791F"), 1);
        assertFalse(JISX0213String.isValid("\u7920"));	// 礠
        assertEquals(JISX0213String.length("\u7920"), 1);
        assertFalse(JISX0213String.isValid("\u7927"));	// 礧
        assertEquals(JISX0213String.length("\u7927"), 1);
        assertFalse(JISX0213String.isValid("\u7929"));	// 礩
        assertEquals(JISX0213String.length("\u7929"), 1);
        assertFalse(JISX0213String.isValid("\u792D"));	// 礭
        assertEquals(JISX0213String.length("\u792D"), 1);
        assertFalse(JISX0213String.isValid("\u7935"));	// 礵
        assertEquals(JISX0213String.length("\u7935"), 1);
        assertFalse(JISX0213String.isValid("\u793D"));	// 礽
        assertEquals(JISX0213String.length("\u793D"), 1);
        assertFalse(JISX0213String.isValid("\u793F"));	// 礿
        assertEquals(JISX0213String.length("\u793F"), 1);
        assertFalse(JISX0213String.isValid("\u7944"));	// 祄
        assertEquals(JISX0213String.length("\u7944"), 1);
        assertFalse(JISX0213String.isValid("\u794B"));	// 祋
        assertEquals(JISX0213String.length("\u794B"), 1);
        assertFalse(JISX0213String.isValid("\u794F"));	// 祏
        assertEquals(JISX0213String.length("\u794F"), 1);
        assertFalse(JISX0213String.isValid("\u7951"));	// 祑
        assertEquals(JISX0213String.length("\u7951"), 1);
        assertFalse(JISX0213String.isValid("\u7954"));	// 祔
        assertEquals(JISX0213String.length("\u7954"), 1);
        assertFalse(JISX0213String.isValid("\u7969"));	// 祩
        assertEquals(JISX0213String.length("\u7969"), 1);
        assertFalse(JISX0213String.isValid("\u796B"));	// 祫
        assertEquals(JISX0213String.length("\u796B"), 1);
        assertFalse(JISX0213String.isValid("\u797B"));	// 祻
        assertEquals(JISX0213String.length("\u797B"), 1);
        assertFalse(JISX0213String.isValid("\u797C"));	// 祼
        assertEquals(JISX0213String.length("\u797C"), 1);
        assertFalse(JISX0213String.isValid("\u797E"));	// 祾
        assertEquals(JISX0213String.length("\u797E"), 1);
        assertFalse(JISX0213String.isValid("\u798B"));	// 禋
        assertEquals(JISX0213String.length("\u798B"), 1);
        assertFalse(JISX0213String.isValid("\u798C"));	// 禌
        assertEquals(JISX0213String.length("\u798C"), 1);
        assertFalse(JISX0213String.isValid("\u7991"));	// 禑
        assertEquals(JISX0213String.length("\u7991"), 1);
        assertFalse(JISX0213String.isValid("\u7993"));	// 禓
        assertEquals(JISX0213String.length("\u7993"), 1);
        assertFalse(JISX0213String.isValid("\u799C"));	// 禜
        assertEquals(JISX0213String.length("\u799C"), 1);
        assertFalse(JISX0213String.isValid("\u79A8"));	// 禨
        assertEquals(JISX0213String.length("\u79A8"), 1);
        assertFalse(JISX0213String.isValid("\u79AB"));	// 禫
        assertEquals(JISX0213String.length("\u79AB"), 1);
        assertFalse(JISX0213String.isValid("\u79AF"));	// 禯
        assertEquals(JISX0213String.length("\u79AF"), 1);
        assertFalse(JISX0213String.isValid("\u79C4"));	// 秄
        assertEquals(JISX0213String.length("\u79C4"), 1);
        assertFalse(JISX0213String.isValid("\u79CF"));	// 秏
        assertEquals(JISX0213String.length("\u79CF"), 1);
        assertFalse(JISX0213String.isValid("\u79DA"));	// 秚
        assertEquals(JISX0213String.length("\u79DA"), 1);
        assertFalse(JISX0213String.isValid("\u79DD"));	// 秝
        assertEquals(JISX0213String.length("\u79DD"), 1);
        assertFalse(JISX0213String.isValid("\u79E0"));	// 秠
        assertEquals(JISX0213String.length("\u79E0"), 1);
        assertFalse(JISX0213String.isValid("\u79E2"));	// 秢
        assertEquals(JISX0213String.length("\u79E2"), 1);
        assertFalse(JISX0213String.isValid("\u79E5"));	// 秥
        assertEquals(JISX0213String.length("\u79E5"), 1);
        assertFalse(JISX0213String.isValid("\u79EA"));	// 秪
        assertEquals(JISX0213String.length("\u79EA"), 1);
        assertFalse(JISX0213String.isValid("\u79F1"));	// 秱
        assertEquals(JISX0213String.length("\u79F1"), 1);
        assertFalse(JISX0213String.isValid("\u79F8"));	// 秸
        assertEquals(JISX0213String.length("\u79F8"), 1);
        assertFalse(JISX0213String.isValid("\u79FC"));	// 秼
        assertEquals(JISX0213String.length("\u79FC"), 1);
        assertFalse(JISX0213String.isValid("\u7A02"));	// 稂
        assertEquals(JISX0213String.length("\u7A02"), 1);
        assertFalse(JISX0213String.isValid("\u7A07"));	// 稇
        assertEquals(JISX0213String.length("\u7A07"), 1);
        assertFalse(JISX0213String.isValid("\u7A09"));	// 稉
        assertEquals(JISX0213String.length("\u7A09"), 1);
        assertFalse(JISX0213String.isValid("\u7A0C"));	// 稌
        assertEquals(JISX0213String.length("\u7A0C"), 1);
        assertFalse(JISX0213String.isValid("\u7A21"));	// 稡
        assertEquals(JISX0213String.length("\u7A21"), 1);
        assertFalse(JISX0213String.isValid("\u7A27"));	// 稧
        assertEquals(JISX0213String.length("\u7A27"), 1);
        assertFalse(JISX0213String.isValid("\u7A2B"));	// 稫
        assertEquals(JISX0213String.length("\u7A2B"), 1);
        assertFalse(JISX0213String.isValid("\u7A2F"));	// 稯
        assertEquals(JISX0213String.length("\u7A2F"), 1);
        assertFalse(JISX0213String.isValid("\u7A30"));	// 稰
        assertEquals(JISX0213String.length("\u7A30"), 1);
        assertFalse(JISX0213String.isValid("\u7A34"));	// 稴
        assertEquals(JISX0213String.length("\u7A34"), 1);
        assertFalse(JISX0213String.isValid("\u7A35"));	// 稵
        assertEquals(JISX0213String.length("\u7A35"), 1);
        assertFalse(JISX0213String.isValid("\u7A3A"));	// 稺
        assertEquals(JISX0213String.length("\u7A3A"), 1);
        assertFalse(JISX0213String.isValid("\u7A44"));	// 穄
        assertEquals(JISX0213String.length("\u7A44"), 1);
        assertFalse(JISX0213String.isValid("\u7A45"));	// 穅
        assertEquals(JISX0213String.length("\u7A45"), 1);
        assertFalse(JISX0213String.isValid("\u7A48"));	// 穈
        assertEquals(JISX0213String.length("\u7A48"), 1);
        assertFalse(JISX0213String.isValid("\u7A55"));	// 穕
        assertEquals(JISX0213String.length("\u7A55"), 1);
        assertFalse(JISX0213String.isValid("\u7A65"));	// 穥
        assertEquals(JISX0213String.length("\u7A65"), 1);
        assertFalse(JISX0213String.isValid("\u7A7E"));	// 穾
        assertEquals(JISX0213String.length("\u7A7E"), 1);
        assertFalse(JISX0213String.isValid("\u7A80"));	// 窀
        assertEquals(JISX0213String.length("\u7A80"), 1);
        assertFalse(JISX0213String.isValid("\u7A86"));	// 窆
        assertEquals(JISX0213String.length("\u7A86"), 1);
        assertFalse(JISX0213String.isValid("\u7A8B"));	// 窋
        assertEquals(JISX0213String.length("\u7A8B"), 1);
        assertFalse(JISX0213String.isValid("\u7A91"));	// 窑
        assertEquals(JISX0213String.length("\u7A91"), 1);
        assertFalse(JISX0213String.isValid("\u7A94"));	// 窔
        assertEquals(JISX0213String.length("\u7A94"), 1);
        assertFalse(JISX0213String.isValid("\u7A9E"));	// 窞
        assertEquals(JISX0213String.length("\u7A9E"), 1);
        assertFalse(JISX0213String.isValid("\u7AB5"));	// 窵
        assertEquals(JISX0213String.length("\u7AB5"), 1);
        assertFalse(JISX0213String.isValid("\u7AC6"));	// 竆
        assertEquals(JISX0213String.length("\u7AC6"), 1);
        assertFalse(JISX0213String.isValid("\u7AC9"));	// 竉
        assertEquals(JISX0213String.length("\u7AC9"), 1);
        assertFalse(JISX0213String.isValid("\u7ADB"));	// 竛
        assertEquals(JISX0213String.length("\u7ADB"), 1);
        assertFalse(JISX0213String.isValid("\u7AE9"));	// 竩
        assertEquals(JISX0213String.length("\u7AE9"), 1);
        assertFalse(JISX0213String.isValid("\u7AEC"));	// 竬
        assertEquals(JISX0213String.length("\u7AEC"), 1);
        assertFalse(JISX0213String.isValid("\u7AF1"));	// 竱
        assertEquals(JISX0213String.length("\u7AF1"), 1);
        assertFalse(JISX0213String.isValid("\u7AFB"));	// 竻
        assertEquals(JISX0213String.length("\u7AFB"), 1);
        assertFalse(JISX0213String.isValid("\u7AFE"));	// 竾
        assertEquals(JISX0213String.length("\u7AFE"), 1);
        assertFalse(JISX0213String.isValid("\u7B14"));	// 笔
        assertEquals(JISX0213String.length("\u7B14"), 1);
        assertFalse(JISX0213String.isValid("\u7B1F"));	// 笟
        assertEquals(JISX0213String.length("\u7B1F"), 1);
        assertFalse(JISX0213String.isValid("\u7B23"));	// 笣
        assertEquals(JISX0213String.length("\u7B23"), 1);
        assertFalse(JISX0213String.isValid("\u7B29"));	// 笩
        assertEquals(JISX0213String.length("\u7B29"), 1);
        assertFalse(JISX0213String.isValid("\u7B2B"));	// 笫
        assertEquals(JISX0213String.length("\u7B2B"), 1);
        assertFalse(JISX0213String.isValid("\u7B30"));	// 笰
        assertEquals(JISX0213String.length("\u7B30"), 1);
        assertFalse(JISX0213String.isValid("\u7B34"));	// 笴
        assertEquals(JISX0213String.length("\u7B34"), 1);
        assertFalse(JISX0213String.isValid("\u7B3F"));	// 笿
        assertEquals(JISX0213String.length("\u7B3F"), 1);
        assertFalse(JISX0213String.isValid("\u7B40"));	// 筀
        assertEquals(JISX0213String.length("\u7B40"), 1);
        assertFalse(JISX0213String.isValid("\u7B6A"));	// 筪
        assertEquals(JISX0213String.length("\u7B6A"), 1);
        assertFalse(JISX0213String.isValid("\u7B77"));	// 筷
        assertEquals(JISX0213String.length("\u7B77"), 1);
        assertFalse(JISX0213String.isValid("\u7B84"));	// 箄
        assertEquals(JISX0213String.length("\u7B84"), 1);
        assertFalse(JISX0213String.isValid("\u7B89"));	// 箉
        assertEquals(JISX0213String.length("\u7B89"), 1);
        assertFalse(JISX0213String.isValid("\u7B8E"));	// 箎
        assertEquals(JISX0213String.length("\u7B8E"), 1);
        assertFalse(JISX0213String.isValid("\u7B96"));	// 箖
        assertEquals(JISX0213String.length("\u7B96"), 1);
        assertFalse(JISX0213String.isValid("\u7BA0"));	// 箠
        assertEquals(JISX0213String.length("\u7BA0"), 1);
        assertFalse(JISX0213String.isValid("\u7BA5"));	// 箥
        assertEquals(JISX0213String.length("\u7BA5"), 1);
        assertFalse(JISX0213String.isValid("\u7BAC"));	// 箬
        assertEquals(JISX0213String.length("\u7BAC"), 1);
        assertFalse(JISX0213String.isValid("\u7BB0"));	// 箰
        assertEquals(JISX0213String.length("\u7BB0"), 1);
        assertFalse(JISX0213String.isValid("\u7BB2"));	// 箲
        assertEquals(JISX0213String.length("\u7BB2"), 1);
        assertFalse(JISX0213String.isValid("\u7BB6"));	// 箶
        assertEquals(JISX0213String.length("\u7BB6"), 1);
        assertFalse(JISX0213String.isValid("\u7BBA"));	// 箺
        assertEquals(JISX0213String.length("\u7BBA"), 1);
        assertFalse(JISX0213String.isValid("\u7BBB"));	// 箻
        assertEquals(JISX0213String.length("\u7BBB"), 1);
        assertFalse(JISX0213String.isValid("\u7BBD"));	// 箽
        assertEquals(JISX0213String.length("\u7BBD"), 1);
        assertFalse(JISX0213String.isValid("\u7BC2"));	// 篂
        assertEquals(JISX0213String.length("\u7BC2"), 1);
        assertFalse(JISX0213String.isValid("\u7BC8"));	// 篈
        assertEquals(JISX0213String.length("\u7BC8"), 1);
        assertFalse(JISX0213String.isValid("\u7BDB"));	// 篛
        assertEquals(JISX0213String.length("\u7BDB"), 1);
        assertFalse(JISX0213String.isValid("\u7BE8"));	// 篨
        assertEquals(JISX0213String.length("\u7BE8"), 1);
        assertFalse(JISX0213String.isValid("\u7BF2"));	// 篲
        assertEquals(JISX0213String.length("\u7BF2"), 1);
        assertFalse(JISX0213String.isValid("\u7BF4"));	// 篴
        assertEquals(JISX0213String.length("\u7BF4"), 1);
        assertFalse(JISX0213String.isValid("\u7BF5"));	// 篵
        assertEquals(JISX0213String.length("\u7BF5"), 1);
        assertFalse(JISX0213String.isValid("\u7BF8"));	// 篸
        assertEquals(JISX0213String.length("\u7BF8"), 1);
        assertFalse(JISX0213String.isValid("\u7BF9"));	// 篹
        assertEquals(JISX0213String.length("\u7BF9"), 1);
        assertFalse(JISX0213String.isValid("\u7BFA"));	// 篺
        assertEquals(JISX0213String.length("\u7BFA"), 1);
        assertFalse(JISX0213String.isValid("\u7BFC"));	// 篼
        assertEquals(JISX0213String.length("\u7BFC"), 1);
        assertFalse(JISX0213String.isValid("\u7BFE"));	// 篾
        assertEquals(JISX0213String.length("\u7BFE"), 1);
        assertFalse(JISX0213String.isValid("\u7C02"));	// 簂
        assertEquals(JISX0213String.length("\u7C02"), 1);
        assertFalse(JISX0213String.isValid("\u7C04"));	// 簄
        assertEquals(JISX0213String.length("\u7C04"), 1);
        assertFalse(JISX0213String.isValid("\u7C06"));	// 簆
        assertEquals(JISX0213String.length("\u7C06"), 1);
        assertFalse(JISX0213String.isValid("\u7C09"));	// 簉
        assertEquals(JISX0213String.length("\u7C09"), 1);
        assertFalse(JISX0213String.isValid("\u7C0C"));	// 簌
        assertEquals(JISX0213String.length("\u7C0C"), 1);
        assertFalse(JISX0213String.isValid("\u7C19"));	// 簙
        assertEquals(JISX0213String.length("\u7C19"), 1);
        assertFalse(JISX0213String.isValid("\u7C1B"));	// 簛
        assertEquals(JISX0213String.length("\u7C1B"), 1);
        assertFalse(JISX0213String.isValid("\u7C25"));	// 簥
        assertEquals(JISX0213String.length("\u7C25"), 1);
        assertFalse(JISX0213String.isValid("\u7C28"));	// 簨
        assertEquals(JISX0213String.length("\u7C28"), 1);
        assertFalse(JISX0213String.isValid("\u7C2C"));	// 簬
        assertEquals(JISX0213String.length("\u7C2C"), 1);
        assertFalse(JISX0213String.isValid("\u7C34"));	// 簴
        assertEquals(JISX0213String.length("\u7C34"), 1);
        assertFalse(JISX0213String.isValid("\u7C39"));	// 簹
        assertEquals(JISX0213String.length("\u7C39"), 1);
        assertFalse(JISX0213String.isValid("\u7C3A"));	// 簺
        assertEquals(JISX0213String.length("\u7C3A"), 1);
        assertFalse(JISX0213String.isValid("\u7C46"));	// 籆
        assertEquals(JISX0213String.length("\u7C46"), 1);
        assertFalse(JISX0213String.isValid("\u7C55"));	// 籕
        assertEquals(JISX0213String.length("\u7C55"), 1);
        assertFalse(JISX0213String.isValid("\u7C52"));	// 籒
        assertEquals(JISX0213String.length("\u7C52"), 1);
        assertFalse(JISX0213String.isValid("\u7C53"));	// 籓
        assertEquals(JISX0213String.length("\u7C53"), 1);
        assertFalse(JISX0213String.isValid("\u7C5A"));	// 籚
        assertEquals(JISX0213String.length("\u7C5A"), 1);
        assertFalse(JISX0213String.isValid("\u7C5B"));	// 籛
        assertEquals(JISX0213String.length("\u7C5B"), 1);
        assertFalse(JISX0213String.isValid("\u7C5C"));	// 籜
        assertEquals(JISX0213String.length("\u7C5C"), 1);
        assertFalse(JISX0213String.isValid("\u7C5D"));	// 籝
        assertEquals(JISX0213String.length("\u7C5D"), 1);
        assertFalse(JISX0213String.isValid("\u7C63"));	// 籣
        assertEquals(JISX0213String.length("\u7C63"), 1);
        assertFalse(JISX0213String.isValid("\u7C67"));	// 籧
        assertEquals(JISX0213String.length("\u7C67"), 1);
        assertFalse(JISX0213String.isValid("\u7C72"));	// 籲
        assertEquals(JISX0213String.length("\u7C72"), 1);
        assertFalse(JISX0213String.isValid("\u7C7C"));	// 籼
        assertEquals(JISX0213String.length("\u7C7C"), 1);
        assertFalse(JISX0213String.isValid("\u7C7D"));	// 籽
        assertEquals(JISX0213String.length("\u7C7D"), 1);
        assertFalse(JISX0213String.isValid("\u7C86"));	// 粆
        assertEquals(JISX0213String.length("\u7C86"), 1);
        assertFalse(JISX0213String.isValid("\u7C87"));	// 粇
        assertEquals(JISX0213String.length("\u7C87"), 1);
        assertFalse(JISX0213String.isValid("\u7C9E"));	// 粞
        assertEquals(JISX0213String.length("\u7C9E"), 1);
        assertFalse(JISX0213String.isValid("\u7CB0"));	// 粰
        assertEquals(JISX0213String.length("\u7CB0"), 1);
        assertFalse(JISX0213String.isValid("\u7CBA"));	// 粺
        assertEquals(JISX0213String.length("\u7CBA"), 1);
        assertFalse(JISX0213String.isValid("\u7CBB"));	// 粻
        assertEquals(JISX0213String.length("\u7CBB"), 1);
        assertFalse(JISX0213String.isValid("\u7CC7"));	// 糇
        assertEquals(JISX0213String.length("\u7CC7"), 1);
        assertFalse(JISX0213String.isValid("\u7CC9"));	// 糉
        assertEquals(JISX0213String.length("\u7CC9"), 1);
        assertFalse(JISX0213String.isValid("\u7CCF"));	// 糏
        assertEquals(JISX0213String.length("\u7CCF"), 1);
        assertFalse(JISX0213String.isValid("\u7CD3"));	// 糓
        assertEquals(JISX0213String.length("\u7CD3"), 1);
        assertFalse(JISX0213String.isValid("\u7CD4"));	// 糔
        assertEquals(JISX0213String.length("\u7CD4"), 1);
        assertFalse(JISX0213String.isValid("\u7CDA"));	// 糚
        assertEquals(JISX0213String.length("\u7CDA"), 1);
        assertFalse(JISX0213String.isValid("\u7CE9"));	// 糩
        assertEquals(JISX0213String.length("\u7CE9"), 1);
        assertFalse(JISX0213String.isValid("\u7D0F"));	// 紏
        assertEquals(JISX0213String.length("\u7D0F"), 1);
        assertFalse(JISX0213String.isValid("\u7D11"));	// 紑
        assertEquals(JISX0213String.length("\u7D11"), 1);
        assertFalse(JISX0213String.isValid("\u7D16"));	// 紖
        assertEquals(JISX0213String.length("\u7D16"), 1);
        assertFalse(JISX0213String.isValid("\u7D26"));	// 紦
        assertEquals(JISX0213String.length("\u7D26"), 1);
        assertFalse(JISX0213String.isValid("\u7D2A"));	// 紪
        assertEquals(JISX0213String.length("\u7D2A"), 1);
        assertFalse(JISX0213String.isValid("\u7D2D"));	// 紭
        assertEquals(JISX0213String.length("\u7D2D"), 1);
        assertFalse(JISX0213String.isValid("\u7D3C"));	// 紼
        assertEquals(JISX0213String.length("\u7D3C"), 1);
        assertFalse(JISX0213String.isValid("\u7D4D"));	// 絍
        assertEquals(JISX0213String.length("\u7D4D"), 1);
        assertFalse(JISX0213String.isValid("\u7D51"));	// 絑
        assertEquals(JISX0213String.length("\u7D51"), 1);
        assertFalse(JISX0213String.isValid("\u7D57"));	// 絗
        assertEquals(JISX0213String.length("\u7D57"), 1);
        assertFalse(JISX0213String.isValid("\u7D5D"));	// 絝
        assertEquals(JISX0213String.length("\u7D5D"), 1);
        assertFalse(JISX0213String.isValid("\u7D65"));	// 絥
        assertEquals(JISX0213String.length("\u7D65"), 1);
        assertFalse(JISX0213String.isValid("\u7D67"));	// 絧
        assertEquals(JISX0213String.length("\u7D67"), 1);
        assertFalse(JISX0213String.isValid("\u7D78"));	// 絸
        assertEquals(JISX0213String.length("\u7D78"), 1);
        assertFalse(JISX0213String.isValid("\u7D7B"));	// 絻
        assertEquals(JISX0213String.length("\u7D7B"), 1);
        assertFalse(JISX0213String.isValid("\u7D81"));	// 綁
        assertEquals(JISX0213String.length("\u7D81"), 1);
        assertFalse(JISX0213String.isValid("\u7D82"));	// 綂
        assertEquals(JISX0213String.length("\u7D82"), 1);
        assertFalse(JISX0213String.isValid("\u7D85"));	// 綅
        assertEquals(JISX0213String.length("\u7D85"), 1);
        assertFalse(JISX0213String.isValid("\u7D8D"));	// 綍
        assertEquals(JISX0213String.length("\u7D8D"), 1);
        assertFalse(JISX0213String.isValid("\u7D91"));	// 綑
        assertEquals(JISX0213String.length("\u7D91"), 1);
        assertFalse(JISX0213String.isValid("\u7D96"));	// 綖
        assertEquals(JISX0213String.length("\u7D96"), 1);
        assertFalse(JISX0213String.isValid("\u7D9E"));	// 綞
        assertEquals(JISX0213String.length("\u7D9E"), 1);
        assertFalse(JISX0213String.isValid("\u7DB3"));	// 綳
        assertEquals(JISX0213String.length("\u7DB3"), 1);
        assertFalse(JISX0213String.isValid("\u7DB9"));	// 綹
        assertEquals(JISX0213String.length("\u7DB9"), 1);
        assertFalse(JISX0213String.isValid("\u7DC3"));	// 緃
        assertEquals(JISX0213String.length("\u7DC3"), 1);
        assertFalse(JISX0213String.isValid("\u7DC4"));	// 緄
        assertEquals(JISX0213String.length("\u7DC4"), 1);
        assertFalse(JISX0213String.isValid("\u7DC5"));	// 緅
        assertEquals(JISX0213String.length("\u7DC5"), 1);
        assertFalse(JISX0213String.isValid("\u7DC6"));	// 緆
        assertEquals(JISX0213String.length("\u7DC6"), 1);
        assertFalse(JISX0213String.isValid("\u7DCD"));	// 緍
        assertEquals(JISX0213String.length("\u7DCD"), 1);
        assertFalse(JISX0213String.isValid("\u7DCE"));	// 緎
        assertEquals(JISX0213String.length("\u7DCE"), 1);
        assertFalse(JISX0213String.isValid("\u7E00"));	// 縀
        assertEquals(JISX0213String.length("\u7E00"), 1);
        assertFalse(JISX0213String.isValid("\u7DE2"));	// 緢
        assertEquals(JISX0213String.length("\u7DE2"), 1);
        assertFalse(JISX0213String.isValid("\u7DE5"));	// 緥
        assertEquals(JISX0213String.length("\u7DE5"), 1);
        assertFalse(JISX0213String.isValid("\u7DEA"));	// 緪
        assertEquals(JISX0213String.length("\u7DEA"), 1);
        assertFalse(JISX0213String.isValid("\u7DEB"));	// 緫
        assertEquals(JISX0213String.length("\u7DEB"), 1);
        assertFalse(JISX0213String.isValid("\u7DED"));	// 緭
        assertEquals(JISX0213String.length("\u7DED"), 1);
        assertFalse(JISX0213String.isValid("\u7DF5"));	// 緵
        assertEquals(JISX0213String.length("\u7DF5"), 1);
        assertFalse(JISX0213String.isValid("\u7DF6"));	// 緶
        assertEquals(JISX0213String.length("\u7DF6"), 1);
        assertFalse(JISX0213String.isValid("\u7DFA"));	// 緺
        assertEquals(JISX0213String.length("\u7DFA"), 1);
        assertFalse(JISX0213String.isValid("\u7E1C"));	// 縜
        assertEquals(JISX0213String.length("\u7E1C"), 1);
        assertFalse(JISX0213String.isValid("\u7E2D"));	// 縭
        assertEquals(JISX0213String.length("\u7E2D"), 1);
        assertFalse(JISX0213String.isValid("\u7E2F"));	// 縯
        assertEquals(JISX0213String.length("\u7E2F"), 1);
        assertFalse(JISX0213String.isValid("\u7E33"));	// 縳
        assertEquals(JISX0213String.length("\u7E33"), 1);
        assertFalse(JISX0213String.isValid("\u7E36"));	// 縶
        assertEquals(JISX0213String.length("\u7E36"), 1);
        assertFalse(JISX0213String.isValid("\u7E3F"));	// 縿
        assertEquals(JISX0213String.length("\u7E3F"), 1);
        assertFalse(JISX0213String.isValid("\u7E44"));	// 繄
        assertEquals(JISX0213String.length("\u7E44"), 1);
        assertFalse(JISX0213String.isValid("\u7E4E"));	// 繎
        assertEquals(JISX0213String.length("\u7E4E"), 1);
        assertFalse(JISX0213String.isValid("\u7E50"));	// 繐
        assertEquals(JISX0213String.length("\u7E50"), 1);
        assertFalse(JISX0213String.isValid("\u7E58"));	// 繘
        assertEquals(JISX0213String.length("\u7E58"), 1);
        assertFalse(JISX0213String.isValid("\u7E5F"));	// 繟
        assertEquals(JISX0213String.length("\u7E5F"), 1);
        assertFalse(JISX0213String.isValid("\u7E62"));	// 繢
        assertEquals(JISX0213String.length("\u7E62"), 1);
        assertFalse(JISX0213String.isValid("\u7E65"));	// 繥
        assertEquals(JISX0213String.length("\u7E65"), 1);
        assertFalse(JISX0213String.isValid("\u7E6E"));	// 繮
        assertEquals(JISX0213String.length("\u7E6E"), 1);
        assertFalse(JISX0213String.isValid("\u7E6F"));	// 繯
        assertEquals(JISX0213String.length("\u7E6F"), 1);
        assertFalse(JISX0213String.isValid("\u7E78"));	// 繸
        assertEquals(JISX0213String.length("\u7E78"), 1);
        assertFalse(JISX0213String.isValid("\u7E81"));	// 纁
        assertEquals(JISX0213String.length("\u7E81"), 1);
        assertFalse(JISX0213String.isValid("\u7E95"));	// 纕
        assertEquals(JISX0213String.length("\u7E95"), 1);
        assertFalse(JISX0213String.isValid("\u7E9D"));	// 纝
        assertEquals(JISX0213String.length("\u7E9D"), 1);
        assertFalse(JISX0213String.isValid("\u7E9E"));	// 纞
        assertEquals(JISX0213String.length("\u7E9E"), 1);
        assertFalse(JISX0213String.isValid("\u7F3D"));	// 缽
        assertEquals(JISX0213String.length("\u7F3D"), 1);
        assertFalse(JISX0213String.isValid("\u7F3F"));	// 缿
        assertEquals(JISX0213String.length("\u7F3F"), 1);
        assertFalse(JISX0213String.isValid("\u7F53"));	// 罓
        assertEquals(JISX0213String.length("\u7F53"), 1);
        assertFalse(JISX0213String.isValid("\u7F5B"));	// 罛
        assertEquals(JISX0213String.length("\u7F5B"), 1);
        assertFalse(JISX0213String.isValid("\u7F5C"));	// 罜
        assertEquals(JISX0213String.length("\u7F5C"), 1);
        assertFalse(JISX0213String.isValid("\u7F5D"));	// 罝
        assertEquals(JISX0213String.length("\u7F5D"), 1);
        assertFalse(JISX0213String.isValid("\u7F65"));	// 罥
        assertEquals(JISX0213String.length("\u7F65"), 1);
        assertFalse(JISX0213String.isValid("\u7F66"));	// 罦
        assertEquals(JISX0213String.length("\u7F66"), 1);
        assertFalse(JISX0213String.isValid("\u7F71"));	// 罱
        assertEquals(JISX0213String.length("\u7F71"), 1);
        assertFalse(JISX0213String.isValid("\u7F7F"));	// 罿
        assertEquals(JISX0213String.length("\u7F7F"), 1);
        assertFalse(JISX0213String.isValid("\u7F80"));	// 羀
        assertEquals(JISX0213String.length("\u7F80"), 1);
        assertFalse(JISX0213String.isValid("\u7F8B"));	// 羋
        assertEquals(JISX0213String.length("\u7F8B"), 1);
        assertFalse(JISX0213String.isValid("\u7F8D"));	// 羍
        assertEquals(JISX0213String.length("\u7F8D"), 1);
        assertFalse(JISX0213String.isValid("\u7F8F"));	// 羏
        assertEquals(JISX0213String.length("\u7F8F"), 1);
        assertFalse(JISX0213String.isValid("\u7FA2"));	// 羢
        assertEquals(JISX0213String.length("\u7FA2"), 1);
        assertFalse(JISX0213String.isValid("\u7FA6"));	// 羦
        assertEquals(JISX0213String.length("\u7FA6"), 1);
        assertFalse(JISX0213String.isValid("\u7FAA"));	// 羪
        assertEquals(JISX0213String.length("\u7FAA"), 1);
        assertFalse(JISX0213String.isValid("\u7FB4"));	// 羴
        assertEquals(JISX0213String.length("\u7FB4"), 1);
        assertFalse(JISX0213String.isValid("\u7FBC"));	// 羼
        assertEquals(JISX0213String.length("\u7FBC"), 1);
        assertFalse(JISX0213String.isValid("\u7FC0"));	// 翀
        assertEquals(JISX0213String.length("\u7FC0"), 1);
        assertFalse(JISX0213String.isValid("\u7FC8"));	// 翈
        assertEquals(JISX0213String.length("\u7FC8"), 1);
        assertFalse(JISX0213String.isValid("\u7FE8"));	// 翨
        assertEquals(JISX0213String.length("\u7FE8"), 1);
        assertFalse(JISX0213String.isValid("\u7FFD"));	// 翽
        assertEquals(JISX0213String.length("\u7FFD"), 1);
        assertFalse(JISX0213String.isValid("\u7FFE"));	// 翾
        assertEquals(JISX0213String.length("\u7FFE"), 1);
        assertFalse(JISX0213String.isValid("\u7FFF"));	// 翿
        assertEquals(JISX0213String.length("\u7FFF"), 1);
        assertFalse(JISX0213String.isValid("\u8007"));	// 耇
        assertEquals(JISX0213String.length("\u8007"), 1);
        assertFalse(JISX0213String.isValid("\u800D"));	// 耍
        assertEquals(JISX0213String.length("\u800D"), 1);
        assertFalse(JISX0213String.isValid("\u800F"));	// 耏
        assertEquals(JISX0213String.length("\u800F"), 1);
        assertFalse(JISX0213String.isValid("\u8013"));	// 耓
        assertEquals(JISX0213String.length("\u8013"), 1);
        assertFalse(JISX0213String.isValid("\u801D"));	// 耝
        assertEquals(JISX0213String.length("\u801D"), 1);
        assertFalse(JISX0213String.isValid("\u801E"));	// 耞
        assertEquals(JISX0213String.length("\u801E"), 1);
        assertFalse(JISX0213String.isValid("\u801F"));	// 耟
        assertEquals(JISX0213String.length("\u801F"), 1);
        assertFalse(JISX0213String.isValid("\u8020"));	// 耠
        assertEquals(JISX0213String.length("\u8020"), 1);
        assertFalse(JISX0213String.isValid("\u802E"));	// 耮
        assertEquals(JISX0213String.length("\u802E"), 1);
        assertFalse(JISX0213String.isValid("\u8034"));	// 耴
        assertEquals(JISX0213String.length("\u8034"), 1);
        assertFalse(JISX0213String.isValid("\u8039"));	// 耹
        assertEquals(JISX0213String.length("\u8039"), 1);
        assertFalse(JISX0213String.isValid("\u803A"));	// 耺
        assertEquals(JISX0213String.length("\u803A"), 1);
        assertFalse(JISX0213String.isValid("\u803E"));	// 耾
        assertEquals(JISX0213String.length("\u803E"), 1);
        assertFalse(JISX0213String.isValid("\u8040"));	// 聀
        assertEquals(JISX0213String.length("\u8040"), 1);
        assertFalse(JISX0213String.isValid("\u8044"));	// 聄
        assertEquals(JISX0213String.length("\u8044"), 1);
        assertFalse(JISX0213String.isValid("\u8060"));	// 聠
        assertEquals(JISX0213String.length("\u8060"), 1);
        assertFalse(JISX0213String.isValid("\u8064"));	// 聤
        assertEquals(JISX0213String.length("\u8064"), 1);
        assertFalse(JISX0213String.isValid("\u806D"));	// 聭
        assertEquals(JISX0213String.length("\u806D"), 1);
        assertFalse(JISX0213String.isValid("\u8081"));	// 肁
        assertEquals(JISX0213String.length("\u8081"), 1);
        assertFalse(JISX0213String.isValid("\u8088"));	// 肈
        assertEquals(JISX0213String.length("\u8088"), 1);
        assertFalse(JISX0213String.isValid("\u808E"));	// 肎
        assertEquals(JISX0213String.length("\u808E"), 1);
        assertFalse(JISX0213String.isValid("\u809E"));	// 肞
        assertEquals(JISX0213String.length("\u809E"), 1);
        assertFalse(JISX0213String.isValid("\u80A6"));	// 肦
        assertEquals(JISX0213String.length("\u80A6"), 1);
        assertFalse(JISX0213String.isValid("\u80AB"));	// 肫
        assertEquals(JISX0213String.length("\u80AB"), 1);
        assertFalse(JISX0213String.isValid("\u80B9"));	// 肹
        assertEquals(JISX0213String.length("\u80B9"), 1);
        assertFalse(JISX0213String.isValid("\u80C8"));	// 胈
        assertEquals(JISX0213String.length("\u80C8"), 1);
        assertFalse(JISX0213String.isValid("\u80CD"));	// 胍
        assertEquals(JISX0213String.length("\u80CD"), 1);
        assertFalse(JISX0213String.isValid("\u80CF"));	// 胏
        assertEquals(JISX0213String.length("\u80CF"), 1);
        assertFalse(JISX0213String.isValid("\u80D2"));	// 胒
        assertEquals(JISX0213String.length("\u80D2"), 1);
        assertFalse(JISX0213String.isValid("\u80D4"));	// 胔
        assertEquals(JISX0213String.length("\u80D4"), 1);
        assertFalse(JISX0213String.isValid("\u80ED"));	// 胭
        assertEquals(JISX0213String.length("\u80ED"), 1);
        assertFalse(JISX0213String.isValid("\u80EE"));	// 胮
        assertEquals(JISX0213String.length("\u80EE"), 1);
        assertFalse(JISX0213String.isValid("\u80F0"));	// 胰
        assertEquals(JISX0213String.length("\u80F0"), 1);
        assertFalse(JISX0213String.isValid("\u80F2"));	// 胲
        assertEquals(JISX0213String.length("\u80F2"), 1);
        assertFalse(JISX0213String.isValid("\u80F6"));	// 胶
        assertEquals(JISX0213String.length("\u80F6"), 1);
        assertFalse(JISX0213String.isValid("\u80F9"));	// 胹
        assertEquals(JISX0213String.length("\u80F9"), 1);
        assertFalse(JISX0213String.isValid("\u80FA"));	// 胺
        assertEquals(JISX0213String.length("\u80FA"), 1);
        assertFalse(JISX0213String.isValid("\u80FE"));	// 胾
        assertEquals(JISX0213String.length("\u80FE"), 1);
        assertFalse(JISX0213String.isValid("\u8103"));	// 脃
        assertEquals(JISX0213String.length("\u8103"), 1);
        assertFalse(JISX0213String.isValid("\u810B"));	// 脋
        assertEquals(JISX0213String.length("\u810B"), 1);
        assertFalse(JISX0213String.isValid("\u8117"));	// 脗
        assertEquals(JISX0213String.length("\u8117"), 1);
        assertFalse(JISX0213String.isValid("\u811C"));	// 脜
        assertEquals(JISX0213String.length("\u811C"), 1);
        assertFalse(JISX0213String.isValid("\u8120"));	// 脠
        assertEquals(JISX0213String.length("\u8120"), 1);
        assertFalse(JISX0213String.isValid("\u8130"));	// 脰
        assertEquals(JISX0213String.length("\u8130"), 1);
        assertFalse(JISX0213String.isValid("\u813A"));	// 脺
        assertEquals(JISX0213String.length("\u813A"), 1);
        assertFalse(JISX0213String.isValid("\u813C"));	// 脼
        assertEquals(JISX0213String.length("\u813C"), 1);
        assertFalse(JISX0213String.isValid("\u8145"));	// 腅
        assertEquals(JISX0213String.length("\u8145"), 1);
        assertFalse(JISX0213String.isValid("\u8147"));	// 腇
        assertEquals(JISX0213String.length("\u8147"), 1);
        assertFalse(JISX0213String.isValid("\u814C"));	// 腌
        assertEquals(JISX0213String.length("\u814C"), 1);
        assertFalse(JISX0213String.isValid("\u8152"));	// 腒
        assertEquals(JISX0213String.length("\u8152"), 1);
        assertFalse(JISX0213String.isValid("\u8157"));	// 腗
        assertEquals(JISX0213String.length("\u8157"), 1);
        assertFalse(JISX0213String.isValid("\u8161"));	// 腡
        assertEquals(JISX0213String.length("\u8161"), 1);
        assertFalse(JISX0213String.isValid("\u816F"));	// 腯
        assertEquals(JISX0213String.length("\u816F"), 1);
        assertFalse(JISX0213String.isValid("\u8177"));	// 腷
        assertEquals(JISX0213String.length("\u8177"), 1);
        assertFalse(JISX0213String.isValid("\u8190"));	// 膐
        assertEquals(JISX0213String.length("\u8190"), 1);
        assertFalse(JISX0213String.isValid("\u8186"));	// 膆
        assertEquals(JISX0213String.length("\u8186"), 1);
        assertFalse(JISX0213String.isValid("\u818B"));	// 膋
        assertEquals(JISX0213String.length("\u818B"), 1);
        assertFalse(JISX0213String.isValid("\u818E"));	// 膎
        assertEquals(JISX0213String.length("\u818E"), 1);
        assertFalse(JISX0213String.isValid("\u8196"));	// 膖
        assertEquals(JISX0213String.length("\u8196"), 1);
        assertFalse(JISX0213String.isValid("\u819B"));	// 膛
        assertEquals(JISX0213String.length("\u819B"), 1);
        assertFalse(JISX0213String.isValid("\u819E"));	// 膞
        assertEquals(JISX0213String.length("\u819E"), 1);
        assertFalse(JISX0213String.isValid("\u81A2"));	// 膢
        assertEquals(JISX0213String.length("\u81A2"), 1);
        assertFalse(JISX0213String.isValid("\u81AE"));	// 膮
        assertEquals(JISX0213String.length("\u81AE"), 1);
        assertFalse(JISX0213String.isValid("\u81B4"));	// 膴
        assertEquals(JISX0213String.length("\u81B4"), 1);
        assertFalse(JISX0213String.isValid("\u81CB"));	// 臋
        assertEquals(JISX0213String.length("\u81CB"), 1);
        assertFalse(JISX0213String.isValid("\u81C5"));	// 臅
        assertEquals(JISX0213String.length("\u81C5"), 1);
        assertFalse(JISX0213String.isValid("\u81CE"));	// 臎
        assertEquals(JISX0213String.length("\u81CE"), 1);
        assertFalse(JISX0213String.isValid("\u81D5"));	// 臕
        assertEquals(JISX0213String.length("\u81D5"), 1);
        assertFalse(JISX0213String.isValid("\u81DD"));	// 臝
        assertEquals(JISX0213String.length("\u81DD"), 1);
        assertFalse(JISX0213String.isValid("\u81DE"));	// 臞
        assertEquals(JISX0213String.length("\u81DE"), 1);
        assertFalse(JISX0213String.isValid("\u81E1"));	// 臡
        assertEquals(JISX0213String.length("\u81E1"), 1);
        assertFalse(JISX0213String.isValid("\u81EB"));	// 臫
        assertEquals(JISX0213String.length("\u81EB"), 1);
        assertFalse(JISX0213String.isValid("\u81F0"));	// 臰
        assertEquals(JISX0213String.length("\u81F0"), 1);
        assertFalse(JISX0213String.isValid("\u81F1"));	// 臱
        assertEquals(JISX0213String.length("\u81F1"), 1);
        assertFalse(JISX0213String.isValid("\u81F2"));	// 臲
        assertEquals(JISX0213String.length("\u81F2"), 1);
        assertFalse(JISX0213String.isValid("\u81F5"));	// 臵
        assertEquals(JISX0213String.length("\u81F5"), 1);
        assertFalse(JISX0213String.isValid("\u81F6"));	// 臶
        assertEquals(JISX0213String.length("\u81F6"), 1);
        assertFalse(JISX0213String.isValid("\u81F8"));	// 臸
        assertEquals(JISX0213String.length("\u81F8"), 1);
        assertFalse(JISX0213String.isValid("\u81F9"));	// 臹
        assertEquals(JISX0213String.length("\u81F9"), 1);
        assertFalse(JISX0213String.isValid("\u8200"));	// 舀
        assertEquals(JISX0213String.length("\u8200"), 1);
        assertFalse(JISX0213String.isValid("\u8203"));	// 舃
        assertEquals(JISX0213String.length("\u8203"), 1);
        assertFalse(JISX0213String.isValid("\u820F"));	// 舏
        assertEquals(JISX0213String.length("\u820F"), 1);
        assertFalse(JISX0213String.isValid("\u8213"));	// 舓
        assertEquals(JISX0213String.length("\u8213"), 1);
        assertFalse(JISX0213String.isValid("\u8214"));	// 舔
        assertEquals(JISX0213String.length("\u8214"), 1);
        assertFalse(JISX0213String.isValid("\u821A"));	// 舚
        assertEquals(JISX0213String.length("\u821A"), 1);
        assertFalse(JISX0213String.isValid("\u821D"));	// 舝
        assertEquals(JISX0213String.length("\u821D"), 1);
        assertFalse(JISX0213String.isValid("\u8228"));	// 舨
        assertEquals(JISX0213String.length("\u8228"), 1);
        assertFalse(JISX0213String.isValid("\u823A"));	// 舺
        assertEquals(JISX0213String.length("\u823A"), 1);
        assertFalse(JISX0213String.isValid("\u8243"));	// 艃
        assertEquals(JISX0213String.length("\u8243"), 1);
        assertFalse(JISX0213String.isValid("\u8244"));	// 艄
        assertEquals(JISX0213String.length("\u8244"), 1);
        assertFalse(JISX0213String.isValid("\u824E"));	// 艎
        assertEquals(JISX0213String.length("\u824E"), 1);
        assertFalse(JISX0213String.isValid("\u8251"));	// 艑
        assertEquals(JISX0213String.length("\u8251"), 1);
        assertFalse(JISX0213String.isValid("\u8256"));	// 艖
        assertEquals(JISX0213String.length("\u8256"), 1);
        assertFalse(JISX0213String.isValid("\u8267"));	// 艧
        assertEquals(JISX0213String.length("\u8267"), 1);
        assertFalse(JISX0213String.isValid("\u826D"));	// 艭
        assertEquals(JISX0213String.length("\u826D"), 1);
        assertFalse(JISX0213String.isValid("\u827B"));	// 艻
        assertEquals(JISX0213String.length("\u827B"), 1);
        assertFalse(JISX0213String.isValid("\u8280"));	// 芀
        assertEquals(JISX0213String.length("\u8280"), 1);
        assertFalse(JISX0213String.isValid("\u8281"));	// 芁
        assertEquals(JISX0213String.length("\u8281"), 1);
        assertFalse(JISX0213String.isValid("\u8284"));	// 芄
        assertEquals(JISX0213String.length("\u8284"), 1);
        assertFalse(JISX0213String.isValid("\u8287"));	// 芇
        assertEquals(JISX0213String.length("\u8287"), 1);
        assertFalse(JISX0213String.isValid("\u8289"));	// 芉
        assertEquals(JISX0213String.length("\u8289"), 1);
        assertFalse(JISX0213String.isValid("\u8291"));	// 芑
        assertEquals(JISX0213String.length("\u8291"), 1);
        assertFalse(JISX0213String.isValid("\u8294"));	// 芔
        assertEquals(JISX0213String.length("\u8294"), 1);
        assertFalse(JISX0213String.isValid("\u8296"));	// 芖
        assertEquals(JISX0213String.length("\u8296"), 1);
        assertFalse(JISX0213String.isValid("\u8298"));	// 芘
        assertEquals(JISX0213String.length("\u8298"), 1);
        assertFalse(JISX0213String.isValid("\u829A"));	// 芚
        assertEquals(JISX0213String.length("\u829A"), 1);
        assertFalse(JISX0213String.isValid("\u829B"));	// 芛
        assertEquals(JISX0213String.length("\u829B"), 1);
        assertFalse(JISX0213String.isValid("\u82A0"));	// 芠
        assertEquals(JISX0213String.length("\u82A0"), 1);
        assertFalse(JISX0213String.isValid("\u82AA"));	// 芪
        assertEquals(JISX0213String.length("\u82AA"), 1);
        assertFalse(JISX0213String.isValid("\u82B0"));	// 芰
        assertEquals(JISX0213String.length("\u82B0"), 1);
        assertFalse(JISX0213String.isValid("\u82D0"));	// 苐
        assertEquals(JISX0213String.length("\u82D0"), 1);
        assertFalse(JISX0213String.isValid("\u82DA"));	// 苚
        assertEquals(JISX0213String.length("\u82DA"), 1);
        assertFalse(JISX0213String.isValid("\u82E0"));	// 苠
        assertEquals(JISX0213String.length("\u82E0"), 1);
        assertFalse(JISX0213String.isValid("\u82E4"));	// 苤
        assertEquals(JISX0213String.length("\u82E4"), 1);
        assertFalse(JISX0213String.isValid("\u82EA"));	// 苪
        assertEquals(JISX0213String.length("\u82EA"), 1);
        assertFalse(JISX0213String.isValid("\u82ED"));	// 苭
        assertEquals(JISX0213String.length("\u82ED"), 1);
        assertFalse(JISX0213String.isValid("\u82EF"));	// 苯
        assertEquals(JISX0213String.length("\u82EF"), 1);
        assertFalse(JISX0213String.isValid("\u82F6"));	// 苶
        assertEquals(JISX0213String.length("\u82F6"), 1);
        assertFalse(JISX0213String.isValid("\u830A"));	// 茊
        assertEquals(JISX0213String.length("\u830A"), 1);
        assertFalse(JISX0213String.isValid("\u830B"));	// 茋
        assertEquals(JISX0213String.length("\u830B"), 1);
        assertFalse(JISX0213String.isValid("\u831E"));	// 茞
        assertEquals(JISX0213String.length("\u831E"), 1);
        assertFalse(JISX0213String.isValid("\u831F"));	// 茟
        assertEquals(JISX0213String.length("\u831F"), 1);
        assertFalse(JISX0213String.isValid("\u8321"));	// 茡
        assertEquals(JISX0213String.length("\u8321"), 1);
        assertFalse(JISX0213String.isValid("\u832C"));	// 茬
        assertEquals(JISX0213String.length("\u832C"), 1);
        assertFalse(JISX0213String.isValid("\u832E"));	// 茮
        assertEquals(JISX0213String.length("\u832E"), 1);
        assertFalse(JISX0213String.isValid("\u8333"));	// 茳
        assertEquals(JISX0213String.length("\u8333"), 1);
        assertFalse(JISX0213String.isValid("\u8337"));	// 茷
        assertEquals(JISX0213String.length("\u8337"), 1);
        assertFalse(JISX0213String.isValid("\u833D"));	// 茽
        assertEquals(JISX0213String.length("\u833D"), 1);
        assertFalse(JISX0213String.isValid("\u8342"));	// 荂
        assertEquals(JISX0213String.length("\u8342"), 1);
        assertFalse(JISX0213String.isValid("\u834D"));	// 荍
        assertEquals(JISX0213String.length("\u834D"), 1);
        assertFalse(JISX0213String.isValid("\u834E"));	// 荎
        assertEquals(JISX0213String.length("\u834E"), 1);
        assertFalse(JISX0213String.isValid("\u8356"));	// 荖
        assertEquals(JISX0213String.length("\u8356"), 1);
        assertFalse(JISX0213String.isValid("\u8370"));	// 荰
        assertEquals(JISX0213String.length("\u8370"), 1);
        assertFalse(JISX0213String.isValid("\u8378"));	// 荸
        assertEquals(JISX0213String.length("\u8378"), 1);
        assertFalse(JISX0213String.isValid("\u8380"));	// 莀
        assertEquals(JISX0213String.length("\u8380"), 1);
        assertFalse(JISX0213String.isValid("\u8382"));	// 莂
        assertEquals(JISX0213String.length("\u8382"), 1);
        assertFalse(JISX0213String.isValid("\u8384"));	// 莄
        assertEquals(JISX0213String.length("\u8384"), 1);
        assertFalse(JISX0213String.isValid("\u8399"));	// 莙
        assertEquals(JISX0213String.length("\u8399"), 1);
        assertFalse(JISX0213String.isValid("\u839C"));	// 莜
        assertEquals(JISX0213String.length("\u839C"), 1);
        assertFalse(JISX0213String.isValid("\u83A6"));	// 莦
        assertEquals(JISX0213String.length("\u83A6"), 1);
        assertFalse(JISX0213String.isValid("\u83AC"));	// 莬
        assertEquals(JISX0213String.length("\u83AC"), 1);
        assertFalse(JISX0213String.isValid("\u83BE"));	// 莾
        assertEquals(JISX0213String.length("\u83BE"), 1);
        assertFalse(JISX0213String.isValid("\u8353"));	// 荓
        assertEquals(JISX0213String.length("\u8353"), 1);
        assertFalse(JISX0213String.isValid("\u83E8"));	// 菨
        assertEquals(JISX0213String.length("\u83E8"), 1);
        assertFalse(JISX0213String.isValid("\u83F8"));	// 菸
        assertEquals(JISX0213String.length("\u83F8"), 1);
        assertFalse(JISX0213String.isValid("\u83FC"));	// 菼
        assertEquals(JISX0213String.length("\u83FC"), 1);
        assertFalse(JISX0213String.isValid("\u8419"));	// 萙
        assertEquals(JISX0213String.length("\u8419"), 1);
        assertFalse(JISX0213String.isValid("\u83AD"));	// 莭
        assertEquals(JISX0213String.length("\u83AD"), 1);
        assertFalse(JISX0213String.isValid("\u842F"));	// 萯
        assertEquals(JISX0213String.length("\u842F"), 1);
        assertFalse(JISX0213String.isValid("\u8445"));	// 葅
        assertEquals(JISX0213String.length("\u8445"), 1);
        assertFalse(JISX0213String.isValid("\u8447"));	// 葇
        assertEquals(JISX0213String.length("\u8447"), 1);
        assertFalse(JISX0213String.isValid("\u844D"));	// 葍
        assertEquals(JISX0213String.length("\u844D"), 1);
        assertFalse(JISX0213String.isValid("\u8456"));	// 葖
        assertEquals(JISX0213String.length("\u8456"), 1);
        assertFalse(JISX0213String.isValid("\u8458"));	// 葘
        assertEquals(JISX0213String.length("\u8458"), 1);
        assertFalse(JISX0213String.isValid("\u8460"));	// 葠
        assertEquals(JISX0213String.length("\u8460"), 1);
        assertFalse(JISX0213String.isValid("\u8464"));	// 葤
        assertEquals(JISX0213String.length("\u8464"), 1);
        assertFalse(JISX0213String.isValid("\u8467"));	// 葧
        assertEquals(JISX0213String.length("\u8467"), 1);
        assertFalse(JISX0213String.isValid("\u846A"));	// 葪
        assertEquals(JISX0213String.length("\u846A"), 1);
        assertFalse(JISX0213String.isValid("\u8474"));	// 葴
        assertEquals(JISX0213String.length("\u8474"), 1);
        assertFalse(JISX0213String.isValid("\u847D"));	// 葽
        assertEquals(JISX0213String.length("\u847D"), 1);
        assertFalse(JISX0213String.isValid("\u8492"));	// 蒒
        assertEquals(JISX0213String.length("\u8492"), 1);
        assertFalse(JISX0213String.isValid("\u8493"));	// 蒓
        assertEquals(JISX0213String.length("\u8493"), 1);
        assertFalse(JISX0213String.isValid("\u8495"));	// 蒕
        assertEquals(JISX0213String.length("\u8495"), 1);
        assertFalse(JISX0213String.isValid("\u84A8"));	// 蒨
        assertEquals(JISX0213String.length("\u84A8"), 1);
        assertFalse(JISX0213String.isValid("\u84A9"));	// 蒩
        assertEquals(JISX0213String.length("\u84A9"), 1);
        assertFalse(JISX0213String.isValid("\u84AA"));	// 蒪
        assertEquals(JISX0213String.length("\u84AA"), 1);
        assertFalse(JISX0213String.isValid("\u84B1"));	// 蒱
        assertEquals(JISX0213String.length("\u84B1"), 1);
        assertFalse(JISX0213String.isValid("\u84BD"));	// 蒽
        assertEquals(JISX0213String.length("\u84BD"), 1);
        assertFalse(JISX0213String.isValid("\u84C7"));	// 蓇
        assertEquals(JISX0213String.length("\u84C7"), 1);
        assertFalse(JISX0213String.isValid("\u84C8"));	// 蓈
        assertEquals(JISX0213String.length("\u84C8"), 1);
        assertFalse(JISX0213String.isValid("\u84CC"));	// 蓌
        assertEquals(JISX0213String.length("\u84CC"), 1);
        assertFalse(JISX0213String.isValid("\u84F2"));	// 蓲
        assertEquals(JISX0213String.length("\u84F2"), 1);
        assertFalse(JISX0213String.isValid("\u84F7"));	// 蓷
        assertEquals(JISX0213String.length("\u84F7"), 1);
        assertFalse(JISX0213String.isValid("\u84FB"));	// 蓻
        assertEquals(JISX0213String.length("\u84FB"), 1);
        assertFalse(JISX0213String.isValid("\u8502"));	// 蔂
        assertEquals(JISX0213String.length("\u8502"), 1);
        assertFalse(JISX0213String.isValid("\u8503"));	// 蔃
        assertEquals(JISX0213String.length("\u8503"), 1);
        assertFalse(JISX0213String.isValid("\u8507"));	// 蔇
        assertEquals(JISX0213String.length("\u8507"), 1);
        assertFalse(JISX0213String.isValid("\u850E"));	// 蔎
        assertEquals(JISX0213String.length("\u850E"), 1);
        assertFalse(JISX0213String.isValid("\u8510"));	// 蔐
        assertEquals(JISX0213String.length("\u8510"), 1);
        assertFalse(JISX0213String.isValid("\u851C"));	// 蔜
        assertEquals(JISX0213String.length("\u851C"), 1);
        assertFalse(JISX0213String.isValid("\u8522"));	// 蔢
        assertEquals(JISX0213String.length("\u8522"), 1);
        assertFalse(JISX0213String.isValid("\u8527"));	// 蔧
        assertEquals(JISX0213String.length("\u8527"), 1);
        assertFalse(JISX0213String.isValid("\u852A"));	// 蔪
        assertEquals(JISX0213String.length("\u852A"), 1);
        assertFalse(JISX0213String.isValid("\u8533"));	// 蔳
        assertEquals(JISX0213String.length("\u8533"), 1);
        assertFalse(JISX0213String.isValid("\u8536"));	// 蔶
        assertEquals(JISX0213String.length("\u8536"), 1);
        assertFalse(JISX0213String.isValid("\u853F"));	// 蔿
        assertEquals(JISX0213String.length("\u853F"), 1);
        assertFalse(JISX0213String.isValid("\u8546"));	// 蕆
        assertEquals(JISX0213String.length("\u8546"), 1);
        assertFalse(JISX0213String.isValid("\u8550"));	// 蕐
        assertEquals(JISX0213String.length("\u8550"), 1);
        assertFalse(JISX0213String.isValid("\u8552"));	// 蕒
        assertEquals(JISX0213String.length("\u8552"), 1);
        assertFalse(JISX0213String.isValid("\u8556"));	// 蕖
        assertEquals(JISX0213String.length("\u8556"), 1);
        assertFalse(JISX0213String.isValid("\u855C"));	// 蕜
        assertEquals(JISX0213String.length("\u855C"), 1);
        assertFalse(JISX0213String.isValid("\u855D"));	// 蕝
        assertEquals(JISX0213String.length("\u855D"), 1);
        assertFalse(JISX0213String.isValid("\u855F"));	// 蕟
        assertEquals(JISX0213String.length("\u855F"), 1);
        assertFalse(JISX0213String.isValid("\u8560"));	// 蕠
        assertEquals(JISX0213String.length("\u8560"), 1);
        assertFalse(JISX0213String.isValid("\u8579"));	// 蕹
        assertEquals(JISX0213String.length("\u8579"), 1);
        assertFalse(JISX0213String.isValid("\u8585"));	// 薅
        assertEquals(JISX0213String.length("\u8585"), 1);
        assertFalse(JISX0213String.isValid("\u8589"));	// 薉
        assertEquals(JISX0213String.length("\u8589"), 1);
        assertFalse(JISX0213String.isValid("\u858B"));	// 薋
        assertEquals(JISX0213String.length("\u858B"), 1);
        assertFalse(JISX0213String.isValid("\u8598"));	// 薘
        assertEquals(JISX0213String.length("\u8598"), 1);
        assertFalse(JISX0213String.isValid("\u85A0"));	// 薠
        assertEquals(JISX0213String.length("\u85A0"), 1);
        assertFalse(JISX0213String.isValid("\u85A5"));	// 薥
        assertEquals(JISX0213String.length("\u85A5"), 1);
        assertFalse(JISX0213String.isValid("\u85A7"));	// 薧
        assertEquals(JISX0213String.length("\u85A7"), 1);
        assertFalse(JISX0213String.isValid("\u85B4"));	// 薴
        assertEquals(JISX0213String.length("\u85B4"), 1);
        assertFalse(JISX0213String.isValid("\u85B6"));	// 薶
        assertEquals(JISX0213String.length("\u85B6"), 1);
        assertFalse(JISX0213String.isValid("\u85B8"));	// 薸
        assertEquals(JISX0213String.length("\u85B8"), 1);
        assertFalse(JISX0213String.isValid("\u85BD"));	// 薽
        assertEquals(JISX0213String.length("\u85BD"), 1);
        assertFalse(JISX0213String.isValid("\u85BE"));	// 薾
        assertEquals(JISX0213String.length("\u85BE"), 1);
        assertFalse(JISX0213String.isValid("\u85BF"));	// 薿
        assertEquals(JISX0213String.length("\u85BF"), 1);
        assertFalse(JISX0213String.isValid("\u85C2"));	// 藂
        assertEquals(JISX0213String.length("\u85C2"), 1);
        assertFalse(JISX0213String.isValid("\u85DA"));	// 藚
        assertEquals(JISX0213String.length("\u85DA"), 1);
        assertFalse(JISX0213String.isValid("\u85E0"));	// 藠
        assertEquals(JISX0213String.length("\u85E0"), 1);
        assertFalse(JISX0213String.isValid("\u85E8"));	// 藨
        assertEquals(JISX0213String.length("\u85E8"), 1);
        assertFalse(JISX0213String.isValid("\u85F3"));	// 藳
        assertEquals(JISX0213String.length("\u85F3"), 1);
        assertFalse(JISX0213String.isValid("\u85FC"));	// 藼
        assertEquals(JISX0213String.length("\u85FC"), 1);
        assertFalse(JISX0213String.isValid("\u860D"));	// 蘍
        assertEquals(JISX0213String.length("\u860D"), 1);
        assertFalse(JISX0213String.isValid("\u860E"));	// 蘎
        assertEquals(JISX0213String.length("\u860E"), 1);
        assertFalse(JISX0213String.isValid("\u8619"));	// 蘙
        assertEquals(JISX0213String.length("\u8619"), 1);
        assertFalse(JISX0213String.isValid("\u861B"));	// 蘛
        assertEquals(JISX0213String.length("\u861B"), 1);
        assertFalse(JISX0213String.isValid("\u8636"));	// 蘶
        assertEquals(JISX0213String.length("\u8636"), 1);
        assertFalse(JISX0213String.isValid("\u863A"));	// 蘺
        assertEquals(JISX0213String.length("\u863A"), 1);
        assertFalse(JISX0213String.isValid("\u863D"));	// 蘽
        assertEquals(JISX0213String.length("\u863D"), 1);
        assertFalse(JISX0213String.isValid("\u8642"));	// 虂
        assertEquals(JISX0213String.length("\u8642"), 1);
        assertFalse(JISX0213String.isValid("\u8646"));	// 虆
        assertEquals(JISX0213String.length("\u8646"), 1);
        assertFalse(JISX0213String.isValid("\u8652"));	// 虒
        assertEquals(JISX0213String.length("\u8652"), 1);
        assertFalse(JISX0213String.isValid("\u8658"));	// 虘
        assertEquals(JISX0213String.length("\u8658"), 1);
        assertFalse(JISX0213String.isValid("\u8659"));	// 虙
        assertEquals(JISX0213String.length("\u8659"), 1);
        assertFalse(JISX0213String.isValid("\u865D"));	// 虝
        assertEquals(JISX0213String.length("\u865D"), 1);
        assertFalse(JISX0213String.isValid("\u8660"));	// 虠
        assertEquals(JISX0213String.length("\u8660"), 1);
        assertFalse(JISX0213String.isValid("\u8661"));	// 虡
        assertEquals(JISX0213String.length("\u8661"), 1);
        assertFalse(JISX0213String.isValid("\u8663"));	// 虣
        assertEquals(JISX0213String.length("\u8663"), 1);
        assertFalse(JISX0213String.isValid("\u8664"));	// 虤
        assertEquals(JISX0213String.length("\u8664"), 1);
        assertFalse(JISX0213String.isValid("\u8669"));	// 虩
        assertEquals(JISX0213String.length("\u8669"), 1);
        assertFalse(JISX0213String.isValid("\u8676"));	// 虶
        assertEquals(JISX0213String.length("\u8676"), 1);
        assertFalse(JISX0213String.isValid("\u8696"));	// 蚖
        assertEquals(JISX0213String.length("\u8696"), 1);
        assertFalse(JISX0213String.isValid("\u869A"));	// 蚚
        assertEquals(JISX0213String.length("\u869A"), 1);
        assertFalse(JISX0213String.isValid("\u86A1"));	// 蚡
        assertEquals(JISX0213String.length("\u86A1"), 1);
        assertFalse(JISX0213String.isValid("\u86A6"));	// 蚦
        assertEquals(JISX0213String.length("\u86A6"), 1);
        assertFalse(JISX0213String.isValid("\u86A7"));	// 蚧
        assertEquals(JISX0213String.length("\u86A7"), 1);
        assertFalse(JISX0213String.isValid("\u86AD"));	// 蚭
        assertEquals(JISX0213String.length("\u86AD"), 1);
        assertFalse(JISX0213String.isValid("\u86B4"));	// 蚴
        assertEquals(JISX0213String.length("\u86B4"), 1);
        assertFalse(JISX0213String.isValid("\u86B5"));	// 蚵
        assertEquals(JISX0213String.length("\u86B5"), 1);
        assertFalse(JISX0213String.isValid("\u86B7"));	// 蚷
        assertEquals(JISX0213String.length("\u86B7"), 1);
        assertFalse(JISX0213String.isValid("\u86B9"));	// 蚹
        assertEquals(JISX0213String.length("\u86B9"), 1);
        assertFalse(JISX0213String.isValid("\u86BF"));	// 蚿
        assertEquals(JISX0213String.length("\u86BF"), 1);
        assertFalse(JISX0213String.isValid("\u86C0"));	// 蛀
        assertEquals(JISX0213String.length("\u86C0"), 1);
        assertFalse(JISX0213String.isValid("\u86C5"));	// 蛅
        assertEquals(JISX0213String.length("\u86C5"), 1);
        assertFalse(JISX0213String.isValid("\u86D2"));	// 蛒
        assertEquals(JISX0213String.length("\u86D2"), 1);
        assertFalse(JISX0213String.isValid("\u86DA"));	// 蛚
        assertEquals(JISX0213String.length("\u86DA"), 1);
        assertFalse(JISX0213String.isValid("\u86DC"));	// 蛜
        assertEquals(JISX0213String.length("\u86DC"), 1);
        assertFalse(JISX0213String.isValid("\u86E0"));	// 蛠
        assertEquals(JISX0213String.length("\u86E0"), 1);
        assertFalse(JISX0213String.isValid("\u86E5"));	// 蛥
        assertEquals(JISX0213String.length("\u86E5"), 1);
        assertFalse(JISX0213String.isValid("\u86E7"));	// 蛧
        assertEquals(JISX0213String.length("\u86E7"), 1);
        assertFalse(JISX0213String.isValid("\u8688"));	// 蚈
        assertEquals(JISX0213String.length("\u8688"), 1);
        assertFalse(JISX0213String.isValid("\u8704"));	// 蜄
        assertEquals(JISX0213String.length("\u8704"), 1);
        assertFalse(JISX0213String.isValid("\u870F"));	// 蜏
        assertEquals(JISX0213String.length("\u870F"), 1);
        assertFalse(JISX0213String.isValid("\u8714"));	// 蜔
        assertEquals(JISX0213String.length("\u8714"), 1);
        assertFalse(JISX0213String.isValid("\u871E"));	// 蜞
        assertEquals(JISX0213String.length("\u871E"), 1);
        assertFalse(JISX0213String.isValid("\u8728"));	// 蜨
        assertEquals(JISX0213String.length("\u8728"), 1);
        assertFalse(JISX0213String.isValid("\u872E"));	// 蜮
        assertEquals(JISX0213String.length("\u872E"), 1);
        assertFalse(JISX0213String.isValid("\u872F"));	// 蜯
        assertEquals(JISX0213String.length("\u872F"), 1);
        assertFalse(JISX0213String.isValid("\u8732"));	// 蜲
        assertEquals(JISX0213String.length("\u8732"), 1);
        assertFalse(JISX0213String.isValid("\u8739"));	// 蜹
        assertEquals(JISX0213String.length("\u8739"), 1);
        assertFalse(JISX0213String.isValid("\u873C"));	// 蜼
        assertEquals(JISX0213String.length("\u873C"), 1);
        assertFalse(JISX0213String.isValid("\u873D"));	// 蜽
        assertEquals(JISX0213String.length("\u873D"), 1);
        assertFalse(JISX0213String.isValid("\u8745"));	// 蝅
        assertEquals(JISX0213String.length("\u8745"), 1);
        assertFalse(JISX0213String.isValid("\u874D"));	// 蝍
        assertEquals(JISX0213String.length("\u874D"), 1);
        assertFalse(JISX0213String.isValid("\u875D"));	// 蝝
        assertEquals(JISX0213String.length("\u875D"), 1);
        assertFalse(JISX0213String.isValid("\u8761"));	// 蝡
        assertEquals(JISX0213String.length("\u8761"), 1);
        assertFalse(JISX0213String.isValid("\u876F"));	// 蝯
        assertEquals(JISX0213String.length("\u876F"), 1);
        assertFalse(JISX0213String.isValid("\u877B"));	// 蝻
        assertEquals(JISX0213String.length("\u877B"), 1);
        assertFalse(JISX0213String.isValid("\u8783"));	// 螃
        assertEquals(JISX0213String.length("\u8783"), 1);
        assertFalse(JISX0213String.isValid("\u8784"));	// 螄
        assertEquals(JISX0213String.length("\u8784"), 1);
        assertFalse(JISX0213String.isValid("\u8785"));	// 螅
        assertEquals(JISX0213String.length("\u8785"), 1);
        assertFalse(JISX0213String.isValid("\u8786"));	// 螆
        assertEquals(JISX0213String.length("\u8786"), 1);
        assertFalse(JISX0213String.isValid("\u878C"));	// 螌
        assertEquals(JISX0213String.length("\u878C"), 1);
        assertFalse(JISX0213String.isValid("\u8790"));	// 螐
        assertEquals(JISX0213String.length("\u8790"), 1);
        assertFalse(JISX0213String.isValid("\u8795"));	// 螕
        assertEquals(JISX0213String.length("\u8795"), 1);
        assertFalse(JISX0213String.isValid("\u8797"));	// 螗
        assertEquals(JISX0213String.length("\u8797"), 1);
        assertFalse(JISX0213String.isValid("\u8798"));	// 螘
        assertEquals(JISX0213String.length("\u8798"), 1);
        assertFalse(JISX0213String.isValid("\u8799"));	// 螙
        assertEquals(JISX0213String.length("\u8799"), 1);
        assertFalse(JISX0213String.isValid("\u879E"));	// 螞
        assertEquals(JISX0213String.length("\u879E"), 1);
        assertFalse(JISX0213String.isValid("\u87A3"));	// 螣
        assertEquals(JISX0213String.length("\u87A3"), 1);
        assertFalse(JISX0213String.isValid("\u87AE"));	// 螮
        assertEquals(JISX0213String.length("\u87AE"), 1);
        assertFalse(JISX0213String.isValid("\u87B1"));	// 螱
        assertEquals(JISX0213String.length("\u87B1"), 1);
        assertFalse(JISX0213String.isValid("\u87BF"));	// 螿
        assertEquals(JISX0213String.length("\u87BF"), 1);
        assertFalse(JISX0213String.isValid("\u87C8"));	// 蟈
        assertEquals(JISX0213String.length("\u87C8"), 1);
        assertFalse(JISX0213String.isValid("\u87C9"));	// 蟉
        assertEquals(JISX0213String.length("\u87C9"), 1);
        assertFalse(JISX0213String.isValid("\u87CA"));	// 蟊
        assertEquals(JISX0213String.length("\u87CA"), 1);
        assertFalse(JISX0213String.isValid("\u87D5"));	// 蟕
        assertEquals(JISX0213String.length("\u87D5"), 1);
        assertFalse(JISX0213String.isValid("\u87D9"));	// 蟙
        assertEquals(JISX0213String.length("\u87D9"), 1);
        assertFalse(JISX0213String.isValid("\u87DA"));	// 蟚
        assertEquals(JISX0213String.length("\u87DA"), 1);
        assertFalse(JISX0213String.isValid("\u87DC"));	// 蟜
        assertEquals(JISX0213String.length("\u87DC"), 1);
        assertFalse(JISX0213String.isValid("\u87E2"));	// 蟢
        assertEquals(JISX0213String.length("\u87E2"), 1);
        assertFalse(JISX0213String.isValid("\u87E4"));	// 蟤
        assertEquals(JISX0213String.length("\u87E4"), 1);
        assertFalse(JISX0213String.isValid("\u87F1"));	// 蟱
        assertEquals(JISX0213String.length("\u87F1"), 1);
        assertFalse(JISX0213String.isValid("\u87F3"));	// 蟳
        assertEquals(JISX0213String.length("\u87F3"), 1);
        assertFalse(JISX0213String.isValid("\u87F8"));	// 蟸
        assertEquals(JISX0213String.length("\u87F8"), 1);
        assertFalse(JISX0213String.isValid("\u87FA"));	// 蟺
        assertEquals(JISX0213String.length("\u87FA"), 1);
        assertFalse(JISX0213String.isValid("\u87FF"));	// 蟿
        assertEquals(JISX0213String.length("\u87FF"), 1);
        assertFalse(JISX0213String.isValid("\u8809"));	// 蠉
        assertEquals(JISX0213String.length("\u8809"), 1);
        assertFalse(JISX0213String.isValid("\u8819"));	// 蠙
        assertEquals(JISX0213String.length("\u8819"), 1);
        assertFalse(JISX0213String.isValid("\u8812"));	// 蠒
        assertEquals(JISX0213String.length("\u8812"), 1);
        assertFalse(JISX0213String.isValid("\u8818"));	// 蠘
        assertEquals(JISX0213String.length("\u8818"), 1);
        assertFalse(JISX0213String.isValid("\u881A"));	// 蠚
        assertEquals(JISX0213String.length("\u881A"), 1);
        assertFalse(JISX0213String.isValid("\u881B"));	// 蠛
        assertEquals(JISX0213String.length("\u881B"), 1);
        assertFalse(JISX0213String.isValid("\u881C"));	// 蠜
        assertEquals(JISX0213String.length("\u881C"), 1);
        assertFalse(JISX0213String.isValid("\u881E"));	// 蠞
        assertEquals(JISX0213String.length("\u881E"), 1);
        assertFalse(JISX0213String.isValid("\u882D"));	// 蠭
        assertEquals(JISX0213String.length("\u882D"), 1);
        assertFalse(JISX0213String.isValid("\u8830"));	// 蠰
        assertEquals(JISX0213String.length("\u8830"), 1);
        assertFalse(JISX0213String.isValid("\u8835"));	// 蠵
        assertEquals(JISX0213String.length("\u8835"), 1);
        assertFalse(JISX0213String.isValid("\u883A"));	// 蠺
        assertEquals(JISX0213String.length("\u883A"), 1);
        assertFalse(JISX0213String.isValid("\u8841"));	// 衁
        assertEquals(JISX0213String.length("\u8841"), 1);
        assertFalse(JISX0213String.isValid("\u8843"));	// 衃
        assertEquals(JISX0213String.length("\u8843"), 1);
        assertFalse(JISX0213String.isValid("\u8845"));	// 衅
        assertEquals(JISX0213String.length("\u8845"), 1);
        assertFalse(JISX0213String.isValid("\u8848"));	// 衈
        assertEquals(JISX0213String.length("\u8848"), 1);
        assertFalse(JISX0213String.isValid("\u8849"));	// 衉
        assertEquals(JISX0213String.length("\u8849"), 1);
        assertFalse(JISX0213String.isValid("\u884B"));	// 衋
        assertEquals(JISX0213String.length("\u884B"), 1);
        assertFalse(JISX0213String.isValid("\u884E"));	// 衎
        assertEquals(JISX0213String.length("\u884E"), 1);
        assertFalse(JISX0213String.isValid("\u8851"));	// 衑
        assertEquals(JISX0213String.length("\u8851"), 1);
        assertFalse(JISX0213String.isValid("\u8855"));	// 衕
        assertEquals(JISX0213String.length("\u8855"), 1);
        assertFalse(JISX0213String.isValid("\u8856"));	// 衖
        assertEquals(JISX0213String.length("\u8856"), 1);
        assertFalse(JISX0213String.isValid("\u885A"));	// 衚
        assertEquals(JISX0213String.length("\u885A"), 1);
        assertFalse(JISX0213String.isValid("\u885C"));	// 衜
        assertEquals(JISX0213String.length("\u885C"), 1);
        assertFalse(JISX0213String.isValid("\u8860"));	// 衠
        assertEquals(JISX0213String.length("\u8860"), 1);
        assertFalse(JISX0213String.isValid("\u8871"));	// 衱
        assertEquals(JISX0213String.length("\u8871"), 1);
        assertFalse(JISX0213String.isValid("\u8879"));	// 衹
        assertEquals(JISX0213String.length("\u8879"), 1);
        assertFalse(JISX0213String.isValid("\u887B"));	// 衻
        assertEquals(JISX0213String.length("\u887B"), 1);
        assertFalse(JISX0213String.isValid("\u8880"));	// 袀
        assertEquals(JISX0213String.length("\u8880"), 1);
        assertFalse(JISX0213String.isValid("\u889A"));	// 袚
        assertEquals(JISX0213String.length("\u889A"), 1);
        assertFalse(JISX0213String.isValid("\u889B"));	// 袛
        assertEquals(JISX0213String.length("\u889B"), 1);
        assertFalse(JISX0213String.isValid("\u889C"));	// 袜
        assertEquals(JISX0213String.length("\u889C"), 1);
        assertFalse(JISX0213String.isValid("\u889F"));	// 袟
        assertEquals(JISX0213String.length("\u889F"), 1);
        assertFalse(JISX0213String.isValid("\u88A8"));	// 袨
        assertEquals(JISX0213String.length("\u88A8"), 1);
        assertFalse(JISX0213String.isValid("\u88BA"));	// 袺
        assertEquals(JISX0213String.length("\u88BA"), 1);
        assertFalse(JISX0213String.isValid("\u88CB"));	// 裋
        assertEquals(JISX0213String.length("\u88CB"), 1);
        assertFalse(JISX0213String.isValid("\u88CC"));	// 裌
        assertEquals(JISX0213String.length("\u88CC"), 1);
        assertFalse(JISX0213String.isValid("\u88CD"));	// 裍
        assertEquals(JISX0213String.length("\u88CD"), 1);
        assertFalse(JISX0213String.isValid("\u88DE"));	// 裞
        assertEquals(JISX0213String.length("\u88DE"), 1);
        assertFalse(JISX0213String.isValid("\u88E7"));	// 裧
        assertEquals(JISX0213String.length("\u88E7"), 1);
        assertFalse(JISX0213String.isValid("\u88EF"));	// 裯
        assertEquals(JISX0213String.length("\u88EF"), 1);
        assertFalse(JISX0213String.isValid("\u88F7"));	// 裷
        assertEquals(JISX0213String.length("\u88F7"), 1);
        assertFalse(JISX0213String.isValid("\u8906"));	// 褆
        assertEquals(JISX0213String.length("\u8906"), 1);
        assertFalse(JISX0213String.isValid("\u890D"));	// 褍
        assertEquals(JISX0213String.length("\u890D"), 1);
        assertFalse(JISX0213String.isValid("\u890E"));	// 褎
        assertEquals(JISX0213String.length("\u890E"), 1);
        assertFalse(JISX0213String.isValid("\u890F"));	// 褏
        assertEquals(JISX0213String.length("\u890F"), 1);
        assertFalse(JISX0213String.isValid("\u8915"));	// 褕
        assertEquals(JISX0213String.length("\u8915"), 1);
        assertFalse(JISX0213String.isValid("\u8916"));	// 褖
        assertEquals(JISX0213String.length("\u8916"), 1);
        assertFalse(JISX0213String.isValid("\u8920"));	// 褠
        assertEquals(JISX0213String.length("\u8920"), 1);
        assertFalse(JISX0213String.isValid("\u8926"));	// 褦
        assertEquals(JISX0213String.length("\u8926"), 1);
        assertFalse(JISX0213String.isValid("\u8928"));	// 褨
        assertEquals(JISX0213String.length("\u8928"), 1);
        assertFalse(JISX0213String.isValid("\u8931"));	// 褱
        assertEquals(JISX0213String.length("\u8931"), 1);
        assertFalse(JISX0213String.isValid("\u8935"));	// 褵
        assertEquals(JISX0213String.length("\u8935"), 1);
        assertFalse(JISX0213String.isValid("\u893A"));	// 褺
        assertEquals(JISX0213String.length("\u893A"), 1);
        assertFalse(JISX0213String.isValid("\u893E"));	// 褾
        assertEquals(JISX0213String.length("\u893E"), 1);
        assertFalse(JISX0213String.isValid("\u8946"));	// 襆
        assertEquals(JISX0213String.length("\u8946"), 1);
        assertFalse(JISX0213String.isValid("\u894F"));	// 襏
        assertEquals(JISX0213String.length("\u894F"), 1);
        assertFalse(JISX0213String.isValid("\u8952"));	// 襒
        assertEquals(JISX0213String.length("\u8952"), 1);
        assertFalse(JISX0213String.isValid("\u8957"));	// 襗
        assertEquals(JISX0213String.length("\u8957"), 1);
        assertFalse(JISX0213String.isValid("\u895A"));	// 襚
        assertEquals(JISX0213String.length("\u895A"), 1);
        assertFalse(JISX0213String.isValid("\u895B"));	// 襛
        assertEquals(JISX0213String.length("\u895B"), 1);
        assertFalse(JISX0213String.isValid("\u895C"));	// 襜
        assertEquals(JISX0213String.length("\u895C"), 1);
        assertFalse(JISX0213String.isValid("\u8961"));	// 襡
        assertEquals(JISX0213String.length("\u8961"), 1);
        assertFalse(JISX0213String.isValid("\u8963"));	// 襣
        assertEquals(JISX0213String.length("\u8963"), 1);
        assertFalse(JISX0213String.isValid("\u896B"));	// 襫
        assertEquals(JISX0213String.length("\u896B"), 1);
        assertFalse(JISX0213String.isValid("\u896E"));	// 襮
        assertEquals(JISX0213String.length("\u896E"), 1);
        assertFalse(JISX0213String.isValid("\u8970"));	// 襰
        assertEquals(JISX0213String.length("\u8970"), 1);
        assertFalse(JISX0213String.isValid("\u8973"));	// 襳
        assertEquals(JISX0213String.length("\u8973"), 1);
        assertFalse(JISX0213String.isValid("\u8975"));	// 襵
        assertEquals(JISX0213String.length("\u8975"), 1);
        assertFalse(JISX0213String.isValid("\u897A"));	// 襺
        assertEquals(JISX0213String.length("\u897A"), 1);
        assertFalse(JISX0213String.isValid("\u897B"));	// 襻
        assertEquals(JISX0213String.length("\u897B"), 1);
        assertFalse(JISX0213String.isValid("\u897C"));	// 襼
        assertEquals(JISX0213String.length("\u897C"), 1);
        assertFalse(JISX0213String.isValid("\u897D"));	// 襽
        assertEquals(JISX0213String.length("\u897D"), 1);
        assertFalse(JISX0213String.isValid("\u898D"));	// 覍
        assertEquals(JISX0213String.length("\u898D"), 1);
        assertFalse(JISX0213String.isValid("\u8995"));	// 覕
        assertEquals(JISX0213String.length("\u8995"), 1);
        assertFalse(JISX0213String.isValid("\u899B"));	// 覛
        assertEquals(JISX0213String.length("\u899B"), 1);
        assertFalse(JISX0213String.isValid("\u899C"));	// 覜
        assertEquals(JISX0213String.length("\u899C"), 1);
        assertFalse(JISX0213String.isValid("\u89A0"));	// 覠
        assertEquals(JISX0213String.length("\u89A0"), 1);
        assertFalse(JISX0213String.isValid("\u89A5"));	// 覥
        assertEquals(JISX0213String.length("\u89A5"), 1);
        assertFalse(JISX0213String.isValid("\u89B4"));	// 覴
        assertEquals(JISX0213String.length("\u89B4"), 1);
        assertFalse(JISX0213String.isValid("\u89B5"));	// 覵
        assertEquals(JISX0213String.length("\u89B5"), 1);
        assertFalse(JISX0213String.isValid("\u89B6"));	// 覶
        assertEquals(JISX0213String.length("\u89B6"), 1);
        assertFalse(JISX0213String.isValid("\u89BC"));	// 覼
        assertEquals(JISX0213String.length("\u89BC"), 1);
        assertFalse(JISX0213String.isValid("\u89D5"));	// 觕
        assertEquals(JISX0213String.length("\u89D5"), 1);
        assertFalse(JISX0213String.isValid("\u89D7"));	// 觗
        assertEquals(JISX0213String.length("\u89D7"), 1);
        assertFalse(JISX0213String.isValid("\u89E9"));	// 觩
        assertEquals(JISX0213String.length("\u89E9"), 1);
        assertFalse(JISX0213String.isValid("\u89ED"));	// 觭
        assertEquals(JISX0213String.length("\u89ED"), 1);
        assertFalse(JISX0213String.isValid("\u89F9"));	// 觹
        assertEquals(JISX0213String.length("\u89F9"), 1);
        assertFalse(JISX0213String.isValid("\u8A04"));	// 訄
        assertEquals(JISX0213String.length("\u8A04"), 1);
        assertFalse(JISX0213String.isValid("\u8A05"));	// 訅
        assertEquals(JISX0213String.length("\u8A05"), 1);
        assertFalse(JISX0213String.isValid("\u8A07"));	// 訇
        assertEquals(JISX0213String.length("\u8A07"), 1);
        assertFalse(JISX0213String.isValid("\u8A0F"));	// 訏
        assertEquals(JISX0213String.length("\u8A0F"), 1);
        assertFalse(JISX0213String.isValid("\u8A1E"));	// 訞
        assertEquals(JISX0213String.length("\u8A1E"), 1);
        assertFalse(JISX0213String.isValid("\u8A20"));	// 訠
        assertEquals(JISX0213String.length("\u8A20"), 1);
        assertFalse(JISX0213String.isValid("\u8A24"));	// 訤
        assertEquals(JISX0213String.length("\u8A24"), 1);
        assertFalse(JISX0213String.isValid("\u8A26"));	// 訦
        assertEquals(JISX0213String.length("\u8A26"), 1);
        assertFalse(JISX0213String.isValid("\u8A2B"));	// 訫
        assertEquals(JISX0213String.length("\u8A2B"), 1);
        assertFalse(JISX0213String.isValid("\u8A2C"));	// 訬
        assertEquals(JISX0213String.length("\u8A2C"), 1);
        assertFalse(JISX0213String.isValid("\u8A2F"));	// 訯
        assertEquals(JISX0213String.length("\u8A2F"), 1);
        assertFalse(JISX0213String.isValid("\u8A3D"));	// 訽
        assertEquals(JISX0213String.length("\u8A3D"), 1);
        assertFalse(JISX0213String.isValid("\u8A40"));	// 詀
        assertEquals(JISX0213String.length("\u8A40"), 1);
        assertFalse(JISX0213String.isValid("\u8A43"));	// 詃
        assertEquals(JISX0213String.length("\u8A43"), 1);
        assertFalse(JISX0213String.isValid("\u8A49"));	// 詉
        assertEquals(JISX0213String.length("\u8A49"), 1);
        assertFalse(JISX0213String.isValid("\u8A53"));	// 詓
        assertEquals(JISX0213String.length("\u8A53"), 1);
        assertFalse(JISX0213String.isValid("\u8A56"));	// 詖
        assertEquals(JISX0213String.length("\u8A56"), 1);
        assertFalse(JISX0213String.isValid("\u8A57"));	// 詗
        assertEquals(JISX0213String.length("\u8A57"), 1);
        assertFalse(JISX0213String.isValid("\u8A5C"));	// 詜
        assertEquals(JISX0213String.length("\u8A5C"), 1);
        assertFalse(JISX0213String.isValid("\u8A65"));	// 詥
        assertEquals(JISX0213String.length("\u8A65"), 1);
        assertFalse(JISX0213String.isValid("\u8A67"));	// 詧
        assertEquals(JISX0213String.length("\u8A67"), 1);
        assertFalse(JISX0213String.isValid("\u8A76"));	// 詶
        assertEquals(JISX0213String.length("\u8A76"), 1);
        assertFalse(JISX0213String.isValid("\u8A77"));	// 詷
        assertEquals(JISX0213String.length("\u8A77"), 1);
        assertFalse(JISX0213String.isValid("\u8A7A"));	// 詺
        assertEquals(JISX0213String.length("\u8A7A"), 1);
        assertFalse(JISX0213String.isValid("\u8A7B"));	// 詻
        assertEquals(JISX0213String.length("\u8A7B"), 1);
        assertFalse(JISX0213String.isValid("\u8A7E"));	// 詾
        assertEquals(JISX0213String.length("\u8A7E"), 1);
        assertFalse(JISX0213String.isValid("\u8A7F"));	// 詿
        assertEquals(JISX0213String.length("\u8A7F"), 1);
        assertFalse(JISX0213String.isValid("\u8A80"));	// 誀
        assertEquals(JISX0213String.length("\u8A80"), 1);
        assertFalse(JISX0213String.isValid("\u8A83"));	// 誃
        assertEquals(JISX0213String.length("\u8A83"), 1);
        assertFalse(JISX0213String.isValid("\u8A86"));	// 誆
        assertEquals(JISX0213String.length("\u8A86"), 1);
        assertFalse(JISX0213String.isValid("\u8A8B"));	// 誋
        assertEquals(JISX0213String.length("\u8A8B"), 1);
        assertFalse(JISX0213String.isValid("\u8A8F"));	// 誏
        assertEquals(JISX0213String.length("\u8A8F"), 1);
        assertFalse(JISX0213String.isValid("\u8A92"));	// 誒
        assertEquals(JISX0213String.length("\u8A92"), 1);
        assertFalse(JISX0213String.isValid("\u8A96"));	// 誖
        assertEquals(JISX0213String.length("\u8A96"), 1);
        assertFalse(JISX0213String.isValid("\u8A97"));	// 誗
        assertEquals(JISX0213String.length("\u8A97"), 1);
        assertFalse(JISX0213String.isValid("\u8A99"));	// 誙
        assertEquals(JISX0213String.length("\u8A99"), 1);
        assertFalse(JISX0213String.isValid("\u8A9F"));	// 誟
        assertEquals(JISX0213String.length("\u8A9F"), 1);
        assertFalse(JISX0213String.isValid("\u8AA9"));	// 誩
        assertEquals(JISX0213String.length("\u8AA9"), 1);
        assertFalse(JISX0213String.isValid("\u8AAF"));	// 誯
        assertEquals(JISX0213String.length("\u8AAF"), 1);
        assertFalse(JISX0213String.isValid("\u8AB3"));	// 誳
        assertEquals(JISX0213String.length("\u8AB3"), 1);
        assertFalse(JISX0213String.isValid("\u8AB6"));	// 誶
        assertEquals(JISX0213String.length("\u8AB6"), 1);
        assertFalse(JISX0213String.isValid("\u8ABB"));	// 誻
        assertEquals(JISX0213String.length("\u8ABB"), 1);
        assertFalse(JISX0213String.isValid("\u8AC3"));	// 諃
        assertEquals(JISX0213String.length("\u8AC3"), 1);
        assertFalse(JISX0213String.isValid("\u8AC6"));	// 諆
        assertEquals(JISX0213String.length("\u8AC6"), 1);
        assertFalse(JISX0213String.isValid("\u8AC8"));	// 諈
        assertEquals(JISX0213String.length("\u8AC8"), 1);
        assertFalse(JISX0213String.isValid("\u8AC9"));	// 諉
        assertEquals(JISX0213String.length("\u8AC9"), 1);
        assertFalse(JISX0213String.isValid("\u8ACA"));	// 諊
        assertEquals(JISX0213String.length("\u8ACA"), 1);
        assertFalse(JISX0213String.isValid("\u8AD1"));	// 諑
        assertEquals(JISX0213String.length("\u8AD1"), 1);
        assertFalse(JISX0213String.isValid("\u8AD3"));	// 諓
        assertEquals(JISX0213String.length("\u8AD3"), 1);
        assertFalse(JISX0213String.isValid("\u8AD4"));	// 諔
        assertEquals(JISX0213String.length("\u8AD4"), 1);
        assertFalse(JISX0213String.isValid("\u8AD5"));	// 諕
        assertEquals(JISX0213String.length("\u8AD5"), 1);
        assertFalse(JISX0213String.isValid("\u8ADD"));	// 諝
        assertEquals(JISX0213String.length("\u8ADD"), 1);
        assertFalse(JISX0213String.isValid("\u8AEC"));	// 諬
        assertEquals(JISX0213String.length("\u8AEC"), 1);
        assertFalse(JISX0213String.isValid("\u8AF0"));	// 諰
        assertEquals(JISX0213String.length("\u8AF0"), 1);
        assertFalse(JISX0213String.isValid("\u8AF5"));	// 諵
        assertEquals(JISX0213String.length("\u8AF5"), 1);
        assertFalse(JISX0213String.isValid("\u8AFF"));	// 諿
        assertEquals(JISX0213String.length("\u8AFF"), 1);
        assertFalse(JISX0213String.isValid("\u8B06"));	// 謆
        assertEquals(JISX0213String.length("\u8B06"), 1);
        assertFalse(JISX0213String.isValid("\u8B0B"));	// 謋
        assertEquals(JISX0213String.length("\u8B0B"), 1);
        assertFalse(JISX0213String.isValid("\u8B11"));	// 謑
        assertEquals(JISX0213String.length("\u8B11"), 1);
        assertFalse(JISX0213String.isValid("\u8B1E"));	// 謞
        assertEquals(JISX0213String.length("\u8B1E"), 1);
        assertFalse(JISX0213String.isValid("\u8B30"));	// 謰
        assertEquals(JISX0213String.length("\u8B30"), 1);
        assertFalse(JISX0213String.isValid("\u8B37"));	// 謷
        assertEquals(JISX0213String.length("\u8B37"), 1);
        assertFalse(JISX0213String.isValid("\u8B3C"));	// 謼
        assertEquals(JISX0213String.length("\u8B3C"), 1);
        assertFalse(JISX0213String.isValid("\u8B42"));	// 譂
        assertEquals(JISX0213String.length("\u8B42"), 1);
        assertFalse(JISX0213String.isValid("\u8B44"));	// 譄
        assertEquals(JISX0213String.length("\u8B44"), 1);
        assertFalse(JISX0213String.isValid("\u8B45"));	// 譅
        assertEquals(JISX0213String.length("\u8B45"), 1);
        assertFalse(JISX0213String.isValid("\u8B48"));	// 譈
        assertEquals(JISX0213String.length("\u8B48"), 1);
        assertFalse(JISX0213String.isValid("\u8B52"));	// 譒
        assertEquals(JISX0213String.length("\u8B52"), 1);
        assertFalse(JISX0213String.isValid("\u8B4D"));	// 譍
        assertEquals(JISX0213String.length("\u8B4D"), 1);
        assertFalse(JISX0213String.isValid("\u8B63"));	// 譣
        assertEquals(JISX0213String.length("\u8B63"), 1);
        assertFalse(JISX0213String.isValid("\u8B6D"));	// 譭
        assertEquals(JISX0213String.length("\u8B6D"), 1);
        assertFalse(JISX0213String.isValid("\u8B78"));	// 譸
        assertEquals(JISX0213String.length("\u8B78"), 1);
        assertFalse(JISX0213String.isValid("\u8B79"));	// 譹
        assertEquals(JISX0213String.length("\u8B79"), 1);
        assertFalse(JISX0213String.isValid("\u8B7C"));	// 譼
        assertEquals(JISX0213String.length("\u8B7C"), 1);
        assertFalse(JISX0213String.isValid("\u8B7E"));	// 譾
        assertEquals(JISX0213String.length("\u8B7E"), 1);
        assertFalse(JISX0213String.isValid("\u8B84"));	// 讄
        assertEquals(JISX0213String.length("\u8B84"), 1);
        assertFalse(JISX0213String.isValid("\u8B85"));	// 讅
        assertEquals(JISX0213String.length("\u8B85"), 1);
        assertFalse(JISX0213String.isValid("\u8B8D"));	// 讍
        assertEquals(JISX0213String.length("\u8B8D"), 1);
        assertFalse(JISX0213String.isValid("\u8B8F"));	// 讏
        assertEquals(JISX0213String.length("\u8B8F"), 1);
        assertFalse(JISX0213String.isValid("\u8B9F"));	// 讟
        assertEquals(JISX0213String.length("\u8B9F"), 1);
        assertFalse(JISX0213String.isValid("\u8C38"));	// 谸
        assertEquals(JISX0213String.length("\u8C38"), 1);
        assertFalse(JISX0213String.isValid("\u8C3E"));	// 谾
        assertEquals(JISX0213String.length("\u8C3E"), 1);
        assertFalse(JISX0213String.isValid("\u8C4B"));	// 豋
        assertEquals(JISX0213String.length("\u8C4B"), 1);
        assertFalse(JISX0213String.isValid("\u8C51"));	// 豑
        assertEquals(JISX0213String.length("\u8C51"), 1);
        assertFalse(JISX0213String.isValid("\u8C53"));	// 豓
        assertEquals(JISX0213String.length("\u8C53"), 1);
        assertFalse(JISX0213String.isValid("\u8C58"));	// 豘
        assertEquals(JISX0213String.length("\u8C58"), 1);
        assertFalse(JISX0213String.isValid("\u8C5B"));	// 豛
        assertEquals(JISX0213String.length("\u8C5B"), 1);
        assertFalse(JISX0213String.isValid("\u8C5D"));	// 豝
        assertEquals(JISX0213String.length("\u8C5D"), 1);
        assertFalse(JISX0213String.isValid("\u8C59"));	// 豙
        assertEquals(JISX0213String.length("\u8C59"), 1);
        assertFalse(JISX0213String.isValid("\u8C63"));	// 豣
        assertEquals(JISX0213String.length("\u8C63"), 1);
        assertFalse(JISX0213String.isValid("\u8C64"));	// 豤
        assertEquals(JISX0213String.length("\u8C64"), 1);
        assertFalse(JISX0213String.isValid("\u8C66"));	// 豦
        assertEquals(JISX0213String.length("\u8C66"), 1);
        assertFalse(JISX0213String.isValid("\u8C75"));	// 豵
        assertEquals(JISX0213String.length("\u8C75"), 1);
        assertFalse(JISX0213String.isValid("\u8C76"));	// 豶
        assertEquals(JISX0213String.length("\u8C76"), 1);
        assertFalse(JISX0213String.isValid("\u8C7B"));	// 豻
        assertEquals(JISX0213String.length("\u8C7B"), 1);
        assertFalse(JISX0213String.isValid("\u8C7E"));	// 豾
        assertEquals(JISX0213String.length("\u8C7E"), 1);
        assertFalse(JISX0213String.isValid("\u8C86"));	// 貆
        assertEquals(JISX0213String.length("\u8C86"), 1);
        assertFalse(JISX0213String.isValid("\u8C87"));	// 貇
        assertEquals(JISX0213String.length("\u8C87"), 1);
        assertFalse(JISX0213String.isValid("\u8C8B"));	// 貋
        assertEquals(JISX0213String.length("\u8C8B"), 1);
        assertFalse(JISX0213String.isValid("\u8C90"));	// 貐
        assertEquals(JISX0213String.length("\u8C90"), 1);
        assertFalse(JISX0213String.isValid("\u8C9C"));	// 貜
        assertEquals(JISX0213String.length("\u8C9C"), 1);
        assertFalse(JISX0213String.isValid("\u8CB9"));	// 貹
        assertEquals(JISX0213String.length("\u8CB9"), 1);
        assertFalse(JISX0213String.isValid("\u8CBA"));	// 貺
        assertEquals(JISX0213String.length("\u8CBA"), 1);
        assertFalse(JISX0213String.isValid("\u8CC5"));	// 賅
        assertEquals(JISX0213String.length("\u8CC5"), 1);
        assertFalse(JISX0213String.isValid("\u8CC6"));	// 賆
        assertEquals(JISX0213String.length("\u8CC6"), 1);
        assertFalse(JISX0213String.isValid("\u8CC9"));	// 賉
        assertEquals(JISX0213String.length("\u8CC9"), 1);
        assertFalse(JISX0213String.isValid("\u8CCB"));	// 賋
        assertEquals(JISX0213String.length("\u8CCB"), 1);
        assertFalse(JISX0213String.isValid("\u8CCF"));	// 賏
        assertEquals(JISX0213String.length("\u8CCF"), 1);
        assertFalse(JISX0213String.isValid("\u8CDD"));	// 賝
        assertEquals(JISX0213String.length("\u8CDD"), 1);
        assertFalse(JISX0213String.isValid("\u8CE8"));	// 賨
        assertEquals(JISX0213String.length("\u8CE8"), 1);
        assertFalse(JISX0213String.isValid("\u8CEC"));	// 賬
        assertEquals(JISX0213String.length("\u8CEC"), 1);
        assertFalse(JISX0213String.isValid("\u8CEF"));	// 賯
        assertEquals(JISX0213String.length("\u8CEF"), 1);
        assertFalse(JISX0213String.isValid("\u8CF2"));	// 賲
        assertEquals(JISX0213String.length("\u8CF2"), 1);
        assertFalse(JISX0213String.isValid("\u8CF5"));	// 賵
        assertEquals(JISX0213String.length("\u8CF5"), 1);
        assertFalse(JISX0213String.isValid("\u8CF7"));	// 賷
        assertEquals(JISX0213String.length("\u8CF7"), 1);
        assertFalse(JISX0213String.isValid("\u8CFF"));	// 賿
        assertEquals(JISX0213String.length("\u8CFF"), 1);
        assertFalse(JISX0213String.isValid("\u8D01"));	// 贁
        assertEquals(JISX0213String.length("\u8D01"), 1);
        assertFalse(JISX0213String.isValid("\u8D03"));	// 贃
        assertEquals(JISX0213String.length("\u8D03"), 1);
        assertFalse(JISX0213String.isValid("\u8D17"));	// 贗
        assertEquals(JISX0213String.length("\u8D17"), 1);
        assertFalse(JISX0213String.isValid("\u8D65"));	// 赥
        assertEquals(JISX0213String.length("\u8D65"), 1);
        assertFalse(JISX0213String.isValid("\u8D69"));	// 赩
        assertEquals(JISX0213String.length("\u8D69"), 1);
        assertFalse(JISX0213String.isValid("\u8D6E"));	// 赮
        assertEquals(JISX0213String.length("\u8D6E"), 1);
        assertFalse(JISX0213String.isValid("\u8D7F"));	// 赿
        assertEquals(JISX0213String.length("\u8D7F"), 1);
        assertFalse(JISX0213String.isValid("\u8D82"));	// 趂
        assertEquals(JISX0213String.length("\u8D82"), 1);
        assertFalse(JISX0213String.isValid("\u8D88"));	// 趈
        assertEquals(JISX0213String.length("\u8D88"), 1);
        assertFalse(JISX0213String.isValid("\u8D8D"));	// 趍
        assertEquals(JISX0213String.length("\u8D8D"), 1);
        assertFalse(JISX0213String.isValid("\u8D90"));	// 趐
        assertEquals(JISX0213String.length("\u8D90"), 1);
        assertFalse(JISX0213String.isValid("\u8D91"));	// 趑
        assertEquals(JISX0213String.length("\u8D91"), 1);
        assertFalse(JISX0213String.isValid("\u8D9E"));	// 趞
        assertEquals(JISX0213String.length("\u8D9E"), 1);
        assertFalse(JISX0213String.isValid("\u8D9F"));	// 趟
        assertEquals(JISX0213String.length("\u8D9F"), 1);
        assertFalse(JISX0213String.isValid("\u8DA0"));	// 趠
        assertEquals(JISX0213String.length("\u8DA0"), 1);
        assertFalse(JISX0213String.isValid("\u8DAB"));	// 趫
        assertEquals(JISX0213String.length("\u8DAB"), 1);
        assertFalse(JISX0213String.isValid("\u8DAC"));	// 趬
        assertEquals(JISX0213String.length("\u8DAC"), 1);
        assertFalse(JISX0213String.isValid("\u8DB2"));	// 趲
        assertEquals(JISX0213String.length("\u8DB2"), 1);
        assertFalse(JISX0213String.isValid("\u8DB5"));	// 趵
        assertEquals(JISX0213String.length("\u8DB5"), 1);
        assertFalse(JISX0213String.isValid("\u8DB7"));	// 趷
        assertEquals(JISX0213String.length("\u8DB7"), 1);
        assertFalse(JISX0213String.isValid("\u8DB9"));	// 趹
        assertEquals(JISX0213String.length("\u8DB9"), 1);
        assertFalse(JISX0213String.isValid("\u8DBB"));	// 趻
        assertEquals(JISX0213String.length("\u8DBB"), 1);
        assertFalse(JISX0213String.isValid("\u8DC0"));	// 跀
        assertEquals(JISX0213String.length("\u8DC0"), 1);
        assertFalse(JISX0213String.isValid("\u8DC5"));	// 跅
        assertEquals(JISX0213String.length("\u8DC5"), 1);
        assertFalse(JISX0213String.isValid("\u8DC7"));	// 跇
        assertEquals(JISX0213String.length("\u8DC7"), 1);
        assertFalse(JISX0213String.isValid("\u8DCA"));	// 跊
        assertEquals(JISX0213String.length("\u8DCA"), 1);
        assertFalse(JISX0213String.isValid("\u8DD4"));	// 跔
        assertEquals(JISX0213String.length("\u8DD4"), 1);
        assertFalse(JISX0213String.isValid("\u8DD5"));	// 跕
        assertEquals(JISX0213String.length("\u8DD5"), 1);
        assertFalse(JISX0213String.isValid("\u8DE4"));	// 跤
        assertEquals(JISX0213String.length("\u8DE4"), 1);
        assertFalse(JISX0213String.isValid("\u8DE5"));	// 跥
        assertEquals(JISX0213String.length("\u8DE5"), 1);
        assertFalse(JISX0213String.isValid("\u8DE7"));	// 跧
        assertEquals(JISX0213String.length("\u8DE7"), 1);
        assertFalse(JISX0213String.isValid("\u8DF0"));	// 跰
        assertEquals(JISX0213String.length("\u8DF0"), 1);
        assertFalse(JISX0213String.isValid("\u8DBC"));	// 趼
        assertEquals(JISX0213String.length("\u8DBC"), 1);
        assertFalse(JISX0213String.isValid("\u8DF1"));	// 跱
        assertEquals(JISX0213String.length("\u8DF1"), 1);
        assertFalse(JISX0213String.isValid("\u8DF2"));	// 跲
        assertEquals(JISX0213String.length("\u8DF2"), 1);
        assertFalse(JISX0213String.isValid("\u8DF4"));	// 跴
        assertEquals(JISX0213String.length("\u8DF4"), 1);
        assertFalse(JISX0213String.isValid("\u8E01"));	// 踁
        assertEquals(JISX0213String.length("\u8E01"), 1);
        assertFalse(JISX0213String.isValid("\u8E04"));	// 踄
        assertEquals(JISX0213String.length("\u8E04"), 1);
        assertFalse(JISX0213String.isValid("\u8E05"));	// 踅
        assertEquals(JISX0213String.length("\u8E05"), 1);
        assertFalse(JISX0213String.isValid("\u8E0B"));	// 踋
        assertEquals(JISX0213String.length("\u8E0B"), 1);
        assertFalse(JISX0213String.isValid("\u8E11"));	// 踑
        assertEquals(JISX0213String.length("\u8E11"), 1);
        assertFalse(JISX0213String.isValid("\u8E26"));	// 踦
        assertEquals(JISX0213String.length("\u8E26"), 1);
        assertFalse(JISX0213String.isValid("\u8E31"));	// 踱
        assertEquals(JISX0213String.length("\u8E31"), 1);
        assertFalse(JISX0213String.isValid("\u8E33"));	// 踳
        assertEquals(JISX0213String.length("\u8E33"), 1);
        assertFalse(JISX0213String.isValid("\u8E37"));	// 踷
        assertEquals(JISX0213String.length("\u8E37"), 1);
        assertFalse(JISX0213String.isValid("\u8E38"));	// 踸
        assertEquals(JISX0213String.length("\u8E38"), 1);
        assertFalse(JISX0213String.isValid("\u8E40"));	// 蹀
        assertEquals(JISX0213String.length("\u8E40"), 1);
        assertFalse(JISX0213String.isValid("\u8E41"));	// 蹁
        assertEquals(JISX0213String.length("\u8E41"), 1);
        assertFalse(JISX0213String.isValid("\u8E4D"));	// 蹍
        assertEquals(JISX0213String.length("\u8E4D"), 1);
        assertFalse(JISX0213String.isValid("\u8E4E"));	// 蹎
        assertEquals(JISX0213String.length("\u8E4E"), 1);
        assertFalse(JISX0213String.isValid("\u8E4F"));	// 蹏
        assertEquals(JISX0213String.length("\u8E4F"), 1);
        assertFalse(JISX0213String.isValid("\u8E5B"));	// 蹛
        assertEquals(JISX0213String.length("\u8E5B"), 1);
        assertFalse(JISX0213String.isValid("\u8E5C"));	// 蹜
        assertEquals(JISX0213String.length("\u8E5C"), 1);
        assertFalse(JISX0213String.isValid("\u8E5D"));	// 蹝
        assertEquals(JISX0213String.length("\u8E5D"), 1);
        assertFalse(JISX0213String.isValid("\u8E5E"));	// 蹞
        assertEquals(JISX0213String.length("\u8E5E"), 1);
        assertFalse(JISX0213String.isValid("\u8E61"));	// 蹡
        assertEquals(JISX0213String.length("\u8E61"), 1);
        assertFalse(JISX0213String.isValid("\u8E69"));	// 蹩
        assertEquals(JISX0213String.length("\u8E69"), 1);
        assertFalse(JISX0213String.isValid("\u8E71"));	// 蹱
        assertEquals(JISX0213String.length("\u8E71"), 1);
        assertFalse(JISX0213String.isValid("\u8E79"));	// 蹹
        assertEquals(JISX0213String.length("\u8E79"), 1);
        assertFalse(JISX0213String.isValid("\u8E7A"));	// 蹺
        assertEquals(JISX0213String.length("\u8E7A"), 1);
        assertFalse(JISX0213String.isValid("\u8E82"));	// 躂
        assertEquals(JISX0213String.length("\u8E82"), 1);
        assertFalse(JISX0213String.isValid("\u8E83"));	// 躃
        assertEquals(JISX0213String.length("\u8E83"), 1);
        assertFalse(JISX0213String.isValid("\u8E89"));	// 躉
        assertEquals(JISX0213String.length("\u8E89"), 1);
        assertFalse(JISX0213String.isValid("\u8E90"));	// 躐
        assertEquals(JISX0213String.length("\u8E90"), 1);
        assertFalse(JISX0213String.isValid("\u8E92"));	// 躒
        assertEquals(JISX0213String.length("\u8E92"), 1);
        assertFalse(JISX0213String.isValid("\u8E95"));	// 躕
        assertEquals(JISX0213String.length("\u8E95"), 1);
        assertFalse(JISX0213String.isValid("\u8E9A"));	// 躚
        assertEquals(JISX0213String.length("\u8E9A"), 1);
        assertFalse(JISX0213String.isValid("\u8E9B"));	// 躛
        assertEquals(JISX0213String.length("\u8E9B"), 1);
        assertFalse(JISX0213String.isValid("\u8E9D"));	// 躝
        assertEquals(JISX0213String.length("\u8E9D"), 1);
        assertFalse(JISX0213String.isValid("\u8EA2"));	// 躢
        assertEquals(JISX0213String.length("\u8EA2"), 1);
        assertFalse(JISX0213String.isValid("\u8EA7"));	// 躧
        assertEquals(JISX0213String.length("\u8EA7"), 1);
        assertFalse(JISX0213String.isValid("\u8EA9"));	// 躩
        assertEquals(JISX0213String.length("\u8EA9"), 1);
        assertFalse(JISX0213String.isValid("\u8EAD"));	// 躭
        assertEquals(JISX0213String.length("\u8EAD"), 1);
        assertFalse(JISX0213String.isValid("\u8EBA"));	// 躺
        assertEquals(JISX0213String.length("\u8EBA"), 1);
        assertFalse(JISX0213String.isValid("\u8EC1"));	// 軁
        assertEquals(JISX0213String.length("\u8EC1"), 1);
        assertFalse(JISX0213String.isValid("\u8EC3"));	// 軃
        assertEquals(JISX0213String.length("\u8EC3"), 1);
        assertFalse(JISX0213String.isValid("\u8EC4"));	// 軄
        assertEquals(JISX0213String.length("\u8EC4"), 1);
        assertFalse(JISX0213String.isValid("\u8EC7"));	// 軇
        assertEquals(JISX0213String.length("\u8EC7"), 1);
        assertFalse(JISX0213String.isValid("\u8EDC"));	// 軜
        assertEquals(JISX0213String.length("\u8EDC"), 1);
        assertFalse(JISX0213String.isValid("\u8EE8"));	// 軨
        assertEquals(JISX0213String.length("\u8EE8"), 1);
        assertFalse(JISX0213String.isValid("\u8EEE"));	// 軮
        assertEquals(JISX0213String.length("\u8EEE"), 1);
        assertFalse(JISX0213String.isValid("\u8EF0"));	// 軰
        assertEquals(JISX0213String.length("\u8EF0"), 1);
        assertFalse(JISX0213String.isValid("\u8EF1"));	// 軱
        assertEquals(JISX0213String.length("\u8EF1"), 1);
        assertFalse(JISX0213String.isValid("\u8EF7"));	// 軷
        assertEquals(JISX0213String.length("\u8EF7"), 1);
        assertFalse(JISX0213String.isValid("\u8EED"));	// 軭
        assertEquals(JISX0213String.length("\u8EED"), 1);
        assertFalse(JISX0213String.isValid("\u8F02"));	// 輂
        assertEquals(JISX0213String.length("\u8F02"), 1);
        assertFalse(JISX0213String.isValid("\u8F07"));	// 輇
        assertEquals(JISX0213String.length("\u8F07"), 1);
        assertFalse(JISX0213String.isValid("\u8F0F"));	// 輏
        assertEquals(JISX0213String.length("\u8F0F"), 1);
        assertFalse(JISX0213String.isValid("\u8F10"));	// 輐
        assertEquals(JISX0213String.length("\u8F10"), 1);
        assertFalse(JISX0213String.isValid("\u8F16"));	// 輖
        assertEquals(JISX0213String.length("\u8F16"), 1);
        assertFalse(JISX0213String.isValid("\u8F18"));	// 輘
        assertEquals(JISX0213String.length("\u8F18"), 1);
        assertFalse(JISX0213String.isValid("\u8F20"));	// 輠
        assertEquals(JISX0213String.length("\u8F20"), 1);
        assertFalse(JISX0213String.isValid("\u8F21"));	// 輡
        assertEquals(JISX0213String.length("\u8F21"), 1);
        assertFalse(JISX0213String.isValid("\u8F23"));	// 輣
        assertEquals(JISX0213String.length("\u8F23"), 1);
        assertFalse(JISX0213String.isValid("\u8F25"));	// 輥
        assertEquals(JISX0213String.length("\u8F25"), 1);
        assertFalse(JISX0213String.isValid("\u8F27"));	// 輧
        assertEquals(JISX0213String.length("\u8F27"), 1);
        assertFalse(JISX0213String.isValid("\u8F28"));	// 輨
        assertEquals(JISX0213String.length("\u8F28"), 1);
        assertFalse(JISX0213String.isValid("\u8F2C"));	// 輬
        assertEquals(JISX0213String.length("\u8F2C"), 1);
        assertFalse(JISX0213String.isValid("\u8F2E"));	// 輮
        assertEquals(JISX0213String.length("\u8F2E"), 1);
        assertFalse(JISX0213String.isValid("\u8F34"));	// 輴
        assertEquals(JISX0213String.length("\u8F34"), 1);
        assertFalse(JISX0213String.isValid("\u8F35"));	// 輵
        assertEquals(JISX0213String.length("\u8F35"), 1);
        assertFalse(JISX0213String.isValid("\u8F37"));	// 輷
        assertEquals(JISX0213String.length("\u8F37"), 1);
        assertFalse(JISX0213String.isValid("\u8F3A"));	// 輺
        assertEquals(JISX0213String.length("\u8F3A"), 1);
        assertFalse(JISX0213String.isValid("\u8F41"));	// 轁
        assertEquals(JISX0213String.length("\u8F41"), 1);
        assertFalse(JISX0213String.isValid("\u8F43"));	// 轃
        assertEquals(JISX0213String.length("\u8F43"), 1);
        assertFalse(JISX0213String.isValid("\u8F47"));	// 轇
        assertEquals(JISX0213String.length("\u8F47"), 1);
        assertFalse(JISX0213String.isValid("\u8F4F"));	// 轏
        assertEquals(JISX0213String.length("\u8F4F"), 1);
        assertFalse(JISX0213String.isValid("\u8F51"));	// 轑
        assertEquals(JISX0213String.length("\u8F51"), 1);
        assertFalse(JISX0213String.isValid("\u8F52"));	// 轒
        assertEquals(JISX0213String.length("\u8F52"), 1);
        assertFalse(JISX0213String.isValid("\u8F53"));	// 轓
        assertEquals(JISX0213String.length("\u8F53"), 1);
        assertFalse(JISX0213String.isValid("\u8F55"));	// 轕
        assertEquals(JISX0213String.length("\u8F55"), 1);
        assertFalse(JISX0213String.isValid("\u8F5D"));	// 轝
        assertEquals(JISX0213String.length("\u8F5D"), 1);
        assertFalse(JISX0213String.isValid("\u8F5E"));	// 轞
        assertEquals(JISX0213String.length("\u8F5E"), 1);
        assertFalse(JISX0213String.isValid("\u8F65"));	// 轥
        assertEquals(JISX0213String.length("\u8F65"), 1);
        assertFalse(JISX0213String.isValid("\u8F9D"));	// 辝
        assertEquals(JISX0213String.length("\u8F9D"), 1);
        assertFalse(JISX0213String.isValid("\u8FA0"));	// 辠
        assertEquals(JISX0213String.length("\u8FA0"), 1);
        assertFalse(JISX0213String.isValid("\u8FA1"));	// 辡
        assertEquals(JISX0213String.length("\u8FA1"), 1);
        assertFalse(JISX0213String.isValid("\u8FA5"));	// 辥
        assertEquals(JISX0213String.length("\u8FA5"), 1);
        assertFalse(JISX0213String.isValid("\u8FB8"));	// 辸
        assertEquals(JISX0213String.length("\u8FB8"), 1);
        assertFalse(JISX0213String.isValid("\u8FBE"));	// 达
        assertEquals(JISX0213String.length("\u8FBE"), 1);
        assertFalse(JISX0213String.isValid("\u8FC0"));	// 迀
        assertEquals(JISX0213String.length("\u8FC0"), 1);
        assertFalse(JISX0213String.isValid("\u8FCB"));	// 迋
        assertEquals(JISX0213String.length("\u8FCB"), 1);
        assertFalse(JISX0213String.isValid("\u8FD0"));	// 运
        assertEquals(JISX0213String.length("\u8FD0"), 1);
        assertFalse(JISX0213String.isValid("\u8FD2"));	// 迒
        assertEquals(JISX0213String.length("\u8FD2"), 1);
        assertFalse(JISX0213String.isValid("\u8FE3"));	// 迣
        assertEquals(JISX0213String.length("\u8FE3"), 1);
        assertFalse(JISX0213String.isValid("\u8FF6"));	// 迶
        assertEquals(JISX0213String.length("\u8FF6"), 1);
        assertFalse(JISX0213String.isValid("\u8FFE"));	// 迾
        assertEquals(JISX0213String.length("\u8FFE"), 1);
        assertFalse(JISX0213String.isValid("\u9004"));	// 逄
        assertEquals(JISX0213String.length("\u9004"), 1);
        assertFalse(JISX0213String.isValid("\u9018"));	// 逘
        assertEquals(JISX0213String.length("\u9018"), 1);
        assertFalse(JISX0213String.isValid("\u901B"));	// 逛
        assertEquals(JISX0213String.length("\u901B"), 1);
        assertFalse(JISX0213String.isValid("\u9028"));	// 逨
        assertEquals(JISX0213String.length("\u9028"), 1);
        assertFalse(JISX0213String.isValid("\u9029"));	// 逩
        assertEquals(JISX0213String.length("\u9029"), 1);
        assertFalse(JISX0213String.isValid("\u902F"));	// 逯
        assertEquals(JISX0213String.length("\u902F"), 1);
        assertFalse(JISX0213String.isValid("\u902A"));	// 逪
        assertEquals(JISX0213String.length("\u902A"), 1);
        assertFalse(JISX0213String.isValid("\u902C"));	// 逬
        assertEquals(JISX0213String.length("\u902C"), 1);
        assertFalse(JISX0213String.isValid("\u9033"));	// 逳
        assertEquals(JISX0213String.length("\u9033"), 1);
        assertFalse(JISX0213String.isValid("\u9034"));	// 逴
        assertEquals(JISX0213String.length("\u9034"), 1);
        assertFalse(JISX0213String.isValid("\u903F"));	// 逿
        assertEquals(JISX0213String.length("\u903F"), 1);
        assertFalse(JISX0213String.isValid("\u904C"));	// 遌
        assertEquals(JISX0213String.length("\u904C"), 1);
        assertFalse(JISX0213String.isValid("\u905B"));	// 遛
        assertEquals(JISX0213String.length("\u905B"), 1);
        assertFalse(JISX0213String.isValid("\u9062"));	// 遢
        assertEquals(JISX0213String.length("\u9062"), 1);
        assertFalse(JISX0213String.isValid("\u9066"));	// 遦
        assertEquals(JISX0213String.length("\u9066"), 1);
        assertFalse(JISX0213String.isValid("\u906C"));	// 遬
        assertEquals(JISX0213String.length("\u906C"), 1);
        assertFalse(JISX0213String.isValid("\u9070"));	// 遰
        assertEquals(JISX0213String.length("\u9070"), 1);
        assertFalse(JISX0213String.isValid("\u9074"));	// 遴
        assertEquals(JISX0213String.length("\u9074"), 1);
        assertFalse(JISX0213String.isValid("\u9079"));	// 遹
        assertEquals(JISX0213String.length("\u9079"), 1);
        assertFalse(JISX0213String.isValid("\u908B"));	// 邋
        assertEquals(JISX0213String.length("\u908B"), 1);
        assertFalse(JISX0213String.isValid("\u908E"));	// 邎
        assertEquals(JISX0213String.length("\u908E"), 1);
        assertFalse(JISX0213String.isValid("\u9098"));	// 邘
        assertEquals(JISX0213String.length("\u9098"), 1);
        assertFalse(JISX0213String.isValid("\u90A0"));	// 邠
        assertEquals(JISX0213String.length("\u90A0"), 1);
        assertFalse(JISX0213String.isValid("\u90A5"));	// 邥
        assertEquals(JISX0213String.length("\u90A5"), 1);
        assertFalse(JISX0213String.isValid("\u90B2"));	// 邲
        assertEquals(JISX0213String.length("\u90B2"), 1);
        assertFalse(JISX0213String.isValid("\u90B4"));	// 邴
        assertEquals(JISX0213String.length("\u90B4"), 1);
        assertFalse(JISX0213String.isValid("\u90BD"));	// 邽
        assertEquals(JISX0213String.length("\u90BD"), 1);
        assertFalse(JISX0213String.isValid("\u90CC"));	// 郌
        assertEquals(JISX0213String.length("\u90CC"), 1);
        assertFalse(JISX0213String.isValid("\u90D5"));	// 郕
        assertEquals(JISX0213String.length("\u90D5"), 1);
        assertFalse(JISX0213String.isValid("\u90D8"));	// 郘
        assertEquals(JISX0213String.length("\u90D8"), 1);
        assertFalse(JISX0213String.isValid("\u90D9"));	// 郙
        assertEquals(JISX0213String.length("\u90D9"), 1);
        assertFalse(JISX0213String.isValid("\u90E5"));	// 郥
        assertEquals(JISX0213String.length("\u90E5"), 1);
        assertFalse(JISX0213String.isValid("\u90D2"));	// 郒
        assertEquals(JISX0213String.length("\u90D2"), 1);
        assertFalse(JISX0213String.isValid("\u90F0"));	// 郰
        assertEquals(JISX0213String.length("\u90F0"), 1);
        assertFalse(JISX0213String.isValid("\u9105"));	// 鄅
        assertEquals(JISX0213String.length("\u9105"), 1);
        assertFalse(JISX0213String.isValid("\u9108"));	// 鄈
        assertEquals(JISX0213String.length("\u9108"), 1);
        assertFalse(JISX0213String.isValid("\u910D"));	// 鄍
        assertEquals(JISX0213String.length("\u910D"), 1);
        assertFalse(JISX0213String.isValid("\u9110"));	// 鄐
        assertEquals(JISX0213String.length("\u9110"), 1);
        assertFalse(JISX0213String.isValid("\u9117"));	// 鄗
        assertEquals(JISX0213String.length("\u9117"), 1);
        assertFalse(JISX0213String.isValid("\u911A"));	// 鄚
        assertEquals(JISX0213String.length("\u911A"), 1);
        assertFalse(JISX0213String.isValid("\u9120"));	// 鄠
        assertEquals(JISX0213String.length("\u9120"), 1);
        assertFalse(JISX0213String.isValid("\u9125"));	// 鄥
        assertEquals(JISX0213String.length("\u9125"), 1);
        assertFalse(JISX0213String.isValid("\u9129"));	// 鄩
        assertEquals(JISX0213String.length("\u9129"), 1);
        assertFalse(JISX0213String.isValid("\u912E"));	// 鄮
        assertEquals(JISX0213String.length("\u912E"), 1);
        assertFalse(JISX0213String.isValid("\u9136"));	// 鄶
        assertEquals(JISX0213String.length("\u9136"), 1);
        assertFalse(JISX0213String.isValid("\u913C"));	// 鄼
        assertEquals(JISX0213String.length("\u913C"), 1);
        assertFalse(JISX0213String.isValid("\u9143"));	// 酃
        assertEquals(JISX0213String.length("\u9143"), 1);
        assertFalse(JISX0213String.isValid("\u914F"));	// 酏
        assertEquals(JISX0213String.length("\u914F"), 1);
        assertFalse(JISX0213String.isValid("\u9153"));	// 酓
        assertEquals(JISX0213String.length("\u9153"), 1);
        assertFalse(JISX0213String.isValid("\u915A"));	// 酚
        assertEquals(JISX0213String.length("\u915A"), 1);
        assertFalse(JISX0213String.isValid("\u9167"));	// 酧
        assertEquals(JISX0213String.length("\u9167"), 1);
        assertFalse(JISX0213String.isValid("\u916D"));	// 酭
        assertEquals(JISX0213String.length("\u916D"), 1);
        assertFalse(JISX0213String.isValid("\u917A"));	// 酺
        assertEquals(JISX0213String.length("\u917A"), 1);
        assertFalse(JISX0213String.isValid("\u917B"));	// 酻
        assertEquals(JISX0213String.length("\u917B"), 1);
        assertFalse(JISX0213String.isValid("\u9181"));	// 醁
        assertEquals(JISX0213String.length("\u9181"), 1);
        assertFalse(JISX0213String.isValid("\u9186"));	// 醆
        assertEquals(JISX0213String.length("\u9186"), 1);
        assertFalse(JISX0213String.isValid("\u918A"));	// 醊
        assertEquals(JISX0213String.length("\u918A"), 1);
        assertFalse(JISX0213String.isValid("\u9191"));	// 醑
        assertEquals(JISX0213String.length("\u9191"), 1);
        assertFalse(JISX0213String.isValid("\u9193"));	// 醓
        assertEquals(JISX0213String.length("\u9193"), 1);
        assertFalse(JISX0213String.isValid("\u9194"));	// 醔
        assertEquals(JISX0213String.length("\u9194"), 1);
        assertFalse(JISX0213String.isValid("\u9195"));	// 醕
        assertEquals(JISX0213String.length("\u9195"), 1);
        assertFalse(JISX0213String.isValid("\u9198"));	// 醘
        assertEquals(JISX0213String.length("\u9198"), 1);
        assertFalse(JISX0213String.isValid("\u91A1"));	// 醡
        assertEquals(JISX0213String.length("\u91A1"), 1);
        assertFalse(JISX0213String.isValid("\u91A6"));	// 醦
        assertEquals(JISX0213String.length("\u91A6"), 1);
        assertFalse(JISX0213String.isValid("\u91AD"));	// 醭
        assertEquals(JISX0213String.length("\u91AD"), 1);
        assertFalse(JISX0213String.isValid("\u91B0"));	// 醰
        assertEquals(JISX0213String.length("\u91B0"), 1);
        assertFalse(JISX0213String.isValid("\u91B2"));	// 醲
        assertEquals(JISX0213String.length("\u91B2"), 1);
        assertFalse(JISX0213String.isValid("\u91BB"));	// 醻
        assertEquals(JISX0213String.length("\u91BB"), 1);
        assertFalse(JISX0213String.isValid("\u91BD"));	// 醽
        assertEquals(JISX0213String.length("\u91BD"), 1);
        assertFalse(JISX0213String.isValid("\u91BF"));	// 醿
        assertEquals(JISX0213String.length("\u91BF"), 1);
        assertFalse(JISX0213String.isValid("\u91C2"));	// 釂
        assertEquals(JISX0213String.length("\u91C2"), 1);
        assertFalse(JISX0213String.isValid("\u91C5"));	// 釅
        assertEquals(JISX0213String.length("\u91C5"), 1);
        assertFalse(JISX0213String.isValid("\u91D3"));	// 釓
        assertEquals(JISX0213String.length("\u91D3"), 1);
        assertFalse(JISX0213String.isValid("\u91D4"));	// 釔
        assertEquals(JISX0213String.length("\u91D4"), 1);
        assertFalse(JISX0213String.isValid("\u91D9"));	// 釙
        assertEquals(JISX0213String.length("\u91D9"), 1);
        assertFalse(JISX0213String.isValid("\u91E9"));	// 釩
        assertEquals(JISX0213String.length("\u91E9"), 1);
        assertFalse(JISX0213String.isValid("\u91EA"));	// 釪
        assertEquals(JISX0213String.length("\u91EA"), 1);
        assertFalse(JISX0213String.isValid("\u91EF"));	// 釯
        assertEquals(JISX0213String.length("\u91EF"), 1);
        assertFalse(JISX0213String.isValid("\u91F0"));	// 釰
        assertEquals(JISX0213String.length("\u91F0"), 1);
        assertFalse(JISX0213String.isValid("\u91F7"));	// 釷
        assertEquals(JISX0213String.length("\u91F7"), 1);
        assertFalse(JISX0213String.isValid("\u91F9"));	// 釹
        assertEquals(JISX0213String.length("\u91F9"), 1);
        assertFalse(JISX0213String.isValid("\u91FD"));	// 釽
        assertEquals(JISX0213String.length("\u91FD"), 1);
        assertFalse(JISX0213String.isValid("\u9200"));	// 鈀
        assertEquals(JISX0213String.length("\u9200"), 1);
        assertFalse(JISX0213String.isValid("\u9204"));	// 鈄
        assertEquals(JISX0213String.length("\u9204"), 1);
        assertFalse(JISX0213String.isValid("\u9205"));	// 鈅
        assertEquals(JISX0213String.length("\u9205"), 1);
        assertFalse(JISX0213String.isValid("\u9209"));	// 鈉
        assertEquals(JISX0213String.length("\u9209"), 1);
        assertFalse(JISX0213String.isValid("\u920C"));	// 鈌
        assertEquals(JISX0213String.length("\u920C"), 1);
        assertFalse(JISX0213String.isValid("\u9212"));	// 鈒
        assertEquals(JISX0213String.length("\u9212"), 1);
        assertFalse(JISX0213String.isValid("\u9213"));	// 鈓
        assertEquals(JISX0213String.length("\u9213"), 1);
        assertFalse(JISX0213String.isValid("\u9218"));	// 鈘
        assertEquals(JISX0213String.length("\u9218"), 1);
        assertFalse(JISX0213String.isValid("\u921C"));	// 鈜
        assertEquals(JISX0213String.length("\u921C"), 1);
        assertFalse(JISX0213String.isValid("\u921D"));	// 鈝
        assertEquals(JISX0213String.length("\u921D"), 1);
        assertFalse(JISX0213String.isValid("\u9223"));	// 鈣
        assertEquals(JISX0213String.length("\u9223"), 1);
        assertFalse(JISX0213String.isValid("\u9224"));	// 鈤
        assertEquals(JISX0213String.length("\u9224"), 1);
        assertFalse(JISX0213String.isValid("\u9225"));	// 鈥
        assertEquals(JISX0213String.length("\u9225"), 1);
        assertFalse(JISX0213String.isValid("\u9226"));	// 鈦
        assertEquals(JISX0213String.length("\u9226"), 1);
        assertFalse(JISX0213String.isValid("\u9228"));	// 鈨
        assertEquals(JISX0213String.length("\u9228"), 1);
        assertFalse(JISX0213String.isValid("\u922E"));	// 鈮
        assertEquals(JISX0213String.length("\u922E"), 1);
        assertFalse(JISX0213String.isValid("\u922F"));	// 鈯
        assertEquals(JISX0213String.length("\u922F"), 1);
        assertFalse(JISX0213String.isValid("\u9230"));	// 鈰
        assertEquals(JISX0213String.length("\u9230"), 1);
        assertFalse(JISX0213String.isValid("\u9235"));	// 鈵
        assertEquals(JISX0213String.length("\u9235"), 1);
        assertFalse(JISX0213String.isValid("\u9236"));	// 鈶
        assertEquals(JISX0213String.length("\u9236"), 1);
        assertFalse(JISX0213String.isValid("\u923E"));	// 鈾
        assertEquals(JISX0213String.length("\u923E"), 1);
        assertFalse(JISX0213String.isValid("\u9246"));	// 鉆
        assertEquals(JISX0213String.length("\u9246"), 1);
        assertFalse(JISX0213String.isValid("\u924D"));	// 鉍
        assertEquals(JISX0213String.length("\u924D"), 1);
        assertFalse(JISX0213String.isValid("\u9258"));	// 鉘
        assertEquals(JISX0213String.length("\u9258"), 1);
        assertFalse(JISX0213String.isValid("\u925C"));	// 鉜
        assertEquals(JISX0213String.length("\u925C"), 1);
        assertFalse(JISX0213String.isValid("\u925D"));	// 鉝
        assertEquals(JISX0213String.length("\u925D"), 1);
        assertFalse(JISX0213String.isValid("\u9269"));	// 鉩
        assertEquals(JISX0213String.length("\u9269"), 1);
        assertFalse(JISX0213String.isValid("\u926E"));	// 鉮
        assertEquals(JISX0213String.length("\u926E"), 1);
        assertFalse(JISX0213String.isValid("\u926F"));	// 鉯
        assertEquals(JISX0213String.length("\u926F"), 1);
        assertFalse(JISX0213String.isValid("\u9270"));	// 鉰
        assertEquals(JISX0213String.length("\u9270"), 1);
        assertFalse(JISX0213String.isValid("\u9275"));	// 鉵
        assertEquals(JISX0213String.length("\u9275"), 1);
        assertFalse(JISX0213String.isValid("\u9276"));	// 鉶
        assertEquals(JISX0213String.length("\u9276"), 1);
        assertFalse(JISX0213String.isValid("\u9279"));	// 鉹
        assertEquals(JISX0213String.length("\u9279"), 1);
        assertFalse(JISX0213String.isValid("\u927B"));	// 鉻
        assertEquals(JISX0213String.length("\u927B"), 1);
        assertFalse(JISX0213String.isValid("\u928A"));	// 銊
        assertEquals(JISX0213String.length("\u928A"), 1);
        assertFalse(JISX0213String.isValid("\u928E"));	// 銎
        assertEquals(JISX0213String.length("\u928E"), 1);
        assertFalse(JISX0213String.isValid("\u9292"));	// 銒
        assertEquals(JISX0213String.length("\u9292"), 1);
        assertFalse(JISX0213String.isValid("\u92A0"));	// 銠
        assertEquals(JISX0213String.length("\u92A0"), 1);
        assertFalse(JISX0213String.isValid("\u92A4"));	// 銤
        assertEquals(JISX0213String.length("\u92A4"), 1);
        assertFalse(JISX0213String.isValid("\u92A5"));	// 銥
        assertEquals(JISX0213String.length("\u92A5"), 1);
        assertFalse(JISX0213String.isValid("\u92A8"));	// 銨
        assertEquals(JISX0213String.length("\u92A8"), 1);
        assertFalse(JISX0213String.isValid("\u92AF"));	// 銯
        assertEquals(JISX0213String.length("\u92AF"), 1);
        assertFalse(JISX0213String.isValid("\u92B6"));	// 銶
        assertEquals(JISX0213String.length("\u92B6"), 1);
        assertFalse(JISX0213String.isValid("\u92B8"));	// 銸
        assertEquals(JISX0213String.length("\u92B8"), 1);
        assertFalse(JISX0213String.isValid("\u92BA"));	// 銺
        assertEquals(JISX0213String.length("\u92BA"), 1);
        assertFalse(JISX0213String.isValid("\u92BB"));	// 銻
        assertEquals(JISX0213String.length("\u92BB"), 1);
        assertFalse(JISX0213String.isValid("\u92BC"));	// 銼
        assertEquals(JISX0213String.length("\u92BC"), 1);
        assertFalse(JISX0213String.isValid("\u92BD"));	// 銽
        assertEquals(JISX0213String.length("\u92BD"), 1);
        assertFalse(JISX0213String.isValid("\u92C1"));	// 鋁
        assertEquals(JISX0213String.length("\u92C1"), 1);
        assertFalse(JISX0213String.isValid("\u92C3"));	// 鋃
        assertEquals(JISX0213String.length("\u92C3"), 1);
        assertFalse(JISX0213String.isValid("\u92C5"));	// 鋅
        assertEquals(JISX0213String.length("\u92C5"), 1);
        assertFalse(JISX0213String.isValid("\u92C7"));	// 鋇
        assertEquals(JISX0213String.length("\u92C7"), 1);
        assertFalse(JISX0213String.isValid("\u92C8"));	// 鋈
        assertEquals(JISX0213String.length("\u92C8"), 1);
        assertFalse(JISX0213String.isValid("\u92CD"));	// 鋍
        assertEquals(JISX0213String.length("\u92CD"), 1);
        assertFalse(JISX0213String.isValid("\u92D8"));	// 鋘
        assertEquals(JISX0213String.length("\u92D8"), 1);
        assertFalse(JISX0213String.isValid("\u92DC"));	// 鋜
        assertEquals(JISX0213String.length("\u92DC"), 1);
        assertFalse(JISX0213String.isValid("\u92DD"));	// 鋝
        assertEquals(JISX0213String.length("\u92DD"), 1);
        assertFalse(JISX0213String.isValid("\u92DF"));	// 鋟
        assertEquals(JISX0213String.length("\u92DF"), 1);
        assertFalse(JISX0213String.isValid("\u92E1"));	// 鋡
        assertEquals(JISX0213String.length("\u92E1"), 1);
        assertFalse(JISX0213String.isValid("\u92E3"));	// 鋣
        assertEquals(JISX0213String.length("\u92E3"), 1);
        assertFalse(JISX0213String.isValid("\u92E8"));	// 鋨
        assertEquals(JISX0213String.length("\u92E8"), 1);
        assertFalse(JISX0213String.isValid("\u92EC"));	// 鋬
        assertEquals(JISX0213String.length("\u92EC"), 1);
        assertFalse(JISX0213String.isValid("\u92EE"));	// 鋮
        assertEquals(JISX0213String.length("\u92EE"), 1);
        assertFalse(JISX0213String.isValid("\u92F0"));	// 鋰
        assertEquals(JISX0213String.length("\u92F0"), 1);
        assertFalse(JISX0213String.isValid("\u9300"));	// 錀
        assertEquals(JISX0213String.length("\u9300"), 1);
        assertFalse(JISX0213String.isValid("\u9308"));	// 錈
        assertEquals(JISX0213String.length("\u9308"), 1);
        assertFalse(JISX0213String.isValid("\u9314"));	// 錔
        assertEquals(JISX0213String.length("\u9314"), 1);
        assertFalse(JISX0213String.isValid("\u931C"));	// 錜
        assertEquals(JISX0213String.length("\u931C"), 1);
        assertFalse(JISX0213String.isValid("\u9324"));	// 錤
        assertEquals(JISX0213String.length("\u9324"), 1);
        assertFalse(JISX0213String.isValid("\u932A"));	// 錪
        assertEquals(JISX0213String.length("\u932A"), 1);
        assertFalse(JISX0213String.isValid("\u9333"));	// 錳
        assertEquals(JISX0213String.length("\u9333"), 1);
        assertFalse(JISX0213String.isValid("\u9334"));	// 錴
        assertEquals(JISX0213String.length("\u9334"), 1);
        assertFalse(JISX0213String.isValid("\u9336"));	// 錶
        assertEquals(JISX0213String.length("\u9336"), 1);
        assertFalse(JISX0213String.isValid("\u9337"));	// 錷
        assertEquals(JISX0213String.length("\u9337"), 1);
        assertFalse(JISX0213String.isValid("\u9350"));	// 鍐
        assertEquals(JISX0213String.length("\u9350"), 1);
        assertFalse(JISX0213String.isValid("\u9352"));	// 鍒
        assertEquals(JISX0213String.length("\u9352"), 1);
        assertFalse(JISX0213String.isValid("\u9355"));	// 鍕
        assertEquals(JISX0213String.length("\u9355"), 1);
        assertFalse(JISX0213String.isValid("\u9358"));	// 鍘
        assertEquals(JISX0213String.length("\u9358"), 1);
        assertFalse(JISX0213String.isValid("\u935E"));	// 鍞
        assertEquals(JISX0213String.length("\u935E"), 1);
        assertFalse(JISX0213String.isValid("\u9367"));	// 鍧
        assertEquals(JISX0213String.length("\u9367"), 1);
        assertFalse(JISX0213String.isValid("\u9369"));	// 鍩
        assertEquals(JISX0213String.length("\u9369"), 1);
        assertFalse(JISX0213String.isValid("\u936D"));	// 鍭
        assertEquals(JISX0213String.length("\u936D"), 1);
        assertFalse(JISX0213String.isValid("\u936F"));	// 鍯
        assertEquals(JISX0213String.length("\u936F"), 1);
        assertFalse(JISX0213String.isValid("\u9374"));	// 鍴
        assertEquals(JISX0213String.length("\u9374"), 1);
        assertFalse(JISX0213String.isValid("\u9376"));	// 鍶
        assertEquals(JISX0213String.length("\u9376"), 1);
        assertFalse(JISX0213String.isValid("\u937A"));	// 鍺
        assertEquals(JISX0213String.length("\u937A"), 1);
        assertFalse(JISX0213String.isValid("\u937D"));	// 鍽
        assertEquals(JISX0213String.length("\u937D"), 1);
        assertFalse(JISX0213String.isValid("\u937F"));	// 鍿
        assertEquals(JISX0213String.length("\u937F"), 1);
        assertFalse(JISX0213String.isValid("\u9380"));	// 鎀
        assertEquals(JISX0213String.length("\u9380"), 1);
        assertFalse(JISX0213String.isValid("\u9381"));	// 鎁
        assertEquals(JISX0213String.length("\u9381"), 1);
        assertFalse(JISX0213String.isValid("\u9382"));	// 鎂
        assertEquals(JISX0213String.length("\u9382"), 1);
        assertFalse(JISX0213String.isValid("\u938A"));	// 鎊
        assertEquals(JISX0213String.length("\u938A"), 1);
        assertFalse(JISX0213String.isValid("\u938D"));	// 鎍
        assertEquals(JISX0213String.length("\u938D"), 1);
        assertFalse(JISX0213String.isValid("\u9392"));	// 鎒
        assertEquals(JISX0213String.length("\u9392"), 1);
        assertFalse(JISX0213String.isValid("\u9395"));	// 鎕
        assertEquals(JISX0213String.length("\u9395"), 1);
        assertFalse(JISX0213String.isValid("\u9398"));	// 鎘
        assertEquals(JISX0213String.length("\u9398"), 1);
        assertFalse(JISX0213String.isValid("\u93A6"));	// 鎦
        assertEquals(JISX0213String.length("\u93A6"), 1);
        assertFalse(JISX0213String.isValid("\u93A8"));	// 鎨
        assertEquals(JISX0213String.length("\u93A8"), 1);
        assertFalse(JISX0213String.isValid("\u93AB"));	// 鎫
        assertEquals(JISX0213String.length("\u93AB"), 1);
        assertFalse(JISX0213String.isValid("\u93B4"));	// 鎴
        assertEquals(JISX0213String.length("\u93B4"), 1);
        assertFalse(JISX0213String.isValid("\u93B5"));	// 鎵
        assertEquals(JISX0213String.length("\u93B5"), 1);
        assertFalse(JISX0213String.isValid("\u93B6"));	// 鎶
        assertEquals(JISX0213String.length("\u93B6"), 1);
        assertFalse(JISX0213String.isValid("\u93A9"));	// 鎩
        assertEquals(JISX0213String.length("\u93A9"), 1);
        assertFalse(JISX0213String.isValid("\u93C4"));	// 鏄
        assertEquals(JISX0213String.length("\u93C4"), 1);
        assertFalse(JISX0213String.isValid("\u93C5"));	// 鏅
        assertEquals(JISX0213String.length("\u93C5"), 1);
        assertFalse(JISX0213String.isValid("\u93C9"));	// 鏉
        assertEquals(JISX0213String.length("\u93C9"), 1);
        assertFalse(JISX0213String.isValid("\u93CA"));	// 鏊
        assertEquals(JISX0213String.length("\u93CA"), 1);
        assertFalse(JISX0213String.isValid("\u93CB"));	// 鏋
        assertEquals(JISX0213String.length("\u93CB"), 1);
        assertFalse(JISX0213String.isValid("\u93CC"));	// 鏌
        assertEquals(JISX0213String.length("\u93CC"), 1);
        assertFalse(JISX0213String.isValid("\u93CD"));	// 鏍
        assertEquals(JISX0213String.length("\u93CD"), 1);
        assertFalse(JISX0213String.isValid("\u93D3"));	// 鏓
        assertEquals(JISX0213String.length("\u93D3"), 1);
        assertFalse(JISX0213String.isValid("\u93D9"));	// 鏙
        assertEquals(JISX0213String.length("\u93D9"), 1);
        assertFalse(JISX0213String.isValid("\u93E6"));	// 鏦
        assertEquals(JISX0213String.length("\u93E6"), 1);
        assertFalse(JISX0213String.isValid("\u93F9"));	// 鏹
        assertEquals(JISX0213String.length("\u93F9"), 1);
        assertFalse(JISX0213String.isValid("\u93F7"));	// 鏷
        assertEquals(JISX0213String.length("\u93F7"), 1);
        assertFalse(JISX0213String.isValid("\u93FA"));	// 鏺
        assertEquals(JISX0213String.length("\u93FA"), 1);
        assertFalse(JISX0213String.isValid("\u9401"));	// 鐁
        assertEquals(JISX0213String.length("\u9401"), 1);
        assertFalse(JISX0213String.isValid("\u9402"));	// 鐂
        assertEquals(JISX0213String.length("\u9402"), 1);
        assertFalse(JISX0213String.isValid("\u9408"));	// 鐈
        assertEquals(JISX0213String.length("\u9408"), 1);
        assertFalse(JISX0213String.isValid("\u940D"));	// 鐍
        assertEquals(JISX0213String.length("\u940D"), 1);
        assertFalse(JISX0213String.isValid("\u940E"));	// 鐎
        assertEquals(JISX0213String.length("\u940E"), 1);
        assertFalse(JISX0213String.isValid("\u9415"));	// 鐕
        assertEquals(JISX0213String.length("\u9415"), 1);
        assertFalse(JISX0213String.isValid("\u941F"));	// 鐟
        assertEquals(JISX0213String.length("\u941F"), 1);
        assertFalse(JISX0213String.isValid("\u942E"));	// 鐮
        assertEquals(JISX0213String.length("\u942E"), 1);
        assertFalse(JISX0213String.isValid("\u942F"));	// 鐯
        assertEquals(JISX0213String.length("\u942F"), 1);
        assertFalse(JISX0213String.isValid("\u943F"));	// 鐿
        assertEquals(JISX0213String.length("\u943F"), 1);
        assertFalse(JISX0213String.isValid("\u943D"));	// 鐽
        assertEquals(JISX0213String.length("\u943D"), 1);
        assertFalse(JISX0213String.isValid("\u9443"));	// 鑃
        assertEquals(JISX0213String.length("\u9443"), 1);
        assertFalse(JISX0213String.isValid("\u944C"));	// 鑌
        assertEquals(JISX0213String.length("\u944C"), 1);
        assertFalse(JISX0213String.isValid("\u9455"));	// 鑕
        assertEquals(JISX0213String.length("\u9455"), 1);
        assertFalse(JISX0213String.isValid("\u9459"));	// 鑙
        assertEquals(JISX0213String.length("\u9459"), 1);
        assertFalse(JISX0213String.isValid("\u945C"));	// 鑜
        assertEquals(JISX0213String.length("\u945C"), 1);
        assertFalse(JISX0213String.isValid("\u945F"));	// 鑟
        assertEquals(JISX0213String.length("\u945F"), 1);
        assertFalse(JISX0213String.isValid("\u9461"));	// 鑡
        assertEquals(JISX0213String.length("\u9461"), 1);
        assertFalse(JISX0213String.isValid("\u9468"));	// 鑨
        assertEquals(JISX0213String.length("\u9468"), 1);
        assertFalse(JISX0213String.isValid("\u946E"));	// 鑮
        assertEquals(JISX0213String.length("\u946E"), 1);
        assertFalse(JISX0213String.isValid("\u9484"));	// 钄
        assertEquals(JISX0213String.length("\u9484"), 1);
        assertFalse(JISX0213String.isValid("\u9483"));	// 钃
        assertEquals(JISX0213String.length("\u9483"), 1);
        assertFalse(JISX0213String.isValid("\u957E"));	// 镾
        assertEquals(JISX0213String.length("\u957E"), 1);
        assertFalse(JISX0213String.isValid("\u9584"));	// 閄
        assertEquals(JISX0213String.length("\u9584"), 1);
        assertFalse(JISX0213String.isValid("\u9588"));	// 閈
        assertEquals(JISX0213String.length("\u9588"), 1);
        assertFalse(JISX0213String.isValid("\u959D"));	// 閝
        assertEquals(JISX0213String.length("\u959D"), 1);
        assertFalse(JISX0213String.isValid("\u959E"));	// 閞
        assertEquals(JISX0213String.length("\u959E"), 1);
        assertFalse(JISX0213String.isValid("\u95A1"));	// 閡
        assertEquals(JISX0213String.length("\u95A1"), 1);
        assertFalse(JISX0213String.isValid("\u95BA"));	// 閺
        assertEquals(JISX0213String.length("\u95BA"), 1);
        assertFalse(JISX0213String.isValid("\u95BF"));	// 閿
        assertEquals(JISX0213String.length("\u95BF"), 1);
        assertFalse(JISX0213String.isValid("\u95C6"));	// 闆
        assertEquals(JISX0213String.length("\u95C6"), 1);
        assertFalse(JISX0213String.isValid("\u95C9"));	// 闉
        assertEquals(JISX0213String.length("\u95C9"), 1);
        assertFalse(JISX0213String.isValid("\u95D1"));	// 闑
        assertEquals(JISX0213String.length("\u95D1"), 1);
        assertFalse(JISX0213String.isValid("\u95D2"));	// 闒
        assertEquals(JISX0213String.length("\u95D2"), 1);
        assertFalse(JISX0213String.isValid("\u95D9"));	// 闙
        assertEquals(JISX0213String.length("\u95D9"), 1);
        assertFalse(JISX0213String.isValid("\u95DD"));	// 闝
        assertEquals(JISX0213String.length("\u95DD"), 1);
        assertFalse(JISX0213String.isValid("\u95DF"));	// 闟
        assertEquals(JISX0213String.length("\u95DF"), 1);
        assertFalse(JISX0213String.isValid("\u95E0"));	// 闠
        assertEquals(JISX0213String.length("\u95E0"), 1);
        assertFalse(JISX0213String.isValid("\u95E4"));	// 闤
        assertEquals(JISX0213String.length("\u95E4"), 1);
        assertFalse(JISX0213String.isValid("\u95E6"));	// 闦
        assertEquals(JISX0213String.length("\u95E6"), 1);
        assertFalse(JISX0213String.isValid("\u961E"));	// 阞
        assertEquals(JISX0213String.length("\u961E"), 1);
        assertFalse(JISX0213String.isValid("\u9622"));	// 阢
        assertEquals(JISX0213String.length("\u9622"), 1);
        assertFalse(JISX0213String.isValid("\u9624"));	// 阤
        assertEquals(JISX0213String.length("\u9624"), 1);
        assertFalse(JISX0213String.isValid("\u9625"));	// 阥
        assertEquals(JISX0213String.length("\u9625"), 1);
        assertFalse(JISX0213String.isValid("\u9626"));	// 阦
        assertEquals(JISX0213String.length("\u9626"), 1);
        assertFalse(JISX0213String.isValid("\u9631"));	// 阱
        assertEquals(JISX0213String.length("\u9631"), 1);
        assertFalse(JISX0213String.isValid("\u9637"));	// 阷
        assertEquals(JISX0213String.length("\u9637"), 1);
        assertFalse(JISX0213String.isValid("\u9638"));	// 阸
        assertEquals(JISX0213String.length("\u9638"), 1);
        assertFalse(JISX0213String.isValid("\u9639"));	// 阹
        assertEquals(JISX0213String.length("\u9639"), 1);
        assertFalse(JISX0213String.isValid("\u963A"));	// 阺
        assertEquals(JISX0213String.length("\u963A"), 1);
        assertFalse(JISX0213String.isValid("\u963D"));	// 阽
        assertEquals(JISX0213String.length("\u963D"), 1);
        assertFalse(JISX0213String.isValid("\u9652"));	// 陒
        assertEquals(JISX0213String.length("\u9652"), 1);
        assertFalse(JISX0213String.isValid("\u9654"));	// 陔
        assertEquals(JISX0213String.length("\u9654"), 1);
        assertFalse(JISX0213String.isValid("\u9656"));	// 陖
        assertEquals(JISX0213String.length("\u9656"), 1);
        assertFalse(JISX0213String.isValid("\u9657"));	// 陗
        assertEquals(JISX0213String.length("\u9657"), 1);
        assertFalse(JISX0213String.isValid("\u966E"));	// 陮
        assertEquals(JISX0213String.length("\u966E"), 1);
        assertFalse(JISX0213String.isValid("\u9674"));	// 陴
        assertEquals(JISX0213String.length("\u9674"), 1);
        assertFalse(JISX0213String.isValid("\u967B"));	// 陻
        assertEquals(JISX0213String.length("\u967B"), 1);
        assertFalse(JISX0213String.isValid("\u967C"));	// 陼
        assertEquals(JISX0213String.length("\u967C"), 1);
        assertFalse(JISX0213String.isValid("\u967E"));	// 陾
        assertEquals(JISX0213String.length("\u967E"), 1);
        assertFalse(JISX0213String.isValid("\u967F"));	// 陿
        assertEquals(JISX0213String.length("\u967F"), 1);
        assertFalse(JISX0213String.isValid("\u9681"));	// 隁
        assertEquals(JISX0213String.length("\u9681"), 1);
        assertFalse(JISX0213String.isValid("\u9683"));	// 隃
        assertEquals(JISX0213String.length("\u9683"), 1);
        assertFalse(JISX0213String.isValid("\u9689"));	// 隉
        assertEquals(JISX0213String.length("\u9689"), 1);
        assertFalse(JISX0213String.isValid("\u9691"));	// 隑
        assertEquals(JISX0213String.length("\u9691"), 1);
        assertFalse(JISX0213String.isValid("\u9696"));	// 隖
        assertEquals(JISX0213String.length("\u9696"), 1);
        assertFalse(JISX0213String.isValid("\u969F"));	// 隟
        assertEquals(JISX0213String.length("\u969F"), 1);
        assertFalse(JISX0213String.isValid("\u96A6"));	// 隦
        assertEquals(JISX0213String.length("\u96A6"), 1);
        assertFalse(JISX0213String.isValid("\u96AE"));	// 隮
        assertEquals(JISX0213String.length("\u96AE"), 1);
        assertFalse(JISX0213String.isValid("\u96CA"));	// 雊
        assertEquals(JISX0213String.length("\u96CA"), 1);
        assertFalse(JISX0213String.isValid("\u96DF"));	// 雟
        assertEquals(JISX0213String.length("\u96DF"), 1);
        assertFalse(JISX0213String.isValid("\u96F1"));	// 雱
        assertEquals(JISX0213String.length("\u96F1"), 1);
        assertFalse(JISX0213String.isValid("\u96FA"));	// 雺
        assertEquals(JISX0213String.length("\u96FA"), 1);
        assertFalse(JISX0213String.isValid("\u9702"));	// 霂
        assertEquals(JISX0213String.length("\u9702"), 1);
        assertFalse(JISX0213String.isValid("\u9703"));	// 霃
        assertEquals(JISX0213String.length("\u9703"), 1);
        assertFalse(JISX0213String.isValid("\u9705"));	// 霅
        assertEquals(JISX0213String.length("\u9705"), 1);
        assertFalse(JISX0213String.isValid("\u9709"));	// 霉
        assertEquals(JISX0213String.length("\u9709"), 1);
        assertFalse(JISX0213String.isValid("\u971A"));	// 霚
        assertEquals(JISX0213String.length("\u971A"), 1);
        assertFalse(JISX0213String.isValid("\u971B"));	// 霛
        assertEquals(JISX0213String.length("\u971B"), 1);
        assertFalse(JISX0213String.isValid("\u971D"));	// 霝
        assertEquals(JISX0213String.length("\u971D"), 1);
        assertFalse(JISX0213String.isValid("\u9721"));	// 霡
        assertEquals(JISX0213String.length("\u9721"), 1);
        assertFalse(JISX0213String.isValid("\u9722"));	// 霢
        assertEquals(JISX0213String.length("\u9722"), 1);
        assertFalse(JISX0213String.isValid("\u9728"));	// 霨
        assertEquals(JISX0213String.length("\u9728"), 1);
        assertFalse(JISX0213String.isValid("\u9731"));	// 霱
        assertEquals(JISX0213String.length("\u9731"), 1);
        assertFalse(JISX0213String.isValid("\u974A"));	// 靊
        assertEquals(JISX0213String.length("\u974A"), 1);
        assertFalse(JISX0213String.isValid("\u9758"));	// 靘
        assertEquals(JISX0213String.length("\u9758"), 1);
        assertFalse(JISX0213String.isValid("\u9763"));	// 靣
        assertEquals(JISX0213String.length("\u9763"), 1);
        assertFalse(JISX0213String.isValid("\u9767"));	// 靧
        assertEquals(JISX0213String.length("\u9767"), 1);
        assertFalse(JISX0213String.isValid("\u9776"));	// 靶
        assertEquals(JISX0213String.length("\u9776"), 1);
        assertFalse(JISX0213String.isValid("\u9777"));	// 靷
        assertEquals(JISX0213String.length("\u9777"), 1);
        assertFalse(JISX0213String.isValid("\u9778"));	// 靸
        assertEquals(JISX0213String.length("\u9778"), 1);
        assertFalse(JISX0213String.isValid("\u977B"));	// 靻
        assertEquals(JISX0213String.length("\u977B"), 1);
        assertFalse(JISX0213String.isValid("\u977D"));	// 靽
        assertEquals(JISX0213String.length("\u977D"), 1);
        assertFalse(JISX0213String.isValid("\u977F"));	// 靿
        assertEquals(JISX0213String.length("\u977F"), 1);
        assertFalse(JISX0213String.isValid("\u9780"));	// 鞀
        assertEquals(JISX0213String.length("\u9780"), 1);
        assertFalse(JISX0213String.isValid("\u9789"));	// 鞉
        assertEquals(JISX0213String.length("\u9789"), 1);
        assertFalse(JISX0213String.isValid("\u9797"));	// 鞗
        assertEquals(JISX0213String.length("\u9797"), 1);
        assertFalse(JISX0213String.isValid("\u9799"));	// 鞙
        assertEquals(JISX0213String.length("\u9799"), 1);
        assertFalse(JISX0213String.isValid("\u979F"));	// 鞟
        assertEquals(JISX0213String.length("\u979F"), 1);
        assertFalse(JISX0213String.isValid("\u97AC"));	// 鞬
        assertEquals(JISX0213String.length("\u97AC"), 1);
        assertFalse(JISX0213String.isValid("\u97B5"));	// 鞵
        assertEquals(JISX0213String.length("\u97B5"), 1);
        assertFalse(JISX0213String.isValid("\u97B6"));	// 鞶
        assertEquals(JISX0213String.length("\u97B6"), 1);
        assertFalse(JISX0213String.isValid("\u97B8"));	// 鞸
        assertEquals(JISX0213String.length("\u97B8"), 1);
        assertFalse(JISX0213String.isValid("\u97B9"));	// 鞹
        assertEquals(JISX0213String.length("\u97B9"), 1);
        assertFalse(JISX0213String.isValid("\u97BC"));	// 鞼
        assertEquals(JISX0213String.length("\u97BC"), 1);
        assertFalse(JISX0213String.isValid("\u97BF"));	// 鞿
        assertEquals(JISX0213String.length("\u97BF"), 1);
        assertFalse(JISX0213String.isValid("\u97C4"));	// 韄
        assertEquals(JISX0213String.length("\u97C4"), 1);
        assertFalse(JISX0213String.isValid("\u97C5"));	// 韅
        assertEquals(JISX0213String.length("\u97C5"), 1);
        assertFalse(JISX0213String.isValid("\u97C7"));	// 韇
        assertEquals(JISX0213String.length("\u97C7"), 1);
        assertFalse(JISX0213String.isValid("\u97CA"));	// 韊
        assertEquals(JISX0213String.length("\u97CA"), 1);
        assertFalse(JISX0213String.isValid("\u97CD"));	// 韍
        assertEquals(JISX0213String.length("\u97CD"), 1);
        assertFalse(JISX0213String.isValid("\u97CE"));	// 韎
        assertEquals(JISX0213String.length("\u97CE"), 1);
        assertFalse(JISX0213String.isValid("\u97D0"));	// 韐
        assertEquals(JISX0213String.length("\u97D0"), 1);
        assertFalse(JISX0213String.isValid("\u97D7"));	// 韗
        assertEquals(JISX0213String.length("\u97D7"), 1);
        assertFalse(JISX0213String.isValid("\u97DD"));	// 韝
        assertEquals(JISX0213String.length("\u97DD"), 1);
        assertFalse(JISX0213String.isValid("\u97E0"));	// 韠
        assertEquals(JISX0213String.length("\u97E0"), 1);
        assertFalse(JISX0213String.isValid("\u97E4"));	// 韤
        assertEquals(JISX0213String.length("\u97E4"), 1);
        assertFalse(JISX0213String.isValid("\u97EF"));	// 韯
        assertEquals(JISX0213String.length("\u97EF"), 1);
        assertFalse(JISX0213String.isValid("\u97F7"));	// 韷
        assertEquals(JISX0213String.length("\u97F7"), 1);
        assertFalse(JISX0213String.isValid("\u97F8"));	// 韸
        assertEquals(JISX0213String.length("\u97F8"), 1);
        assertFalse(JISX0213String.isValid("\u97FA"));	// 韺
        assertEquals(JISX0213String.length("\u97FA"), 1);
        assertFalse(JISX0213String.isValid("\u9807"));	// 頇
        assertEquals(JISX0213String.length("\u9807"), 1);
        assertFalse(JISX0213String.isValid("\u9819"));	// 頙
        assertEquals(JISX0213String.length("\u9819"), 1);
        assertFalse(JISX0213String.isValid("\u981C"));	// 頜
        assertEquals(JISX0213String.length("\u981C"), 1);
        assertFalse(JISX0213String.isValid("\u9820"));	// 頠
        assertEquals(JISX0213String.length("\u9820"), 1);
        assertFalse(JISX0213String.isValid("\u9826"));	// 頦
        assertEquals(JISX0213String.length("\u9826"), 1);
        assertFalse(JISX0213String.isValid("\u982E"));	// 頮
        assertEquals(JISX0213String.length("\u982E"), 1);
        assertFalse(JISX0213String.isValid("\u982F"));	// 頯
        assertEquals(JISX0213String.length("\u982F"), 1);
        assertFalse(JISX0213String.isValid("\u9835"));	// 頵
        assertEquals(JISX0213String.length("\u9835"), 1);
        assertFalse(JISX0213String.isValid("\u983E"));	// 頾
        assertEquals(JISX0213String.length("\u983E"), 1);
        assertFalse(JISX0213String.isValid("\u9844"));	// 顄
        assertEquals(JISX0213String.length("\u9844"), 1);
        assertFalse(JISX0213String.isValid("\u984A"));	// 顊
        assertEquals(JISX0213String.length("\u984A"), 1);
        assertFalse(JISX0213String.isValid("\u9851"));	// 顑
        assertEquals(JISX0213String.length("\u9851"), 1);
        assertFalse(JISX0213String.isValid("\u9862"));	// 顢
        assertEquals(JISX0213String.length("\u9862"), 1);
        assertFalse(JISX0213String.isValid("\u9863"));	// 顣
        assertEquals(JISX0213String.length("\u9863"), 1);
        assertFalse(JISX0213String.isValid("\u986A"));	// 顪
        assertEquals(JISX0213String.length("\u986A"), 1);
        assertFalse(JISX0213String.isValid("\u98AE"));	// 颮
        assertEquals(JISX0213String.length("\u98AE"), 1);
        assertFalse(JISX0213String.isValid("\u98B4"));	// 颴
        assertEquals(JISX0213String.length("\u98B4"), 1);
        assertFalse(JISX0213String.isValid("\u98C5"));	// 飅
        assertEquals(JISX0213String.length("\u98C5"), 1);
        assertFalse(JISX0213String.isValid("\u98CC"));	// 飌
        assertEquals(JISX0213String.length("\u98CC"), 1);
        assertFalse(JISX0213String.isValid("\u98E6"));	// 飦
        assertEquals(JISX0213String.length("\u98E6"), 1);
        assertFalse(JISX0213String.isValid("\u98F6"));	// 飶
        assertEquals(JISX0213String.length("\u98F6"), 1);
        assertFalse(JISX0213String.isValid("\u9902"));	// 餂
        assertEquals(JISX0213String.length("\u9902"), 1);
        assertFalse(JISX0213String.isValid("\u9907"));	// 餇
        assertEquals(JISX0213String.length("\u9907"), 1);
        assertFalse(JISX0213String.isValid("\u9911"));	// 餑
        assertEquals(JISX0213String.length("\u9911"), 1);
        assertFalse(JISX0213String.isValid("\u9915"));	// 餕
        assertEquals(JISX0213String.length("\u9915"), 1);
        assertFalse(JISX0213String.isValid("\u991F"));	// 餟
        assertEquals(JISX0213String.length("\u991F"), 1);
        assertFalse(JISX0213String.isValid("\u9922"));	// 餢
        assertEquals(JISX0213String.length("\u9922"), 1);
        assertFalse(JISX0213String.isValid("\u9926"));	// 餦
        assertEquals(JISX0213String.length("\u9926"), 1);
        assertFalse(JISX0213String.isValid("\u992B"));	// 餫
        assertEquals(JISX0213String.length("\u992B"), 1);
        assertFalse(JISX0213String.isValid("\u9934"));	// 餴
        assertEquals(JISX0213String.length("\u9934"), 1);
        assertFalse(JISX0213String.isValid("\u9935"));	// 餵
        assertEquals(JISX0213String.length("\u9935"), 1);
        assertFalse(JISX0213String.isValid("\u9939"));	// 餹
        assertEquals(JISX0213String.length("\u9939"), 1);
        assertFalse(JISX0213String.isValid("\u9947"));	// 饇
        assertEquals(JISX0213String.length("\u9947"), 1);
        assertFalse(JISX0213String.isValid("\u9948"));	// 饈
        assertEquals(JISX0213String.length("\u9948"), 1);
        assertFalse(JISX0213String.isValid("\u9954"));	// 饔
        assertEquals(JISX0213String.length("\u9954"), 1);
        assertFalse(JISX0213String.isValid("\u9959"));	// 饙
        assertEquals(JISX0213String.length("\u9959"), 1);
        assertFalse(JISX0213String.isValid("\u995B"));	// 饛
        assertEquals(JISX0213String.length("\u995B"), 1);
        assertFalse(JISX0213String.isValid("\u995E"));	// 饞
        assertEquals(JISX0213String.length("\u995E"), 1);
        assertFalse(JISX0213String.isValid("\u999B"));	// 馛
        assertEquals(JISX0213String.length("\u999B"), 1);
        assertFalse(JISX0213String.isValid("\u999D"));	// 馝
        assertEquals(JISX0213String.length("\u999D"), 1);
        assertFalse(JISX0213String.isValid("\u999F"));	// 馟
        assertEquals(JISX0213String.length("\u999F"), 1);
        assertFalse(JISX0213String.isValid("\u99B0"));	// 馰
        assertEquals(JISX0213String.length("\u99B0"), 1);
        assertFalse(JISX0213String.isValid("\u99B1"));	// 馱
        assertEquals(JISX0213String.length("\u99B1"), 1);
        assertFalse(JISX0213String.isValid("\u99B2"));	// 馲
        assertEquals(JISX0213String.length("\u99B2"), 1);
        assertFalse(JISX0213String.isValid("\u99B5"));	// 馵
        assertEquals(JISX0213String.length("\u99B5"), 1);
        assertFalse(JISX0213String.isValid("\u99BA"));	// 馺
        assertEquals(JISX0213String.length("\u99BA"), 1);
        assertFalse(JISX0213String.isValid("\u99D3"));	// 駓
        assertEquals(JISX0213String.length("\u99D3"), 1);
        assertFalse(JISX0213String.isValid("\u99DA"));	// 駚
        assertEquals(JISX0213String.length("\u99DA"), 1);
        assertFalse(JISX0213String.isValid("\u99DC"));	// 駜
        assertEquals(JISX0213String.length("\u99DC"), 1);
        assertFalse(JISX0213String.isValid("\u99E7"));	// 駧
        assertEquals(JISX0213String.length("\u99E7"), 1);
        assertFalse(JISX0213String.isValid("\u99EA"));	// 駪
        assertEquals(JISX0213String.length("\u99EA"), 1);
        assertFalse(JISX0213String.isValid("\u99EB"));	// 駫
        assertEquals(JISX0213String.length("\u99EB"), 1);
        assertFalse(JISX0213String.isValid("\u99EC"));	// 駬
        assertEquals(JISX0213String.length("\u99EC"), 1);
        assertFalse(JISX0213String.isValid("\u99F4"));	// 駴
        assertEquals(JISX0213String.length("\u99F4"), 1);
        assertFalse(JISX0213String.isValid("\u99F5"));	// 駵
        assertEquals(JISX0213String.length("\u99F5"), 1);
        assertFalse(JISX0213String.isValid("\u99FD"));	// 駽
        assertEquals(JISX0213String.length("\u99FD"), 1);
        assertFalse(JISX0213String.isValid("\u99FE"));	// 駾
        assertEquals(JISX0213String.length("\u99FE"), 1);
        assertFalse(JISX0213String.isValid("\u9A04"));	// 騄
        assertEquals(JISX0213String.length("\u9A04"), 1);
        assertFalse(JISX0213String.isValid("\u9A0B"));	// 騋
        assertEquals(JISX0213String.length("\u9A0B"), 1);
        assertFalse(JISX0213String.isValid("\u9A0C"));	// 騌
        assertEquals(JISX0213String.length("\u9A0C"), 1);
        assertFalse(JISX0213String.isValid("\u9A10"));	// 騐
        assertEquals(JISX0213String.length("\u9A10"), 1);
        assertFalse(JISX0213String.isValid("\u9A1E"));	// 騞
        assertEquals(JISX0213String.length("\u9A1E"), 1);
        assertFalse(JISX0213String.isValid("\u9A22"));	// 騢
        assertEquals(JISX0213String.length("\u9A22"), 1);
        assertFalse(JISX0213String.isValid("\u9A23"));	// 騣
        assertEquals(JISX0213String.length("\u9A23"), 1);
        assertFalse(JISX0213String.isValid("\u9A27"));	// 騧
        assertEquals(JISX0213String.length("\u9A27"), 1);
        assertFalse(JISX0213String.isValid("\u9A33"));	// 騳
        assertEquals(JISX0213String.length("\u9A33"), 1);
        assertFalse(JISX0213String.isValid("\u9A35"));	// 騵
        assertEquals(JISX0213String.length("\u9A35"), 1);
        assertFalse(JISX0213String.isValid("\u9A47"));	// 驇
        assertEquals(JISX0213String.length("\u9A47"), 1);
        assertFalse(JISX0213String.isValid("\u9A41"));	// 驁
        assertEquals(JISX0213String.length("\u9A41"), 1);
        assertFalse(JISX0213String.isValid("\u9A4B"));	// 驋
        assertEquals(JISX0213String.length("\u9A4B"), 1);
        assertFalse(JISX0213String.isValid("\u9A51"));	// 驑
        assertEquals(JISX0213String.length("\u9A51"), 1);
        assertFalse(JISX0213String.isValid("\u9A54"));	// 驔
        assertEquals(JISX0213String.length("\u9A54"), 1);
        assertFalse(JISX0213String.isValid("\u9A56"));	// 驖
        assertEquals(JISX0213String.length("\u9A56"), 1);
        assertFalse(JISX0213String.isValid("\u9A5D"));	// 驝
        assertEquals(JISX0213String.length("\u9A5D"), 1);
        assertFalse(JISX0213String.isValid("\u9AAA"));	// 骪
        assertEquals(JISX0213String.length("\u9AAA"), 1);
        assertFalse(JISX0213String.isValid("\u9AAC"));	// 骬
        assertEquals(JISX0213String.length("\u9AAC"), 1);
        assertFalse(JISX0213String.isValid("\u9AAE"));	// 骮
        assertEquals(JISX0213String.length("\u9AAE"), 1);
        assertFalse(JISX0213String.isValid("\u9AB2"));	// 骲
        assertEquals(JISX0213String.length("\u9AB2"), 1);
        assertFalse(JISX0213String.isValid("\u9AB4"));	// 骴
        assertEquals(JISX0213String.length("\u9AB4"), 1);
        assertFalse(JISX0213String.isValid("\u9AB5"));	// 骵
        assertEquals(JISX0213String.length("\u9AB5"), 1);
        assertFalse(JISX0213String.isValid("\u9ABB"));	// 骻
        assertEquals(JISX0213String.length("\u9ABB"), 1);
        assertFalse(JISX0213String.isValid("\u9ABE"));	// 骾
        assertEquals(JISX0213String.length("\u9ABE"), 1);
        assertFalse(JISX0213String.isValid("\u9ABF"));	// 骿
        assertEquals(JISX0213String.length("\u9ABF"), 1);
        assertFalse(JISX0213String.isValid("\u9AC8"));	// 髈
        assertEquals(JISX0213String.length("\u9AC8"), 1);
        assertFalse(JISX0213String.isValid("\u9AD7"));	// 髗
        assertEquals(JISX0213String.length("\u9AD7"), 1);
        assertFalse(JISX0213String.isValid("\u9ADB"));	// 髛
        assertEquals(JISX0213String.length("\u9ADB"), 1);
        assertFalse(JISX0213String.isValid("\u9AE4"));	// 髤
        assertEquals(JISX0213String.length("\u9AE4"), 1);
        assertFalse(JISX0213String.isValid("\u9AE7"));	// 髧
        assertEquals(JISX0213String.length("\u9AE7"), 1);
        assertFalse(JISX0213String.isValid("\u9AEC"));	// 髬
        assertEquals(JISX0213String.length("\u9AEC"), 1);
        assertFalse(JISX0213String.isValid("\u9AF2"));	// 髲
        assertEquals(JISX0213String.length("\u9AF2"), 1);
        assertFalse(JISX0213String.isValid("\u9AF3"));	// 髳
        assertEquals(JISX0213String.length("\u9AF3"), 1);
        assertFalse(JISX0213String.isValid("\u9AF5"));	// 髵
        assertEquals(JISX0213String.length("\u9AF5"), 1);
        assertFalse(JISX0213String.isValid("\u9AFA"));	// 髺
        assertEquals(JISX0213String.length("\u9AFA"), 1);
        assertFalse(JISX0213String.isValid("\u9AFD"));	// 髽
        assertEquals(JISX0213String.length("\u9AFD"), 1);
        assertFalse(JISX0213String.isValid("\u9AFF"));	// 髿
        assertEquals(JISX0213String.length("\u9AFF"), 1);
        assertFalse(JISX0213String.isValid("\u9B00"));	// 鬀
        assertEquals(JISX0213String.length("\u9B00"), 1);
        assertFalse(JISX0213String.isValid("\u9B01"));	// 鬁
        assertEquals(JISX0213String.length("\u9B01"), 1);
        assertFalse(JISX0213String.isValid("\u9B04"));	// 鬄
        assertEquals(JISX0213String.length("\u9B04"), 1);
        assertFalse(JISX0213String.isValid("\u9B05"));	// 鬅
        assertEquals(JISX0213String.length("\u9B05"), 1);
        assertFalse(JISX0213String.isValid("\u9B09"));	// 鬉
        assertEquals(JISX0213String.length("\u9B09"), 1);
        assertFalse(JISX0213String.isValid("\u9B0B"));	// 鬋
        assertEquals(JISX0213String.length("\u9B0B"), 1);
        assertFalse(JISX0213String.isValid("\u9B0D"));	// 鬍
        assertEquals(JISX0213String.length("\u9B0D"), 1);
        assertFalse(JISX0213String.isValid("\u9B0E"));	// 鬎
        assertEquals(JISX0213String.length("\u9B0E"), 1);
        assertFalse(JISX0213String.isValid("\u9B19"));	// 鬙
        assertEquals(JISX0213String.length("\u9B19"), 1);
        assertFalse(JISX0213String.isValid("\u9B1B"));	// 鬛
        assertEquals(JISX0213String.length("\u9B1B"), 1);
        assertFalse(JISX0213String.isValid("\u9B26"));	// 鬦
        assertEquals(JISX0213String.length("\u9B26"), 1);
        assertFalse(JISX0213String.isValid("\u9B34"));	// 鬴
        assertEquals(JISX0213String.length("\u9B34"), 1);
        assertFalse(JISX0213String.isValid("\u9B35"));	// 鬵
        assertEquals(JISX0213String.length("\u9B35"), 1);
        assertFalse(JISX0213String.isValid("\u9B37"));	// 鬷
        assertEquals(JISX0213String.length("\u9B37"), 1);
        assertFalse(JISX0213String.isValid("\u9B39"));	// 鬹
        assertEquals(JISX0213String.length("\u9B39"), 1);
        assertFalse(JISX0213String.isValid("\u9B3A"));	// 鬺
        assertEquals(JISX0213String.length("\u9B3A"), 1);
        assertFalse(JISX0213String.isValid("\u9B48"));	// 魈
        assertEquals(JISX0213String.length("\u9B48"), 1);
        assertFalse(JISX0213String.isValid("\u9B4C"));	// 魌
        assertEquals(JISX0213String.length("\u9B4C"), 1);
        assertFalse(JISX0213String.isValid("\u9B55"));	// 魕
        assertEquals(JISX0213String.length("\u9B55"), 1);
        assertFalse(JISX0213String.isValid("\u9B56"));	// 魖
        assertEquals(JISX0213String.length("\u9B56"), 1);
        assertFalse(JISX0213String.isValid("\u9B57"));	// 魗
        assertEquals(JISX0213String.length("\u9B57"), 1);
        assertFalse(JISX0213String.isValid("\u9B5B"));	// 魛
        assertEquals(JISX0213String.length("\u9B5B"), 1);
        assertFalse(JISX0213String.isValid("\u9B61"));	// 魡
        assertEquals(JISX0213String.length("\u9B61"), 1);
        assertFalse(JISX0213String.isValid("\u9B68"));	// 魨
        assertEquals(JISX0213String.length("\u9B68"), 1);
        assertFalse(JISX0213String.isValid("\u9B6A"));	// 魪
        assertEquals(JISX0213String.length("\u9B6A"), 1);
        assertFalse(JISX0213String.isValid("\u9B6D"));	// 魭
        assertEquals(JISX0213String.length("\u9B6D"), 1);
        assertFalse(JISX0213String.isValid("\u9B6E"));	// 魮
        assertEquals(JISX0213String.length("\u9B6E"), 1);
        assertFalse(JISX0213String.isValid("\u9B78"));	// 魸
        assertEquals(JISX0213String.length("\u9B78"), 1);
        assertFalse(JISX0213String.isValid("\u9B7F"));	// 魿
        assertEquals(JISX0213String.length("\u9B7F"), 1);
        assertFalse(JISX0213String.isValid("\u9B80"));	// 鮀
        assertEquals(JISX0213String.length("\u9B80"), 1);
        assertFalse(JISX0213String.isValid("\u9B85"));	// 鮅
        assertEquals(JISX0213String.length("\u9B85"), 1);
        assertFalse(JISX0213String.isValid("\u9B86"));	// 鮆
        assertEquals(JISX0213String.length("\u9B86"), 1);
        assertFalse(JISX0213String.isValid("\u9B87"));	// 鮇
        assertEquals(JISX0213String.length("\u9B87"), 1);
        assertFalse(JISX0213String.isValid("\u9B89"));	// 鮉
        assertEquals(JISX0213String.length("\u9B89"), 1);
        assertFalse(JISX0213String.isValid("\u9B8B"));	// 鮋
        assertEquals(JISX0213String.length("\u9B8B"), 1);
        assertFalse(JISX0213String.isValid("\u9B8D"));	// 鮍
        assertEquals(JISX0213String.length("\u9B8D"), 1);
        assertFalse(JISX0213String.isValid("\u9B90"));	// 鮐
        assertEquals(JISX0213String.length("\u9B90"), 1);
        assertFalse(JISX0213String.isValid("\u9B94"));	// 鮔
        assertEquals(JISX0213String.length("\u9B94"), 1);
        assertFalse(JISX0213String.isValid("\u9B9A"));	// 鮚
        assertEquals(JISX0213String.length("\u9B9A"), 1);
        assertFalse(JISX0213String.isValid("\u9B9D"));	// 鮝
        assertEquals(JISX0213String.length("\u9B9D"), 1);
        assertFalse(JISX0213String.isValid("\u9BA9"));	// 鮩
        assertEquals(JISX0213String.length("\u9BA9"), 1);
        assertFalse(JISX0213String.isValid("\u9BB0"));	// 鮰
        assertEquals(JISX0213String.length("\u9BB0"), 1);
        assertFalse(JISX0213String.isValid("\u9BB7"));	// 鮷
        assertEquals(JISX0213String.length("\u9BB7"), 1);
        assertFalse(JISX0213String.isValid("\u9BBC"));	// 鮼
        assertEquals(JISX0213String.length("\u9BBC"), 1);
        assertFalse(JISX0213String.isValid("\u9BBF"));	// 鮿
        assertEquals(JISX0213String.length("\u9BBF"), 1);
        assertFalse(JISX0213String.isValid("\u9BC8"));	// 鯈
        assertEquals(JISX0213String.length("\u9BC8"), 1);
        assertFalse(JISX0213String.isValid("\u9BD0"));	// 鯐
        assertEquals(JISX0213String.length("\u9BD0"), 1);
        assertFalse(JISX0213String.isValid("\u9BD7"));	// 鯗
        assertEquals(JISX0213String.length("\u9BD7"), 1);
        assertFalse(JISX0213String.isValid("\u9BDF"));	// 鯟
        assertEquals(JISX0213String.length("\u9BDF"), 1);
        assertFalse(JISX0213String.isValid("\u9BF9"));	// 鯹
        assertEquals(JISX0213String.length("\u9BF9"), 1);
        assertFalse(JISX0213String.isValid("\u9BFF"));	// 鯿
        assertEquals(JISX0213String.length("\u9BFF"), 1);
        assertFalse(JISX0213String.isValid("\u9C02"));	// 鰂
        assertEquals(JISX0213String.length("\u9C02"), 1);
        assertFalse(JISX0213String.isValid("\u9C0B"));	// 鰋
        assertEquals(JISX0213String.length("\u9C0B"), 1);
        assertFalse(JISX0213String.isValid("\u9C0F"));	// 鰏
        assertEquals(JISX0213String.length("\u9C0F"), 1);
        assertFalse(JISX0213String.isValid("\u9C11"));	// 鰑
        assertEquals(JISX0213String.length("\u9C11"), 1);
        assertFalse(JISX0213String.isValid("\u9C1C"));	// 鰜
        assertEquals(JISX0213String.length("\u9C1C"), 1);
        assertFalse(JISX0213String.isValid("\u9C1E"));	// 鰞
        assertEquals(JISX0213String.length("\u9C1E"), 1);
        assertFalse(JISX0213String.isValid("\u9C26"));	// 鰦
        assertEquals(JISX0213String.length("\u9C26"), 1);
        assertFalse(JISX0213String.isValid("\u9C28"));	// 鰨
        assertEquals(JISX0213String.length("\u9C28"), 1);
        assertFalse(JISX0213String.isValid("\u9C35"));	// 鰵
        assertEquals(JISX0213String.length("\u9C35"), 1);
        assertFalse(JISX0213String.isValid("\u9C3D"));	// 鰽
        assertEquals(JISX0213String.length("\u9C3D"), 1);
        assertFalse(JISX0213String.isValid("\u9C43"));	// 鱃
        assertEquals(JISX0213String.length("\u9C43"), 1);
        assertFalse(JISX0213String.isValid("\u9C44"));	// 鱄
        assertEquals(JISX0213String.length("\u9C44"), 1);
        assertFalse(JISX0213String.isValid("\u9C4E"));	// 鱎
        assertEquals(JISX0213String.length("\u9C4E"), 1);
        assertFalse(JISX0213String.isValid("\u9C56"));	// 鱖
        assertEquals(JISX0213String.length("\u9C56"), 1);
        assertFalse(JISX0213String.isValid("\u9C5E"));	// 鱞
        assertEquals(JISX0213String.length("\u9C5E"), 1);
        assertFalse(JISX0213String.isValid("\u9C68"));	// 鱨
        assertEquals(JISX0213String.length("\u9C68"), 1);
        assertFalse(JISX0213String.isValid("\u9C7B"));	// 鱻
        assertEquals(JISX0213String.length("\u9C7B"), 1);
        assertFalse(JISX0213String.isValid("\u9CF7"));	// 鳷
        assertEquals(JISX0213String.length("\u9CF7"), 1);
        assertFalse(JISX0213String.isValid("\u9CF9"));	// 鳹
        assertEquals(JISX0213String.length("\u9CF9"), 1);
        assertFalse(JISX0213String.isValid("\u9D1C"));	// 鴜
        assertEquals(JISX0213String.length("\u9D1C"), 1);
        assertFalse(JISX0213String.isValid("\u9D2F"));	// 鴯
        assertEquals(JISX0213String.length("\u9D2F"), 1);
        assertFalse(JISX0213String.isValid("\u9D30"));	// 鴰
        assertEquals(JISX0213String.length("\u9D30"), 1);
        assertFalse(JISX0213String.isValid("\u9D33"));	// 鴳
        assertEquals(JISX0213String.length("\u9D33"), 1);
        assertFalse(JISX0213String.isValid("\u9D34"));	// 鴴
        assertEquals(JISX0213String.length("\u9D34"), 1);
        assertFalse(JISX0213String.isValid("\u9D3A"));	// 鴺
        assertEquals(JISX0213String.length("\u9D3A"), 1);
        assertFalse(JISX0213String.isValid("\u9D3C"));	// 鴼
        assertEquals(JISX0213String.length("\u9D3C"), 1);
        assertFalse(JISX0213String.isValid("\u9D45"));	// 鵅
        assertEquals(JISX0213String.length("\u9D45"), 1);
        assertFalse(JISX0213String.isValid("\u9D3D"));	// 鴽
        assertEquals(JISX0213String.length("\u9D3D"), 1);
        assertFalse(JISX0213String.isValid("\u9D53"));	// 鵓
        assertEquals(JISX0213String.length("\u9D53"), 1);
        assertFalse(JISX0213String.isValid("\u9D54"));	// 鵔
        assertEquals(JISX0213String.length("\u9D54"), 1);
        assertFalse(JISX0213String.isValid("\u9D65"));	// 鵥
        assertEquals(JISX0213String.length("\u9D65"), 1);
        assertFalse(JISX0213String.isValid("\u9D6A"));	// 鵪
        assertEquals(JISX0213String.length("\u9D6A"), 1);
        assertFalse(JISX0213String.isValid("\u9D7B"));	// 鵻
        assertEquals(JISX0213String.length("\u9D7B"), 1);
        assertFalse(JISX0213String.isValid("\u9D83"));	// 鶃
        assertEquals(JISX0213String.length("\u9D83"), 1);
        assertFalse(JISX0213String.isValid("\u9D86"));	// 鶆
        assertEquals(JISX0213String.length("\u9D86"), 1);
        assertFalse(JISX0213String.isValid("\u9D8E"));	// 鶎
        assertEquals(JISX0213String.length("\u9D8E"), 1);
        assertFalse(JISX0213String.isValid("\u9D92"));	// 鶒
        assertEquals(JISX0213String.length("\u9D92"), 1);
        assertFalse(JISX0213String.isValid("\u9D93"));	// 鶓
        assertEquals(JISX0213String.length("\u9D93"), 1);
        assertFalse(JISX0213String.isValid("\u9D95"));	// 鶕
        assertEquals(JISX0213String.length("\u9D95"), 1);
        assertFalse(JISX0213String.isValid("\u9D97"));	// 鶗
        assertEquals(JISX0213String.length("\u9D97"), 1);
        assertFalse(JISX0213String.isValid("\u9D98"));	// 鶘
        assertEquals(JISX0213String.length("\u9D98"), 1);
        assertFalse(JISX0213String.isValid("\u9DAA"));	// 鶪
        assertEquals(JISX0213String.length("\u9DAA"), 1);
        assertFalse(JISX0213String.isValid("\u9DAE"));	// 鶮
        assertEquals(JISX0213String.length("\u9DAE"), 1);
        assertFalse(JISX0213String.isValid("\u9DB1"));	// 鶱
        assertEquals(JISX0213String.length("\u9DB1"), 1);
        assertFalse(JISX0213String.isValid("\u9DCA"));	// 鷊
        assertEquals(JISX0213String.length("\u9DCA"), 1);
        assertFalse(JISX0213String.isValid("\u9DD4"));	// 鷔
        assertEquals(JISX0213String.length("\u9DD4"), 1);
        assertFalse(JISX0213String.isValid("\u9DD5"));	// 鷕
        assertEquals(JISX0213String.length("\u9DD5"), 1);
        assertFalse(JISX0213String.isValid("\u9DDE"));	// 鷞
        assertEquals(JISX0213String.length("\u9DDE"), 1);
        assertFalse(JISX0213String.isValid("\u9DE5"));	// 鷥
        assertEquals(JISX0213String.length("\u9DE5"), 1);
        assertFalse(JISX0213String.isValid("\u9DE9"));	// 鷩
        assertEquals(JISX0213String.length("\u9DE9"), 1);
        assertFalse(JISX0213String.isValid("\u9DEB"));	// 鷫
        assertEquals(JISX0213String.length("\u9DEB"), 1);
        assertFalse(JISX0213String.isValid("\u9DEE"));	// 鷮
        assertEquals(JISX0213String.length("\u9DEE"), 1);
        assertFalse(JISX0213String.isValid("\u9DF0"));	// 鷰
        assertEquals(JISX0213String.length("\u9DF0"), 1);
        assertFalse(JISX0213String.isValid("\u9DF3"));	// 鷳
        assertEquals(JISX0213String.length("\u9DF3"), 1);
        assertFalse(JISX0213String.isValid("\u9DFE"));	// 鷾
        assertEquals(JISX0213String.length("\u9DFE"), 1);
        assertFalse(JISX0213String.isValid("\u9E0E"));	// 鸎
        assertEquals(JISX0213String.length("\u9E0E"), 1);
        assertFalse(JISX0213String.isValid("\u9E10"));	// 鸐
        assertEquals(JISX0213String.length("\u9E10"), 1);
        assertFalse(JISX0213String.isValid("\u9E11"));	// 鸑
        assertEquals(JISX0213String.length("\u9E11"), 1);
        assertFalse(JISX0213String.isValid("\u9E12"));	// 鸒
        assertEquals(JISX0213String.length("\u9E12"), 1);
        assertFalse(JISX0213String.isValid("\u9E16"));	// 鸖
        assertEquals(JISX0213String.length("\u9E16"), 1);
        assertFalse(JISX0213String.isValid("\u9E7A"));	// 鹺
        assertEquals(JISX0213String.length("\u9E7A"), 1);
        assertFalse(JISX0213String.isValid("\u9E82"));	// 麂
        assertEquals(JISX0213String.length("\u9E82"), 1);
        assertFalse(JISX0213String.isValid("\u9E83"));	// 麃
        assertEquals(JISX0213String.length("\u9E83"), 1);
        assertFalse(JISX0213String.isValid("\u9E84"));	// 麄
        assertEquals(JISX0213String.length("\u9E84"), 1);
        assertFalse(JISX0213String.isValid("\u9E87"));	// 麇
        assertEquals(JISX0213String.length("\u9E87"), 1);
        assertFalse(JISX0213String.isValid("\u9E8E"));	// 麎
        assertEquals(JISX0213String.length("\u9E8E"), 1);
        assertFalse(JISX0213String.isValid("\u9E8F"));	// 麏
        assertEquals(JISX0213String.length("\u9E8F"), 1);
        assertFalse(JISX0213String.isValid("\u9E96"));	// 麖
        assertEquals(JISX0213String.length("\u9E96"), 1);
        assertFalse(JISX0213String.isValid("\u9E98"));	// 麘
        assertEquals(JISX0213String.length("\u9E98"), 1);
        assertFalse(JISX0213String.isValid("\u9EAE"));	// 麮
        assertEquals(JISX0213String.length("\u9EAE"), 1);
        assertFalse(JISX0213String.isValid("\u9EB0"));	// 麰
        assertEquals(JISX0213String.length("\u9EB0"), 1);
        assertFalse(JISX0213String.isValid("\u9EB3"));	// 麳
        assertEquals(JISX0213String.length("\u9EB3"), 1);
        assertFalse(JISX0213String.isValid("\u9EC6"));	// 黆
        assertEquals(JISX0213String.length("\u9EC6"), 1);
        assertFalse(JISX0213String.isValid("\u9EC8"));	// 黈
        assertEquals(JISX0213String.length("\u9EC8"), 1);
        assertFalse(JISX0213String.isValid("\u9ECB"));	// 黋
        assertEquals(JISX0213String.length("\u9ECB"), 1);
        assertFalse(JISX0213String.isValid("\u9ED5"));	// 黕
        assertEquals(JISX0213String.length("\u9ED5"), 1);
        assertFalse(JISX0213String.isValid("\u9EE4"));	// 黤
        assertEquals(JISX0213String.length("\u9EE4"), 1);
        assertFalse(JISX0213String.isValid("\u9EEC"));	// 黬
        assertEquals(JISX0213String.length("\u9EEC"), 1);
        assertFalse(JISX0213String.isValid("\u9EED"));	// 黭
        assertEquals(JISX0213String.length("\u9EED"), 1);
        assertFalse(JISX0213String.isValid("\u9EF0"));	// 黰
        assertEquals(JISX0213String.length("\u9EF0"), 1);
        assertFalse(JISX0213String.isValid("\u9EF1"));	// 黱
        assertEquals(JISX0213String.length("\u9EF1"), 1);
        assertFalse(JISX0213String.isValid("\u9EF2"));	// 黲
        assertEquals(JISX0213String.length("\u9EF2"), 1);
        assertFalse(JISX0213String.isValid("\u9EF5"));	// 黵
        assertEquals(JISX0213String.length("\u9EF5"), 1);
        assertFalse(JISX0213String.isValid("\u9EF8"));	// 黸
        assertEquals(JISX0213String.length("\u9EF8"), 1);
        assertFalse(JISX0213String.isValid("\u9F09"));	// 鼉
        assertEquals(JISX0213String.length("\u9F09"), 1);
        assertFalse(JISX0213String.isValid("\u9F0F"));	// 鼏
        assertEquals(JISX0213String.length("\u9F0F"), 1);
        assertFalse(JISX0213String.isValid("\u9F11"));	// 鼑
        assertEquals(JISX0213String.length("\u9F11"), 1);
        assertFalse(JISX0213String.isValid("\u9F12"));	// 鼒
        assertEquals(JISX0213String.length("\u9F12"), 1);
        assertFalse(JISX0213String.isValid("\u9F14"));	// 鼔
        assertEquals(JISX0213String.length("\u9F14"), 1);
        assertFalse(JISX0213String.isValid("\u9F16"));	// 鼖
        assertEquals(JISX0213String.length("\u9F16"), 1);
        assertFalse(JISX0213String.isValid("\u9F1A"));	// 鼚
        assertEquals(JISX0213String.length("\u9F1A"), 1);
        assertFalse(JISX0213String.isValid("\u9F1B"));	// 鼛
        assertEquals(JISX0213String.length("\u9F1B"), 1);
        assertFalse(JISX0213String.isValid("\u9F1F"));	// 鼟
        assertEquals(JISX0213String.length("\u9F1F"), 1);
        assertFalse(JISX0213String.isValid("\u9F22"));	// 鼢
        assertEquals(JISX0213String.length("\u9F22"), 1);
        assertFalse(JISX0213String.isValid("\u9F26"));	// 鼦
        assertEquals(JISX0213String.length("\u9F26"), 1);
        assertFalse(JISX0213String.isValid("\u9F2A"));	// 鼪
        assertEquals(JISX0213String.length("\u9F2A"), 1);
        assertFalse(JISX0213String.isValid("\u9F2B"));	// 鼫
        assertEquals(JISX0213String.length("\u9F2B"), 1);
        assertFalse(JISX0213String.isValid("\u9F31"));	// 鼱
        assertEquals(JISX0213String.length("\u9F31"), 1);
        assertFalse(JISX0213String.isValid("\u9F32"));	// 鼲
        assertEquals(JISX0213String.length("\u9F32"), 1);
        assertFalse(JISX0213String.isValid("\u9F34"));	// 鼴
        assertEquals(JISX0213String.length("\u9F34"), 1);
        assertFalse(JISX0213String.isValid("\u9F3C"));	// 鼼
        assertEquals(JISX0213String.length("\u9F3C"), 1);
        assertFalse(JISX0213String.isValid("\u9F3F"));	// 鼿
        assertEquals(JISX0213String.length("\u9F3F"), 1);
        assertFalse(JISX0213String.isValid("\u9F43"));	// 齃
        assertEquals(JISX0213String.length("\u9F43"), 1);
        assertFalse(JISX0213String.isValid("\u9F44"));	// 齄
        assertEquals(JISX0213String.length("\u9F44"), 1);
        assertFalse(JISX0213String.isValid("\u9F47"));	// 齇
        assertEquals(JISX0213String.length("\u9F47"), 1);
        assertFalse(JISX0213String.isValid("\u9F56"));	// 齖
        assertEquals(JISX0213String.length("\u9F56"), 1);
        assertFalse(JISX0213String.isValid("\u9F5A"));	// 齚
        assertEquals(JISX0213String.length("\u9F5A"), 1);
        assertFalse(JISX0213String.isValid("\u9F5E"));	// 齞
        assertEquals(JISX0213String.length("\u9F5E"), 1);
        assertFalse(JISX0213String.isValid("\u9F68"));	// 齨
        assertEquals(JISX0213String.length("\u9F68"), 1);
        assertFalse(JISX0213String.isValid("\u9F6E"));	// 齮
        assertEquals(JISX0213String.length("\u9F6E"), 1);
        assertFalse(JISX0213String.isValid("\u9F6F"));	// 齯
        assertEquals(JISX0213String.length("\u9F6F"), 1);
        assertFalse(JISX0213String.isValid("\u9F71"));	// 齱
        assertEquals(JISX0213String.length("\u9F71"), 1);
        assertFalse(JISX0213String.isValid("\u9F73"));	// 齳
        assertEquals(JISX0213String.length("\u9F73"), 1);
        assertFalse(JISX0213String.isValid("\u9F7A"));	// 齺
        assertEquals(JISX0213String.length("\u9F7A"), 1);
        assertFalse(JISX0213String.isValid("\u9F7D"));	// 齽
        assertEquals(JISX0213String.length("\u9F7D"), 1);
        assertFalse(JISX0213String.isValid("\u9F8F"));	// 龏
        assertEquals(JISX0213String.length("\u9F8F"), 1);
        assertFalse(JISX0213String.isValid("\u9F91"));	// 龑
        assertEquals(JISX0213String.length("\u9F91"), 1);
        assertFalse(JISX0213String.isValid("\u9F92"));	// 龒
        assertEquals(JISX0213String.length("\u9F92"), 1);
        assertFalse(JISX0213String.isValid("\u9F96"));	// 龖
        assertEquals(JISX0213String.length("\u9F96"), 1);
        assertFalse(JISX0213String.isValid("\u9F9E"));	// 龞
        assertEquals(JISX0213String.length("\u9F9E"), 1);
        assertFalse(JISX0213String.isValid("\u9FA1"));	// 龡
        assertEquals(JISX0213String.length("\u9FA1"), 1);
        assertFalse(JISX0213String.isValid("\u9FA3"));	// 龣
        assertEquals(JISX0213String.length("\u9FA3"), 1);
        assertFalse(JISX0213String.isValid("\u9FA5"));	// 龥
        assertEquals(JISX0213String.length("\u9FA5"), 1);
    }
}