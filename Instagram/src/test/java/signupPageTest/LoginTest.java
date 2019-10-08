package signupPageTest;

import org.testng.annotations.Test;
import signupPage.Login;

public class LoginTest extends Login {

    @Test(enabled = false)
    public void validateUserNameFieldWorks(){
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("demouser95");
        sleepFor(2);
    }
    @Test(enabled=false)
    public void ValidatePasswordFieldWorks(){
        clickOnPasswordField();
        typeOnPasswordField("abcd1234");
        sleepFor(2);
    }
    @Test(enabled = false)
    public void validateLoginButtonWorks(){
        clickOnLoginButton();
        sleepFor(5);
    }
    @Test
    public void login(){
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("demouser95");
        sleepFor(2);
        clickOnPasswordField();
        typeOnPasswordField("abcd1234");
        sleepFor(2);
        clickOnLoginButton();
        sleepFor(5);
    }
}
