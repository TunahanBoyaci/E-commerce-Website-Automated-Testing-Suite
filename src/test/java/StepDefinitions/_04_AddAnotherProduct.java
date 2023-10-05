package StepDefinitions;

import PageObjectModels.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_AddAnotherProduct {
    DialogContent dialogContent = new DialogContent();

    @Given("Click on Laptops button on navigation bar")
    public void clickOnLaptopsButtonOnNavigationBar() {
        dialogContent.clickMethod(dialogContent.laptopsButton);
    }

    @And("Click on another product")
    public void clickOnAnotherProduct() {
        dialogContent.clickMethod(dialogContent.laptopProduct);
    }

    @Then("User should navigate to the homepage")
    public void userShouldNavigateToTheHomepage() {
        dialogContent.clickMethod(dialogContent.homePage);
    }
}