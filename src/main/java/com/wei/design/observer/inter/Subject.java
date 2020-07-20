package com.wei.design.observer.inter;

/**
 * @Description: 主题接口
 * @Author: weiyan
  * @CreateDate: 2020/6/2
 */
public interface Subject {
    //注册
    boolean register(Observer o);

    //删除
    boolean remove(Observer o);

    //改变主题时
    void doNotify();
}
