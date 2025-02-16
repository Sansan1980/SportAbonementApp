package com.danilov.sport_abonement_app.controller;

import com.danilov.sport_abonement_app.exception.accaunt_exception.NotFoundException;
import com.danilov.sport_abonement_app.model.Accaunt;
import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.service.accauntservice.AccauntServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accaunt")
public class AccauntController {
    private AccauntServiceImpl accauntService;

    public AccauntController(AccauntServiceImpl accauntService) {
        this.accauntService = accauntService;
    }

    @GetMapping("/upDate")
    public String upDateAccaunt(@RequestParam(value = "name", required = false) String name,
                                @RequestParam(value = "surname", required = false) String surname,
                                @RequestParam(value = "numberTelephone", required = false) Integer numberTelephone,
                                @RequestParam(value = "eMail", required = false) String eMail,
                                @RequestParam(value = "password", required = false) String password,
                                @RequestParam(value = "userName", required = false) String userName,
                                @RequestParam(value = "login", required = false) String login,
                                @RequestParam(value = "amount", required = false) double amount,
                                @RequestParam(value = "role", required = false) Accaunt.Role role,
                                @RequestParam(value = "status", required = false) Accaunt.Status status,
                                @RequestParam(value = "commentary", required = false) String commentary) {
        return accauntService.upDateAccaunt(name, surname, numberTelephone, eMail, password, userName, login, amount, role, status, commentary);
    }

    @GetMapping("/find")
    public String findAccaunt(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              @RequestParam(value = "numberTelephone") Integer numberTelephone) {
        return accauntService.findAccaunt(name, surname, numberTelephone);
    }
}
//Контроллеры в приложении предназначены для управления поведением вашего приложения, обрабатывая запросы и взаимодействуя с моделями. В контексте сущности "Account" контроллеры могут включать:
//AccountController: Основные действия, связанные с учетными записями.
//createAccount(): Для создания новой учетной записи.
//login(): Для аутентификации пользователя.
//updateAccount(): Для обновления информации о пользователе.
//deleteAccount(): Для удаления учетной записи.

