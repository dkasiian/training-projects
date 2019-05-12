package service.impl;

import model.entities.Rest;
import service.RestChangeService;

import java.util.List;

public class RestChangeServiceImpl implements RestChangeService {

    @Override
    public void restChange(List<Rest> rests, String oldReportName, String newReportName) {
        rests.replaceAll(rest ->
                rest.getAfterReportName().equals(oldReportName) ? new Rest(newReportName, rest.getMinutes()) : rest
        );
    }
}
