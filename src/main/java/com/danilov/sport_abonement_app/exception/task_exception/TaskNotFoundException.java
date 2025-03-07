package com.danilov.sport_abonement_app.exception.task_exception;

public class TaskNotFoundException extends RuntimeException{
        public TaskNotFoundException() {
            super("Контрагент не найден");
        }
    }

