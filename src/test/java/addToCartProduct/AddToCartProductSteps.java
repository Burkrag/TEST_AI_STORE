package addToCartProduct;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.pages.CartPage;
import pageObjects.pages.MainHeaderBar;
import pageObjects.pages.ProductCategoryPage;
import pageObjects.pages.SelectedProduct;

import java.util.concurrent.TimeUnit;

public class AddToCartProductSteps {

    private WebDriver driver;
    private String productName;

    @Given("User is on main page")
    public void userIsOnMainPage(){
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

    @When("^user goes to women subpage$")
    public void userGoesToWomenSubpage() {
        MainHeaderBar mainHeaderBar = new MainHeaderBar(driver);
        mainHeaderBar.womenHeader();
    }

    @And("^user selects random women product$")
    public void userSelectsRandomWomenProduct() {
        ProductCategoryPage productCategoryPage = new ProductCategoryPage(driver);
        productCategoryPage.selectRandomMainProduct();
    }

    @And("^user clicks add to cart button$")
    public void userClicksAddToCartButton() {
        SelectedProduct selectedProduct = new SelectedProduct(driver);
        selectedProduct.addProductToCart();
    }

    @Then("^user sees confirmation message$")
    public void userSeesConfirmationMessage() {
        SelectedProduct selectedProduct = new SelectedProduct(driver);
        productName = selectedProduct.selectedProductName();
        String displayedMessage = "View cart"+ "\n"+"“" +productName+"”"+" has been added to your cart.";
        Assert.assertEquals(displayedMessage,selectedProduct.confirmationMessage());
    }

    @When("^user goes to cart$")
    public void userGoesToCart() {
        SelectedProduct selectedProduct = new SelectedProduct(driver);
        selectedProduct.viewCartButton();
    }

    @Then("^user can see product in the cart$")
    public void userCanSeeProductInTheCart() {
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.productNameInCart(),productName);
    }
}
