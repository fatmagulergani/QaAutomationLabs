package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BasePage;
import utilities.Driver;

public class QaAutomationLabsMainPage extends BasePage {
    public QaAutomationLabsMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//img[@src='dist/img/logo.png']")
    public WebElement logo;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='checkbox.php']")
    public WebElement checkBoxButton;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='radio-button.php']")
    public WebElement radioButtonButton;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='dropdown.php']")
    public WebElement dropDownButton;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='form.php']")
    public WebElement formButton;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='web-table.php']")
    public WebElement webTableButton;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='iframe.php']")
    public WebElement iFrameButton;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='shadow-dom.php']")
    public WebElement shadowDomButton;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='drag-and-drop.php']")
    public WebElement dragAndDropButton;

    @FindBy (xpath = "//a[@href='notifications.php']")
    public WebElement notificationsLink;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='javaScript-alert.php']")
    public WebElement alertButton;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='file-upload.php']")
    public WebElement fileUploadButton;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='file-download.php']")
    public WebElement fileDownloadButton;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-12 p-2']//a[@href='window-popup-modal.php']")
    public WebElement modalPopupButton;

    public void verifyMainPageIsOpen() {
        verifyPageLoaded(logo);
    }
}
