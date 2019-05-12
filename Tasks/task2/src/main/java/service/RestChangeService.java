package service;

import model.entities.Rest;

import java.util.List;

public interface RestChangeService {
    void restChange(List<Rest> rests, String oldReportName, String newReportName);
}
