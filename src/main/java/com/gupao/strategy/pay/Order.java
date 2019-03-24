package com.gupao.strategy.pay;

/**
 * created by xuyahui on 2019/3/23
 */
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public PayState pay(String payType){
        Payment payment = PayStrategy.get(payType);
        System.out.println("欢迎使用" + payment.getName() + "支付!");
        System.out.println("本次交易金额：" + amount +",开始扣款……");
        return payment.pay(uid,amount);
    }
}
