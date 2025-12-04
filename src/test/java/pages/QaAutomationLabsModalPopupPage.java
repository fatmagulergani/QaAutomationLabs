package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.*;
import java.util.List;


public class QaAutomationLabsModalPopupPage {
    public QaAutomationLabsModalPopupPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='Window popup Modal Demo']")
    public WebElement modalPopupTitle;

    @FindBy (xpath = "//button[@class='btn btn-success mr-1']")
    public WebElement successButton;

    @FindBy (xpath = "//button[@class='btn btn-info mr-1']")
    public WebElement infoButton;

    @FindBy (xpath = "//button[@class='btn btn-primary mr-1']")
    public WebElement primaryModalButton;

    @FindBy (xpath = "//button[@class='btn btn-danger']")
    public WebElement errorModalButton;

    /*@FindBy (xpath = "//div[@id='modal-success']//button[@class='btn btn-outline-light']")
    public WebElement closeButton;*/

    @FindBy (xpath = "//button[@class='btn btn-outline-light']")
    public List<WebElement> closeButton;

    public WebElement getVisibleModal() {
        return Driver.getDriver().findElement(By.cssSelector(".modal.show"));
    }

    public String getVisibleModalTitle() {
        return getVisibleModal().findElement(By.cssSelector(".modal-title")).getText();
    }

    public String getVisibleModalBody() {
        return getVisibleModal().findElement(By.cssSelector(".modal-body")).getText();
    }

    public String getModalHeaderColor() {
        return Driver.getDriver().findElement(By.cssSelector(".modal.show .modal-header")).getCssValue("background-color");
    }

    /*public void closeModal(String modalId) {
        WebElement closeButton = Driver.getDriver().findElement(By.cssSelector("#" + modalId + " .modal-footer button[data-dismiss='modal']"));
        closeButton.sendKeys(Keys.ENTER);
        System.out.println("OK");
    }*/
}