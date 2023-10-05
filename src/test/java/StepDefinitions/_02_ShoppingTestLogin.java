package StepDefinitions;

import PageObjectModels.DialogContent;
import Utilities.BaseDriver;
import Utilities.MyMethods2;
import Utilities.ParameterDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class _02_ShoppingTestLogin {
    DialogContent dialogContent = new DialogContent();

    @Given("Navigate to the webpage")
    public void navigateToTheWebpage() {
        ParameterDriver.getDriver().get("https://www.demoblaze.com/index.html");
    }

    @And("Click on Log in button")
    public void clickOnLogInButton() {
        dialogContent.clickMethod(dialogContent.loginButton);
    }

    @And("Enter {string} as username and {string} as password")
    public void enterAsUsernameAndAsPassword(String username, String password) {
        dialogContent.sendKeysMethod(dialogContent.usernameInbox,username);
        dialogContent.sendKeysMethod(dialogContent.passwordInbox,password);
    }

    @When("Click on second Log in button")
    public void clickOnSecondLogInButton() {
        dialogContent.clickMethod(dialogContent.loginButton2);
    }

    @Then("User should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        MyMethods2.myWait(2);
        WebElement successMessage = ParameterDriver.getDriver().findElement(By.cssSelector("a[id=\"nava\""));
        Assert.assertTrue(successMessage.isDisplayed());
    }
}
