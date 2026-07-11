package day06_方法_面向对象;

//求出1-100的和,并将结果返回
//
//方法名:要
//参数:要或者不要
//返回值:要
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(sum100());
    }

    public static int sum100() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
