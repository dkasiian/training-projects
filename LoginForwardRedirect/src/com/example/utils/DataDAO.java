package com.example.utils;

import com.example.bean.UserAccount;
import com.example.config.SecurityConfig;

import java.util.HashMap;
import java.util.Map;

public class DataDAO {
    private static final Map<String, UserAccount> mapUsers = new HashMap<>();

    static {
        initUsers();
    }

    private static void initUsers() {

        // This user has a role as USER.
        UserAccount usr = new UserAccount("user1", "123", UserAccount.GENDER_MALE,
                SecurityConfig.ROLE_USER);

        // This user has 2 roles USER and SPEAKER.
        UserAccount spk = new UserAccount("speaker1", "123", UserAccount.GENDER_MALE,
                SecurityConfig.ROLE_USER, SecurityConfig.ROLE_SPEAKER);

        // This user has 3 roles USER, SPEAKER and ADMIN.
        UserAccount adm = new UserAccount("admin1", "123", UserAccount.GENDER_FEMALE,
                SecurityConfig.ROLE_USER, SecurityConfig.ROLE_SPEAKER, SecurityConfig.ROLE_ADMIN);

        mapUsers.put(usr.getUserName(), usr);
        mapUsers.put(spk.getUserName(), spk);
        mapUsers.put(adm.getUserName(), adm);
    }

    // Find a User by userName and password.
    public static UserAccount findUser(String userName, String password) {
        UserAccount u = mapUsers.get(userName);
        if (u != null && u.getPassword().equals(password)) {
            return u;
        }
        return null;
    }
}
