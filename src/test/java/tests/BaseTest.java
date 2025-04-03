package tests;

import io.github.cdimascio.dotenv.Dotenv;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import com.codeborne.selenide.Configuration;

public abstract class BaseTest{
    protected static final String BASE_URL = "https://ok.ru";
    protected static final Dotenv DOT_ENV = Dotenv.configure().ignoreIfMissing().load();

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

    @AfterEach
    public void clean(){
        Selenide.closeWebDriver();
    }
}