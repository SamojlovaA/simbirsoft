package locators;

import org.openqa.selenium.By;

public class LocatorsAuthPage {
    public static final By LOGIN_FIELD = By.xpath("//input[@id ='passp-field-login']");
    public static final By SING_IN_BUTTON = By.xpath("//button[@id ='passp:sign-in']");
    public static final By PASSWORD_FIELD = By.cssSelector("[name='passwd']");
}
