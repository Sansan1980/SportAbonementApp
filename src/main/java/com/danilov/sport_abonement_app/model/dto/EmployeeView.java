package com.danilov.sport_abonement_app.model.dto;

import com.danilov.sport_abonement_app.model.Employee;

public class EmployeeView {
    private long employeeId;
    private String name;
    private String surname;
    private long numberTelephone;

    public EmployeeView() {
    }

    public EmployeeView(Employee employee) {
        this.employeeId = employee.getEmployeeId();
        this.name = employee.getName();
        this.surname = employee.getSurname();
        this.numberTelephone = employee.getNumberTelephone();
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(long numberTelephone) {
        this.numberTelephone = numberTelephone;
    }
}
