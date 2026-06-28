package day05_数组_方法;

import java.util.Scanner;

//用一个数组存储字符串，从键盘输入，并遍历显示
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            System.out.print("请输入:");
            str[i] = sc.nextLine();
        }
        for (String s : str ){ //增强for输出
            System.out.println(s);
        }
    }
}
