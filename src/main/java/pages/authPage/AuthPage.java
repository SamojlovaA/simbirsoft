package pages.authPage;

import constans.AssertMessages;
import constans.Login;
import locators.LocatorsAuthPage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthPage {

    public void enterLogin(WebDriver driver){
        WebElement loginFieldInput = driver.findElement(LocatorsAuthPage.LOGIN_FIELD);
        loginFieldInput.sendKeys(Login.LOGIN);
        String loginFieldValue = loginFieldInput.getAttribute("value");
        Assert.assertEquals(AssertMessages.AUTH_FILLED_INCORRECTLY, loginFieldValue, Login.LOGIN);
        WebElement singInButton = driver.findElement(LocatorsAuthPage.SING_IN_BUTTON);
        singInButton.click();
    }

    public void enterPassword(WebDriver driver){
        WebElement passwordFieldInput = driver.findElement(LocatorsAuthPage.PASSWORD_FIELD);
        passwordFieldInput.sendKeys(Login.PASSWORD);
        String passwordFieldValue = passwordFieldInput.getAttribute("value");
        Assert.assertEquals(AssertMessages.PASSWORD_FILLED_INCORRECTLY, passwordFieldValue, Login.PASSWORD);
        passwordFieldInput.sendKeys(Keys.ENTER);
    }
}
