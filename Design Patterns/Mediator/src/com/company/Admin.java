package com.company;

class Admin extends User {

    Admin(Chat chat, String message) {
        super(chat, message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin  " + getName() + " get message " + message );
    }
}
