/**
 * @autor Дмитрий Евтушенко
 * Этот класс Пользователь
 */
package ua.zp.brain.labs.oop.basics.enums;

public final class User {
    private String username;
    private String login;
    private String password;
    private Role role;

    public User(String username, String login, String password) {
        role=Role.ANONYMOUS;
        this.username = username;
        this.login = login;
        this.password = password;
    }

    public User(String username, String login, String password, Role role) {
        this.username = username;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "\nusername='" + username + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +"\n";
    }
}
