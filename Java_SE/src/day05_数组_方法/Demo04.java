package day05_数组_方法;
//键盘录入一个整数,找出整数在数组中存储的索引位置
//如果查不到,输出对应的提示(一般我们输出负数)
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.print(i + " ");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("-1");
        }
    }
}
