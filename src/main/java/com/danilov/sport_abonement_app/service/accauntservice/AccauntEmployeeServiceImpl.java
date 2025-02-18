package com.danilov.sport_abonement_app.service.accauntservice;

import com.danilov.sport_abonement_app.exception.accaunt_exception.AccauntNotFoundException;
import com.danilov.sport_abonement_app.model.Accaunt;
import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.service.customerservice.CustomerServiceImpl;
import com.danilov.sport_abonement_app.service.employeeservice.EmployeeServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AccauntEmployeeServiceImpl implements AccauntEmpoyeeService {
    private EmployeeServiceImpl employeeService;

    public AccauntEmployeeServiceImpl(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }


    public String upDateEmployeeAccaunt(String name, String surname, Integer numberTelephone, String eMail,
                                        String password, String userName, String login, double amount, Accaunt.Role role, Accaunt.Status status,
                                        String commentary) {
        if (employeeService.getEmployeeMap().containsKey(key(name, surname, numberTelephone))) {
            Employee employee = employeeService.getEmployeeMap().get(key(name, surname, numberTelephone));
            Accaunt accaunt = employee.getAccauntEmployee();
            accaunt.setEMail(eMail);
            accaunt.setPassword(password);
            accaunt.setUserName(userName);
            accaunt.setLogin(login);
            accaunt.setAmount(amount);
            accaunt.setRole(role);
            accaunt.setStatus(status);
            accaunt.setCommentary(commentary);
            return "Введены новые данные, для  сотрудника " + employee.getEmployeeId() + ", " + name + " " + surname + ", " + numberTelephone
                    + accaunt.getAccountId() + accaunt.toString();// ", " + eMail + ", " + password + ", " + userName + "," + login + ", " + ", " + role + ", " + status + ", " + commentary; //решить то же самое через стримы
        }
        throw new AccauntNotFoundException();
    }


    public String findEmployeeAccaunt(String name, String surname, Integer numberTelephone) {
        if (employeeService.getEmployeeMap().containsKey(key(name, surname, numberTelephone))) {
            Employee employee = employeeService.getEmployeeMap().get(key(name, surname, numberTelephone));
            Accaunt accaunt = employee.getAccauntEmployee();
            return "Найден аккаунт для сотрудника " + employee.getEmployeeId() + ", " + name + " " + surname + ", " + numberTelephone + ", " + accaunt.toString(); //решить то же самое через стримы
        }

        throw new AccauntNotFoundException();
    }


    private String key(String name, String surname, Integer numberTelephone) {
        return name + surname + numberTelephone;
    }

}
