package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;
    By title = By.cssSelector("[data-test='title']");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean titleIsDisplayed() {
        return driver.findElement(title).isDisplayed();
    }
}
