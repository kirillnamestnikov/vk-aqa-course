package tests;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.Selenide;
import constants.LoginConstants;
import pages.HomePage;
import pages.LoginPage;
import tags.LoginTag;

public class TestLogin extends BaseTest{

    @Test
    @LoginTag
    @DisplayName("Проверка на успешный логин с правильными данными")
    public void checkLoginWithValidCredentials(){
        HomePage homePage = new LoginPage().open()
                .enterEmailAndPassword(getLogin(), getPassword())
                .submit();
        homePage.checkFriends();
    }

    @Nested
    @DisplayName("Проверка на неуспешный логин")
    class InvalidTestLogin{

        @Test
        @LoginTag
        @DisplayName("Проверка на неуспешный логин с неправильными данными")
        public void checkLoginWithInvalidCredentials(){
            LoginPage loginPage = new LoginPage();
            loginPage.open().enterEmailAndPassword(LoginConstants.failLogin, LoginConstants.failPassword)
                    .waitForSubmit().checkErrorMessage();
        }

        @Test
        @LoginTag
        @DisplayName("Проверка на неуспешный логин с неправильным логином")
        public void checkLoginWithInvalidLogin(){
            LoginPage loginPage = new LoginPage();
            loginPage.open().enterEmailAndPassword(LoginConstants.failLogin, getPassword())
                    .waitForSubmit().checkErrorMessage();
        }

        @Test
        @LoginTag
        @DisplayName("Проверка на неуспешный логин с неправильным паролем")
        public void checkLoginWithInvalidPassword(){
            LoginPage loginPage = new LoginPage();
            loginPage.open().enterEmailAndPassword(getLogin(), LoginConstants.failPassword)
                    .waitForSubmit().checkErrorMessage();
        }

        @Test
        @LoginTag
        @DisplayName("Проверка на неуспешный логин с пустыми данными")
        public void checkLoginWithEmptyCredentials(){
            LoginPage loginPage = new LoginPage();
            loginPage.open().enterEmailAndPassword(LoginConstants.emptyLogin, LoginConstants.emptyPassword)
                    .waitForSubmit().checkErrorMessage();
        }

        @Test
        @LoginTag
        @DisplayName("Проверка на неуспешный логин с пустым логином")
        public void checkLoginWithEmptyLogin(){
            LoginPage loginPage = new LoginPage();
            loginPage.open().enterEmailAndPassword(LoginConstants.emptyLogin, getPassword())
                    .waitForSubmit().checkErrorMessage();
        }

        @Test
        @LoginTag
        @DisplayName("Проверка на неуспешный логин с пустым паролем")
        public void checkLoginWithEmptyPassword(){
            LoginPage loginPage = new LoginPage();
            loginPage.open().enterEmailAndPassword(getLogin(), LoginConstants.emptyPassword)
                    .waitForSubmit().checkErrorMessage();
        }

    }
}