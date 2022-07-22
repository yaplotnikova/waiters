package selenide_test;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class SelenideTest {
    public void userShouldSearch() {
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 4;
        Configuration.browserSize = "1920x1080";
        Selenide.open("https://google.com");

    }

    public void acceptEverything() {
        SelenideElement acceptButton = $("#W0wltc > div");
        acceptButton.shouldBe(Condition.visible).click();
    }

    public void searchFieldClick() {
        SelenideElement searchField = $("[name='q']");
        searchField.shouldBe(Condition.visible).setValue("selenide").pressEnter();

    }

    public void checkNumberOfResults() {
        $$x("//h3[contains(text(),'Selenide')]").
                shouldHave(CollectionCondition.sizeGreaterThanOrEqual(7)).
                get(0).click();
    }

    public void getCurrentURL() {
        webdriver().shouldHave(url("https://selenide.org/"));
    }

    public void checkSupportOfUkraine() {
        SelenideElement supportUkraine = $("body > div.main > section > div.short.donate_header > div > h1");
        supportUkraine.shouldHave(Condition.text("Selenide Supports Ukraine \uD83C\uDDFA\uD83C\uDDE6"));

    }

    public void searchBlog() {
        SelenideElement blogLink =
                $("body > div.head > div > header > div > div.main-menu-pages > a:nth-child(4)");
        blogLink.shouldBe(Condition.visible).click();
    }

    public void getCurrentBlogURL() {
        webdriver().shouldHave(url("https://selenide.org/blog.html"));
    }
}
