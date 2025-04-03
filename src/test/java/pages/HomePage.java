package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage{
    private final SelenideElement avatar = $x("//div[@class='toolbar_avatar']");
    private final SelenideElement friendsButton = $x("//a[contains(@href, '/friends')] |" +
            " //span[text()='Друзья']/..");
    private final SelenideElement groupsButton = $x("//a[contains(@href, '/groups')] |" +
            " //span[text()='Группы']/..");

    public boolean isAvatarAvailable(){
        return avatar.isDisplayed();
    }

    public HomePage checkFriends(){
        friendsButton.shouldBe(visible).shouldHave(text("Друзья"));
        return this;
    }

    public GroupsPage openGroups(){
        groupsButton.shouldBe(visible).click();
        return new GroupsPage();
    }
}