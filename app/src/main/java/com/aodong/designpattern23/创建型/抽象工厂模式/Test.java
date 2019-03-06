package com.aodong.designpattern23.创建型.抽象工厂模式;

import com.aodong.designpattern23.创建型.抽象工厂模式.具体工厂.DellFactory;
import com.aodong.designpattern23.创建型.抽象工厂模式.具体工厂.LenovoFactory;
import com.aodong.designpattern23.创建型.抽象工厂模式.抽象工厂.AbstractComputerCreateFactory;

/**
 * 抽象工厂模式:
 *
 *  抽象工厂模式是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 *  在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 *
 *  意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类
 *  主要解决：接口选择的问题
 *  何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
 *  如何解决：在一个产品族里面，定义多个产品
 *  关键代码：在一个工厂里聚合多个同类产品
 *  应用实例：
 *
 *      联想和惠普生产的电脑分为了两个产品线，一个台式机，一个是笔记本。
 *      为了解决增加产品线的问题，我们用抽象工厂模式来进行实现。
 *
 *  优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 *  缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
 *  使用场景： 1、QQ 换皮肤，一整套一起换。 2、生成不同操作系统的程序。
 *
 *  注意事项：产品族难扩展，产品等级易扩展。
 *
 *  在抽象工厂模式中有如下角色：
 *  AbstractFactory：抽象工厂，它声明了用来创建不同产品的方法。
 *  ConcreteFactory：具体工厂，实现抽象工厂中定义的创建产品的方法。
 *  AbstractProduct：抽象产品，为每种产品声明业务方法。
 *  ConcreteProduct：具体产品，定义具体工厂生产的具体产品，并实现抽象产品中定义的业务方法。
 *
 *  https://juejin.im/post/59241ac0128fe1005c3f4400
 *
 *  优点
 *      具体类的创建实例过程与客户端分离，客户端通过工厂的抽象接口操纵实例，客户端并不知道具体的实现是谁。
 *
 *  缺点
 *      如果增加新的产品族则也需要修改抽象工厂和所有的具体工厂。
 *
 *  抽象工厂模式的使用场景:
 *
 *      一个系统不依赖于产品线实例如何被创建、组合和表达的细节。
 *      系统中有多于一个的产品线，而每次只使用其中某一产品线。
 *      一个产品线（或是一组没有任何关系的对象）拥有相同的约束。
 *
 * Created by pcl on 2018/12/7
 */
public class Test {

    public static void main(String[] args){

        AbstractComputerCreateFactory lenovoFactory = new LenovoFactory();
        lenovoFactory.createDesktopComputer().start();
        lenovoFactory.createNotebookComputer().start();


        AbstractComputerCreateFactory dellFactory = new DellFactory();
        dellFactory.createDesktopComputer().start();
        dellFactory.createNotebookComputer().start();


    }
}
