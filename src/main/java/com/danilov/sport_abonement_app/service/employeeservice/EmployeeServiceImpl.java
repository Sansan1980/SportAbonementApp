package com.danilov.sport_abonement_app.service.employeeservice;


import com.danilov.sport_abonement_app.exception.employee_exception.EmployeeAllreadyAddedException;
import com.danilov.sport_abonement_app.exception.employee_exception.EmployeeNotFoundException;
import com.danilov.sport_abonement_app.exception.employee_exception.EmployeeStorageIsFullException;
import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.model.dto.EmployeeView;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private Map<String, Employee> employeeMap = new HashMap<>();

    public Map<String, Employee> getEmployeeMap() {// почему без статик не работает он же паблик
        return employeeMap;
    }

    public EmployeeView addEmployee(Employee employee) {
        //добавить сюда валидацию string и Integer
        if (employeeMap.size() >= 10000) {
            throw new EmployeeStorageIsFullException();
            // return "Превышен лимит количества контрагентов";
        }
        String key = exstractKey(employee);
        if (employeeMap.containsKey(key)) {
            throw new EmployeeAllreadyAddedException();
            // return "Такой контрагент уже существует";
        }
        employeeMap.put(key, employee);
        employee = employeeMap.get(key);
        System.out.println("Введен новый контрагент -" + employee);

        return new EmployeeView(employee);
    }

    public EmployeeView findEmployee(Employee employee) {
        String key = exstractKey(employee);
        if (!employeeMap.containsKey(key)) {
            throw new EmployeeNotFoundException();
            // return "Такого контрагента не существует! ";
        }
        employee = employeeMap.get(key);
        System.out.println("Найден контрагент" + employee);
        return new EmployeeView(employee);
    }


    public EmployeeView updateEmployee(Employee employee, Employee employeeNew) {
        String key = exstractKey(employee);
        if (!employeeMap.containsKey(key)) {
            throw new EmployeeNotFoundException();
        }
        employeeMap.put(key, employeeNew);
        System.out.println("Изменен данные контрагента " + employee);
        employee = employeeMap.get(key);
        return new EmployeeView(employee);
    }

    public EmployeeView deleteEmployee(Employee employee) {
        String key = exstractKey(employee);
        if (!employeeMap.containsKey(key)) {
            throw new EmployeeNotFoundException();
        }
        employee = employeeMap.remove(key);
        System.out.println("Удален контрагент - " + employee);
        return new EmployeeView(employee);
    }

    public Map<String, Employee> printEmployeeMap() {//Через Swagger не работает данные метод
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

    private String exstractKey(Employee employee) {
        return key(employee.getName(), employee.getSurname(), employee.getNumberTelephone());
    }
}