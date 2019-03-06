package com.aodong.designpattern23.结构型.装饰者模式;

/**
 * 装饰者具体实现类B。负责向构件（Component）添加新的职责。
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        /**
         *  首先运行原 Component 的 operation()方法，
         *  再执行本类的功能，如addedState，相当于对原 Component 进行了装饰
         */
        super.operation();
        addedBehavior();
        System.out.println("ConcreteDecoratorB: 具体装饰对象B的操作");
    }

    //本类的独有功能，以区别于 ConcreteDecoratorA
    private void addedBehavior() {

    }


}
