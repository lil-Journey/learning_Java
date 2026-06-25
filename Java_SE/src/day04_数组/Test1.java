package day04_数组;

/*请使用静态初始化的方式,创建一个长度为5的整数数组,并为数组中的元素赋值,
遍历数组,在同一行打印所有元素,元素之间用空格隔开,
比如:如果数组为{1,2,3,4,5}打印结果:1 2 3 4 5*/
public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};//Java语法规范 要指定大小需要用new创建
        for (int i : arr) { //for each的i本身代表索引值 也就是arr[i]
            System.out.print(i + " "); //这里输出的i就等于传统for的arr[i]
        }
    }
}
