package com.danilov.sport_abonement_app.exception.accaunt_exception;

public class NotFoundException extends RuntimeException{
        public NotFoundException() {
            super("Контрагент не найден");
        }
    }

