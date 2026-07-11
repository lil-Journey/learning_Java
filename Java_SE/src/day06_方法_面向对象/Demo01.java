package day06_方法_面向对象;
//键盘录入一个整数,将整数传递到另外一个方法中,在此方法中判断这个整数的奇偶性
//        如果是偶数,方法返回"偶数"  否则返回"奇数"
//
//        方法三要素:
//        方法名:要
//        参数:要
//        返回:要

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String parity = parity(num);
        System.out.println(parity);
    }

    public static String parity(int num) {
        if (num % 2 == 0)
            return "偶数";
        else
            return "奇数";
    }
}
