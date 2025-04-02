package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HobbysPage {
    private final SelenideElement hobbyEventsButton = $x("//a[contains(@href, '/hobby/events')]");

    public HobbysPage checkHobbyEvents(){
        hobbyEventsButton.shouldBe(visible).shouldHave(text("Мероприятия"));
        return this;
    }
}