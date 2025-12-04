package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the Modal Pop Up button under Tools Demo
5. Verify 'Window popup Modal Demo' is visible
Click Success Modal Popup button
Verify the message header, body (header: Success Modal Popup, body: Modal Popup Body) and color
Click close on the popup message
Wait 3 seconds
Click Info Modal Popup button
Verify the message header, body (header: Info Modal Popup, body: Modal Popup Body) and color
Click close on the popup message
Wait 3 seconds
Click Primary Modal Popup button
Verify the message header, body (header: Primary Modal Popup, body: Modal Popup Body) and color
Click close on the popup message
Wait 3 seconds
Click Error Modal Popup button
Verify the message header, body (header: Error Modal Popup, body: Modal Popup Body) and color
Click close on the popup message
*/
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class QaAutomationLabsTest13 extends BaseTest{

    @Test
    public void test13() throws InterruptedException {
        mainPage.modalPopupButton.click();

        Assert.assertTrue(modalPopupPage.modalPopupTitle.isDisplayed());

        modalPopupPage.successButton.click();
        Assert.assertEquals(modalPopupPage.getVisibleModalTitle(), "Success Modal Popup", "The messages are not the same");
        Assert.assertEquals(modalPopupPage.getVisibleModalBody(), "Modal Popup Body", "The messages are not the same");
        Assert.assertEquals(modalPopupPage.getModalHeaderColor(), "rgba(40, 167, 69, 1)", "The messages are not the same");

        Thread.sleep(1000);

        Actions actions = new Actions(Driver.getDriver());
        actions.click(modalPopupPage.closeButton.get(2)).perform();

        //modalPopupPage.closeModal("modal-success");

        Thread.sleep(3000);

        modalPopupPage.infoButton.click();
        Assert.assertEquals(modalPopupPage.getVisibleModalTitle(), "Info Modal Popup", "The messages are not the same");
        Assert.assertEquals(modalPopupPage.getVisibleModalBody(), "Modal Popup Body", "The messages are not the same");
        Assert.assertEquals(modalPopupPage.getModalHeaderColor(), "rgba(23, 162, 184, 1)", "The messages are not the same");

        Thread.sleep(1000);

        actions.click(modalPopupPage.closeButton.get(1)).perform();

        Thread.sleep(3000);

        modalPopupPage.primaryModalButton.click();
        Assert.assertEquals(modalPopupPage.getVisibleModalTitle(), "Primary Modal Popup", "The messages are not the same");
        Assert.assertEquals(modalPopupPage.getVisibleModalBody(), "Modal Popup Body", "The messages are not the same");
        Assert.assertEquals(modalPopupPage.getModalHeaderColor(), "rgba(168, 59, 91, 1)", "The messages are not the same");

        Thread.sleep(1000);

        actions.click(modalPopupPage.closeButton.get(0)).perform();

        Thread.sleep(3000);

        modalPopupPage.errorModalButton.click();
        Assert.assertEquals(modalPopupPage.getVisibleModalTitle(), "Error Modal Popup", "The messages are not the same");
        Assert.assertEquals(modalPopupPage.getVisibleModalBody(), "Modal Popup Body", "The messages are not the same");
        Assert.assertEquals(modalPopupPage.getModalHeaderColor(), "rgba(220, 53, 69, 1)", "The messages are not the same");

        Thread.sleep(1000);

        actions.click(modalPopupPage.closeButton.get(3)).perform();

        Thread.sleep(3000);
    }

}
