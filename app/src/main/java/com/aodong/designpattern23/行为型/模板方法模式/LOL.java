package com.aodong.designpattern23.行为型.模板方法模式;

/**
 * Created by pcl on 2018/12/2
 */
public class LOL extends Game {

    @Override
    void initialize() {
        System.out.println("LOL 初始化");
    }

    @Override
    void startPlay() {
        System.out.println("LOL 开始");
    }

    @Override
    void endPlay() {
        System.out.println("LOL 结束");
    }
}
