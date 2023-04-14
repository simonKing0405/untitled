package inherit.dongwu;

public class Taidi extends Dog {
    public void rub() {
        System.out.println("蹭一蹭");
    }

    @Override//方法重写，当父类中的方法不能满足的时候
    public void eat() {
        super.eat();
    }
}

