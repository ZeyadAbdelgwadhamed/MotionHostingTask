package Pages;

import Utilities.ActionsElement;
import Utilities.Waite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static Utilities.Waite.waitForElementClickable;

public class AddHosting {

    public AddHosting(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    private final By cookiesButton =By.cssSelector("button[id='onetrust-accept-btn-handler']");
    private final By addHosting= By.xpath("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[1]/a");
    private final By selectHostingPlain=By.xpath("//*[@id=\"vps-hosting-rostrum\"]/div[1]/div[2]/div[1]/div/div[2]/a");
    private final By productName=By.xpath("//*[@id=\"cdk-accordion-child-6\"]/div/div/table/tbody/tr[1]/td[1]/div[1]");


    public void acceptAllCookies(){
        waitForElementClickable(driver,cookiesButton);
        ActionsElement.clickOnElement(driver,cookiesButton);
    }

    public void userCanAddHosting(){

        acceptAllCookies();
        ActionsElement.clickOnElement(driver, addHosting);
        ActionsElement.clickOnElement(driver, selectHostingPlain);
        Waite.waitForElementClickable(driver,productName);

    }


}
