package testClasses;

import base.CommonAPI;
import net.bytebuddy.utility.JavaModule;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PageFactoryOfHomePage;

public class PageFactoryTestClassOfHomePage extends CommonAPI {
    PageFactoryOfHomePage pageFactoryOfHomePage;
    @BeforeMethod
    public void setPageFactoryOfHomePage(){
        pageFactoryOfHomePage=PageFactory.initElements(driver,PageFactoryOfHomePage.class);
    }
    @Test (enabled = false)
    public void testOnMenuIcon(){
        pageFactoryOfHomePage.validateMenuIcon();
    }
    @Test (enabled = false)
    public void testOnWorldButton(){
        pageFactoryOfHomePage.validateWorldButton2();
    }
    @Test (enabled = false)
    public void testOnStyleSection(){
        pageFactoryOfHomePage.validateStyleSection();
    }
    @Test (enabled = false)
    public void testOnPoliticssection(){
        pageFactoryOfHomePage.validatePolitics();
    }
}
