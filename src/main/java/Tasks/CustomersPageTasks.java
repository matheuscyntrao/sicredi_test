package Tasks;

import PageObjectsFramework.AddCustomerPageObjectsFramework;
import PageObjectsFramework.CustomersPageObjectsFramework;
import org.openqa.selenium.WebDriver;

public class CustomersPageTasks {

    WebDriver driver;
    CustomersPageObjectsFramework customersPageObjectsFramework;

    public CustomersPageTasks(WebDriver driver) {
        this.driver = driver;
        this.customersPageObjectsFramework = new CustomersPageObjectsFramework(this.driver);
    }
}
