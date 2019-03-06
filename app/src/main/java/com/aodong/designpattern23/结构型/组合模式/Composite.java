package com.aodong.designpattern23.结构型.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝节点：用于存储子部件，实现 Component 接口中与子部件有关的操作,比如增加和删除
 * Created by pcl on 2018/12/11
 */
public class Composite extends Component {

    //用于添加子节点的容器
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    void add(Component component) {
        children.add(component);
    }

    @Override
    void remove(Component component) {
        children.remove(component);
    }

    @Override
    void display(int depth) {       //显示其枝节点名称，并对其下级进行遍历
        System.out.println(depth + "---" + name);
        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
