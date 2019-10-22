package loginresult;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

public class LogInResultPage extends CommonAPI {
        public void validateLogInPageDisplayed(){
            WebElement element = getElement("//div[@class='jsx-4098041838 auth-login']");
            Assert.assertEquals(element.isDisplayed(),true,"Element isn't displayed");
            TestLogger.log("Log in page is displayed: "+element.isDisplayed());
        }
}
