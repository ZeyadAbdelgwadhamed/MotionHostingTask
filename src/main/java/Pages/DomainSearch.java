package Pages;

import Utilities.Waite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class DomainSearch{

    private final WebDriver driver;
    public DomainSearch(WebDriver driver) {
        this.driver=driver ;
    }


    // Locators
    private final By domainTextBox = By.id("domain_search_domain");
    private final By searchButton = By.cssSelector("button[type='submit']");
    private final By orderSummery=By.xpath("//*[@id=\"mat-expansion-panel-header-6\"]/span/mat-panel-title/span");

    private final By availableMessage = By.xpath("//*[@id=\"cdk-accordion-child-6\"]/div/div/table/tbody/tr[1]/td[1]/div[2]");
    private final By price = By.xpath("//*[@id=\"cdk-accordion-child-6\"]/div/div/div[2]/div[2]/span");



    public void searchDomain(String domainName) {
        driver.findElement(domainTextBox).clear();
        driver.findElement(domainTextBox).sendKeys(domainName);
        driver.findElement(searchButton).click();
        Waite.waitForElementClickable(driver,orderSummery);
    }

    public boolean verifyDomainAvailable() {
        return driver.findElement(availableMessage)
                .getText()
                .contains("myautomationtest123.com");
    }

    public boolean verifyCustomerPrice() {

        return driver.findElement(price)
                .getText()
                .contains("$38.99");

    }


}
