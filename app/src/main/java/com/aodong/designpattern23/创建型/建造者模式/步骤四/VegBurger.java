package com.aodong.designpattern23.创建型.建造者模式.步骤四;

import com.aodong.designpattern23.创建型.建造者模式.步骤三.Burger;

/**
 * 步骤四：创建扩展了 Burger 和 ColdDrink 的实体类。
 *
 * 素食汉堡：扩展了 Burger （汉堡）的实体类。
 * Created by pcl on 2018/12/3
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public Float price() {
        return 25.0f;
    }
}
