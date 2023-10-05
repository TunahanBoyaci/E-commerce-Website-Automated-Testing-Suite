package StepDefinitions;

import PageObjectModels.DialogContent;
import Utilities.MyMethods;
import Utilities.MyMethods2;
import Utilities.ParameterDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _03_AddProductTest {
    DialogContent dialogContent = new DialogContent();

    @Given("Click on Phones button on navigation bar")
    public void clickOnPhonesButtonOnNavigationBar() {
        dialogContent.clickMethod(dialogContent.phonesButton);
    }


    @And("Click on a product")
    public void clickOnAProduct() {
        MyMethods2.myWait(2);
        dialogContent.clickMethod(dialogContent.phoneProduct);
    }

    @When("Add the product")
    public void addTheProduct() {
        dialogContent.clickMethod(dialogContent.addToCart);
    }

    @Then("User should add the product successfully")
    public void userShouldAddTheProductSuccessfully() {
        MyMethods2.myWait(2);
//        WebDriverWait wait = new WebDriverWait(ParameterDriver.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
        ParameterDriver.getDriver().switchTo().alert().accept();
        dialogContent.clickMethod(dialogContent.homePage);
    }

}
