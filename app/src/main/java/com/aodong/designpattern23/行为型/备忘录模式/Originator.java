package com.aodong.designpattern23.行为型.备忘录模式;

/**
 * 发起人：
 *
 *  负责创建一个 Memento,用以记录当前时刻自己的内部状态，并可使用备忘录恢复内部状态。
 *
 * Created by pcl on 2018/12/10
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //备份数据
    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    //恢复数据
    public void recoverStateWithMemento(Memento memento){
        this.state = memento.getState();
    }

}
