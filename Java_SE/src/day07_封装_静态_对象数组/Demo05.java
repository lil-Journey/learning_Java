package day07_封装_静态_对象数组;

public class Demo05 {
    public static void main(String[] args) {
        Demo05 demo05 = new Demo05();
        demo05.method01(); //要调用得new对象使用
        method03();
    }
    public void method01() {
        System.out.println("静态不能直接调用非静态");
        method02();
        method04();
    }

    public static void method02() {
        System.out.println("非静态可以直接调用静态");
    }
    public static void method03() {
        System.out.println("静态可以直接调用静态");
    }

    public void method04() {
        System.out.println("非静态可以调用非静态");
    }
}
