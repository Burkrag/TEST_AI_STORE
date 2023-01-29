package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectedProduct {
    private static WebDriver driver;

    public SelectedProduct(WebDriver driver){ SelectedProduct.driver=driver; }

    public String selectedProductName(){
        WebElement selectedItem = driver.findElement(By.cssSelector("div.summary.entry-summary>h1"));
        return selectedItem.getText();
    }

    public String selectedProductPrice(){
        WebElement priceOfProduct = driver.findElement(By.xpath("//*[@id='product-2724']/div[2]/p/span/bdi/text()"));
        return priceOfProduct.getText();
    }

    public void addProductToCart(){
        WebElement addToCartButton = driver.findElement(By.cssSelector("div.summary.entry-summary>form>button"));
        addToCartButton.click();
    }

    public String confirmationMessage(){
        WebElement confirmationMessage = driver.findElement(By.xpath("//*[@id='main']/div/div[1]/div"));
        return confirmationMessage.getText();
    }

    public void viewCartButton(){
        WebElement viewCartButton = driver.findElement(By.xpath("//*[@id='main']/div/div[1]/div/a"));
        viewCartButton.click();
    }
}

