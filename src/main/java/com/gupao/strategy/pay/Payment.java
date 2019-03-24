package com.gupao.strategy.pay;

/**
 * 支付抽象类
 *
 * created by xuyahui on 2019/3/23
 */
public abstract class Payment {

    public abstract String getName();//  获取支付方式名称

    public abstract double queryBalance(String uid);// 查询余额

    public PayState pay(String uid,double amount){
        if(queryBalance(uid) < amount){
            return new PayState(500,"支付失败","余额不足");
        }
        return new PayState(200,"支付成功","支付金额"+amount);
    }



}
