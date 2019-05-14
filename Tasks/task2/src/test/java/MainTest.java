import config.ConferenceFactory;
import model.entities.Conference;
import model.entities.Report;
import model.repository.ConferenceDB;
import model.repository.ReportsDB;
import org.junit.jupiter.api.Test;
import service.impl.ReportChangeServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testReportChangeService(){
        Conference conference = ConferenceFactory.getConference(ConferenceDB.JAVA_DAY_KYIV_2019);
        Report oldReport = conference.getReports().get(0);
        Report newReport = ConferenceFactory.getReport(ReportsDB.JAVA12);
        new ReportChangeServiceImpl().reportChange(conference.getReports(), oldReport, newReport);

        assertEquals(ReportsDB.JAVA12.getReportName(), conference.getReports().get(0).getReportName());
    }

}
