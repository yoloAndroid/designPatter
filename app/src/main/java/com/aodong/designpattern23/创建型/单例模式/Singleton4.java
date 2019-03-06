package com.aodong.designpattern23.创建型.单例模式;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * <p>
 * 懒加载、线程安全、双锁机制在多线程情况下能保持高性能
 * <p>
 * 缺点是第一次加载时反应稍慢一些，在高并发环境下也有一定的缺陷，虽然发生的概率很小。DCL虽然在一定程度解决了资源的消耗和多余的同步，线程安全等问题，但是他还是在某些情况会出现失效的问题，也就是DCL失效，在《java并发编程实践》一书建议用静态内部类单例模式来替代DCL。
 * <p>
 * Created by pcl on 2018/12/12
 * <p>
 * https://blog.csdn.net/itachi85/article/details/50274169
 */
public class Singleton4 {

    private volatile static Singleton4 sSingleton = null;

    private Singleton4() {
    }

    public static Singleton4 getSingleton() {
        if (sSingleton == null) {            //避免不必要的同步
            synchronized (Singleton4.class) {
                if (sSingleton == null) {
                    sSingleton = new Singleton4();
                }
            }
        }
        return sSingleton;
    }

}
