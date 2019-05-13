/**
 * @autor Дмитрий Евтушенко
 * @version 1.0
 * Этот класс Клиент
 */
package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;
import java.time.LocalDate;


public final class Client extends Human {
    private String numberCard;
    private double money;

    {
        numberCard="9999-8888-7777-6666";
        money=1000;
    }

    public Client(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public Client(String name, String phoneNumber, LocalDate birthday, String numberCard, double money){
        this(name,phoneNumber);
        setBirthday(birthday);
        this.numberCard=numberCard;
        this.money=money;

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
        return super.toString()+"NumberCard = "+numberCard+"\nMoney = "+money+"\n";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void aboutProduct(){
        System.out.println(getName()+":Please say me about this product?");
    }

    public void buy(){
        System.out.println(getName()+":I want buy this product!!!");
    }
}
