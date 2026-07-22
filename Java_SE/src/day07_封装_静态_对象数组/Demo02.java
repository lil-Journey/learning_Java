package day07_封装_静态_对象数组;

public class Demo02 {
    public static void main(String[] args) {
        Demo02_Person Person = new Demo02_Person();
        Person.setName("snoop dog");
        Person.setAge(66);
        System.out.println(Person.getName() + " is " + Person.getAge());
    }
}
