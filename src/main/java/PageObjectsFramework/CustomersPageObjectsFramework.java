package PageObjectsFramework;

import Elements.Button;
import Elements.Select;
import Elements.TextField;
import PageObjects.CustomersPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CustomersPageObjectsFramework {

    WebDriver driver;
    Button btnAddCustomer;
    Select selBootstrapVersion;
    TextField txtCustomerName;

    public CustomersPageObjectsFramework(WebDriver driver) {
        CustomersPageObject page = PageFactory.initElements(driver, CustomersPageObject.class);
        this.btnAddCustomer = new Button(driver, page.getButton_addCustomer());
        this.selBootstrapVersion = new Select(driver, page.getSelect_BootstrapVersion());
        this.txtCustomerName = new TextField(driver, page.getTextfield_customerName());
    }

    public Button getBtnAddCustomer() {
        return btnAddCustomer;
    }

    public Select getSelBootstrapVersion() {
        return selBootstrapVersion;
    }
}
