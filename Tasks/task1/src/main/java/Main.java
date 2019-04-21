import controller.Controller;
import view.View;

/**
 * Class to start the application.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View());
        controller.process();
    }
}
