package com.danilov.sport_abonement_app.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final long id ;
    private static long counter ;
    private Account account;
    private List <Task> tasks;

    public Customer() {
        this.id = counter++;
        this.tasks = new ArrayList<Task>();
    }
}
