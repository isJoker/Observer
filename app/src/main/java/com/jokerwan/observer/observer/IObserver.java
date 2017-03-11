package com.jokerwan.observer.observer;

/**
 * Created by ${JokerWan} on 2017/3/11.
 * WeChat：wjc398556712
 * Function：观察者接口
 */

public interface IObserver {
    //刷新数据
    void update(String content);
}
