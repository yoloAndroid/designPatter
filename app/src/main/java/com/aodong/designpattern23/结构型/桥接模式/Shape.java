package com.aodong.designpattern23.结构型.桥接模式;

/**
 * 3. 使用 DrawAPI 接口创建抽象类 Shape。
 * Created by pcl on 2018/12/12
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
