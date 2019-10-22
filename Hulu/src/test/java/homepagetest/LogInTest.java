package homepagetest;

import homepage.HomePage;
import loginresult.LogInResultPage;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LogInTest extends HomePage {

    //class level variable
    LogInResultPage logInResultPage = new LogInResultPage();

    @Test @Ignore
    public void validateLogInButtonWorks(){
        //LogInResultPage logInResultPage1 = new LogInResultPage(); //method level variable
        clickOnLogInButton();
        typeOnEmailField("reaz_majumder@yahoo.com");//we can now provide a data rather than predefined data
        typeOnPasswordField("dhaka1203");
        clickOnLogIn();
        logInResultPage.validateLogInPageDisplayed();
        //to log test
       // TestLogger.log("search result panel is displayed : "+ getElement().isDisplayed());
    }

   /*@Test
    public void validateSearch(){
        //logInResultPage.whatever //class level variable
    }

    public void testAllFooterElement(){
        getAllElementFromBottom();
    }

    public void testAllFooterElement1(){
        List<WebElement> elementList = getAllElementFromBottom();
        System.out.println(elementList.size());
        for(int i=0;i<elementList.size();i++){
            System.out.println(elementList.get(i).getText());
        }
    }
*/

}
