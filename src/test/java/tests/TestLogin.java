package tests;

import static java.time.Duration.*;
import org.junit.jupiter.api.Order;
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
        homePage.getFriendsButton().shouldBe(visible);
    }

    @Test
    public void checkLoginWithInvalidCredentials(){
        LoginPage loginPage = new LoginPage();
        loginPage.open().enterEmailAndPassword("FailLogin", getPassword())
                .waitForSubmit()
                .getError().shouldBe(visible)
                .shouldHave(text("Неправильно указан логин и/или пароль"));
    }
}