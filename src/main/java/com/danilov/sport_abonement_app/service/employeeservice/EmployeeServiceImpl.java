package com.danilov.sport_abonement_app.service.employeeservice;


import com.danilov.sport_abonement_app.exception.customer_exception.CustomerNotFoundException;
import com.danilov.sport_abonement_app.exception.employee_exception.EmployeeAllreadyAddedException;
import com.danilov.sport_abonement_app.exception.employee_exception.EmployeeNotFoundException;
import com.danilov.sport_abonement_app.exception.employee_exception.EmployeeStorageIsFullException;
import com.danilov.sport_abonement_app.model.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static Map<String, Employee> employeeMap = new HashMap<>();
    public String addEmployee(String name, String surname, Integer numberTelephone) {
        //добавиить сюда валидацию string и Integer
        if (employeeMap.size() >= 10000) {
            throw new EmployeeStorageIsFullException();
            // return "Превышен лемит количества контрагентов";
        } else if (employeeMap.containsKey(key(name, surname, numberTelephone))) {
            throw new EmployeeAllreadyAddedException();
            // return "Такой контрагент уже существует";
        }
        employeeMap.put(key(name, surname, numberTelephone), new Employee(name, surname, numberTelephone));
        Employee employee = employeeMap.get(key(name, surname, numberTelephone));
        return "Введены новые данные,  " + employee.getEmployeeId() + ", " + name + " " + surname + ", " + numberTelephone; //решить то же самое через стримы
    }

    public String findEmployee(String name, String surname, Integer numberTelephone) {
        if (!employeeMap.containsKey(key(name, surname, numberTelephone))) {
            throw new EmployeeNotFoundException();
            // return " Такого контрагента не существует! ";
        }
        Employee employee = employeeMap.get(key(name, surname, numberTelephone));
        return "Найден контрагент" + employee.getEmployeeId() + ", " + name + ", " + surname + ", " + numberTelephone;
    }

    public String updateEmployee(String name, String surname, Integer numberTelephone, String upDateName, String upDateSurname, Integer upDateNumberTelephone) {
        if (!employeeMap.containsKey(key(name, surname, numberTelephone))) {
            throw new EmployeeNotFoundException();
        }
        Employee employee = employeeMap.remove(key(name, surname, numberTelephone));
        //Employee employee = employeeMap.get(key(name, surname, numberTelephone));
        employee.setName(upDateName);
        employee.setSurname(upDateSurname);
        employee.setNumberTelephone(upDateNumberTelephone);
        //employeeMap.remove(key(name, surname, numberTelephone));
        employeeMap.put(key(upDateName, upDateSurname, upDateNumberTelephone), employee);

        return "Изменен данные контрагента " + name + surname + numberTelephone + " новые данные " + upDateName + ", " + upDateSurname + ", " + upDateNumberTelephone;
    }

    public String deleteEmployee(String name, String surname, Integer numberTelephone) {
        if (!employeeMap.containsKey(key(name, surname, numberTelephone))) {
            throw new EmployeeNotFoundException();
        }
        Employee employee = employeeMap.remove(key(name, surname, numberTelephone));
        return "Удален контрагент - " + employee;
    }

    public Map<String, Employee> printEmployeeMap() {//Через Swager неработает данны метод
        return employeeMap;
    }

    public String printEmployee(String name, String surname, Integer numberTelephone) {
        if (!employeeMap.containsKey(key(name, surname, numberTelephone))) {
            throw new EmployeeNotFoundException();
        }
        Employee employee = employeeMap.get(key(name, surname, numberTelephone));
        return employee.toString();
    }

    private String key(String name, String surname, Integer numberTelephone) {
        return name + surname + numberTelephone;
    }
}