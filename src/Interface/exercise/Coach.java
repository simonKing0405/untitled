package Interface.exercise;

public abstract class Coach extends Person {

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Coach{}";
    }

    public abstract void teach();
}
