package day06_方法_面向对象;
//在main方法中定义数组,传递到另外一个方法中,在此方法中实现获取数组最大值
public class Demo05 {
    public static void main(String[] args) {
        int[] arr = {207, 19, 5, 477, 0};
        System.out.println(getMax(arr));
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
