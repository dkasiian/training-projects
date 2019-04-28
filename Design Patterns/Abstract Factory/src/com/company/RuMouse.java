package com.company;

class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Клик.");
    }

    @Override
    public void dbclick() {
        System.out.println("Двойной клик.");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0){
            System.out.println("Скроллим верх.");
        } else if (direction < 0){
            System.out.println("Скроллим вниз");
        } else {
            System.out.println("Не скроллим.");
        }
    }
}
