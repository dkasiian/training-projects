package com.company;

class EnMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Click.");
    }

    @Override
    public void dbclick() {
        System.out.println("Double click.");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0){
            System.out.println("Scroll up.");
        } else if (direction < 0){
            System.out.println("Scroll down");
        } else {
            System.out.println("No scroll.");
        }
    }
}
