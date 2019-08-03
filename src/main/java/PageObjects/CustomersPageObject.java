package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPageObject {

    @FindBy(css = "#gcrud-search-form > div.header-tools > div.floatL.t5 > a")
    private WebElement button_addCustomer;

    @FindBy(id = "switch-version-select")
    private WebElement select_BootstrapVersion;

    @FindBy(className = "customerName")
    private WebElement textfield_customerName;

    @FindBy(xpath = "//*[@id=\"gcrud-search-form\"]/div[2]/table/tbody/tr[1]/td[2]/div[1]/div/button")
    private WebElement button_firstRegistryMoreOptions;

}
