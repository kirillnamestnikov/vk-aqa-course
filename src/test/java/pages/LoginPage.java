package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage{
    private final SelenideElement emailField = $x("//input[@name='st.email']");
    private final SelenideElement passwordField = $x("//input[@name='st.password']");
    private final SelenideElement submitButton = $x("//input[@value='Войти в Одноклассники']");

    public LoginPage open(){
        Selenide.open("/");
        return this;
    }

    public LoginPage enterEmailAndPassword(String email, String password){
        emailField.setValue(email);
        passwordField.setValue(password);
        return this;
    }

    public HomePage submit(){
        submitButton.click();
        return new HomePage();
    }
}