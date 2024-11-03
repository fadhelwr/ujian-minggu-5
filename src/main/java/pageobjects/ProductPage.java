package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;

    @FindBy(css = "//div[@class='inventory_item'][1]//button")
    WebElement addToCartButton;

    @FindBy(css = "shopping_cart_badge")
    WebElement cartLink;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addProductToCart() {
        addToCartButton.click();
    }

    public void goToCart() {
        cartLink.click();
    }
}
