package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class InternetLoginPageEnterPassword {
    public void enterPasswordField(String password) {

        $x("//*[@id=\"password\"]").shouldBe(Condition.visible).sendKeys(password);
    }

    public void clickLoginButton() {
        $x("//*[@id=\"login\"]/button").shouldBe(Condition.visible).click();
    }
}
