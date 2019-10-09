package homepageTests;

import homepage.Search;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SearchTests extends Search {
    @Test(enabled = false) //probmlem on find element when run the test cases ,sometimes run successfully
    public void ValidateTypeAbilityOFSearch(){
        SearchFieldIsTypeAble();
    }
    @Test(enabled = false)
    public void ValidateSearchButtonWorks(){
        SearchFieldIsTypeAble();
        SearchButtonWorks();
    }
    @Test(enabled = false)
    public void SignInByEmailAndPassword(){
        SigninWorks();
    }
    @Test(enabled = false)
    public void ValidateProductButtonWorks(){
        ProductFieldDisplayed();
    }
    @Test(enabled = false)
    public void ValidateProductButtonClick(){
        ProductFieldDisplayed();
        ClickOnProductButton();
    }
    @Test(enabled = false)
    public void ValidateProductArrayClick(){
        ProductFieldDisplayed();
        ClickOnProductArray();
    }
    @Test(enabled = false)
    public void ValidateProductCanBeSelected(){
        ProductFieldDisplayed();
        ClickOnProductArray();
    }
    @Test(enabled = false)
    public void ValidateAlibabaLogoVisible(){
        AlibabaLogoDisplay();
    }
    @Test
    public void ValidateJoinFreeWorks(){
        JoinFreeWorks();
    }
}
