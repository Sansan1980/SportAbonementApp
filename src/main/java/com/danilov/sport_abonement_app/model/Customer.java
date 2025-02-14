package com.danilov.sport_abonement_app.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final long customerId;
    private  long customerCounter;
    private final Accaunt accauntCustomer;
    private String name;
    private String surname;
    private long numberTelephone;
    private List<Task> tasks;
    private List <String> commentary;

    public Customer(String name, String surname, Integer numberTelephone) {
        this.customerId = customerCounter++;
        this.accauntCustomer = new Accaunt();
        this.name = name;//не знаю как реализовывать добовление имени клиента потом по  желанию.
        this.surname = surname;//не знаю как реализовывать добовление имени клиента потом по желанию.
        this.numberTelephone = numberTelephone;
        this.tasks = new ArrayList<Task>();
        this.commentary = new ArrayList<String>();

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

    public void setNumberTelephone(Integer numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    public List<String> getCommentary() {
        return commentary;
    }

    public void setCommentary(List<String> commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + getCustomerId() +
                ", accountCustomer=" + getAccountCustomer() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", numberTelephone=" + getNumberTelephone() + '}';
    }

}
