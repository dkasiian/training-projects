package com.company;

class SimpleUser extends User {

    SimpleUser(Chat chat, String message) {
        super(chat, message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User " + getName() + " get message " + message);
    }
}
