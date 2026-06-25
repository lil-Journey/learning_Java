package day04_数组;

//现有一个整数数组{100,50,90,60,80,70}。
//请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）
public class Test5 {
    public static void main(String[] args) {
        int[] arr = {100, 50, 90, 60, 80, 70};
        int max = arr[0];
        int min = arr[0];
        int average = 0;
        int sum = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            sum += i;
        }
        average = (sum - max - min) / (arr.length - 2);
        System.out.println("average = " + average);
    }
}
