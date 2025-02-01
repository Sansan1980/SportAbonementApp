package com.danilov.sport_abonement_app.service.employeeservice;

import com.danilov.sport_abonement_app.exception.EmployeeAlreadyAddedException;
import com.danilov.sport_abonement_app.exception.EmployeeNotFoundException;
import com.danilov.sport_abonement_app.exception.EmployeeStorageIsFullException;
import com.danilov.sport_abonement_app.model.Account;
import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.model.Task;
import org.springframework.stereotype.Service;

import java.util.*;

import static com.danilov.sport_abonement_app.validation.Validates.validatesNumber;
import static com.danilov.sport_abonement_app.validation.Validates.validatesString;
import static java.lang.System.lineSeparator;

@Service
public class EmployeeServiceImpl implements EmployeeService {
 /*   private final Employee employee;

    public EmployeeServiceImpl(Employee employee) {
        this.employee = employee;
    }*/
    private static Map<String, Employee> employeesMap = new HashMap<>();

    public String addEmployee(Integer numberTelephone, String name, String surname) {
        name = validatesString(name);
        surname = validatesString(surname);
        numberTelephone = validatesNumber(numberTelephone);
        if (employeesMap.size() >= 1000) {
            throw new EmployeeStorageIsFullException();
        }

        if (employeesMap.containsKey(key(name, surname))) {
            System.out.println("Такой сотрудник существуеет");
            throw new EmployeeAlreadyAddedException();
        }

        employeesMap.put(key(name, surname), new Employee(numberTelephone, name, surname));
        return "Введенны новые данные " + numberTelephone + name + " " + surname;
    }

    public Employee findEmployee(String name, String surname) {
        if (!employeesMap.containsKey(key(name, surname))) {
            throw new EmployeeNotFoundException();
        }
        return employeesMap.get(key(name, surname));
    }

    public String deleteEmployee( String name, String surname) {
        //получитиь подтверждение и удалить
        if (!employeesMap.containsKey(key(name, surname))) {
            throw new EmployeeNotFoundException();
        }
        employeesMap.remove(key(name, surname));
        return "Удалены  данные "  + name + " " + surname;

    }

    public Map<String, Employee> representsDataAllEmployees() {
        return employeesMap;
    }

    private String key(String name, String surname) {
        return name + surname;
    }


    public String representsDataAllEmployeesEmployeeKey() {
        Set<String> keys = employeesMap.keySet();
        Collection<Employee> values = employeesMap.values();
        return "Значения :" + values + lineSeparator() +
                "Ключи : " + keys;

    }
}
