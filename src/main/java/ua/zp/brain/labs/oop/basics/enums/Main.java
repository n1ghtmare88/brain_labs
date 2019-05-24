package ua.zp.brain.labs.oop.basics.enums;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Dmitriy Yevtushenko", "yevdd", "123456", Role.DIRECTOR);
        User user2 = new User("Elena Yevtushenko", "yevei", "654321", Role.ADMIN);
        User user3 = new User("Pavel Yevtushenko", "yevpd", "11111", Role.CLIENT);
        User user4 = new User("Vasya Pupkin", "pupvv", "22222", Role.ANONYMOUS);
        User user5 = new User("Ivan Ivanov", "ivaii", "33333", Role.MANAGER);
        User[] users = {user1, user2, user3, user4, user5};
        Store store = new Store("ATB", "https://www.atb.ua", users);

            while (true){
                tryLogin(store);
            }

    }

    public static void tryLogin(Store store) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Введите логин:");
        String login = scanner1.nextLine();
        System.out.print("Введите пароль:");
        String password = scanner2.nextLine();
        boolean isLogin = store.login(login, password);

        if (isLogin) {
            store.getCurrentUserRights();
            store.logout();
        }
        else {
            System.out.println("Неверный логин и\\или пароль");
        }
    }
}
