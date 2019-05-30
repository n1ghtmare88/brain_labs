package ua.zp.brain.labs.oop.basics.exceptions;

public class UserBank {
    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo("1111-1111-1111-1111","1111-1111-1111-1111",200);
            //MoneyTransactionUtil.sendTo("1111-1111-1111-1111","2222-2222-222-2222",-5);
        }catch (AccountException e){
            System.out.println("Ошибка с реквизитами банка.\n" +
                    "Возможно, номер карты отправителя и получателя совпадают");
        }catch (MoneyValueExeption e){
            System.out.println("Ошибка с суммой отправки.\n" +
                    "Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000");
        }
        try {
            StackOverFlowTest.test();
        }catch (Error e){
            System.out.println("StackOverFlowTest");
        }

    }
}
