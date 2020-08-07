import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-08-06 18:53
 **/
public class TestDemo {
    //分割多次
    public static void main(String[] args) {
        String str = "name=zhangsan&age=18" ;
        String []strings1=str.split("&");
        for (String s1:strings1) {
            String []strings2=s1.split("=");
            for (String s2:strings2) {
                System.out.println(s2);
            }
        }
    }
    public static void main16(String[] args) {
        String str = "192.168.1.1" ;//分割
        String []strings=str.split("\\.");
        for (String s:strings) {
            System.out.println(s);
        }
    }
    public static void main15(String[] args) {
        String str = "abc de f";//分割
        String []strings=str.split(" ");
        for (String s:strings) {
            System.out.println(s);
        }
    }
    public static void main14(String[] args) {
        String str = "ababcababcabc";//查找
        /*boolean flg = str.contains("abc");
        System.out.println(flg);*/
        /*//int index = str.indexOf("abc");
        //int index = str.indexOf("abc",1);
        int index = str.lastIndexOf("abc");
        //int index = str.lastIndexOf("abc",1);
        System.out.println(index);*/
        //boolean flg = str.startsWith("a");
        //boolean flg = str.startsWith("a",1);
        boolean flg = str.endsWith("a");
        System.out.println(flg);
    }
    public static void main13(String[] args) {
        String str = "   aba  bcabcd     ";
        String ret = str.trim();//去左右空格
        System.out.println(ret);
        /*String ret = str.substring(1);//截取
        System.out.println(ret);
        String ret2 = str.substring(1,4);
        System.out.println(ret2);*/
        /*String ret = str.replace('a','p');
        System.out.println(ret);*/
    }
    public static void main12(String[] args) {
        String str = "ABCDef";
        String str2 = "abcdef";
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));//不用区分大小写
        System.out.println(str.compareTo(str2));
    }
    public static void main11(String[] args) {
        byte[]bytes ={97,98,99,100};
        String str = new String(bytes);
        System.out.println(str);
        String str2 = "abcd";
        byte[]bytes1 = str2.getBytes();
        System.out.println(Arrays.toString(bytes1));
    }
    public static boolean func(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch<'0'||ch>'9'){
                return false;
            }
        }
        return true;
    }
    public static void main10(String[] args) {
        String str = "123456";
        boolean flg = func(str);
        System.out.println(flg);
    }
    public static void main9(String[] args) {
        char [] val = {'a','b','c','d','e'};
        String str = new String(val,1,3);
        System.out.println(str);
        String str2 = "hello";
        char ch = str2.charAt(0);
        System.out.println(ch);
        char[]val2 = str2.toCharArray();
        System.out.println(Arrays.toString(val2));
    }
    public static void main8(String[] args) throws NoSuchFieldException, IllegalAccessException {
       //反射
        String str = "hello";
        Class cl = String.class;
        Field field = cl.getDeclaredField("value");
        field.setAccessible(true);
        char[] val = (char[])field.get(str);
        val[0]='H';
        System.out.println(str);
    }
    public static void main7(String[] args) {
        String str = "hello";
        String str2 = new String("hello").intern();
        System.out.println(str==str2);
    }
    public static void main6(String[] args) {
        String str = "hello";
        String str2 = new String("hello");
        System.out.println(str==str2);//比较的是引用
        System.out.println(str.equals(str2));//比较的是字符串的内容
        String str3 = "hello";
        System.out.println(str==str3);
        System.out.println(str.equals(str3));
    }
    public static void func(String str,char[]array){
        str = "abcde";
        array[0] = 'b';
    }
    public static void main5(String[] args) {
        String str = "hello";
        char []val={'a'};
        System.out.println(str);
        System.out.println(Arrays.toString(val));
        func(str,val);
        System.out.println(str);
        System.out.println(Arrays.toString(val));
    }
    public static void main4(String[] args) {
        String str = "hello";
        String str2 = str;
        System.out.println(str);
        System.out.println(str2);
        str = "abc";
        System.out.println(str);
        System.out.println(str2);
    }
    public static void main3(String[] args) {
        String str = "hello";
        String str2 = "hel"+"lo";
        System.out.println(str==str2);//true
        String str3 = new String("hel")+"lo";
        System.out.println(str==str3);//false
    }
    public static void main2(String[] args) {
        String str = "hello";
        String str2 = new String("hello");
        System.out.println(str==str2);//false
        String str3 = "hello";
        System.out.println(str==str3);//true
    }
    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str);
        String str2 = new String("abcde");
        System.out.println(str2);
        char [] val = {'a','b','c','d','e'};
        String str3 = new String(val);
        System.out.println(str3);
    }
}
