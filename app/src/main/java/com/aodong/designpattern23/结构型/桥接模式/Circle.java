package com.aodong.designpattern23.结构型.桥接模式;

/**
 * 4. 创建实现了 Shape 接口的实体类。
 *
 * Created by pcl on 2018/12/12
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}