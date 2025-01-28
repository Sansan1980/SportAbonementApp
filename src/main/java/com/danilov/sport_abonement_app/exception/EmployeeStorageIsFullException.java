package com.danilov.sport_abonement_app.exception;

public class EmployeeStorageIsFullException extends RuntimeException{
    public EmployeeStorageIsFullException() {
        super("Превышен лемит количества сотрудников в фирме");
    }
}
