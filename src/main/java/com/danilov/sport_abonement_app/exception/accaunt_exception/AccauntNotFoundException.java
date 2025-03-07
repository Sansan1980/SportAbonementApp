package com.danilov.sport_abonement_app.exception.accaunt_exception;

public class AccauntNotFoundException extends RuntimeException{
        public AccauntNotFoundException() {
            super("Контрагент не найден");
        }
    }

