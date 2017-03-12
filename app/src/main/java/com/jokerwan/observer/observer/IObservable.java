package com.jokerwan.observer.observer;

/**
 * Created by ${JokerWan} on 2017/3/11.
 * WeChat：wjc398556712
 * Function：主体（被观察者）接口
 */

public interface IObservable {

    //增加观察者
    void addObserver(IObserver observer);

    //删除观察者
    void remove(IObserver observer);

    //通知所有的观察者
    void notifyObservers(String content);

    //自身的操作
    void operation(String content);
}
