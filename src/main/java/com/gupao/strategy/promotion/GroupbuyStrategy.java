package com.gupao.strategy.promotion;

/**
 * created by xuyahui on 2019/3/22
 */
public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("团购优惠，5人团购打8折。");
    }
}
