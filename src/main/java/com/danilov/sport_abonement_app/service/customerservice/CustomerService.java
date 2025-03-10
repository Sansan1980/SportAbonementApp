package com.danilov.sport_abonement_app.service.customerservice;

import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.model.dto.CustomerView;

import java.util.HashMap;
import java.util.Map;

public interface CustomerService {
    CustomerView addCustomer(Customer customer);

    CustomerView findCustomer(Customer customer);

    CustomerView updateCustomer(Customer customer, Customer customerNew);

    CustomerView deleteCustomer(Customer customer);

    Map<String, Customer> printCustomerMap();
}
