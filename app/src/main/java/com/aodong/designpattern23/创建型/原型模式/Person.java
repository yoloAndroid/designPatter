package com.aodong.designpattern23.创建型.原型模式;

public class Person implements Cloneable{

    //private Integer age;
    private int age;//阿里规范中规定pojo类中的属性强制使用包装类型，这里只是测试

    private String name;

    private Hand hand;

    public Person(Integer age, String name,Hand hand) {
        super();
        this.age = age;
        this.name = name;
        this.hand = hand;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //注释打开为深拷贝
      /*  Person newPerson = (Person) super.clone();
        newPerson.setHand((Hand) this.hand.clone());
        return newPerson;*/
      return super.clone();
    }


}
