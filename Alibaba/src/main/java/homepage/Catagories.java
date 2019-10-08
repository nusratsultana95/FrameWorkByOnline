package homepage;

import base.CommonAPI;
import org.testng.Assert;

public class Catagories extends CommonAPI {
    public void CatagoriesFieldIsDisplayed(){
        Assert.assertEquals(isElementEnabled("//div[@class='sc-hd-category']//span[contains(text(),'Categories')]"),true);
        clickOnElementByXpath("//div[@class='sc-hd-category']//i[@class='sc-hd-prefix2-icon sc-hd-prefix2-icon-arrow-down sc-hd-prefix2-icon-xs'] ");
    }
}
