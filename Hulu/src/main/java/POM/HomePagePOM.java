package POM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.nio.file.WatchEvent;

public class HomePagePOM extends CommonAPI {

    @FindBy(xpath = "//h1[@class='jsx-1570766869 hub-nav__title']")
            public static WebElement TvShowValue;

    @FindBy(xpath = "//*[@class='Logo fill']")
    public static WebElement TvShowValueLogo;

    @FindBy(xpath = "//div[@class='jsx-1042950883 navigation__left-items']")
    public static WebElement TvShowValueLeftNavigationBar;

    @FindBy(xpath = "//div[@class='jsx-3172232847 PortraitCollection cu-non-sub-portrait-collection']")
    public static WebElement TvShowValuePortraitCollection;

    /*@FindBy(linkText = "TV Shows")
    public static WebElement TvShowByFindBy*/

    @FindBy(how = How.XPATH,using="//h1[@class='jsx-1570766869 hub-nav__title']")
            public static WebElement TvShowValue2;

    //change the webElement element name to TvShows, TvShowsDisplayed
    // so that it does not duplicate others
    WebElement TvShow = getElementByLinkText("TV Shows");
    //WebElement TvShowValue = getElement("//h1[@class='jsx-1570766869 hub-nav__title']");

    public void validateTvShows(){
        System.out.println(TvShow.isDisplayed());
        Assert.assertEquals(TvShow.isDisplayed(),true);
        Assert.assertEquals(TvShow.isEnabled(),true);
        TvShow.click();
    }
/*
    public void validateTvShowsClickAble(){
        TvShow.click();
        Assert.assertEquals(TvShowValue.isDisplayed(),true);
    } */

}