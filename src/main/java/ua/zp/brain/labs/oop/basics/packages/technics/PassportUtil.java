package ua.zp.brain.labs.oop.basics.packages.technics;

import java.util.Date;

public class PassportUtil {
    private PassportUtil() {
        //close constructor
    }
    public static void warrantyReplace(Passport passport){
        passport.setWarrantyStartDate(new Date());
    }
}
