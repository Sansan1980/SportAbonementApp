package com.danilov.sport_abonement_app.service.customerservice;

import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.Employee;

public interface CustomerService {
    String addCustomer(String name, String surname, Integer numberTelephone );
    String findCustomer(String name, String surname, Integer numberTelephone);

    //String updateCustomer(String name, String surname, Integer numberTelephone);//здесь возможно ошибка
    String deleteCustomer(String name, String surname, Integer numberTelephone);



}
