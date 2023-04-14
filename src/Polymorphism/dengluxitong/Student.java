package Polymorphism.dengluxitong;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println("学生姓名：" + getName() + " " + "学生年龄：" + getAge());
    }

    public String toString() {
        return "Student{}";
    }
}
