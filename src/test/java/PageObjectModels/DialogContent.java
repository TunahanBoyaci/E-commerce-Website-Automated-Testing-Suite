package PageObjectModels;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends MyMethods {
    public DialogContent() {
        PageFactory.initElements(ParameterDriver.getDriver(), this);
    }

    @FindBy(id = "login2")
    public WebElement loginButton;

    @FindBy(id = "loginusername")
    public WebElement usernameInbox;

    @FindBy(id = "loginpassword")
    public WebElement passwordInbox;

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButton2;

    @FindBy(xpath = "//a[text()='Samsung galaxy s6']")
    public WebElement phoneProduct;

    @FindBy(xpath = "//a[text()='Sony vaio i5']")
    public WebElement laptopProduct;

    @FindBy(id = "totalp")
    public WebElement total;

    @FindBy(xpath = "(//a[text()='Delete'])[1]")
    public WebElement deleteButton;




    @FindBy (xpath = "//a[text()='Phones']")
    public WebElement phonesButton;

    @FindBy (xpath = "//a[text()='Laptops']")
    public WebElement laptopsButton;

    @FindBy (xpath = "//a[text()='Monitors']")
    public WebElement monitorsButton;

    @FindBy (id = "logout2")
    public WebElement logoutButton;

    @FindBy (xpath = "//a[text()='Add to cart']")
    public WebElement addToCart;

    @FindBy (id = "cartur")
    public WebElement cartButton;

    @FindBy (xpath = "//button[text()='Place Order']")
    public WebElement placeOrderButton;

    @FindBy (css = "input[id='name']")
    public WebElement name2Inbox;

    @FindBy (css = "input[id='card']")
    public WebElement card2Inbox;

    @FindBy (xpath = "//button[text()='Purchase']")
    public WebElement purchaseButton;

    @FindBy (css = "a[id='nava']")
    public WebElement homePage;

}
