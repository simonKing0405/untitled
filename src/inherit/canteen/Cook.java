package inherit.canteen;

public class Cook extends Employee {

    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    public String toString() {
        return "Cook{}";
    }

    @Override
    public void work() {
        System.out.println("工作(炒菜)");
    }
}
