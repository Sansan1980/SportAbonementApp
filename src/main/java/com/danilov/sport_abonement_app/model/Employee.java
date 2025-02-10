package com.danilov.sport_abonement_app.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final long employeeId ;
    private  long employeeCounter ;
    private  Integer numberTelephone;
    private  String name;
    private  String surname;
    private  Account accountEmployee;
    private int salary;
    private List <Task> tasks;
    private List <String> commentary;

    public Employee(String name,String surname,Integer numberTelephone) {
        this.employeeId = employeeCounter++;
        this.numberTelephone = numberTelephone;
        this.name = name;
        this.surname = surname;
        this.accountEmployee = new Account();
        this.salary = 0;
        this.tasks = new ArrayList<Task>();
        this.commentary = new ArrayList<String>();
    }


    public long getEmployeeId() {
        return employeeId;
    }

    public Integer getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(Integer numberTelephone) {
        this.numberTelephone = numberTelephone;
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
    public List<String> getCommentary() {
        return commentary;
    }

    public void setCommentary(List<String> commentary) {
        this.commentary = commentary;
    }
}
