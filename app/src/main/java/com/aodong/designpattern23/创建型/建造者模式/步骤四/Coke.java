package com.aodong.designpattern23.创建型.建造者模式.步骤四;

import com.aodong.designpattern23.创建型.建造者模式.步骤三.ColdDrink;

/**
 *
 * 步骤四：创建扩展了 Burger 和 ColdDrink 的实体类。
 *
 * 可口可乐：扩展了 ColdDrink（冷饮） 的实体类。
 * Created by pcl on 2018/12/3
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐 ";
    }

    @Override
    public Float price() {
        return 30.0f;
    }
}
