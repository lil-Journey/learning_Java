package day06_方法_面向对象;

import java.util.Scanner;

//定义一个方法,给这个方法传几,就让这个方法循环打印几次"我是一个有经验的JAVA开发工程师"
//
//方法名:要
//参数:要
//返回值:不要
public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        loop(a);
    }

    public static void loop(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("我是一个有经验的JAVA开发工程师" + i);
        }
    }
}
