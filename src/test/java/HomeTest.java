
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest {


    @Test
    public void verifyHomePage(){

        HomePage homePage = new HomePage(driver);

//        homePage.acceptAllCookies();

        // Verify Title

        Assert.assertTrue(
                homePage.getHomePageTitle()
                        .contains("InMotion Hosting"));

        homePage.openDomainPage();
    }


}