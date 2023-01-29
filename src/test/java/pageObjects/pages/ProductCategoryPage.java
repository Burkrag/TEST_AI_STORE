package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class ProductCategoryPage {
    private static WebDriver driver;

    public ProductCategoryPage(WebDriver driver){ ProductCategoryPage.driver=driver; }

    public void pageCategoryName(String menPageTexting){
        WebElement menPageTopText = driver.findElement(By.xpath("//*[@id='main']/div/header/h1"));
        menPageTopText.getText();
    }

    public String selectRandomMainProduct() {
        //List of all best sellers
        List<WebElement> availableProducts = driver.findElements(By.xpath("//*[@id='main']/div/ul/li/div[1]"));
        //Length of list
        int allMenProducts = availableProducts.size();
        //Select random product from the list
        Random random = new Random();
        int randomProduct = random.nextInt(allMenProducts);
        String selectedProductTitle = availableProducts.get(randomProduct).getText();
        //Add to cart random product
        availableProducts.get(randomProduct).click();
        return selectedProductTitle;
    }

    public void sortingProducts(String dropdownSort){
        WebElement sortingField = driver.findElement(By.xpath("//*[@id='main']/div/form/select"));
        sortingField.click();
        Select sortingDropdown = new Select(driver.findElement(By.xpath("//*[@id='main']/div/form/select")));
        sortingDropdown.selectByVisibleText(dropdownSort);
    }

    public void changePage(){
        //Select arrow to go to next page(last element)
        WebElement nextPageButton =  driver.findElement(By.xpath("//*[@id='main']/div/nav[2]/ul/li[last()]"));
        nextPageButton.click();
    }
}
