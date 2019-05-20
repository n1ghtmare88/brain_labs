package ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.classes;

import ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.interfaces.Caller;
import ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.interfaces.EmailSender;

public final class SmartPhone extends Mobile implements Caller, EmailSender {
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

    @Override
    public void call() {

    }

    @Override
    public String editMail(String body) {
        return null;
    }

    @Override
    public String createMail(String body) {
        return null;
    }

    @Override
    public void sendMail(String body) {
        System.out.println(body);
    }
}
