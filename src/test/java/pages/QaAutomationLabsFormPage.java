package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QaAutomationLabsFormPage {

    public QaAutomationLabsFormPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='Input form validations Demo']")
    public WebElement formTitle;

    @FindBy (xpath = "//input[@id='firstname']")
    public WebElement firstName;

    @FindBy (xpath = "//input[@id='middlename']")
    public WebElement middleName;

    @FindBy (xpath = "//input[@id='lastname']")
    public WebElement lastName;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//textarea[@id='address']")
    public WebElement address;

    @FindBy (xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy (xpath = "//input[@id='states']")
    public WebElement state;

    @FindBy (xpath = "//input[@id='pincode']")
    public WebElement pinCode;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm']")
    public WebElement submitButton;

    @FindBy (xpath = "//div[@id='message']")
    public WebElement message;

}
