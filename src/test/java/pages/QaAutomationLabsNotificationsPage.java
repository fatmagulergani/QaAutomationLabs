package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class QaAutomationLabsNotificationsPage {
    public QaAutomationLabsNotificationsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='Notification Demo']")
    public WebElement notificationsTitle;

    @FindBy (css = "button.btn.btn-success.toastsDefaultSuccess.mr-5")
    public WebElement successButton;

    @FindBy (css = "div.toast-header")
    public WebElement messageTitle;

    @FindBy (css = "div.toast-body")
    public WebElement messageBody;

    @FindBy (xpath = "//span[@aria-hidden='true']")
    public List<WebElement> closeMessage;

    @FindBy (css = "button.btn.btn-info.toastsDefaultInfo.mr-5")
    public WebElement infoButton;

    @FindBy (css = "button.btn.btn-primary.toastsDefaultWarning.mr-5")
    public WebElement primaryButton;

    @FindBy (css = "button.btn.btn-danger.toastsDefaultDanger")
    public WebElement errorButton;
}
