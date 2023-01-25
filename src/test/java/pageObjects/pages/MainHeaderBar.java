package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainHeaderBar {
    private static WebDriver driver;

    public MainHeaderBar(WebDriver driver){ MainHeaderBar.driver=driver; }

    public void homeHeader(){
        WebElement homeButtonHeader = driver.findElement(By.xpath("//*[@id='menu-item-381']/a"));
        homeButtonHeader.click();
    }

    public void storeHeader(){
        WebElement storeHeader = driver.findElement(By.xpath("//*[@id='menu-item-45']/a"));
        storeHeader.click();
    }

    public void menHeader(){
        WebElement menHeader = driver.findElement(By.xpath("//*[@id='menu-item-266']/a"));
        menHeader.click();
    }

    public void womenHeader(){
        WebElement womenHeader = driver.findElement(By.xpath("//*[@id='menu-item-267']/a"));
        womenHeader.click();
    }

    public void accessoriesHeader(){
        WebElement accessoriesHeader = driver.findElement(By.xpath("//*[@id='menu-item-671']/a"));
        accessoriesHeader.click();
    }

    public void accountHeader(){
        WebElement accountHeader = driver.findElement(By.xpath("//*[@id='menu-item-828']/a"));
        accountHeader.click();
    }

    public void aboutHeader(){
        WebElement aboutHeader = driver.findElement(By.xpath("//*[@id='menu-item-828']/a"));
        aboutHeader.click();
    }

    public void contactUsHeader(){
        WebElement contactUsHeader = driver.findElement(By.xpath("//*[@id='menu-item-829']/a"));
        contactUsHeader.click();
    }

    public void cartHeader(){
        WebElement cartHeader = driver.findElement(By.xpath("//*[@id='ast-site-header-cart']/div[1]/a"));
        cartHeader.click();
    }

}
