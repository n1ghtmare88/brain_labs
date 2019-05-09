package ua.zp.brain.labs.oop.basics.packages.citizen;

public class PassportUtil {
    private PassportUtil() {
        //close constructor
    }
    public static void marriageRegistrate(Passport passport1,Passport passport2){
        passport1.setId(100);
        passport2.setId(200);
    }
}
