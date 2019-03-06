package com.aodong.designpattern23.行为型.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 4. 创建命令调用类。
 *
 * 股票经纪人
 * Created by pcl on 2018/12/13
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    //写（记录）订单
    public void takeOrder(Order order){
        orderList.add(order);
    }

    //下订单
    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
