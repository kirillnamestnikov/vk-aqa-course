package tests;

import org.junit.jupiter.api.*;
import pages.GroupsPage;
import tags.GroupsTag;

public class TestGroups extends BaseTest{
    @Test
    @DisplayName("Проверка открытия вкладки с группами")
<<<<<<< HEAD
=======
    @GroupsTag
>>>>>>> homework-5
    public void testGroup(){
        GroupsPage groupsPage = homePage.openGroups();
        groupsPage.checkOfficialGroups();
    }
}