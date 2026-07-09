import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.DomainSearch;

public class DomainSearchTest extends BaseTest {

    @Test
    public void verifyDomainSearch() {

        HomePage homePage = new HomePage(driver);
        DomainSearch domainSearchPage = new DomainSearch(driver);
        homePage.openDomainPage();
        domainSearchPage.searchDomain("myautomationtest123.com");

    }

    @Test(priority = 2)
    public void VerifyCustomerPrice(){
        DomainSearch domainSearchPage = new DomainSearch(driver);
        domainSearchPage.verifyDomainAvailable();
        domainSearchPage.verifyCustomerPrice();

    }

}