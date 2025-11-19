package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class QaAutomationLabsRadioButtonPage {

    public QaAutomationLabsRadioButtonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath =  "//h1[text()='Radio Button Demo']")
    public WebElement radioButtonTitle;

    @FindBy (xpath = "//input[@value='Male']")
    public List<WebElement> maleRadioButton;

    @FindBy (xpath = "//input[@value='Female']")
    public List<WebElement> femaleRadioButton;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm']")
    public List<WebElement> showSelectedGenderButton;

    @FindBy (xpath = "//p[@id='result']")
    public WebElement result1;

    @FindBy (xpath = "//input[@value='Radio Button 1']")
    public WebElement radioButton1;

    @FindBy (xpath = "//input[@value='Radio Button 2']")
    public WebElement radioButton2;

    @FindBy (xpath = "//p[@id='result3']")
    public WebElement result2;

    @FindBy (xpath = "//input[@value='Under 18']")
    public WebElement age1;

    @FindBy (xpath = "//input[@value='18-35']")
    public WebElement age2;

    @FindBy (xpath = "//input[@value='35+']")
    public WebElement age3;
}
