/**
 * @autor Дмитрий Евтушенко
 * @version 1.0
 * Этот класс является демонстацией работы 2х классов(Пицца,Круг)
 */
package ua.zp.brain.labs.oop.basics.consructors;

public class Pizzeria {
    public static void main(String[] args) {
        String[] composition = {"cheese", "chicken", "mushroom", "tomato", "eggs"};
        String[] name = {"admiral", "tehas", "margarita", "neapol", "devil"};
        Pizza[] pizzas = new Pizza[5];
        for (int i = 0; i < pizzas.length; i++) {
            pizzas[i] = new Pizza(name[i], composition[i], 50.5 + i, 5.5 + i);
            System.out.println(pizzas[i]);
        }

        Circle circle=new Circle(7.5,"black");
        System.out.println(circle);
    }
}
