package model;

import java.time.LocalDateTime;

class CoffeeBreak {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int cupsNumber;
    private int coffeeNumber;

    CoffeeBreak(LocalDateTime startTime, LocalDateTime endTime, int cupsNumber, int coffeeNumber) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.cupsNumber = cupsNumber;
        this.coffeeNumber = coffeeNumber;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public int getCupsNumber() {
        return cupsNumber;
    }

    public int getCoffeeNumber() {
        return coffeeNumber;
    }
}
