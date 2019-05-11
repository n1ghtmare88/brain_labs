package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;

import java.util.Date;

public class Human {
    private String name;
    private Date birthday;
    private String phoneNumber;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void sayHello() {
        System.out.println(getName()+":Hello my name is "+name+".");
    }
    public void sayGoodbye(){
        System.out.println(getName()+":Goodbye!!!");
    }

    @Override
    public String toString() {
        return name+" "+phoneNumber;
    }
}
