package com.danilov.sport_abonement_app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private final long employeeId;
    private static long employeeCounter;
    private String name;
    private String surname;
    private Integer numberTelephone;
    private Accaunt accauntEmployee;
    private int salary;
    private Task tasks;
    private String commentary;

    public Employee(String name, String surname, Integer numberTelephone) {
        this.employeeId = employeeCounter++;
        this.numberTelephone = numberTelephone;
        this.name = name;
        this.surname = surname;
        this.accauntEmployee = accauntEmployee;
        this.salary = salary;
        this.tasks = tasks;
        this.commentary = commentary;
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

    public Accaunt getAccauntEmployee() {
        return accauntEmployee;
    }

    public void setAccountEmployee(Accaunt accauntEmployee) {
        this.accauntEmployee = accauntEmployee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Task getTasks() {
        return tasks;
    }

    public void setTasks(Task tasks) {
        this.tasks = tasks;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", numberTelephone=" + numberTelephone +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", accauntEmployee=" + accauntEmployee +
                ", salary=" + salary +
                ", tasks=" + tasks +
                ", commentary='" + commentary + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && salary == employee.salary && Objects.equals(numberTelephone, employee.numberTelephone) && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(accauntEmployee, employee.accauntEmployee) && Objects.equals(tasks, employee.tasks) && Objects.equals(commentary, employee.commentary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, numberTelephone, name, surname, accauntEmployee, salary, tasks, commentary);
    }
}
