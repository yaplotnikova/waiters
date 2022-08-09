package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class InternetLoginPageEnterLogin {
    public void enterLoginField(String login) {

        $x("//*[@id=\"username\"]").shouldBe(Condition.visible).sendKeys(login);
    }

}