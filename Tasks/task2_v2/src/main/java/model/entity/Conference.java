package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Conference {
    private int id;
    private String name;

    private List<Activity> activities;

    public Conference(){
        activities = new ArrayList<>();
    }

    public Conference(int id, String name, List<Activity> activities) {
        this.id = id;
        this.name = name;
        this.activities = activities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", activities=" + activities.size() +
                '}';
    }


}
