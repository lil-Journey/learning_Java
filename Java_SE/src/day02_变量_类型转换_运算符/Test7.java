package day02_变量_类型转换_运算符;

public class Test7 {
    public static void main(String[] args) {
        int week = 2;
        week += 100;
        week %= 7;
        System.out.println("周二的100天后是周" + week);
    }
}