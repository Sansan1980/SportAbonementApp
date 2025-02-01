package com.danilov.sport_abonement_app.service.customerservice;

import com.danilov.sport_abonement_app.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    String addCustomer(String name, String surname, int numberTelephone );

    Employee findCustomer(String name, String surname, int numberTelephone);
    String updateCustomer(String name, String surname, int numberTelephone );//здесь возможно ошибка

    String deleteCustomer(String name, String surname, int numberTelephone);


}
