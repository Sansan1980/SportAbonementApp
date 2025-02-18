package com.danilov.sport_abonement_app.controller;

import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.service.customerservice.CustomerService;
import com.danilov.sport_abonement_app.service.customerservice.CustomerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/aadCustomer")
    public String aadCustomer(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone) {
        return customerService.addCustomer(name, surname, numberTelephone);
    }

    @GetMapping("/findCustomer")
    public String findCustomer(@RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "surname", required = false) String surname,
                               @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone) {
        return customerService.findCustomer(name, surname, numberTelephone);
    }

    @GetMapping("/updateCustomer")
    public String updateCustomer(@RequestParam(value = "name", required = false) String name,
                                 @RequestParam(value = "surname", required = false) String surname,
                                 @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone,
                                 @RequestParam(value = "upDateName", required = false) String upDateName,
                                 @RequestParam(value = "upDateSurname", required = false) String upDateSurname,
                                 @RequestParam(value = "upDateNumberTelephone", required = false) Integer upDateNumberTelephone) {
        return customerService.updateCustomer(name, surname, numberTelephone, upDateName, upDateSurname, upDateNumberTelephone);
    }


    @GetMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam(value = "name") String name,
                                 @RequestParam(value = "surname") String surname,
                                 @RequestParam(value = "numberTelephone") Integer numberTelephone) {
        return customerService.deleteCustomer(name, surname, numberTelephone);
    }

    @GetMapping("/printAddCustomer")
    public Map<String, Customer> printCustomerMap() {
        return customerService.printCustomerMap();
    }

    @GetMapping("/printCustomer ")
    public String printCustomer(String name, String surname, Integer numberTelephone) {
        return customerService.printCustomer(name, surname, numberTelephone);
    }
}

