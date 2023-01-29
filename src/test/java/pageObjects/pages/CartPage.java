package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private static WebDriver driver;

    public CartPage(WebDriver driver){ CartPage.driver=driver; }

    public String productNameInCart(){
        WebElement productNameInCart = driver.findElement(By.cssSelector("td.product-name"));
        return productNameInCart.getText();
    }
}
