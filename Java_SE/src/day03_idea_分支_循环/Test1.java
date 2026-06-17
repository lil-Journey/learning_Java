package day03_idea_分支_循环;
import java.util.Scanner;

//让用户依次录入三个整数，求出三个数中的最大值，并打印到控制台。【使用if】
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a; //不能将max初始化为0 如果数值为负数0直接为最大值
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max);
    }
}
