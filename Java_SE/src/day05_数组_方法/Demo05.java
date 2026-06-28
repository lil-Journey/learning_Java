package day05_数组_方法;

import java.util.Arrays;

//定义一个数组:int[] arr1 = {1,2,3,4,5}
//将数组由原来的长度扩容到10
public class Demo05 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[10];
        //将arr1的值给arr2
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr1 = arr2; //偷梁换柱 把arr2的地址给arr1
        System.out.println(arr1.length);
        System.out.println(Arrays.toString(arr1));
    }
}
