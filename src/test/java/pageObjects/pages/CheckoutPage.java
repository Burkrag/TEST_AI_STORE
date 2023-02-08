package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
    private static WebDriver driver;

    public CheckoutPage(WebDriver driver){CheckoutPage.driver = driver;}

    public void firstName(String name){
        WebElement firstName = driver.findElement(By.xpath("//*[@id='billing_first_name']"));
        firstName.click();
        firstName.sendKeys(name);
    }

    public void lastName(String surname){
        WebElement lastName = driver.findElement(By.xpath("//*[@id='billing_last_name']"));
        lastName.click();
        lastName.sendKeys(surname);
    }

    public void selectCountry(String country){
        Select drpCountry = new Select(driver.findElement(By.xpath("//*[@id='select2-billing_country-container']")));
        drpCountry.selectByVisibleText(country);
    }

    public void street(String streetName){
        WebElement street = driver.findElement(By.xpath("//*[@id='billing_address_1']"));
        street.click();
        street.sendKeys(streetName);
    }

    public void city(String cityName){
        WebElement city = driver.findElement(By.xpath("//*[@id='billing_city']"));
        city.click();
        city.sendKeys(cityName);
    }

    public void zip(String zipcode){
        WebElement zip = driver.findElement(By.xpath("//*[@id='billing_postcode']"));
        zip.click();
        zip.sendKeys(zipcode);
    }

    public void phone(String phoneNumber){
        WebElement phone = driver.findElement(By.xpath("//*[@id='billing_phone']"));
        phone.click();
        phone.sendKeys(phoneNumber);
    }

    public void email(String mail){
        WebElement email = driver.findElement(By.xpath("//*[@id='billing_email']"));
        email.click();
        email.sendKeys(mail);
    }

    public void orderButton(){
        WebElement orderButton = driver.findElement(By.xpath("//*[@id='place_order']"));
        orderButton.click();
    }

    public void errorMessage(){
        WebElement invalidPaymentMethod = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/main/article/div/div/section[2]/div/div/div/div/div/div/div/form[3]/div[1]/ul/li"));
        invalidPaymentMethod.getText();
    }

    public void orderNotes(String note){
        WebElement noteWindow = driver.findElement(By.xpath("//*[@id='order_comments']"));
        noteWindow.sendKeys(note);
    }

    public String checkProductName(){
        WebElement productName = driver.findElement(By.xpath("//*[@id='order_review']/table/tbody/tr/td[1]/text()"));
        return productName.getText();
    }


}
