package Polymorphism.zonghelianxi;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public String toString() {
        return "Cat{}";
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫眯着眼睛侧着头" + "吃" + something);
    }

    public void behavior() {
        System.out.println("抓老鼠");
    }
}
