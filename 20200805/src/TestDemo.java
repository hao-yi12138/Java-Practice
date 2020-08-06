/**
 * @program: IntelliJ IDEA
 * @description:练习
 * @author: HAOYI
 * @date:2020-08-05 21:53
 **/
class Money implements Cloneable{
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public int age;
    Money m = new Money();
    //重写了父类的克隆方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Person p1 = (Person)super.clone();
        p1.m = (Money) this.m.clone();
        return p1;
    }
}
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        System.out.println("======修改======");
        person2.m.money = 99.1;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
    public static void main1(String[] args) throws CloneNotSupportedException {
      Person person1 = new Person();
      Person person2 = (Person) person1.clone();
      person2.age = 99;
        System.out.println(person1.age);
        System.out.println(person2.age);
    }
}
