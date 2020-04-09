public class TestDemo{
	public static void main(String[] args) {
		long a = 10L;
	    int b = (int)a;
	    System.out.println(b);
	}
	public static void main12(String[] args) {
		int num = 5;
		int i = 1;
		int x = 0;
		int ret = 1;
		while(i <= num) {
			ret *= i;
			x += ret;
			i++;
		}
		
		System.out.println(x);
	}
	public static void main11(String[] args) {
		final int MAXNUM;
		MAXNUM = 999;
		//MAXNUM=1999;
		System.out.println(MAXNUM);
	}
	public static void main10(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);
		System.out.println(c);
	}
	public static void main9(String[] args) {
		int i = 2147483647+1;
		int i2=Integer.MAX_VALUE+1;
		System.out.println(i);
		System.out.println(i2);
		/*byte a = 127+1;
		byte b =Byte.MAX_VALUE+1;
		System.out.println(a);
		System.out.println(b);*/
	}
	public static void main8(String[] args) {
		boolean flg = true;
		System.out.println(flg);
	}
	public static void main7(String[] args) {
		byte a = 10;
		byte b = 20;
		System.out.println(a+" "+b);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE+1);
	}
	public static void main6(String[] args) {
		char ch1 = 'a';
		char ch2 = '先';
		char ch3 = 97;
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);

	}
	public static void main5(String[] args) {
		short sh = 10;
		System.out.println(sh);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}
	
	public static void main4(String[] args) {
		float a = 1.3f;
		System.out.println(a);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
	}
	public static void main3(String[] args) {
		double a = 12.5;
		System.out.println(a);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		int b = 1;
		int c = 2;
		System.out.println(b/c);
		double num = 1.1;
		System.out.println(num*num);
		
	}
	public static void main2(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("kaixin");
		
	}
	public static void main1(String[] args) {
		long a = 10L;
        System.out.println("a的值是： "+a);
        System.out.println("最大值："+Long.MAX_VALUE);
        System.out.println("最小值："+Long.MIN_VALUE);
        int b = 10;
		int c = 20;
		System.out.println(b + c);
		System.out.println("hhh" + b + c);
		System.out.println("hhh" + (b + c));
	}
}