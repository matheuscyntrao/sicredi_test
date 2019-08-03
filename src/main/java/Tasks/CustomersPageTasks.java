package Tasks;

import Datapool.ORM.Objetos.Customer;
import PageObjectsFramework.AddCustomerPageObjectsFramework;
import PageObjectsFramework.CustomersPageObjectsFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CustomersPageTasks {

    WebDriver driver;
    CustomersPageObjectsFramework customersPageObjectsFramework;

    public CustomersPageTasks(WebDriver driver) {
        this.driver = driver;
        this.customersPageObjectsFramework = new CustomersPageObjectsFramework(this.driver);
    }

    public void changeBootstrapVersion(String property) {
        this.customersPageObjectsFramework.getSelBootstrapVersion().selectOption(property);
    }

    public void clickAddCostumer() {
        this.customersPageObjectsFramework.getBtnAddCustomer();
    }

    public void pesquisar(String textSearch) throws InterruptedException {
        this.driver.findElement(By.className("search-button")).click();
        Thread.sleep(2000);
        this.driver.findElement(By.name("search")).sendKeys(textSearch);
        this.driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
        Thread.sleep(10000);
    }

    public void checkFirstCheckBoxAndClickDelete() throws InterruptedException {
        this.driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/tbody/tr[1]/td[1]/input")).click();
        this.customersPageObjectsFramework.getDropMoreOptions().clickDelete();
        Thread.sleep(2000);
        if (this.driver.findElement(By.className("modal-dialog")).isDisplayed()) {
            this.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/button[2]")).click();
        }
        Thread.sleep(2000);
        this.isMesssageSuccessIsPresent();
    }

    public boolean isMesssageSuccessIsPresent() {
        return this.driver.findElement(By.className("alert-success")).isDisplayed();
    }
}
