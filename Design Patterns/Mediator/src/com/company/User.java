package com.company;

abstract class User {
    private Chat chat;
    private String name;
    private boolean isEnable;

    User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    void setEnable(boolean enable) {
        isEnable = enable;
    }

    boolean isEnable(){return isEnable;}

    String getName() {
        return name;
    }

    void sendMessage(String message){
        chat.sendMessage(message, this);
    }

    abstract void getMessage(String message);
}
