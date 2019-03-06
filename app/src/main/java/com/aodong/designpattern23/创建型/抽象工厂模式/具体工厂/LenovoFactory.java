package com.aodong.designpattern23.创建型.抽象工厂模式.具体工厂;

import com.aodong.designpattern23.创建型.抽象工厂模式.具体产品.LenovoDesktopComputer;
import com.aodong.designpattern23.创建型.抽象工厂模式.具体产品.LenovoNotebookComputer;
import com.aodong.designpattern23.创建型.抽象工厂模式.抽象产品.DesktopComputer;
import com.aodong.designpattern23.创建型.抽象工厂模式.抽象产品.NotebookComputer;
import com.aodong.designpattern23.创建型.抽象工厂模式.抽象工厂.AbstractComputerCreateFactory;

/**
 * 具体工厂：联想电脑制造工厂
 * Created by pcl on 2018/12/7
 */
public class LenovoFactory extends AbstractComputerCreateFactory {

    @Override
    public DesktopComputer createDesktopComputer() {
        return new LenovoDesktopComputer();     //创建联想台式机
    }

    @Override
    public NotebookComputer createNotebookComputer() {
        return new LenovoNotebookComputer();    //创建联想笔记本
    }
}
