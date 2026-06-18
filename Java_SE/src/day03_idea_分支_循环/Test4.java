package day03_idea_分支_循环;

import java.util.Scanner;

/*从键盘上录入一个大于100的三位数,打印出100到该数字之间满足如下要求的数字,数字的个数,以及数字的和:
        1.数字的个位数不为7;
		2.数字的十位数不为5;
		3.数字的百位数不为3;*/
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 100; i <= num; i++){
            if(i / 100 != 3){
                if(i / 10 % 10 != 5){
                    if(i % 10 != 7){
                        System.out.println(i);
                        sum += i;
                        count++;
                    }
                }
            }
        }
        System.out.println("个数" + count + "数字的和" + sum);
    }
}
