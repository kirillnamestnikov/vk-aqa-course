package tests;

import pages.LoginPage;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import tags.LoginTag;


public class TestAvatar extends BaseTest{
    @BeforeEach
    public void setupTest(TestInfo info){
        homePage = new LoginPage().open()
                .enterEmailAndPassword(getLogin(), getPassword())
                .submit();
    }

    @Test
    @LoginTag
    @DisplayName("Проверка на отсутствие аватара у профиля")
    public void testIfAvatarNotVisible(){
        assertFalse(homePage.isAvatarAvailable(), "Avatar should be not visible");
    }
}