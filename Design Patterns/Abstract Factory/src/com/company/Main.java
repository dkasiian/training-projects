package com.company;

public class Main {

    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("EN");

        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        Touchpad touchpad = factory.getTouchpad();

        mouse.click();
        keyboard.print();
        touchpad.track(10, 35);
    }

    private static DeviceFactory getFactoryByCountryCode(String lang){
        switch (lang){
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported country code: " + lang);
        }
    }
}
