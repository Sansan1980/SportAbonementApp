package com.danilov.sport_abonement_app.controller;

import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.service.customerservice.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    /*private final Customer customer;

    public CustomerController(Customer customer) {
        this.customer = customer;*/


    @GetMapping("/aadCustomer")
    public String aadCustomer(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname, @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone) {
        return customerService.addCustomer(name, surname, numberTelephone);
    }

    @GetMapping("/findCustomer")
    public String findCustomer(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname, @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone) {
        return customerService.findCustomer(name, surname, numberTelephone);
    }

    @GetMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname, @RequestParam(value = "numberTelephone") Integer numberTelephone) {
        return customerService.deleteCustomer(name, surname, numberTelephone);
    }
}

