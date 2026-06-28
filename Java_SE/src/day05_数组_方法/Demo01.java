package day05_数组_方法;
//随机产生10个[0,100]之间整数，统计既是3又是5，但不是7的倍数的个数

import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        Random rand = new Random(); //创建随机对象
        int count = 0; //初始化计数器
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101); //为数组赋随机数
            //if写在这里只需要循环一次更高效 如果分开写可读性更高
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0 && arr[i] % 7 != 0) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
