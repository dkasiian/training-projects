package config;

import controller.*;
import service.*;
import view.View;

import java.util.Scanner;

public class ApplicationContext {

    public Object getBean(Class bean) {
        if (bean.equals(ReportChangeService.class))
            return AppConfig.reportChangeService();
        else if (bean.equals(RestChangeService.class))
            return AppConfig.restChangeService();
        else if (bean.equals(CoffeeBreakChangeService.class))
            return AppConfig.coffeeBreakChangeService();
        else if (bean.equals(Scanner.class))
            return AppConfig.scanner();
        else if (bean.equals(View.class))
            return AppConfig.view();
        else if (bean.equals(InputService.class))
            return AppConfig.inputService();
        else if (bean.equals(ConferenceController.class))
            return AppConfig.conferenceController();

        return null;
    }

}
