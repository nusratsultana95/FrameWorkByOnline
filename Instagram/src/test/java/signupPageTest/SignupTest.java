package signupPageTest;

import org.testng.annotations.Test;
import resultPage.ResultPage;
import signupPage.Signup;

public class SignupTest extends Signup {
    ResultPage resultPage= new ResultPage();

   @Test(enabled=false)
   public void validateMobileNumberOrEmailFieldWorks(){
       clickOnMobileNumberOrEmailField();
       typeOnMobileNumberOrEmailField("3135235647");
       sleepFor(2);
   }
   @Test(enabled=false)
    public void validateFullNameFieldWorks(){
       clickOnFullNameField();
       typeOnFullNameField("demo.user");
       sleepFor(2);
   }
   @Test(enabled=false)
    public void validateUserNameFieldWorks(){
       clickOnUsernameField();
       typeOnUsernameField("demouser95");
       sleepFor(2);
   }
   @Test(enabled=false)
    public void validatePasswordFieldWorks(){
       clickOnPasswordField();
       typeOnPassworField("abcd1234");
       sleepFor(2);
       clickOnPasswordShowButton();
       sleepFor(2);
       clickOnPsswordHideButton();
       sleepFor(2);
   }
   @Test(enabled = false)
    public void validateSignupButtonWorks(){
       clickonSignUpButton();
       sleepFor(10);
   }
   @Test
   public void signup(){
       clickOnMobileNumberOrEmailField();
       typeOnMobileNumberOrEmailField("3135235647");
       sleepFor(2);
       clickOnFullNameField();
       typeOnFullNameField("demo.user");
       sleepFor(2);
       clickOnUsernameField();
       typeOnUsernameField("demouser95");
       sleepFor(2);
       clickOnPasswordField();
       typeOnPassworField("abcd1234");
       sleepFor(2);
       clickOnPasswordShowButton();
       sleepFor(2);
       clickOnPsswordHideButton();
       sleepFor(2);
       clickonSignUpButton();
       sleepFor(10);
       resultPage.signupPageDisplayed();
       sleepFor(30);

   }
}
