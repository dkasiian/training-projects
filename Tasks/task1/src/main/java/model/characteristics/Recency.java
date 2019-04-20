package model.characteristics;

import java.time.LocalDate;

public enum Recency {
    NEW(LocalDate.now()),
    RECENT(LocalDate.now().minusDays(3)),
    FADED(LocalDate.now().minusWeeks(1));

    private LocalDate date;

    Recency(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
