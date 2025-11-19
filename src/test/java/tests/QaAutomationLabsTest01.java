package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the CheckBox under Tools Demo
5. Verify 'Checkbox Demo' is visible
6. Make selective 'Check me!' checkbox under Single Checkbox Demo
7. Verify 'checked' is visible
8. Wait 3 seconds
9. Make unselective 'Check me!' checkbox

10. Make selective 'Enable Checkbox 1' and 'Enable Checkbox 2' under Disabled Checkbox Demo
11. Wait 3 seconds
12. Make unselective 'Enable Checkbox 1' and 'Enable Checkbox 2' under Disabled Checkbox Demo

13. Click 'Check All' button
14. Check that 'Checkbox 1', 'Checkbox 2', 'Checkbox 3' and 'Checkbox 4' is checked
15. Wait 3 seconds
16. Click 'Check All' button
17. Check that 'Checkbox 1', 'Checkbox 2', 'Checkbox 3' and 'Checkbox 4' is unchecked

18. Close the browser
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class QaAutomationLabsTest01 extends BaseTest {

    @Test
    public void test01() throws InterruptedException {
        mainPage.checkBoxButton.click();
        Assert.assertTrue(checkBoxPage.checkBoxTitle.isDisplayed());
        checkBoxPage.singleCheckBox.click();
        Assert.assertTrue(checkBoxPage.singleCheckBoxMessage.isDisplayed());
        Thread.sleep(3000);
        checkBoxPage.singleCheckBox.click();

        checkBoxPage.enableCheckbox1.click();
        checkBoxPage.enableCheckbox2.click();
        Thread.sleep(3000);
        checkBoxPage.enableCheckbox1.click();
        checkBoxPage.enableCheckbox2.click();

        checkBoxPage.checkAllButton.click();
        Assert.assertTrue(checkBoxPage.multiCheckBox1.isSelected());
        Assert.assertTrue(checkBoxPage.multiCheckBox2.isSelected());
        Assert.assertTrue(checkBoxPage.multiCheckBox3.isSelected());
        Assert.assertTrue(checkBoxPage.multiCheckBox4.isSelected());
        Thread.sleep(3000);
        checkBoxPage.checkAllButton.click();
        Assert.assertFalse(checkBoxPage.multiCheckBox1.isSelected());
        Assert.assertFalse(checkBoxPage.multiCheckBox2.isSelected());
        Assert.assertFalse(checkBoxPage.multiCheckBox3.isSelected());
        Assert.assertFalse(checkBoxPage.multiCheckBox4.isSelected());

    }
}
