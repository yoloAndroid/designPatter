package com.aodong.designpattern23.创建型.建造者模式.步骤二;

import com.aodong.designpattern23.创建型.建造者模式.步骤一.Packing;

/**
 * 步骤二：创建实现 Packing 接口的实体类。
 *
 * 纸盒：用于包装汉堡
 * Created by pcl on 2018/12/3
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
