package com.hy.demo3;

/**
 * @program: IntelliJ IDEA
 * @description:练习
 * @author: HAOYI
 * @date:2020-08-05 16:31
 **/

import java.util.Arrays;

/**
 * 接口（interface）
 *1:接口当中的方法都是抽象方法。
 *2：其实可以有具体实现的方法。这个方法是被default修饰的。
 *3:接口当中定义的成员变量默认是常量。
 *4:接口当中的成员变量默认是：public static final 成员方法是：public abstract
 *5:接口是不可以被实例化的
 *6:接口和类之间的关系:implements
 *7:为了解决Java单继承的问题，可以实现多个接口
 *8:只要这个类实现了该接口，那么你就可以进行向上转型
 */
/*interface Shape{
    public int a = 10;//public static final int a = 10;
     public abstract void draw();
    *//* default void func(){
     }*//*
}
class Cycle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}*/
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;
    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;

    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //return 0;
        if(this.age>o.age){
          return 1;
        }else if(this.age==o.age){
          return 0;
        }else{
           return -1;
        }
    }
}
public class TestInterFace {
    //接口使用实例
    //一般情况下 自定义类型进行比较 需要是可比较的
    //Comparable  Comparator
    public static void main(String[] args) {
         Student student1 = new Student("yi",18,70);
         Student student2 = new Student("er",20,78);
        Student student3 = new Student("san",10,75);
         /*if(student1.compareTo(student2)>0){
             System.out.println("student1年龄>student2");
         }*/
         Student []students =new Student[3];
         students[0]=student1;
         students[1]=student2;
         students[2]=student3;
         Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
   /* public static void main1(String[] args) {
       Shape shape = new Cycle();
    }*/
}
