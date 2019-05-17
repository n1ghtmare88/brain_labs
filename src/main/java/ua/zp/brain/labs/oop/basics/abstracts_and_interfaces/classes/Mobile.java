package ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.classes;

public class Mobile extends Phone{
    private int simCount;
    private String display;

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    protected void call() {

    }

    @Override
    public void powerOn() {
        System.out.println(getName()+":Device power ON!!!");
    }

    @Override
    public void powerOff() {
        System.out.println(getName()+":Device power OFF!!!");


    }
}
