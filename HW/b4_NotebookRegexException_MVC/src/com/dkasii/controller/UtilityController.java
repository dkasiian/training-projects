package com.dkasii.controller;

import com.dkasii.model.Model;
import com.dkasii.model.NicknameException;
import com.dkasii.model.Notebook;
import com.dkasii.view.View;

import java.io.BufferedReader;
import java.io.IOException;

import static com.dkasii.controller.RegexPatterns.REGEX_NICKNAME;
import static com.dkasii.view.ViewConstants.NICKNAME_DATA;

public class UtilityController {
    private View view;
    private Model model;
    private BufferedReader br;

    public UtilityController(BufferedReader br, View view, Model model){
        this.br = br;
        this.view = view;
        this.model = model;
    }

    /**
     * @param message Reports what you need to enter
     * @param pattern Regular expression pattern for input validation
     * @param br Reader to read text from a character-input stream
     * @return Validated user's data
     */
    String inputAndValidate(String message, String pattern, BufferedReader br) {
        String result;
        while (true) {
            try {
                view.printStringInput(message);
                result = br.readLine().trim();
                if (result.matches(pattern))
                    return result;
                else
                    view.printWrongStringInput();

            } catch (IOException e) {
                view.printException(e);
            }
        }
    }

    /**
     * Create a new notebook and save it to Model
     */
    void createAndSaveNewNotebook(String name,
                                  String surname,
                                  String patronymic,
                                  String nickname,
                                  String homePhone,
                                  String mobilePhone,
                                  String email) {
        while (true) {
            try {
                Notebook notebook = new Notebook(name,
                        surname,
                        patronymic,
                        nickname,
                        homePhone,
                        mobilePhone,
                        email);
                this.model.addNewNotebook(notebook);
                break;
            } catch (NicknameException e) {
                System.out.println(e.getMessage());
                nickname = inputAndValidate(NICKNAME_DATA, REGEX_NICKNAME, br);
            }
        }
    }
}
