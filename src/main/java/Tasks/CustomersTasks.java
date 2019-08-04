package Tasks;

import Datapool.ORM.Objetos.Customer;
import PageObjectsFramework.AddCustomerPageObjectsFramework;
import PageObjectsFramework.CustomersPageObjectsFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CustomersTasks {

    WebDriver driver;
    CustomersPageObjectsFramework customersPageObjectsFramework;

    public CustomersTasks(WebDriver driver) {
        this.driver = driver;
        this.customersPageObjectsFramework = new CustomersPageObjectsFramework(this.driver);
    }

    public void changeBootstrapVersion(String property) {
        this.customersPageObjectsFramework.getSelBootstrapVersion().selectOption(property);
    }

    public void clickAddCostumer() throws InterruptedException {
        this.customersPageObjectsFramework.getBtnAddCustomer().click();
        Thread.sleep(5000);
    }

    public void pesquisar(String textSearch) throws InterruptedException {
        this.driver.findElement(By.className("search-button")).click();
        Thread.sleep(2000);
        this.driver.findElement(By.name("search")).sendKeys(textSearch);
        this.driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
        Thread.sleep(10000);
    }

    public void checkFirstCheckBoxAndClickDelete() throws InterruptedException {
        this.driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[1]")).click();
        this.driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[2]/div[1]/a")).click();
        Thread.sleep(2000);
        this.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]")).click();
        Thread.sleep(2000);
        this.isMesssageSuccessIsPresent();
    }

    public boolean isMesssageSuccessIsPresent() {
        return this.driver.findElement(By.className("alert-success")).isDisplayed();
    }
}
