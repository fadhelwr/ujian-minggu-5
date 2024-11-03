package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageobjects.LoginPage;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadhel\\Documents\\SQA\\msedgedriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("user should see the error message {string}")
    public void userShouldSeeTheErrorMessage(String expectedMessage) {
        assertEquals(expectedMessage, loginPage.getErrorMessage());
        driver.quit();
    }
}
