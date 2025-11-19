package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class QaAutomationLabsDragAndDropPage {
    public QaAutomationLabsDragAndDropPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[text()='Drag & Drop Demo']")
    public WebElement dragAndDropTitle;


    private By listItems = By.cssSelector("#sortableList > li"); // liste elemanlarının locator'ı

    public WebElement getItem(int index) {
        return Driver.getDriver().findElements(listItems).get(index);
    }

    /*public List<WebElement> getAllItems() {
        return Driver.getDriver().findElements(listItems);
    }*/

    /*public List<WebElement> getAllItems2() {
        List<WebElement> items = Driver.getDriver().findElements(listItems);
        System.out.println("Bulunan eleman sayısı: " + items.size());
        return items;
    }*/

    public void dragItemToBottom(int fromIndex) {

        //List<WebElement> items2 = getAllItems2();
        //List<WebElement> items = getAllItems();
        //WebElement target = items.get(items.size() - 1);

        WebElement source = getItem(fromIndex);
        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(source)
                //.moveToElement(target)
                .moveByOffset(0, 250)  // biraz daha aşağı iter; çoğu sortable için gerekli
                .release()
                .perform();
    }
}

