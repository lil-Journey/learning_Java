package day02_变量_类型转换_运算符;
public class Test4 {
    public static void main(String[] args) {
        int a1 = 10, a2 = 11;
        System.out.println("偶数：" + (a1 % 2 == 0 ? true : false));
        System.out.println("偶数：" + (a2 % 2 == 0 ? true : false));
        int a3 = 12, a4 = 13;
        System.out.println("奇数：" + (a3 % 2 == 1 ? true : false));
        System.out.println("奇数：" + (a4 % 2 == 1 ? true : false));
    }
}
