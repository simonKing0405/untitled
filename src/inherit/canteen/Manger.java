package inherit.canteen;

public class Manger extends Employee {
    private double bonus;


    public Manger() {
    }

    public Manger(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    /**
     * 获取
     *
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * 设置
     *
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Manger{bonus = " + bonus + "}";
    }

    @Override
    public void work() {
        System.out.println("工作（管理其他人）");
    }
}
