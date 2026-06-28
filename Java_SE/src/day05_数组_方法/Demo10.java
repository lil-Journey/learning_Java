package day05_数组_方法;

public class Demo10 {
    public static void main(String[] args) {
        System.out.println(addNum());//打印调用
        //赋值调用
        int sum = addNum();
        System.out.println(sum);
    }

    public static int addNum() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }
}
