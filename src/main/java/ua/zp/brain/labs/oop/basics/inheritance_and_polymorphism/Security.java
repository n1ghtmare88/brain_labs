package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;

public final class Security extends Employee {
    public Security(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    @Override
    public void makeWork() {
        super.makeWork();
        talk();
    }
    public void talk(){
        System.out.println(getName()+" talk on the radio");
    }
}
