package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GroupsPage {
    private final SelenideElement createButton = $x("//a[contains(@href, '/official')] |" +
            " //span[text()='Официальные']/..");

    public SelenideElement getCreateButton(){
        return createButton;
    }

    public GroupsPage close(){
        Selenide.closeWebDriver();
        return this;
    }
}