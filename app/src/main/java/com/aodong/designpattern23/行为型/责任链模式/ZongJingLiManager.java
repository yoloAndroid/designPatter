package com.aodong.designpattern23.行为型.责任链模式;

/**
 * 总经理类：总经理的全权限是全部都需要处理
 *
 * 总经理可以批准任意天数的假
 * 加薪在500以内都没问题，超过500就需要考虑一下了
 *
 * Created by pcl on 2018/12/14
 */
public class ZongJingLiManager extends Manager {

    public ZongJingLiManager(String name) {
        super(name);
    }

    @Override
    public void request(Request request) {
        if ("请假".equals(request.requestType)){
            System.out.println(name + request.requetsContent+"数量" + request.number + "被批准");
        }else if ("加薪".equals(request.requestType) && request.number <= 500){
            System.out.println(name+" :500块给你啦~");
        }else {
            System.out.println(name+" :500块都不给你~");
        }
    }
}
