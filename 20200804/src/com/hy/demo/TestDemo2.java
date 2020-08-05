package com.hy.demo;

/**
 * @program: IntelliJ IDEA
 * @description:练习
 * @author: HAOYI
 * @date:2020-08-05 11:19
 **/
/**
 * 理解多态
 * 1：父类引用 引用子类对象
 * 2：父类，子类有同名的覆盖方法
 * 3：通过父类引用调用这个重写的方法的时候
 */
class Shape{
      public void draw(){

      }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}
class Rect extends Shape{
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
public class TestDemo2 {
    public static void drawShape(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
         Shape shape1 = new Cycle();
         Shape shape2 = new Rect();
         drawShape(shape1);
         drawShape(shape2);
    }
    public static void drawShapes() {
         // 我们创建了一个 Shape 对象的数组.
        ///Shape shapes2 = new Cycle();
        Shape[] shapes = {new Cycle(), new Rect(), new Cycle(),
                new Rect(), new Flower()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
