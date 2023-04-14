package Interface.exercise;

public abstract class Player extends Person {

    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Player{}";
    }

    public abstract void study();
}
