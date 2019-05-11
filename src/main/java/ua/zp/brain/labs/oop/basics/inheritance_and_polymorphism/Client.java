package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;

public final class Client extends Human {
    private String numberCard;
    private double money;
    public Client(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void aboutProduct(){
        System.out.println(getName()+":Please say me about this product?");
    }
    public void buy(){
        System.out.println(getName()+":I want buy this product!!!");
    }
}
