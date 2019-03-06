package com.aodong.designpattern23.行为型.策略模式;

import com.aodong.designpattern23.行为型.策略模式.stragety.ConcreteStrategyA;
import com.aodong.designpattern23.行为型.策略模式.stragety.ConcreteStrategyB;
import com.aodong.designpattern23.行为型.策略模式.策略模式and简单工厂.StragetyAndFactoryContext;

/**
 * 策略模式：它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化，不会影响使用的客户
 *
 * Created by pcl on 2018/11/22
 */
public class Client {

    private static Context mContext;
    private static StragetyAndFactoryContext mFactoryContext;

    public static void main(String[] args){
        /**
         * 基本策略模式：
         *
         * 由于实例化不同的策略，所以在最终调用context.contextInterface();时获得的结果就不尽相同。
         */
        mContext = new Context(new ConcreteStrategyA());
        mContext.contextInterface();

        mContext = new Context(new ConcreteStrategyB());
        mContext.contextInterface();

        /**
         * 策略模式+简单工厂
         *
         * 客户端只需要认识一个类AndFactoryContext，耦合性更低
         */
        mFactoryContext = new StragetyAndFactoryContext("策略A");
        mFactoryContext.contextInterface();

        mFactoryContext  = new StragetyAndFactoryContext("策略B");
        mFactoryContext.contextInterface();

    }
}
