package com.danilov.sport_abonement_app.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final long costomerId ;
    private static long customerCounter;
    private Account accounCustomer;
    private final int numberTelephone;
    private List <Task> tasks;


    public Customer(int numberTelephone) {
        this.costomerId = customerCounter++;
        this.tasks = new ArrayList<Task>();
        this.numberTelephone = numberTelephone;
        this.accounCustomer = new Account();



    }

    public long getId() {
        return costomerId;
    }
    public Account getAccount() {
        return accounCustomer;
    }

    public void setAccount(Account account) {
        this.accounCustomer = account;
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
