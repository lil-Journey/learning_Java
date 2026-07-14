package day06_方法_面向对象;

public class Demo11 {
    public static void main(String[] args) {
        Demo09_phone phone1 = new Demo09_phone();
        Demo09_phone phone2 = phone1;
        phone1.brand = "Apple";
        phone1.color = "Red";
        phone1.price = 599;
        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
        phone2.brand = "Sony";
        phone2.color = "black";
        phone2.price = 699;
        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
        System.out.println(phone2.brand);
        System.out.println(phone2.color);
        System.out.println(phone2.price);
    }
}
