package day05_数组_方法;
//定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
public class Test01 {
    public static void main(String[] args) {
        double a = 3.3;
        double b = 5.5;
        double min = compare(a, b);
        System.out.println("min = " + min);
    }

    public static double compare(double a, double b) {
        return a < b ? a : b;
    }
}
