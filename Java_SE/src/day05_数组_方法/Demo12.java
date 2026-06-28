package day05_数组_方法;

public class Demo12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean compare = compare(a, b);
        System.out.println(compare);
    }
    public static boolean compare(int a, int b){
        return a > b;
    }
}
