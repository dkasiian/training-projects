package com.company;

import java.time.LocalTime;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(LocalTime.now());
    }
}
