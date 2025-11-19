package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QaAutomationLabsIFramePage {

    public QaAutomationLabsIFramePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='IFrame Demo']")
    public WebElement IFrameTitle;

    @FindBy (xpath = "//iframe[@name='iframe1']")
    public WebElement iFrame1;

    @FindBy (xpath = "//iframe[@name='iframe2']")
    public WebElement iFrame2;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm w-100']")
    public WebElement button1;

    @FindBy (xpath = "//button[@class='btn btn-danger btn-sm w-100']")
    public WebElement button2;

    @FindBy (xpath = "//p[@id='message']")
    public WebElement message;
}
