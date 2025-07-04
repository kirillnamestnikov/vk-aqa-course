package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.support.ui.LoadableComponent;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends LoadableComponent< LoginPage > {
    private final SelenideElement emailField = $x("//input[@name='st.email']");
    private final SelenideElement passwordField = $x("//input[@name='st.password']");
    private final SelenideElement submitButton = $x("//input[@value='Войти в Одноклассники']");
    private final SelenideElement errorMessage = $x("//*[contains(@class, 'login_error')]");

    public LoginPage(){
        Selenide.open("/");
    }

    @Override
    protected void load(){
        Selenide.open("/");
    }

    @Override
    protected void isLoaded() throws Error{
        emailField.shouldBe(visible.because("На странице логина должно быть поле с вводом логина"));
        passwordField.shouldBe(visible.because("На странице логина должно быть поле с вводом пароля"));
    }

    public LoginPage enterEmailAndPassword(String email, String password){
        emailField.shouldBe(visible.because("На странице логина должно быть поле с вводом логина"))
                .setValue(email);
        passwordField.shouldBe(visible.because("На странице логина должно быть поле с вводом пароля"))
                .setValue(password);
        return this;
    }

    public HomePage submit(){
        submitButton.shouldBe(visible.because("На странице логина должно быть кнопка для отправки формы"))
                .click();
        return new HomePage();
    }
    public LoginPage submitWithError(){
        submitButton.click();
        return this;
    }

    public LoginPage checkErrorMessage(){
        errorMessage.shouldBe(visible
                        .because("На странице логина при неправильном логине или пароле должно выводится сообщение об ошибке"))
                .shouldHave(matchText("Неправильно указан логин и/или пароль|Введите пароль|Введите логин"));
        return this;
    }
}