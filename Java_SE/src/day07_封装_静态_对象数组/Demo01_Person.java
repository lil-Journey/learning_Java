package day07_封装_静态_对象数组;

public class Demo01_Person {
    String name;

    public void speak(String name) {
        System.out.println(this + " = this"); //this指向Person Person调用this 谁调用this就指向谁
        System.out.println(this.name + " " + name);// equal Person.name
    }
}
