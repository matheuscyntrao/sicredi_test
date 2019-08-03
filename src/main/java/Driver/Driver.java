package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    // LINUX 32 and 64 bits

    public static WebDriver ChromeDriverLinux32() {
        System.setProperty("webdriver.chrome.driver", "");
        return new ChromeDriver();
    }

    public static WebDriver ChromeDriverLinux32Headless() {
        System.setProperty("webdriver.chrome.driver", "");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1024,768");
        options.addArguments("--ignore-certificate-errors");
        return new ChromeDriver(options);
    }

    public static WebDriver ChromeDriverLinux64() {
        System.setProperty("webdriver.chrome.driver", "");
        return new ChromeDriver();
    }

    public static WebDriver ChromeDriverLinux64Headless() {
        System.setProperty("webdriver.chrome.driver", "");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1024,768");
        options.addArguments("--ignore-certificate-errors");
        return new ChromeDriver(options);
    }

    public static WebDriver FirefoxDriverLinux32() {
        System.setProperty("webdriver.chrome.driver", "");
        return new FirefoxDriver();
    }

    public static WebDriver FirefoxDriverLinux32Headless() {
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        System.setProperty("webdriver.gecko.driver", "");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        return new FirefoxDriver(firefoxOptions);
    }

    public static WebDriver FirefoxDriverLinux64() {
        System.setProperty("webdriver.chrome.driver", "");
        return new FirefoxDriver();
    }

    public static WebDriver FirefoxDriverLinux64Headless() {
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        System.setProperty("webdriver.gecko.driver", "");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        return new FirefoxDriver(firefoxOptions);
    }

    // WINDOWS 32 and 64 bits

    public static WebDriver ChromeDriverWindows32() {
        System.setProperty("webdriver.chrome.driver", "\\src\\main\\java\\Driver\\chromedriver.exe");
        return new ChromeDriver();
    }

    public static WebDriver ChromeDriverWindows32Headless() {
        System.setProperty("webdriver.chrome.driver", "\\src\\main\\java\\Driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1024,768");
        options.addArguments("--ignore-certificate-errors");
        return new ChromeDriver(options);
    }

    public static WebDriver ChromeDriverWindows64() {
        System.setProperty("webdriver.chrome.driver", "");
        return new ChromeDriver();
    }

    public static WebDriver ChromeDriverWindows64Headless() {
        System.setProperty("webdriver.chrome.driver", "");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1024,768");
        options.addArguments("--ignore-certificate-errors");
        return new ChromeDriver(options);
    }

    public static WebDriver FirefoxDriverWindows32() {
        System.setProperty("webdriver.chrome.driver", "");
        return new FirefoxDriver();
    }

    public static WebDriver FirefoxDriverWindows32Headless() {
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        System.setProperty("webdriver.gecko.driver", "");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        return new FirefoxDriver(firefoxOptions);
    }

    public static WebDriver FirefoxDriverWindows64() {
        System.setProperty("webdriver.chrome.driver", "");
        return new FirefoxDriver();
    }

    public static WebDriver FirefoxDriverWindows64Headless() {
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        System.setProperty("webdriver.gecko.driver", "");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        return new FirefoxDriver(firefoxOptions);
    }

}
