package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * this class is representing all the page factory of HOMEPAGE
 */
public class PageFactoryOfHomePage extends CommonAPI {
    @FindBy(className = "menu-icon")
    public static WebElement getmenuIcon;
    @FindBy(xpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='world'][contains(text(),'World')]")
    public static WebElement getWorldSection;

    public void validateMenuIcon(){
        getmenuIcon.click();
    }
    public void validateWorldButton2(){
        getWorldSection.click();
    }
}
