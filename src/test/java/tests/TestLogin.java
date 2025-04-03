package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Condition.*;
import pages.HomePage;
import pages.LoginPage;

public class TestLogin extends BaseTest{

    @Test
    public void checkLoginWithValidCredentials(){
        HomePage homePage = new LoginPage().open()
                .enterEmailAndPassword(getLogin(), getPassword())
                .submit();
        homePage.checkFriends();
    }
}