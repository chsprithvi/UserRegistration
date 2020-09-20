package com.bl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ValidateEmailTest {

    public String testEmails;
    public boolean expectedResult;

    public ValidateEmailTest(){}

    public ValidateEmailTest(String email, boolean expectedResult){
        this.testEmails = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", false},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", false},
                {"abc@1.com", true},
                {"abc@gmail.com.com", false},
                {"abc+100@gmail.com", false}
        });
    }

    @Test
    public void givenEmail_whenProper_shouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail(this.testEmails);
        Assert.assertEquals(this.expectedResult, result);
    }
}
