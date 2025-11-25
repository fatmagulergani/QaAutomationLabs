package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class QaAutomationLabsFileUploadPage {
    public QaAutomationLabsFileUploadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='File Upload Demo']")
    public WebElement fileUploadTitle;

    @FindBy (xpath = "//label[@class='file-label']/input")
    public WebElement browseFileButton;

    @FindBy (xpath = "//div[@id='fileInfo']")
    public WebElement messageText;



}
