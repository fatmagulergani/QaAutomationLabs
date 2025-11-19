package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QaAutomationLabsDropDownPage {

    public QaAutomationLabsDropDownPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='Dropdown Demo']")
    public WebElement dropDownTitle;

    @FindBy (xpath = "//select[@id='fruitDropdown']")
    public WebElement fruitDropdown;

    @FindBy (xpath = "//p[@id='result']")
    public WebElement result;

    @FindBy (xpath = "//select[@id='countryDropdown']")
    public WebElement countryDropdown;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm']")
    public WebElement firstSelectedButton;

    @FindBy (xpath = "//button[@class='btn btn-success btn-sm']")
    public WebElement lastSelectedButton;

    @FindBy (xpath = "//p[@id='outputFirst']")
    public WebElement outputFirstResult;

    @FindBy (xpath = "//p[@id='outputLast']")
    public WebElement outputLastResult;

}
