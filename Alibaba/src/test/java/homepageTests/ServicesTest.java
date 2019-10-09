package homepageTests;

import homepage.Services;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ServicesTest extends Services {
    @Test
    public void ValidateServicesField(){
        ServicesFieldIsDisplayed();
    }
    @Test
    public void testAllDropDownMenu() {
        List<WebElement> elementList = getAllElementFromList();
        System.out.println(elementList.size());
        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i).getText());
        }

    }
}
