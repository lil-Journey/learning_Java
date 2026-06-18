package day03_idea_分支_循环;
/*1.功能描述：模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果*/
/*	2.要求：*/
/*        (1)键盘录入三个整数,其中前两个整数代表参加运算的数据，*/
/*第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)*/
/*		(2)使用今天所学知识完成功能*/
/*        (3)演示格式如下1:*/
/*请输入第一个整数:30*/
/*请输入第二个整数:40*/
/*请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0*/
/*控制台输出:70*/

import java.util.Scanner;

import static java.lang.System.exit;

/*演示格式如下2:*/
/*请输入第一个整数:30*/
/*请输入第二个整数:40*/
/*请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):1*/
/*控制台输出:-10*/
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数:");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个整数:");
        int num2 = sc.nextInt();
        System.out.print("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):");
        int symbol = sc.nextInt();
        int result = 0;
        switch (symbol) {
            case 0:
                result = num1 + num2;
                break;
            case 1:
                result = num1 - num2;
                break;
            case 2:
                result = num1 * num2;
                break;
            case 3:
                if (num2 == 0) {
                    System.out.println("除数不能为0");
                    exit(0);
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("请输入正确的数字");
                exit(0);
        }
        System.out.println("控制台输出:" + result);
    }
}
