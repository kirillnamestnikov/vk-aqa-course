package tests;

<<<<<<< HEAD
import pages.HomePage;
import pages.LoginPage;
=======
>>>>>>> homework-5
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import tags.LoginTag;


public class TestAvatar extends BaseTest{
    @Test
<<<<<<< HEAD
=======
    @LoginTag
>>>>>>> homework-5
    @DisplayName("Проверка на отсутствие аватара у профиля")
    public void testIfAvatarNotVisible(){
        assertFalse(homePage.isAvatarAvailable(), "Avatar should be not visible");
    }
}