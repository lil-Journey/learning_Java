package day06_方法_面向对象;

public class Test02 {
    public static void main(String[] args) {
        Test02_MyDate birthday = new Test02_MyDate();
        birthday.year = 2000;
        birthday.month = 1;
        birthday.day = 1;
        System.out.println("birthday:" + birthday.year + "/" + birthday.month + "/" + birthday.day);

        Test02_MyDate company = new Test02_MyDate();
        company.year = 2008;
        company.month = 2;
        company.day = 2;
        System.out.println("company:" + company.year + "/" + company.month + "/" + company.day);

        Test02_MyDate graduation = new Test02_MyDate();
        graduation.year = 2026;
        graduation.month = 3;
        graduation.day = 3;
        System.out.println("graduation:" + graduation.year + "/" + graduation.month + "/" + graduation.day);
    }
}
