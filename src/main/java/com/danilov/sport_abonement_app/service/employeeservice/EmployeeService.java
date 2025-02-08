package com.danilov.sport_abonement_app.service.employeeservice;

import com.danilov.sport_abonement_app.model.Employee;

import java.util.Map;

public interface EmployeeService {

        String addEmployee(String name, String surname, Integer numberTelephone);

        String findEmployee(String name, String surname, Integer numberTelephone);

        String updateEmployee(String name, String surname, Integer numberTelephone, String upDateName, String upDateSurname, Integer upDateNumberTelephone);

        String deleteEmployee(String name, String surname, Integer numberTelephone);

        Map<String, Employee> printEmployeeMap();

        String printEmployee(String name, String surname, Integer numberTelephone);


    }

