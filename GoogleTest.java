package selenide;

import org.testng.annotations.Test;
import selenide_test.SelenideTest;

public class GoogleTest {
    @Test
    public static void selenideSearch() {
        SelenideTest selenideTest = new SelenideTest();
        selenideTest.userShouldSearch();
        selenideTest.acceptEverything();
        selenideTest.searchFieldClick();
        selenideTest.checkNumberOfResults();
        selenideTest.getCurrentURL();
        selenideTest.checkSupportOfUkraine();
        selenideTest.searchBlog();
        selenideTest.getCurrentBlogURL();
    }
}
