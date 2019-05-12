package service.impl;

import model.entities.CoffeeBreak;
import service.CoffeeBreakChangeService;

import java.util.List;

public class CoffeeBreakChangeServiceImpl implements CoffeeBreakChangeService {
    @Override
    public void coffeeBreakChange(List<CoffeeBreak> coffeeBreaks, String oldReportName, String newReportName) {
        coffeeBreaks.replaceAll(coffeeBreak ->
                coffeeBreak.getAfterReportName().equals(oldReportName) ?
                        new CoffeeBreak(newReportName, coffeeBreak.getCupsNumber()) : coffeeBreak);
    }
}
