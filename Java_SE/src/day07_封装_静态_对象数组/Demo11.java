package day07_封装_静态_对象数组;

public class Demo11 {
    public static void main(String[] args) {
        int result = method(5);
        System.out.println("result = " + result);
    }
    public static int method(int n){
        if(n==1 || n==0){
            return 1;
        }
        System.out.println("n = " + n);
        return n * method(n-1);
    }
}
