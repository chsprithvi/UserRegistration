package com.bl;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^([A-Z][a-zA-Z]{2,})$";
    //using for both first and last name
    public boolean validateName(String Name) {
        Pattern pattern =Pattern.compile(NAME_PATTERN);
        return pattern.matcher(Name).matches();
    }
}
