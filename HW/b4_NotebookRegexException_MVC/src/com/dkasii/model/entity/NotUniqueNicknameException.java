package com.dkasii.model.entity;

public class NotUniqueNicknameException extends Exception {
    private String nicknameData;

    public NotUniqueNicknameException(String message, String nicknameData){
        super(message);
        this.nicknameData = nicknameData;
    }

    public String getNicknameData() {
        return nicknameData;
    }
}
