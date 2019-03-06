package com.aodong.designpattern23.行为型.中介者模式;

/**
 *
 * 具体同事角色:武当派
 *
 *
 * 武当、峨眉和少林类都有两个方法:
 *
 * getNotice方法是自有方法，对于其他的门派（同事类）和武林联盟（中介者）没有依赖，只是用来接收武林盟主的通知。
 *
 * sendAlliance方法则是依赖方法，它必须通过武林盟主才能完成行为。
 *
 *
 * Created by pcl on 2018/12/14
 */
public class Wudang extends United{

    public Wudang(WulinAlliance wulinAlliance) {
        super(wulinAlliance);
    }

    public void sendAlliance(String message) {
        wulinAlliance.notice(message, this);
    }
    public void getNotice(String message) {
        System.out.println("武当收到消息：" + message);
    }
}
