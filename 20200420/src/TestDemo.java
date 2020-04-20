import java.util.Scanner;

/**
 * @program: 20200420
 * @description: 练习
 * @author: HAOYI
 * @create: 2020-04-20-19:19
 **/
public class TestDemo {
    //递归求 N 的阶乘
    public static int Fac(int n){
        if(n==1){
            return 1;
        }else if(n>=2){
            return (Fac(n-1)*n);
        }
        return -1;
    }
    public static void main7(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Fac(n));
    }
    //递归求 1 + 2 + 3 + ... + 10
    public static int addNum(int n) {
        if (n == 1) {
            return 1;
        } else if (n >= 2) {
            return addNum(n - 1) + n;
        }
        return -1;
    }
    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(addNum(n));
    }
    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void fun(int n){
        if(n>=9) {
            fun(n / 10);
        }
            System.out.println(n%10);
    }
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         fun(n);
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int func(int n){
        if(n>=9){
            return func(n/10)+n%10;
        }else if(n<=9){
            return n;
        }
        return -1;
    }
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(func(n));
    }
    //递归求斐波那契数列的第 N 项
    public static int Fabonacci(int n){
        if(n<=2){
            return 1;
        }else {
            return (Fabonacci(n - 1) + Fabonacci(n - 2));
        }
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Fabonacci(n));
    }
    //递归求解汉诺塔问题
    public static void move(char pos1,char pos2){
        System.out.println(pos1+"->"+pos2+"");
    }
    public static void Hanoi(int n,char pos1,char pos2 ,char pos3){
              if(n==1){
                  move(pos1,pos3);
              }else{
                  Hanoi(n-1,pos1,pos3,pos2);
                  move(pos1,pos3);
                  Hanoi(n-1,pos2,pos1,pos3);
              }
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Hanoi(n,'A','B','C');
        System.out.println();
    }
    //青蛙跳台阶问题
    public static int jumpFloor(int number){
        if(number == 1 || number == 2){
            return number;
        }
        while(number>=3){
            return (jumpFloor(number-1)+jumpFloor(number-2));
        }
        return -1;
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(jumpFloor(number));
    }
}
