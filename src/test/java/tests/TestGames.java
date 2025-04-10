package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import tags.GamesTag;
import pages.GamesPage;
import pages.HomePage;

public class TestGames extends BaseTest{
    @ParameterizedTest(name = "Проверка положительного количества карточек с играми")
    @ValueSource(ints = {0, 5 ,10})
    @GamesTag
    public void testPositiveGamesCount(int count){
        GamesPage gamesPage = homePage.openGames();
        int actualCount = gamesPage.getGamesListSize();
        assertAll(
                () -> gamesPage.checkGamesCard(),
                () -> assertTrue(actualCount > count,
                        String.format("Число игр должно быть больше %d",
                                count))
        );
    }
}