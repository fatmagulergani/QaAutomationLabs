package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the Drop Down under Tools Demo
5. Verify 'Dropdown Demo' is visible
6. Select 'Apple' option from dropdown
7. Verify that 'Apple' is selected
8. Wait 3 seconds
9. Select 'Orange' option from dropdown
10.Verify that 'Orange' is selected
11.Wait 3 seconds
12.Remove the last selection

13.Do not select any country from the dropdown
14.Click the First Selected button
15.The screen should display “Please select a first value.”
16.Click the Last Selected button
17.The screen should display “Please select a last value.”
18.Wait 3 seconds

19.Select 'Canada' from the dropdown
20.Click the First Selected button
21.Verify that the screen displays: “First selected value: Canada”
22.Click the Last Selected button
23.Verify that the screen displays: “Last selected value: Canada”
*/

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QaAutomationLabsTest03 extends BaseTest {

    @Test
    public void test03() throws InterruptedException {
        mainPage.dropDownButton.click();
        Assert.assertTrue(dropDownPage.dropDownTitle.isDisplayed());

        dropDownPage.fruitDropdown.click();
        dropDownPage.fruitDropdown.sendKeys("Apple");
        actions.sendKeys(Keys.ENTER).perform();
        String actualText = dropDownPage.result.getText();
        String expectedText = "You selected: Apple";
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(3000);

        dropDownPage.fruitDropdown.click();
        dropDownPage.fruitDropdown.sendKeys("Orange");
        actions.sendKeys(Keys.ENTER).perform();
        actualText = dropDownPage.result.getText();
        expectedText = "You selected: Orange";
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(3000);

        dropDownPage.fruitDropdown.click();
        dropDownPage.fruitDropdown.sendKeys("-");
        actions.sendKeys(Keys.ENTER).perform();
        actualText = dropDownPage.result.getText();
        expectedText = "";
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(3000);

        dropDownPage.firstSelectedButton.click();
        actualText = dropDownPage.outputFirstResult.getText();
        expectedText = "Please select a first value.";
        Assert.assertEquals(actualText, expectedText);
        dropDownPage.lastSelectedButton.click();
        actualText = dropDownPage.outputLastResult.getText();
        expectedText = "Please select a last value.";
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(3000);

        Select select = new Select(dropDownPage.countryDropdown);
        select.selectByVisibleText("Canada");
        dropDownPage.firstSelectedButton.click();
        actualText = dropDownPage.outputFirstResult.getText();
        expectedText = "First selected value: Canada";
        Assert.assertEquals(actualText, expectedText);
        dropDownPage.lastSelectedButton.click();
        actualText = dropDownPage.outputLastResult.getText();
        expectedText = "Last selected value: Canada";

    }
}
