package com.danilov.sport_abonement_app.model.dto;

import com.danilov.sport_abonement_app.model.Accaunt;
import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.Task;

public class CustomerView {
    private  long customerId;
    private String name;
    private String surname;
    private long numberTelephone;

    public CustomerView() {

    }
    public CustomerView(Customer customer) {
        this.customerId = customer.getCustomerId();
        this.name = customer.getName();
        this.surname = customer.getSurname();
        this.numberTelephone = customer.getNumberTelephone();
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(long numberTelephone) {
        this.numberTelephone = numberTelephone;
    }
}
