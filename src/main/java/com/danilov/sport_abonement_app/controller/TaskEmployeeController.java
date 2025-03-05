package com.danilov.sport_abonement_app.controller;

import com.danilov.sport_abonement_app.service.taskservice.TaskEmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task/employee")
public class TaskEmployeeController {


    private TaskEmployeeServiceImpl taskEmployeeService;


    public TaskEmployeeController(TaskEmployeeServiceImpl taskEmployeeService) {
        this.taskEmployeeService = taskEmployeeService;
    }

    @PutMapping("/upDate")
    public String upDateEmployeeTask(@RequestParam(value = "name", required = false) String name,
                             @RequestParam(value = "surname", required = false) String surname,
                             @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone,
                             @RequestParam(value = "rental", required = false) Integer rental,
                             @RequestParam(value = "individualTraining", required = false) Integer individualTraining,
                             @RequestParam(value = "commenary", required = false) String commentary) {
        return taskEmployeeService.upDateEmployeeTask(name, surname, numberTelephone, rental, individualTraining, commentary);
    }

    @GetMapping("/find")

    public String fihdEmployeeTask(@RequestParam(value = " name", required = false) String name,
                           @RequestParam(value = "surname", required = false) String surname,
                           @RequestParam(value = "numberTelephone") Integer numberTelephone) {
        return taskEmployeeService.fihdEmployeeTask(name, surname, numberTelephone);
    }
}
