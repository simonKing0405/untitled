package Interface.exercise;

public class PingpongPlayer extends Player implements Speak {

    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "PingpongPlayer{}";
    }

    @Override
    public void study() {
        System.out.println("打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("学外语");
    }
}
