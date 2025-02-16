package com.danilov.sport_abonement_app.controller;

import com.danilov.sport_abonement_app.service.taskservice.TaskServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {


    private TaskServiceImpl taskService;

    public TaskController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/upDate")
    public String upDateTask(@RequestParam(value = "name", required = false) String name,
                             @RequestParam(value = "surname", required = false) String surname,
                             @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone,
                             @RequestParam(value = "rental", required = false) Integer rental,
                             @RequestParam(value = "individualTraining", required = false) Integer individualTraining,
                             @RequestParam(value = "commenary", required = false) String commentary) {
        return taskService.upDateTask(name, surname, numberTelephone, rental, individualTraining, commentary);
    }

    @GetMapping("/find")
    public String fihdTask(@RequestParam(value = " name", required = false) String name,
                           @RequestParam(value = "surname", required = false) String surname,
                           @RequestParam(value = "numberTelephone") Integer numberTelephone) {
        return taskService.fihdTask(name, surname, numberTelephone);
    }
}
