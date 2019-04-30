package com.company;

public class Main {

    public static void main(String[] args) {
        Logger smsLogger = new SMSLogger(Level.ERROR);
        Logger fileLogger = new FileLogger(Level.DEBUG);
        Logger emailLogger = new EmailLogger(Level.INFO);
        smsLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(emailLogger);

        smsLogger.writeMessage("All good", Level.INFO);
        smsLogger.writeMessage("Debug state", Level.DEBUG);
        smsLogger.writeMessage("System fall", Level.ERROR);
    }
}
