package ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.classes;

abstract public class AbstractDevice {
    private String name=getClass().getSimpleName();
    private int serialNumber;

    public AbstractDevice() {

        powerOn();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "AbstractDevice{" +
                "name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }

    abstract public void powerOn();
    abstract public void powerOff();
}
