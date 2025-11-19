package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the Shadow Dom button under Tools Demo
5. Verify 'Shadow Dom Demo' is visible
6. Verify 'This is outside Shadow DOM' is visible
7. Verify 'Hello from Shadow DOM!' is visible
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class QaAutomationLabsTest07 extends BaseTest {

    @Test
    public void test07(){
        mainPage.shadowDomButton.click();
        Assert.assertTrue(shadowDomPage.shadowDomTitle.isDisplayed());

        Assert.assertEquals(shadowDomPage.outsideText.getText(), "This is outside Shadow DOM", "The messages are not the same");
        Assert.assertEquals(shadowDomPage.insideText.getText(), "Hello from Shadow DOM!", "The messages are not the same");
    }
}
