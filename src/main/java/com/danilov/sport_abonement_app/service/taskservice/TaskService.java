package com.danilov.sport_abonement_app.service.taskservice;

public interface TaskService {
    String upDateTask(String name, String surname, Integer numberTelephone, Integer rental, Integer individualTraining, String commentary);

    String fihdTask(String name, String surname, Integer numberTelephone);

}
