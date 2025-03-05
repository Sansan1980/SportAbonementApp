package com.danilov.sport_abonement_app.controller;

import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.service.employeeservice.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/aadEmployee")
    public String aadEmployee(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone) {
        return employeeService.addEmployee(name, surname, numberTelephone);
    }

    @GetMapping("/findEmployee")
    public String findEmployee(@RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "surname", required = false) String surname,
                               @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone) {
        return employeeService.findEmployee(name, surname, numberTelephone);
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestParam(value = "name", required = false) String name,
                                 @RequestParam(value = "surname", required = false) String surname,
                                 @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone,
                                 @RequestParam(value = "upDateName", required = false) String upDateName,
                                 @RequestParam(value = "upDateSurname", required = false) String upDateSurname,
                                 @RequestParam(value = "upDateNumberTelephone", required = false) Integer upDateNumberTelephone) {
        return employeeService.updateEmployee(name, surname, numberTelephone, upDateName, upDateSurname, upDateNumberTelephone);
    }


    @DeleteMapping("/deleteEmployee")
    public String deleteEmployeer(@RequestParam(value = "name") String name,
                                  @RequestParam(value = "surname") String surname,
                                  @RequestParam(value = "numberTelephone") Integer numberTelephone) {
        return employeeService.deleteEmployee(name, surname, numberTelephone);
    }

    @GetMapping("/printAddEmployee")
    public Map<String, Employee> printEmployeeMap() {
        return employeeService.printEmployeeMap();
    }

    @GetMapping("/printEmployee ")
    public String printEmployee(String name, String surname, Integer numberTelephone) {
        return employeeService.printEmployee(name, surname, numberTelephone);
    }
}



