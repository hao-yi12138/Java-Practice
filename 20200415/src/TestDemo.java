import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: 20200415
 * @description: 练习
 * @author: HAOYI
 * @create: 2020-04-15-14:14
 **/
public class TestDemo {
    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static double add(double c,double d,double e){
        return (c+d+e);
    }
    public static int add(int a,int b){
        return (a+b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        System.out.println(add(a,b));
        System.out.println(add(c,d,e));
    }
    /*在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
    还可以求两个小数的最大值，以及两个小数和一个整数的大小关系*/
    public static double MaxNum1(int a,double c,double d){
        double max = MaxNum1(c,d);
        double max3 = (a > max? a : max);
        return max3;
    }
    public static double MaxNum1(double c,double d){
        return (c > d ? c : d );
    }
    public static int MaxNum1(int a,int b){
        return (a > b ? a : b );
    }
    public static void main7(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        System.out.println(MaxNum1(a,b));
        System.out.println(MaxNum1(c,d));
        System.out.println(MaxNum1(a,c,d));
    }
    /*创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    ​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算*/
    public static int MaxNum(int a,int b,int c){
        int max3 = MaxNum(MaxNum(a,b),c);
        return max3;
    }
    public static int MaxNum(int a,int b){
        return (a > b ? a : b );
    }
    public static void main6(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(MaxNum(a,b));
        System.out.println(MaxNum(a,b,c));
    }
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    public static void swap(int []arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            while (left < right && arr[left] % 2 != 0) {
                left++;
            }
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }
            if(left<right){
            int tmp = arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            }
        }
    }
    public static void main5(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    //求 N 的阶乘 。
    public static int fac(int n){
        int ret = 1;
        for(int i = 1;i <=n;i++){
            ret *= i;
        }
        return ret;
    }
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fac(n));
    }
    //求1！+2！+3！+4！+........+n!的和
    public static int func(int n){
        int sum = 0;
        int ret = 1;
        for(int i = 1;i <=n;i++){
            ret *= i;
            sum += ret;
        }
        return sum;
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(func(n));
    }
    //求斐波那契数列的第n项。(迭代实现)
    public static int Fibonacci(int n){
        int i = 0;
        int j = 1;
        int tmp = 0;
        if(n<=1){
            return n;
        }
        while(n>=2){
            tmp = i + j ;
            i = j;
            j = tmp;
            n--;
        }
        return tmp;
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(Fibonacci(num));
    }
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
    public static int findNum(int []arr){
        int len = arr.length;
        int ret = 0;
        for(int i=0;i<len;i++){
            ret^=arr[i];
        }
        return ret;
    }
    public static void main1(String[] args) {
        int [] arr = {1,2,3,4,3,2,1};
        System.out.println(findNum(arr));
    }
}
