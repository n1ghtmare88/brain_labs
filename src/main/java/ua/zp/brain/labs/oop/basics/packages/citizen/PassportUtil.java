package ua.zp.brain.labs.oop.basics.packages.citizen;

public class PassportUtil {
    private PassportUtil() {
        //close constructor
    }
    public static void marriageRegistrate(Passport passport1,Passport passport2){
        passport1.setId(passport2.getId());
        passport2.setId(passport1.getId());
    }
}
