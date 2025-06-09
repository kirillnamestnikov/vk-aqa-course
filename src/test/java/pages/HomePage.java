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
    private final SelenideElement hobbysButton = $x("//a[@href='/hobby'] |" +
            " //span[text()='Увлечения']/..");
    private final SelenideElement gamesButton = $x("//a[contains(@href, '/vitrine')] |" +
            " //span[text()='Игры']/..");

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

    public GamesPage openGames(){
        gamesButton.shouldBe(visible.because("На главной странице должна быть кнопка Игры"))
                .click();
        return new GamesPage();
    }
}