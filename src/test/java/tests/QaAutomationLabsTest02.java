package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the Radio Button under Tools Demo
5. Verify 'Radio Button Demo' is visible
6. Click 'Show Selected Gender'
7. Verify 'Please select a gender.' is visible
Wait 3 seconds
8. Click 'Male'
9. Click 'Show Selected Gender'
10. Verify 'You selected: Male' is visible
11. Wait 3 seconds
12. Click 'Female'
13. Check that 'Male' is unchecked
14. Click 'Show Selected Gender'
15. Verify 'You selected: Female' is visible
16. Wait 3 seconds

17. Click 'Radio Button 1'
18. Wait 3 seconds
19. Click 'Radio Button 2'
20. Check that 'Radio Button 1' is unchecked
21. Wait 3 seconds

22. Click 'Show Selected Values'
23. Verify 'Please select both gender and age group.' is visible
24. Click 'Male'
25. Wait 3 seconds
26. Click 'Under 18'
27. Click 'Show Selected Values'
28. Verify 'You selected: Gender = Male, Age Group =Under 18' is visible
29. Wait 3 seconds
30. Click 'Female'
31. Check that 'Male' is unchecked
32. Wait 3 seconds
33. Click '18-35'
34. Check that 'Under 18' is unchecked
35. Click 'Show Selected Values'
36. Verify 'You selected: Gender = Female, Age Group =18-35' is visible

37. Wait 3 seconds
38. Click '35+'
39. Check that '18-35' is unchecked
40. Click 'Show Selected Values'
41. Verify 'You selected: Gender = Female, Age Group =35+' is visible
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class QaAutomationLabsTest02 extends BaseTest {

    @Test
    public void test02() throws InterruptedException {
        mainPage.radioButtonButton.click();
        Assert.assertTrue(radioButtonPage.radioButtonTitle.isDisplayed());
        radioButtonPage.showSelectedGenderButton.get(0).click();

        Assert.assertTrue(radioButtonPage.result1.isDisplayed());

        String actualText = radioButtonPage.result1.getText();
        String expectedText = "Please select a gender.";
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(3000);

        radioButtonPage.maleRadioButton.get(0).click();
        radioButtonPage.showSelectedGenderButton.get(0).click();

        Assert.assertTrue(radioButtonPage.result1.isDisplayed());

        actualText = radioButtonPage.result1.getText();
        expectedText = "You selected: Male";
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(3000);

        radioButtonPage.femaleRadioButton.get(0).click();
        Assert.assertFalse(radioButtonPage.maleRadioButton.get(0).isSelected());
        radioButtonPage.showSelectedGenderButton.get(0).click();

        Assert.assertTrue(radioButtonPage.result1.isDisplayed());

        actualText = radioButtonPage.result1.getText();
        expectedText = "You selected: Female";
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(3000);

        radioButtonPage.radioButton1.click();
        Thread.sleep(3000);
        radioButtonPage.radioButton2.click();
        Assert.assertFalse(radioButtonPage.radioButton1.isSelected());
        Thread.sleep(3000);

        radioButtonPage.showSelectedGenderButton.get(1).click();
        actualText = radioButtonPage.result2.getText();
        expectedText = "Please select both gender and age group.";
        Assert.assertEquals(actualText, expectedText);

        radioButtonPage.maleRadioButton.get(1).click();
        Thread.sleep(3000);
        radioButtonPage.age1.click();

        radioButtonPage.showSelectedGenderButton.get(1).click();
        actualText = radioButtonPage.result2.getText();
        expectedText = "You selected: Gender = Male, Age Group =Under 18";
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(3000);

        radioButtonPage.femaleRadioButton.get(1).click();
        Assert.assertFalse(radioButtonPage.maleRadioButton.get(1).isSelected());

        Thread.sleep(3000);

        radioButtonPage.age2.click();
        Assert.assertFalse(radioButtonPage.age1.isSelected());

        radioButtonPage.showSelectedGenderButton.get(1).click();
        actualText = radioButtonPage.result2.getText();
        expectedText = "You selected: Gender = Female, Age Group =18-35";
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(3000);
        radioButtonPage.age3.click();

        radioButtonPage.showSelectedGenderButton.get(1).click();
        actualText = radioButtonPage.result2.getText();
        expectedText = "You selected: Gender = Female, Age Group =35+";
        Assert.assertEquals(actualText, expectedText);

    }

}
