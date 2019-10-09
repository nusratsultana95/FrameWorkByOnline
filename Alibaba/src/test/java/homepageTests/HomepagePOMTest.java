package homepageTests;

import POM.HomepagePOM;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepagePOMTest extends CommonAPI {
   // HomepagePOM homepagePOM = PageFactory.initElements(driver, HomepagePOM.class);
   HomepagePOM homepagePOM;
    @BeforeMethod
    public void setHomePagePOM(){
        homepagePOM=PageFactory.initElements(driver,HomepagePOM.class);
    }

    @Test(enabled = false)
    public void TestReadyToShip(){
        //HomepagePOM homepagePOM = PageFactory.initElements(driver, HomepagePOM.class);
        homepagePOM.ValidateReadyToShipDisplayed();
        homepagePOM.ValidateReadyToShipClickable();
    }
    @Test(enabled = false)
    public void TestTradeShows(){
        homepagePOM.validateTradeShowsDisplayed();
        homepagePOM.validateTradeShowsClickable();
    }

}
