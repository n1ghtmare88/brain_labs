/**
 * @autor Дмитрий Евтушенко
 * @version 1.0
 * Этот класс Main
 */
package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("ATB", "г.Запорожье ул.Чариная 1");
        shop.setManager(new Manager("Anton", "+38-050-111-11-11"));
        shop.setCashier(new Cashier("Galina Petrovna", "+38-050-222-22-22"));
        shop.setSecurity(new Security("Ivan Vladimirovich", "+38-050-333-22-22"));
        shop.setClient(new Client("Nikolay", "+38-050-999-99-99"));
        
        shop.open();
        System.out.println("====================");

        shop.sell();
        System.out.println("====================");

        shop.lunch();
        System.out.println(shop);
    }
}
