package day06_方法_面向对象;

public class Test06 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(a + "+" + b + "=" + Test06_MathTools.add(a, b));
        System.out.println(a + "-" + b + "=" + Test06_MathTools.sub(a, b));
        System.out.println(a + "*" + b + "=" + Test06_MathTools.mul(a, b));
        System.out.println(a + "/" + b + "=" + Test06_MathTools.div(a, b));
        System.out.println(a + "%" + b + "=" + Test06_MathTools.mod(a, b));
        System.out.println(a + "," + b + "的最大值：" + Test06_MathTools.max(a, b));
        System.out.println(a + "," + b + "的最小值：" + Test06_MathTools.min(a, b));
        System.out.println(a + "==" + b + "？" + Test06_MathTools.equals(a, b));
        System.out.println(a + "是偶数？" + Test06_MathTools.isEven(a));
        System.out.println(a + "是素数？" + Test06_MathTools.isPrime(a));
        System.out.println("5.4四舍五入的结果：" + Test06_MathTools.round(5.4));
        System.out.println("5.6四舍五入的结果：" + Test06_MathTools.round(5.6));
    }
}
