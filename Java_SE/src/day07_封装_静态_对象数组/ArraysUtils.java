package day07_封装_静态_对象数组;


import java.util.Arrays;

public class ArraysUtils {
    private ArraysUtils() {
    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
