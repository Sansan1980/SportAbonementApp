package com.danilov.sport_abonement_app.exception;

public class EmployeeAlreadyAddedException extends RuntimeException{
    public EmployeeAlreadyAddedException() {
        super ("Такой сотрудник уже существует");
    }
}
