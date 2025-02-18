package com.danilov.sport_abonement_app.service.taskservice;

public interface TaskEmployeeService {
    String upDateEmployeeTask(String name, String surname, Integer numberTelephone, Integer rental, Integer individualTraining, String commentary);

    String fihdEmployeeTask(String name, String surname, Integer numberTelephone);

}
