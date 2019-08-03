package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessageOnTheTopPageObjects {

    @FindBy(className = "alert-success")
    private WebElement alert_success;

}
