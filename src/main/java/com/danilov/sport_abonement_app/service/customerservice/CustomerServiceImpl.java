package com.danilov.sport_abonement_app.service.customerservice;

import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
    private static Map<String, Customer> customerMap = new HashMap<>();

    String addCustomer(String name, String surname, int numberTelephone) {
        //добавиить сюда валидацию string и Integer
        if (customerMap.size() >= 1000) {
            System.out.println("превышен лемит клиентов");
        } else if (customerMap.containsKey(key(name, surname))) {
            System.out.println("Такой сотрудник уже существует");
        } else {
            customerMap.put(key(name, surname), new Customer(name, surname, numberTelephone));
        }
        return "Введены новые данные,  " + name + " " + surname; // + предстваить номер телефона через стринг;//решить тоже самое через стримы
    }

       /* Employee findCustomer (String name, String surname,int numberTelephone){
        }

        String updateCustomer (String name, String surname,int numberTelephone){
        }//здесь возможно ошибка

        String deleteCustomer (String name, String surname,int numberTelephone){
        }*/

    private String key(String name, String surname) {
        return name + surname;
    }
}
