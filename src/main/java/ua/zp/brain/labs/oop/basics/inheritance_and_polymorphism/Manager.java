package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;

public final class Manager extends Employee {
    private String group;
    public Manager(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void makeWork() {
        super.makeWork();
        consult();
        sayDiscount();
        advice();
    }

    public void consult(){
        System.out.println(getName()+" talks about the product");
    }
    public void sayDiscount(){
        System.out.println(getName()+" talk about discounts");
    }
    public void advice(){
        System.out.println(getName()+" give advice");
    }
}
