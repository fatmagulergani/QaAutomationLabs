package tests;

/*
1. Launch browser
2. Navigate to url 'https://testing.qaautomationlabs.com/'
3. Verify that logo is visible successfully
4. Click the List Box button under Tools Demo
5. Verify 'List Box Demo' is visible
6. Add the first element of the list to the other list
7. Verify that one element exists in the other list
8. Add the last element of the list to the other list
9. Verify that two elements exists in the other list
10.Click Add All button and add all elements of the list to the other list
11.Verify that the first list is empty
12.Verify that all elements are in the other list
13.Choose 'Niken' element and remove on the list
14.Verify that one element exists in the list
15.Choose the third element of the list and remove on the list
16.Verify that two element exists in the list
17.Click Remove All button and remove all elements of the list
18.Verify that the second list is empty
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class QaAutomationLabsTest14 extends BaseTest {

    @Test
    public void test14() {
        mainPage.listBoxButton.click();
        Assert.assertTrue(listBoxPage.listBoxTitle.isDisplayed());

        listBoxPage.firstList.get(0).click();
        listBoxPage.addButton.click();

        Assert.assertEquals(listBoxPage.secondList.size(), 1, "Not expected");
        Assert.assertEquals(listBoxPage.secondList.get(0).getText(), "Sakshi", "Not expected");

        listBoxPage.firstList.get(listBoxPage.firstList.size() - 1).click();
        listBoxPage.addButton.click();

        Assert.assertEquals(listBoxPage.secondList.size(), 2, "Not expected");
        Assert.assertEquals(listBoxPage.secondList.get(1).getText(), "Riyanshi", "Not expected");

        listBoxPage.addAllButton.click();

        Assert.assertEquals(listBoxPage.firstList.size(), 0, "Not expected");
        Assert.assertEquals(listBoxPage.secondList.size(), 10, "Not expected");

        listBoxPage.secondList.get(0).click();
        listBoxPage.secondList.get(1).click();
        for (int i = 0; i < listBoxPage.secondList.size(); i++) {
            if(listBoxPage.secondList.get(i).getText().equalsIgnoreCase("Niken")){
                listBoxPage.secondList.get(i).click();
                break;
            }
        }

        listBoxPage.removeButton.click();
        Assert.assertEquals(listBoxPage.firstList.size(), 1, "Not expected");

        listBoxPage.secondList.get(2).click();
        listBoxPage.removeButton.click();
        Assert.assertEquals(listBoxPage.firstList.size(), 2, "Not expected");

        listBoxPage.removeAllButton.click();
        Assert.assertEquals(listBoxPage.firstList.size(), 10, "Not expected");
        Assert.assertEquals(listBoxPage.secondList.size(), 0, "Not expected");

    }
}
