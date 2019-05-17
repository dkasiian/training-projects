import controller.ConferenceController;
import model.service.impl.*;
import view.View;

public class Main {
    public static void main(String[] args) {
        ConferenceController conferenceController = new ConferenceController(
                new View(),
                new MakeConferenceServiceImpl(),
                new ConferenceDurationServiceImpl(),
                new ReportsNumberServiceImpl(),
                new RestsNumberServiceImpl(),
                new CoffeeBreaksNumberServiceImpl()
        );
        conferenceController.process();
    }
}
