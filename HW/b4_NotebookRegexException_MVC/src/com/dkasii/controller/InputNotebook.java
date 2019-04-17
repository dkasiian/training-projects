package com.dkasii.controller;

import com.dkasii.model.Model;
import com.dkasii.view.View;

import static com.dkasii.controller.RegexPatterns.*;
import static com.dkasii.view.ViewConstants.*;

import java.io.BufferedReader;

public class InputNotebook {
    private View view;
    private Model model;
    private BufferedReader br;

    private String surname, name, patronymic, nickname, homePhone, mobilePhone, email;

    public InputNotebook(View view, Model model, BufferedReader br) {
        this.view = view;
        this.model = model;
        this.br = br;
    }

    public void inputNote() {
        UtilityController utilityController = new UtilityController(br, view, model);

        String namePattern = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        String surnamePattern = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_SURNAME_UKR : REGEX_SURNAME_LAT;
        String patronymicPattern = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_PATRONYMIC_UKR : REGEX_PATRONYMIC_LAT;

        this.name = utilityController.inputAndValidate(FIRST_NAME_DATA, namePattern, br);
        this.surname = utilityController.inputAndValidate(LAST_NAME_DATA, surnamePattern, br);
        this.patronymic = utilityController.inputAndValidate(PATRONYMIC_NAME_DATA, patronymicPattern, br);
        this.nickname = utilityController.inputAndValidate(NICKNAME_DATA, REGEX_NICKNAME, br);
        this.homePhone = utilityController.inputAndValidate(HOMEPHONE_DATA, REGEX_HOMEPHONE, br);
        this.mobilePhone = utilityController.inputAndValidate(MOBILEPHONE_DATA, REGEX_MOBILEPHONE, br);
        this.email = utilityController.inputAndValidate(EMAIL_DATA, REGEX_EMAIL, br);

        utilityController.createAndSaveNewNotebook(this.name,
                this.surname,
                this.patronymic,
                this.nickname,
                this.homePhone,
                this.mobilePhone,
                this.email);
    }
}
