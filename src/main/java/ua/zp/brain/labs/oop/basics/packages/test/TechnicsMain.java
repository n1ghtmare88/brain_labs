package ua.zp.brain.labs.oop.basics.packages.test;

import ua.zp.brain.labs.oop.basics.packages.technics.Passport;
import ua.zp.brain.labs.oop.basics.packages.technics.PassportUtil;

public class TechnicsMain {
    public static void main(String[] args) {
        Passport passport=new Passport();
        PassportUtil.warrantyReplace(passport);
    }
}
