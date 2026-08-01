package day07_封装_静态_对象数组;

public class Demo10 {
    public static void main(String[] args) {
        method(3);
    }
    public static void method(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        n--;
        method(n);
    }
}
