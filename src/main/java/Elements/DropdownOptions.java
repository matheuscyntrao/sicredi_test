package Elements;

import Interfaces.IDropdownOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownOptions implements IDropdownOptions {

    WebDriver driver;
    WebElement element;
    List<WebElement> buttons;

    public DropdownOptions(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }

    public void loadButtons() {
        for(WebElement element : this.element.findElements(By.tagName("li"))) {
            this.buttons.add(element);
        }
    }

    public void clickView() {
        this.element.click();
        this.buttons.get(0).click();
    }

    public void clickClone() {
        this.element.click();
        this.buttons.get(1).click();
    }

    public void clickDelete() {
        this.element.click();
        this.buttons.get(2).click();
    }

}
