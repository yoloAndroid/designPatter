package com.aodong.designpattern23.行为型.责任链模式;

/**
 * 经理类：经理的权限是2天以内的请假
 * Created by pcl on 2018/12/14
 */
public class JinLiManager extends Manager{

    public JinLiManager(String name) {
        super(name);
    }

    @Override
    public void request(Request request) {

        if ("请假".equals(request.requestType) && request.number <= 2){

            System.out.println(name+ ": "+ request.requetsContent+"数量" + request.number + "被批准");

        }else {

            //其余的申请都需转到上级
            if (superior != null){
                superior.request(request);
            }
        }
    }
}
