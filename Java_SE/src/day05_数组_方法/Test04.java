package day05_数组_方法;

import java.util.Random;

/*利用随机数产生一组双色球,其实就是由两组指定范围的的数字组成
	1.有6个红球: 1到33 包含1和33	[1,33] -> [0,32] + 1 -> [0,33) + 1-> r.nextInt(33)+1
        2.有1个蓝球: 1到16 包含1和16	[1,16] -> [0,15] + 1 -> [0,16) + 1-> r.nextInt(16)+1
        3.这7个数字打印在一行上每个数字之间用空格隔开

打印效果如下:
        13 1 8 13 19 15 10*/
public class Test04 {
    public static void main(String[] args) {
        int[] nums = new int[7];
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1)
                nums[i] = redBall();
            else
                nums[i] = blueBall();
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static int redBall() {
        Random random = new Random();
        int redNum = random.nextInt(33) + 1;
        return redNum;
    }
    public static int blueBall() {
        Random random = new Random();
        int blueNum = random.nextInt(16) + 1;
        return blueNum;
    }
}
