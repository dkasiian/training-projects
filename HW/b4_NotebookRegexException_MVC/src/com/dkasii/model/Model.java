package com.dkasii.model;

import com.dkasii.model.entity.Notebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that corresponds to all data-related logic of the application
 */
public class Model {
    private List<Notebook> notebooks;

    public Model(){
        notebooks = new ArrayList<>();
    }

    public void addNewNotebook(Notebook newNotebook){
        notebooks.add(newNotebook);
    }

    public List<Notebook> getNotebooks() {
        return notebooks;
    }
}
