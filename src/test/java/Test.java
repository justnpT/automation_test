import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

    @org.junit.Test
    public void Test() {
        System.setProperty("webdriver.gecko.driver", "src\\resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
