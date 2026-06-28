package day05_数组_方法;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] mergeArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergeArr[i] = arr1[i];
        }
        for (int i = arr1.length; i < mergeArr.length; i++) {
            mergeArr[i] = arr2[i - arr1.length];
        }
        System.out.println(Arrays.toString(mergeArr));
    }
}
