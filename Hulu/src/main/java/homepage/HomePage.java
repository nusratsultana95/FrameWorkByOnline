package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends CommonAPI {

    public void clickOnLogInButton(){
        clickOnElementByXpath("//button[@class='navigation__login-button navigation__action-button navigation__cta']");
    }

    //Here with the value parameter we can define our text rather than predefined text written before.
    public void typeOnEmailField(String value){
        typeOnElementByXpath("//input[@placeholder='Enter email']",value);
    }

    public void typeOnPasswordField(String value){
        typeOnElementByXpath("//input[@placeholder='Enter password']",value);
    }

    public void clickOnLogIn(){
        clickOnElementByXpath("//button[@class='jsx-268849281 login-button']");
    }

    public void validateLogIn() {
        clickOnElementByXpath("//button[@class='navigation__login-button navigation__action-button navigation__cta']");
        typeOnElementByXpath("//input[@name='email']", "reaz_majumder@yahoo.com");
        typeOnElementByXpath("//input[@name='password']", "nefertiti101");
        clickOnElementByXpath("//button[@class='jsx-268849281 login-button']");
    }

    public void validateLogInFailure() {
        clickOnElementByXpath("//button[@class='navigation__login-button navigation__action-button navigation__cta']");
        typeOnElementByXpath("//input[@name='email']", "reaz_123@yahoo.com");
        typeOnElementByXpath("//input[@name='password']", "abcdxyz");
        clickOnElementByXpath("//button[@class='jsx-268849281 login-button']");
        clickOnElementByXpath("//a[@href='https://auth.hulu.com/find_account']");
        driver.navigate().to("https://auth.hulu.com/find_account");
        typeOnElementByXpath("//input[@id='hulu-iforget-input']","abc@yahoo.com");
        clickOnElementByXpath("//button[@class='jsx-1473767481 button reset-link-btn']");
    }

    public void validateLearnMoreLinkChannels() {
        clickOnElementByXpath("//a[@data-action-specifier='learn_more_click']");
        driver.navigate().to("https://www.hulu.com/live-tv");
        clickOnElementByXpath("//a[contains(text(),'Channels')]");
    }

    public void validateLearnMoreLinkAddOns() {
        clickOnElementByXpath("//a[@data-action-specifier='learn_more_click']");
        driver.navigate().to("https://www.hulu.com/live-tv");
        clickOnElementByXpath("//a[contains(text(),'Add-ons')]");
    }

    public void validateUpperCornerStartFreeTrialButton() {
        clickOnElementByXpath("//div[@class='jsx-1042950883 navigation__right-items']//button[@class='button--cta button--black navigation__cta'][contains(text(),'START YOUR FREE TRIAL')]");
    }

    public void validateMiddleStartFreeTrialButton() {
        clickOnElementByXpath("//button[@class='button--cta button--white Masthead__input-cta']");
        //driver.navigate().to("https://signup.hulu.com/plans");
        //clickOnElementByXpath("//div[@class='three-plan-desktop']//div[@id='plan-1']//div[@class='plan__cta']");

    }

        public void validateSelectPlans() {
            clickOnElementByXpath("//div[@class='jsx-3975211773 content-wrapper']//div[1]//div[2]//div[1]//div[2]");
            //driver.navigate().to("https://signup.hulu.com/plans");
            //clickOnElementByXpath("//div[@class='plan-group__body']//div[@id='plan-1']//button[contains(@class,'button')][contains(text(),'SELECT')]");
        }

        public void validateLiveTV(){
            WebElement elementOfLiveTv = getElement("//a[contains(text(),'Live TV')]");
            Assert.assertEquals(elementOfLiveTv.isDisplayed(),true);
            elementOfLiveTv.click();
        }

    public void validateStreamingLibrary(){
        WebElement elementOfStreamingLibrary = getElement("//a[contains(text(),'Streaming Library')]");
        Assert.assertEquals(elementOfStreamingLibrary.isDisplayed(),true);
        elementOfStreamingLibrary.click();
        driver.navigate().to("https://www.hulu.com/start/content");
        clickOnElementByXpath("//a[@id='plus_is_current']");
    }

    public void validateStreamingLibraryDropDown(){
        WebElement elementOfStreamingLibrary = getElement("//a[contains(text(),'Streaming Library')]");
        Assert.assertEquals(elementOfStreamingLibrary.isDisplayed(),true);
        elementOfStreamingLibrary.click();
        driver.navigate().to("https://www.hulu.com/start/content");
        WebElement elementOfTvMovies=getElement("//div[contains(text(),'TV & Movies')]");
        Assert.assertEquals(elementOfTvMovies.isDisplayed(),true);
        //clickOnElementByXpath("//div[contains(text(),'TV & Movies')]");
    }

    //printing how many items are there in the footer list
    public List<WebElement> getAllElementFromBottom(){
        List<WebElement> elementList = driver.findElements(By.xpath("//a[contains(text(),'Streaming Library')]"));
        System.out.println(elementList.size());
        return elementList;
    }

    //printing all the items are there in the footer list
    /*public List<WebElement> getAllElementFromBottom1(){
        //simplyfi
        //List<WebElement> elementList = driver.findElements(By.xpath("//a[contains(text(),'Streaming Library')]"));
        //return elementList;

        return driver.findElements(By.xpath("//a[contains(text(),'Streaming Library"));
    }*/








}





