package com.company;

public class Main {

    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Ivan");
        User u1= new SimpleUser(chat, "John");
        User u2 = new SimpleUser(chat, "Alex");
        User u3 = new SimpleUser(chat, "Kevin");
        u2.setEnable(false);

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);
        chat.addUser(u3);

        u1.sendMessage("Hi, I am John");
        admin.sendMessage("Hi, I am Admin");
    }
}
