package com.aodong.designpattern23.行为型.中介者模式;

/**
 * 具体中介者类:武林盟主类
 *
 *  知道所有同事类
 *
 * 武林盟主需要了解所有的门派，所以需要用setter来持有武当、峨眉和少林的引用。
 * notice方法会根据不同门派发来的消息，转而通知给其他的门派。比如武当发来的消息，武林盟主就会将消息通知给少林。
 *
 * Created by pcl on 2018/12/14.
 */
public class Champions extends WulinAlliance {

    private Wudang wudang;
    private Shaolin shaolin;
    private Emei emei;

    public void setWudang(Wudang wudang) {
        this.wudang = wudang;
    }

    public void setEmei(Emei emei) {
        this.emei = emei;
    }

    public void setShaolin(Shaolin shaolin) {
        this.shaolin = shaolin;
    }

    @Override
    public void notice(String message, United united) {
        if (united == wudang) {
            //代替武当通知少林
            shaolin.getNotice(message);
        } else if (united == emei) {
            //代替峨眉通知少林
            shaolin.getNotice(message);
        } else if (united == shaolin) {
            //代替少林通知武当、峨眉
            wudang.getNotice(message);
            emei.getNotice(message);
        }
    }
}