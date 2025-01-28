package com.danilov.sport_abonement_app.exception;


public class BadRequestException extends RuntimeException {
    public BadRequestException() {super("Ошибка Запроса проверка не пройдена,  статус 400 Bad Request.");
    }

}