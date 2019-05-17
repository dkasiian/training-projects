import model.dao.*;

public class Main {
    public static void main(String[] args) {
        DAOFactory factory = DAOFactory.getInstance();
        ConferenceDAO conferenceDao = factory.createConferenceDao();
        ReportDAO reportDAO = factory.createReportDao();
        RestDAO restDAO = factory.createRestDao();
        CoffeeBreakDAO coffeeBreakDAO =factory.createCoffeeBreakDao();

        System.out.println(conferenceDao.findById(2));
        System.out.println(reportDAO.findById(3));
        System.out.println(restDAO.findById(1));
        System.out.println(coffeeBreakDAO.findById(2));
    }
}
