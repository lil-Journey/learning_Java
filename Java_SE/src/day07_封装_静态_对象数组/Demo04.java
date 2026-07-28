package day07_封装_静态_对象数组;

public class Demo04 {
    public static void main(String[] args) {
        Demo04_students.classRoom = "222";

        Demo04_students Students1 = new Demo04_students();
        Students1.name = "cola";
        System.out.println(Students1.name + " in " + Students1.classRoom);

        Demo04_students Students2 = new Demo04_students();
        Students2.name = "spring";
        System.out.println(Students2.name + " in " + Students2.classRoom);
        Demo04_students.study();
    }
}
