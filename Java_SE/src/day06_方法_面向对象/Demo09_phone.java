package day06_方法_面向对象;

public class Demo09_phone {
    String brand;
    String color;
    int price;

    public void call(String name){
        System.out.println("给" + name + "打电话");
    }
    public String message(String name){
        return "给" + name + "发短信";
    }
}
