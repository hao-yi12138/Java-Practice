package com.hy.demo2;

/**
 * @program: IntelliJ IDEA
 * @description:练习
 * @author: HAOYI
 * @date:2020-08-05 15:30
 **/

/**
 * 抽象类
 * 1：抽象方法：一个方法如果被abstract修饰，那么这个方法就是抽象方法。
 *    抽象方法可以没有具体的实现。
 * 2：包含抽象方法的类叫做抽象类。
 * 注意：
 * 1：抽象类不可以被实例化。
 * 2：类内的数据成员和普通类没有区别。
 * 3：抽象类主要是用来被继承的。
 * 4：如果一个类继承了这个抽象类，那么这个类必须重写抽象类当中的抽象方法。
 * 5:当抽象类A继承抽象类B，那么A可以不重写B中的方法，但是A如果被继承，
 *   那么一定还要重写这个抽象方法。
 * 6：抽象类和抽象方法一定不能被final所修饰。
 */
/*abstract  class Shape{
    public abstract void draw();
}
abstract class Cycle extends Shape{

}
class A extends Cycle{
    public void draw(){

    }
}*/
abstract  class Shape{
    public abstract void draw();
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("♣");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape){
         shape.draw();
    }
    public static void main(String[] args) {
        Shape shape = new Cycle();
        drawMap(shape);
    }
}
