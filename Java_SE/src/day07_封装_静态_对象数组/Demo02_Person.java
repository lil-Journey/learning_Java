package day07_封装_静态_对象数组;

public class Demo02_Person {
    private String name;
    private int age;

    public String getName() { //提供get方法
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("age is out of range");
            this.age = 0;
        } else {
            this.age = age;
        }
    }
}
