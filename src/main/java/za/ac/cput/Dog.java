package za.ac.cput;

/*
 *@Author: Thina Mbiza
 * Student Number: 217217095
 * Date: 1 April 2021
 * This is the main class for the Dog class
 */
public class Dog {

    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", age=" + age + '}';
    }
}
