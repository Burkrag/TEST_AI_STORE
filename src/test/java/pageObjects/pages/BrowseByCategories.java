package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowseByCategories {
    private static WebDriver driver;

    public BrowseByCategories(WebDriver driver){BrowseByCategories.driver=driver;}

    public void accessoriesCategory(){
        WebElement accessoriesCategory = driver.findElement(By.xpath("//*[@id='woocommerce_product_categories-4']/ul/li[1]/a"));
        accessoriesCategory.click();
    }

    public void menCategory(){
        WebElement menCategory = driver.findElement(By.xpath("//*[@id='woocommerce_product_categories-4']/ul/li[2]/a"));
        menCategory.click();
    }

    public void shoesCategory(){
        WebElement shoesCategory = driver.findElement(By.xpath("//*[@id='woocommerce_product_categories-4']/ul/li[3]/a"));
        shoesCategory.click();
    }

    public void womenCategory(){
        WebElement womenCategory = driver.findElement(By.xpath("//*[@id='woocommerce_product_categories-4']/ul/li[4]/a"));
        womenCategory.click();
    }
}
