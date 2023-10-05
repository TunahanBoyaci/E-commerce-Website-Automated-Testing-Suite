package StepDefinitions;

import PageObjectModels.DialogContent;
import Utilities.MyMethods;
import Utilities.MyMethods2;
import Utilities.ParameterDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ja.但し;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class _06_BuyProductTest {
    DialogContent dialogContent = new DialogContent();

    @When("Click on Place Order")
    public void clickOnPlaceOrder() {
        dialogContent.clickMethod(dialogContent.placeOrderButton);
    }

    @Then("User should be able to buy the product")
    public void userShouldBeAbleToBuyTheProduct() {
        dialogContent.sendKeysMethod(dialogContent.name2Inbox,"John");
        dialogContent.sendKeysMethod(dialogContent.card2Inbox,"898989898");
        dialogContent.clickMethod(dialogContent.purchaseButton);

        WebElement successMessage = ParameterDriver.getDriver().findElement(By.cssSelector("p[class='lead text-muted ']"));
        Assert.assertTrue(successMessage.getText().contains("Id"));

        WebElement okButton = ParameterDriver.getDriver().findElement(By.xpath("//button[text()='OK']"));
        okButton.click();
    }
}
