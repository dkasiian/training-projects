package com.company;

class FileLogger extends Logger {

    FileLogger(int priority) {
        super(priority);
    }

    @Override
    void print(String message){
        System.out.println("Write to file: " + message);
    }
}
