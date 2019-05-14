package config;

import controller.ConferenceController;
import service.*;
import service.impl.*;
import view.View;

import java.util.Scanner;

class AppConfig {

    static Scanner scanner() {return new Scanner(System.in); }

    static View view(){
        return new View();
    }

    static ReportChangeService reportChangeService() {
        return new ReportChangeServiceImpl();
    }

    static RestChangeService restChangeService() {
        return new RestChangeServiceImpl();
    }

    static CoffeeBreakChangeService coffeeBreakChangeService() { return new CoffeeBreakChangeServiceImpl(); }

    static InputService inputService() {
        return new InputServiceImpl(
                view(),
                scanner()
        );
    }

    static ConferenceController conferenceController(){
        return new ConferenceController(
                view(),
                reportChangeService(),
                restChangeService(),
                coffeeBreakChangeService(),
                inputService()
        );
    }

}
