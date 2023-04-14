package Interface.exercise;

public class PingpongCoach extends Coach implements Speak {

    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "PingpongCoach{}";
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("学外语");
    }
}
