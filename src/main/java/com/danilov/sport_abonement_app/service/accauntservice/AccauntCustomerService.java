package com.danilov.sport_abonement_app.service.accauntservice;

import com.danilov.sport_abonement_app.model.Accaunt;

public interface AccauntCustomerService {
    String upDateCustomerAccaunt(String name, String surname, Integer numberTelephone, String eMail,
                                 String password, String userName, String login, double amount, Accaunt.Role role, Accaunt.Status status,
                                 String commentary);

    String findCustomerAccaunt(String name, String surname, Integer numberTelephone);




}
