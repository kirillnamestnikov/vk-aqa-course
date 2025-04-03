package pages;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GroupsPage {
    private final SelenideElement officialButton = $x("//a[contains(@href, '/official')] |" +
            " //span[text()='Официальные']/..");

    public GroupsPage checkOfficialGroups(){
        officialButton.shouldBe(visible.because("На странице с группами должна быть раздел Официальные"))
                .shouldHave(text("Официальные"));
        return this;
    }
}