package selectBestSellerProduct;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.pages.OurBestSellers;

import static java.lang.Thread.sleep;

public class SelectBestSellerProductSteps {

    private WebDriver driver;
    private String productName;

    @Given("User is on main page")
    public void userIsOnMainPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        // Open new Chrome page
        driver = new ChromeDriver();
        // Maximize browser window
        driver.manage().window().maximize();
        // Go to main page
        driver.get("https://testaistore.com/store/");
        sleep(3000);
    }

    @When("^user select random product from best sellers section$")
    public void userSelectRandomProductFromBestSellersSection() throws InterruptedException {
        OurBestSellers ourBestSellers = new OurBestSellers(driver);
        productName = ourBestSellers.addToCartRandomBestSeller();
        sleep(3000);
    }

    @Then("^user is on product page$")
    public void userIsOnProductPage() {
        OurBestSellers ourBestSellers = new OurBestSellers(driver);
        Assert.assertEquals(productName,ourBestSellers.selectedProductName());
        driver.quit();
    }
}
