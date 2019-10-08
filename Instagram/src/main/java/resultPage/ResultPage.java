package resultPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

public class ResultPage extends CommonAPI {
    public void signupPageDisplayed(){
        WebElement element= getElement("//h4[contains(@class,'')]");
        Assert.assertEquals(element.isDisplayed(),true,"Signup page is not displayed");
        TestLogger.log("Suggestion for you page is displayed "+ element.isDisplayed());
        }
    }

