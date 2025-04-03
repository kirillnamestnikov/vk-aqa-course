package tests;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Condition.*;
import pages.HomePage;
import pages.LoginPage;

public class TestLogin extends BaseTest{

    @Test
    @DisplayName("Проверка на успешный логин с правильными данными")
    public void checkLoginWithValidCredentials(){
        HomePage homePage = new LoginPage().open()
                .enterEmailAndPassword(getLogin(), getPassword())
                .submit();
        homePage.checkFriends();
    }

    @Test
    @DisplayName("Проверка на неуспешный логин с неправильными данными")
    public void checkLoginWithInvalidCredentials(){
        LoginPage loginPage = new LoginPage();
        loginPage.open().enterEmailAndPassword("FailLogin", getPassword())
                .waitForSubmit()
                .getError().shouldBe(visible)
                .shouldHave(text("Неправильно указан логин и/или пароль"));
    }
}