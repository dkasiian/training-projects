import config.AppConfig;
import config.ApplicationContext;
import controller.ConferenceController;
import model.entities.Conference;
import service.ReportChangeService;
import service.impl.ReportChangeServiceImpl;
import view.View;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ApplicationContext();

//        // Services
//        ReportChangeService reportChangeService =
//                (ReportChangeServiceImpl) applicationContext.getBean(ReportChangeServiceImpl.class);
//        // Model
//        Conference conference = (Conference) applicationContext.getBean(Conference.class);
//        // View
//        View view = (View) applicationContext.getBean(View.class);
        // Controller
        ConferenceController conferenceController = (ConferenceController) context.getBean(ConferenceController.class);
        conferenceController.process();
    }
}
