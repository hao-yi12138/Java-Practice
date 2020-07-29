/**
 * @program: IntelliJ IDEA
 * @description:练习
 * @author: HAOYI
 * @date:2020-07-29 14:33
 **/
class Student{
    //没有特殊的要求，属性都设为私有的
    //限定你只能在类当中进行访问
/*   private String name;
    //提供一个公开的接口
    //alt+insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
    //重新实现了object类的toString()方法
      //object:是所有类的父类
      //alt+insert-》toString()
    @Override//（注解）这个注解指的是这个方法是重新写的
    public String toString() {
        return "Student{" +
                "MyName='" + MyName + '\'' +
                ", age=" + age +
                '}';
    }

     private String MyName;
     public String getMyName(){
            return MyName;
        }
        public void setMyName(String MyName){
            this.MyName = MyName;//this： 当前对象的引用
        }
    /*public void setMyName(String name){
        MyName = name;
    }*/
    public int age;
    public void func(){
        System.out.println("func()");
    }
     /*public void show() {
        System.out.println("我叫" + this.MyName + ", 今年" + this.age + "岁");
    }*/

}
//构造方法
class Person1{
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person1(){
        this("xiao",12);//只能调用一个，只能写在第一行
        System.out.println("Person1(init)");
    }
    public Person1(String name,int age){
      this.name = name;
      this.age = age;
      System.out.println("Person1(String,int)");
    }
    public static int size ;
    {
        /*this.name = "xiaohu";
        this.size = 12;*/
        System.out.println("实例代码块");
    }
    static {
        //不能访问非静态的数据成员
        System.out.println("静态代码块");
    }
}
public class TestDemo2 {
    public static void main(String[] args) {

    }
    /**
     * 构造方法
     * @param args
     */
    public static void main2(String[] args) {
      Person1 person = new Person1();
   /*  System.out.println(person);
      Person1 person1 = new Person1("hy",9);
        System.out.println(person1);*/
    }
    /**
     * 封装
     * 用private来修饰属性或方法
     * 为什么要进行封装
     * 以上是类的实现者写的代码
     * 以下是类的调用者
     * @param args
     */
    public static void main1(String[] args) {
       Student student = new Student();
       student.setMyName("xiaoming");
        System.out.println(student.getMyName());
        System.out.println(student);
    }
}
