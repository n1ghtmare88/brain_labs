package ua.zp.brain.labs.oop.basics.abstracts_and_interfaces;

import ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.classes.AbstractDevice;
import ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.classes.Phone;
import ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.classes.SmartPhone;
import ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.interfaces.MailSender;

public class Main {
    public static void main(String[] args) {
        SmartPhone nokia=new SmartPhone("Nokia ","Windows");
        SmartPhone samsung=new SmartPhone("Samsung ","Windows");
        SmartPhone lg=new SmartPhone("LG ","Windows");
        SmartPhone xiaomi=new SmartPhone("Xiaomi ","Windows");
        test(nokia,xiaomi,samsung,xiaomi,lg);
        test2(nokia,xiaomi);


    }

    public static void test(AbstractDevice ...devices){
        for (AbstractDevice a:devices) {
            a.powerOff();
        }
    }

    public static void test2(MailSender ...mailSenders){
        for (MailSender a:mailSenders){
            a.sendMail("qqqq");
        }
    }
}
