package com.aodong.designpattern23.创建型.工厂方法模式.operationimpl;

import com.aodong.designpattern23.创建型.工厂方法模式.Operation;

/**
 * 加法运算
 * Created by pcl on 2018/11/20
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = numberA + numberB;
        return result;
    }
}
