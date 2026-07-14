package day06_方法_面向对象;

public class Demo10 {
    public static void main(String[] args) {
        Demo10_Animal animal = new Demo10_Animal();
        animal.name = "panda";
        animal.color = "black and white";
        System.out.println(animal.name + " color is " + animal.color);

        animal.eat("panda","bamboo");
        String sleep =  animal.sleep("panda");
        System.out.println(sleep);
    }
}
