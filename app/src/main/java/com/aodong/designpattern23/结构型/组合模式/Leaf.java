package com.aodong.designpattern23.结构型.组合模式;

/**
 * 叶节点对象，叶节点对象没有子节点
 *
 * 记住一点：组合模式---树形结构
 * Created by pcl on 2018/12/11
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    void add(Component component) {
        System.out.println("叶子节点不能添加");
    }

    @Override
    void remove(Component component) {
        System.out.println("叶子节点不能移除");
    }

    @Override
    void display(int depth) {
        System.out.println(depth + "---" + name);
    }
}
