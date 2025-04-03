package tests;

import org.junit.jupiter.api.*;
import pages.HobbysPage;
import pages.HomePage;

public class TestHobbys extends BaseTest{
    @Test
    @DisplayName("Проверка наличия кнопки События во вкладке с увлечениями")
    public void testHobbysEvents(){
        HobbysPage hobbysPage = homePage
                .openHobbys();
        hobbysPage.checkHobbyEvents();
    }
}