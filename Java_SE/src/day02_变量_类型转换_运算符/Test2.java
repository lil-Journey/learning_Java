package day02_变量_类型转换_运算符;
public class Test2 {
    public static void main(String[] args) {
        int i1 = 100;
        long l1 = 200;
        long add = i1 + l1;
        System.out.println(add);

        long l2 = 100000L;
        float f2 = 44.89f;
        float add2 = l2 + f2;
        System.out.println(add2);

        int i3 = 345;
        double d3 = 12.8345;
        double add3 = i3 + d3;
        System.out.println(add3);

        float f4 = 103.65f;
        double d4 = 2.5999999999;
        double add4 = f4 + d4;
        System.out.println(add4);
    }
}