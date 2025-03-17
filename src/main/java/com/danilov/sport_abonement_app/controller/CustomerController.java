package com.danilov.sport_abonement_app.controller;

import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.dto.CustomerDTO;
import com.danilov.sport_abonement_app.model.dto.CustomerView;
import com.danilov.sport_abonement_app.service.customerservice.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }
    @PostMapping("/aadCustomer")
    public CustomerDTO aadCustomer(@RequestBody Customer customer ) {
        return customerService.addCustomer(customer);
    }


    @GetMapping("/findCustomer")
    public CustomerDTO findCustomer(@RequestBody Customer customer) {
        return customerService.findCustomer(customer);
    }
    @PutMapping("/updateCustomer")
    public CustomerDTO updateCustomer(@RequestBody Customer customer,@RequestBody Customer customerNew) {
        return customerService.updateCustomer(customer, customerNew);
    }

    @DeleteMapping("/deleteCustomer")
    public CustomerDTO deleteCustomer(@RequestBody Customer customer) {
        return customerService.deleteCustomer(customer);
    }

    @GetMapping("/printAddCustomer")
    public Map<String, Customer> printCustomerMap() {
        return customerService.printCustomerMap();
    }

//    @GetMapping("/printCustomer ")
//    public Customer printCustomer(String name, String surname, Integer numberTelephone) {
//        return customerService.printCustomer(name, surname, numberTelephone);
//    }
}

