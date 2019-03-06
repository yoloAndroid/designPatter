package com.aodong.designpattern23.行为型.责任链模式;

/**
 * Created by pcl on 2018/12/14
 */
public abstract class Manager {

    protected String name;

    //管理者的上级
    protected Manager superior;


    public Manager(String name) {
        this.name = name;
    }

    //设置管理者的上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    //申请请求
    public abstract void request(Request request);


}
