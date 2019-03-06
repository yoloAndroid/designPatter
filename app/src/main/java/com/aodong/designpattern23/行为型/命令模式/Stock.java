package com.aodong.designpattern23.行为型.命令模式;

/**
 * 2. 创建一个请求类。
 * Created by pcl on 2018/12/13
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;


    public void buy(){
        System.out.println("股票名字:" + name + "数量：" + quantity +"购买~~");
    }
    public void sell(){
        System.out.println("股票名字:" + name + "数量：" + quantity +"售出~~");

    }


}
