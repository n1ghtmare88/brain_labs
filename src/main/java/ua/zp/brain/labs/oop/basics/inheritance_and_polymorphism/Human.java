/**
 * @autor Дмитрий Евтушенко
 * @version 1.0
 * Этот класс Человек
 */
package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;
import java.time.LocalDate;
import java.util.Objects;


public class Human {
    private String name;
    private LocalDate birthday;
    private String phoneNumber;

    {
        name = "Vasya";
        birthday=LocalDate.of(1980,1,1);
        phoneNumber = "+38(097)-111-11-11";
    }

    public Human(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void sayHello() {
        System.out.println(getName() + ":Hello my name is " + name + ".");
    }

    public void sayGoodbye() {
        System.out.println(getName() + ":Goodbye!!!");
    }

    @Override
    public String toString() {
        return "Name = "+name+"\nPhone = "+phoneNumber+"\nBirthday = "+birthday+"\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(phoneNumber, human.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }
}
