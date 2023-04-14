package Polymorphism.zonghelianxi;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
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
        return "Person{name = " + name + ", age = " + age + "}";
    }

    /*public void keepPet(Dog dog, String something) {
        System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + dog.getColor() + "的狗");
        dog.eat(something);
    }

    public void keepPet(Cat cat, String something) {
        System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + cat.getColor() + "的猫");
        cat.eat(something);*/

    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog) {
            System.out.println("年龄为" + age + "岁的" + getName() + "养了一只" + animal.getAge()
                    + "岁的的" + animal.getColor() + "修狗");
            animal.eat(something);
            ((Dog) animal).behavior();

        } else {
            System.out.println("年龄为" + age + "岁的" + getName() + "养了一只" + animal.getAge()
                    + "岁的的" + animal.getColor() + "修猫");
            animal.eat(something);
            ((Cat) animal).behavior();
        }
    }
}


