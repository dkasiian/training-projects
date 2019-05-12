package service.impl;

import model.entities.Report;
import service.ReportChangeService;

import java.util.List;

public class ReportChangeServiceImpl implements ReportChangeService {

    @Override
    public void reportChange(List<Report> reports, Report oldReport, Report newReport) {
        reports.set(reports.indexOf(oldReport), newReport);
    }

}
