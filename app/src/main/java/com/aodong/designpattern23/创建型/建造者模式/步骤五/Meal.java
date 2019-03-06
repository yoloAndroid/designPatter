package com.aodong.designpattern23.创建型.建造者模式.步骤五;

import com.aodong.designpattern23.创建型.建造者模式.步骤一.Item;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 创建一个 Meal（点餐） 类，带有上面定义的 Item（食物条目） 对象。
 *
 * Created by pcl on 2018/12/3
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    //计算点餐总金额
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    //显示点餐明细
    public void showItems(){
        for (Item item : items) {
            System.out.print("食物条目 : "+item.name());
            System.out.print(", 打包 : "+item.packing().pack());
            System.out.println(", 价格 : "+item.price());
        }
    }

}
