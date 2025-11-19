package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the Web Table under Tools Demo
5. Verify 'Table Demo' is visible
6. Verify 5 records in the table
7. Write '1' in the SeachBox
8. Verify 1 record in the table
9. Write 'john' in the SeachBox
10.Verify 1 record in the table
11.Write 'spain' in the SeachBox
12.Verify 1 record in the table
13.Write 'h' in the SeachBox
14.Verify 4 records in the table
15.Write 'a' in the SeachBox
16.Verify 5 records in the table
17.Write 'ma' in the SeachBox
18.Verify 2 records in the table
19.Write 'f' in the SeachBox
20.Verify no records in the table
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class QaAutomationLabsTest05 extends BaseTest{

    @Test
    public void test05() throws InterruptedException {
        mainPage.webTableButton.click();
        Assert.assertTrue(webTablePage.webTableTitle.isDisplayed());

        int rows = webTablePage.getRowCount();
        Assert.assertEquals(rows, 5, "Tablodaki satır sayısı beklenenle eşleşmiyor");

        webTablePage.searchBox.sendKeys("1");

        int visibleRows = webTablePage.getVisibleRowCount();
        Assert.assertEquals(visibleRows, 1, "Tablodaki satır sayısı beklenenle eşleşmiyor");

        Thread.sleep(3000);

        webTablePage.searchBox.clear();
        webTablePage.searchBox.sendKeys("john");

        visibleRows = webTablePage.getVisibleRowCount();
        Assert.assertEquals(visibleRows, 1, "Tablodaki satır sayısı beklenenle eşleşmiyor");

        Thread.sleep(3000);

        webTablePage.searchBox.clear();
        webTablePage.searchBox.sendKeys("spain");

        visibleRows = webTablePage.getVisibleRowCount();
        Assert.assertEquals(visibleRows, 1, "Tablodaki satır sayısı beklenenle eşleşmiyor");

        Thread.sleep(3000);

        webTablePage.searchBox.clear();
        webTablePage.searchBox.sendKeys("h");

        visibleRows = webTablePage.getVisibleRowCount();
        Assert.assertEquals(visibleRows, 4, "Tablodaki satır sayısı beklenenle eşleşmiyor");

        Thread.sleep(3000);

        webTablePage.searchBox.clear();
        webTablePage.searchBox.sendKeys("a");

        visibleRows = webTablePage.getVisibleRowCount();
        Assert.assertEquals(visibleRows, 5, "Tablodaki satır sayısı beklenenle eşleşmiyor");

        Thread.sleep(3000);

        webTablePage.searchBox.clear();
        webTablePage.searchBox.sendKeys("ma");

        visibleRows = webTablePage.getVisibleRowCount();
        Assert.assertEquals(visibleRows, 2, "Tablodaki satır sayısı beklenenle eşleşmiyor");

        Thread.sleep(3000);

        webTablePage.searchBox.clear();
        webTablePage.searchBox.sendKeys("f");

        visibleRows = webTablePage.getVisibleRowCount();
        Assert.assertEquals(visibleRows, 0, "Tablodaki satır sayısı beklenenle eşleşmiyor");

    }
}
