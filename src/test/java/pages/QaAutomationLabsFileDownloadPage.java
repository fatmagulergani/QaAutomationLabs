package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QaAutomationLabsFileDownloadPage {
    public QaAutomationLabsFileDownloadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='Generate and Download Text File Demo']")
    public WebElement fileDownloadTitle;

    @FindBy (xpath = "//textarea[@id='textInput']")
    public WebElement textInputArea;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm']")
    public WebElement generateFileButton;

    @FindBy (xpath = "//a[@id='downloadLink']")
    public WebElement downloadFileLink;

}
