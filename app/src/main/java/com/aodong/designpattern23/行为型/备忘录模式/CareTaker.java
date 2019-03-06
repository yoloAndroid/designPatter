package com.aodong.designpattern23.行为型.备忘录模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者类：
 *
 * 负责从 Memento 中恢复对象的状态。
 * Created by pcl on 2018/12/10
 */
public class CareTaker {

    private List<Memento> list = new ArrayList<>();

    public void add(Memento memento) {
        list.add(memento);
    }

    public Memento get(int index) {
        return list.get(index);
    }
}
