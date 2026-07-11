package day06_方法_面向对象;
//在main方法中定义一个数组,将数组传递到方法中,在此方法中遍历数组
//
//方法名:要
//参数:要 数组类型
//返回值:不要
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        array(arr);
    }
    public static void array(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    };
}
