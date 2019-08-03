package Elements;

import Interfaces.IChosen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Chosen implements IChosen {

    private WebDriver driver;
    private WebElement element;
    private List<WebElement> options;

    public Chosen(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }

    public void chose(String wordToSearch) {
        this.element.click();
        for (WebElement element : this.element.findElement(By.className("chosen-results")).findElements(By.tagName("li"))) {
            if(element.getAttribute("innerHTML").equals(wordToSearch)) {
                element.click();
            }
        }
    }

}
