package day07_封装_静态_对象数组;

public class Demo12 {
    public static void main(String[] args) {
        int result = method(12);
        System.out.println(result);
    }

    public static int method(int n) {
        if (n == 1 || n == 2)
            return 1;
        return method(n - 1) + method(n - 2);
    }
}
