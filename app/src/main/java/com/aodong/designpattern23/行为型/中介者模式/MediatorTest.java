package com.aodong.designpattern23.行为型.中介者模式;

/**
 * 中介者模式:
 * <p>
 * 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * <p>
 * 中介者模式可以拿武侠来举例，江湖中门派众多，门派之前因为想法不同会有很多的利益冲突，这样就会带来无休止的纷争。为了江湖的安宁，大家推举出了一个大家都认可的武林盟（中介者）主来对江湖纷争进行调停。
 * 前段时间武当派和峨眉派的的弟子被大力金刚指所杀，大力金刚指是少林派的绝学，因为事情重大，而且少林派实力强大，武当派和峨眉派不能够直接去少林派去问罪，只能上报武林盟主由武林盟主出面进行调停，如下图所示。
 * <p>
 *
 *     优点
 * 符合迪米特原则，将原有的一对多的依赖变成了一对一的依赖，降低类间的耦合。
 *
 * 缺点
 * 中介者会变得庞大且复杂，原本多个对象直接的相互依赖变成了中介者和多个同事类的依赖关系，同事类越多，中介者的逻辑就越复杂。
 *
 * 使用场景
 * 中介者模式很容易实现呢，但是也容易误用，不要着急使用，先要思考你的设计是否合理。
 * 当对象之间的交互变多时，为了防止一个类会涉及修改其他类的行为，可以使用中介者模式，将系统从网状结构变为以中介者为中心的星型结构。
 * Created by pcl on 2018/12/14
 */
public class MediatorTest {

    public static void main(String[] args) {

        //武林盟主
        Champions champions = new Champions();

        //各个同事类
        Wudang wudang = new Wudang(champions);
        Shaolin shaolin = new Shaolin(champions);
        Emei emei = new Emei(champions);

        //让武林盟主（中介者知道各个同事）
        champions.setWudang(wudang);
        champions.setShaolin(shaolin);
        champions.setEmei(emei);

        //武当发送消息
        wudang.sendAlliance("武当弟子被少林大力金刚指所杀");
        //峨眉发送消息
        emei.sendAlliance("峨眉弟子被少林大力金刚指所杀");
        //少林发送消息
        shaolin.sendAlliance("少林弟子绝不会做出这种事情");
    }
}
