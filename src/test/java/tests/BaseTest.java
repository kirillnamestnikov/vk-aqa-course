package tests;

import pages.HomePage;
import pages.LoginPage;
import io.github.cdimascio.dotenv.Dotenv;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import com.codeborne.selenide.Configuration;

public abstract class BaseTest{
    protected static final String BASE_URL = "https://ok.ru";
    protected static final Dotenv DOT_ENV = Dotenv.configure().ignoreIfMissing().load();
    protected HomePage homePage;
    protected static String getPassword(){
        return DOT_ENV.get("OK_PASSWORD", System.getenv("OK_PASSWORD"));
    }
    protected static String getLogin(){
        return DOT_ENV.get("OK_LOGIN", System.getenv("OK_LOGIN"));
    }

    @BeforeAll
    public static void setup(){
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = "chrome";
    }

    @BeforeEach
    public void setupTest(TestInfo info){
<<<<<<< HEAD
        if (!info.getDisplayName().equals("Проверка на успешный логин с правильными данными")){
            homePage = new LoginPage().open()
=======
        if ((!info.getDisplayName().equals("Проверка на успешный логин с правильными данными"))
        && (!info.getDisplayName().equals("Проверка на неуспешный логин с неправильными данными"))
        && (!info.getDisplayName().equals("Проверка на неуспешный логин с неправильным логином"))
        && (!info.getDisplayName().equals("Проверка на неуспешный логин с неправильным паролем"))
        && (!info.getDisplayName().equals("Проверка на неуспешный логин с пустыми данными"))
        && (!info.getDisplayName().equals("Проверка на неуспешный логин с пустым логином"))
        && (!info.getDisplayName().equals("Проверка на неуспешный логин с пустым паролем"))){
            homePage = new LoginPage()
>>>>>>> homework-5
                    .enterEmailAndPassword(getLogin(), getPassword())
                    .submit();
        }
    }

    @AfterEach
    public void clean(){
        Selenide.closeWebDriver();
    }
}