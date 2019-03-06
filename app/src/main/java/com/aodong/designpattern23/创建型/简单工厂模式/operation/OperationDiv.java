package com.aodong.designpattern23.创建型.简单工厂模式.operation;

/**
 * 除法运算
 * Created by pcl on 2018/11/20
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() throws Exception {
        double result = 0;
        if (numberB == 0) {
            throw new Exception("除数不能为0");
        }
        result = numberA / numberB;
        return result;
    }
}
