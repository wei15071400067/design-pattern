package com.wei.design.observer.inter.impl;

import com.wei.design.observer.inter.Observer;
import com.wei.design.observer.inter.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 主题实现
 * @Author: weiyan
 * @CreateDate: 2020/6/2
 */
public class SubjectImpl implements Subject {

    List<Observer> observers = new ArrayList<>();
    /**
     * 注册观察者
     * @param o  需要注册的观察者
     * @return 返回注册是否成功
     */
    @Override
    public boolean register(Observer o) {
        return observers.add(o);
    }

    /**
     * 删除观察者
     * @param o  待删除观察者
     * @return  返回删除是否成功
     */
    @Override
    public boolean remove(Observer o) {
        return observers.remove(o);
    }

    /**
     * 主题改变时调用
     */
    @Override
    public void doNotify() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
