package com.aodong.designpattern23.行为型.中介者模式;

/**
 *
 * 武林联盟类：抽象中介者角色
 *
 * Created by pcl on 2018/12/14
 */
public abstract class WulinAlliance {

    //notice方法用于向门派发送通知，其中United为抽象同事类也就是门派类
    public abstract void notice(String message, United united);

}
