package com.aodong.designpattern23.行为型.策略模式.策略模式and简单工厂;

import com.aodong.designpattern23.行为型.策略模式.stragety.ConcreteStrategyA;
import com.aodong.designpattern23.行为型.策略模式.stragety.ConcreteStrategyB;
import com.aodong.designpattern23.行为型.策略模式.stragety.Strategy;

/**
 * 策略模式+简单工厂的Context类
 * Created by pcl on 2018/11/22
 */
public class StragetyAndFactoryContext {

    Strategy strategy;

    public StragetyAndFactoryContext(String strategyType) {
        switch (strategyType){
            case "策略A":
                strategy = new ConcreteStrategyA();
                break;
            case "策略B":
                strategy = new ConcreteStrategyB();
                break;
            default:
                break;
        }
    }

    /**
     * 上下文接口：根据具体的策略对象，调用其算法的方法
     */
    public void contextInterface(){
        this.strategy.algorithmInterface();
    }
}
