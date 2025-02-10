package com.danilov.sport_abonement_app.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    //    ID: Уникальный идентификатор учетной записи.
    private final long accountId;
    private long accountCounter;
    //Email: Адрес электронной почты для идентификации и авторизации.
    private String eMail;
    //Password: Зашифрованный пароль для обеспечения безопасности.
    private String password;
    //Username: Имя пользователя, которое может использоваться в интерфейсе.
    private String username;
    private double amount;
    //Created_at: Дата и время создания учетной записи.
//Updated_at: Дата и время последнего обновления учетной записи.
//Role: Роль пользователя (например, администратор, клиент) для управления доступом.
    public enum Role {
        ADMIN,
        MODERATOR,
        CUSTOMER,
        EMPLOYEE,
    }

    private Role role;

    //Status: Статус учетной записи (активна, заблокирована и т.д.).
    public enum Status {
        ACTIVE,
        SUSPENDED,
        DELETED
    }

    private Status status;
    private List<String> commentary;

    public Account() {
        this.accountId = accountCounter++;
        this.eMail = eMail;
        this.password = password;
        this.username = username;
        this.amount = amount;
        this.role = role;
        this.status = status;
        this.commentary = new ArrayList<String>();
    }

    public long getAccountId() {
        return accountId;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    public List<String> getCommentary() {
        return commentary;
    }

    public void setCommentary(List<String> commentary) {
        this.commentary = commentary;
    }


}
