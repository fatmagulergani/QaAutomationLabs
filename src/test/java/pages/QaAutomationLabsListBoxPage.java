package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class QaAutomationLabsListBoxPage {
    public QaAutomationLabsListBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='List Box Demo']")
    public WebElement listBoxTitle;

    @FindBy (xpath = "//select[@id='list1']//option")
    public List<WebElement> firstList;

    @FindBy (xpath = "//select[@id='list2']//option")
    public List<WebElement> secondList;

    @FindBy (xpath = "//button[@id='add']")
    public WebElement addButton;

    @FindBy (xpath = "//button[@id='addAll']")
    public WebElement addAllButton;

    @FindBy (xpath = "//button[@id='remove']")
    public WebElement removeButton;

    @FindBy (xpath = "//button[@id='removeAll']")
    public WebElement removeAllButton;
}
