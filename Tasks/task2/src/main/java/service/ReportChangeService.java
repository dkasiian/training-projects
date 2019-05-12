package service;

import model.entities.Report;

import java.util.List;

public interface ReportChangeService {
    void reportChange(List<Report> reports, Report oldReport, Report newReport);
}
