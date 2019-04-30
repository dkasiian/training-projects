package com.company;

class Game {
    private String level;
    private int ms;

    void setLevelAndTime(String level, int ms){
        this.level = level;
        this.ms = ms;
    }

    void load(Save save){
        level = save.getLevel();
        ms = save.getMs();
    }

    Save save(){
        return new Save(level, ms);
    }

    @Override
    public String toString() {
        return "Game [level=" + level + ", ms=" + ms + "]";
    }
}
