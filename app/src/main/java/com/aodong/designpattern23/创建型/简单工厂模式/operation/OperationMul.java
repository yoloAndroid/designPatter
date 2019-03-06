package com.aodong.designpattern23.创建型.简单工厂模式.operation;

/**
 * 乘法运算
 * Created by pcl on 2018/11/20
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = numberA * numberB;
        return result;
    }
}
