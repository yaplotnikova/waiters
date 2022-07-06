import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Waiters {
    private static WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("selenium.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public static void firstTest() {
        FirstWaiter firstWaiter = new FirstWaiter(driver);
        FirstWaiter.navigate();
        FirstWaiter.waiteThatElementHidden();
    }
    @Test
    public static void secondTest(){
        SecondWaiter secondWaiter = new SecondWaiter(driver);
        SecondWaiter.navigate();
        SecondWaiter.waiteThatElementAppear();
    }
    @Test
    public static void thirdTest(){
        ThirdWaiter thirdWaiter=new ThirdWaiter(driver);
        ThirdWaiter.navigate();
        ThirdWaiter.getText();

    }
}

