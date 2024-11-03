package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageobjects.CheckoutPage;

import static org.junit.Assert.assertEquals;

public class CheckoutSteps {
    WebDriver driver;
    CheckoutPage checkoutPage;

    @When("user checks out with first name {string}, last name {string}, and postal code {string}")
    public void userChecksOutWithFirstNameLastNameAndPostalCode(String firstName, String lastName, String postalCode) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadhel\\Documents\\SQA\\msedgedriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/checkout-step-one.html");
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.checkout(firstName, lastName, postalCode);
    }

    @Then("user should see checkout error message {string}")
    public void userShouldSeeCheckoutErrorMessage(String expectedMessage) {
        assertEquals(expectedMessage, checkoutPage.getErrorMessage());
        driver.quit();
    }
}
