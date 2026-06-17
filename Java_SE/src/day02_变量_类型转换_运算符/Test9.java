package day02_变量_类型转换_运算符;
public class Test9 {
    public static void main(String[] args) {
        int year = 2026;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if(isLeapYear){
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "不是闰年");
        }
    }
}