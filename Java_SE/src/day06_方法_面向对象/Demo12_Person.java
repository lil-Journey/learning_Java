package day06_方法_面向对象;

public class Demo12_Person {
    private String name;
    private int age;

    public String getName() { //提供get方法
        return name;
    }

    public void setName(String Name) {
        name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        if (Age < 0 || Age > 100) {
            System.out.println("age is out of range");
            age = 0;
        } else {
            age = Age;
        }
    }
}
