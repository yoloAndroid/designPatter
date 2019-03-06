package com.aodong.designpattern23.结构型.代理模式;

/**
 * 定义 Proxy 所代表的真实实体
 * Created by pcl on 2018/11/28
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
