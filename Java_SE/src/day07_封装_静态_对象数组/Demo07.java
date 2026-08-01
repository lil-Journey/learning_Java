package day07_封装_静态_对象数组;

public class Demo07 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 9 ,2,8,1};
        sum(arr);
    }
    public static void sum(int...arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
