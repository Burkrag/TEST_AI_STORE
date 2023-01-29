package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class OurBestSellers {
    private static WebDriver driver;

    public OurBestSellers(WebDriver driver){ OurBestSellers.driver=driver; }

    public String selectRandomBestSeller(){
        //List of all best sellers
        List<WebElement> products = driver.findElements(By.xpath("//*[@id='woocommerce_top_rated_products-2']/ul/li/a"));
        //Length of list
        int maxProducts = products.size();
        //Select random product from the list
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        String productName = products.get(randomProduct).getText();
        //Add to cart random product
        products.get(randomProduct).click();
        return productName;
    }
}
