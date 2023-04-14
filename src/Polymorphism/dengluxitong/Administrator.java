package Polymorphism.dengluxitong;

public class Administrator extends Person {

    public Administrator() {
    }

    public Administrator(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Administrator{}";
    }

    @Override
    public void show() {
        System.out.println("管理员姓名：" + getName() + " " + "管理员年龄：" + getAge());
    }
}
