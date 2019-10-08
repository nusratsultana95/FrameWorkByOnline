package homepage;

import base.CommonAPI;
import org.testng.Assert;

public class Search extends CommonAPI {
    public void SearchFieldIsTypeAble(){
        Assert.assertEquals(isElementDisplayed("//div[@class='J-sc-hd-searchbar ui-searchbar ui2-searchbar ui-searchbar-size-middle ui-searchbar-primary ui-searchbar-mod-type ui-searchbar-img-search']//input[@placeholder='What are you looking for...']"),true);
//        clickOnElementByXpath("//div[@class='J-sc-hd-searchbar ui-searchbar ui2-searchbar ui-searchbar-size-middle ui-searchbar-primary ui-searchbar-mod-type ui-searchbar-img-search']//input[@placeholder='What are you looking for...'] ");
        typeOnElementByXpath("//div[@class='J-sc-hd-searchbar ui-searchbar ui2-searchbar ui-searchbar-size-middle ui-searchbar-primary ui-searchbar-mod-type ui-searchbar-img-search']//input[@placeholder='What are you looking for...'] ","laptop");
    }

    public void SigninWorks(){
       Assert.assertEquals(isElementDisplayed(" //div[@class='sc-hd-ms-login']//a[contains(text(),'Sign In')]"),true);
       clickOnElementByXpath(" //div[@class='sc-hd-ms-login']//a[contains(text(),'Sign In')]");
       typeOnElementByXpath("//input[@id='fm-login-id']","sharmin1907@gmail.com");
       typeOnElementByXpath("//input[@id='fm-login-password']","ga1234");
       clickOnElementByXpath(" //input[@id='fm-login-submit']");
   }
    public void ProductFieldDisplayed() {
        Assert.assertEquals(isElementDisplayed("//span[@class='ui-searchbar-type-display']"), true);
        clickOnElementByXpath("//span[@class='ui-searchbar-type-display']");
    }

    public void ClickOnProductButton(){
        clickOnElementByXpath("//span[@class='ui-searchbar-type-display']");
    }

    public void ClickOnProductArray(){
        clickOnElementByXpath("//span[@class='ui-searchbar-hollow-arrow']");
    }

    public void ClickOnProductFromProducts(){
        getTextByXpath("//a[@href='javascript:void(0)' and @data-value='products']");
    }

    public void AlibabaLogoDisplay(){
        Assert.assertEquals(isElementDisplayed("//div[@class='sc-hd-cell sc-hd-hide-s sc-hd-m-logo']//a[@class='J-sc-hd-i-logo sc-hd-i-logo'][contains(text(),'Alibaba.com')]"),true);
       clickOnElementByXpath("//div[@class='sc-hd-cell sc-hd-hide-s sc-hd-m-logo']//a[@class='J-sc-hd-i-logo sc-hd-i-logo'][contains(text(),'Alibaba.com')]");

    }
}
