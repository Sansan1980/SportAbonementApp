package com.danilov.sport_abonement_app.service.employeeservice;

import com.danilov.sport_abonement_app.model.Employee;

import java.util.Map;

public interface EmployeeService {
    String addEmployee(int numberTelephone,String name,String surname);

    Employee findEmployee(int numberTelephone,String name,String surname);

    String deleteEmployee(int numberTelephone,String name,String surname);

    Map<String, Employee> representsDataAllEmployees();

    String representsDataAllEmployeesEmployeeKey();

}
