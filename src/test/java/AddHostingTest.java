import Pages.AddHosting;
import org.testng.annotations.Test;


public class AddHostingTest extends BaseTest {

    @Test
    public void userCanPayTheHostingSuccessfully(){

        AddHosting addHosting=new AddHosting(driver);
        addHosting.userCanAddHosting();
    }

}
