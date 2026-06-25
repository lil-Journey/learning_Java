package day04_数组;

//现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的最小值并打印。
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {100, 50, 90, 60, 80, 70};
        int min = arr[0];
        for (int i : arr) {
            if (i < min) { //i依旧是arr[i]
                min = i;
            }
        }
        System.out.println("min = " + min);
    }
}
