package com.aodong.designpattern23.创建型.建造者模式;

import com.aodong.designpattern23.创建型.建造者模式.步骤五.Meal;
import com.aodong.designpattern23.创建型.建造者模式.步骤六.MealBuilder;

/**
 * 步骤七：使用 MealBuider 来演示建造者模式（Builder Pattern）。
 *
 * http://www.runoob.com/design-pattern/builder-pattern.html
 *
 *
 * 这里是Java的建造者模式，此外还有 Android 简化版的建造者模式参见 AlertDialog 源码
 *
 * 只需要知道在何时使用建造者模式即可：
 *
 * 当需要构造复杂对象的时候，一些基本部件不会变，而其组合经常变化的时候。
 *
 *
 *
 * Created by pcl on 2018/12/3
 */
public class BuilderPatternDemo {

    public static void main(String[] args){

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("素食");
        vegMeal.showItems();
        System.out.println("总金额: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n非素食");
        nonVegMeal.showItems();
        System.out.println("总价: " +nonVegMeal.getCost());
    }
}
