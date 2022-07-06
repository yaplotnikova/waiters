import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstWaiter {
    static WebDriver driver;
    @FindBy(id = "btn")
    private static WebElement disappearButton;
    static String pageURL;


    public FirstWaiter(WebDriver driver) {
        this.driver = driver;
        pageURL = "http://www.leafground.com/pages/disapper.html";
        PageFactory.initElements(driver, this);
    }

    public static void navigate() {
        driver.get(pageURL);
    }

    public static boolean waiteThatElementHidden() {
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions
                        .invisibilityOf(disappearButton));
    }

}