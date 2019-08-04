package Tasks;

import Datapool.ORM.Objetos.Customer;
import PageObjectsFramework.AddCustomerPageObjectsFramework;
import org.openqa.selenium.WebDriver;

public class AddCustomerTasks {

    WebDriver driver;
    AddCustomerPageObjectsFramework addCustomerPageObjectsFramework;

    public AddCustomerTasks(WebDriver driver) {
        this.driver = driver;
        this.addCustomerPageObjectsFramework = new AddCustomerPageObjectsFramework(this.driver);
    }

    public void signupCustomer(Customer customer) {
        this.addCustomerPageObjectsFramework.getTxtCustomerName().sendKeys(customer.getName());
        this.addCustomerPageObjectsFramework.getTxtContactLastName().sendKeys(customer.getLastName());
        this.addCustomerPageObjectsFramework.getTxtContactFirstName().sendKeys(customer.getContactFirstName());
        this.addCustomerPageObjectsFramework.getTxtPhone().sendKeys(customer.getPhone());
        this.addCustomerPageObjectsFramework.getTxtAddressLine1().sendKeys(customer.getAddressLine1());
        this.addCustomerPageObjectsFramework.getTxtAddressLine2().sendKeys(customer.getAddressLine2());
        this.addCustomerPageObjectsFramework.getTxtCity().sendKeys(customer.getCity());
        this.addCustomerPageObjectsFramework.getTxtState().sendKeys(customer.getState());
        this.addCustomerPageObjectsFramework.getTxtCountry().sendKeys(customer.getCountry());
        this.addCustomerPageObjectsFramework.getTxtPostalCode().sendKeys(customer.getPostalCode());
        this.addCustomerPageObjectsFramework.getTxtSalesRepEmployeeNumber().chose(customer.getFromEmployeer());
        this.addCustomerPageObjectsFramework.getTxtCreditLimit().sendKeys(""+customer.getCreditLimit());
    }

    public void clickSave() {
        this.addCustomerPageObjectsFramework.getBtnSave();
    }

    public void clickSaveAndReturn() {
        this.addCustomerPageObjectsFramework.getBtnSaveAndGoBack();
    }
}
