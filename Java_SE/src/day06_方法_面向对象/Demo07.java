package day06_方法_面向对象;

import java.util.Arrays;

//数组作为返回值返回 返回值只可返回一个值 要返回多个要用数组
public class Demo07 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnArr()));
    }

    public static int[] returnArr() {
        int a = 10;
        int b = 20;
        int c = 30;
        int[] arr = {a, b, c};
        return arr;
    }
}
