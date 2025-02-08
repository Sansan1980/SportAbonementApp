package com.danilov.sport_abonement_app.service.customerservice;

import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.Employee;

import java.util.HashMap;
import java.util.Map;

public interface CustomerService {
    String addCustomer(String name, String surname, Integer numberTelephone);

    String findCustomer(String name, String surname, Integer numberTelephone);

    String updateCustomer(String name, String surname, Integer numberTelephone, String upDateName, String upDateSurname, Integer upDateNumberTelephone);

    String deleteCustomer(String name, String surname, Integer numberTelephone);

    Map<String,Customer> printCustomerMap();

    String printCustomer(String name, String surname, Integer numberTelephone);


}
