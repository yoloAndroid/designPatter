package com.aodong.designpattern23.行为型.迭代器模式;

/**
 * Created by pcl on 2018/12/11
 */
public class TestIterator {

    public static void main(String[] agrs){

        NameRepository namesRepository = new NameRepository();

//        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
//            String name = (String)iter.next();
//            System.out.println("Name : " + name);
//        }

        Iterator iterator = namesRepository.getIterator();
        while (iterator.hasNext()){
            String name = (String) iterator.next();
            System.out.println("Name = " + name);
        }
    }
}
