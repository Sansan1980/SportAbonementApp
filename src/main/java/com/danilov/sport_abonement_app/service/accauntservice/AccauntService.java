package com.danilov.sport_abonement_app.service.accauntservice;

import com.danilov.sport_abonement_app.model.Accaunt;
import com.danilov.sport_abonement_app.model.Customer;

import java.util.Map;

public interface AccauntService {
    String upDateAccaunt(String name, String surname, Integer numberTelephone, String eMail,
                      String password, String userName, String login, double amount, Accaunt.Role role, Accaunt.Status status,
                      String commentary);

    String findAccaunt(String name, String surname, Integer numberTelephone);




}
