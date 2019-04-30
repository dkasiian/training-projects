package com.company;

abstract class Logger {
    private Logger nextLogger;
    private int priority;

    Logger(int priority) {
        this.priority = priority;
    }

    void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    void writeMessage(String message, int level){
        if (level <= priority){
            print(message);
        }
        if (nextLogger != null){
            nextLogger.writeMessage(message, level);
        }
    }

    abstract void print(String message);
}
