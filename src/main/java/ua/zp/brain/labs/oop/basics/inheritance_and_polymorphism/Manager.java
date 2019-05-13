/**
 * @autor Дмитрий Евтушенко
 * @version 1.0
 * Этот класс Менеджер
 */
package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;
import java.time.LocalDate;

public final class Manager extends Employee {
    private String group;

    {
        group="Sales Department";
    }

    public Manager(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public Manager(String name, String phoneNumber, LocalDate birthday,LocalDate employmentDate,double salary,boolean isPresence,String group){
        this(name,phoneNumber);
        setBirthday(birthday);
        setEmploymentDate(employmentDate);
        setSalary(salary);
        setPresence(isPresence);
        this.group=group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void makeWork() {
        consult();
        sayDiscount();
        advice();
    }

    @Override
    public String toString() {
        return super.toString()+"Group = "+group+"\n";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void consult(){
        System.out.println(getName()+":talk about the product");
    }
    public void sayDiscount(){
        System.out.println(getName()+":talk about discounts");
    }
    public void advice(){
        System.out.println(getName()+":give advice");
    }
}
