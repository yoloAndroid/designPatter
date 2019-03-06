package com.aodong.designpattern23.结构型.组合模式;

import com.aodong.designpattern23.行为型.备忘录模式.CareTaker;
import com.aodong.designpattern23.行为型.备忘录模式.Originator;

/**
 * 组合模式
 * Created by pcl on 2018/12/10
 */
public class CompositeTest {

    public static void main(String[] args){

        //1. 生成树根 root，根上长出两叶：叶子 A 和 叶子 B
        Composite root = new Composite("root");
        root.add(new Leaf("叶子- A"));
        root.add(new Leaf("叶子- B"));

        //2. 根上长出分支 compositeX ，分支上也有两叶: 叶子X A和叶子X B
        Composite compositeX = new Composite("Composite X");
        compositeX.add(new Leaf("叶子X- A"));
        compositeX.add(new Leaf("叶子X- B"));
        root.add(compositeX);

        //3. 在 compositeX 上再长出分支 compositeXY，分支上也有两叶:叶子XY- A 和 叶子XY- B
        Composite compositeXy = new Composite("Composite XY");
        compositeXy.add(new Leaf("叶子XY- A"));
        compositeXy.add(new Leaf("叶子XY- B"));
        compositeX.add(compositeXy);

        //4. 根部又长出 叶子C 和 叶子D，可惜叶子D没长牢，被风吹跑了
        Leaf leafC = new Leaf("叶子C");
        Leaf leafD = new Leaf("叶子D");

        root.add(leafC);
        root.add(leafD);

        root.remove(leafD);


        //5. 显示大树的样子
        root.display(1);
    }
}
