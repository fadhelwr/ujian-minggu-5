package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageobjects.ProductPage;

public class CartSteps {
    WebDriver driver;
    ProductPage productPage;

    @When("user adds two products to the cart")
    public void userAddsTwoProductsToTheCart() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadhel\\Documents\\SQA\\msedgedriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/inventory.html");
        productPage = new ProductPage(driver);
        productPage.addProductToCart(); // Add first product
        productPage.addProductToCart(); // Add second product
    }

    @Then("user goes to the cart")
    public void userGoesToTheCart() {
        productPage.goToCart();
        driver.quit();
    }
}
