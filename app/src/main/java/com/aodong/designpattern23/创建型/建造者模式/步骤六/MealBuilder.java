package com.aodong.designpattern23.创建型.建造者模式.步骤六;

import com.aodong.designpattern23.创建型.建造者模式.步骤五.Meal;
import com.aodong.designpattern23.创建型.建造者模式.步骤四.ChickenBurger;
import com.aodong.designpattern23.创建型.建造者模式.步骤四.Coke;
import com.aodong.designpattern23.创建型.建造者模式.步骤四.Pepsi;
import com.aodong.designpattern23.创建型.建造者模式.步骤四.VegBurger;

/**
 *
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 *
 * Created by pcl on 2018/12/3
 */
public class MealBuilder {

    //准备素食套餐
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());  //素食汉堡
        meal.addItem(new Coke());       //可口可乐
        return meal;
    }

    //准备肉食套餐
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());  //鸡肉汉堡
        meal.addItem(new Pepsi());          //百事可乐
        return meal;
    }
}
