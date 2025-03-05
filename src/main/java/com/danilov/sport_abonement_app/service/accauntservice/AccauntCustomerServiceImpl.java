package com.danilov.sport_abonement_app.service.accauntservice;

import com.danilov.sport_abonement_app.exception.accaunt_exception.AccauntNotFoundException;
import com.danilov.sport_abonement_app.model.Accaunt;
import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.service.customerservice.CustomerServiceImpl;
import com.danilov.sport_abonement_app.service.employeeservice.EmployeeServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AccauntCustomerServiceImpl implements AccauntCustomerService {

    private CustomerServiceImpl customerService;

    public AccauntCustomerServiceImpl(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    public String upDateCustomerAccaunt(String name, String surname, Integer numberTelephone, String eMail,
                                        String password, String userName, String login, double amount, Accaunt.Role role, Accaunt.Status status,
                                        String commentary) {
        if (customerService.getCustomerMap().containsKey(key(name, surname, numberTelephone))) {
            Customer customer = customerService.getCustomerMap().get(key(name, surname, numberTelephone));
            Accaunt accaunt = customer.getAccauntCustomer();
            accaunt = new Accaunt(eMail,password,userName,login,amount,role,status,commentary);
//            accaunt.setEMail(eMail);
//            accaunt.setPassword(password);
//            accaunt.setUserName(userName);
//            accaunt.setLogin(login);
//            accaunt.setAmount(amount);
//            accaunt.setRole(role);
//            accaunt.setStatus(status);
//            accaunt.setCommentary(commentary);
            return "Введены новые данные, для аккаунта клиента " + customer.getCustomerId() + ", " + name + " " + surname + ", " + numberTelephone
                    + accaunt.getAccountId() + ", " + eMail + ", " + password + ", " + userName + "," + login + ", " + ", " + role + ", " + status + ", " + commentary;

        }

        throw new AccauntNotFoundException();
    }


    public String findCustomerAccaunt(String name, String surname, Integer numberTelephone) {
        if (customerService.getCustomerMap().containsKey(key(name, surname, numberTelephone))) {
            Customer customer = customerService.getCustomerMap().get(key(name, surname, numberTelephone));
            Accaunt accaunt = customer.getAccauntCustomer();
            return "Найден аккаунт для сотрудника " + customer.getCustomerId() + ", " + name + " " + surname + ", " + numberTelephone + ", " + accaunt.toString();
        }
        throw new AccauntNotFoundException();
    }


    private String key(String name, String surname, Integer numberTelephone) {
        return name + surname + numberTelephone;
    }

}
