package tests;

import pages.HomePage;
import pages.LoginPage;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class TestAvatar extends BaseTest{
    @Test
    @DisplayName("Проверка на отсутствие аватара у профиля")
    public void testIfAvatarNotVisible(){
        assertFalse(homePage.isAvatarAvailable(), "Avatar should be not visible");
    }
}