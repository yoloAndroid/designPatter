package com.aodong.designpattern23.创建型.单例模式;

/**
 * 饿汉式
 *
 * 非懒加载、没加锁效率高、类加载时就初始化浪费内存。
 * Created by pcl on 2018/12/12
 */
public class Singleton3 {

    private static Singleton3 sSingleton =  new Singleton3();

    private Singleton3(){}

    public static Singleton3 getSingleton(){
        return sSingleton;
    }
}
