package ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.classes;

import ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.interfaces.Caller;

public final class DialPhone extends Phone implements Caller {
    private boolean hasAnswerPhone;

    public boolean isHasAnswerPhone() {
        return hasAnswerPhone;
    }

    public void setHasAnswerPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }


    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }

    public void autoAnswer(){

    }

    @Override
    public void call() {
        System.out.println("calling");
    }
}
