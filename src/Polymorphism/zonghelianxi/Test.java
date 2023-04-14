package Polymorphism.zonghelianxi;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("老王", 35);
        Dog dog = new Dog(2, "黑色");
        p1.keepPet(dog, "骨头");

        Person p2 = new Person("小李", 35);
        Cat cat = new Cat(1, "黄色");
        p2.keepPet(cat, "鱼");
        /*Person p = new Person("老王", 35);
        Animal animal = new Animal(1, "blank");
        p.keepPet(animal, "鱼");*/

    }
}
