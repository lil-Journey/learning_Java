package day06_方法_面向对象;

import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) {
        Test07_MyArrays Array = new Test07_MyArrays();
        int[] arr = {1, 7, 3, 8, 132, 84576, 123, 87, 2345};
        Array.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));

        int value = 87;
        int index = Array.indexOf(arr, value);
        System.out.println("arrIndex = " + index);

        int len = 5;
        int[] arr1 = Array.copy(arr, len);
        System.out.println("NewArr = " + Arrays.toString(arr1));
    }
}
