package model.characteristics;

import java.time.LocalDate;

/**
 * Represents possible flowers recency options.
 */
public enum Recency {
    NEW(LocalDate.now()),
    RECENT(LocalDate.now().minusDays(3)),
    FADED(LocalDate.now().minusWeeks(1));

    private LocalDate date;

    Recency(LocalDate date){
        this.date = date;
    }

    /**
     * Returns the date that represents recency of flower
     *
     * @return the date as a characteristic of the flower recency
     */
    public LocalDate getDate() {
        return date;
    }
}
