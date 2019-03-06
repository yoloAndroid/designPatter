package com.aodong.designpattern23.结构型.桥接模式;

/**
 * 2. 创建实现了 DrawAPI 接口的实体桥接实现类
 *
 * Created by pcl on 2018/12/12
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
