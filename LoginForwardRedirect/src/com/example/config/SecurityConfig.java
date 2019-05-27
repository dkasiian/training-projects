package com.example.config;

import java.util.*;

public class SecurityConfig {
    public static final String ROLE_USER = "USER";
    public static final String ROLE_SPEAKER = "SPEAKER";
    public static final String ROLE_ADMIN = "ADMIN";

    // String: Role
    // List<String>: urlPatterns.
    private static final Map<String, List<String>> mapConfig = new HashMap<>();

    static {
        init();
    }

    private static void init() {
        // Конфигурация для роли "USER".
        List<String> urlPatternsForUser = new ArrayList<>();
        urlPatternsForUser.add("/userInfo");
        urlPatternsForUser.add("/user");
        mapConfig.put(ROLE_USER, urlPatternsForUser);

        // Конфигурация для роли "SPEAKER".
        List<String> urlPatternsForSpeaker = new ArrayList<>();
        urlPatternsForSpeaker.add("/userInfo");
        urlPatternsForSpeaker.add("/speaker");
        mapConfig.put(ROLE_SPEAKER, urlPatternsForSpeaker);

        // Конфигурация для роли "ADMIN".
        List<String> urlPatternsForAdmin = new ArrayList<>();
        urlPatternsForAdmin.add("/userInfo");
        urlPatternsForAdmin.add("/admin");
        mapConfig.put(ROLE_ADMIN, urlPatternsForAdmin);
    }

    public static Set<String> getAllAppRoles() {
        return mapConfig.keySet();
    }

    public static List<String> getUrlPatternsForRole(String role) {
        return mapConfig.get(role);
    }
}
