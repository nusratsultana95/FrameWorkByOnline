package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Catagories extends CommonAPI {
    public void CatagoriesFieldIsDisplayed(){
        Assert.assertEquals(isElementDisplayed("//div[@class='sc-hd-category']//span[contains(text(),'Categories')]"),true);
        //clickOnElementByXpath("//div[@class='sc-hd-category']//i[@class='sc-hd-prefix2-icon sc-hd-prefix2-icon-arrow-down sc-hd-prefix2-icon-xs'] ");
    }
    public List<WebElement> getAllElementFromList() {
        //List<WebElement> elementList = driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
        //return elementList;
        return driver.findElements(By.xpath("//*[contains(@class,'header-category-trigger')]"));
    }
}
