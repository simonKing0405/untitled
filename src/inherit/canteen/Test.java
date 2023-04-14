package inherit.canteen;

/*
带有继承结构的标准Javabean类
1、经理
成员变量：工号，姓名，工资，管理奖金
成员方法：工作（管理其他人），吃饭（吃米饭）
2、厨师
成员变量：工号，姓名，工资
成员方法：工作（炒菜），吃饭（吃米饭）
* */
public class Test {
    public static void main(String[] args) {

        //创建一个经理
        Manger m = new Manger("A001", "wangzong", 8000, 2000);
        System.out.print(m.getId() + " ");
        System.out.print(m.getName() + " ");
        System.out.print(m.getSalary() + " ");
        System.out.println(m.getBonus());
        m.work();
        m.eat();


        //创建一个厨师
        Cook c = new Cook();
        c.setId("B001");
        c.setName("xiaoli");
        c.setSalary(12000);
        System.out.println(c.getId() + " " + c.getName() + " " + c.getSalary());
        c.eat();
        c.work();
    }
}
