package service;

import model.entities.CoffeeBreak;
import model.entities.Rest;

import java.util.List;

public interface CoffeeBreakChangeService {
    void coffeeBreakChange(List<CoffeeBreak> coffeeBreaks, String oldReportName, String newReportName);

}
