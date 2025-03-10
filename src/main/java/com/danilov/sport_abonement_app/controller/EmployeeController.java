package com.danilov.sport_abonement_app.controller;

import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.model.dto.EmployeeView;
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
    public EmployeeView aadEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
//    @PostMapping("/aadEmployee")
//    public String aadEmployee(@RequestParam(value = "name", required = false) String name,
//                              @RequestParam(value = "surname", required = false) String surname,
//                              @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone) {
//        return employeeService.addEmployee(name, surname, numberTelephone);
//    }

    @GetMapping("/findEmployee")
    public EmployeeView findEmployee(@RequestBody Employee employee) {
        return employeeService.findEmployee(employee);
    }

    @PutMapping("/updateEmployee")
    public EmployeeView updateEmployee(@RequestBody Employee employee,@RequestBody Employee employeeNew) {
        return employeeService.updateEmployee(employee,employeeNew);
    }


    @DeleteMapping("/deleteEmployee")
    public EmployeeView deleteEmployeer(@RequestBody Employee employee) {
        return employeeService.deleteEmployee(employee);
    }

    @GetMapping("/printAddEmployee")
    public Map<String, Employee> printEmployeeMap() {
        return employeeService.printEmployeeMap();
    }

}



