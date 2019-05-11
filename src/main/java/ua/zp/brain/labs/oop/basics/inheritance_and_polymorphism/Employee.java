package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;

import java.util.Date;

public class Employee extends Human {
    private Date employmentDate;
    private double salary;
    private boolean isPresence;
    public Employee(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isPresence() {
        return isPresence;
    }

    public void setPresence(boolean presence) {
        isPresence = presence;
    }
    public void comeToWork(){
        System.out.println("Come to work");
    }

    public void dinner(){
        System.out.println("I go for lunch");
    }

    public void makeWork(){
        System.out.println("I'm going to work");
    }
}
