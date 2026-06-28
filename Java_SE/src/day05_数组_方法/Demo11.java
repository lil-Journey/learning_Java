package day05_数组_方法;

public class Demo11 {
    public static void main(String[] args) {
        System.out.println(addNum(10,20));//打印
        //赋值
        int  sum = addNum(10,20);
        System.out.println(sum);
    }
    public static int addNum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
