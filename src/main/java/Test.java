import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

    @org.junit.Test
    public void Test() {
        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\selenium-java-3.13.0\\geckodriver-v0.21.0-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
