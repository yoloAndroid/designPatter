package com.aodong.designpattern23.行为型.备忘录模式;

/**
 * 备忘录模式
 * Created by pcl on 2018/12/10
 */
public class MementoTest {

    public static void main(String[] args){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.recoverStateWithMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.recoverStateWithMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
