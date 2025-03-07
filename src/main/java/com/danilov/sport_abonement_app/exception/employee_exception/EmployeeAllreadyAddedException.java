package com.danilov.sport_abonement_app.exception.employee_exception;

public class EmployeeAllreadyAddedException extends RuntimeException{
    public EmployeeAllreadyAddedException() {
        super ("Такой сотрудник уже существует");
    }
}
