package Elements;

import Interfaces.IChosen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Chosen implements IChosen {

    public WebDriver driver;
    public WebElement element;

    public Chosen(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }
}