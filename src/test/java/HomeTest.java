

//import BaseTest;
//import com.inmotion.pages.HomePage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest {


    @Test
    public void verifyHomePage(){

        HomePage homePage = new HomePage(driver);


        // Verify Title

        Assert.assertTrue(
                homePage.getHomePageTitle()
                        .contains("InMotion Hosting"),
                "Title does not contain InMotion Hosting"
        );


        // Verify Menu

        Assert.assertTrue(
                homePage.isDomainsMenuDisplayed(),
                "Domains menu is not displayed"
        );


//        Assert.assertTrue(
//                homePage.isWebHostingMenuDisplayed(),
//                "Web Hosting menu is not displayed"
//        );


    }

}