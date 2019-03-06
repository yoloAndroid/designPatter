package com.aodong.designpattern23.行为型.命令模式;

/**
 * 3. 创建实现了 Order 接口的实体类。
 *
 * 出售股票
 * Created by pcl on 2018/12/13
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
