import controller.ConferenceController;
import view.View;

public class Main {
    public static void main(String[] args) {
        new ConferenceController(new View()).process();
    }
}
