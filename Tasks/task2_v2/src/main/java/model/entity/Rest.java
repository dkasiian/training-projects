package model.entity;

public class Rest implements Activity {
    private int id;
    private String type;
    private int duration;

    public Rest(){}

    public Rest(int id, String type, int duration) {
        this.id = id;
        this.type = type;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Rest{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", duration=" + duration +
                '}';
    }
}
