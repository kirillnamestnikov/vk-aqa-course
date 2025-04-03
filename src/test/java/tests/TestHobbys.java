package tests;

import org.junit.jupiter.api.*;
import pages.HobbysPage;
import pages.HomePage;

public class TestHobbys extends BaseTest{
    private HobbysPage hobbysPage;

    @BeforeEach
    public void setupHobbyTest(){
        hobbysPage = homePage.openHobbys();
    }

    @Test
    @DisplayName("Проверка наличия кнопки Мероприятия во вкладке с увлечениями")
    public void testHobbysEvents(){
        hobbysPage.checkHobbyEvents();
    }

    @Test
    @DisplayName("Проверка наличия кнопки Мастер-классы во вкладке с увлечениями")
    public void testHobbysTutorials(){
        hobbysPage.checkHobbyTutorials();
    }

    @Test
    @DisplayName("Проверка наличия кнопки Вопросы и ответы во вкладке с увлечениями")
    public void testHobbysQuestions(){
        hobbysPage.checkHobbyQuestions();
    }
}