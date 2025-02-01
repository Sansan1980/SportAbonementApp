package com.danilov.sport_abonement_app.service.employeeservice;

import com.danilov.sport_abonement_app.model.Employee;

import java.util.Map;

public interface EmployeeService {
    String addEmployee(Integer numberTelephone,String name,String surname);

    Employee findEmployee(Integer numberTelephone,String name,String surname);

    String deleteEmployee(Integer numberTelephone,String name,String surname);

    Map<String, Employee> representsDataAllEmployees();

    String representsDataAllEmployeesEmployeeKey();

}
