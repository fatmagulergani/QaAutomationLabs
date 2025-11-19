package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the iFrame button under Tools Demo
5. Verify 'IFrame Demo' is visible
6. Wait 3 seconds
7. Click the button in the Frame 1
8. Verify the message 'You have clicked on iframe 1 button'
9. Wait 3 seconds
10.Click the button in the Frame 2
11.Verify the message 'You have clicked on iframe 2 button'
*/

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class QaAutomationLabsTest06 extends BaseTest {

    @Test
    public void test06() throws InterruptedException {
        mainPage.iFrameButton.click();
        Assert.assertTrue(iFramePage.IFrameTitle.isDisplayed());

        Thread.sleep(3000);

        Driver.getDriver().switchTo().frame(iFramePage.iFrame1);
        iFramePage.button1.click();
        Driver.getDriver().switchTo().defaultContent();
        Assert.assertEquals(iFramePage.message.getText(), "You have clicked on iframe 1 button", "The requested information does not match");

        Thread.sleep(3000);

        Driver.getDriver().switchTo().frame(iFramePage.iFrame2);
        iFramePage.button2.click();
        Driver.getDriver().switchTo().defaultContent();
        Assert.assertEquals(iFramePage.message.getText(), "You have clicked on iframe 2 button", "The requested information does not match");

    }
}
