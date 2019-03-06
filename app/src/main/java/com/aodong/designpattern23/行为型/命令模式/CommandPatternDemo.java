package com.aodong.designpattern23.行为型.命令模式;

/**
 * 命令模式实现
 *
 * 我们首先创建作为命令的接口 Order，然后创建作为请求的 Stock（股票） 类。
 * 实体命令类 BuyStock（购买股票） 和 SellStock（卖出股票），实现了 Order 接口，将执行实际的命令处理。
 * 创建作为调用对象的类 Broker（经纪人），它接受订单并能下订单。
 *
 * Broker 对象使用命令模式，基于命令的类型确定哪个对象执行哪个命令。CommandPatternDemo，我们的演示类使用 Broker 类来演示命令模式
 *
 * Created by pcl on 2018/12/13
 */
public class CommandPatternDemo {

    public static void main(String[] args){

        //股票
        Stock stock = new Stock();

        //购买股票
        BuyStock buyStock = new BuyStock(stock);

        //售出股票
        SellStock sellStock = new SellStock(stock);

        //创建股票经纪人
        Broker broker = new Broker();

        //记录购买订单
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        //下单
        broker.placeOrders();
    }
}
