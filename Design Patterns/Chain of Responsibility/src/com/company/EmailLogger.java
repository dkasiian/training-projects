package com.company;

class EmailLogger extends Logger {

    EmailLogger(int priority) {
        super(priority);
    }

    @Override
    void print(String message){
        System.out.println("Email: " + message);
    }
}
