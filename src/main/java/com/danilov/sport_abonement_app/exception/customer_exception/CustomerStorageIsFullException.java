package com.danilov.sport_abonement_app.exception.customer_exception;

public class CustomerStorageIsFullException extends RuntimeException{
    public CustomerStorageIsFullException() {
        super("Превышен лемит количества контрагентов в фирме");
    }
}
