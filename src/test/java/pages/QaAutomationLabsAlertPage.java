package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QaAutomationLabsAlertPage {
    public QaAutomationLabsAlertPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='JavaScript Alert Demo']")
    public WebElement alertTitle;

    @FindBy (css = "button.btn.btn-primary.btn-sm")
    public WebElement showAlertButton;

    @FindBy (xpath = "//div[@id='output']")
    public WebElement message;

    @FindBy (css = "button.btn.btn-success.btn-sm")
    public WebElement showConfirmButton;

    @FindBy (css = "button.btn.btn-danger.btn-sm")
    public WebElement showPromptButton;
}
