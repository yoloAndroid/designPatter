package com.aodong.designpattern23.结构型.代理模式;

/**
 * 定义了 RealSubject 和 Proxy 的共有接口，这样就可以在任何使用 RealSubject 的地方都可以使用 Proxy。
 * Created by pcl on 2018/11/28
 */
public interface Subject {
    void request();
}
