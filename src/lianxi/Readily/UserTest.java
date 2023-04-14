package lianxi.Readily;

public class UserTest {
    public static void main(String[] args) {
        User user_1 = new User("liyapeng", "3212", "男", "@lyp123456", 18);
        System.out.println((user_1.toString()));
        User user_2 = new User();
        user_2.setName("zhangsan");
        user_2.setEmal("3212254745@qq.com");
        user_2.setGender("nan");
        user_2.setAge(18);
        user_2.setPassward("lyp123456");

        System.out.println(user_1.getAge());

    }
}
