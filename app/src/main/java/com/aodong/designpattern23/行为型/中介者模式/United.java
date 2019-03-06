package com.aodong.designpattern23.行为型.中介者模式;

/**
 *
 * 抽象同事类也就是门派类
 * Created by pcl on 2018/12/14
 */
public abstract class United {

    protected WulinAlliance wulinAlliance;

    //门派类（抽象同事类）会在构造方法中得到武林联盟类（抽象中介者类）。
    public United(WulinAlliance wulinAlliance){
        this.wulinAlliance=wulinAlliance;
    }


}
