package ua.zp.brain.labs.oop.basics.abstracts_and_interfaces;

import ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.classes.AbstractDevice;
import ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.classes.Phone;
import ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.classes.SmartPhone;

public class Main {
    public static void main(String[] args) {
        SmartPhone nokia=new SmartPhone("Nokia ","Windows");
        SmartPhone samsung=new SmartPhone("Samsung ","Windows");
        SmartPhone lg=new SmartPhone("LG ","Windows");
        SmartPhone xiaomi=new SmartPhone("Xiaomi ","Windows");
        test(nokia,xiaomi,samsung,xiaomi,lg);

    }
    public static void test(AbstractDevice ...devices){
        for (AbstractDevice a:devices) {
            a.powerOff();
        }

    }
}
