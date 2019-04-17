package com.dkasii;

import com.dkasii.controller.Controller;
import com.dkasii.model.Model;
import com.dkasii.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View(), new Model());
        controller.processUser();
    }
}
