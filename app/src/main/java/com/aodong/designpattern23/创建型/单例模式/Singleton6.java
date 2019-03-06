package com.aodong.designpattern23.创建型.单例模式;

/**
 *
 * 这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * 枚举单例的优点就是简单，但是大部分应用开发很少用枚举，可读性并不是很高，不建议用。
 *
 * 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
 * Created by pcl on 2018/12/12
 */
public enum  Singleton6 {
    INSTANCE;

    public void doSomeThing() {
    }
}
