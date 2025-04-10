package tests;

import org.junit.jupiter.api.*;
import pages.HobbysPage;
import pages.HomePage;
import tags.HobbysTag;

public class TestHobbys extends BaseTest{
    private HobbysPage hobbysPage;

    @BeforeEach
    public void setupHobbyTest(){
        hobbysPage = homePage.openHobbys();
    }

    @Test
    @HobbysTag
    @DisplayName("Проверка наличия кнопки Мероприятия во вкладке с увлечениями")
    public void testHobbysEvents(){
        hobbysPage.checkHobbyEvents();
    }

    @Test
    @HobbysTag
    @DisplayName("Проверка наличия кнопки Мастер-классы во вкладке с увлечениями")
    public void testHobbysTutorials(){
        hobbysPage.checkHobbyTutorials();
    }

    @Test
    @HobbysTag
    @DisplayName("Проверка наличия кнопки Вопросы и ответы во вкладке с увлечениями")
    public void testHobbysQuestions(){
        hobbysPage.checkHobbyQuestions();
    }
}