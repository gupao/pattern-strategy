package com.gupao.strategy.pay;

/**
 * created by xuyahui on 2019/3/23
 */
public class UnionPay extends Payment{
    @Override
    public String getName() {
        return "银联";
    }

    @Override
    public double queryBalance(String uid) {
        return 300;
    }
}
