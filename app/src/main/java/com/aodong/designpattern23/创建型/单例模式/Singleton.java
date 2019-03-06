package com.aodong.designpattern23.创建型.单例模式;

/**
 * 懒汉式：
 *
 *  懒加载、线程不安全
 * Created by pcl on 2018/12/12
 */
public class Singleton {

    private static Singleton sSingleton =  null;
    private Singleton(){}

    //多线程不能正常工作，有线程安全问题
    public static Singleton getSingleton(){
        if (sSingleton == null){
            sSingleton = new Singleton();
        }
        return sSingleton;
    }
}
