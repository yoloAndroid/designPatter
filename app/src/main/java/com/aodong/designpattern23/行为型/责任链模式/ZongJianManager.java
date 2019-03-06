package com.aodong.designpattern23.行为型.责任链模式;

/**
 * 总监类：总监只能批5天以内的假期
 * Created by pcl on 2018/12/14
 */
public class ZongJianManager extends Manager {

    public ZongJianManager(String name) {
        super(name);
    }

    @Override
    public void request(Request request) {

        if ("请假".equals(request.requestType) && request.number <= 5){
            System.out.println(name+ ": "+ request.requetsContent+"数量" + request.number + "被批准");
        }else {
            if (superior != null){
                superior.request(request);
            }
        }

    }
}
