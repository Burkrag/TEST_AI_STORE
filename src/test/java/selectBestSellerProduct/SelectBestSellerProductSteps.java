package selectBestSellerProduct;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.pages.OurBestSellers;
import pageObjects.pages.SelectedProduct;
import java.util.concurrent.TimeUnit;

public class SelectBestSellerProductSteps {

    private WebDriver driver;
    private String productName;

    @Given("User is on main page")
    public void userIsOnMainPage() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        // Open new Chrome page
        driver = new ChromeDriver();
        // Maximize browser window
        driver.manage().window().maximize();
        // Go to main page
        driver.get("https://testaistore.com/store/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^user selects random product from best sellers section$")
    public void userSelectRandomProductFromBestSellersSection() {
        OurBestSellers ourBestSellers = new OurBestSellers(driver);
        productName = ourBestSellers.selectRandomBestSeller();
    }

    @Then("^user is on product page$")
    public void userIsOnProductPage() {
        SelectedProduct ourBestSellers = new SelectedProduct(driver);
        Assert.assertEquals(productName,ourBestSellers.selectedProductName());
        driver.quit();
    }
}
