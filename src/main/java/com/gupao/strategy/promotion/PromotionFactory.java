package com.gupao.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * created by xuyahui on 2019/3/22
 */
public class PromotionFactory {

    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new GroupbuyStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY,new GroupbuyStrategy());
    }

    private static final PromotionStrategy NON_PROMOTION= new EmptyStrategy();

    public PromotionFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotion){
        PromotionStrategy strategy = PROMOTION_STRATEGY_MAP.get(promotion);
        return strategy == null ? NON_PROMOTION : strategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }
}
