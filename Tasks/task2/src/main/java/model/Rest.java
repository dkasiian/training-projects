package model;

import java.time.LocalDateTime;


class Rest {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private RestLength restLength;

    Rest(LocalDateTime startTime, LocalDateTime endTime, RestLength restLength) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.restLength = restLength;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public RestLength getRestLength() {
        return restLength;
    }
}
