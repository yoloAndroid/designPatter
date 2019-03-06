package com.aodong.designpattern23.行为型.模板方法模式;

/**
 * http://www.runoob.com/design-pattern/template-pattern.html
 *
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 * Created by pcl on 2018/12/2
 */
public class TestTemplatePattern {

    public static void main(String[] args){

        Game game = new LOL();
        game.play();
        System.out.println();
        game = new CF();
        game.play();

    }
}
