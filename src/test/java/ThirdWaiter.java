import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class ThirdWaiter {
    static WebDriver driver;
    @FindBy(id = "btn")
    private static WebElement waitText;
    static String pageURL;

    public ThirdWaiter(WebDriver driver) {
        this.driver = driver;
        pageURL = "http://www.leafground.com/pages/TextChange.html";
        PageFactory.initElements(driver, this);
    }

    public static void navigate() {
        driver.get(pageURL);
    }

    public static boolean getText() {
       return new WebDriverWait(driver, Duration.ofSeconds(5))
               .until(ExpectedConditions.invisibilityOfElementWithText(By.id("btn"), "Click ME!"));

    }
}
