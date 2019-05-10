package ua.zp.brain.labs.oop.basics.packages.test;

import ua.zp.brain.labs.oop.basics.packages.citizen.Passport;
import ua.zp.brain.labs.oop.basics.packages.citizen.PassportUtil;
import  static ua.zp.brain.labs.oop.basics.packages.citizen.PassportUtil.*;

public class CitizenMain {
    public static void main(String[] args) {
        Passport passport=new Passport();
        Passport passport1=new Passport();
        passport.setId(100);
        passport1.setId(200);

        marriageRegistrate(passport,passport1);

    }
}
