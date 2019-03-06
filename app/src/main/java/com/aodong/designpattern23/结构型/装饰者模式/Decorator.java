package com.aodong.designpattern23.结构型.装饰者模式;

/**
 *
 * 抽象装饰者： 其职责就是装饰我们的 Component 对象，通过其子类扩展该方法以达到装饰的目的。
 *
 * 其内部一定要有一个指向组件对象的引用。在大多数情况下，该类为抽象类，需要根据不同的装饰逻辑实现不同的具体子类。
 *
 */
public abstract class Decorator extends Component {

    protected Component component;

    //设置 Commonent，传递一个引用，目的是为了调用方法，这里当相于包装，把ConcrecteCompont包装起来。
    public void setComponent(Component component) {

        this.component = component;
    }

    @Override
    public void operation() {           //重写 operation() ，实际执行的是 Component 的 operation()
        if (component != null){
            component.operation();
        }
    }
}
