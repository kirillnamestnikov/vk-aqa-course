package pages;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.CollectionCondition;
import static com.codeborne.selenide.Condition.*;

public class GamesPage {
    private final ElementsCollection gamesList = $$x("//div[contains(@class, 'games-card')]");

    public GamesPage checkGamesCard(){
        gamesList.shouldBe(CollectionCondition.sizeGreaterThan(0)
                .because("Количество игр должно быть больше 0"))
                .first().shouldBe(visible
                .because("Карточка с игрой должна быть видимой"));
        return this;
    }

    public int getGamesListSize(){
        return gamesList.shouldBe(CollectionCondition.sizeGreaterThan(0)
                        .because("Количество игр должно быть больше 0"))
                .filterBy(visible
                .because("На странице с играми должны отображаться игры"))
                .size();
    }

}