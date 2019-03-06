package com.aodong.designpattern23.结构型.代理模式;

/**
 * 保存一个引用使得代理可以访问实体，并提供一个与 Subject 的接口相同的接口，这样代理（Proxy）就可以替代实体（RealSubject）
 * Created by pcl on 2018/11/28
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }

}
