package tests;

import org.junit.jupiter.api.*;
import pages.GroupsPage;
import pages.LoginPage;

public class TestGroups extends BaseTest{
    @Test
    @DisplayName("Проверка открытия вкладки с группами")
    public void testGroup(){
        GroupsPage groupsPage = homePage.openGroups();
        groupsPage.checkOfficialGroups();
    }
}