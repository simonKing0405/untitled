package Interface.exercise;

public class BasketballPlayer extends Player {

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "BasketballPlayer{}";
    }

    @Override
    public void study() {
        System.out.println("打篮球");
    }
}
