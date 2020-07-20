package com.wei.design.strategy.inter.impl;

import com.wei.design.strategy.inter.Strategy;

import java.math.BigDecimal;

/**
 * @Description: java类作用描述
 * @Author: weiyan
 * @CreateDate: 2020/6/1
 */
public class StrategyImplDivide implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        BigDecimal aBig = new BigDecimal(a);
        BigDecimal bBig = new BigDecimal(b);
        return aBig.divide(bBig,0,0).intValue();
    }
}
