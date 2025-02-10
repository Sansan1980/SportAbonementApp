package com.danilov.sport_abonement_app.service.customerservice;

import com.danilov.sport_abonement_app.exception.customer_exception.CustomerAllreadyAddedException;
import com.danilov.sport_abonement_app.exception.customer_exception.CustomerNotFoundException;
import com.danilov.sport_abonement_app.exception.customer_exception.CustomerStorageIsFullException;
import com.danilov.sport_abonement_app.model.Customer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.danilov.sport_abonement_app.validation.Validates.validatesNumber;
import static com.danilov.sport_abonement_app.validation.Validates.validatesString;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static Map<String, Customer> customerMap = new HashMap<>();
    public String addCustomer(String name, String surname, Integer numberTelephone) {
        //добавиить сюда валидацию string и Integer и обработать исключения
        name = validatesString(name);
        surname = validatesString(surname);
        numberTelephone = validatesNumber(numberTelephone);
        if (customerMap.size() >= 10000) {
            throw new CustomerStorageIsFullException();
          // return "Превышен лемит количества контрагентов";
        } else if (customerMap.containsKey(key(name, surname, numberTelephone))) {
            throw new CustomerAllreadyAddedException();
            // return "Такой контрагент уже существует";

        }
            customerMap.put(key(name, surname, numberTelephone), new Customer(name, surname, numberTelephone));
        Customer customer = customerMap.get(key(name, surname, numberTelephone));
        System.out.println("Введен новый контрагент -" + name + " " + surname + ", " + numberTelephone);
        return "Введены новые данные,  " + customer.getCustomerId() + ", " + name + " " + surname + ", " + numberTelephone; //решить то же самое через стримы
    }

    public String findCustomer(String name, String surname, Integer numberTelephone) {
        if (!customerMap.containsKey(key(name, surname, numberTelephone))) {
           throw new CustomerNotFoundException();
           // return " Такого контрагента не существует! ";
        }
        Customer customer = customerMap.get(key(name, surname, numberTelephone));
        return "Найден контрагент" + customer.getCustomerId() + ", " + name + ", " + surname + ", " + numberTelephone;
    }

    public String updateCustomer(String name, String surname, Integer numberTelephone, String upDateName, String upDateSurname, Integer upDateNumberTelephone) {
        if (!customerMap.containsKey(key(name, surname, numberTelephone))) {
            throw new CustomerNotFoundException();
        } else {
            Customer customer =  customerMap.remove(key(name, surname, numberTelephone));
            customer.setName(upDateName);
            customer.setSurname(upDateSurname);
            customer.setNumberTelephone(upDateNumberTelephone);
            customerMap.put(key(upDateName,upDateSurname,upDateNumberTelephone), customer);

        }
        return "Изменен данные контрагента " + name + surname + numberTelephone + " новые данные " + upDateName + ", " + upDateSurname + ", " + upDateNumberTelephone;
    }

    public String deleteCustomer(String name, String surname, Integer numberTelephone) {
        if (!customerMap.containsKey(key(name, surname, numberTelephone))) {
           throw new CustomerNotFoundException();
        }
          Customer customer =  customerMap.remove(key(name, surname, numberTelephone));
        return "Удален контрагент - " + customer;
    }

    public Map<String, Customer> printCustomerMap() {//Через Swager неработает данный метод
        return customerMap;
    }

    public String printCustomer(String name, String surname, Integer numberTelephone) {
        if (!customerMap.containsKey(key(name, surname, numberTelephone))) {
            throw new CustomerNotFoundException();
        }
        Customer customer = customerMap.get(key(name, surname, numberTelephone));
        return customer.toString();
    }

    private String key(String name, String surname, Integer numberTelephone) {
        return name + surname + numberTelephone;
    }
}


