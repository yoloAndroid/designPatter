package com.aodong.designpattern23.结构型.装饰者模式;

/**
 * 抽象组件：可以是一个接口或抽象类，其充当的就是被装饰的原始对象。
 */
public abstract class Component {

    //给对象动态的添加职责。
    public abstract void operation();

}
