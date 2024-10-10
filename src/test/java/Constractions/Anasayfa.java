package Constractions;
import BasePage.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Anasayfa extends BaseTest {
    public WebDriver driver;

    public Anasayfa(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement login() {
        return driver.findElement(By.xpath("//input[@name='username']"));
    }

    public WebElement loginButton() {
        return driver.findElement(By.xpath("//form[@id='loginForm']/div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh xqui205 x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']/div[.='Giriş yap']"));
    }

    public WebElement save() {
        return driver.findElement(By.xpath("//div[@class='x1i10hfl xjqpnuy xa49m3k xqeqjp1 x2hbi6w xdl72j9 x2lah0s xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x2lwn1j xeuugli x1hl2dhg xggy1nq x1ja2u2z x1t137rt x1q0g3np x1lku1pv x1a2a7pz x6s0dn4 xjyslct x1ejq31n xd10rxx x1sy0etr x17r0tee x9f619 x1ypdohk x1f6kntn xwhw2v2 xl56j7k x17ydfre x2b8uid xlyipyv x87ps6o x14atkfc xcdnw81 x1i0vuye xjbqb8w xm3z3ea x1x8b98j x131883w x16mih1h x972fbf xcfux6l x1qhh985 xm0m39n xt0psk2 xt7dq6l xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 x1n5bzlp x173jzuc x1yc6y37']"));
    }

    public WebElement password() {
        return driver.findElement(By.xpath("//input[@name='password']"));
    }


    public void navigatetoprofile(String profilename) {
        driver.navigate().to(baseURL + profilename);
    }

    public void ilkFotoyaTikla() {
        driver.findElements(postlocater).get(0).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        for (int i = 0; i < 15; i++) {

            WebElement likeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".xp7jhwk .x1i10hfl > .x6s0dn4")));
            likeButton.click();
            likeButton.click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='İleri']")));
            nextButton.click();
        }
    }
}