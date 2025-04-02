package tests;

import org.junit.jupiter.api.Test;
import pages.HobbysPage;
import pages.LoginPage;

public class TestHobbys extends BaseTest{
    @Test
    public void testHobbysEvents(){
        HobbysPage hobbysPage = new LoginPage().open()
                .enterEmailAndPassword(getLogin(), getPassword())
                .submit()
                .openHobbys();
        hobbysPage.checkHobbyEvents();
    }
}