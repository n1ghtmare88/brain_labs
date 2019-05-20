package ua.zp.brain.labs.oop.basics.abstracts_and_interfaces.interfaces;

public interface MailSender {
    String createMail(String body);
    void sendMail(String body);
}
