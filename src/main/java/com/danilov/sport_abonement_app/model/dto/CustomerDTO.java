package com.danilov.sport_abonement_app.model.dto;

public class CustomerDTO {

    private long customerId;
    private String name;
    private String surname;
    private long numberTelephone;

    public CustomerDTO() {//забыл для чего джексону нужен пустой конструктор? и как это работает в памяти компа и в jvm?
    }

    public CustomerDTO(long customerId, String name, String surname, long numberTelephone) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.numberTelephone = numberTelephone;
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


