package com.wei.design.strategy.inter.impl;

import com.wei.design.strategy.inter.Strategy;

/**
 * @Description: java类作用描述
 * @Author: weiyan
 * @CreateDate: 2020/6/1
 */
public class StrategyImplSubtract implements Strategy {

    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
