package tests;

import org.junit.jupiter.api.*;
import pages.GroupsPage;
import pages.LoginPage;
import tags.GroupsTag;

public class TestGroups extends BaseTest{
    @BeforeEach
    public void setupTest(TestInfo info){
        homePage = new LoginPage().open()
                .enterEmailAndPassword(getLogin(), getPassword())
                .submit();
    }

    @Test
    @DisplayName("Проверка открытия вкладки с группами")
    @GroupsTag
    public void testGroup(){
        GroupsPage groupsPage = homePage.openGroups();
        groupsPage.checkOfficialGroups();
    }
}