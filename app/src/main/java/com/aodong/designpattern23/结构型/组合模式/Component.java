package com.aodong.designpattern23.结构型.组合模式;

/**
 * 抽象构件：声明枝节点和叶子节点的共有行为及相关操作
 *
 * 通常都是用 Add 和 Remove 方法来提供增加和移除树叶或树枝的功能
 * Created by pcl on 2018/12/11
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    //添加树枝或树叶
    abstract void add(Component component);
    //移除树枝或树叶
    abstract void remove(Component component);
    //叶节点的具体方法，此处是显示其名称和级别
    abstract void display(int depth);
}
