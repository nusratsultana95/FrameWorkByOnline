package homepageTests;

import homepage.Catagories;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CatagoriesTest extends Catagories {
    @Test(enabled = false)
    public void ValidateCatagoriesField(){
        CatagoriesFieldIsDisplayed();
    }
    @Test(enabled = false)
    public void testAllDropDownMenu() {
        List<WebElement> elementList = getAllElementFromList();
        System.out.println(elementList.size());
        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i).getText());
        }

    }
}
