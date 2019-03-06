package com.aodong.designpattern23.创建型.抽象工厂模式.具体产品;

import com.aodong.designpattern23.创建型.抽象工厂模式.抽象产品.NotebookComputer;

/**
 * 具体产品：戴尔笔记本
 *
 * 定义具体工厂生产的具体产品
 * Created by pcl on 2018/12/7
 */
public class DellNotebookComputer extends NotebookComputer {

    @Override
    public void start() {
        System.out.println("戴尔 笔记本制造");
    }
}
