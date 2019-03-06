package com.aodong.designpattern23.创建型.建造者模式.步骤一;

/**
 *
 * 步骤一：创建一个表示食物条目和食物包装的接口。
 *
 * 表示食物条目（比如汉堡和冷饮）
 * Created by pcl on 2018/12/3
 */
public interface Item {

    public String name();
    public Float price();

    //打包方式不同，汉堡使用纸盒、可乐使用瓶子
    public Packing packing();

}
