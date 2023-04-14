package lianxi.Readily;

public class User {
    private String name;
    private String emal;
    private String gender;
    private String passward;
    private int age;

    public User() {
    }

    public User(String name, String emal, String gender, String passward, int age) {
        this.name = name;
        this.emal = emal;
        this.gender = gender;
        this.passward = passward;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return emal
     */
    public String getEmal() {
        return emal;
    }

    /**
     * 设置
     *
     * @param emal
     */
    public void setEmal(String emal) {
        this.emal = emal;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return passward
     */
    public String getPassward() {
        return passward;
    }

    /**
     * 设置
     *
     * @param passward
     */
    public void setPassward(String passward) {
        this.passward = passward;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{name = " + name + ", emal = " + emal + ", gender = " + gender + ", passward = " + passward + ", age = " + age + "}";
    }
}
