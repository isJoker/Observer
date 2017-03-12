package com.jokerwan.observer;

import com.jokerwan.observer.observer.ASubject;

/**
 * Created by ${JokerWan} on 2017/3/12.
 * WeChat：wjc398556712
 * Function：具体的被观察者
 */

public class ConcreteSubject extends ASubject {

    private static ConcreteSubject observerable;

    //单例
    public static ConcreteSubject getInstance(){
        if(null == observerable) {
            synchronized (ASubject.class){
                if( null == observerable) {
                    observerable = new ConcreteSubject();
                }
            }
        }
        return observerable;
    }


    @Override
    public void operation() {
        notifyObservers("数据被刷新了");
    }
}
