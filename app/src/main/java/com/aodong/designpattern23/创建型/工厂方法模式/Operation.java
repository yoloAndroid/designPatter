package com.aodong.designpattern23.创建型.工厂方法模式;

/**
 * 运算类：
 * 每个计算方式继承它，让各个不同的运算分离，修改和增加互不影响
 * Created by pcl on 2018/11/20
 */
public class Operation {

    public double numberA;
    public double numberB;

    public double getResult() throws Exception {
        double result = 0;
        return result;
    }
}
