package com.danilov.sport_abonement_app.service.customerservice;

import com.danilov.sport_abonement_app.model.Customer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static Map<String, Customer> customerMap = new HashMap<>();
  /*  public static Customer customer;

    public CustomerServiceImpl(Customer customer) {
        this.customer = customer;
    }*/

   public String addCustomer(String name, String surname, Integer numberTelephone) {
        //добавиить сюда валидацию string и Integer
        if (customerMap.size() >= 1000) {
            System.out.println("превышен лемит клиентов");
        } else if (customerMap.containsKey(key(name, surname,numberTelephone))) {
            System.out.println("Такой контрагент уже существует");
        } else {
            customerMap.put(key(name, surname,numberTelephone), new Customer(name, surname, numberTelephone));
        }
       Customer customer = customerMap.get(key(name, surname, numberTelephone));
       System.out.println("Введен новый контрагент -" +  name + " " + surname + ", " + numberTelephone);
        return "Введены новые данные,  " + name + " " + surname + ", " + numberTelephone; // + предстваить номер телефона через стринг;//решить то же самое через стримы
    }

        public String findCustomer(String name, String surname, Integer numberTelephone) {
            if (!customerMap.containsKey(key(name, surname,numberTelephone))) {
                System.out.println(" Такого контрагента не существует! ");
            } else {
                System.out.println("Найден контрагент");
            }
           Customer customer = customerMap.get(key(name,surname,numberTelephone));
            return customer.getCustomerId() + ", " + name + ", " + surname + ", " + customer.getNumberTelephone();
   }


    /*     public  String updateCustomer (String name,String surname, Integer numberTelephone){
        String parametrCustomer = findCustomer( name,  surname,  numberTelephone);
         return
          }//здесь возможно ошибка*/
    public String deleteCustomer(String name, String surname, Integer numberTelephone) {
        if (!customerMap.containsKey(key(name, surname, numberTelephone))) {
            return "Контрагент с такими параметрами не найден!";
        }
        String deleteCustomer = String.valueOf(customerMap.remove(key(name,surname,numberTelephone)));
        return "Удален контрагент - " + deleteCustomer;
    }
    private String key(String name, String surname,Integer numberTelephone) {
        return name + surname + numberTelephone;
    }
}


