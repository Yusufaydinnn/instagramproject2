package TestPage;
import Constractions.Anasayfa;
import org.junit.jupiter.api.Test;
import BasePage.BaseTest;
import org.openqa.selenium.WebDriver;


public class TestCase extends BaseTest {

    Anasayfa anasayfa;
    WebDriver driver;

    @Test

    public void test02() {
        anasayfa = new Anasayfa(driver);

        anasayfa.login().sendKeys(name);
        anasayfa.password().sendKeys(password);
        anasayfa.loginButton().click();
        anasayfa.save().click();
        anasayfa.navigatetoprofile("/rafaelalexandresilva");
        anasayfa.ilkFotoyaTikla();
    }
    }


