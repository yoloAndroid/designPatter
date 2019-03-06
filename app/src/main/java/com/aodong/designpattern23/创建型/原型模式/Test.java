package com.aodong.designpattern23.创建型.原型模式;

/**
 * 原型模式在java中的实现是：继承 Cloneable，重写 clone()
 *
 * 这里主要有两个概念需要理解：
 *
 * 浅拷贝：使用一个已知实例对新创建实例的成员变量逐个赋值，这个方式被称为浅拷贝。
 * 深拷贝：当一个类的拷贝构造方法，不仅要复制对象的所有非引用成员变量值，还要为引用类型的成员变量创建新的实例，并且初始化为形式参数实例值。这个方式称为深拷贝
 *
 * 从 Object 中继承过来的 clone 默认实现的是浅拷贝。
 *
 * 实现深拷贝要求我们在实现当前类继承 Cloneable，重写 clone() 的同时，如果其内部有引用类型，需要在该引用类型中也继承 Cloneable，重写 clone()
 *
 * http://www.cnblogs.com/chenssy/p/3308489.html
 * https://blog.csdn.net/u014727260/article/details/55003402
 * Created by pcl on 2018/12/2
 */
public class Test {

    public static void main(String[] args) {

        Person pcl = new Person(16, "pcl",new Hand(1));
        try {
            Person person = (Person) pcl.clone();
            //String是不可变对象，在拷贝的时候会被复制

            person.getHand().num = 4;
            System.out.println(person.getHand().num);
            System.out.println(pcl.getHand().num);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
