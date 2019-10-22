package homepagetest;

import homepage.HomePage;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {



    @Test @Ignore
    public void testLogInButton(){
        validateLogIn();
        sleepFor(5);
    }

    @Test @Ignore
    public void testLogInFailure() {
        validateLogInFailure();
        sleepFor(5);
    }

    @Test @Ignore
    public void testLearnMoreChannels(){
        validateLearnMoreLinkChannels();
        sleepFor(5);
    }

    @Test @Ignore
    public void testLearnMoreChannelsAddOns(){
        validateLearnMoreLinkAddOns();
        sleepFor(5);
    }


    @Test @Ignore
    public void testUpperStartYourTrial(){
        validateUpperCornerStartFreeTrialButton();
        sleepFor(5);
    }

    @Test @Ignore
    public void testMiddleStartFreeTrial(){
        validateMiddleStartFreeTrialButton();
        sleepFor(5);
    }

    @Test @Ignore
    public void testSelectPlans(){
     validateSelectPlans();
     sleepFor(10);
    }

    @Test @Ignore
    public void testLiveTV(){
        validateLiveTV();
        sleepFor(5);
    }

    @Test @Ignore
    public void testStreamingLibrary(){
        validateStreamingLibrary();
        sleepFor(5);
    }

    @Test @Ignore
    public void testStreamingLibraryDropDown(){
        validateStreamingLibraryDropDown();
        sleepFor(5);
    }

    /*public void testFooterMenu() {
        List<WebElement> elementList = getAllElementFromBottom1();
        System.out.println("elementList.size");

        //homwork print all the value of footer(not xpath)
    }*/

}



