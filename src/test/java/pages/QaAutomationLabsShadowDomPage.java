package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QaAutomationLabsShadowDomPage {

    public QaAutomationLabsShadowDomPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='Shadow Dom Demo']")
    public WebElement shadowDomTitle;

    @FindBy (xpath = "//h3[text()='This is outside Shadow DOM']")
    public WebElement outsideText;

    @FindBy (xpath = "//div[@id='shadow-host']")
    public WebElement insideText;
}
