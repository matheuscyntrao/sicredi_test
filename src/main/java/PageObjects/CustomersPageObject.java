package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPageObject {

    @FindBy(css = "#gcrud-search-form > div.header-tools > div.floatL.t5 > a")
    private WebElement buttonAddCustomer;

}
