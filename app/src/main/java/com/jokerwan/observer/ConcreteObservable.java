package com.jokerwan.observer;

import com.jokerwan.observer.observer.AObservable;

/**
 * Created by ${JokerWan} on 2017/3/12.
 * WeChat：wjc398556712
 * Function：具体的被观察者
 */

public class ConcreteObservable extends AObservable {

    private static ConcreteObservable observable;

    //单例
    public static ConcreteObservable getInstance(){
        if(null == observable) {
            synchronized (AObservable.class){
                if( null == observable) {
                    observable = new ConcreteObservable();
                }
            }
        }
        return observable;
    }


    @Override
    public void operation(String content) {
        notifyObservers(content);
    }
}
