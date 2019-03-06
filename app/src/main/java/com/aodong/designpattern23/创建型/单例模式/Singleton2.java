package com.aodong.designpattern23.创建型.单例模式;

/**
 * 懒汉式
 *
 *  懒加载、线程安全、效率低（频繁synchronized同步）
 * Created by pcl on 2018/12/12
 */
public class Singleton2 {

    private static Singleton2 sSingleton =  null;
    private Singleton2(){}

    //使用 synchronized 关键字来保证获取实例的线程安全
    //缺点也很明显：每次都需要去做锁校验，导致性能问题
    public static synchronized Singleton2 getSingleton(){
        if (sSingleton == null){
            sSingleton = new Singleton2();
        }
        return sSingleton;
    }
}
