package com.dkasii.model.entity;

public class Notebook {

    private String name, surname, patronymic, nickname, homePhone, mobilePhone, email;

    public Notebook(String name, String surname, String patronymic, String nickname,
                    String homePhone, String mobilePhone, String email) throws NotUniqueNicknameException {

        if (!isUniqueNickname(nickname)){
            throw new NotUniqueNicknameException("Такий нікнейм вже зайнятий, введіть інший нікнейм.", nickname);
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

    @Override
    public String toString(){
        return "NoteBook{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic=" + patronymic + '\'' +
                ", nickname=" + nickname + '\'' +
                ", homePhone=" + homePhone + '\'' +
                ", mobilePhone=" + mobilePhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
