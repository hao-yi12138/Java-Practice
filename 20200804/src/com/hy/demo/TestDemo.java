package com.hy.demo;
/**
 * @program: IntelliJ IDEA
 * @description:练习
 * @author: HAOYI
 * @date:2020-08-04 16:21
 **/
class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
        System.out.println("animal:string");
    }
    public void eat(){
        System.out.println(this.name+"animal:eat()");
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);//显示调用父类的构造方法
        System.out.println("cat:string");
    }
    public void eat(){
        System.out.println(this.name+"123cat:eat()");
    }
    /*public String name;
    public void eat(){
        System.out.println(this.name+"cat:eat()");
    }*/
}
final class  ChineseGardenCat extends Cat {
    public ChineseGardenCat(String name) {
        super(name);
    }
}
class Bird extends Animal{
    //public String name;
    public Bird(String name){
        super(name);
    }
    public void eat(){
        System.out.println("cat:eat()");
    }
    public void fly(){
        System.out.println("cat:fly()");
    }

}
public class TestDemo{
    public static void main(String[] args) {
        Animal animal =new Cat("小二");
        // A instanceof B 判断A是不是B的一个实例
        if(animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        }
    }
    //向下转型 父类的引用 赋给了子类
    public static void main5(String[] args) {
        Animal animal =new Bird("小二");
        Bird bird = (Bird)animal;
        bird.fly();
    }
    /**
     * 多态
     * 运行时绑定（多态）/动态绑定
     * 父类引用 引用子类对象 同时通过父类引用调用同名的覆盖方法
     * 此时就会发生运行时绑定
     * @return
     */
    public static Animal func(){
       /* Cat cat = new Cat("小一");
           return cat;*/
       return new Cat("小一");
    }
    public static void main4(String[] args) {
         Animal animal = func();
         animal.eat();
    }
    public static void func(Animal animal){
        animal.eat();
    }
    public static void main3(String[] args) {
        Cat cat = new Cat("小一");
        func(cat);
    }
    //向上转型-》父类引用 引用子类对象
    public static void main2(String[] args) {
        Animal animal = new Cat("小一");
        animal.eat();
        //向上转型之后，通过父类的引用 只能访问父类自己的属性或方法
    }
    public static void main1(String[] args) {
        Cat cat = new Cat("mimi");
        //cat.name = "mimi";
        cat.eat();
    }
}

