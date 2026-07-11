package Pages;

import Utilities.ActionsElement;
import Utilities.Scrolling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private final WebDriver driver;


    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    // Locators

    private final By cookiesButton =By.cssSelector("button[id='onetrust-accept-btn-handler']");
    private final By domainsMenu = By.xpath("//a[contains(text(),'Domains')]");
    private final By webHostingMenu = By.xpath("//a[contains(text(),'Web Hosting')]");
    private final By domainName= By.xpath("//*[@id=\"imh-footer-navigation\"]/nav/div/div/div[3]/ul/li[14]/a");



    // Actions

    public void acceptAllCookies(){
        ActionsElement.clickOnElement(driver,cookiesButton);
    }

    public String getHomePageTitle(){
        return driver.getTitle();
    }


    public boolean isDomainsMenuDisplayed(){

        return driver.findElement(domainsMenu).isDisplayed();

    }

    public boolean isWebHostingMenuDisplayed(){

        return driver.findElement(webHostingMenu).isDisplayed();

    }



    public void openDomainPage(){
        acceptAllCookies();
        Scrolling.scrollToElement(driver,domainName);
        ActionsElement.clickOnElement(driver,domainName);
    }

}