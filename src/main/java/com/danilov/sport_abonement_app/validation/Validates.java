package com.danilov.sport_abonement_app.validation;


import com.danilov.sport_abonement_app.exception.BadRequestException;
import org.apache.commons.lang3.StringUtils;


public class Validates {
    public static String  validatesString(String name) {
        if (!StringUtils.isBlank(name)) {//Проверяет, является ли CharSequence пустым (""), нулевым или содержит только пробелы.
            if (!StringUtils.isAlpha(name)) {//Проверяет, содержит ли CharSequence только буквы Unicode
                throw new BadRequestException();
               // System.out.println("текст содержит не только буквы -(isAlpha)");
            }

        } else {
             throw new BadRequestException();
            //System.out.println("  или (null) , или (пробел), или (нет символов) ");
        }
        return StringUtils.capitalize(name);//Делает строку заглавной, изменяя первый символ на заглавный согласно;
    }

    public static Integer validatesNumber(Integer numberTelephone) {
        String b = String.valueOf(numberTelephone);
        if (!StringUtils.isBlank(b)) {//Проверяет, является ли CharSequence пустым (""), нулевым или содержит только пробелы.

            if (StringUtils.isNumeric(b)) {//Проверяет, содержит ли CharSequence только цифры Unicode
                System.out.println(numberTelephone);
            } else {
                throw new BadRequestException();// System.out.println("текст содержит не только цифры -(isNumeric)");
            }

        } else {
            throw new BadRequestException();
            //System.out.println("  или (null) , или (пробел), или (нет символов) ");//System.out.println("  или (null) , или (пробел), или (нет символов) ");
        }
        //сделать приведение номера телефона к единому формату
        return numberTelephone;//Integer.valueOf(b);
    }
    public static String removeSymbols(String phoneNumber) {
        // Объявили метод удалитьСимволы
        return phoneNumber.replace("-", "")
                .replace("(", "")
                .replace(")", "");
    }

    public static String validateCountry(String phoneNumber) {
        // Объявили метод подтвердитьСтрану
        if (phoneNumber.startsWith("8")) {
            return phoneNumber.replaceFirst("8", "+7");
        } else if (phoneNumber.startsWith("7")) {
            return "+" + phoneNumber;
        }
        return phoneNumber;
    }

    public static Integer validatesPasword(Integer password) {
        return null;
    }

    //_____
}


