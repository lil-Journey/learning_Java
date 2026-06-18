package day03_idea_分支_循环;

import java.util.Scanner;

/*1.根据程序员的工龄(整数)给程序员涨工资(整数),程序员的工龄和基本工资通过键盘录入
    2.涨工资的条件如下：
        [10-15)     +20000
        [5-10)      +10000
        [3~5)       +5000
        [1~3)       +3000
        3.运行程序:
请输入作为程序员的你的工作的工龄:10
请输入作为程序员的你的基本工资为:60000
程序运行后打印格式
         	"您目前工作了10年，基本工资为 60000元, 应涨工资 20000元,涨后工资 80000元"*/
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入作为程序员的你的工作的工龄:");
        int workAge = sc.nextInt();
        System.out.println(" 请输入作为程序员的你的基本工资为:");
        int salary = sc.nextInt();
        int finalSalary = salary;
        if (workAge < 1) {
            finalSalary = salary;
        } else if (workAge < 3) {
            finalSalary = salary + 3000;
        } else if (workAge < 5) {
            finalSalary = salary + 5000;
        } else if (workAge < 10) {
            finalSalary = salary + 10000;
        } else if (workAge < 15) {
            finalSalary = salary + 20000;
        }
        System.out.println("您目前工作了" + workAge + "年，基本工资为 " + salary + "元, 应涨工资 " + (finalSalary - salary) + "元,涨后工资 " + finalSalary + "元");
    }
}
