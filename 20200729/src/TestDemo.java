import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @description:练习
 * @author: HAOYI
 * @date:2020-07-29 08:35
 **/
class Person{
    /*访问修饰限定符:
    public:公有的
    private:私有的
    protected:受保护的
    什么都不写：默认权限-》包访问权限*/
    // 字段->成员变量   定义在方法外面，类的里面
    //实例成员变量：在对象里面
    //实例成员变量没有初始化，默认值为对应的0值，引用类型默认为null，
    // 简单类型默认为0，char-》'\u0000',boolean-》false
   public String name;
   public int age;
   //静态成员变量 不属于对象，属于类
    public static int size = 10;//只有一份
    // 方法->行为
    public void eat(){
        int a = 10;
        System.out.println("eat()");
    }
    public void sleep(){
        System.out.println("sleep()");
    }
    //静态成员方法
    public static void func(){
        System.out.println("func");//静态方法内部不能访问非静态的数据成员
    }
}
class Test{
    public int a;
    public static int count;
}
public class TestDemo {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.a++;
        Test.count++;
        System.out.println(t1.a);
        System.out.println(Test.count);
        Test t2 = new Test();
        t2.a++;
        Test.count++;
        System.out.println(t2.a);
        System.out.println(Test.count);
    }
    public static void main6(String[] args) {
       /* //访问成员方法
        Person per = new Person();
        per.eat();*/
        Person.func();
    }
    public static void main5(String[] args) {
        //如何访问静态的成员变量 类名.成员变量
        //Person per = new Person();
        System.out.println(Person.size);
    }
    public static void main4(String[] args) {
        //实例化一个对象
          Person per = new Person();
          //如何访问对象当中的实例成员变量
         //操作符：点号 . 对象的引用.成员变量
        System.out.println(per.age);
    }
    // [1,4,3,1,2,4，3]找出这个数组只出现一次的数字
    //^两个相同的数字如果进行异或，那么结果就是0.0异或任何数字，结果都是任何数字。
    public static void main3(String[] args) {
         int []array = {1,4,3,1,2,4,3};
         int ret = 0;
        for (int i = 0; i <array.length ; i++) {
            ret^= array[i];
        }
        System.out.println(ret);
    }
    /**
     * 不规则的二维数组
     * @param args
     */
    public static void main2(String[] args) {
        int [][]array = new int[2][];//java行可以指定，列不可以自动推导。
        array[0] = new int[]{1,2,3};
        array[1] = new int[]{4,5};
       /* array[0] = new int[3];
        array[1] = new int[2];*/
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        /**
         * 二维数组的打印方式
         * @param args
         */
       /*public static void main1(String[] args){
        int [][]array = {{1,2,3},{4,5,6}};
        for (int []tmp:array) {
            for (int x:tmp) {
                System.out.print(x+" ");
            }
        }*/
        //System.out.println(Arrays.deepToString(array));
      /*  for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*/
    }
}
