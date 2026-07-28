package day07_封装_静态_对象数组;


public class ArraysUtils {
    private ArraysUtils() {
    }

    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i != arr.length - 1) {
                System.out.print(",");
            } else {
                System.out.print("]");
            }
        }
    }
}
