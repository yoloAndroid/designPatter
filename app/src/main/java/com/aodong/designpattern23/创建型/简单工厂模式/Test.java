package com.aodong.designpattern23.创建型.简单工厂模式;

import com.aodong.designpattern23.创建型.简单工厂模式.factory.OperationFactory;
import com.aodong.designpattern23.创建型.简单工厂模式.operation.Operation;

/**
 * 简单工厂模式：
 *
 *      当你需要什么，只需要传入一个正确的参数，就可以获取你所需要的对象，而无需知道其创建的细节。
 *      不属于23种GOF设计模式之一。
 *
 *
 *      定义一个Factory类，可以根据参数的不同返回不同类的实例，被创建的实例通常有共同的父类。
 *      又称为静态工厂模式（Static Factory Pattern），Factory类为静态类或包含静态方法。
 *      实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类实例。
 *
 * 参与者：
 *      1. Product：             抽象产品角色，将具体产品类公共的代码进行抽象和提取后封装在一个抽象产品类中
 *      2. ConcreteProduct：     具体产品角色，将需要创建的各种不同产品对象的相关代码封装到具体产品类中
 *      3. Factory：             工厂角色，提供一个工厂类用于创建各种产品，在工厂类中提供一个创建产品的工厂方法，该方法可以根据所传入参数的不同创建不同的具体产品对象。
 *      4. Client：              客户端角色，只需调用工厂类的工厂方法并传入相应的参数即可得到一个产品对象。
 *
 * 好处：
 *
 *      1. 实现创建和使用分离
 *      2. Client 无需知道所创建的 ConcreteProduct 类名，只需要知道 ConcreteProduct 所对应的参数。
 *
 * 缺点：
 *
 *      1. Factory类集中所有ConcreteProduct的创建逻辑，职责过重。一旦需要添加新的ConcreteProduct，则需要修改Factory逻辑。这样违背了OCP（开放-关闭原则）
 *      2. 由于使用了static方法，造成Factory无法形成基于继承的结构。
 *
 *
 * 当前计算业务逻辑的好处：
 *
 *      如果有一天修改加法运算：只需要修改 OperationAdd 类
 *      如果有一天需要增加各种复杂运算，比如平方根只需要增加相应的子类，并在 OperationFactory 类 增加分支
 *      如果要修改界面，这里的运算业务逻辑不需要改动，因为做到了业务和视图和分离
 *
 *
 * 这种类型的设计模式属于创建模式，因为此模式提供了创建对象的最佳方法之一。
 * 在工厂模式中，我们没有创建逻辑暴露给客户端创建对象，并使用一个通用的接口（父类）引用新创建的对象。
 *
 *
 * 应用场景：
 *
 *      当需要根据一定的逻辑，创建一个抽象接口的一系统对象时；
 *      工厂类负责创建的对象比较少；
 *      客户只知道传入工厂类的参数，对于如何创建对象（逻辑）不关心；
 *      由于简单工厂很容易违反高内聚责任分配原则，因此一般只在很简单的情况下应用。（这些缺点在工厂方法模式中得到了一定的克服。）
 *
 * 总结：
 *
 *      简单工厂模式最大的优点在于实现对象的创建和对象的使用分离，将对象的创建交给专门的工厂类负责，
 *      但是其最大的缺点在于工厂类不够灵活，增加新的具体产品需要修改工厂类的判断逻辑代码，而且产品较多时，工厂方法代码将会非常复杂。
 *
 *   简单工厂模式适用情况包括：工厂类负责创建的对象比较少；客户端只知道传入工厂类的参数，对于如何创建对象不关心。
 *
 *  参考：
 *      https://www.cnblogs.com/libingql/p/3887577.html
 *      http://www.sxt.cn/design_pattern/factory_pattern.html
 *      http://www.cnblogs.com/Bobby0322/p/4178412.html
 */
public class Test {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
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
