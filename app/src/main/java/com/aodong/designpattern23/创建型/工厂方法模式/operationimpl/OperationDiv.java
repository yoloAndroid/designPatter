package com.aodong.designpattern23.创建型.工厂方法模式.operationimpl;

import com.aodong.designpattern23.创建型.工厂方法模式.Operation;

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
