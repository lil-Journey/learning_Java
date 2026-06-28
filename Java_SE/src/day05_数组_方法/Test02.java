package day05_数组_方法;
//定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
public class Test02 {
    public static void main(String[] args) {
        int a = 20;
        int b = 19;
        int c = 30;
        int max = compare(a, b, c);
        System.out.println(max);
    }

    public static int compare(int a, int b, int c) {
        int t = a > b ? a : b;
        int max = t > c ? t : c;
        return max;
    }
}
