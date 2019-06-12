/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.collections;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String phoneNumber;


    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(phoneNumber, user.phoneNumber);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, phoneNumber);
    }
}
