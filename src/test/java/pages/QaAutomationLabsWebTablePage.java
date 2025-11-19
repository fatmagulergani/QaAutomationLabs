package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class QaAutomationLabsWebTablePage {

    private WebDriverWait wait;

    public QaAutomationLabsWebTablePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1[text()='Table Demo']")
    public WebElement webTableTitle;

    private By rowsLocator = By.cssSelector("table#dataTable tbody tr");

    public int getRowCount() {
        this.wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(rowsLocator));
        List<WebElement> rows = Driver.getDriver().findElements(rowsLocator);
        return rows.size();
    }

    @FindBy (xpath = "//input[@id='searchInput']")
    public WebElement searchBox;

    public int getVisibleRowCount() {
        List<WebElement> rows = Driver.getDriver().findElements(rowsLocator);

        int visibleCount = 0;

        for (WebElement row : rows) {
            if (row.isDisplayed()) {
                visibleCount++;
            }
        }

        return visibleCount;
    }
}
