package com.danilov.sport_abonement_app.service.taskservice;

import com.danilov.sport_abonement_app.exception.task_exception.TaskNotFoundException;
import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.model.Task;
import com.danilov.sport_abonement_app.service.employeeservice.EmployeeServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TaskEmployeeServiceImpl implements TaskEmployeeService {
    private EmployeeServiceImpl employeeService;

    public TaskEmployeeServiceImpl(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

//    private CustomerServiceImpl customerService;
//
//    public TaskServiceImpl(CustomerServiceImpl customerService) {
//        this.customerService = customerService;
//    }

    public String upDateEmployeeTask(String name, String surname, Integer numberTelephone, Integer rental, Integer individualTraining, String commentary) {
        if (employeeService.getEmployeeMap().containsKey(key(name, surname, numberTelephone))) {
            Employee employee = employeeService.getEmployeeMap().get(key(name, surname, numberTelephone));
            Task task = employee.getTasks();
            task.setRental(rental);
            task.setIndividualTraining(individualTraining);
            task.setCommentary(commentary);
            return new StringBuilder().append("Изменены задачи сотрудника ").append(name).append(", ").append(surname).append(", ").append(numberTelephone).append("Задачи :").append(task.toString()).toString();
        }
//        } else if (customerService.getCustomerMap().containsKey(key(name, surname, numberTelephone))) {
//            Customer customer = customerService.getCustomerMap().get(key(name, surname, numberTelephone));
//            Task task = customer.getTasks();
//            task.setRental(rental);
//            task.setIndividualTraining(individualTraining);
//            task.setCommentary(commentary);
//            return "Изменены задачи клиента "+ name + ", " + surname + ", " + numberTelephone + "Задачи :" + task.getRental() + ", " + task.getIndividualTraining() + "," + task.getCommentary();
//    }
        throw new TaskNotFoundException();
    }

    public String fihdEmployeeTask(String name, String surname, Integer numberTelephone) {
        if (employeeService.getEmployeeMap().containsKey(key(name, surname, numberTelephone))) {
            Employee employee = employeeService.getEmployeeMap().get(key(name, surname, numberTelephone));
            Task task = employee.getTasks();
            return "Найдены задачи для сотрудника , " + name + surname + ", " + numberTelephone + "Задачи; " + task.toString();
        }
//        } else if (customerService.getCustomerMap().containsKey(key(name, surname, numberTelephone))) {
//            Customer customer = customerService.getCustomerMap().get(key(name, surname, numberTelephone));
//            Task task = customer.getTasks();
//            return "Найдены задачи для клиента , " + name + surname +", " + numberTelephone + "Задачи; " + task.toString();
//        }
        throw new TaskNotFoundException();
    }

    private String key(String name, String surname, Integer numberTelephone) {
        return name + surname + numberTelephone;
    }
}
