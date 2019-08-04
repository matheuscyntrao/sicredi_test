package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public static WebDriver ChromeDriverWindows32() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\java\\Driver\\chromedriver.exe");
        return new ChromeDriver();
    }

}
