package tests;

import org.junit.jupiter.api.Order;
import pages.HomePage;
import pages.LoginPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestAvatar extends BaseTest{
    @Test
    public void testIfAvatarNotVisible(){
        HomePage homePage = new LoginPage().open()
                .enterEmailAndPassword(getLogin(), getPassword())
                .submit();
        assertFalse(homePage.isAvatarAvailable(), "Avatar should be not visible");
    }
}