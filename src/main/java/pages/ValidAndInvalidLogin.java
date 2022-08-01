package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class ValidAndInvalidLogin {
    public void invalidLogin() {
        $x("//*[@id=\"flash\"]").shouldBe(Condition.visible);
    }

    public void successfulLogin() {
        $x("//*[@id=\"flash\"]").shouldBe(Condition.visible);
    }

    public void checkURL() {
        webdriver().shouldHave(url("http://the-internet.herokuapp.com/secure"));
    }

}

