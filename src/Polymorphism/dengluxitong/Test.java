package Polymorphism.dengluxitong;

public class Test {
    public static void main(String[] args) {
        Administrator a = new Administrator();
        a.setName("张三");
        a.setAge(40);
//        a.show();

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(30);
//        t.show();

        Student s = new Student("王五", 18);
//        s.show();

        registration(a);
        registration(t);
        registration(s);
    }

    public static void registration(Person p) {
        p.show();
    }
}
