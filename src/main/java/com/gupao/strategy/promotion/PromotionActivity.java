package com.gupao.strategy.promotion;

/**
 * created by xuyahui on 2019/3/22
 */
public class PromotionActivity {

    private PromotionStrategy strategy;

    public PromotionActivity(PromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doPromotion();
    }

}
