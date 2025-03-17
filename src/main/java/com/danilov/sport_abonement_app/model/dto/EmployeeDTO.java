package com.danilov.sport_abonement_app.model.dto;

import com.danilov.sport_abonement_app.model.Employee;

public class EmployeeDTO {

    private long employeeId;
    private String name;
    private String surname;
    private long numberTelephone;

    public EmployeeDTO() {
    }

    public EmployeeDTO(long employeeId, String name, String surname, long numberTelephone) {
        this.employeeId = employeeId;
        this.name = name;
        this.surname = surname;
        this.numberTelephone = numberTelephone;
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


