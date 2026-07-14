package day06_方法_面向对象;

public class Demo09 {
    public static void main(String[] args) {
        Demo09_phone phone = new Demo09_phone();
        phone.brand = "Apple";
        phone.color = "white";
        phone.price = 599;

        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.price);

        phone.call("Tim cook");
        String message = phone.message("Tim cook");
        System.out.println(message);
    }
}
