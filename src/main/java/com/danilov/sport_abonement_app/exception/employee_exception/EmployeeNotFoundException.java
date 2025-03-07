package com.danilov.sport_abonement_app.exception.employee_exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException() {
        super("Сотрудник не найден");
    }
}
