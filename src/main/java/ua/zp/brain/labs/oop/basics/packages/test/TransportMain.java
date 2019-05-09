package ua.zp.brain.labs.oop.basics.packages.test;

import ua.zp.brain.labs.oop.basics.packages.transport.Passport;
//import ua.zp.brain.labs.oop.basics.packages.transport.PassportUtil;

public class TransportMain {
    public static void main(String[] args) {
        Passport passport=new Passport();
        passport.changeOwner("Ivanov");
    }
}
