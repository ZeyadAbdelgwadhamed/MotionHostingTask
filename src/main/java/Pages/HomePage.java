package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;


    // Constructor
    public HomePage(WebDriver driver) {

        this.driver = driver;

    }


    // Locators

    private By domainsMenu = By.xpath("//a[contains(text(),'Domains')]");

    private By webHostingMenu = By.xpath("//a[contains(text(),'Web Hosting')]");



    // Actions


    public String getHomePageTitle(){

        return driver.getTitle();

    }


    public boolean isDomainsMenuDisplayed(){

        return driver.findElement(domainsMenu).isDisplayed();

    }



}