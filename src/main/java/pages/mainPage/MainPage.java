package pages.mainPage;

import constans.AssertMessages;
import constans.URLs;
import locators.LocatorsMainPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    public void openAuthPage(WebDriver driver){
        driver.get(URLs.URL_YANDEX);
        WebElement loginButton = driver.findElement(LocatorsMainPage.LOGIN_BUTTON);
        loginButton.click();
        String authUrl = driver.getCurrentUrl();
        Assert.assertEquals(AssertMessages.AUTH_PAGE_DID_NOT_OPEN, authUrl, URLs.URL_AUTH);
    }
    public void logOut(WebDriver driver){
        WebElement userIcon = driver.findElement(By.xpath(LocatorsMainPage.USER_ICON));
        userIcon.click();
        WebElement logOutButton = driver.findElement(By.xpath(LocatorsMainPage.LOG_OUT_BUTTON));
        logOutButton.click();

    }

}
