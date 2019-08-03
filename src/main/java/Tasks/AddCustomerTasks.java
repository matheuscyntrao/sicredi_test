package Tasks;

import PageObjectsFramework.AddCustomerPageObjectsFramework;
import org.openqa.selenium.WebDriver;

public class AddCustomerTasks {

    WebDriver driver;
    AddCustomerPageObjectsFramework addCustomerPageObjectsFramework;

    public AddCustomerTasks(WebDriver driver) {
        this.driver = driver;
        this.addCustomerPageObjectsFramework = new AddCustomerPageObjectsFramework(this.driver);
    }
}
