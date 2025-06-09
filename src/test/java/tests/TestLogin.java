package tests;

import org.junit.jupiter.api.*;
import constants.LoginConstants;
import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Condition.*;
import pages.HomePage;
import pages.LoginPage;
import tags.LoginTag;

public class TestLogin extends BaseTest{
    @Test
    @LoginTag
    @DisplayName("Проверка на успешный логин с правильными данными")
    public void checkLoginWithValidCredentials(){
        HomePage homePage = new LoginPage()
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
            loginPage.enterEmailAndPassword(LoginConstants.failLogin, LoginConstants.failPassword)
                    .submitWithError().checkErrorMessage();
        }

        @Test
        @LoginTag
        @DisplayName("Проверка на неуспешный логин с неправильным логином")
        public void checkLoginWithInvalidLogin(){
            LoginPage loginPage = new LoginPage();
            loginPage.enterEmailAndPassword(LoginConstants.failLogin, getPassword())
                    .submitWithError().checkErrorMessage();
        }

        @Test
        @LoginTag
        @DisplayName("Проверка на неуспешный логин с неправильным паролем")
        public void checkLoginWithInvalidPassword(){
            LoginPage loginPage = new LoginPage();
            loginPage.enterEmailAndPassword(getLogin(), LoginConstants.failPassword)
                    .submitWithError().checkErrorMessage();
        }

        @Test
        @LoginTag
        @DisplayName("Проверка на неуспешный логин с пустыми данными")
        public void checkLoginWithEmptyCredentials(){
            LoginPage loginPage = new LoginPage();
            loginPage.enterEmailAndPassword(LoginConstants.emptyLogin, LoginConstants.emptyPassword)
                    .submitWithError().checkErrorMessage();
        }

        @Test
        @LoginTag
        @DisplayName("Проверка на неуспешный логин с пустым логином")
        public void checkLoginWithEmptyLogin(){
            LoginPage loginPage = new LoginPage();
            loginPage.enterEmailAndPassword(LoginConstants.emptyLogin, getPassword())
                    .submitWithError().checkErrorMessage();
        }

        @Test
        @LoginTag
        @DisplayName("Проверка на неуспешный логин с пустым паролем")
        public void checkLoginWithEmptyPassword(){
            LoginPage loginPage = new LoginPage();
            loginPage.enterEmailAndPassword(getLogin(), LoginConstants.emptyPassword)
                    .submitWithError().checkErrorMessage();
        }
    }
}