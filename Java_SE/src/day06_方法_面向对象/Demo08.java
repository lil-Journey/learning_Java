package day06_方法_面向对象;

public class Demo08 {
    public static void main(String[] args) {
        Demo08_Person person = new Demo08_Person();
        person.name = "名字";
        person.age = 18;
        person.eat();
        person.drink();
        person.sleep();
        System.out.println(person.name);
        System.out.println(person.age);
    }
}
