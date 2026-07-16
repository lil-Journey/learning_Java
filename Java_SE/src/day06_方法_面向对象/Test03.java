package day06_方法_面向对象;

public class Test03 {
    public static void main(String[] args) {
        Test03_citizen Citizen1 = new Test03_citizen();
        Citizen1.name = "James";
        Citizen1.birthday = new Test02_MyDate();
        Citizen1.birthday.year = 2001;
        Citizen1.birthday.month = 1;
        Citizen1.birthday.day = 1;
        Citizen1.idCard = "123456";
        System.out.println(Citizen1.name + " " +
                Citizen1.birthday.year + "/" +
                Citizen1.birthday.month + "/" +
                Citizen1.birthday.day + " " + Citizen1.idCard);

        Test03_citizen Citizen2 = new Test03_citizen();
        Citizen2.name = "yalla";
        Citizen2.birthday = new Test02_MyDate();
        Citizen2.birthday.year = 1999;
        Citizen2.birthday.month = 2;
        Citizen2.birthday.day = 2;
        Citizen2.idCard = "987654";
        System.out.println(Citizen2.name + " " + Citizen2.birthday.year + "/" + Citizen2.birthday.month + "/" + Citizen2.birthday.day + " " + Citizen2.idCard);

    }
}
