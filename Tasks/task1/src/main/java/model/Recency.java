package model;

import java.time.LocalDate;

public enum Recency {
    NEW(LocalDate.now()),
    RECENT(LocalDate.now().minusDays(3)),
    SHRUNKEN(LocalDate.now().minusWeeks(1)),
    FADED(LocalDate.now().minusWeeks(2));

    private LocalDate date;

    Recency(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
