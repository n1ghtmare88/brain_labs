package ua.zp.brain.labs.oop.basics.threds;

public class Car {
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

}
