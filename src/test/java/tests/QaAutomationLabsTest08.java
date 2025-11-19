package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the Drag & Drop button under Tools Demo
5. Verify 'Drag & Drop Demo' is visible
6. Drag and drop item 1 at the bottom
7. Wait 3 seconds
8. Drag and drop item 2 at the bottom
9. Wait 3 seconds
10.Drag and drop item 3 at the bottom
11.Wait 3 seconds
12.Drag and drop item 4 at the bottom
13.Wait 3 seconds
14.Drag and drop item 5 at the bottom
15.Wait 3 seconds
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class QaAutomationLabsTest08 extends BaseTest {

    @Test
    public void test08() throws InterruptedException {
        mainPage.dragAndDropButton.click();
        Assert.assertTrue(dragAndDropPage.dragAndDropTitle.isDisplayed());

        for (int i = 0; i < 5; i++) {
            dragAndDropPage.dragItemToBottom(0);
            Thread.sleep(3000);
        }



    }
}
