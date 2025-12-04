package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the File Download button under Tools Demo
5. Verify 'Generate and Download Text File Demo' is visible
6. Click 'Generate File' button
7. Verify the warning message (Please Enter Some Text)
8. Fill out the field
9. Use special characters
10.Click 'Generate File' button
11.Wait 3 seconds
12.Click 'Download File' link
13.Verify the file name (myfile.txt) and size
*/

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QaAutomationLabsTest12 extends BaseTest{

    @Test
    public void test12() throws InterruptedException {
        mainPage.fileDownloadButton.click();
        Assert.assertTrue(fileDownloadPage.fileDownloadTitle.isDisplayed());

        fileDownloadPage.generateFileButton.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        String actualText = alert.getText();
        String expectedText = "Please Enter Some Text";
        Assert.assertEquals(actualText, expectedText, "The messages are not the same");
        Thread.sleep(1000);
        alert.accept();

        fileDownloadPage.textInputArea.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit…1234567890-=!@#$%^&*()_+;,\\./'\"[]{}:<>?");
        fileDownloadPage.generateFileButton.click();
        Thread.sleep(3000);

        fileDownloadPage.downloadFileLink.click();

        String fileName = "myfile.txt"; //download file name
        String home = System.getProperty("user.home");
        Path downloadPath = Paths.get(home, "Downloads");
        String downloadDir = downloadPath.toString() + File.separator;

        File file = new File(downloadDir + fileName);
        Thread.sleep(3000);

        if (file.exists()) {
            System.out.println("Dosya bulundu!");
            System.out.println("Dosya boyutu: " + file.length() + " byte");
        } else {
            System.out.println("Dosya bulunamadı!");
        }
    }
}
