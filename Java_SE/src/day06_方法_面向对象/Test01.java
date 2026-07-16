package day06_方法_面向对象;

public class Test01 {
    public static void main(String[] args) {
        Test01_employee Employee1 = new Test01_employee();
        Employee1.id = 1;
        Employee1.name = "James";
        Employee1.age = 23;
        Employee1.price = 10000;
        System.out.println("Employee1:\n" + Employee1.id + "\n" + Employee1.name + "\n" + Employee1.age + "\n" + Employee1.price);

        Test01_employee Employee2 = new Test01_employee();
        Employee2.id = 2;
        Employee2.name = "sleep";
        Employee2.age = 28;
        Employee2.price = 12000;
        System.out.println("Employee2:\n" + Employee2.id + "\n" + Employee2.name + "\n" + Employee2.age + "\n" + Employee2.price);
    }
}
