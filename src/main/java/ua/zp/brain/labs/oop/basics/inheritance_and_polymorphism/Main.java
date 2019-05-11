package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;

public class Main {
    public static void main(String[] args) {
        Shop shop=new Shop("ATB","г.Запорожье ул.Чариная 1");
        shop.setManager(new Manager("Anton","+38050-111-11-11"));
        shop.setCashier(new Cashier("Galina Petrovna","+38050-222-22-22"));
        shop.setSecurity(new Security("Ivan Vladimirovich","+38050-333-22-22"));
        shop.setClient(new Client("Nikolay","+38050-999-99-99"));
        //System.out.println(shop);
        //shop.getManager().makeWork();
        //shop.getCashier().makeWork();
        //shop.getSecurity().makeWork();
        shop.open();
        shop.open();
        shop.open();
    }


}
