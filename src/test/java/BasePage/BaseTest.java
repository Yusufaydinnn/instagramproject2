package BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class BaseTest {

    WebDriver driver;
   public String baseURL = ("https://www.instagram.com");
   public String name = ("name");
   public String password = ("password");
   public By postlocater = By.cssSelector("[href='/p/DAD-WSANOwG/'] ._aagw");

    @BeforeEach
    public void test01() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get(baseURL);

    }
    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
