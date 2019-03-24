package com.gupao.strategy.pay;

/**
 * created by xuyahui on 2019/3/23
 */
public class WeichatPay extends Payment{
    @Override
    public String getName() {
        return "微信";
    }

    @Override
    public double queryBalance(String uid) {
        return 5000;
    }
}
