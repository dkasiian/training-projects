package com.company;

class SMSLogger extends Logger {

    SMSLogger(int priority) {
        super(priority);
    }

    @Override
    void print(String message){
        System.out.println("SMS: " + message);
    }
}
