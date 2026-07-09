package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.Scrolling.scrollToElement;

public class ActionsElement {
    private ActionsElement(){}

    //SendData

    public static void sendData(WebDriver driver, By locator, String text){
        waitForElementClickable(driver,locator);
        scrollToElement(driver,locator);
        driver.findElement(locator).sendKeys(text);
    }

    private static void waitForElementClickable(WebDriver driver, By locator) {
    }

    public static void clickOnElement(WebDriver driver,By locator){
        waitForElementClickable(driver,locator);
        scrollToElement(driver,locator);
        driver.findElement(locator).click();
    }


}
