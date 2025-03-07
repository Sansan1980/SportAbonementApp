package com.danilov.sport_abonement_app.exception.customer_exception;

public class CustomerAllreadyAddedException extends RuntimeException{
    public CustomerAllreadyAddedException() {
        super ("Такой контрагент уже существует");
    }
}
