package com.dkasii.controller;

public interface RegexPatterns {
    String REGEX_SURNAME_UKR = "^([А-ЩЮЯЇІЄҐ]{1}[а-щьюяїієґ']+){1}$";
    String REGEX_SURNAME_LAT = "^([A-Z][a-z]+){1}";

    String REGEX_NAME_UKR = "^([А-ЩЮЯЇІЄҐ]{1}[а-щьюяїієґ']+){1}$";
    String REGEX_NAME_LAT = "^([A-Z][a-z]+){1}$";

    String REGEX_PATRONYMIC_UKR = "^([А-ЩЮЯЇІЄҐ]{1}[а-щьюяїієґ']+){1}$";
    String REGEX_PATRONYMIC_LAT = "^([A-Z][a-z]+){1}$";

    String REGEX_NICKNAME = "^[A-Za-z0-9_-]{8,20}$";
    String REGEX_HOMEPHONE = "^[0-9]{7}$";
    String REGEX_MOBILEPHONE = "^(380)[0-9]{9}$";
    String REGEX_EMAIL = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
}
