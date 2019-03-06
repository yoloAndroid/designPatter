package com.aodong.designpattern23.结构型.装饰者模式;

/**
 * Created by pcl on 2018/11/23
 */
public class Test {

    public static void main(String[] args) {

        ConcreteComponent component = new ConcreteComponent();      //原有核心职责
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();           //装饰A
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();           //装饰B

        d1.setComponent(component);
        d2.setComponent(d1);
        d2.operation();

//        打印
//        ConcreteComponent:  具体对象的操作
//        ConcreteDecoratorA: 具体装饰对象A的操作
//        ConcreteDecoratorB: 具体装饰对象B的操作

    }
}
