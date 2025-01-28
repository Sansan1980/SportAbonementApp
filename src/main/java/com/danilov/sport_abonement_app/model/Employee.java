package com.danilov.sport_abonement_app.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final long employeeId ;
    private static long employeeCounter ;
    private final Integer numberTelephone;
    private final String name;
    private final String surname;
    private  Account accountEmployee;
    private int salary;
    private List <Task> tasks;

    public Employee(Integer numberTelephone,String name,String surname) {
        this.employeeId = employeeCounter++;
        this.numberTelephone = numberTelephone;
        this.name = name;
        this.surname = surname;
        this.accountEmployee = new Account();
        this.salary = 0;
        this.tasks = new ArrayList<Task>();
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumberTelephone() {
        return numberTelephone;
    }

    public Account getAccountEmployee() {
        return accountEmployee;
    }

    public void setAccountEmployee(Account accountEmployee) {
        this.accountEmployee = accountEmployee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
