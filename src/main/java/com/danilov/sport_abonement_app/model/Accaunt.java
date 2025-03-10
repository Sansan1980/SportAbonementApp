package com.danilov.sport_abonement_app.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Accaunt {
    //    ID: Уникальный идентификатор учетной записи.
    private final long accauntId;

    private static long accauntCounter;
    //Email: Адрес электронной почты для идентификации и авторизации.
    private String eMail;
    //Password: Зашифрованный пароль для обеспечения безопасности.
    private String password;
    //Username: Имя пользователя, которое может использоваться в интерфейсе.
    private String userName;
    private String login;
    private double amount;
    //Created_at: Дата и время создания учетной записи.
//Updated_at: Дата и время последнего обновления учетной записи.

//Role: Роль пользователя (например, администратор, клиент) для управления доступом.
    public enum Role {
        ADMIN,
        MODERATOR,
        CUSTOMER,
        EMPLOYEE,
        OTHER
    }

    private Role role;

    //Status: Статус учетной записи (активна, заблокирована и т.д.).
    public enum Status {
        ACTIVE,
        SUSPENDED,
        DELETED
    }

    private Status status;
    private String commentary;

    public Accaunt(String eMail,String password,String userName,String login,double amount,Accaunt.Role role,Accaunt.Status status,String commentary) {
        this.accauntId = accauntCounter++;
        this.eMail = "eMail";
        this.password = "password";
        this.userName = "userName";
        this.login = "login";
        this.amount = 0;
        this.role = Role.CUSTOMER;
        this.status = Status.ACTIVE;
        this.commentary = "Комментарий";
    }

    public long getAccountId() {
        return accauntId;
    }

    public String geteMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return "Accaunt{" +
                "accauntId=" + accauntId +
                ", eMail='" + eMail + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", login='" + login + '\'' +
                ", amount=" + amount +
                ", role=" + role +
                ", status=" + status +
                ", commentary='" + commentary + '\'' +
                '}';
    }

}
