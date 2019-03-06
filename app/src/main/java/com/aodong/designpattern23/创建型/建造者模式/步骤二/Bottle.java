package com.aodong.designpattern23.创建型.建造者模式.步骤二;

import com.aodong.designpattern23.创建型.建造者模式.步骤一.Packing;

/**
 *
 * 步骤二：创建实现 Packing 接口的实体类。
 *
 * 瓶子：用于包装冷饮（可口/百事）
 * Created by pcl on 2018/12/3
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
