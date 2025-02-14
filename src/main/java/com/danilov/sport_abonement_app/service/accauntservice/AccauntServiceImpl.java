package com.danilov.sport_abonement_app.service.accauntservice;

import ch.qos.logback.core.status.Status;
import com.danilov.sport_abonement_app.model.Accaunt;
import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.service.employeeservice.EmployeeServiceImpl;

import javax.management.relation.Role;
import java.util.Map;


public class AccauntServiceImpl implements AccauntService {

    private Map<String, Employee> employeeMap = EmployeeServiceImpl.getEmployeeMap();

    public String addAccaunt(String name, String surname, Integer numberTelephone, String eMail,
                             String password, String userName, String login, double amount, Accaunt.Role role, Accaunt.Status status,
                             String commentary) {
        //добавить сюда валидацию string и Integer
        Employee employee = employeeMap.get(key(name, surname, numberTelephone));
        Accaunt accaunt = employee.getAccauntEmployee();
        accaunt.setEMail(eMail);
        accaunt.setPassword(password);
        accaunt.setUserName(userName);
        accaunt.setLogin(login);
        accaunt.setAmount(amount);
        accaunt.setRole(role);
        accaunt.setStatus(status);
        accaunt.setCommentary(commentary);
        return "Введены новые данные, для сотрудника " + employee.getEmployeeId() + ", " + name + " " + surname + ", " + numberTelephone
                + accaunt.getAccountId() + ", " + eMail + ", " + password + ", " + userName + "," + login + ", " + ", " + role + ", " + status + ", " + commentary; //решить то же самое через стримы
    }


    public String findAccaunt() {
        return null;
    }


    public String upDateAccaunt() {
        return null;
    }


    public String deleteAccaunt() {
        return null;
    }


    public String printAccaunt() {
        return null;
    }

    private String key(String name, String surname, Integer numberTelephone) {
        return name + surname + numberTelephone;
    }

}
