package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

class FileObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        File file;
        try {
            file = File.createTempFile("TempPressure", "_txt");
            PrintWriter pw = new PrintWriter(file);
            pw.print("Weather changed. temperature: " + temperature + ", pressure: " + pressure);
            pw.println();
            pw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
