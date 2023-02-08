package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class MenPage {
    private static WebDriver driver;

    public MenPage(WebDriver driver){ MenPage.driver=driver; }

    public String menPageDescription(){
        WebElement menPageTopText = driver.findElement(By.xpath("//*[@id='main']/div/header/div/p/text()"));
        return menPageTopText.getText();
    }

    public String addToCartRandomMenProduct() {
        //List of all best sellers
        List<WebElement> menProducts = driver.findElements(By.xpath("//*[@id='main']/div/ul/li/div[1]"));
        //Length of list
        int allMenProducts = menProducts.size();
        //Select random product from the list
        Random random = new Random();
        int randomProduct = random.nextInt(allMenProducts);
        String menProductName = menProducts.get(randomProduct).getText();
        //Add to cart random product
        menProducts.get(randomProduct).click();
        return menProductName;
    }
}
