package pages;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;

public class GamesPage {
    private final ElementsCollection gamesList = $$x("//div[contains(@class, 'games-card')]");
    private final SelenideElement casualGamesButton = $x("//a[contains(@href, '/vitrine/casual')]");
    private final SelenideElement match3GamesButton = $x("//a[contains(@href, '/vitrine/match3')]");
    private final SelenideElement farmGamesButton = $x("//a[contains(@href, '/vitrine/farm')]");
    private final SelenideElement gameGenreTitle = $x("//h3[@class='portlet_h_title']");

    public GamesPage checkGamesCard(){
        gamesList.first().shouldBe(visible
                .because("На карточке с игрой должна отображаться соответствующая информация"));
        return this;
    }

    public int getGamesListSize(){
        gamesList.shouldBe(CollectionCondition.sizeGreaterThan(0));
        return gamesList.filterBy(visible
                .because("На списке с играми должны отображаться игры"))
                .size();
    }

    public GamesPage openCasual(){
        casualGamesButton.shouldBe(visible
                .because("На странице с играми должна быть кнопка Казуальные"))
                .click();
        return this;
    }

    public GamesPage openMatch3(){
        match3GamesButton.shouldBe(visible
                .because("На странице с играми должна быть кнопка Три в ряд"))
                .click();
        return this;
    }

    public GamesPage openFarm(){
        farmGamesButton.shouldBe(visible
                .because("На странице с играми должна быть кнопка Фермы"))
                .click();
        return this;
    }

    public GamesPage checkGenreTitle(String title){
        gameGenreTitle.shouldBe(visible
                .because("На странице с играми должен отображаться текст с названием жанра игры"))
                .shouldHave(text(title));
        return this;
    }
}