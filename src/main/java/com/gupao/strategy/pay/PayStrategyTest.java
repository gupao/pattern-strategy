package com.gupao.strategy.pay;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

/**
 * created by xuyahui on 2019/3/23
 */
public class PayStrategyTest {

    public static void main(String[] args) {

        Order order = new Order("uid_1","2019032301",1600);

        System.out.println(order.pay());

        System.out.println("-------------------");

        System.out.println(order.pay(PayStrategy.JD_PAY));

    }

}
