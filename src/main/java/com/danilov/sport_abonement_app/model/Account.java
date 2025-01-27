package com.danilov.sport_abonement_app.model;

public class Account {
    private final long id ;
    private static long counter ;

    private  final  double amount;
    public Account() {
        this.amount = 0;
        this.id = counter++;
    }

}
