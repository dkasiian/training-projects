package com.company;

class Save {
    private final String level;
    private final int ms;

    Save(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }


    String getLevel() {
        return level;
    }

    int getMs() {
        return ms;
    }
}
