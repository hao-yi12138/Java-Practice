import java.util.Arrays;

/**
 * @program: 20200722
 * @description:练习
 * @author: HAOYI
 * @create: 2020-07-28
 **/
public class TestDemo {
    public static void reverse(int []array){
        int left = 0;
        int right = array.length-1;
        while(left<right){
            int mid = array[left];
            array[left] = array[right];
            array[right]=mid;
            left++;
            right--;
        }
    }
    public static void main4(String[] args) {
        int [] array = {1,2,3,4,5,6,7};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int []array){
        boolean flag = false;
        for (int i = 0; i <array.length-1 ; i++) {
               flag = false;
            for (int j = 0; j <array.length-1-i ; j++) {
                if(array[j]>array[j+1]){
                    int mid = array[j];
                    array[j]=array[j+1];
                    array[j+1]=mid;
                    flag = true;
                }
                if(flag = false){
                    break;
                }
            }
        }
    }
    public static void main3(String[] args) {
        int []array = {12,25,14,6,34,74,29};
          bubbleSort(array);
        System.out.println(Arrays.toString(array));//冒泡排序
    }
    public static boolean isUp(int []array){
        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        int []array = {1,2,3,9,5,6,7};
        System.out.println(isUp(array));//判断数组是否升序
    }
    public static void main1(String[] args) {
        int []array = {1,45,67,23,41,90,8};
         Arrays.sort(array);
        System.out.println(Arrays.toString(array));//排序
         /*  int []array = new int[10];
        Arrays.fill(array,2,7,5);
        System.out.println(Arrays.toString(array));*///填充
      /*  int []array = {1,2,3,4,5,6,7,8,9};
        int []array2 = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.equals(array, array2));*/
        /*int [] ret = Arrays.copyOfRange(array, 3, 7);//（拷贝）左闭右开
        System.out.println(Arrays.toString(ret));*/
        //System.out.println(Arrays.binarySearch(array, 2,7,6 ));//左闭右开
    }
}
