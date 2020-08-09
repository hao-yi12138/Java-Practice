import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-08-08 09:12
 **/
public class TestDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello");
        stringBuffer.reverse();
        /*StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcd");
        stringBuilder.append("efg").append("123");*/
        System.out.println(stringBuffer);
    }
    /*//给一个字符类型的数组chas和一个整数size，请把大小为size的左半区整体右移到右半区，
      //右半区整体移动到左边。
    public static String reverse(String str,int begin,int end) {
        char[] val = str.toCharArray();
        while (begin < end) {
            char tmp = val[begin];
            val[begin] = val[end];
            val[end] = tmp;
            begin++;
            end--;
        }
        return String.copyValueOf(val);
    }
    public static String func(String str,int n){
        if(str==null||n<0||n>=str.length()){
            return null;
        }
        str =reverse(str,0,n-1);
        str =reverse(str,n,str.length()-1);
        str = reverse(str,0,str.length()-1);
        return str;
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        String ret=func(str,n);
        System.out.println(ret);
    }*/
    /*public static String reverse(String str,int begin,int end){
        char []val = str.toCharArray();
        while(begin<end){
            char tmp = val[begin];
            val[begin] = val[end];
            val[end] = tmp;
            begin++;
            end--;
        }
       // return new String(val);
        return String.copyValueOf(val);
    }
    //逆置
    public static void main3(String[] args) {
        String str = "abcdef";
        String  ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }*/
    public static void main2(String[] args) {
        String str = "abcdefAd";
        //String ret = str.toLowerCase();//小写
        String ret = str.toUpperCase();//大写
        System.out.println(ret);

    }
    /*public static String func(String str) {
        String[] strings = str.split("");
        String ret = "";
        for (String s : strings) {
            ret += s;
        }
        return ret;
    }
        public static void main1(String[] args) {
            Scanner scan = new Scanner(System.in);
            while (scan.hasNext()) {
                String str = scan.nextLine();
                //不能用next 遇到空格结束了
                String ret = func(str);
                System.out.println(ret);
            }
        }*/

    }
