package com.mmall.test;

import org.junit.Test;

import java.math.BigDecimal;

public class BigDecimalTest {

    @Test
    public void test1() {
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);

        BigDecimal a = new BigDecimal("0.06");
        BigDecimal b = new BigDecimal("0.01");

        System.out.println(a.add(b));
    }
}
