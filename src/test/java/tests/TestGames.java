package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import constants.GameGenresRegistry;
import tags.GamesTag;
import pages.GamesPage;

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

    @Test
    @DisplayName("Проверка отображения названия жанра 'Казуальные' на странице с играми")
    @GamesTag
    public void testCasualGames(){
        String expectedGenre = GameGenresRegistry.getGenre("CASUAL");
        GamesPage gamesPage = homePage.openGames();
        gamesPage.openCasual().checkGenreTitle(expectedGenre);
    }

    @Test
    @DisplayName("Проверка отображения названия жанра 'Три в ряд' на странице с играми")
    @GamesTag
    public void testMatch3Games(){
        String expectedGenre = GameGenresRegistry.getGenre("MATCH3");
        GamesPage gamesPage = homePage.openGames();
        gamesPage.openMatch3().checkGenreTitle(expectedGenre);
    }

    @Test
    @DisplayName("Проверка отображения названия жанра 'Фермы' на странице с играми")
    @GamesTag
    public void testFarmGames(){
        String expectedGenre = GameGenresRegistry.getGenre("FARM");
        GamesPage gamesPage = homePage.openGames();
        gamesPage.openFarm().checkGenreTitle(expectedGenre);
    }
}