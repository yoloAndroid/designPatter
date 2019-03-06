package com.aodong.designpattern23.创建型.工厂方法模式.factoryimpl;

import com.aodong.designpattern23.创建型.工厂方法模式.IFactory;
import com.aodong.designpattern23.创建型.工厂方法模式.Operation;
import com.aodong.designpattern23.创建型.工厂方法模式.operationimpl.OperationAdd;

/**
 * 加法工厂
 * Created by pcl on 2018/11/28
 */
public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
