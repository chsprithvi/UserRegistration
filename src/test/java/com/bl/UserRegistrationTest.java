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
}
