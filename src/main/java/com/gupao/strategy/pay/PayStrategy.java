package com.gupao.strategy.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * created by xuyahui on 2019/3/23
 */
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String WEICHAT_PAY = "WeichatPay";
    public static final String JD_PAY = "JDPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String,Payment> payMap = new HashMap<>();

    static {
        payMap.put(ALI_PAY,new AliPay());
        payMap.put(WEICHAT_PAY,new WeichatPay());
        payMap.put(JD_PAY,new JDpay());
        payMap.put(UNION_PAY,new UnionPay());
    }

    public static Payment get(String strategy){
        if(!payMap.containsKey(strategy)){
            return payMap.get(DEFAULT_PAY);
        }
        return payMap.get(strategy);
    }

}
