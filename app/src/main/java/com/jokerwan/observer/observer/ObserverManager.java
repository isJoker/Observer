package com.jokerwan.observer.observer;

import java.util.ArrayList;

/**
 * Created by ${JokerWan} on 2017/3/11.
 * WeChat：wjc398556712
 * Function：管理所有的观察者
 */

public class ObserverManager implements Subject {

    private static ObserverManager observerManager;
    //观察者的集合
    private ArrayList<IObserver> observers = new ArrayList<>();

    //单例
    public static ObserverManager getInstance(){
        if(null == observerManager) {
            synchronized (ObserverManager.class){
                if( null == observerManager) {
                    observerManager = new ObserverManager();
                }
            }
        }
        return observerManager;
    }

    //添加观察者到集合
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    //从集合中删除观察者
    @Override
    public void remove(IObserver observer) {
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    //通知所有的观察者
    @Override
    public void notifyObservers(String content) {
        for (IObserver observer : observers) {
            observer.update(content);
        }
    }
}
