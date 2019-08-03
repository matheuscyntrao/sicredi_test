package Elements;

import Interfaces.IDropdownOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownOptions implements IDropdownOptions {

    WebDriver driver;
    WebElement element;

    public DropdownOptions(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }


}
