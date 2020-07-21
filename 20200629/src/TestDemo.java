import java.util.*;

/**
 * @program: 20200629
 * @description: 练习
 * @author: HAOYI
 * @create: 2020-06-29-09:41
 **/
public class TestDemo {
    public static int binarySearch(int []array,int key){
        int left = 0;
        int right = array.length-1;
        while(left<=right){
            int mid = (left+right)>>>1;///2
            if(array[mid]<key){
                left = mid+1;
            }else if(array[mid]>key){
                right=mid-1;
            }else{
                return mid;
            }
        }
     return -1;
    }
    public static void main(String[] args) {
          int []array={2,4,7,8,9,14};
         /* int a = binarySearch(array,14);
           System.out.println("下标"+ a);*/
        System.out.println(Arrays.binarySearch(array, 14));
    }
    public static int Max(int []array) {
        int max = array[0];
        for (int i = 1; i < array.length-1 ; i++) {
                if (max < array[i]) {
                    max = array[i];
                }

        }
            return max;
    }

    public static void main3(String[] args) {
              int []array={12,3,45,7,8,19};
        System.out.println(Max(array));
    }
    public static void main2(String[] args) {
        int []array = {1,2,3,4,5,6,7};
        /*int []ret = new int[array.length] ;
        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));*/
        /*int []ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));*/
        int []ret =array.clone();
        System.out.println(Arrays.toString(ret));
    }
    public static int []copyArray(int []array){
        int []arr = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            arr[i] = array[i];
        }
           return arr;
    }
    public static void main1(String[] args) {
        int []array = {1,2,3,4,5,6,7};
        int []ret = copyArray(array);
        System.out.println(Arrays.toString(ret));
    }
}
