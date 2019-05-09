package ua.zp.brain.labs.oop.basics.packages.transport;

class PassportUtil {
    private PassportUtil() {
        //close constructor
    }
    public static Passport changeOwner(Passport a,String newOwner){
        Passport passport=new Passport();
        passport.setId(a.getId());
        passport.setToday(a.getToday());
        passport.setName(newOwner);
        return passport;
    }
}
