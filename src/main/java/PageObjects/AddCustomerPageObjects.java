package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPageObjects {

    // Campos do formulário

    @FindBy(id = "field-customerName")
    private WebElement textfield_customerName;

    @FindBy(id = "field-contactLastName")
    private WebElement textfield_contactLastName;

    @FindBy(id = "field-contactFirstName")
    private WebElement textfield_contactFirstName;

    @FindBy(id = "field-phone")
    private WebElement textfield_phone;

    @FindBy(id = "field-addressLine1")
    private WebElement textfield_addressLine1;

    @FindBy(id = "field-addressLine2")
    private WebElement textfield_addressLine2;

    @FindBy(id = "field-city")
    private WebElement textfield_city;

    @FindBy(id = "field-state")
    private WebElement textfield_state;

    @FindBy(id = "field-postalCode")
    private WebElement textfield_postalCode;

    @FindBy(id = "field-country")
    private WebElement textfield_country;

    @FindBy(id = "field_salesRepEmployeeNumber_chosen")
    private WebElement chosen_salesRepEmployeeNumber;

    @FindBy(id = "field-creditLimit")
    private WebElement textfield_creditLimit;

    // Botões do formulário

    @FindBy(id = "form-button-save")
    private WebElement button_save;

    @FindBy(id = "save-and-go-back-button")
    private WebElement button_saveAndGoBackToCustomersPage;

    @FindBy(id = "cancel-button")
    private WebElement button_cancel;

    public WebElement getTextfield_customerName() {
        return textfield_customerName;
    }

    public WebElement getTextfield_contactLastName() {
        return textfield_contactLastName;
    }

    public WebElement getTextfield_contactFirstName() {
        return textfield_contactFirstName;
    }

    public WebElement getTextfield_phone() {
        return textfield_phone;
    }

    public WebElement getTextfield_addressLine1() {
        return textfield_addressLine1;
    }

    public WebElement getTextfield_addressLine2() {
        return textfield_addressLine2;
    }

    public WebElement getTextfield_city() {
        return textfield_city;
    }

    public WebElement getTextfield_state() {
        return textfield_state;
    }

    public WebElement getTextfield_postalCode() {
        return textfield_postalCode;
    }

    public WebElement getTextfield_country() {
        return textfield_country;
    }

    public WebElement getChosen_salesRepEmployeeNumber() {
        return chosen_salesRepEmployeeNumber;
    }

    public WebElement getTextfield_creditLimit() {
        return textfield_creditLimit;
    }

    public WebElement getButton_save() {
        return button_save;
    }

    public WebElement getButton_saveAndGoBackToCustomersPage() {
        return button_saveAndGoBackToCustomersPage;
    }

    public WebElement getButton_cancel() {
        return button_cancel;
    }
}
