package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the Notification link under the left menu
5. Verify 'Notification Demo' is visible
6. Click 'Success Message' button
7. Wait 1 second
8. Check the notification in the upper right corner of the screen
9. Verify the message body 'Notification Body:- You Notification Body Goes Here.'
10.Verify background color
11.Click 'Info Message' button
12.Wait 1 second
13.Check the notification in the upper right corner of the screen
14.Verify the message body 'Notification Body:- You Notification Body Goes Here.'
15.Verify background color
16.Click 'Primary Message' button
17.Wait 1 second
18.Check the notification in the upper right corner of the screen
19.Verify the message body 'Notification Body:- You Notification Body Goes Here.'
20.Verify background color
21.Click 'Error Message' button
22.Wait 1 second
23.Check the notification in the upper right corner of the screen
24.Verify the message body 'Notification Body:- You Notification Body Goes Here.'
25.Verify background color
26.Close notifications
*/

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QaAutomationLabsTest09 extends BaseTest {

    @Test
    public void test09() throws InterruptedException {
        mainPage.notificationsLink.click();
        Assert.assertTrue(notificationsPage.notificationsTitle.isDisplayed());

        notificationsPage.successButton.click();
        Thread.sleep(1000);

        String actualText = notificationsPage.messageBody.getText();
        String expectedText = "Notification Body:- You Notification Body Goes Here.";
        Assert.assertEquals(actualText, expectedText, "Messages (Success) are not the same");

        String color = notificationsPage.messageTitle.getCssValue("background-color");
        String hex = Color.fromString(color).asHex();
        Assert.assertEquals(hex, "#28a745");

        notificationsPage.infoButton.click();
        Thread.sleep(1000);

        actualText = notificationsPage.messageBody.getText();
        expectedText = "Notification Body:- You Notification Body Goes Here.";
        Assert.assertEquals(actualText, expectedText, "Messages (Info) are not the same");

        color = notificationsPage.messageTitle.getCssValue("background-color");
        hex = Color.fromString(color).asHex();
        Assert.assertEquals(hex, "#17a2b8");

        notificationsPage.primaryButton.click();
        Thread.sleep(1000);

        actualText = notificationsPage.messageBody.getText();
        expectedText = "Notification Body:- You Notification Body Goes Here.";
        Assert.assertEquals(actualText, expectedText, "Messages (Primary) are not the same");

        color = notificationsPage.messageTitle.getCssValue("background-color");
        hex = Color.fromString(color).asHex();
        Assert.assertEquals(hex, "#007bff");


        notificationsPage.errorButton.click();
        Thread.sleep(1000);

        actualText = notificationsPage.messageBody.getText();
        expectedText = "Notification Body:- You Notification Body Goes Here.";
        Assert.assertEquals(actualText, expectedText, "Messages (Error) are not the same");

        color = notificationsPage.messageTitle.getCssValue("background-color");
        hex = Color.fromString(color).asHex();
        Assert.assertEquals(hex, "#dc3545");


        for (int i = 0; i < 4; i++) {
            notificationsPage.closeMessage.get(0).click();
            Thread.sleep(1000);
        }
    }
}
