package com.aodong.designpattern23.行为型.模板方法模式;

/**
 * Created by pcl on 2018/12/2
 */
public class CF extends Game {

    @Override
    void initialize() {
        System.out.println("CF 初始化");
    }

    @Override
    void startPlay() {
        System.out.println("CF 开始");
    }

    @Override
    void endPlay() {
        System.out.println("CF 结束");
    }
}
