import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-08-10 09:14
 **/

/**
 * 自定义异常
 * 一定要继承一个父类异常
 */
class MyException extends RuntimeException{
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
public class TestDemo {
    //输入一个字符串，求出该字符串包含的字符集合
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuffer ret = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String tmp = ret.toString();
                if (!tmp.contains(ch + "")) {
                    ret.append(ch);
                }
            }
            System.out.println(ret);
        }
    }
    public static void func2(int x)throws MyException{
        if(x == 10){
            throw new MyException("x==10");
        }
    }
    public static void main7(String[] args) {
       try{
           func2(10);
       }catch (MyException e){
           e.printStackTrace();
       }
    }
    public static int divide(int x,int y)throws ArithmeticException{
        if(y==0){
            throw new ArithmeticException("y==0");
        }
        return x/y;
    }
    public static void main6(String[] args) {
      try{
          int ret = divide(20,0);
          System.out.println(ret);
      }catch (ArithmeticException e){
          e.printStackTrace();
          System.out.println("aaa");
      }
        System.out.println("继续执行");
    }
    //抛出异常 throw 一般抛出你想抛出的异常（可以是自定义的异常）
    public static void main5(String[] args) {
        int x = 0;
        if(x==0){
            throw new UnsupportedOperationException("x==0");
        }
    }
    public static void main4(String[] args) {
        try {
            func1();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }
    public static void func1() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[100]);
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int n = scanner.nextInt();
            System.out.println(10/n);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }
    public static void main2(String[] args) {
        int []array = {1,2,3};
        try{
            System.out.println(array[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("捕获到了数组越界异常");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获到了空指针异常");
        }finally {
            System.out.println("finally块的代码肯定会被执行！");
        }
    }
    public static void main1(String[] args) {
        int []array = {1,2,3};
        try{
            System.out.println(array[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("捕获到了数组越界异常");
        }
        System.out.println("hello");
    }
}
