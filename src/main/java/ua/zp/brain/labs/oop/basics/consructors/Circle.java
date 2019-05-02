/**
 * @autor Дмитрий Евтушенко
 * @version 1.0
 * Этот класс Круг
 */
package ua.zp.brain.labs.oop.basics.consructors;

public class Circle {
    private double radius;
    private double length;
    private double square;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
        square = Math.pow(radius, 2) * Math.PI;
        length = 2 * Math.PI * radius;
    }

    public Circle(double radius, String color) {
        this(radius);
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", length=" + length +
                ", square=" + square +
                ", color='" + color + '\'' +
                '}';
    }
}
