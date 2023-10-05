package StepDefinitions;

import PageObjectModels.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class _05_RemovePhoneProductTest {
    DialogContent dialogContent = new DialogContent();

    @Given("Navigate to the cart")
    public void navigateToTheCart() {
        dialogContent.clickMethod(dialogContent.cartButton);
    }

    @When("Click on a remove phone product")
    public void clickOnARemovePhoneProduct() {
        dialogContent.clickMethod(dialogContent.deleteButton);
    }
}
