package com.aodong.designpattern23.创建型.原型模式;

/**
 * 注释打开为深拷贝 即引用也拷贝
 * Created by pcl on 2018/12/2
 */
public class Hand  /*implements Cloneable*/{
     int num ;

     public Hand(int num) {
          this.num = num;
     }


/*     @Override
     protected Object clone() throws CloneNotSupportedException {
          return super.clone();
     }*/
}
