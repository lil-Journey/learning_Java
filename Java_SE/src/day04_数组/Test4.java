package day04_数组;
//现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的最大值并打印
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {100,50,90,60,80,70};
        int max = arr[0]; //赋值第一个数组而不是0是避免元素全为负数
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("max = " + max);
    }
}
