package com.gupao.strategy.promotion;

/**
 * created by xuyahui on 2019/3/22
 */
public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券抵扣");
    }
}
