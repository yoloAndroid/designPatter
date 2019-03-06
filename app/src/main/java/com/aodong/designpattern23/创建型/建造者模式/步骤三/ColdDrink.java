package com.aodong.designpattern23.创建型.建造者模式.步骤三;

import com.aodong.designpattern23.创建型.建造者模式.步骤一.Item;
import com.aodong.designpattern23.创建型.建造者模式.步骤一.Packing;
import com.aodong.designpattern23.创建型.建造者模式.步骤二.Bottle;

/**
 * 步骤三：创建实现 Item 接口的抽象类，该类提供了默认的功能。
 *
 * 冷饮
 * Created by pcl on 2018/12/3
 */
public abstract class ColdDrink implements Item {

    @Override
    public abstract Float price();

    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        //可乐默认用瓶子装
        return new Bottle();
    }
}
