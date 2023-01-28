package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchWindow {
    private static WebDriver driver;

    public SearchWindow(WebDriver driver){ SearchWindow.driver=driver; }

    public void searchWindow(String searchItem){
        WebElement searchWindow = driver.findElement(By.xpath("//*[@id='woocommerce-product-search-field-0']"));
        searchWindow.sendKeys(searchItem);
        searchWindow.submit();
    }

    public void searchButton(String searchItemButton){
        WebElement searchWindow = driver.findElement(By.xpath("//*[@id='woocommerce-product-search-field-0']"));
        searchWindow.sendKeys(searchItemButton);
        WebElement searchButton = driver.findElement(By.xpath("//*[@id='woocommerce_product_search-4']/form/button"));
        searchButton.click();
    }
}
