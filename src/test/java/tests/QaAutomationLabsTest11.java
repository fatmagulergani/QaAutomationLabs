package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the File Upload button under Tools Demo
5. Verify 'File Upload Demo' is visible
6. Upload a file
7. Verify success message
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class QaAutomationLabsTest11 extends BaseTest{

    @Test
    public void test11() {
        mainPage.fileUploadButton.click();
        Assert.assertTrue(fileUploadPage.fileUploadTitle.isDisplayed());

        fileUploadPage.browseFileButton.sendKeys("C:\\Users\\fatmagul\\Desktop\\Test\\test.txt");
        String actualText = fileUploadPage.messageText.getText();
        String expectedText = "Selected File: test.txt & File Size is 0.00 KB";
        Assert.assertEquals(actualText, expectedText, "An error occurred while uploading the file");

    }
}
