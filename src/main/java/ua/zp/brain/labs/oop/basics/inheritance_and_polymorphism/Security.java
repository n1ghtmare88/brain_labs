/**
 * @autor Дмитрий Евтушенко
 * @version 1.0
 * Этот класс Охрана
 */
package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;
import java.time.LocalDate;

public final class Security extends Employee {

    public Security(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public Security(String name, String phoneNumber,LocalDate birthday, LocalDate employmentDate, double salary, boolean isPresence){
        this(name,phoneNumber);
        setBirthday(birthday);
        setEmploymentDate(employmentDate);
        setSalary(salary);
        setPresence(isPresence);
    }

    @Override
    public void makeWork() {
        talk();
    }

    @Override
    public String toString() {
        return super.toString()+"\n";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void talk(){
        System.out.println(getName()+":talk on the radio");
    }
}
