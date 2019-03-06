package com.aodong.designpattern23.结构型.装饰者模式;

/**
 *
 * 组件具体实现类：该类是 Component 类的基本实现，也是我们装饰的具体对象。
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("ConcreteComponent:  具体对象的操作");
    }
}
