package homepagetest;

import POM.HomePagePOM;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class HomePagePOMFactory extends CommonAPI {
    HomePagePOM homePagePOM;

    @BeforeMethod
    public void setHomePagePOM(){
        homePagePOM = PageFactory.initElements(driver,HomePagePOM.class);
    }

    @Test @Ignore
    public void testTvShows(){
        homePagePOM.validateTvShows();
    }

}
