package com.danilov.sport_abonement_app.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final long costomerId ;
    private static long customerCounter;
    private Account accounCustomer;
    private final String name;
    private  final String surname;
    private final int numberTelephone;
    private List <Task> tasks;


    public Customer(String name, String surname, int numberTelephone) {
        this.costomerId = customerCounter++;
        this.accounCustomer = new Account();
        this.name = name;//не знаю как реализовывать добовление имени клиента потом по  желанию.
        this.surname = surname;//не знаю как реализовывать добовление имени клиента потом по желанию.
        this.numberTelephone = numberTelephone;
        this.tasks = new ArrayList<Task>();

    }
    public long getCostomerId() {
        return costomerId;
    }

    public Account getAccounCustomer() {
        return accounCustomer;
    }

    public void setAccounCustomer(Account accounCustomer) {
        this.accounCustomer = accounCustomer;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumberTelephone() {
        return numberTelephone;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

}
