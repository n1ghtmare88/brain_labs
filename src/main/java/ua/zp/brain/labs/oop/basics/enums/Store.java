/**
 * @autor Дмитрий Евтушенко
 * Этот класс Магазин
 */
package ua.zp.brain.labs.oop.basics.enums;

import java.util.Arrays;

public final class Store {
    private String nameShop;
    private String webSite;
    private User[] users;
    private User authorizedUser;

    public Store(String nameShop, String webSite, User[] users) {
        this.nameShop = nameShop;
        this.webSite = webSite;
        this.users = users;
    }

    public String getNameShop() {

        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(User authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    @Override
    public String toString() {
        return "Store\n" +
                "nameShop='" + nameShop + '\'' +
                "\nwebSite='" + webSite + '\'' +
                "\nusersCount="+users.length+":\n" +Arrays.toString(users);
    }

    public boolean login(String login, String password){
        for (int i = 0; i <users.length ; i++) {
            if(users[i].getLogin().equals(login)&& users[i].getPassword().equals(password)){
                setAuthorizedUser(users[i]);
                return true;
            }
        }
        return false;
    }
    public void getCurrentUserRights(){
        switch (authorizedUser.getRole()){
            case ADMIN:
                System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
                break;
            case ANONYMOUS:
                System.out.println("Анонимный пользователь, может покупать товары и\\или авторизоваться");
                break;
            case CLIENT:
                System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
                break;
            case MANAGER:
                System.out.println("Менеджер магазина, может общаться с клиентами");
                break;
            case DIRECTOR:
                System.out.println("Директор магазина, может управлять кадрами, и ценами");
                break;
        }
    }
    public void logout(){
        authorizedUser=null;
        System.out.println("Пользователь вышел из системы");
    }
}
