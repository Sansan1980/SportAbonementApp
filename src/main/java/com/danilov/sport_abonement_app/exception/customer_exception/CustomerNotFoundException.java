package com.danilov.sport_abonement_app.exception.customer_exception;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException() {
        super("Контрагент не найден");
    }
}
