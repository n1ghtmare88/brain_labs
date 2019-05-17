package ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.classes;

public final class SmartPhone extends Mobile{
    private String os;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public SmartPhone(String name,String os) {
        setName(name);
        this.os = os;
    }

    @Override
    public String toString() {
        return super.toString()+"\nOS="+os;
    }

    public void runApp(){

    }

}
