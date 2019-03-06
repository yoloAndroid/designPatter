package com.aodong.designpattern23.行为型.备忘录模式;

/**
 * 备忘录类
 *
 *  负责存储 Originator 的内部状态。
 * Created by pcl on 2018/12/10
 */
public class Memento {

    private String state;

    public String getState() {
        return state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
