package com.aodong.designpattern23.创建型.抽象工厂模式.具体工厂;

import com.aodong.designpattern23.创建型.抽象工厂模式.具体产品.DellDesktopComputer;
import com.aodong.designpattern23.创建型.抽象工厂模式.具体产品.DellNotebookComputer;
import com.aodong.designpattern23.创建型.抽象工厂模式.抽象产品.DesktopComputer;
import com.aodong.designpattern23.创建型.抽象工厂模式.抽象产品.NotebookComputer;
import com.aodong.designpattern23.创建型.抽象工厂模式.抽象工厂.AbstractComputerCreateFactory;

/**
 * 具体工厂：戴尔电脑制造工厂
 *
 * Created by pcl on 2018/12/7
 */
public class DellFactory extends AbstractComputerCreateFactory {

    @Override
    public DesktopComputer createDesktopComputer() {
        return new DellDesktopComputer();       //创建戴尔台式机
    }

    @Override
    public NotebookComputer createNotebookComputer() {
        return new DellNotebookComputer();      //创建戴尔笔记本
    }
}
