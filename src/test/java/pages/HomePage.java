package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomePage{
    private final SelenideElement avatar = $x("//div[@class='toolbar_avatar']");
    private final SelenideElement friendsButton = $x("//a[contains(@href, '/friends')] |" +
            " //span[text()='Друзья']/..");
    private final SelenideElement groupsButton = $x("//a[contains(@href, '/groups')] |" +
            " //span[text()='Группы']/..");
    private final SelenideElement hobbysButton = $x("//a[contains(@href, '/hobby')] |" +
            " //span[text()='Увлечения']/..");

    public boolean isAvatarAvailable(){
        return avatar.isDisplayed();
    }

    public SelenideElement getFriendsButton(){
        return friendsButton;
    }

    public GroupsPage openGroups(){
        groupsButton.shouldBe(visible).click();
        return new GroupsPage();
    }

    public HobbysPage openHobbys(){
        hobbysButton.shouldBe(visible).click();
        return new HobbysPage();
    }
}