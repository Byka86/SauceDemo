package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void checkLogInWithEmptyPassword() {
        loginPage.open();
        loginPage.login("standard_user", "");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Password is required");
    }

    @Test
    public void checkLogInWithEmptyUsername() {
        loginPage.open();
        loginPage.login("", "secret_sauce");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }

    @Test
    public void checkLogInWithNegativeValue() {
        loginPage.open();
        loginPage.login("test", "test");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void checkLogInWithPositiveValue() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.titleIsDisplayed());
    }
}
