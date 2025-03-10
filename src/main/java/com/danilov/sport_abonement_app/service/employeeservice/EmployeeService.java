package com.danilov.sport_abonement_app.service.employeeservice;

import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.model.dto.EmployeeView;

import java.util.Map;

public interface EmployeeService {

        EmployeeView addEmployee(Employee employee);

        EmployeeView findEmployee(Employee employee);

        EmployeeView updateEmployee(Employee employee,Employee employeeNew);

        EmployeeView deleteEmployee(Employee employee);

        Map<String, Employee> printEmployeeMap();

        String printEmployee(String name, String surname, Integer numberTelephone);


    }

