package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QaAutomationLabsCheckBoxPage {
    public QaAutomationLabsCheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='Checkbox Demo']")
    public WebElement checkBoxTitle;

    @FindBy (xpath = "//input[@id='myCheckbox']")
    public WebElement singleCheckBox;

    @FindBy (xpath = "//div[@id='message']")
    public WebElement singleCheckBoxMessage;

    @FindBy (xpath = "//input[@id='chk1']")
    public WebElement enableCheckbox1;

    @FindBy (xpath = "//input[@id='chk2']")
    public WebElement enableCheckbox2;

    @FindBy (xpath = "//button[@id='toggleBtn']")
    public WebElement checkAllButton;

    @FindBy (xpath = "//input[@id='multichk1']")
    public WebElement multiCheckBox1;

    @FindBy (xpath = "//input[@id='multichk2']")
    public WebElement multiCheckBox2;

    @FindBy (xpath = "//input[@id='multichk3']")
    public WebElement multiCheckBox3;

    @FindBy (xpath = "//input[@id='multichk4']")
    public WebElement multiCheckBox4;

}
