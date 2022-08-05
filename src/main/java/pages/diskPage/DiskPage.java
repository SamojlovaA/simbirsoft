package pages.diskPage;

import constans.AssertMessages;
import locators.LocatorsDiskPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class DiskPage {

    public void openDisk(WebDriver driver){
        WebElement disk = driver.findElement(By.xpath(LocatorsDiskPage.DISK));
        disk.click();
    }

    public void copyFile(WebDriver driver){
        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        WebElement copyFile = driver.findElement(By.xpath(LocatorsDiskPage.FILE_FOR_COPY));
        copyFile.click();
        Actions copyAction= new Actions(driver);
        copyAction.contextClick(copyFile).perform();
        WebElement copy = driver.findElement(By.xpath(LocatorsDiskPage.COPY_BUTTON_PANEL));
        copy.click();
        WebElement testPackage = driver.findElement(By.xpath(LocatorsDiskPage.TEST_PACKAGE_MENU));
        testPackage.click();
        WebElement copyButton = driver.findElement(By.xpath(LocatorsDiskPage.COPY_BUTTON));
        copyButton.click();
    }

    public void deleteFile(WebDriver driver){
        WebElement testPackage = driver.findElement(By.xpath(LocatorsDiskPage.TEST_PACKAGE));
        Actions action= new Actions(driver);
        action.doubleClick(testPackage).perform();
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorsDiskPage.FILE_FOR_COPY)));
        String nameCopyFile = driver.findElement(By.xpath(LocatorsDiskPage.FILE_FOR_COPY)).getText();
        List<WebElement> allElements = driver.findElements(By.xpath(LocatorsDiskPage.DISK_ELEMENTS));
        System.out.println("Количество элементов до удаления:" + allElements.size());
        WebElement copyFile = driver.findElement(By.xpath(LocatorsDiskPage.FILE_FOR_DELETE));
        Actions deleteAction= new Actions(driver);
        deleteAction.contextClick(copyFile).perform();
        WebElement delete = driver.findElement(By.xpath(LocatorsDiskPage.DELETE_BUTTON_PANEL));
        delete.click();
        List<WebElement> allElementsAfterDelete = driver.findElements(By.xpath(LocatorsDiskPage.DISK_ELEMENTS));
        System.out.println("Количество элементов после удаления:" + allElementsAfterDelete.size());
        String baseCopyFile = driver.findElement(By.xpath(LocatorsDiskPage.DISK_ELEMENTS)).getText();
        Assert.assertEquals(AssertMessages.FILE_MISSING_FROM_LIST, baseCopyFile, nameCopyFile);
    }
}
