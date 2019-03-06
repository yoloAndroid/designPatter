package com.aodong.designpattern23.行为型.策略模式;

import com.aodong.designpattern23.行为型.策略模式.stragety.Strategy;

/**
 * 用一个 ConcreteStrategy 来配置，维护一个对 Stragety 对象的引用
 */
public class Context {

    Strategy strategy;
    /**
     * 初始化时，传入具体的策略对象
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文接口：根据具体的策略对象，调用其算法的方法
     */
    public void contextInterface(){
        this.strategy.algorithmInterface();
    }
}
