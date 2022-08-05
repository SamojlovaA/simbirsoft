package locators;

import org.openqa.selenium.By;

public class LocatorsMainPage {
    public static final By LOGIN_BUTTON = By.xpath("//a[contains(@class, 'desk-notif-card__login-new-item_enter')]/child::div[contains(text(),'Войти')]");
    public static final String USER_ICON = "//div[contains(@class, 'PSHeader-User')]";
    public static final String LOG_OUT_BUTTON = "//a[contains(@class, 'legouser__menu-item_action_exit')]";
}
