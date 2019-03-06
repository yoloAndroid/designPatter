package com.aodong.designpattern23.创建型.抽象工厂模式.抽象工厂;

import com.aodong.designpattern23.创建型.抽象工厂模式.抽象产品.DesktopComputer;
import com.aodong.designpattern23.创建型.抽象工厂模式.抽象产品.NotebookComputer;

/**
 * 顶层抽象工厂：工厂的工厂
 *
 * 定义了两个方法，分别用来生产台式电脑和笔记本电脑。
 *
 * Created by pcl on 2018/12/7
 */
public abstract class AbstractComputerCreateFactory {

    public abstract DesktopComputer createDesktopComputer();
    public abstract NotebookComputer createNotebookComputer();
}
