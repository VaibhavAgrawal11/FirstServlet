package com.firstservlet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidator {
    String userNamePattern = "^[A-Z][a-z]{2,}$";

    public boolean userNameValidation(String username) {
        Pattern pattern = Pattern.compile(userNamePattern);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
