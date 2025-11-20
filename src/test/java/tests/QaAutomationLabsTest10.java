package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the Alert button under Tools Demo
5. Verify 'JavaScript Alert Demo' is visible
6. Click 'Show Alert' button
7. Wait 1 second
8. Click 'OK'
9. Verify the message 'Alert shown.'
10.Click 'Show Confirm' button
11.Wait 1 second
12.Click 'OK'
13.Verify the message 'You clicked OK on confirm button.'
14.Click 'Show Confirm' button
15.Wait 1 second
16.Click 'Cancel'
17.Verify the message 'You clicked Cancel on confirm button.'
18.Click 'Show Prompt' button
19.Wait 1 second
20.Write 'Fatoshi'
21.Click 'OK'
22.Verify the message 'You entered: Fatoshi'
23.Click 'Show Prompt' button
24.Wait 1 second
25.Click 'OK'
26.Verify the message 'Prompt was cancelled or empty.'
27.Click 'Show Prompt' button
28.Wait 1 second
29.Click 'Cancel'
30.Verify the message 'Prompt was cancelled or empty.'
*/

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class QaAutomationLabsTest10 extends BaseTest {

    @Test
    public void test10() throws InterruptedException {
        mainPage.alertButton.click();
        Assert.assertTrue(alertPage.alertTitle.isDisplayed());

        alertPage.showAlertButton.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        //System.out.println(alert.getText());
        Thread.sleep(1000);
        alert.accept();

        String actualText = alertPage.message.getText();
        String expectedText = "Alert shown.";
        Assert.assertEquals(actualText, expectedText, "Messages (Show Alert) are not the same");

        alertPage.showConfirmButton.click();
        alert = Driver.getDriver().switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

        actualText = alertPage.message.getText();
        expectedText = "You clicked OK on confirm button.";
        Assert.assertEquals(actualText, expectedText, "Messages (Show Confirm) are not the same");

        alertPage.showConfirmButton.click();
        alert = Driver.getDriver().switchTo().alert();
        Thread.sleep(1000);
        alert.dismiss();

        actualText = alertPage.message.getText();
        expectedText = "You clicked Cancel on confirm button.";
        Assert.assertEquals(actualText, expectedText, "Messages (Show Confirm) are not the same");

        alertPage.showPromptButton.click();
        alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys("Fatoshi");
        alert.accept();

        actualText = alertPage.message.getText();
        expectedText = "You entered: Fatoshi";
        Assert.assertEquals(actualText, expectedText, "Messages (Show Prompt) are not the same");

        alertPage.showPromptButton.click();
        alert = Driver.getDriver().switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

        actualText = alertPage.message.getText();
        expectedText = "Prompt was cancelled or empty.";
        Assert.assertEquals(actualText, expectedText, "Messages (Show Prompt) are not the same");

        alertPage.showPromptButton.click();
        alert = Driver.getDriver().switchTo().alert();
        Thread.sleep(1000);
        alert.dismiss();

        actualText = alertPage.message.getText();
        expectedText = "Prompt was cancelled or empty.";
        Assert.assertEquals(actualText, expectedText, "Messages (Show Prompt) are not the same");

    }
}
