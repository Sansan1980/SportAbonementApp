package com.danilov.sport_abonement_app.service.accauntservice;

import com.danilov.sport_abonement_app.model.Accaunt;

public interface AccauntEmpoyeeService {
    String upDateEmployeeAccaunt(String name, String surname, Integer numberTelephone, String eMail,
                                 String password, String userName, String login, double amount, Accaunt.Role role, Accaunt.Status status,
                                 String commentary);

    String findEmployeeAccaunt(String name, String surname, Integer numberTelephone);




}
