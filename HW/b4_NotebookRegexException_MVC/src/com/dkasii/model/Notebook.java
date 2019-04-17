package com.dkasii.model;

public class Notebook {

    private String surname, name, patronymic, nickname, homePhone, mobilePhone, email;

    public Notebook(){}

    public Notebook(String name, String surname, String patronymic, String nickname,
                    String homePhone, String mobilePhone, String email) throws NicknameException {

        if (!isUniqueNickname(nickname)){
            throw new NicknameException("Такий нікнейм вже зайнятий, введіть інший нікнейм.");
        }

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.nickname = nickname;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }

    private boolean isUniqueNickname(String nickname){
        boolean isUnique = true;
        for(NotebookDatabase nd : NotebookDatabase.values()){
            if(nd.getNickname().equals(nickname)){
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }
}
