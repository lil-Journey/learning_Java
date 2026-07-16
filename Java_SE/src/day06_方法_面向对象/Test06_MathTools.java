package day06_方法_面向对象;

public class Test06_MathTools {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static int max(int a, int b) {
        return Math.max(a, b);
    }

    static int min(int a, int b) {
        return Math.min(a, b);
    }

    static boolean equals(int a, int b) {
        return a == b;
    }

    static boolean isEven(int a) {
        return a % 2 == 0;
    }

    static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 3; i * i <= a; i += 2) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int round(double d) {
        return Math.toIntExact(Math.round(d));
    }
}
