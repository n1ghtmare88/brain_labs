package ua.zp.brain.labs.oop.basics.packages.transport;

import java.util.Date;

public class Passport {
    private String name;
    private int id;
    private Date today;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
    public Passport changeOwner(String newOwner){
        return PassportUtil.changeOwner(this,newOwner);
//        Passport passport=new Passport();
//        passport.setId(a.getId());
//        passport.setToday(a.getToday());
//        passport.setName(newOwner);
//        return passport;
    }
}
