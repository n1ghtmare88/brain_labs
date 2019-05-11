package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;

public final class Cashier extends Employee {
    private int numberCashier;
    public Cashier(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public int getNumberCashier() {
        return numberCashier;
    }

    public void setNumberCashier(int numberCashier) {
        this.numberCashier = numberCashier;
    }

    @Override
    public void makeWork() {
        super.makeWork();
        countMoney();
    }

    public void countMoney(){
        System.out.println(getName()+" count money");
    }
}
