/**
 * @autor Дмитрий Евтушенко
 * @version 1.0
 * Этот класс Кассир
 */
package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;
import java.time.LocalDate;

public final class Cashier extends Employee {
    private int numberCashier=1;

    public Cashier(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public Cashier(String name, String phoneNumber, LocalDate birthday, LocalDate employmentDate, double salary, boolean isPresence,int numberCashier)
    {
        this(name,phoneNumber);
        setBirthday(birthday);
        setEmploymentDate(employmentDate);
        setSalary(salary);
        setPresence(isPresence);
        this.numberCashier=numberCashier;
    }

    public int getNumberCashier() {
        return numberCashier;
    }

    public void setNumberCashier(int numberCashier) {
        this.numberCashier = numberCashier;
    }

    @Override
    public void makeWork() {
        countMoney();
    }

    @Override
    public String toString() {
        return super.toString()+"NumberCashier = "+numberCashier+"\n";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void countMoney(){
        System.out.println(getName()+":count money");
    }
}
