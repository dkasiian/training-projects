import config.ApplicationContext;
import controller.ConferenceController;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext();

        ConferenceController conferenceController = (ConferenceController) context.getBean(ConferenceController.class);
        conferenceController.process();
    }
}
