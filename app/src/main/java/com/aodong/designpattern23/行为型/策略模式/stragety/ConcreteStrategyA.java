package com.aodong.designpattern23.行为型.策略模式.stragety;

/**
 * 具体算法A，封装了具体的算法和行为，继承于 Strategy
 */
public class ConcreteStrategyA extends Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }
}
