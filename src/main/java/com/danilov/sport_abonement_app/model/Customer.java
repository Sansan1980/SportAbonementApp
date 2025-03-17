package com.danilov.sport_abonement_app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private long customerId;
    private static long customerCounter;
    private  Accaunt accauntCustomer;
    private String name;
    private String surname;
    private long numberTelephone;
    private Task tasks;
    private String commentary;

    public Customer() {

    }

    public Customer(String name, String surname, long numberTelephone, Accaunt accaunt) {
        this.customerId = customerCounter++;
        this.accauntCustomer = accaunt;
        this.name = name;//не знаю как реализовывать добавление имени клиента потом по желанию.
        this.surname = surname;//не знаю как реализовывать добавление имени клиента потом по желанию.
        this.numberTelephone = numberTelephone;
        // this.tasks = tasks;
        // this.commentary = commentary;

    }

    public long getCustomerId() {
        return customerId;
    }

    public Accaunt getAccauntCustomer() {
        return accauntCustomer;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(long numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public Task getTasks() {
        return tasks;
    }

    public void setTasks(Task tasks) {
        this.tasks = tasks;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + getCustomerId() +
                ", accountCustomer=" + getAccauntCustomer() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", numberTelephone=" + getNumberTelephone() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return getCustomerId() == customer.getCustomerId() && getNumberTelephone() == customer.getNumberTelephone() && Objects.equals(getAccauntCustomer(), customer.getAccauntCustomer()) && Objects.equals(getName(), customer.getName()) && Objects.equals(getSurname(), customer.getSurname()) && Objects.equals(getTasks(), customer.getTasks()) && Objects.equals(getCommentary(), customer.getCommentary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerId(), getAccauntCustomer(), getName(), getSurname(), getNumberTelephone(), getTasks(), getCommentary());
    }
}
