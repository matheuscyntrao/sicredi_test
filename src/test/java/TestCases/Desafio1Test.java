package TestCases;

import Datapool.ORM.Listas.CustomersList;
import Driver.Driver;
import Tasks.AddCustomerTasks;
import Tasks.CustomersTasks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desafio1Test {

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
    public void CadastrarCustomer() {
        this.addCustomerTasks = new AddCustomerTasks(this.driver);
        this.addCustomerTasks.signupCustomer(customer.getListaCustomer().get(0));
    }

    @After
    public void tearDown() {
        this.driver.close();
    }
}
