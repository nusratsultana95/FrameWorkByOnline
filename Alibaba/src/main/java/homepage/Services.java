package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Services extends CommonAPI {
    public void ServicesFieldIsDisplayed(){
        Assert.assertEquals(isElementDisplayed("//div[@class='sc-hd-links-box']//a[contains(text(),'Services')]"),true);

    }
    public List<WebElement> getAllElementFromList() {
        //List<WebElement> elementList = driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
        //return elementList;
        return driver.findElements(By.xpath("//*[contains(@class,'sc-hd-prefix2-icon sc-hd-prefix2-icon-arrow-down sc-hd-prefix2-icon-xs animation')]"));
    }
}
