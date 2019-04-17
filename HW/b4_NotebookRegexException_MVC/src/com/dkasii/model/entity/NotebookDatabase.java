package com.dkasii.model.entity;

public enum NotebookDatabase {
    User1("Дмитро",
            "Касіяненко",
            "Валерійович",
            "dkasiian",
            "5278414",
            "380995673581",
            "dkas@gmail.com"),
    User2("Максим",
            "Сергієнко",
            "Олександрович",
            "mserhien",
            "5279012",
            "380675643569",
            "mserh@ukr.net"),
    User3("Олександр",
            "Калініченко",
            "Віталійович",
            "okalinich",
            "4864527",
            "380506785426",
            "okalinich@gmail.com");

    private final String name, surname, patronymic, nickname, homePhone, mobilePhone, email;

    NotebookDatabase(String name, String surname, String patronymic, String nickname,
                     String homePhone, String mobilePhone, String email){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.nickname = nickname;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getEmail() {
        return email;
    }
}
