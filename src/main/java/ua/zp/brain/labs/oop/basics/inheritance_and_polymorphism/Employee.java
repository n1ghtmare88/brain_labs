/**
 * @autor Дмитрий Евтушенко
 * @version 1.0
 * Этот класс Сотрудник
 */
package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;
import java.time.LocalDate;

public class Employee extends Human {
    private LocalDate employmentDate;
    private double salary;
    private boolean isPresence;

    {
        employmentDate=LocalDate.now();
        salary=10000;
        isPresence=true;
    }

    public Employee(String name, String phoneNumber) {
        super(name, phoneNumber);

    }

    public Employee(String name,String phoneNumber,LocalDate birthday,LocalDate employmentDate,double salary,boolean isPresence){
        this(name,phoneNumber);
        setBirthday(birthday);
        this.employmentDate=employmentDate;
        this.salary=salary;
        this.isPresence=isPresence;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
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
        System.out.println(getName()+":Come to work");
    }

    public void dinner(){
        System.out.println(getName()+":I go for lunch");
    }

    public void makeWork(){
        System.out.println(getName()+" going to work");

    }

    @Override
    public String toString() {
        return super.toString()+"EmploymentDate = "+employmentDate+"\nSalary = "+salary+"\nisPresence = "+isPresence+"\n";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
