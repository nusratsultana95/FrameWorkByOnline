package POM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomepagePOM extends CommonAPI { ////div[@class='channel-title']
    //Ready to ship
    @FindBy(linkText = "Ready to Ship")
    public static WebElement ReadyToShip;
    @FindBy(xpath = "//div[@class='channel-title']")
    public static WebElement ReadyToShipValue;
    //Trade shows
    @FindBy(linkText = "Trade Shows")
    public static WebElement TradeShows;
    @FindBy(xpath = "//body[@class='lang-en-us']//div[@class='ocms-fusion-alibaba-pc-common-layout-1-0-3']//div[@name='main']/div[1]//div[@class='trade-shows-navigation-inner']/a[1]")
    public static WebElement TradeShowsValue;

    //Methods for ReadyToShip
    public void ValidateReadyToShipDisplayed(){
        Assert.assertEquals(ReadyToShip.isDisplayed(),true);
    }
    public void ValidateReadyToShipClickable(){
        ReadyToShip.click();
        Assert.assertEquals(ReadyToShipValue.isDisplayed(),true);
    }
    //Methods for TradeShows
    public void validateTradeShowsDisplayed(){
        Assert.assertEquals(TradeShows.isDisplayed(),true);
    }
    public void validateTradeShowsClickable(){
        TradeShows.click();
        Assert.assertEquals(TradeShowsValue.isDisplayed(),true);
    }
}
