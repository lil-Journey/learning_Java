package day06_方法_面向对象;

public class Demo12 {
    public static void main(String[] args) {
        Demo12_Person Person = new Demo12_Person();
        Person.setName("James");
        Person.setAge(-26);
        String name = Person.getName();
        System.out.println("name = " + name);
        int age = Person.getAge();
        System.out.println("age = " + age);
    }
}
