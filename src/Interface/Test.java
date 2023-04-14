package Interface;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog();
        f.setName("ring");
        f.setAge(1);
        System.out.println(f.getName() + " " + f.getAge());
        f.swim();
    }
}
