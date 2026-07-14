package day06_方法_面向对象;

public class Demo10_Animal {
    String name;
    String color;

    public void eat(String name, String food){
        System.out.println(name + " eat " + food);
    }
    public String sleep(String name) {
        return name + " is sleeping";
    }
}
