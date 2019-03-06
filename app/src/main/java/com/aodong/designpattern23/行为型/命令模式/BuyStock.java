package com.aodong.designpattern23.行为型.命令模式;

/**
 *
 * 3. 创建实现了 Order 接口的实体类。
 *
 * 购买股票
 * Created by pcl on 2018/12/13
 */
public class BuyStock implements Order{

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
