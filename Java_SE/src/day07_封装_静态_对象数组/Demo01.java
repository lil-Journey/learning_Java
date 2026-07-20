package day07_封装_静态_对象数组;

public class Demo01 {
    public static void main(String[] args) {
        Demo01_Person Person = new Demo01_Person();
        System.out.println(Person + " = Person");
        Person.name = "messi";
        Person.speak("Ronaldo");

        Demo01_Person Person01 = new Demo01_Person();
        System.out.println(Person01 + " = Person01");
        Person01.name = "Niko";
        Person01.speak("m0nesy");
    }
}
