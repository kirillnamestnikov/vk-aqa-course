package tests;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import tags.LoginTag;


public class TestAvatar extends BaseTest{
    @Test
    @LoginTag
    @DisplayName("Проверка на отсутствие аватара у профиля")
    public void testIfAvatarNotVisible(){
        assertFalse(homePage.isAvatarAvailable(), "Avatar should be not visible");
    }
}