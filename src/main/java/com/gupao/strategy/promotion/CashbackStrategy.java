package com.gupao.strategy.promotion;

/**
 * created by xuyahui on 2019/3/22
 */
public class CashbackStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现金优惠，满1000减200.");
    }
}
