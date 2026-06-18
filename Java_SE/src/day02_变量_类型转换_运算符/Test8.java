package day02_变量_类型转换_运算符;
public class Test8 {
    public static void main(String[] args) {
        int x = 123, y = 456, z = 234;
        int max = x > y ? x : y;
        max = max > z ? max : z;
        System.out.println("三个数中的最大值是：" + max);
    }
}