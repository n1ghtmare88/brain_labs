/**
 * @autor Дмитрий Евтушенко
 * @version 1.0
 * Этот класс Пицца
 */
package ua.zp.brain.labs.oop.basics.consructors;

import java.util.Arrays;

public class Pizza {
    private Circle basic;
    private String composition;
    private String name;
    private double coast;

    public Pizza(String name, String composition, double coast, double diameter) {
        basic = new Circle(diameter);
        this.composition = composition;
        this.name = name;
        this.coast = coast;
    }

    public Circle getBasic() {
        return basic;
    }

    public void setBasic(Circle basic) {
        this.basic = basic;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "diameter=" + basic.getRadius() +
                ", composition=" + composition +
                ", name='" + name + '\'' +
                ", coast=" + coast +
                '}';
    }
}
