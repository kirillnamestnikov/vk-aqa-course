package tests;

import org.junit.jupiter.api.Test;
import pages.GroupsPage;
import pages.LoginPage;
import static com.codeborne.selenide.Condition.*;

public class TestGroups extends BaseTest{
    @Test
    public void testGroup(){
        GroupsPage groupsPage = new LoginPage().open()
                .enterEmailAndPassword(getLogin(), getPassword())
                .submit().openGroups();
        groupsPage.getCreateButton().shouldBe(visible);
    }
}