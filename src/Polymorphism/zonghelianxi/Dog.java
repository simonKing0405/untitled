package Polymorphism.zonghelianxi;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public String toString() {
        return "Dog{}";
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的狗死死地抱住" + something + "猛吃");
    }

    public void behavior() {
        System.out.println("看家");
    }
}
