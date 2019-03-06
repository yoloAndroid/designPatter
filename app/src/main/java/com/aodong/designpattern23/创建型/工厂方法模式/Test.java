package com.aodong.designpattern23.创建型.工厂方法模式;

import com.aodong.designpattern23.创建型.工厂方法模式.factoryimpl.DivFactory;

/**
 * 要添加的话需要加一个具体实现类和一个相应工厂类
 *
 * 工厂方法模式是简单工厂模式的进一步抽象和推广。由于使用了多态性，工厂方法模式保持了简单工厂模式的优点，而且克服了它的缺点。
 * 但缺点是由于每增加一个产品，就需要加一个产品工厂的类，增加了额外的开发量。且没有避免修改客户端的创建代码
 *
 * 工厂方法模式是定义一个用于创建对象的接口，让子类决定实例化哪一个
 *
 * Created by pcl on 2018/11/28
 */
public class Test {
    public static void main(String[] args) {
        IFactory factory = new DivFactory();        //要修改的话只需要修改这一行
        Operation operation = factory.createOperation();
        operation.numberA = 1;
        operation.numberB = 2;
        try {
            double result = operation.getResult();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
