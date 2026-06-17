package day02_变量_类型转换_运算符;

public class Test1 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        short s1 = 1000;
        short s2 = 2000;
        short s3 = (short) (s1 + s2);
        System.out.println(s3);

        char c1 = 'a'; //little letter a = 97
        int i1 = 30;
        int ch3 = c1 - i1;
        System.out.println(ch3);
    }
}
