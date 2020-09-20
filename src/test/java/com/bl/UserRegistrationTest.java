package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        boolean result = userRegistration.validateName("Prithvi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenShort_shouldReturnFalse() {
        boolean result = userRegistration.validateName("OK");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenStartWithSmallLetters_shouldReturnFalse() {
        boolean result = userRegistration.validateName("prithvi");
        Assert.assertFalse(result);
    }
    //This test case is used for testing email format
    @Test
    public void givenEmail_whenProper_shouldReturnTrue() {
        boolean validationResult = userRegistration.validateEmail("prithvi@gmail.com");
        Assert.assertTrue(validationResult);
    }

    @Test
    public void givenEmail_whenMissingMandotarySymbols_shouldReturnFalse() {
        boolean validationResult = userRegistration.validateEmail("prithvi.com");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenEmail_WhenMissingCompulsoryPart_ShouldReturnFalse() {
        boolean validationResult = userRegistration.validateEmail("prithvi@outllok.");
        Assert.assertFalse(validationResult);
    }
    //This test cases is used for testing mobile format
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean validationResult = userRegistration.validateMobileNumber("9494949494");
        Assert.assertTrue(validationResult);
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        boolean validationResult = userRegistration.validateMobileNumber("956621");
        Assert.assertFalse(validationResult);
    }
    //This test cases is used for testing password format
    @Test
    public void givenPassword_whenProper_shouldReturnTrue() {
        boolean result = userRegistration.validatePassword("Prithvi12345678");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("prithvi");
        Assert.assertFalse(result);
    }

}
