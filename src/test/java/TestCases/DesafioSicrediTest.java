package TestCases;

import Datapool.ORM.Listas.CustomersList;
import Driver.Driver;
import Tasks.AddCustomerTasks;
import Tasks.CustomersTasks;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesafioSicrediTest {

    WebDriver driver;
    CustomersTasks customersTasks;
    AddCustomerTasks addCustomerTasks;
    CustomersList customer = new CustomersList();

    @Before
    public void init() throws InterruptedException {
        this.driver = Driver.ChromeDriverWindows32();
        this.driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
        this.customersTasks = new CustomersTasks(this.driver);
        this.customersTasks.changeBootstrapVersion("Bootstrap V4 Theme");
        this.customersTasks = new CustomersTasks(this.driver);
        this.customersTasks.clickAddCostumer();
    }

    @Test
    public void DesafioUm() throws InterruptedException {
        this.addCustomerTasks = new AddCustomerTasks(this.driver);
        this.addCustomerTasks.signupCustomer(customer.getListaCustomer().get(0));
        this.addCustomerTasks.clickSave();
        Thread.sleep(3000);
        Assert.assertTrue(
            driver.findElement(By.xpath("//*[@id=\"report-success\"]/p"))
                    .getText()
                    .contains("Your data has been successfully stored into the database."));
    }

    @Test
    public void DesafioDois() throws InterruptedException {
        this.addCustomerTasks = new AddCustomerTasks(this.driver);
        this.addCustomerTasks.signupCustomer(customer.getListaCustomer().get(0));
        this.addCustomerTasks.clickSaveAndReturn();
        Thread.sleep(3000);
        this.customersTasks = new CustomersTasks(this.driver);
        this.customersTasks.pesquisar("Teste Sicredi");
        this.customersTasks.checkFirstCheckBoxAndClickDelete();
        Thread.sleep(2000);
        Assert.assertTrue(this.customersTasks.isMesssageSuccessIsPresent());
    }

    @After
    public void tearDown() {
        this.driver.close();
    }
}
