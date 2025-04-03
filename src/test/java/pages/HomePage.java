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
    private final SelenideElement hobbysButton = $x("//a[contains(@href, '/hobby')] |" +
            " //span[text()='Увлечения']/..");

    public boolean isAvatarAvailable(){
        return avatar.isDisplayed();
    }

    public HomePage checkFriends(){
        friendsButton.shouldBe(visible.because("На главной странице должна быть кнопка Друзья"))
                .shouldHave(text("Друзья"));
        return this;
    }

    public GroupsPage openGroups(){
        groupsButton.shouldBe(visible.because("На главной странице должна быть кнопка Группы"))
                .click();
        return new GroupsPage();
    }

    public HobbysPage openHobbys(){
        hobbysButton.shouldBe(visible.because("На главной странице должна быть кнопка Увлечения"))
                .click();
        return new HobbysPage();
    }
}