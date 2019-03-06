package com.aodong.designpattern23.行为型.责任链模式;

/**
 *
 * 职责链模式：
 *      使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *
 *      这里发出这个请求的客户端并不知道这当中的哪一个对象最终处理这个请求，
 * 这样系统的更改可以在不影响客户端的情况下动态地重新组织和分配责任。
 * 当客户提交一个请求时，请求是沿链传递直至一个 ConcreteHandler对象负责处理它。
 *
 *
 *
 * 好处：
 *
 *  使得接收者和发送者都没有对方的明确信息，且链中的对象自己也并不知道链的结构。
 *  结果是职责链可以简化对象的相互连接，它们仅需要把持一个指向其后继者的引用，而不需保持它所有的候选接收者的引用。
 *  这也就大大降低了耦合度。
 *
 *  由于是在客户端定义链的结构，可以随时地增加或修改处理一个请求的结构。增强了给对象指派职责的灵活性。
 *
 *  弊端：
 *
 *  一个请求极有可能到了链的末端也得不到处理，或者因为没有正确配置得不到处理。需要事先考虑全面。
 *  这就跟现实中邮寄一封信，因地址不对，而无法送达一样。
 *
 *
 *  注意事项：
 *
 *  1. 需要事先给每个具体管理者设置他的上级是哪个类，也就是设置后继者
 *  2. 需要在每个具体管理者处理请求时，做出判断，是可以处理这个请求，还是必须要“推卸责任”，转移给后继者去处理
 *
 *
 *
 * 实例：小菜加薪，需要【经理、总监、总监理】  审批
 *
 *
 * 由于管理者类是一个抽象类和它的衍生类，此时类之间的灵活性就大大增加了，如果要扩展新的管理者类别，只需要增加子类就可以了
 * Created by pcl on 2018/12/14
 */
public class ChainTest {

    public static void main(String[] args){


        //创建各个管理者
        JinLiManager jinLiManager = new JinLiManager("经理");
        ZongJianManager zongJianManager = new ZongJianManager("总监");
        ZongJingLiManager zongJingLiManager = new ZongJingLiManager("总经理");

        //设置各自上级（可根据实际需要设置不同上级）
        jinLiManager.setSuperior(zongJianManager);
        zongJianManager.setSuperior(zongJingLiManager);

        //客户端的申请都是由第一级审批人（经理）发起，而实际谁来决策由具体管理类处理，客户端不知道。
        Request request = new Request("请假","小菜请假",2);
        jinLiManager.request(request);

        Request request2 = new Request("请假","小菜请假",5);
        jinLiManager.request(request2);

        Request request3 = new Request("加薪","小菜请求加薪",500);
        jinLiManager.request(request3);

        Request request4 = new Request("加薪","小菜请求加薪",1000);
        jinLiManager.request(request4);
    }
}
