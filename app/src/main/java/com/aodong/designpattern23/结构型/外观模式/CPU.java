package com.aodong.designpattern23.结构型.外观模式;

//SubSystem 子系统角色
public class CPU {
    public void startup() {
        System.out.println("cpu startup!");
    }

    public void shutdown() {
        System.out.println("cpu shutdown!");
    }
}