package addToCartProduct;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Cucumber/Features/add-to-cart-random-women-product.feature",
        plugin = {"pretty","html:out"}
)

public class AddToCartProductTest {
}
