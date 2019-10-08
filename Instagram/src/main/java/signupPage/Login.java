package signupPage;

import base.CommonAPI;
import report.TestLogger;

public class Login extends CommonAPI {

public void clickOnPhoneNumberUsernameOrEmailField(){
        clickOnElementByXpath("//input[contains(@name,'username')]");
        TestLogger.log("Username field is clicked");
    }
public void typeOnPhoneNumberUsernameOrEmailField(String value){
        typeOnElementByXpath("//input[contains(@name,'username')]", value);
        TestLogger.log("Username/phone number/email is typed");
     }
public  void clickOnPasswordField(){
        clickOnElementByXpath("//input[contains(@name,'password')]");
        TestLogger.log("Password field clicked");
}
public void typeOnPasswordField(String value){
        typeOnElementByXpath("//input[contains(@name,'password')]", value);
        TestLogger.log("Password typed on password field");
}
public void clickOnLoginButton(){
        clickOnElementByXpath("//body//div[4]");
        TestLogger.log("Clicked on login button");
    }

}
