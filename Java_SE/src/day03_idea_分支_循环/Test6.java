package day03_idea_分支_循环;
/*1.打印所有四位数中 个位 + 千位 == 百位 + 十位 的数字
    2.最后要打印符合条件的数字的总数量
   	3.打印格式如下:
        1010
        1021
        1032
        1043
        ....
以上满足条件的四位数总共有 615 个*/
public class Test6 {
    public static void main(String[] args) {
        int ge = 0, shi = 0, bai = 0, qian = 0, count = 0;
        for (int i = 1000; i <= 9999; i++){
            ge = i % 10;
            shi = i / 10 % 10;
            bai = i / 100 % 10;
            qian = i / 1000;
            if (ge + qian == bai + shi){
                System.out.println(i);
                count += 1;
            }
        }
        System.out.println("以上满足条件的四位数总共有 " + count + " 个");
    }
}
