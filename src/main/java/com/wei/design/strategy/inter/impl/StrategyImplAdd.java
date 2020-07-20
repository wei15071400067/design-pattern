package com.wei.design.strategy.inter.impl;

import com.wei.design.strategy.inter.Strategy;

/**
 * @Description: 实现策略接口，行为为加
 * @Author: weiyan
 * @CreateDate: 2019/6/8
 */
public class StrategyImplAdd implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
