package com.gupao.strategy.promotion;

/**
 * created by xuyahui on 2019/3/22
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("没有优化活动，原价。");
    }
}
