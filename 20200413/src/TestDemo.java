import java.util.Scanner;
import java.util.Random;
public class TestDemo {
    public static String myToString(int [] array){
        String ret="[";
        for(int i=0;i<array.length;i++){
            ret+=array[i];
            ret+=',';
        }
         ret+="]";
        return ret;
    }
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7};
        System.out.println(myToString( array));
    }
    //输出n*n的乘法口诀表，n由用户输入。
    public static void main14(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int n=1;n<=num;n++){
            for(int i=1;i<=n;i++){
                System.out.print(n+"*"+i+"="+i*n+" ");
            }
            System.out.println(" ");
        }
    }
    //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
    public static void fun(int num){
        if(num>9){
            fun(num/10);
        }
        System.out.println(num%10);
    }
    public static void main13(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
       fun(num);
    }
    /*编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
    可以重新输 入，最多输入三次。三次均错，则提示退出程序*/
    public static void main12(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 3;
        while(count != 0){
            System.out.println("请输入你的密码；");
            String password = scan.nextLine();
            if(password.equals("123456")){
                System.out.println("密码正确，登录成功！");
                break;
            }else {
                count--;
                System.out.println("你还有"+count+"次机会！");
            }
        }
    }
    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main11(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=31;i>=1;i-=2){
            System.out.print(((num>>i)&1)+" ");
        }
        System.out.println(" ");
        for(int i=30;i>=0;i-=2){
            System.out.print(((num>>i)&1)+" ");
        }
    }
    //求一个整数，在内存当中存储时，二进制1的个数。
    public static void main10(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        while(num != 0){
           num = num & (num-1);
           count++;
        }
        System.out.println(count);
    }
    //求两个正整数的最大公约数
    public static void main9(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num = 0;
        while(num1 % num2 != 0){
            num = num1 % num2;
            num1 = num2;
            num2 = num;
        }
        System.out.println(num);
    }
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static void main8(String[] args) {
        double sum = 0;
        int flg=1;
        for(int i=1;i<=100;i++){
           sum += 1.0/ i*flg;
            flg = -flg;
        }
        System.out.println(sum);
    }
    //求出0～999之间的所有“水仙花数”并输出。
    public static void main7(String[] args) {
           for(int i=1;i<=999;i++){
               int count = 0;
               int tmp = i;
               while(tmp!=0){
                   tmp = tmp/10;
                   count++;
               }
               tmp = i;
               int sum = 0;
               while(tmp!=0){
                   sum+=Math.pow(tmp%10,count);
                   tmp=tmp/10;
               }
               if(sum==i){
                   System.out.println(i);
               }
           }
    }
    //猜数字
    public static void main6(String[] args) {
           Scanner scan = new Scanner(System.in);
           Random random = new Random();
           int randNum = random.nextInt(100);
           while(true){
               System.out.println("请输入要猜的数字");
               int num = scan.nextInt();
               if(num == randNum){
                   System.out.println("恭喜你猜对了");
                   break;
               }else if(num < randNum){
                   System.out.println("猜小了");
               }else if(num > randNum){
                   System.out.println("猜大了");
               }
           }
    }
    /*根据输入的年龄, 来打印出当前年龄的人是少年(低于18),
     青年(19-28), 中年(29-55), 老年(56以上)*/
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age <= 18){
            System.out.println("少年");
        }else if(age >= 19 && age <= 28){
            System.out.println("青年");
        }else if(age >= 29 && age <= 55){
            System.out.println("中年");
        }else if(age >= 56){
            System.out.println("老年");
        }
    }
    public static void main4(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        if(n==2||n==1){
            System.out.println(n + "不是素数！");
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0) {
                System.out.println(n + "不是素数！");
                break;
            }
            if(i>Math.sqrt(i)){
                System.out.println(n+"是素数！");
            }
        }
    }
    public static void main3(String[] args) {
        for(int i=1;i<=100;i++){
            int j=2;
            for(;j<=(int)Math.sqrt(i);j++){
                if(i%j==0){
                    break;
                }
            }
            if(j>Math.sqrt(i)){
                System.out.println(i+"是素数！");
            }
        }
    }
    public static void main2(String[] args) {
        for(int year=1000;year<=2000;year++){
            if((year%4==0&&year%100!=0)||year%400==0){
                System.out.println(year+"是闰年！ ");
            }
        }
    }
    public static void main1(String[] args) {
        int count=0;
        for(int i=1;i<=100;i++){
              if(i%10==9){
                  count++;
              }else if(i/10==9){
                  count++;
              }
        }
        System.out.println(count);
    }
}
