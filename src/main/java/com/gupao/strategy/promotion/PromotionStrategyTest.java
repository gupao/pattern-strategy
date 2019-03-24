package com.gupao.strategy.promotion;

import org.apache.commons.lang3.StringUtils;

/**
 * created by xuyahui on 2019/3/22
 */
public class PromotionStrategyTest {

    public static void main(String[] args) {

//        PromotionActivity cashback = new PromotionActivity(new CashbackStrategy());
////        PromotionActivity groupbuy = new PromotionActivity(new GroupbuyStrategy());
////        cashback.execute();
////        groupbuy.execute();

        // 调用方式一
        PromotionActivity promotionActivity;
        String promotionKey = "COUPON";

        if(StringUtils.equals(promotionKey,"COUPON")){
            promotionActivity = new PromotionActivity(new CouponStrategy());
        }else if(StringUtils.equals(promotionKey,"CASHBACK")){
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }else if(StringUtils.equals(promotionKey,"GROUPBUY")){
            promotionActivity = new PromotionActivity(new GroupbuyStrategy());
        }else {
            promotionActivity = new PromotionActivity(new EmptyStrategy());
        }

        promotionActivity.execute();

        // 调用方式二
        promotionKey = "CASHBACK";
        PromotionActivity activity = new PromotionActivity(PromotionFactory.getPromotionStrategy(promotionKey));
        activity.execute();

    }

}
