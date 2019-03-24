package com.gupao.strategy.pay;

/**
 * created by xuyahui on 2019/3/23
 */
public class JDpay extends Payment{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    public double queryBalance(String uid) {
        return 800;
    }
}
