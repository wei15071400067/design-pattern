package com.wei.design.strategy;

import com.wei.design.strategy.inter.Strategy;

/**
 * @Description: java类作用描述
 * @Author: weiyan
 * @CreateDate: 2020/6/1
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
