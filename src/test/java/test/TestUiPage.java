package test;

import org.junit.jupiter.api.Test;
import pages.authPage.AuthPage;
import pages.diskPage.DiskPage;
import pages.mainPage.MainPage;

public class TestUiPage extends WebDriverBuilder{

    @Test
    public void createFileDisk() {
        MainPage mainPage = new MainPage();
        mainPage.openAuthPage(driver);
        AuthPage authPage = new AuthPage();
        authPage.enterLogin(driver);
        authPage.enterPassword(driver);
        DiskPage diskPage = new DiskPage();
        diskPage.openDisk(driver);
        diskPage.copyFile(driver);
        diskPage.deleteFile(driver);
        mainPage.logOut(driver);
    }
}
