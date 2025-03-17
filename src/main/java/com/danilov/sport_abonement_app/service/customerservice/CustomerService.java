package com.danilov.sport_abonement_app.service.customerservice;

import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.dto.CustomerDTO;

import java.util.Map;

public interface CustomerService {
    CustomerDTO addCustomer(Customer customer);

    CustomerDTO findCustomer(Customer customer);

    CustomerDTO updateCustomer(Customer customer, Customer customerNew);

    CustomerDTO deleteCustomer(Customer customer);

    Map<String, Customer> printCustomerMap();
}
