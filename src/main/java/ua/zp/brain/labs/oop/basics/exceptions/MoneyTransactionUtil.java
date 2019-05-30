package ua.zp.brain.labs.oop.basics.exceptions;

public class MoneyTransactionUtil {
    private MoneyTransactionUtil() {
    }
    public static void sendTo(String sourceCard,String destinationCard,double amount)throws AccountException,MoneyValueExeption{

            if(sourceCard.equalsIgnoreCase(destinationCard)){
                throw new AccountException();
            }

            if(amount<=0 || amount>100_000){
                throw new MoneyValueExeption();
            }
        System.out.println("Сумма +"+amount+", со счета "+sourceCard+" успешно переведена на счет "+destinationCard);
    }
}
