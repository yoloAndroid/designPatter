package com.aodong.designpattern23.结构型.外观模式;

/**
 *
 * 外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
 *
 * 这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。
 * http://www.runoob.com/design-pattern/facade-pattern.html
 * http://www.runoob.com/w3cnote/facade-pattern-2.html
 *
 * 作用：
 *
 * 松散耦合，外观模式松散了客户端与子系统的耦合关系，让子系统内部的模块能更容易扩展和维护。
 *
 * 简单易用，外观模式让子系统更加易用，客户端不再需要了解子系统内部的实现，也不需要跟众多子系统内部的模块进行交互，只需要跟门面类交互就可以了。
 *
 * 更好的划分访问层次-通过合理使用 Facade，可以帮助我们更好地划分访问的层次。有些方法是对系统外的，有些方法是系统内部使用的。把需要暴露给外部的功能集中到门面中，这样既方便客户端使用，也很好地隐藏了内部的细节。
 *
 * 外观模式的角色：
 *
 * SubSystem: 子系统角色。表示一个系统的子系统或模块。
 *
 * Facade: 外观角色，客户端通过操作外观角色从而达到控制子系统角色的目的。对于客户端来说，外观角色好比一道屏障，对客户端屏蔽了子系统的具体实现
 *
 *
 * Created by pcl on 2018/12/2
 */
public class TestFacadePattern {

    public static void main(String[] args){

        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
