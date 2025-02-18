package com.danilov.sport_abonement_app.service.taskservice;

public interface TaskCustomerService {
    String upDateCustomerTask(String name, String surname, Integer numberTelephone, Integer rental, Integer individualTraining, String commentary);

    String fihdCustomerTask(String name, String surname, Integer numberTelephone);

}
