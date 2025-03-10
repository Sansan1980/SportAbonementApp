package com.danilov.sport_abonement_app.service.customerservice;

import com.danilov.sport_abonement_app.exception.customer_exception.CustomerAllreadyAddedException;
import com.danilov.sport_abonement_app.exception.customer_exception.CustomerNotFoundException;
import com.danilov.sport_abonement_app.exception.customer_exception.CustomerStorageIsFullException;
import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.dto.CustomerView;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.danilov.sport_abonement_app.validation.Validates.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<String, Customer> customerMap = new HashMap<>();
    //  private Map<Customer, CustomerView> customerCustomerViewMap = new HashMap<>();


    public Map<String, Customer> getCustomerMap() {
        return customerMap;
    }

    public CustomerView addCustomer(Customer customer) {
        //добавиить сюда валидацию string и Integer и обработать исключения
        validateCustomer(customer);
        if (customerMap.size() >= 10000) {
            throw new CustomerStorageIsFullException();
        }
        // return "Превышен лемит количества контрагентов";
        String key = extractkey(customer);
        if (customerMap.containsKey(key)) {
            throw new CustomerAllreadyAddedException();
            // return "Такой контрагент уже существует";

        }
        customerMap.put(key, customer);
        System.out.println("Введен новый контрагент -" + customer);
        return new CustomerView(customer);
    }

    public CustomerView findCustomer(Customer customer) {
        String key = extractkey(customer);
        if (!customerMap.containsKey(key)) {
            throw new CustomerNotFoundException();
            // return " Такого контрагента не существует! ";
        }
        customer = customerMap.get(key);
        System.out.println("Найден контрагент" + customer);
        return new CustomerView(customer);//не уверен что правильно создавать , каждый раз, в методах круд new CustomerView? они ведь одинаковые  c тем же что и созданный при добавлении в мапу.Получается что каждый раз при поиске будет создаваться новый обьект класса CustomerView!?!?!?
    }


    public CustomerView updateCustomer(Customer customer, Customer customerNew) {
        String key = extractkey(customer);
        if (!customerMap.containsKey(key)) {
            throw new CustomerNotFoundException();
        }
//        customerMap.put(key, customerNew);
//        System.out.println("Изменены данные контрагента - " + customer +", новые данные " + customerNew);
//        return new CustomerView(customerNew);
//    }
        customerMap.put(key, customerNew);
        System.out.println("Изменены данные контрагента - " + customer);
        customer = customerMap.get(key);
        System.out.println(", новые данные " + customer);
        return new CustomerView(customer);
    }

    public CustomerView deleteCustomer(Customer customer) {
        String key = extractkey(customer);
        if (!customerMap.containsKey(key)) {
            throw new CustomerNotFoundException();
        }
         customer = customerMap.remove(key);
        System.out.println("Удален контрагент - " + customer);
        return new CustomerView(customer);
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

    private String key(String name, String surname, long numberTelephone) {
        return name + surname + numberTelephone;
    }

    private String extractkey(Customer customer) {
        return key(customer.getName(), customer.getSurname(), customer.getNumberTelephone());
    }
}


