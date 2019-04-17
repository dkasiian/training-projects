package com.dkasii.controller;

import com.dkasii.model.Model;
import com.dkasii.model.entity.Notebook;
import com.dkasii.view.View;

import java.io.*;
import java.util.List;

/**
 * Class that process all the business logic and incoming requests,
 * manipulate data using the model component and
 * interact with the view to render the final output
 */
public class Controller {

    private View view;
    private Model model;
    private BufferedReader br;

    public Controller (View view, Model model) {
        this.view = view;
        this.model = model;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void processUser() {

        InputNotebook inputNoteBook = new InputNotebook(view, model, br);
        inputNoteBook.inputNote();

        List<Notebook> notebooks = model.getNotebooks();
        view.printNotesFromNotebooks(notebooks);
    }
}
