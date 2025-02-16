package com.danilov.sport_abonement_app.service.accauntservice;

import com.danilov.sport_abonement_app.exception.accaunt_exception.AccauntNotFoundException;
import com.danilov.sport_abonement_app.model.Accaunt;
import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.service.customerservice.CustomerServiceImpl;
import com.danilov.sport_abonement_app.service.employeeservice.EmployeeServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AccauntServiceImpl implements AccauntService {
    private EmployeeServiceImpl employeeService;

    public AccauntServiceImpl(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

//    private CustomerServiceImpl customerService;

//    public AccauntServiceImpl(CustomerServiceImpl customerService) {
//        this.customerService = customerService;
//    }

    public String upDateAccaunt(String name, String surname, Integer numberTelephone, String eMail,
                             String password, String userName, String login, double amount, Accaunt.Role role, Accaunt.Status status,
                             String commentary) {
        //добавить сюда валидацию string и Integer
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
            return "Введены новые данные, для аккаунта сотрудника " + employee.getEmployeeId() + ", " + name + " " + surname + ", " + numberTelephone
                    + accaunt.getAccountId() + ", " + eMail + ", " + password + ", " + userName + "," + login + ", " + ", " + role + ", " + status + ", " + commentary; //решить то же самое через стримы
//        } else if (customerService.getCustomerMap().containsKey(key(name, surname, numberTelephone))) {
//            Customer customer = customerService.getCustomerMap().get(key(name, surname, numberTelephone));
//            Accaunt accaunt = customer.getAccauntCustomer();
//            accaunt.setEMail(eMail);
//            accaunt.setPassword(password);
//            accaunt.setUserName(userName);
//            accaunt.setLogin(login);
//            accaunt.setAmount(amount);
//            accaunt.setRole(role);
//            accaunt.setStatus(status);
//            accaunt.setCommentary(commentary);
//            return "Введены новые данные, для аккаунта клиента " + customer.getCustomerId() + ", " + name + " " + surname + ", " + numberTelephone
//                    + accaunt.getAccountId() + ", " + eMail + ", " + password + ", " + userName + "," + login + ", " + ", " + role + ", " + status + ", " + commentary;

        }

        throw new AccauntNotFoundException();
    }


    public String findAccaunt(String name, String surname, Integer numberTelephone) {
        if (employeeService.getEmployeeMap().containsKey(key(name, surname, numberTelephone))) {
            Employee employee = employeeService.getEmployeeMap().get(key(name, surname, numberTelephone));
            Accaunt accaunt = employee.getAccauntEmployee();
            return "Найден аккаунт для сотрудника " + employee.getEmployeeId() + ", " + name + " " + surname + ", " + numberTelephone + ", " + accaunt.toString(); //решить то же самое через стримы
        }
//        } else if (customerService.getCustomerMap().containsKey(key(name, surname, numberTelephone))) {
//            Customer customer = customerService.getCustomerMap().get(key(name, surname, numberTelephone));
//            Accaunt accaunt = customer.getAccauntCustomer();
//            return "Найден аккаунт для сотрудника " + customer.getCustomerId() + ", " + name + " " + surname + ", " + numberTelephone + ", " + accaunt.toString();
//        }
        throw new AccauntNotFoundException();
    }


    private String key(String name, String surname, Integer numberTelephone) {
        return name + surname + numberTelephone;
    }

}
