import controller.ConferenceController;
import view.View;

public class Main {
    public static void main(String[] args) {
        ConferenceController conferenceController = new ConferenceController(new View());
        conferenceController.process();
    }
}
