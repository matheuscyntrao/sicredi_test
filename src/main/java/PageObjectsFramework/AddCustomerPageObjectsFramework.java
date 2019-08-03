package PageObjectsFramework;

import Elements.Button;
import Elements.TextField;
import PageObjects.AddCustomerPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPageObjectsFramework {

    private WebDriver driver;
    private AddCustomerPageObjects addCustomerPageObjects;
    private TextField txtCustomerName, txtContactLastName, txtContactFirstName,
            txtPhone, txtAddressLine1, txtAddressLine2, txtCity, txtState, txtPostalCode,
            txtCountry, txtSalesRepEmployeeNumber, txtCreditLimit;
    private Button btnSave, btnSaveAndGoBack, btnCancel;

    public AddCustomerPageObjectsFramework(WebDriver driver) {
        this.driver = driver;
        AddCustomerPageObjects page = PageFactory.initElements(driver, AddCustomerPageObjects.class);
        this.txtCustomerName = new TextField(driver, page.getTextfield_customerName());
        this.txtContactLastName = new TextField(driver, page.getTextfield_contactLastName());
        this.txtContactFirstName = new TextField(driver, page.getTextfield_contactFirstName());
        this.txtPhone = new TextField(driver, page.getTextfield_phone());
        this.txtAddressLine1 = new TextField(driver, page.getTextfield_addressLine1());
        this.txtAddressLine2 = new TextField(driver, page.getTextfield_addressLine2());
        this.txtCity = new TextField(driver, page.getTextfield_city());
        this.txtState = new TextField(driver, page.getTextfield_state());
        this.txtPostalCode = new TextField(driver, page.getTextfield_postalCode());
        this.txtCountry = new TextField(driver, page.getTextfield_country());
        this.txtSalesRepEmployeeNumber = new TextField(driver, page.getChosen_salesRepEmployeeNumber());
        this.txtCreditLimit = new TextField(driver, page.getTextfield_creditLimit());
        this.btnSave = new Button(driver, page.getButton_save());
        this.btnSaveAndGoBack = new Button(driver, page.getButton_saveAndGoBackToCustomersPage());
        this.btnCancel = new Button(driver, page.getButton_cancel());
    }

    public TextField getTxtCustomerName() {
        return txtCustomerName;
    }

    public TextField getTxtContactLastName() {
        return txtContactLastName;
    }

    public TextField getTxtContactFirstName() {
        return txtContactFirstName;
    }

    public TextField getTxtPhone() {
        return txtPhone;
    }

    public TextField getTxtAddressLine1() {
        return txtAddressLine1;
    }

    public TextField getTxtAddressLine2() {
        return txtAddressLine2;
    }

    public TextField getTxtCity() {
        return txtCity;
    }

    public TextField getTxtState() {
        return txtState;
    }

    public TextField getTxtPostalCode() {
        return txtPostalCode;
    }

    public TextField getTxtCountry() {
        return txtCountry;
    }

    public TextField getTxtSalesRepEmployeeNumber() {
        return txtSalesRepEmployeeNumber;
    }

    public TextField getTxtCreditLimit() {
        return txtCreditLimit;
    }

    public Button getBtnSave() {
        return btnSave;
    }

    public Button getBtnSaveAndGoBack() {
        return btnSaveAndGoBack;
    }

    public Button getBtnCancel() {
        return btnCancel;
    }
}
