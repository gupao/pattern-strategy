package com.gupao.strategy.pay;

/**
 * created by xuyahui on 2019/3/23
 */
public class AliPay extends Payment{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 10000;
    }
}
