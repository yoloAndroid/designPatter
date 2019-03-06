package com.aodong.designpattern23.创建型.简单工厂模式.factory;

import com.aodong.designpattern23.创建型.简单工厂模式.operation.Operation;
import com.aodong.designpattern23.创建型.简单工厂模式.operation.OperationAdd;
import com.aodong.designpattern23.创建型.简单工厂模式.operation.OperationDiv;
import com.aodong.designpattern23.创建型.简单工厂模式.operation.OperationMul;
import com.aodong.designpattern23.创建型.简单工厂模式.operation.OperationSub;

/**
 * 到底要实例化谁？将来会不会增加实例化的对象，比如增加开根运算，这是很容易变化的地方
 * 应该考虑使用一个单独的类来做这个创造实例的过程，这就是工厂。
 *
 *
 *
 * Created by pcl on 2018/11/20
 */
public class OperationFactory {

    /**
     * 所有使用简单工厂的地方，都可以考虑使用反射技术去除switch或if，解除分支判断带来的耦合
     */
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                break;
        }
        return operation;
    }
}
