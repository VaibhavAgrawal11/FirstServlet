package com.firstservlet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidator {
    private String userNamePattern = "^[A-Z][a-z]{2,}$";
    private String passwordPattern = "^(?=.{8})(?=.*[A-Z])(?=.*[0-9])[\\w]*[^\\w][\\w]*$";

    private boolean validator(String entry, String pattern) {
        Pattern patternReader = Pattern.compile(pattern);
        Matcher matcher = patternReader.matcher(entry);
        return matcher.matches();
    }

    public boolean userNameValidation(String username) {
        return validator(username, userNamePattern);
    }

    public boolean passwordValidation(String password) {
        return validator(password, passwordPattern);
    }
}
